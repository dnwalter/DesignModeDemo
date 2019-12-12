package OOMode.entity

import OOMode.behavior.DoubleCall
import OOMode.behavior.NormalCall
import OOMode.behavior.NormalNoCall

class DoubleCallMonster : Monster(){
    override fun handleCall() {
        when(callBehavior){
            is NormalCall -> { callBehavior = DoubleCall()}
            is DoubleCall -> { callBehavior = NormalNoCall()}
        }
        callBehavior.normalCall()
    }
}