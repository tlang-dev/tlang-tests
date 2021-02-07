package io.sorne.tlang.tests.generator

import io.sorne.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class JavaTest extends AnyFunSuite {

  test("Java") {
    val res =
      """package package1;
        |
        |public class MyClass {
        |public static void main(String args) {
        |
        |}
        |
        |}
        |""".stripMargin
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/Generator/Java")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    println(res == output.toString())
  }

}
