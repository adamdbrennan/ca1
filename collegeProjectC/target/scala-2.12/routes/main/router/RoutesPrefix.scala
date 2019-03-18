// @GENERATOR:play-routes-compiler
// @SOURCE:/root/collegeProjectC/conf/routes
// @DATE:Mon Mar 18 21:38:50 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
