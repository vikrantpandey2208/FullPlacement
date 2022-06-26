import java.awt.*;
import java.applet.*;

/* 
	<applet code= "SimpleApplet" width= 1000 height = 1000>
	</applet>
*/

public class SimpleApplet extends Applet{
	public void paint(Graphics g){
		g.drawString("This is a simple applet program for " +
			"testing purpose only " , 50, 200);
	}
}