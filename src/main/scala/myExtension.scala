import com.smartfoxserver.bitswarm.sessions.ISession
import com.smartfoxserver.v2.SmartFoxServer
import com.smartfoxserver.v2.entities.User
import com.smartfoxserver.v2.entities.data.ISFSObject
import com.smartfoxserver.v2.extensions.BaseSFSExtension

import scala.collection.JavaConverters.seqAsJavaListConverter
import scala.collection.mutable.ListBuffer
import scala.util.Success

class myExtension extends BaseSFSExtension{

  val api = SmartFoxServer.getInstance().getAPIManager.getSFSApi

  override def init(): Unit = {

  }

  override def destroy(): Unit = {}

  override def handleClientRequest(id: String, user: User, params: ISFSObject): Unit = {
    Req(id, user.getId, params) match {
      case Success(req) =>
        val x = params.getInt("x")
        val y = params.getInt("y")
        println(s"<- toa do x: ${x} va ${y}. Uid: ${user.getId}")
        val seat = user.getLastJoinedRoom.getUserList.indexOf(user)
        user.getLastJoinedRoom.getUserList.forEach {
          u => val listSs: java.util.List [ISession] = new java.util.ArrayList [ISession]
            listSs.add(u.getSession)
            api.getResponseAPI.sendExtResponse("p", params, listSs, u.getLastJoinedRoom, false)
            println(s"=>>> toa do x: ${x} va ${y}. Uid: ${u.getId}")
        }
    }
  }
}
