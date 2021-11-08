package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository: JpaRepository<Producto, Long> {
    fun findById(id: Long?): Producto?

}