package Abstract_method;

public class windowsFactory implements GUIFactory{
    @Override
    public Button createbutton() {
        return new windowsButton();
    }

    @Override
    public Checkbox createcheckbox() {
        return new windowsCheckbox();
    }
}
