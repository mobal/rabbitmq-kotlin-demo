package hu.netcode.rabbitmqkotlindemo.service

import org.slf4j.LoggerFactory
import org.springframework.amqp.core.Queue
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class MessagingService(
    private val stringReversedQueue: Queue,
    private val rabbitTemplate: RabbitTemplate,
    private val stringService: StringService
) {
    private val logger = LoggerFactory.getLogger(javaClass)

    fun reverseAndReturn(s: String) {
        val reversed = stringService.reversed(s)
        rabbitTemplate.convertAndSend(stringReversedQueue.name, reversed)
        logger.info("Reversed message \"{}\" sent", reversed)
    }
}
