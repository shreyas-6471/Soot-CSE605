package sootup.examples.basicSetup;
import static org.junit.Assert.assertTrue;
import categories.Java8Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import com.googlecode.dex2jar.ir.stmt.AssignStmt;
import com.ibm.wala.cast.ir.ssa.analysis.LiveAnalysis;
import com.sun.org.apache.xpath.internal.operations.Bool;
import javafx.util.Pair;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sootup.core.Language;
import sootup.core.Project;
import sootup.core.inputlocation.AnalysisInputLocation;
import sootup.core.jimple.basic.StmtPositionInfo;
import sootup.core.jimple.basic.Value;
import sootup.core.jimple.common.expr.AbstractInvokeExpr;
import sootup.core.jimple.common.expr.JVirtualInvokeExpr;
import sootup.core.jimple.common.ref.JArrayRef;
import sootup.core.jimple.common.stmt.JInvokeStmt;
import sootup.core.jimple.common.stmt.Stmt;
import sootup.core.model.SootClass;
import sootup.core.model.SootMethod;
import sootup.core.signatures.MethodSignature;
import sootup.core.types.ClassType;
import sootup.core.views.View;
import sootup.java.bytecode.inputlocation.PathBasedAnalysisInputLocation;
import sootup.java.core.JavaProject;
import sootup.java.core.JavaSootClass;
import sootup.java.core.JavaSootClassSource;
import sootup.java.core.language.JavaJimple;
import sootup.java.core.language.JavaLanguage;
import sootup.java.sourcecode.inputlocation.JavaSourcePathAnalysisInputLocation;
import sootup.jimple.parser.JimpleAnalysisInputLocation;
import sootup.jimple.parser.JimpleProject;

import java.util.List;

/** This example illustrates how to create and use a new Soot Project. */
@Category(Java8Test.class)
public class BasicSetup {

  @Test
  public void createSourceCodeProject() {
    Path pathToSource = Paths.get("src/test/resources/BasicSetup/source");
    AnalysisInputLocation<JavaSootClass> inputLocation =
        new JavaSourcePathAnalysisInputLocation(pathToSource.toString());
    Language language = new JavaLanguage(8);
    Project project =
        JavaProject.builder((JavaLanguage) language).addInputLocation(inputLocation).build();
  }

  @Ignore
  public void createJimpleProject() {
    Path pathToJimple = Paths.get("src/test/resources/BasicSetup/jimple");
    AnalysisInputLocation<JavaSootClass> inputLocation =
        new JimpleAnalysisInputLocation(pathToJimple);
    Project project = new JimpleProject(inputLocation);
  }

  @Test
  public void createByteCodeProject() throws NoSuchMethodException {
    // Create a AnalysisInputLocation, which points to a directory. All class files will be loaded
    // from the directory
    Path pathToBinary = Paths.get("/Users/shreyassl/Documents/GitHub/Soot-CSE605/sootup.examples/src/test/resources/BasicSetup/source");
    AnalysisInputLocation<JavaSootClass> inputLocation =
        PathBasedAnalysisInputLocation.create(pathToBinary, null);

//     Specify the language of the JavaProject. This is especially relevant for Multi-release jars,
//     where classes are loaded depending on the language level of the analysis
    Language language = new JavaLanguage(8);

    // Create a new JavaProject based on the input location
    Project project =
        JavaProject.builder((JavaLanguage) language).addInputLocation(inputLocation).build();

    // Create a signature for the class we want to analyze
    ClassType classType = project.getIdentifierFactory().getClassType("HelloWorld");

    // Create a signature for the method we want to analyze
//    MethodSignature methodSignature =
//        project
//            .getIdentifierFactory()
//            .getMethodSignature(
//                classType, "main", "void", Collections.singletonList("java.lang.String[]"));
//                    //classType, "HelloWorld", "void", Collections.singletonList("java.lang.String[]"));
    MethodSignature methodSignature =
            project
                    .getIdentifierFactory()
                    .getMethodSignature(
                            classType, "customfn", "void", Collections.emptyList());


    // Create a view for project, which allows us to retrieve classes
    View view = project.createView();
    //System.out.println("ClassType: " + classType);
    SootClass<JavaSootClassSource> sootClass = (SootClass<JavaSootClassSource>) view.getClass(classType).orElse(null);
    //System.out.println("SootClass: " + sootClass);

    if (sootClass != null) {
      System.out.println("Method Available: " + sootClass.getMethod(methodSignature.getSubSignature()).isPresent());
    }

// Continue with your assertions and the rest of the code...

    // Assert that class is present
    assertTrue(view.getClass(classType).isPresent());

    // Retrieve class
    //SootClass<JavaSootClassSource> sootClass =
        //(SootClass<JavaSootClassSource>) view.getClass(classType).get();

    // Retrieve method
    view.getMethod(methodSignature);

    // Alternatively:
    assertTrue(sootClass.getMethod(methodSignature.getSubSignature()).isPresent());
    SootMethod sootMethod = sootClass.getMethod(methodSignature.getSubSignature()).get();
System.out.println(sootMethod.getBody().getStmtGraph().getEntrypoints());
System.out.println(sootMethod.getBody().getStmts());


    List<Stmt> stmts = sootMethod.getBody().getStmts();
    //System.out.println(sootMethod.getClass().getMethod("HelloWorld").getName());

    System.out.println("Printing now"+sootMethod.getBody().getStmtGraph());
    //sootMethod.getBody().getStmtGraph()
    System.out.println("Entry points are"+sootMethod.getBody().getStmtGraph().getEntrypoints());
    System.out.println("Varibales are"+sootMethod.getBody().getStmtGraph().getLabeledStmts());
    System.out.println("Locals are"+sootMethod.getBody().getLocals());
    HashMap<Stmt, List<Object>> statementObjectsMap = new HashMap<>();
    for(Stmt statement : stmts)
    {
      System.out.println("Statement is"+statement);
      System.out.println("Defs present are"+statement.getDefs());
      System.out.println("Hopefully right side are"+statement.getUses());

      System.out.println("Uses and Defs are"+statement.getUsesAndDefs());
      System.out.println("Statment as string is"+statement.toString());
      System.out.println("Printing the right sides first part: " + Arrays.toString(statement.getUses().toArray()));
//      System.out.println();
      List<Object> util = new ArrayList<>();
      Pair<String,List<Value>>p=new Pair<>("Defs present are",statement.getDefs());
      util.add(p);
      Pair<String,List<Value>>p2=new Pair<>("Uses present are",statement.getUses());
      util.add((p2));
      if(statement.containsInvokeExpr())
      {
        Pair<String, AbstractInvokeExpr> pair1 = new Pair<>("InvokeExprs present are", statement.getInvokeExpr());
        util.add(pair1);
      }
      Pair<String,Integer>p3=new Pair<>("HashCode is",statement.hashCode());
      util.add(p3);
      Pair<String, Boolean>p4=new Pair<>("isBranchPresent",statement.branches());
      util.add(p4);
      Pair<String, StmtPositionInfo>p5=new Pair<>("Defs present are",statement.getPositionInfo());
      util.add(statement.getPositionInfo());
      util.add(p5);
      Pair<String,Boolean>p6=new Pair<>("isFieldRefPresent",statement.containsFieldRef());
      util.add(p6);
      //statement.getDefs()
    // statement.getUsesAndDefs()
      //System.out.println("LHS is"+lhs);
      if(statement.containsArrayRef())
      {
        Pair<String, JArrayRef> pair1 = new Pair<>("Array Refs present are", statement.getArrayRef());
        util.add(pair1);;
      }
      statementObjectsMap.put(statement,util);

    }
    System.out.println("Map is formed!! printing below");
    for (Map.Entry<Stmt, List<Object>> entry : statementObjectsMap.entrySet()) {
      Stmt key = entry.getKey();
      List<Object> value = entry.getValue();

      System.out.println("Statement: " + key);
      System.out.println("Associated Values: " + value);
    }

    // Assert that Hello world print is present
    assertTrue(
        sootMethod.getBody().getStmts().stream()
            .anyMatch(
                stmt ->
                    stmt instanceof JInvokeStmt
                        && stmt.getInvokeExpr() instanceof JVirtualInvokeExpr
                        && stmt.getInvokeExpr()
                            .getArg(0)
                            .equivTo(JavaJimple.getInstance().newStringConstant("Hello World!"))));
  }
}
