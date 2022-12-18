/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Coviddata;
/**
 *
 * @author HP
 */
@WebService(serviceName = "CovidService")
public class CovidService {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ServerPU");
    /**
     * Web service operation
     */
    @WebMethod(operationName = "findbyyear")
    public Coviddata findbyyear(@WebParam(name = "year") int year) {
       EntityManager em = emf.createEntityManager();
        Coviddata cov = em.find(Coviddata.class, year);
        return cov;
    }

    /**
     * This is a sample web service operation
     */
    
}
