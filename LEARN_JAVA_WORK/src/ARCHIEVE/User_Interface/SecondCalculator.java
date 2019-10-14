package User_Interface;
import javax.swing.*;
import java.awt.*;

public class SecondCalculator {
    JPanel windowContet;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint; //точка-разделитель
    JButton buttonEqual; //равно
    JButton buttonPlus; //+
    JButton buttonMinus; //-
    JButton buttonMulti; //*

    JPanel p1;
    JPanel p2;

    //Конструктор этого класса "SecondCalculator" (имя конструктора
    // совпадает с именем класса. В нём создаются все компоненты
    //и добавляются на фрейм с помощью комбинации BorderLayout и GridLayout
    SecondCalculator(){
        windowContet = new JPanel();

        //задаем схему для панели
        BorderLayout bl = new BorderLayout();
        windowContet.setLayout(bl);

        //создаем и отображаем поле, добавляем в северную область окна
        displayField = new JTextField(30);
        windowContet.add("North",displayField);

        //Создаём кнопки, используя конструктор класса JButton,
        //принимающий текст кнопок в качестве параметров
        button0=new JButton("0");
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        //создаём панель p1 с GridLayout, которая содержит
        //12 кнопок - 10 с числами, равно и точку-разделитель
        p1 = new JPanel();
        GridLayout gl = new GridLayout(4,3);
        p1.setLayout(gl);

        //добавляем кнопки на панель
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        //помещаем панель p1 в центральную область
        windowContet.add("Center",p1);

        //_____________________________________________
        //создаём панель p2 с GridLayout, которая будет содержать
        //кнопки + - и * и она будет содержаться в восточной части приложения
        p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4,3);
        p2.setLayout(gl2);
        windowContet.add("East",p2);

        //создаём кнопки + - *
        buttonPlus=new JButton("+");
        buttonMinus=new JButton("-");
        buttonMulti=new JButton("*");

        //добавляем кнопки на панель p2
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMulti);

        //_____________________________________________

        //Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("SecondCalculator");
        frame.setContentPane(windowContet);

        //Делаем размер окна, достаточным для размещения компонентов
        frame.pack();

        //Отображаем окно
        frame.setVisible(true);

/*        SecondCalculatorEngine secondCalcEngine   = new SecondCalculatorEngine();
        button0.addActionListener(secondCalcEngine);
        button1.addActionListener(secondCalcEngine);
        button2.addActionListener(secondCalcEngine);
        button3.addActionListener(secondCalcEngine);
        button4.addActionListener(secondCalcEngine);
        button5.addActionListener(secondCalcEngine);
        button6.addActionListener(secondCalcEngine);
        button7.addActionListener(secondCalcEngine);
        button8.addActionListener(secondCalcEngine);
        button9.addActionListener(secondCalcEngine);
        buttonPoint.addActionListener(secondCalcEngine);
        buttonEqual.addActionListener(secondCalcEngine);
        buttonPlus.addActionListener(secondCalcEngine);
        buttonMinus.addActionListener(secondCalcEngine);
        buttonMulti.addActionListener(secondCalcEngine);*/
    }

    public static void main(String[] args) {
        SecondCalculator calc = new SecondCalculator();
    }
}
