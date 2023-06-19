package sh.jfm.applicationeventdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ApplicationEventDemoApplication

fun main(args: Array<String>) {
	runApplication<ApplicationEventDemoApplication>(*args)
}
