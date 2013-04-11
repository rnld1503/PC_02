/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.pc2.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import pe.com.pc2.dao.StudentDAO;

/**
 *
 * @author Ronalc
 */
@Path("/hello")
public class StudentService {
    
    public StudentDAO dao = new StudentDAO();
    
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getNombre(){
        
        return dao.obtenerEstudiantes();
    }
    
    
    @POST
    @Produces(MediaType.TEXT_XML)
    public String getNombre(@FormParam("id")String idBoster){
        
        return "<?xml version=\"1.0\"?>" + "<hello> Hello"+
                "Jersey" + "</hello>";
    }
}
