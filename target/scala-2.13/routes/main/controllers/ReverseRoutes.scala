// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manikhossain/Downloads/TweeterLytics-HGG02-master/conf/routes
// @DATE:Tue Dec 22 21:12:22 EST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def getUserTimelineViaWebSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getUserTimelineViaWebSocket")
    }
  
    // @LINE:13
    def getTweetStatisticsViaWebSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getTweetStatisticsViaWebSocket")
    }
  
    // @LINE:10
    def getTweetsBySearchViaWebSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getTweetsBySearchViaWebSocket")
    }
  
    // @LINE:19
    def getTweetsByHashtagViaWebSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getTweetsByHashtagViaWebSocket")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
