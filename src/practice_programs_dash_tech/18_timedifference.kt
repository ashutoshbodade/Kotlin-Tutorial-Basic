package practice_programs_dash_tech
//Calculate Difference Between Two Time Periods


fun main(args: Array<String>) {
    val start = Time(12, 34, 55)
    val stop = Time(8, 12, 15)
    val diff: Time

    diff = difference(start, stop)

    print("TIME DIFFERENCE: ${start.hours}:${start.minutes}:${start.seconds} - ")
    print("${stop.hours}:${stop.minutes}:${stop.seconds} ")
    print("= ${diff.hours}:${diff.minutes}:${diff.seconds}")
}

fun difference(start: Time, stop: Time): Time {
    val diff = Time(0, 0, 0)

    if (stop.seconds > start.seconds) {
        --start.minutes
        start.seconds += 60
    }

    diff.seconds = start.seconds - stop.seconds
    if (stop.minutes > start.minutes) {
        --start.hours
        start.minutes += 60
    }

    diff.minutes = start.minutes - stop.minutes
    diff.hours = start.hours - stop.hours

    return difff
}

class Time(internal var hours: Int, internal var minutes: Int, internal var seconds: Int)