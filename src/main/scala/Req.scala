import com.smartfoxserver.v2.entities.data.ISFSObject

import scala.util.Try

trait Req

object Req {
  val play = "p"

  def apply(id: String, uid: Int, o: ISFSObject): Try[Req] = Try {
    id match {
      case "p" => PlayReq(uid, o)
    }
  }
}
