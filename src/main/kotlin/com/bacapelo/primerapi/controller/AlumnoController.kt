package com.bacapelo.primerapi.controller

import com.bacapelo.primerapi.model.Alumno
import com.bacapelo.primerapi.service.AlumnoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/alumno")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class AlumnoController {
    @Autowired
    lateinit var alumnoService: AlumnoService

    @GetMapping
    fun list(): List<Alumno>{
        return alumnoService.list()
    }
    @PostMapping
    fun save ( @RequestBody alumno: Alumno): Alumno {
        return alumnoService.save(alumno)
    }
    @PutMapping
    fun update(@RequestBody alumno: Alumno): Alumno {
        return alumnoService.update(alumno)
    }
    @PatchMapping
    fun updateDescripcion(@RequestBody alumno: Alumno): Alumno {
        return alumnoService.updateDescripcion(alumno)
    }
    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return alumnoService.delete(id)
    }
}