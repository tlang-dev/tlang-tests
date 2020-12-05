package io.sorne.tlang.tests.helloworld

import io.sorne.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class HelloWorldTest extends AnyFunSuite {

  val output = new java.io.ByteArrayOutputStream

  test("Hello World") {
    val file = getClass.getResource("/HelloWorld/HelloWorld")
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert("Hello, World !\n" == output.toString)
  }

  test("Hello World In Scala") {
    val res =
      """package hello_world
        |
        |class HelloWorld {
        |def main(args: Array[String]){
        |println("Hello, World!")
        |}
        |
        |}""".stripMargin

    val file = getClass.getResource("/HelloWorld/HelloWorldInScala")
    RunMain.runDir(file.getPath)
    Console.withOut(output)(RunMain.runDir(file.getPath))
    assert(output.toString.contains(res))
  }

}
