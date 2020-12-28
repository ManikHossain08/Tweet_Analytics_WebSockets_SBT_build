// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manikhossain/Downloads/TweeterLytics-HGG02-master/conf/routes
// @DATE:Tue Dec 22 21:12:22 EST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:22
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:22
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTweetsBySearchViaWebSocket""", """controllers.HomeController.getTweetsBySearchViaWebSocket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTweetStatisticsViaWebSocket""", """controllers.HomeController.getTweetStatisticsViaWebSocket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserTimelineViaWebSocket""", """controllers.HomeController.getUserTimelineViaWebSocket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getTweetsByHashtagViaWebSocket""", """controllers.HomeController.getTweetsByHashtagViaWebSocket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_getTweetsBySearchViaWebSocket1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTweetsBySearchViaWebSocket")))
  )
  private[this] lazy val controllers_HomeController_getTweetsBySearchViaWebSocket1_invoker = createInvoker(
    HomeController_1.getTweetsBySearchViaWebSocket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getTweetsBySearchViaWebSocket",
      Nil,
      "GET",
      this.prefix + """getTweetsBySearchViaWebSocket""",
      """Returns websocket connection for searching tweets by keyword""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_getTweetStatisticsViaWebSocket2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTweetStatisticsViaWebSocket")))
  )
  private[this] lazy val controllers_HomeController_getTweetStatisticsViaWebSocket2_invoker = createInvoker(
    HomeController_1.getTweetStatisticsViaWebSocket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getTweetStatisticsViaWebSocket",
      Nil,
      "GET",
      this.prefix + """getTweetStatisticsViaWebSocket""",
      """Returns word level statistics for the search term through web sockets""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_getUserTimelineViaWebSocket3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserTimelineViaWebSocket")))
  )
  private[this] lazy val controllers_HomeController_getUserTimelineViaWebSocket3_invoker = createInvoker(
    HomeController_1.getUserTimelineViaWebSocket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getUserTimelineViaWebSocket",
      Nil,
      "GET",
      this.prefix + """getUserTimelineViaWebSocket""",
      """Returns websocket connection for searching tweets by hashtag""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_getTweetsByHashtagViaWebSocket4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getTweetsByHashtagViaWebSocket")))
  )
  private[this] lazy val controllers_HomeController_getTweetsByHashtagViaWebSocket4_invoker = createInvoker(
    HomeController_1.getTweetsByHashtagViaWebSocket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getTweetsByHashtagViaWebSocket",
      Nil,
      "GET",
      this.prefix + """getTweetsByHashtagViaWebSocket""",
      """Returns websocket connection for searching tweets by hashtag""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:10
    case controllers_HomeController_getTweetsBySearchViaWebSocket1_route(params@_) =>
      call { 
        controllers_HomeController_getTweetsBySearchViaWebSocket1_invoker.call(HomeController_1.getTweetsBySearchViaWebSocket())
      }
  
    // @LINE:13
    case controllers_HomeController_getTweetStatisticsViaWebSocket2_route(params@_) =>
      call { 
        controllers_HomeController_getTweetStatisticsViaWebSocket2_invoker.call(HomeController_1.getTweetStatisticsViaWebSocket())
      }
  
    // @LINE:16
    case controllers_HomeController_getUserTimelineViaWebSocket3_route(params@_) =>
      call { 
        controllers_HomeController_getUserTimelineViaWebSocket3_invoker.call(HomeController_1.getUserTimelineViaWebSocket())
      }
  
    // @LINE:19
    case controllers_HomeController_getTweetsByHashtagViaWebSocket4_route(params@_) =>
      call { 
        controllers_HomeController_getTweetsByHashtagViaWebSocket4_invoker.call(HomeController_1.getTweetsByHashtagViaWebSocket())
      }
  
    // @LINE:22
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
