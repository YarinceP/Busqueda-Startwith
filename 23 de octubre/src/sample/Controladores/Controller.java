package sample.Controladores;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sample.Modelos.Persona;

public class Controller {
    public TextField txtBuscaNombre;
    public TextField txtNombre;
    public TextField txtApellido;
    public TextField txtEdad;
    public Button btnBuscar;

    public Persona buscarPersona(ActionEvent actionEvent) {
        Persona resultado = Persona.buscarPorPosicion(txtBuscaNombre.getText());
        //System.out.println(resultado.nombre);
        //txtNombre.setText(resultado.nombre);
        //txtApellido.setText(resultado.apellido);
        //txtEdad.setText(String.valueOf(resultado.edad));
        return null;
    }


}
