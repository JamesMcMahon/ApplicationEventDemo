package sh.jfm.applicationeventdemo

import org.springframework.context.ApplicationEvent

class SimpleEvent(
    source: Any,
    val message: String,
) : ApplicationEvent(source) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SimpleEvent

        return message == other.message
    }

    override fun hashCode(): Int {
        return message.hashCode()
    }

    override fun toString(): String {
        return "SimpleEvent(message='$message')"
    }
}
