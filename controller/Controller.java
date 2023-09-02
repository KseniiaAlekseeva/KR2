package controller;


import model.Toy;
import service.Raffle;
import view.Outer;

import java.util.Scanner;

public class Controller {
    private final Raffle raffle = new Raffle();
    private final Outer outer = new Outer();

    public void createToy(String name, Double weight) {
        raffle.createToy(name, weight);
    }

    public void addToy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adding toy. Enter toy ID: ");
        String id = sc.nextLine();
        for (Toy toy : raffle.getToyList()) {
            if (toy.getId().equals(id)) {
                raffle.addToy(toy);
            }
        }
    }

    public void editWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Editing toy weight. Enter toy ID: ");
        String id = sc.nextLine();
        System.out.println("Enter new weight: ");
        Double weight = sc.nextDouble();
        for (Toy toy : raffle.getToyList()) {
            if (toy.getId().equals(id)) {
                toy.setWeight(weight);
            }
        }
    }

    public void showCurrentWin() {
        System.out.println("Raffling. Current WIN: ");
        System.out.println(raffle.getCurrentWin().toString());
    }

    public void showToyList() {
        System.out.println("----------TOYLIST----------");
        for (Toy toy : raffle.getToyList()) {
            System.out.println(toy.toString());
        }
        System.out.println("---------------------------");
    }

    public void showWinList() {
        System.out.println("**********WINLIST***********");
        for (Toy toy : raffle.getWinList()) {
            System.out.println(toy.toString());
        }
        System.out.println("****************************");
    }

    public void makeRaffle() {
        raffle.raffleToy();
    }

    public void givePrize() {
        String path = "PrizeList.txt";
        System.out.println("Giving prize!");
        outer.givePrize(raffle.getWinList(), path);
    }
}
