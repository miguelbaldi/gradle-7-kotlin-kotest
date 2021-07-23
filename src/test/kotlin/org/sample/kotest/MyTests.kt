package org.sample.kotest

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class MyTests : WordSpec({
    "Hello" When {
        "asked for length" should {
            "Hello".length shouldBe 5
        }
        "appended to Bob" should {
            "Hello " + "Bob" shouldBe "Hello Bob"
        }
    }
})
