import org.scalatest.funsuite.AnyFunSuite
import com.redis._

class MainTest extends AnyFunSuite {

  test("Example test") {
    assert(1 == 1)
  }

  test("Redis") {
    val r = new RedisClient("localhost", 6379)
    r.set("key", "some value")
    val res = r.get("key")
    assert(res.get == "some value")
  }
}
