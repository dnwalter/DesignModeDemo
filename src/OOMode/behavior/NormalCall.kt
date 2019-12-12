package OOMode.behavior

import OOMode.interfaces.CallBehavior

class NormalCall : CallBehavior{
    override fun normalCall() {
        println("normal call")
    }
}