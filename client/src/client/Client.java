/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import service.Coviddata;

/**
 *
 * @author HP
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Coviddata str = findbyyear(2022);
        System.out.println(str);
    }

    private static Coviddata findbyyear(int year) {
        service.CovidService_Service service = new service.CovidService_Service();
        service.CovidService port = service.getCovidServicePort();
        return port.findbyyear(year);
    }
    
}
