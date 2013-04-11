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
@Path("/students")
public class StudentService {
    
    public StudentDAO dao = new StudentDAO();
    
    @GET
    @Produces(MediaType.TEXT_XML)
    public String getEstudiantes(){
        
        return dao.obtenerEstudiantes();
    }
    
    
    
    @Path("{id}")
    @Produces(MediaType.TEXT_XML)
    public String getEstudiante(@FormParam("id") String id){
        
        return dao.obtenerEstudiante(id);
    }
    
}
