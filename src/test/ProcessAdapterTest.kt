import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.assertj.core.api.Assertions.assertThat
import org.junit.Before
import org.junit.Test


class ProcessAdapterTest {

    private lateinit var pa: ProcessAdapter
    @Before
    fun setUp() {
        val pb = mock<ProcessBuilder> {
            on { command() } doReturn mutableListOf("yes")
        }
        pa = ProcessAdapter(pb)
    }

    @Test
    fun itCanDoSomething() {
        val result = pa.run("testcommand")
        println(result)
        assertThat(result).isEqualTo("testcommand")
    }
}