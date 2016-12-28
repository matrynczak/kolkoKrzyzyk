/**
 * Created by gp_qa on 07.11.2016.
 */
import java.applet.Applet;
import java.awt.*;      // ta pozwala na umieszczanie przycisków itd.
import java.awt.event.*;  // ta pozwala na obsługę zdarzeń
import java.lang.String;

public class KolkoKrzyzyk extends Applet implements ActionListener {
    String user = "O";      //grę zaczyna kółko
    Button b1 = new Button(),
        b2 = new Button(),
        b3 = new Button(),
        b4 = new Button(),
        b5 = new Button(),
        b6 = new Button(),
        b7 = new Button(),
        b8 = new Button(),
        b9 = new Button(),
        we = new Button("Nowa Gra");

    Panel gridLayoutPanel() {
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(3,3));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        return panel;
    }

    public void paint (Graphics g){
        g.drawString(user, 140, 70);
        g.drawString("Stan gry/kolej: ", 40, 70);
    }

    public void init(){
        Panel panel = gridLayoutPanel();
        setLayout(new BorderLayout());
        add("South", panel);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        add("North", we);
        we.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() instanceof Button)
            System.out.println(((Button)e.getSource()).getLabel());
        if (((Button)e.getSource()).getLabel() == "" && user == "X") {
            ((Button)e.getSource()).setLabel("X");
        user = "O";
        repaint();
        }
        if (((Button)e.getSource()).getLabel() == "" && user == "O"){
            ((Button)e.getSource()).setLabel("O");
        user = "X";
        repaint();
        }
        if (((Button)e.getSource()).getLabel() == "Nowa Gra") {
            b1.setLabel("");
            b2.setLabel("");
            b3.setLabel("");
            b4.setLabel("");
            b5.setLabel("");
            b6.setLabel("");
            b7.setLabel("");
            b8.setLabel("");
            b9.setLabel("");
            user = "O";
            repaint();
            }
        if (b1.getLabel() == "X" && b2.getLabel() == "X" && b3.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b4.getLabel() == "X" && b5.getLabel() == "X" && b6.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b7.getLabel() == "X" && b8.getLabel() == "X" && b9.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b1.getLabel() == "X" && b5.getLabel() == "X" && b9.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b3.getLabel() == "X" && b5.getLabel() == "X" && b7.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b1.getLabel() == "X" && b4.getLabel() == "X" && b7.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b2.getLabel() == "X" && b5.getLabel() == "X" && b8.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else
        if (b3.getLabel() == "X" && b6.getLabel() == "X" && b9.getLabel() == "X") {
            user = "wygrał X"; repaint();
        }  else

        if (b1.getLabel() == "O" && b2.getLabel() == "O" && b3.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }  else
        if (b4.getLabel() == "O" && b5.getLabel() == "O" && b6.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }  else
        if (b7.getLabel() == "O" && b8.getLabel() == "O" && b9.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }  else
        if (b1.getLabel() == "O" && b5.getLabel() == "O" && b9.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }  else
        if (b3.getLabel() == "O" && b5.getLabel() == "O" && b7.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }  else
        if (b1.getLabel() == "O" && b4.getLabel() == "O" && b7.getLabel() == "O") {
            user = "wygrało O"; repaint();
        }
        else
        if (b2.getLabel() == "O" && b5.getLabel() == "O" && b8.getLabel() == "O") {
            user = "wygrało O"; repaint(); }
        else
        if (b3.getLabel() == "O" && b6.getLabel() == "O" && b9.getLabel() == "O") {
            user = "wygrało O"; repaint();
        } else if (b1.getLabel() != "" && b2.getLabel() != "" && b3.getLabel() != "" &&
                b4.getLabel() != "" && b5.getLabel() != "" && b6.getLabel() != "" &&
                b7.getLabel() != "" && b8.getLabel() != "" && b9.getLabel() != "")
        { user ="REMIS !!!"; }

        }

}





