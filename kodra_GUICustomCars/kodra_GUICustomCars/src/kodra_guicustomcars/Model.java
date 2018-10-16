package kodra_guicustomcars;
/**
 * @author besian kodra
 */
public class Model 
{
    public String name;                             //declarations
    public String address;
    public String phone;
    double orderTotal;
    double costCompact = 50000.00;
    double costMidsize = 75000.00;
    double costSUV = 150000.00;
    double costDelivery = 5000.00;
    double cost4WD = 10000.00;
    double costEngravedLeather = 10000.00;
    double costCustomWheels = 10000.00;
    double costSpoiler = 10000.00;
    double costSoundSystem = 10000.00;
    double costSunRoof = 10000.00;
    double costAddOn = 0;
  
    View view;
    public Model(View v)
    {
        view = v;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }
    public String getPhone() 
    {
        return phone;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
    public String getCarType()               //get size ordered.
    {
        String size = " ";
          if(view.getRdBtnSUV().isSelected())
          {
            size = view.getRdBtnSUV().getText();
          }
          else if(view.getRdBtnMidSized().isSelected())
          {
            size = view.getRdBtnMidSized().getText();
          }
          else if(view.getRdBtnCompact().isSelected())
          {
            size = view.getRdBtnCompact().getText();
          }
        return size;
    }
    public void getOrder()                        //get order total
    {
        name = view.getTxtName().getText();
        
        if (view.getRdBtnShipment().isSelected())
        {
           orderTotal = orderTotal + costDelivery;
        }
        if (view.getRdBtnCompact().isSelected())
        {
            orderTotal = orderTotal + costCompact;
        }
        else if(view.getRdBtnMidSized().isSelected())
        {
            orderTotal = orderTotal + costMidsize;
        }else if(view.getRdBtnSUV().isSelected())
        {
           orderTotal = orderTotal + costSUV;
        }
        if (view.getChkBox4WD().isSelected())
        {
            orderTotal = orderTotal + cost4WD;
        }
        if (view.getChkBoxCustomWheels().isSelected())
        {
            orderTotal = orderTotal + costCustomWheels;
        }
        if (view.getChkBoxEngravedLeather().isSelected())
        {
            orderTotal = orderTotal + costEngravedLeather;
        }
        if (view.getChkBoxSoundSystem().isSelected())
        {
            orderTotal = orderTotal + costSoundSystem;
        }
        if (view.getChkBoxSpoiler().isSelected())
        {
            orderTotal = orderTotal + costSpoiler;
        }
        if (view.getChkBoxSunRoof().isSelected())
        {
            orderTotal = orderTotal + costSunRoof;
        }
        //One topping is free
        if(view.getChkBox4WD().isSelected() || view.getChkBoxSoundSystem().isSelected() ||
           view.getChkBoxCustomWheels().isSelected() || view.getChkBoxSpoiler().isSelected() ||
           view.getChkBoxEngravedLeather().isSelected() || view.getChkBoxSunRoof().isSelected())
        {
           orderTotal = orderTotal - cost4WD;  
        }
    }
    public double getOrderTotal()
    {
        return orderTotal;
    }
}