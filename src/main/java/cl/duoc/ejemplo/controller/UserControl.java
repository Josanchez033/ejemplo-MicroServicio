package cl.duoc.ejemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ejemplo.model.User;
import cl.duoc.ejemplo.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/usuarios")
public class UserControl {
  
    private UserRepository datos;

    public UserControl(){
        datos = new UserRepository();
    }

    @GetMapping("")
    public String test(){
        return "Hola Mundo";
    }


    @GetMapping("/mostrarTodo")
    public List<User> mostrarTodo(){
        return datos.mostrar();
        
    }

}
