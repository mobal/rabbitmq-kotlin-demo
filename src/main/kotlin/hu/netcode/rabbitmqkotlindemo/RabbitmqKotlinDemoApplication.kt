package hu.netcode.rabbitmqkotlindemo

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.springframework.amqp.core.Queue
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class RabbitmqKotlinDemoApplication {
    @Bean
    fun heartBeatQueue(): Queue {
        return Queue("heartbeat")
    }

    @Bean
    fun objectMapper(): ObjectMapper {
        return jacksonObjectMapper()
    }

    @Bean
    fun stringReverseQueue(): Queue {
        return Queue("reverse")
    }

    @Bean
    fun stringReversedQueue(): Queue {
        return Queue("reversed")
    }
}

fun main(args: Array<String>) {
    runApplication<RabbitmqKotlinDemoApplication>(*args)
}
