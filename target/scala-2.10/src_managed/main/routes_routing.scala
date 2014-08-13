// @SOURCE:C:/Desarrollo/pulpin/conf/routes
// @HASH:d28109155c93c503c6be2ddc5abc5b130b0b8dbb
// @DATE:Tue Aug 12 16:27:54 COT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)](("app",play.crud.Routes),("api",play.rest.Routes)).foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:7
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
lazy val play_crud_Routes1 = Include(play.crud.Routes)
        

// @LINE:11
lazy val play_rest_Routes2 = Include(play.rest.Routes)
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),play.crud.Routes.documentation,play.rest.Routes.documentation).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:7
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page
 Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case play_crud_Routes1(handler) => handler
        

// @LINE:11
case play_rest_Routes2(handler) => handler
        
}

}
     