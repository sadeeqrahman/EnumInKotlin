package com.encoders.enuminkotlin

enum class InterfaceEnumClass : OrderTypeValue {
    PENDING {
        override fun GetValue(): Int {
            return -1
        }
    },
    COMPLETE {
        override fun GetValue(): Int {
            return 2
        }
    },
    DELIVERD {
        override fun GetValue(): Int {
            return 3
        }
    }
}