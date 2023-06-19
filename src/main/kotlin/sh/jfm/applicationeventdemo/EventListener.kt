package sh.jfm.applicationeventdemo

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class EventListener {
    @EventListener
    fun handleEvent(event: SimpleEvent) {
        println("Event received: $event")
    }
}