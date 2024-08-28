/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.*;
/**
 * 
*@author jayad
 */
public class Converter extends Application
{

    /**
     *
     * @param st
     */
    @Override
    public void start(Stage st)
    {
        Label l1=new Label("DISTANCE CONVERTER");
	Label l2=new Label("                    =");
        Label l3=new Label("");
        Label l4=new Label("");
        Label l5=new Label("");
        Label l6=new Label("");
        Label l7=new Label("");
        Label l8=new Label("");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        String options[]={"MilliMeter","CentiMeter","Meter","KiloMeter","Miles","Inch"};
        ComboBox cb1=new ComboBox(FXCollections.observableArrayList(options));  
        ComboBox cb2=new ComboBox(FXCollections.observableArrayList(options)); 
        cb1.setPromptText("SELECT UNITS");
        cb2.setPromptText("SELECT UNITS");
        Button b=new Button("        CONVERT       ");
	GridPane gp=new GridPane();
	gp.addRow(0,l7,l8,l1);
        gp.addRow(1,l3);
	gp.addRow(2,tf1,cb1,l2,tf2,cb2);
        gp.addRow(3,l4);
        gp.addRow(4,l5,l6,b);
        Scene sc=new Scene(gp);
	st.setScene(sc);
	st.setTitle("Mini Project");
	st.show();
        b.setOnAction((ActionEvent e) -> {
            if("MilliMeter".equals(cb1.getValue().toString())&&"CentiMeter".equals(cb2.getValue().toString())) {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/10));
            } else if(("MilliMeter".equals(cb1.getValue().toString()))&&("Meter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1000));
            }
            
            else if(("MilliMeter".equals(cb1.getValue().toString()))&&("KiloMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1000000));
            }
            else if(("MilliMeter".equals(cb1.getValue().toString()))&&("Miles".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1609347.2186933));
            }
            else if(("MilliMeter".equals(cb1.getValue().toString()))&&("Inch".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*0.0393701));
            }
            else if(("CentiMeter".equals(cb1.getValue().toString()))&&("MilliMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*10));
            }
            else if(("CentiMeter".equals(cb1.getValue().toString()))&&("Meter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/100));
            }
            else if(("CentiMeter".equals(cb1.getValue().toString()))&&("KiloMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/100000));
            }
            else if(("CentiMeter".equals(cb1.getValue().toString()))&&("Miles".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/160934.4));
            }
            else if(("CentiMeter".equals(cb1.getValue().toString()))&&("Inch".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*0.393701));
            }
            else if(("Meter".equals(cb1.getValue().toString()))&&("MilliMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*1000));
            }
            else if(("Meter".equals(cb1.getValue().toString()))&&("CentiMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*100));
            }
            else if(("Meter".equals(cb1.getValue().toString()))&&("KiloMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1000));
            }
            else if(("Meter".equals(cb1.getValue().toString()))&&("Miles".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1609.344));
            }
            else if(("Meter".equals(cb1.getValue().toString()))&&("Inch".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*39.3701));
            }
            else if(("KiloMeter".equals(cb1.getValue().toString()))&&("MilliMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*1000000));
            }
            else if(("KiloMeter".equals(cb1.getValue().toString()))&&("CentiMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*100000));
            }
            else if(("KiloMeter".equals(cb1.getValue().toString()))&&("Meter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*1000));
            }
            else if(("KiloMeter".equals(cb1.getValue().toString()))&&("Miles".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/1.609344));
            }
            else if(("KiloMeter".equals(cb1.getValue().toString()))&&("Inch".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*39370.079));
            }
            else if(("Miles".equals(cb1.getValue().toString()))&&("MilliMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/0.0000006213699494));
            }
            else if(("Miles".equals(cb1.getValue().toString()))&&("CentiMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/160934.4));
            }
            else if(("Miles".equals(cb1.getValue().toString()))&&("Meter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/0.0006214));
            }
            else if(("Miles".equals(cb1.getValue().toString()))&&("KiloMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*1.60934));
            }
            else if(("Miles".equals(cb1.getValue().toString()))&&("Inch".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*63360));
            }
            else if(("Inch".equals(cb1.getValue().toString()))&&("MilliMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*25.4));
            }
            else if(("Inch".equals(cb1.getValue().toString()))&&("CentiMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*2.54));
            }
            else if(("Inch".equals(cb1.getValue().toString()))&&("Meter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n*0.0254));
            }
            else if(("Inch".equals(cb1.getValue().toString()))&&("KiloMeter".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/39370.0787));
            }
            else if(("Inch".equals(cb1.getValue().toString()))&&("Miles".equals(cb2.getValue().toString())))
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n/63360));
            }
            else
            {
                String i=tf1.getText();
                double n=Double.parseDouble(i);
                tf2.setText(String.valueOf(n));
            }
        });
            }
     
                
             
    public static void main(String args[])
    {
        launch(args);
    }

    }

