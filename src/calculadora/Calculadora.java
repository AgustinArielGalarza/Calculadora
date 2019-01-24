package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora {

    public static void main(String[] args) {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}
    
    class Marco extends JFrame{
        public Marco(){
            setTitle("Calculadora");
            setBounds(500, 300, 450, 300);
            LaminaCalculadora grafica_pantalla = new LaminaCalculadora();
            add(grafica_pantalla);
        }
        
    }
    class LaminaCalculadora extends JPanel{
        
    public LaminaCalculadora(){
        //Panel para colocar la pantalla de la calculadora, usando BorderLayout North.
        setLayout(new BorderLayout());
        caja = new JTextField();
        add(caja,BorderLayout.NORTH);
        //Segundo paanel donde iran colocados los Botones.
        lamina_Botones = new JPanel();
        lamina_Botones.setLayout(new GridLayout(5,4)); 
        ponerBoton();
        add(lamina_Botones,BorderLayout.CENTER);
    }
    
    private JTextField caja;
    private JPanel lamina_Botones;
    private JButton boton[];
    double  op1 = 0,op2=0;
    String operacion;
    boolean nueva = true;
    
    
    private void ponerBoton (){
            //creamos un array de botones y lo vamos declarando uno x uno
            boton = new JButton[20];
            boton[0]= new JButton("Ce");
            boton[1]= new JButton("");
            boton[2]= new JButton("");
            boton[3]= new JButton("");
            boton[4]= new JButton("7");
            boton[5]= new JButton("8");
            boton[6]= new JButton("9");
            boton[7]= new JButton("/");
            boton[8]= new JButton("4");
            boton[9]= new JButton("5");
            boton[10]= new JButton("6");
            boton[11]= new JButton("*");
            boton[12]= new JButton("1");
            boton[13]= new JButton("2");
            boton[14]= new JButton("3");
            boton[15]= new JButton("-");
            boton[16]= new JButton("0");
            boton[17]= new JButton(".");
            boton[18]= new JButton("=");
            boton[19]= new JButton("+");
            
            //agregamos botones
            for(int i= 0;i<20; i++){
                lamina_Botones.add(boton[i]);
            }
              //PORGRAMAMOS LOS EVENTOS
             //botones de operaciones
            boton[19].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        if(op1!=0){
                            op1= op1+Double.parseDouble(caja.getText());
                        }else{
                            op1=Double.parseDouble(caja.getText());
                            operacion= "suma";
                            caja.setText("");
                                    }
                    }catch(Exception err){}
                }
            });
            boton[15].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                    if(op1!=0){
                        op1= op1-Double.parseDouble(caja.getText());
                    }else{
                        op1=Double.parseDouble(caja.getText());
                        operacion="resta";
                        caja.setText("");
                    }
                }catch(Exception err){}
                }
            });
            boton[11].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        if(op1!=0){
                            op1=op1*Double.parseDouble(caja.getText());
                        }else{
                            op1=Double.parseDouble(caja.getText());
                            operacion="multiplicacion";
                            caja.setText("");
                        }
                    }catch(Exception err){}
                }
            });
            boton[7].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        if(op1!=0){
                            op1=op1/Double.parseDouble(caja.getText());
                        }else{
                            op1=Double.parseDouble(caja.getText());
                            operacion="divicion";
                            caja.setText("");
                        }
                    }catch(Exception err){}
                }
            });
            
            //botones numericos y punto
            boton[4].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"7");
                }
            });
            boton[5].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"8");
                }
            });
            boton[6].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"9");
                }
            });
            boton[8].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"4");
                }
            });
            boton[9].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"5");
                }
            });
            boton[10].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"6");
                }
            });
            boton[12].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"1");
                }
            });
            boton[13].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"2");
                }
            });
            boton[14].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"3");
                }
            });
            boton[16].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+"0");
                }
            });
            boton[17].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   if(nueva){
                       caja.setText("");
                       nueva= false;
                   }
                   caja.setText(caja.getText()+".");
                }
            });
            //igual
            boton[18].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        op2=Double.parseDouble(caja.getText());
                    }catch(Exception err){}
                    if(operacion.equalsIgnoreCase("suma")){
                        double res = op1+op2;
                        caja.setText(String.valueOf(res));
                        op1=op2=0;
                        operacion="";
                    }else if(operacion.equalsIgnoreCase("resta")){
                        double res = op1-op2;
                        caja.setText(String.valueOf(res));
                        op1=op2=0;
                        operacion="";
                    }else if (operacion.equalsIgnoreCase("multiplicacion")) {
                        double res = op1*op2;
                        caja.setText(String.valueOf(res));
                        op1=op2=0;
                        operacion="";
                    }else if (operacion.equalsIgnoreCase("divicion")) {
                        double res = op1/op2;
                        caja.setText(String.valueOf(res));
                        op1=op2=0;
                        operacion="";
                    }
                    nueva=true;
                }
            });
            //Ce
            boton[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    caja.setText("");
                    op1=op2=0;
                    operacion="";
                }
            });
    }
    
   
}
    

