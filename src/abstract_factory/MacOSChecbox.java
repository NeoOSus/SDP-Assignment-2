package abstract_factory;

public class MacOSChecbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering MacOS Checkbox");
    }
}
