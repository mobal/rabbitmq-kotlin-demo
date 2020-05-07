package hu.netcode.rabbitmqkotlindemo.service

import org.springframework.stereotype.Service

@Service
class StringService {
    fun reversed(s: String): String {
        return s.reversed()
    }
}
