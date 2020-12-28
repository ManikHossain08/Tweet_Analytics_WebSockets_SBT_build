// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manikhossain/Downloads/TweeterLytics-HGG02-master/conf/routes
// @DATE:Tue Dec 22 21:12:22 EST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getUserTimelineViaWebSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getUserTimelineViaWebSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserTimelineViaWebSocket"})
        }
      """
    )
  
    // @LINE:13
    def getTweetStatisticsViaWebSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getTweetStatisticsViaWebSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTweetStatisticsViaWebSocket"})
        }
      """
    )
  
    // @LINE:10
    def getTweetsBySearchViaWebSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getTweetsBySearchViaWebSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTweetsBySearchViaWebSocket"})
        }
      """
    )
  
    // @LINE:19
    def getTweetsByHashtagViaWebSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.getTweetsByHashtagViaWebSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getTweetsByHashtagViaWebSocket"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
