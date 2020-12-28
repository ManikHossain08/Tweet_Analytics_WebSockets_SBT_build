// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manikhossain/Downloads/TweeterLytics-HGG02-master/conf/routes
// @DATE:Tue Dec 22 21:12:22 EST 2020


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
