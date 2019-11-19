// @GENERATOR:play-routes-compiler
// @SOURCE:/home/crazcodernp/merokam/conf/routes
// @DATE:Sun Aug 11 21:01:31 NPT 2019


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
