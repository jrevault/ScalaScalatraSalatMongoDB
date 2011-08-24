package fr.quidquid.domain.mongo

import java.util.Date
import com.novus.salat.annotations._
import com.novus.salat.dao.SalatDAO
import com.mongodb.casbah.Imports._
import com.novus.salat.global._

case class User(
    _id: ObjectId = new ObjectId ,
    login: String ,
    password: String ,
    email: String
)

object UserDao extends SalatDAO[ User , ObjectId ](collection = MongoConnection()("quidquid")("user"))

