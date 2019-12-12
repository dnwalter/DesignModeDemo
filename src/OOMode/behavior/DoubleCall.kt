package OOMode.behavior

import OOMode.interfaces.CallBehavior

class DoubleCall : CallBehavior{
    override fun normalCall() {
        println("二重召唤")
    }
}