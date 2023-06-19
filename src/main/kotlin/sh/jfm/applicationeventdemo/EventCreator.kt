package sh.jfm.applicationeventdemo

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class EventCreator(private val applicationEventPublisher: ApplicationEventPublisher) {
    fun createEvent(message: String) {
        applicationEventPublisher.publishEvent(
            SimpleEvent(source = this, message = message)
        )
    }
}