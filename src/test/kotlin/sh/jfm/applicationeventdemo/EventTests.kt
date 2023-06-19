package sh.jfm.applicationeventdemo

import org.junit.jupiter.api.Test
import org.mockito.Mockito.verify
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class EventTests(
    @Autowired
    private val eventCreator: EventCreator
) {
    @MockBean
    lateinit var mockEventListener: EventListener

    @Test
    fun `events can be created and received`() {
        eventCreator.createEvent("Test Event")

        verify(mockEventListener).handleEvent(
            SimpleEvent(source = mockEventListener, message = "Test Event")
        )
    }
}