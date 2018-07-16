package sample.logica;


import java.util.ArrayList;
import java.util.List;
import sample.modelos.Usuarios;

public class LogicaUsuario {
    public List<Usuarios> obtenerUsuarios(){
        List<Usuarios> list = new ArrayList<Usuarios>();
        list.add(new Usuarios("Alejandro", 18));
        list.add(new Usuarios("Carolina", 17));
        list.add(new Usuarios("Andres", 22));
        list.add(new Usuarios("Nicole", 18));
        return list;
    }

}
