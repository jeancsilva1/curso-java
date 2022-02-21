/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secao18_Interfaces.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import secao18_Interfaces.model.entities.CarRental;
import secao18_Interfaces.model.entities.Vehicle;
import secao18_Interfaces.model.services.BrazilTaxService;
import secao18_Interfaces.model.services.RentalService;

/**
 *
 * @author Jean
 */
public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = in.nextLine();
        Vehicle vehicle = new Vehicle(carModel);
      
        
        System.out.print("Pickup (dd/MM/yyyy hh:mm):");
        Date start = sdf.parse(in.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:mm):");
        Date finish = sdf.parse(in.nextLine());
        CarRental carRental = new CarRental(start, finish, vehicle);
       
        System.out.print("Enter price per hour:");
        double pricePerHour = in.nextDouble();
        System.out.print("Enter price per Day:");
        double pricePerDay = in.nextDouble();
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);
        
        
        System.out.println("INVOICE:");
        System.out.println("Basic Payment: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Tax:" + carRental.getInvoice().getTax());
        System.out.println("Total payment: " + carRental.getInvoice().totalPayment());

        in.close();
    }

}
