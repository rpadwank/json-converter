import scala.collection.mutable
import scala.io.Source
import net.liftweb.json._
import net.liftweb.json.Serialization.write
import org.json4s.native.Json
import org.json4s.DefaultFormats

object JsonConverter extends App{

  case class Employee(id: Int, name: String, salary: Double)

  val records: mutable.HashMap[Int, Any]=mutable.HashMap()
  val fileName="C:\\Users\\padwa\\IdeaProjects\\JsonDemo2\\src\\main\\scala\\data"
  val fileSource=Source.fromFile(fileName)
  for(line <- fileSource.getLines()) {
    val words = line.split(" ")
    val emp = Employee(words(0).toInt, words(1), words(2).toDouble)
    records.put(words(0).toInt, emp)
  }
  records.keys.foreach{
    key=>/*println(records(key).id+"  "+records(key).name+" "+records(key).salary)*/
//    implicit val formats = DefaultFormats
//    val jsonString = write(records(key))
//    println(jsonString)
  }
  println(Json(DefaultFormats).writePretty(records))

}
