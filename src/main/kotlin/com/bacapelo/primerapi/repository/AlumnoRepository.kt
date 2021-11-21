package com.bacapelo.primerapi.repository

import com.bacapelo.primerapi.model.Alumno

import org.springframework.data.jpa.repository.JpaRepository

interface AlumnoRepository: JpaRepository<Alumno, Long> {
    fun findById(id: Long?): Alumno?

}