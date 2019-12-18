package ObserverMode

import ObserverMode.observers.BattleTurnObserver
import ObserverMode.observers.EndTurnObserver

class GameTurn {
    var mBattleTurnObservers = ArrayList<BattleTurnObserver>()
    var mEndTurnObservers = ArrayList<EndTurnObserver>()

    fun registerBattleTurnObserver(observer: BattleTurnObserver){
        mBattleTurnObservers.add(observer)
    }

    fun removeBattleTurnObserver(observer: BattleTurnObserver){
        mBattleTurnObservers.remove(observer)
    }

    fun handleBattleTurnObservers(){
        for (observer in mBattleTurnObservers){
            observer.battleTurnHandle()
        }
    }

    fun registerEndTurnObserver(observer: EndTurnObserver){
        mEndTurnObservers.add(observer)
    }

    fun removeEndTurnObserver(observer: EndTurnObserver){
        mEndTurnObservers.remove(observer)
    }

    fun handleEndTurnObservers(){
        for (observer in mEndTurnObservers){
            observer.endTurnHandle()
        }
    }
}