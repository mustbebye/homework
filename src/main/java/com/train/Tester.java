package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        passengerBuyTicket();
    }

    private static void passengerBuyTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of tickets: ");
        int oneWay = scanner.nextInt();

        System.out.println("How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();

        Ticket ticket = new Ticket(oneWay, roundTrip);

        System.out.println("Total tickets: " + ticket.getTotalTickets() + "\tRound-trip: " + roundTrip +
                "\tTotal: " + ticket.getTotalPrice());
    }
}
