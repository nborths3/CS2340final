import java.util.ArrayList;
import java.util.List;

public class UserInterface implements UIComponent {
    private List<UIComponent> components = new ArrayList<>();

    public void addComponent(UIComponent component) {
        components.add(component);
    }

    public void removeComponent(UIComponent component) {
        components.remove(component);
    }

    public void draw() {
        System.out.println("Drawing the UI interface for the application.");
        for (UIComponent component : components) {
            component.draw();
        }
    }
}
