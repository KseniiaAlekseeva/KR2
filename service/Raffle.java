package service;

import model.Toy;

import java.util.ArrayList;
import java.util.List;

public class Raffle {
    private List<Toy> toyList = new ArrayList<>(); // if no database
    private List<Toy> winList = new ArrayList<>();
    private Toy currentWin = new Toy();

    public void createToy(String name, Double weight) {
        toyList.add(new Toy(name, weight));
    }

    public void addToy(Toy toy) {
        toy.setCount(toy.getCount() + 1);
    }

    public void removeToy(Toy toy) {
        toy.setCount(toy.getCount() - 1);
        if (toy.getCount() == 0)
            toyList.remove(toy);
    }

    public void raffleToy() {
        double completeWeight = 0.0;
        boolean findSame = false;
        Toy win = new Toy();

        for (Toy toy : toyList) {
            completeWeight += toy.getWeight();
        }
        double rand = Math.random() * completeWeight;
        double countWeight = 0.0;
        int i = 0;

        while (countWeight < rand) {
            Toy toy = toyList.get(i);
            countWeight += toy.getWeight();
            if (countWeight >= rand)
                win = toy;
            i++;
        }

        currentWin = new Toy(win);
        winList.add(currentWin);
        removeToy(win);

    }


    public List<Toy> getToyList() {
        return toyList;
    }

    public List<Toy> getWinList() {
        return winList;
    }

    public Toy getCurrentWin() {
        return currentWin;
    }
}
