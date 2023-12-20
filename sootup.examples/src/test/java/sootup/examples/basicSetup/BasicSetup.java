package sootup.examples.basicSetup;
import static org.junit.Assert.assertTrue;
import categories.Java8Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    public Set<Pair<String, Integer>> mergeSets(Collection<Set<Pair<String, Integer>>> sets) {
        Set<Pair<String, Integer>> mergedSet = new HashSet<>();
        for (Set<Pair<String, Integer>> set : sets) {
            mergedSet.addAll(set);
        }
        return mergedSet;
    }


    @Test
  public void createByteCodeProject() throws NoSuchMethodException {
    // Create a AnalysisInputLocation, which points to a directory. All class files will be loaded
    // from the directory
      long startTime = System.currentTimeMillis();
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
          sources.forEach((key, value) -> {
             // System.out.println("Key: " + key + ", Value: " + value);
              if(statement.toString().contains(key))
              {
                  sourcePresent.add(statement.toString());
              }
          });
          sinks.forEach((key, value) -> {
              // System.out.println("Key: " + key + ", Value: " + value);
              key=key.trim();
              if(!key.equals(""))
              {
                  if(statement.toString().contains(key))
                  {
                      sinksPresent.add(statement.toString());
                  }
              }

          });
          if(sources.containsKey(statement))
          {
              sourcePresent.add(statement.toString());
          }
          if(sinks.containsKey(statement))
          {
              sinksPresent.add(statement.toString());
          }

          List<Stmt> predecessors = sootMethod.getBody().getStmtGraph().predecessors(statement);
          Set<Pair<String, Integer>> newSet;

          if (predecessors.size() == 1) {
              newSet = new HashSet<>(statementInstantVals.get(predecessors.get(0)));
          } else if (predecessors.size() == 0) {
              newSet = new HashSet<>(initset);
          } else {
              // When there are multiple predecessors
              List<Set<Pair<String, Integer>>> setsFromPredecessors = new ArrayList<>();
              for (Stmt pred : predecessors) {
                  setsFromPredecessors.add(statementInstantVals.get(pred));
              }
              newSet = mergeSets(setsFromPredecessors);
          }

          Set<Pair<String, Integer>> oldSet = new HashSet<>(newSet);
          transferFunction(statement, newSet);

          if (!newSet.equals(oldSet)) {
              for (Stmt successor : sootMethod.getBody().getStmtGraph().successors(statement)) {
                  stmtQueue.offer(successor);
              }
          }
          statementInstantVals.put(statement, newSet);
      }

      long endTime = System.currentTimeMillis();
      long duration = endTime - startTime; // duration in milliseconds
      System.out.println("Execution time: " + duration + " ms");

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

    public Integer getValueFromSet(String variable, Set<Pair<String, Integer>> newSet) {
        for (Pair<String, Integer> pair : newSet) {
            if (pair.getKey().equals(variable)) {
                return pair.getValue();
            }
        }
        return null;
    }

    public void updateSet(Set<Pair<String, Integer>> newSet, String variable, int value) {
        newSet.removeIf(pair -> pair.getKey().equals(variable));
        newSet.add(new Pair<>(variable, value));
    }

    public int performArithmeticOperation(int leftVal, int rightVal, char operation) {
        switch (operation) {
            case '+': return leftVal + rightVal;
            case '-': return leftVal - rightVal;
            case '*': return leftVal * rightVal;
            case '/': return leftVal / rightVal; // Note: Integer division, no decimal
            default: throw new IllegalArgumentException("Invalid arithmetic operation: " + operation);
        }
    }

    public void transferFunction(Stmt statement, Set<Pair<String, Integer>> newset)
    {
        String stmtString = statement.toString();
        if (stmtString.matches(".*[+\\-*/].*")) {
            System.out.println("Encountered arithmetic expression");

            // Regular expression to extract variable names and numbers from the expression
            Pattern pattern = Pattern.compile("([a-zA-Z]+\\d*)\\s*=\\s*([a-zA-Z]+\\d*)\\s*([+\\-*/])\\s*(\\d+|([a-zA-Z]+\\d*))");
            Matcher matcher = pattern.matcher(stmtString);

            if (matcher.find()) {
                String leftVar = matcher.group(1);
                String rightVar = matcher.group(2);
                char operation = matcher.group(3).charAt(0);
                String rightValue = matcher.group(4);

                Integer leftVal = getValueFromSet(leftVar, newset);
                Integer rightVal = rightValue.matches("\\d+") ? Integer.parseInt(rightValue) : getValueFromSet(rightValue, newset);

                if (leftVal != null && rightVal != null) {
                    int result = performArithmeticOperation(leftVal, rightVal, operation);
                    updateSet(newset, leftVar, result);
                    updateSet(newset, leftVar, result);
                }
            }
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