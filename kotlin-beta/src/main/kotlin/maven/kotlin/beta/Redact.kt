package maven.kotlin.beta

import com.fasterxml.jackson.annotation.JsonValue

data class Redact(
        val pii: String = ""
) {
    override fun toString(): String {
        return "<redacted>"
    }

    @JsonValue
    fun toJson(): String {
        return pii
    }

    companion object {
        @JvmStatic
        fun fromString(s: String): Redact {
            return Redact(s)
        }
    }
}