package OOMode.entity

import OOMode.behavior.NormalAtk
import OOMode.behavior.NormalCall
import OOMode.behavior.NormalDef
import OOMode.behavior.NormalNoCall
import OOMode.interfaces.AtkBehavior
import OOMode.interfaces.CallBehavior
import OOMode.interfaces.DefBehavior

abstract class Monster {
    var name: String? = null
    var lv: Int? = null
    var atk: Int? = null
    var def: Int? = null
    var dec: String? = null
    var effect: String? = null

    var callBehavior: CallBehavior = NormalCall()
    var atkBehavior: AtkBehavior = NormalAtk()
    var defBehavior: DefBehavior = NormalDef()

    // 防守
    open fun handleDef() {
        defBehavior.defense()
    }

    // 攻击
    open fun handleAtk() {
        atkBehavior.attack()
    }

    // 召唤
    open fun handleCall() {
        callBehavior.normalCall()
        if (callBehavior is NormalCall) {
            callBehavior = NormalNoCall()
        }
    }
}