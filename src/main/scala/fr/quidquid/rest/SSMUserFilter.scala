package fr.quidquid.rest

import org.scalatra._
import scalate.ScalateSupport
import fr.quidquid.domain.mongo.{User}
import fr.quidquid.services.UserService
import com.codahale.jerkson.Json

class SSMUserFilter extends ScalatraFilter with ScalateSupport {

  val BASE_URL = "/api/user"

  get( BASE_URL + "/add/:email/:login/:password") {
    val obj = UserService.add( params( "login" ) ,params( "password" ) ,params( "email" ) )
    Json.generate(obj)
  }

  get( BASE_URL + "/get/:id") {
    val obj = UserService.findById( params( "id" ) )
    Json.generate(obj)
  }

  get( BASE_URL + "/get/login/:login") {
    val obj = UserService.findByLogin( params( "login" ) )
    Json.generate(obj)
  }

  get( BASE_URL + "/delete/:id") {
    UserService.delete( params("id") )
    Json.generate("OK")
  }

}
