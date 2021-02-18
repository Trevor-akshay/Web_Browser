package web.browser;

import javax.swing.*;
import java.awt.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.*;
import javafx.scene.web.WebView;

public class WebBrowser extends JFrame implements Runnable{
    private JFXPanel panel;
    @Override
    public void run(){
        this.setBounds(0,0,1900,1050);
        this.setVisible(true);
        this.setExtendedState(this.getExtendedState() | MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Web Browser JAVAFX - TREVOR_AKSHAY");

        panel = new JFXPanel();
        this.add(panel);

        Platform.runLater(() -> {
            WebView webView = new WebView();
            webView.getEngine().load("https://www.google.com");
        panel.setScene(new Scene(webView));
        });
    }
    public static void main(String[] args){

        SwingUtilities.invokeLater(new WebBrowser());
    }


}
