package hu.netcode.rabbitmqkotlindemo.messaging

import hu.netcode.rabbitmqkotlindemo.service.MessagingService
import org.slf4j.LoggerFactory
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
@RabbitListener(queues = ["reverse"])
class Listener(
    private val messagingService: MessagingService
) {
    private val logger = LoggerFactory.getLogger(javaClass)

    @RabbitHandler
    fun receive(bytes: ByteArray) {
        val s = String(bytes)
        logger.info("Message \"{}\" received for reverse", s)
        messagingService.reverseAndReturn(s)
    }
}
