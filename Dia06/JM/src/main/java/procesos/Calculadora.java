package procesos;

import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
    JButton result, erase, eraseAll, deleteDigit, fraction, potency, square, division, product, substraction, sum;
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, point, negative;
    JLabel texto;
    JTextField pantalla;
    int b = 50;
    int initH = 70;
    int initV = 10;
    
    
    public Calculadora(int width, int weight) {
        setLayout(null);

        
        
        this.pantalla = new JTextField();
        pantalla.setBounds(10,10,215,50);
        add(pantalla);
        
        
        //fila 1
        this.result = new JButton("=");
        result.setBounds(initV, initH, b, b);
        add(result);
        this.erase = new JButton("C");
        erase.setBounds(initV + b + (b/10), initH, b, b);
        add(erase);
        this.eraseAll = new JButton("CE");
        eraseAll.setBounds(initV + (b + (b/10))*2, initH, b, b);
        add(eraseAll);
        this.deleteDigit = new JButton("<-");
        deleteDigit.setBounds(initV + (b + (b/10))*3, initH, b, b);
        add(deleteDigit);
        
        //fila 2
        
        this.fraction = new JButton("1/x");
        fraction.setBounds(initV, initH + b + (b/10), b, b);
        add(fraction);
        this.potency = new JButton("x²");
        potency.setBounds(initV + b + (b/10), initH + b + (b/10), b, b);
        add(potency);
        this.square = new JButton("²/¯x");
        square.setBounds(initV + (b +(b/10))*2, initH + b + (b/10), b, b);
        add(square);
        this.division = new JButton("÷");
        division.setBounds(initV + (b + (b/10))*3, initH + b + (b/10), b, b);
        add(division);
        
        // fila 3
        this.button7 = new JButton("7");
        button7.setBounds(initV, initH + (b+(b/10))*2, b, b);
        add(button7);
        this.button8 = new JButton("8");
        button8.setBounds(initV + b + (b/10), initH + (b+(b/10))*2, b, b);
        add(button8);
        this.button9 = new JButton("9");
        button9.setBounds(initV + (b +(b/10))*2, initH + (b+(b/10))*2, b, b);
        add(button9);
        this.product = new JButton("*");
        product.setBounds(initV + (b + (b/10))*3, initH + (b+(b/10))*2, b, b);
        add(product);
        
        //fila 4
        this.button4 = new JButton("4");
        button4.setBounds(initV, initH + (b+(b/10))*3, b, b);
        add(button4);
        this.button5 = new JButton("5");
        button5.setBounds(initV + b + (b/10), initH + (b+(b/10))*3, b, b);
        add(button5);
        this.button6 = new JButton("6");
        button6.setBounds(initV + (b +(b/10))*2, initH + (b+(b/10))*3, b, b);
        add(button6);
        this.substraction = new JButton("-");
        substraction.setBounds(initV + (b + (b/10))*3, initH + (b+(b/10))*3, b, b);
        add(substraction);
        
        //fila 5
        this.button1 = new JButton("1");
        button1.setBounds(initV, initH + (b+(b/10))*4, b, b);
        add(button1);
        this.button2 = new JButton("2");
        button2.setBounds(initV + b + (b/10), initH + (b+(b/10))*4, b, b);
        add(button2);
        this.button3 = new JButton("3");
        button3.setBounds(initV + (b +(b/10))*2, initH + (b+(b/10))*4, b, b);
        add(button3);
        this.sum = new JButton("+");
         sum.setBounds(initV + (b + (b/10))*3, initH + (b+(b/10))*4, b, (2*b)+(b/10));
        add(sum);
        
        // fila 6
        this.point = new JButton(".");
        point.setBounds(initV, initH + (b+(b/10))*5, b, b);
        add(point);
        this.button0 = new JButton("0");
        button0.setBounds(initV + b + (b/10), initH + (b+(b/10))*5, b, b);
        add(button0);
        this.negative = new JButton("±");
        negative.setBounds(initV + (b +(b/10))*2, initH + (b+(b/10))*5, b, b);
        add(negative);
        /*
        boton.setBounds(100,150,100,30);
        boton.addActionListener(this);
        add(boton);
        texto=new JLabel("Presione el botón para salir.");
        texto.setBounds(50,50,220,40);
        add(texto);*/
        
                
        setBounds(300,300,width,weight);
        setVisible(true);
        setResizable(false);
        }
    
    
   /* @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
        setTitle("Saldrá en 3 segundos");
        try{
        Thread.sleep(3000);
        System.exit(0);
        } 
        catch(Exception excep) {
        System.exit(0);
            }
        }
        }*/
}
