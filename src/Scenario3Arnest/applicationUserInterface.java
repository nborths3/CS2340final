public class applicationUserInterface {
    public static void main(String[] args) {
        UIComponent homeButton = new Button("Home");
        UIComponent searchButton = new Button("Search");
        UIComponent settingsButton = new Button("Settings");
        UIComponent highlightedPicksButton = new Button("Highlighted Picks");

        UserInterface ui = new UserInterface();
        ui.addComponent(homeButton);
        ui.addComponent(searchButton);
        ui.addComponent(settingsButton);
        ui.addComponent(highlightedPicksButton);

        ui.draw();
    }
}
