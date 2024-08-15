/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todocodeacademy.primeraApi.controller;
//Importaciones correspondientes a las anotaciones @.
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gaabriel Orellana
 * 
 * Prueba sencilla para la utilización de Java con Spring Boot.
 * Se ha establecido un package controller, dentro del cual he creado un endpoint ó método denominado holaMundo.
 */
@RestController
//Se importa RestController tras añadir anotation.
@RequestMapping("/apisaludos") /*Si se nose agregase bastaría con poner /hola , en su lugar, 
*para acceder ha dicho endpoint, deberemos colocar: localhost:8080/apisaludos/hola
* 
* Esto se utiliza para crear paquetes específicos asociados a sus controladores o 
* para centralizarlo a un nombre y que la ruta no sea directamente /endpoint.
*/
public class SaludoController {
    
    @GetMapping("/hola") //Se establece un mapeado tras añadir la anotation.
    public String holaMundo(){
        return "¡Hola Mundo!";
    }
    
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre, 
                                  @PathVariable int edad){
        //@PathVariable será necesaria para utilizar las variables de esta manera: /apisaludos/hola/holanombre/María/18
        return "¡Hola Mundo! "+nombre+" tu edad es "+edad;
    }
}
