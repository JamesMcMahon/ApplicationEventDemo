package sh.jfm.applicationeventdemo

import org.springframework.http.HttpStatus
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController
class EventTriggerController(private val eventCreator: EventCreator) {
    @PostMapping("/trigger")
    @ResponseStatus(HttpStatus.CREATED)
    fun triggerEvent() {
        eventCreator.createEvent("Hello From Controller")
    }
}
