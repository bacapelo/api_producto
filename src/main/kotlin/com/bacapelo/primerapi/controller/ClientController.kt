package com.bacapelo.primerapi.controller
import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.model.Producto
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
    @PutMapping
    fun upd0ate(@RequestBody client: Client): Client {
        return clientService.update(client)
    }
    @PatchMapping
    fun updateDescripcion(@RequestBody client: Client): Client {
        return clientService.updateDescripcion(client)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return clientService.delete(id)
    }

}