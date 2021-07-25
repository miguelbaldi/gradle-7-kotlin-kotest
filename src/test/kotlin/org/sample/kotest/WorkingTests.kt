package org.sample.kotest

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class WorkingTests : WordSpec({
    "Hello" When {
        "asked for length" should {
            "working with gradle 7" {
                "Hello".length shouldBe 5
            }
        }
        "appended to Bob" should {
            "working with gradle 7"{
                "Hello " + "Bob" shouldBe "Hello Bob"
            }
        }
    }
})
