package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Client
import org.springframework.data.jpa.repository.JpaRepository

interface ClientRepository: JpaRepository<Client, Long> {
}