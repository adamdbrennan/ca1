// @GENERATOR:play-routes-compiler
// @SOURCE:/root/collegeProjectC/conf/routes
// @DATE:Mon Mar 18 21:38:50 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  LoginController_1: controllers.LoginController,
  // @LINE:9
  HomeController_0: controllers.HomeController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    LoginController_1: controllers.LoginController,
    // @LINE:9
    HomeController_0: controllers.HomeController
  ) = this(errorHandler, LoginController_1, HomeController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, LoginController_1, HomeController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """processLogin""", """controllers.LoginController.processLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.dashboard"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_LoginController_login0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_LoginController_login0_invoker = createInvoker(
    LoginController_1.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_LoginController_processLogin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("processLogin")))
  )
  private[this] lazy val controllers_LoginController_processLogin1_invoker = createInvoker(
    LoginController_1.processLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "processLogin",
      Nil,
      "GET",
      this.prefix + """processLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_LoginController_logout2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout2_invoker = createInvoker(
    LoginController_1.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_dashboard3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_dashboard3_invoker = createInvoker(
    HomeController_0.dashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "dashboard",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_LoginController_login0_route(params@_) =>
      call { 
        controllers_LoginController_login0_invoker.call(LoginController_1.login)
      }
  
    // @LINE:7
    case controllers_LoginController_processLogin1_route(params@_) =>
      call { 
        controllers_LoginController_processLogin1_invoker.call(LoginController_1.processLogin)
      }
  
    // @LINE:8
    case controllers_LoginController_logout2_route(params@_) =>
      call { 
        controllers_LoginController_logout2_invoker.call(LoginController_1.logout)
      }
  
    // @LINE:9
    case controllers_HomeController_dashboard3_route(params@_) =>
      call { 
        controllers_HomeController_dashboard3_invoker.call(HomeController_0.dashboard)
      }
  }
}
