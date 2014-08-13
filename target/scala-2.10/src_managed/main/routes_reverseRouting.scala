// @SOURCE:C:/Desarrollo/pulpin/conf/routes
// @HASH:d28109155c93c503c6be2ddc5abc5b130b0b8dbb
// @DATE:Tue Aug 12 16:27:54 COT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:7
package controllers {

// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:7
package controllers.javascript {

// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:7
package controllers.ref {


// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page
 Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    