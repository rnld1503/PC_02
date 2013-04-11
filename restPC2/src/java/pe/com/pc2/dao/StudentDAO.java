package pe.com.pc2.dao;

import java.util.ArrayList;
import pe.com.pc2.bean.StudentBean;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ronalc
 */
public class StudentDAO {

    ArrayList<StudentBean> getAllStudents() {

        ArrayList<StudentBean> lista = new ArrayList<StudentBean>();

        StudentBean a = new StudentBean();
        a.setBirthDate("12/12/1978");
        a.setFirstName("Ronald");
        a.setIdBoster("1");
        a.setLastName("Landa");
        lista.add(a);

        StudentBean b = new StudentBean();
        b.setBirthDate("12/12/1978");
        b.setFirstName("Raul");
        b.setIdBoster("2");
        b.setLastName("Jaimes");
        lista.add(b);

        StudentBean c = new StudentBean();
        c.setBirthDate("12/11/1978");
        c.setFirstName("Renato");
        c.setIdBoster("3");
        c.setLastName("Campos");
        lista.add(c);

        return lista;
    }

    public String obtenerEstudiantes() {


        String body = "";

        for (StudentBean b : getAllStudents()) {

            body += "<student>"
                    + "<BirthDate>" + b.getBirthDate() + "</BirthDate>"
                    + "<FirstName>" + b.getFirstName() + "</FirstName>"
                    + "<IdBoster>" + b.getIdBoster() + "</IdBoster>"
                    + "<LastName>" + b.getLastName() + "</LastName>"
                    + "</student>";


        }

        String ret = "<students>"
                + "<count>" + getAllStudents().size() + "</count>"
                + body
                + "</students>";

        return ret;

    }

    public String obtenerEstudiante(String id) {

        String body = "";


        for (StudentBean b : getAllStudents()) {

            if (id.equals(b.getIdBoster())) {

                body += "<student>"
                        + "<BirthDate>" + b.getBirthDate() + "</BirthDate>"
                        + "<FirstName>" + b.getFirstName() + "</FirstName>"
                        + "<IdBoster>" + b.getIdBoster() + "</IdBoster>"
                        + "<LastName>" + b.getLastName() + "</LastName>"
                        + "</student>";

            }

        }

        String ret = "<students>"
                + body
                + "</students>";

        return ret;
    }
}
