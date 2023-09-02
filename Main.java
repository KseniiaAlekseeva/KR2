import controller.Controller;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createToy("Banana", 0.5);
        controller.createToy("Cherry", 0.4);
        controller.createToy("Monkey", 0.1);
        controller.createToy("Elephant", 0.7);
        controller.createToy("Tiger", 0.8);
        controller.showToyList();
        controller.addToy();
        controller.addToy();
        controller.addToy();
        controller.editWeight();
        controller.showToyList();
        controller.makeRaffle();
        controller.showCurrentWin();
        controller.makeRaffle();
        controller.showCurrentWin();
        controller.makeRaffle();
        controller.showCurrentWin();
        controller.makeRaffle();
        controller.showCurrentWin();
        controller.showToyList();
        controller.showWinList();
        controller.givePrize();
        controller.showWinList();
        controller.givePrize();
        controller.givePrize();
        controller.showWinList();

    }
}
