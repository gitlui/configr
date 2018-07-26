import org.junit.Assert.assertEquals
import org.junit.Test

class GitTest {
    @Test
    fun itContainsARepositoryURI() {
        val git = Git("TestURI")
        assertEquals("TestURI", git.uri)
    }
}