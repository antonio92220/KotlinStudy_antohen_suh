package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : Spaceship(name, speed, unmanned = true) {

    fun launchScanningDrones() {
        println("$name дроны для скана запущены")
    }

    override fun runSystemDiagnostic() {
        super.runSystemDiagnostic()
        println("$name запущена диагностика дронов и майнеров")
    }
}