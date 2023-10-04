package sootup.jimple.parser.javatestsuite.java6;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sootup.core.model.SootMethod;
import sootup.core.signatures.MethodSignature;
import sootup.jimple.parser.categories.Java8Test;
import sootup.jimple.parser.javatestsuite.JimpleTestSuiteBase;

/** @author Kaustubh Kelkar */
@Category(Java8Test.class)
public class LabelledLoopBreakTest extends JimpleTestSuiteBase {

  public MethodSignature getMethodSignature() {
    return identifierFactory.getMethodSignature(
        getDeclaredClassSignature(), "labelledLoopBreak", "void", Collections.emptyList());
  }

  public List<String> expectedBodyStmts() {
    return Stream.of(
            "l0 := @this: LabelledLoopBreak",
            "l1 = 0",
            "label1:",
            "$stack4 = l1",
            "$stack3 = 5",
            "if $stack4 >= $stack3 goto label5",
            "l2 = 0",
            "label2:",
            "$stack6 = l2",
            "$stack5 = 5",
            "if $stack6 >= $stack5 goto label4",
            "if l1 != 1 goto label3",
            "goto label5",
            "label3:",
            "l2 = l2 + 1",
            "goto label2",
            "label4:",
            "l1 = l1 + 1",
            "goto label1",
            "label5:",
            "return")
        .collect(Collectors.toList());
  }

  @Test
  public void test() {
    SootMethod method = loadMethod(getMethodSignature());
    assertJimpleStmts(method, expectedBodyStmts());
  }
}
