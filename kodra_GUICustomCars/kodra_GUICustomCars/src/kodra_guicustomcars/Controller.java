package kodra_guicustomcars;
/**
 * @author besian kodra
 */
public class Controller 
{
    View view;
    Model model;
    String size;
    public void runApp()
    {
        view = new View();
        view.setVisible(true);
        
        Model model = new Model(view);
        view.setModel(model);
        size = model.getCarType();
        model.getOrder();
    }
}