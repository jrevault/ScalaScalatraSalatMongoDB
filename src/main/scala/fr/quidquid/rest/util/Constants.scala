package fr.quidquid.rest.util

class Constants {
  val templateDir:String ="/WEB-INF/scalate/templates/"


  def getTemplate( file:String ):String = {
    templateDir + file + "scaml"
  }

}