package fr.quidquid.services

import com.mongodb.casbah.Imports._
import com.novus.salat.global._
import com.novus.salat._
import fr.quidquid.domain.mongo.{UserDao, User}
import org.bson.types.ObjectId
import com.mongodb.casbah.commons.MongoDBObject
import org.scalatra.ScalatraKernel._

object UserService {

  def add( login:String, password:String, email:String ):User = {
    val obj = new User( login = login, password = password, email = email )
    val id = UserDao.insert(obj)
    System.out.println(id)
    UserDao.findOneByID(id.get).get
  }

  def findById( param:String ):User = {
    UserDao.findOneByID( new ObjectId( param ) ).get
  }

  def findByLogin( param:String ):User = {
    UserDao.findOne( MongoDBObject( "login" -> param )).get
  }

  def delete( id:String ) = {
    var obj:User = UserDao.findOneByID( new ObjectId( id ) ).get
    UserDao.remove(obj)
  }
}