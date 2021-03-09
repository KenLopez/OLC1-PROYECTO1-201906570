package GUI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khlop
 */
public class HiloConsola extends Thread{
    private JTextArea jTextArea1;
    private JScrollPane jScrollPane1;
    private boolean running;
    private String text;
    
    public HiloConsola(){
        running = false;
        jTextArea1 = new JTextArea();
        jTextArea1.setEditable(false);
        jTextArea1.setAutoscrolls(true);
        jScrollPane1 = new JScrollPane(jTextArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setAutoscrolls(true);
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public void run(){
        while(this.isRunning()){
            jTextArea1.setText(text);
            jTextArea1.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
