package com.bacapelo.primerapi.controller
import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list(): List<Client>{
        return clientService.list()
    }
    @PostMapping
    fun save ( @RequestBody client: Client): Client{
        return clientService.save(client)
    }

}