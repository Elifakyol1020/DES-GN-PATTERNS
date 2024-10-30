package Abstract_method;

public class macOsFactory implements GUIFactory{
    @Override
    public Button createbutton() {
        return new macOsButton();
    }

    @Override
    public Checkbox createcheckbox() {
        return new macOsCheckbox();
    }
}
