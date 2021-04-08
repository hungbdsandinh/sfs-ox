import com.smartfoxserver.v2.entities.data.ISFSObject

class PlayReq private (val uid: Int, val o: ISFSObject) extends Req {
    protected def name = "p"
}

object PlayReq {
  def apply(uid: Int, o: ISFSObject): Req = new PlayReq(uid, o)
}
