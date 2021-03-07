package io.sorne.tlang.tests.resolver

import dev.tlang.tlang.runner.RunMain
import org.scalatest.funsuite.AnyFunSuite

class ResolverTest extends AnyFunSuite {

  test("Test resolver") {
    val output = new java.io.ByteArrayOutputStream
    val file = getClass.getResource("/Resolver/Entity")
    Console.withOut(output)(RunMain.runDir(file.getPath))
//    assert("OK1\nOK2\nOK3\nOK4\nOK5\nOK6\nOK7\nOK8\n" == output.toString)
  }
}
