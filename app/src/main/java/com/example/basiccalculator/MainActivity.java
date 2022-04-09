package com.example.basiccalculator;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button decimal;

    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button clear;
    private Button percent;
    private Button backspace;
    private Button src;
    private Button equals;

    private TextView values;

    double a=0,b=0;
    String symbol = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        decimal = findViewById(R.id.decimal);
        zero = findViewById(R.id.zero);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        backspace = findViewById(R.id.backspace);
        src = findViewById(R.id.src);
        equals = findViewById(R.id.equals);
        percent = findViewById(R.id.percent);

        values = findViewById(R.id.values);



        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                values.setText("0");
            }
        });

        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.length() > 1)
                {
                    values.setText(s.substring(0,s.length()-1));
                }
                else
                {
                    values.setText("0");
                }

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("1");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"1");
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("2");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"2");
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("3");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"3");
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("4");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"4");
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("5");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"5");
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("6");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"6");
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("7");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"7");
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("8");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"8");
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("9");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"9");
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("0");
                else
                {
                    String s = values.getText().toString();
                    values.setText(s+"0");
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (values.getText().toString().equals("0"))
                    values.setText("0.");
                else if(!values.getText().toString().contains("."))
                {
                    String s = values.getText().toString();
                    values.setText(s+".");
                }
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '/'|| s.charAt(s.length()-1) == '*')
                    s = s.substring(0,s.length()-1);
                if(checkSymbol(s)) {
                    s = result(s);
                }
                values.setText(textCleaner(s)+"+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*')
                    s = s.substring(0,s.length()-1);
                if(checkSymbol(s)) {
                    s = result(s);
                }
                values.setText(textCleaner(s)+"-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '/' ||s.charAt(s.length()-1) == '*')
                    s = s.substring(0,s.length()-1);
                if(checkSymbol(s)) {
                    s = result(s);
                }
                values.setText(textCleaner(s)+"*");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*')
                    s = s.substring(0,s.length()-1);
                if(checkSymbol(s)) {
                    s = result(s);
                }
                values.setText(textCleaner(s)+"/");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = values.getText().toString();
                if(s.charAt(s.length()-1) == '+' || s.charAt(s.length()-1) == '-' || s.charAt(s.length()-1) == '/' || s.charAt(s.length()-1) == '*')
                    s = s.substring(0,s.length()-1);
                if(checkSymbol(s)) {
                    s = result(s);
                }
                values.setText(textCleaner(s));
            }
        });

    }

    protected boolean checkSymbol(@NonNull String s)
    {
        if(s.charAt(0) == '-')
        {
            s = s.substring(1);
        }
        return s.contains("+") || s.contains("-") || s.contains("*") || s.contains("/");
    }

    protected String result(@NonNull String s)
    {
        boolean sign = false;
        if (s.charAt(0) == '-')
        {
            sign = true;
            s = s.substring(1);
        }
        double a,b;
        String A = "",B = "";
        String symbol = "";
        if(s.contains("+"))
        {
            symbol = "\\+";
        }
        if(s.contains("-"))
        {
            symbol = "-";
        }
        if(s.contains("*"))
        {
            symbol = "\\*";
        }
        if(s.contains("/"))
        {
            symbol = "/";
        }
        String[] output = s.split(symbol,2);
        A = output[0];
        if(sign)
            a = Double.parseDouble("-"+A);
        else
            a = Double.parseDouble(A);
        B = output[1];
        b = Double.parseDouble(B);
        switch (symbol)
        {
            case "\\+":
                return String.valueOf(a+b);
            case "-":
                return String.valueOf(a-b);
            case "\\*":
                return String.valueOf(a*b);
            case "/":
                return String.valueOf(a/b);
            default:
                break;
        }
        return "0";
    }

    protected String textCleaner(String s)
    {
        if(s.equals("0"))
            return s;
        while(s.charAt(0) == '0')
        {
            s = s.substring(1);
        }
        if(s.contains(".")) {
            while (s.charAt(s.length() - 1) == '0') {
                s = s.substring(0, s.length() - 1);
            }
            if (s.charAt(s.length() - 1) == '.')
                s = s.substring(0, s.length() - 1);
        }
        return s;
    }


}