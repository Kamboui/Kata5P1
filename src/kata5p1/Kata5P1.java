package kata5p1;

import java.util.List;
import static kata5p1.CrearTabla.createNewTable;
import static kata5p1.MailListReader.read;

public class Kata5P1 {

    public static void main(String[] args) {
        //SelectApp app = new SelectApp();
        //app.selectAll();
        //createNewTable();
        
        String ruta = "email.txt";
        List<String> lista = read(ruta);
        InsertarDatos ins = new InsertarDatos(lista);
        ins.insert();
    }

}
