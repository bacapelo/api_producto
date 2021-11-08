package com.bacapelo.primerapi.controller

import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.model.Producto
import com.bacapelo.primerapi.service.ProductoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/producto")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ProductoController {
    @Autowired
    lateinit var productoService: ProductoService

    @GetMapping
    fun list(): List<Producto>{
        return productoService.list()
    }
    @PostMapping
    fun save( @RequestBody producto: Producto):Producto {
        return productoService.save(producto)
    }
    @PutMapping
    fun upd0ate(@RequestBody producto: Producto):Producto{
        return productoService.update(producto)
    }
    @PatchMapping
    fun updateDescripcion(@RequestBody producto: Producto):Producto{
        return productoService.updateDescripcion(producto)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return productoService.delete(id)
    }
}