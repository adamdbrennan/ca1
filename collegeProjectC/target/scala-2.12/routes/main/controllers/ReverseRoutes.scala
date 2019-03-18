// @GENERATOR:play-routes-compiler
// @SOURCE:/root/collegeProjectC/conf/routes
// @DATE:Mon Mar 18 21:38:50 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def dashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
  }

  // @LINE:6
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:7
    def processLogin(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "processLogin")
    }
  
    // @LINE:6
    def login(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
