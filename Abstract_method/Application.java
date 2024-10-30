package Abstract_method;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button=guiFactory.createbutton();
        checkbox=guiFactory.createcheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
