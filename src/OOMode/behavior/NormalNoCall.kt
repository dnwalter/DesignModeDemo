package OOMode.behavior

import OOMode.interfaces.CallBehavior

class NormalNoCall : CallBehavior{
    override fun normalCall() {
        println("could not call")
    }
}