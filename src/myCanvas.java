import java.awt.*;

public class myCanvas extends Canvas {
    public void paint(Graphics g) {

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("7c99f1dcda9b6cbca0f6e6f8cc8ad54b.png");
        g.drawImage(i, 120,100,this);

    }
    myCanvas m=new myCanvas();


}
