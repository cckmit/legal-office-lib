/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jm.com.dpbennett.wal.accpac;

import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jm.com.dpbennett.business.entity.AccPacDocument;
import org.junit.Test;

/**
 *
 * @author Desmond Bennett <info@dpbennett.com.jm at http//dpbennett.com.jm>
 */
public class AccpacTest {

//    @Test
//    public void testCustomer() {
//        HashMap prop = new HashMap();
//
//        prop.put("javax.persistence.jdbc.user",
//                "root");
//        prop.put("javax.persistence.jdbc.password",
//                "?Des12300!"); // TK REMOVE PWD WHEN DONE
//        prop.put("javax.persistence.jdbc.url",
//                "jdbc:mysql://localhost:3306/accpac");
//        prop.put("javax.persistence.jdbc.driver",
//                "com.mysql.jdbc.Driver");
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AccPacLocalPU", prop);
//        EntityManager em = emf.createEntityManager();
//        
//        AccPacCustomer customer = new AccPacCustomer("N02", "Nature's Vibe");
//        customer.save(em);
//
//    }
    
    @Test
    public void testDocument() {
        HashMap prop = new HashMap();

        prop.put("javax.persistence.jdbc.user",
                "root");
        prop.put("javax.persistence.jdbc.password",
                "?Des12300!"); // TK REMOVE PWD WHEN DONE
        prop.put("javax.persistence.jdbc.url",
                "jdbc:mysql://localhost:3306/accpac");
        prop.put("javax.persistence.jdbc.driver",
                "com.mysql.jdbc.Driver");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AccPacLocalPU", prop);
        EntityManager em = emf.createEntityManager();
        
        AccPacDocument doc = new AccPacDocument();
        doc.setIdInvc("INV01");
        doc.setIdCust("C01");
        doc.save(em);

    }
}
