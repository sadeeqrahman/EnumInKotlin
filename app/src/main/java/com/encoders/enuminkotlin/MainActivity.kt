package com.encoders.enuminkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ///// SIMPLE ENUM CLASS ////////

        val order_status = OrderType.COMPLETED
        Log.e("Order_Type", order_status.name)
        Log.e("Order_Type", order_status.ordinal.toString())


        val all_order_types: Array<OrderType> = OrderType.values()
        all_order_types.forEach {
            Log.e("Arrays", it.name)
        }


        when(order_status){
            OrderType.REQUEST_FOR_CANCEL -> Log.e("Test","Request for cancel")
            OrderType.CANCELLED -> Log.e("Test","Order is cancel")
            OrderType.PENDIG -> Log.e("Test","Order is pending")
            OrderType.ACTIVE -> Log.e("Test","Order is active")
            OrderType.COMPLETED -> Log.e("Test","Order is completed")
            OrderType.DELIVERED -> Log.e("Test","Order is deliverd")
        }

        ////// ENUM WITH PARAMETERS ///////

        val My_Card = CreditCard.PALTINUM.color
        Log.e("MY_Card", "my Card COlor is $My_Card")


        ////// ENUM WITH INTERFACE CLASS ///////

        val interfaceEnumClass = InterfaceEnumClass.PENDING.GetValue()
        Log.e("My_Order_Type",interfaceEnumClass.toString())


    }
}