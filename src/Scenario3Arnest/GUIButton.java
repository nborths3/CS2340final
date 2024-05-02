class Button implements UIComponent {
    private String buttonLabel;

    public Button(String buttonLabel) {
        this.buttonLabel = buttonLabel;

    }

    public void draw() {
        System.out.println("Button: " + buttonLabel);
    }
}