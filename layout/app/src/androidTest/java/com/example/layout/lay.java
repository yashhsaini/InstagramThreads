import androidx.camera.effects.Frame;

import java.awt.*;
import javax.swing.*;
class AB extends Frame
{
    Button button[];
    public AB()
    {
        button = new Button[5];
        for(int i=0; i<5; i++)
        {
            button[i]=new Button("Button"+(i+1));
            add(button[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        AB obj = new AB();
    }
}