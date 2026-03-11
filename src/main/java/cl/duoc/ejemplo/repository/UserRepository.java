package cl.duoc.ejemplo.repository;

import java.util.ArrayList;
import java.util.List;

import cl.duoc.ejemplo.model.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
public class UserRepository {

    private List<User> usuarios;

    public UserRepository(){
        usuarios = new ArrayList<>();
        usuarios.add(new User("carlitos run",30,"carlitosrun@duocuc.cl"));
    }

    public void guardar(User u){
        usuarios.add(u);
    }

    public List<User> mostrar(){
        return usuarios;
    }

    





}
