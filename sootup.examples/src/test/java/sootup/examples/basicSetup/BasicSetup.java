package sootup.examples.basicSetup;
import static org.junit.Assert.assertTrue;
import categories.Java8Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.ibm.wala.ipa.callgraph.CallGraph;
import com.ibm.wala.ipa.cfg.InterproceduralCFG;
import sootup.*;
import javafx.util.Pair;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sootup.core.Language;
import sootup.core.Project;
import sootup.core.inputlocation.AnalysisInputLocation;
import sootup.core.jimple.basic.Local;
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
import sootup.java.core.language.JavaLanguage;
import sootup.java.sourcecode.inputlocation.JavaSourcePathAnalysisInputLocation;
import sootup.jimple.parser.JimpleAnalysisInputLocation;
import sootup.jimple.parser.JimpleProject;
import java.util.LinkedList;
import java.util.Queue;
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
//sootMethod.getBody().get
System.out.println(sootMethod.getBody().getStmts());
List<Stmt> stmts = sootMethod.getBody().getStmts();
    //System.out.println(sootMethod.getClass().getMethod("HelloWorld").getName());
    System.out.println("Printing now"+sootMethod.getBody().getStmtGraph());
    //sootMethod.getBody().getStmtGraph()
    System.out.println("Entry points are"+sootMethod.getBody().getStmtGraph().getEntrypoints());
    System.out.println("Varibales are"+sootMethod.getBody().getStmtGraph().getLabeledStmts());
    System.out.println("Locals are"+sootMethod.getBody().getLocals());
     // InterproceduralCFG icfg = new InterproceduralCFG((CallGraph) sootMethod);
      //System.out.println("from icfg");
      //System.out.println(icfg.getCallGraph().getEntrypointNodes());
    //Forward Flow analysis for a method level...(Intra method)
      String filePathSource = "/Users/shreyassl/Documents/GitHub/Soot-CSE605/sources.txt";
      String filePathSink="/Users/shreyassl/Documents/GitHub/Soot-CSE605/sinks.txt";
      HashMap<String, Boolean>sources=new HashMap<>();
      HashMap<String, Boolean> sinks=new HashMap<>();
      try (BufferedReader reader = new BufferedReader(new FileReader(filePathSource))) {
          String line;
          while ((line = reader.readLine()) != null) {
              System.out.println(line); // Process the line
              sources.put(line,true);
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
      try (BufferedReader reader = new BufferedReader(new FileReader(filePathSink))) {
          String line;
          while ((line = reader.readLine()) != null) {
              System.out.println(line); // Process the line
              sinks.put(line,true);
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
    HashMap<Stmt, Set<Pair<String, Integer>>> statementInstantVals = new HashMap<>();
      Set<String>sourcePresent=new HashSet<>();
      Set<String>sinksPresent=new HashSet<>();
      Set<Pair<String, Integer>> initset = new HashSet<>();
      for(Local variable :sootMethod.getBody().getLocals())
      {
          //System.out.println("Variable is"+variable);
          initset.add(new Pair<>(variable.toString(), Integer.MAX_VALUE));
      }
      Queue<Stmt> stmtQueue = new LinkedList<>();

        for(Stmt statement:sootMethod.getBody().getStmtGraph().getEntrypoints())
        {
            stmtQueue.offer(statement);
        }
      while (!stmtQueue.isEmpty())
      {
          Stmt statement = stmtQueue.poll();
          System.out.println("Encountered statement is"+statement);
          if(sources.containsKey(statement))
          {
              sourcePresent.add(statement.toString());
          }
          if(sinks.containsKey(statement))
          {
              sinksPresent.add(statement.toString());
          }
          List<Stmt>predecessors = sootMethod.getBody().getStmtGraph().predecessors(statement);
         // System.out.println(predecessors);
          if (predecessors.size() == 1)
          {
              System.out.println("Came here with 1 predecessor");
              Set<Pair<String, Integer>> newset = statementInstantVals.get(predecessors.get(0));
              Set<Pair<String,Integer>> oldset = new HashSet<>(newset);

              transferFunction(statement, newset);

              if (!newset.equals(oldset))
              {
                  for (Stmt successor : sootMethod.getBody().getStmtGraph().successors(statement))
                  {
                      System.out.println("Adding the successors");
                      stmtQueue.offer(successor);
                  }
              }
              statementInstantVals.put(statement, newset);
          }
          else if (predecessors.size() == 0) {
              System.out.println("Came here where predec is 0");
              Set<Pair<String, Integer>> newset = initset;
              Set<Pair<String,Integer>> oldset = new HashSet<>(newset);
             /* System.out.println("Old set before calling transfer fn is");
              for (Pair<String, Integer> p : oldset)
               {
                  System.out.println("pair is" + p);
              }*/
              transferFunction(statement, newset);
              /*System.out.println("Printing after transfer fn new set is");
              for (Pair<String, Integer> p : newset)
               {
                  System.out.println("pair is" + p);
              }
              System.out.println("Printing after transfer fn old set is");
              for (Pair<String, Integer> p : oldset)
               {
                  System.out.println("pair is" + p);
              }*/
              if (!newset.equals(oldset)) {
                  System.out.println("Came here where we're adding successor");
                  for (Stmt successor : sootMethod.getBody().getStmtGraph().successors(statement)) {
                      System.out.println("Adding the successors");
                      stmtQueue.offer(successor);
                  }
              }
              statementInstantVals.put(statement, newset);
          } else {
              System.out.println("Came to else");
          }
      }
      System.out.println("Sinks are"+sinksPresent);
      System.out.println("Sources Present are"+sourcePresent);
      HashMap<Stmt, List<Object>> statementObjectsMap = new HashMap<>();
//    for(Stmt statement : stmts)
//    {
//      System.out.println("Statement is"+statement);
//      System.out.println("Defs present are"+statement.getDefs());
//      System.out.println("Hopefully right side are"+statement.getUses());
//
//      System.out.println("Uses and Defs are"+statement.getUsesAndDefs());
//      System.out.println("Statment as string is"+statement.toString());
//      System.out.println("Printing the right sides first part: " + Arrays.toString(statement.getUses().toArray()));
////      System.out.println();
//      List<Object> util = new ArrayList<>();
//      Pair<String,List<Value>>p=new Pair<>("Defs present are",statement.getDefs());
//      util.add(p);
//      Pair<String,List<Value>>p2=new Pair<>("Uses present are",statement.getUses());
//      util.add((p2));
//      if(statement.containsInvokeExpr())
//      {
//        Pair<String, AbstractInvokeExpr> pair1 = new Pair<>("InvokeExprs present are", statement.getInvokeExpr());
//        util.add(pair1);
//      }
//      Pair<String,Integer>p3=new Pair<>("HashCode is",statement.hashCode());
//      util.add(p3);
//      Pair<String, Boolean>p4=new Pair<>("isBranchPresent",statement.branches());
//      util.add(p4);
//      Pair<String, StmtPositionInfo>p5=new Pair<>("Defs present are",statement.getPositionInfo());
//      util.add(statement.getPositionInfo());
//      util.add(p5);
//      Pair<String,Boolean>p6=new Pair<>("isFieldRefPresent",statement.containsFieldRef());
//      util.add(p6);
//      //statement.getDefs()
//    // statement.getUsesAndDefs()
//      //System.out.println("LHS is"+lhs);
//      if(statement.containsArrayRef())
//      {
//        Pair<String, JArrayRef> pair1 = new Pair<>("Array Refs present are", statement.getArrayRef());
//        util.add(pair1);;
//      }
//      statementObjectsMap.put(statement,util);
//
//    }
//    System.out.println("Map is formed!! printing below");
//    for (Map.Entry<Stmt, List<Object>> entry : statementObjectsMap.entrySet()) {
//      Stmt key = entry.getKey();
//      List<Object> value = entry.getValue();
//
//      System.out.println("Statement: " + key);
//      System.out.println("Associated Values: " + value);
//    }

    // Assert that Hello world print is present
//    assertTrue(
//        sootMethod.getBody().getStmts().stream()
//            .anyMatch(
//                stmt ->
//                    stmt instanceof JInvokeStmt
//                        && stmt.getInvokeExpr() instanceof JVirtualInvokeExpr
//                        && stmt.getInvokeExpr()
//                            .getArg(0)
//                            .equivTo(JavaJimple.getInstance().newStringConstant("Hello World!"))));
  }
    public void transferFunction(Stmt statement, Set<Pair<String, Integer>> newset)
    {
        if (statement.toString().contains("+") || statement.toString().contains("-") || statement.toString().contains("*") || statement.toString().contains("/"))
        {
            System.out.println("Encountered arithematic expression");
        }
        else if(statement.toString().contains("java"))
        {
            System.out.println("Ignoring code lines with Java");
            return;
        }
        else
        {
            System.out.println("printing inside transfer fn" + statement.getUses().get(0).toString());
            System.out.println("printing inside transfer fn" + statement.getDefs().get(0).toString());
            Pair<String, Integer> toRemove = null;
            for (Pair<String, Integer> p : newset)
            {
                if (p.getKey().toString().equals(statement.getDefs().get(0).toString()))
                {
                    System.out.println(" Found the pair to update");
                    toRemove = p;
                    System.out.println("to remove is" + toRemove);
                    break;
                }
            }
            if (toRemove != null)
            {
                System.out.println("Removing and adding new pair from set");
                newset.remove(toRemove);
                newset.add(new Pair<>(toRemove.getKey(), Integer.parseInt(statement.getUses().get(0).toString())));
            }
        }
    }
}