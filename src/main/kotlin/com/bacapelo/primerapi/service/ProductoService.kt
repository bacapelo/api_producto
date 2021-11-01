package com.bacapelo.primerapi.service
import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.model.Producto
import com.bacapelo.primerapi.repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@Service
class ProductoService {
    @Autowired
    lateinit var productoRepository: ProductoRepository


    fun list(): List<Producto> {

        return productoRepository.findAll()
    }
    @PostMapping
    fun save  (producto: Producto):Producto{
        return productoRepository.save(producto)
    }
}