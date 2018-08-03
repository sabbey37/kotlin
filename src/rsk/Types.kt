package rsk

// interface public by default
interface Time {
    fun setTime(hours: Int, mins: Int = 0, secs: Int = 0)
    // must provide default implementation
    fun setTime(time: CoolTime) = setTime(time.hours)
}

interface EndOfTheWorld {
 fun setTime(time: CoolTime) {}
}

class CoolTime {
    var hours: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

// : in Kotlin ==== implements and extends given interface
class YetiTime: Time, EndOfTheWorld {
    override fun setTime(time: CoolTime) {
        super<Time>.setTime(time)
        super<EndOfTheWorld>.setTime(time)
    }
    override fun setTime(hours: Int, mins: Int, secs: Int) {}
}