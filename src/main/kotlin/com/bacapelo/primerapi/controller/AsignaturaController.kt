package com.bacapelo.primerapi.controller

import com.bacapelo.primerapi.model.Alumno
import com.bacapelo.primerapi.model.Asignatura
import com.bacapelo.primerapi.service.AlumnoService
import com.bacapelo.primerapi.service.AsignaturaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/asignatura")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class AsignaturaController {
    @Autowired
    lateinit var asignaturaService: AsignaturaService

    @GetMapping
    fun list(): List<Asignatura>{
        return asignaturaService.list()
    }
    @PostMapping
    fun save ( @RequestBody asignatura: Asignatura): Asignatura {
        return asignaturaService.save(asignatura)
    }
    @PutMapping
    fun update(@RequestBody asignatura: Asignatura): Asignatura {
        return asignaturaService.update(asignatura)
    }
    @PatchMapping
    fun updateDescripcion(@RequestBody asignatura: Asignatura): Asignatura {
        return asignaturaService.updateDescripcion(asignatura)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return asignaturaService.delete(id)
    }
}