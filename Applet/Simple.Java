import java.applet.Applet;
import.awt.Graphics;
public class Simple extends Applet{
    StringBuffer buffer;
    public void init()
        {
            buffer=new StringBuffer();
            addItem("initializing..");
        }
    public void start()
    {
        addItem("starting");
    }
    public void stop()
    {
        addItem("stopping");
    }
    public void destroy()
    {
        addItem("preparing for unloading...")
    }
}