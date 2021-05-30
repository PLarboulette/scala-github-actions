import org.scalatest.funsuite.AnyFunSuite
import com.redis._

class MainTest extends AnyFunSuite {

  test("Example test") {
    assert(1 == 1)
  }

  test("Redis GET Key test") {
    val r = new RedisClient("localhost", 6379)
    r.set("key", "some value")
    val res = r.get("key")
    assert(res.get == "some value")
  }

  test("Redis EXISTS Key test") {
    val r = new RedisClient("localhost", 6379)
    r.set("key3", "some value")
    val res = r.exists("key2")
    assert(!res)
  }

  test("Redis failure connection") {
    val r = new RedisClient("localhost", 5678)
    assertThrows[RuntimeException](
      r.set("key4", "some value") // Connection refused
    )
  }
}
