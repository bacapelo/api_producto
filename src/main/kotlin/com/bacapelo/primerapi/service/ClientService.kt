package com.bacapelo.primerapi.service

import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository
    fun list(): List<Client> {

        return clientRepository.findAll()
    }
    @PostMapping
    fun save  (client: Client):Client{
        return clientRepository.save(client)
    }

}