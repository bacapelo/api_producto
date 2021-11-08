package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Client
import com.bacapelo.primerapi.model.Producto
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
    fun findById(id: Long?): Client?
}