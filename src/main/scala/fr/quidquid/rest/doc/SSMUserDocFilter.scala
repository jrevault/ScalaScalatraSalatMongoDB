package fr.quidquid.rest.doc

import org.scalatra._
import scalate.ScalateSupport
import fr.quidquid.rest.SSMBaseFilter
import org.fusesource.scalate.layout.NullLayoutStrategy
import org.fusesource.scalate.servlet.ServletTemplateEngine

class SSMUserDocFilter extends ScalatraFilter with ScalateSupport  {

  // Note the "doc" prefix instead of "api"
  val BASE_URL = "/doc/user"

  beforeAll {
    contentType = "text/html"
    templateEngine.layoutStrategy = NullLayoutStrategy
  }

  get( BASE_URL + "/add*") {
    templateEngine.layout("/WEB-INF/scalate/apidocs/user_add.scaml")
  }

  get( BASE_URL + "/get*") {
    templateEngine.layout( "/WEB-INF/scalate/apidocs/user_get.scaml")
  }

  get( BASE_URL + "/get/login*") {
    templateEngine.layout( "/WEB-INF/scalate/apidocs/user_get_login.scaml")
  }

  get( BASE_URL + "/delete*") {
    templateEngine.layout( "/WEB-INF/scalate/apidocs/user_delete.scaml")
  }

}
