package lesson_14

fun main() {
    val ship1 = Spaceship("ship1", speed = 500)
    ship1.runSystemDiagnostic()
    ship1.switchToWarpMode()
    println()

    val scout1 = Scout("scout1", speed = 750, afterburnerSpeed = 1000, radarRange = 100)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", speed = 250, numberOfMiners = 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
}