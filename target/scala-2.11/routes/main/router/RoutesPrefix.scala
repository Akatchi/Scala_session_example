
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/akatchi/Dropbox/Libraries/Playframework/activator-dist-1.3.6/opdracht-5/conf/routes
// @DATE:Fri Sep 11 10:15:31 CEST 2015


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
