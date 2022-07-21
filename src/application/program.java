package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class program {

	public static void main(String[] args) throws ParseException {
		
	Scanner sc = new Scanner(System.in)	;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.print("Room number: ");
	int number = sc.nextInt();
	System.out.print("Ckeck-In date (dd/mm/yyyy)");
	Date chekIn =  sdf.parse(sc.next());
	System.out.print("Ckeck-Out date (dd/mm/yyyy)");
	Date chekOut =  sdf.parse(sc.next());
	
	if (!chekOut.after(chekIn)) {
		System.out.println("Error in reservation: Check-Out date must be after check-in date");
		
	}
	else {
		Reservation reservation = new Reservation(number, chekIn, chekOut);
		System.out.println(reservation);
		
		System.out.println();
		System.out.println("Entre com as datas para atualizarem a reserva");
		System.out.print("Ckeck-In date (dd/mm/yyyy)");
		chekIn =  sdf.parse(sc.next());
		System.out.print("Ckeck-Out date (dd/mm/yyyy)");
		chekOut =  sdf.parse(sc.next());
		
		reservation.updateDates(chekIn, chekOut);
		
		System.out.println(reservation);
		
		
	}
	
	
	
	
	
	}

}
