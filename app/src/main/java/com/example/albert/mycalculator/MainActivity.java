package com.example.albert.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private TextView numOne;
    private TextView numTwo;
    private TextView numThree;
    private TextView numFour;
    private TextView numFive;
    private TextView numSix;
    private TextView numSeven;
    private TextView numEight;
    private TextView numNine;
    private TextView numZero;
    private TextView cancle;
    private TextView plusOrMinus;
    private TextView point;
    private TextView minus;
    private TextView plus;
    private TextView divide;
    private TextView multiply;
    private TextView mod;
    private TextView equal;
    private TextView output;

    // 计算时的一些变量和标志
    String num1 = "";
    String num2 = "";
    double num3 = 0;
    // 记录返回值(结果)
    String result = "";
    // 记录操作，默认为加号
    String sign = "+";
    // 用mark来标记加减乘除等操作是否进行
    int mark = 0;
    int equal_mark = 0;
    boolean flag = true;
    // 小数点只能输入一次
    boolean pointMark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 通过id找控件
        initView();
        // 设置点击事件
        initClickEvent();
    }

    /**
     * 设置点击事件
     */
    private void initClickEvent() {
        numOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "1";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "1";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "1";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "2";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "2";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "2";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "3";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "3";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "3";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "4";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "4";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "4";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "5";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "5";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "5";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "6";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "6";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "6";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "7";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "7";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "7";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "8";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "8";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "8";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "9";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "9";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "9";
                output.setText(num1 + sign + num2);
            }
            }
        });
        numZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mark == 0) {
                num1 = num1 + "0";
                output.setText(num1);
            } else if (mark == 1) {
                num2 = num2 + "0";
                output.setText(num1 + sign + num2);
            } else {
                num1 = String.valueOf(num3);
                num2 = num2 + "0";
                output.setText(num1 + sign + num2);
            }
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (pointMark) {
                if (mark == 0) {
                    num1 = num1 + ".";
                    output.setText(num1);
                } else if (mark == 1) {
                    num2 = num2 + ".";
                    output.setText(num1 + sign + num2);
                } else {
                    num1 = String.valueOf(num3);
                    num2 = num2 + ".";
                    output.setText(num1 + sign + num2);
                }
                // 输入一次小数点之后就不能再输入了
                pointMark = false;
            }
            }
        });
        cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num1 = "";
            num2 = "";
            num3 = 0;
            mark = 0;
            sign = "";
            output.setText("0");
            flag = true;
            pointMark = true;
            equal_mark=0;
            }
        });
        plusOrMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // 算出结果之后，取反继续运算 && 直接输入一个数，取反
            double x = Double.parseDouble(num1);
            num3 = x * (-1);
            num1 = String.valueOf(num3);
            output.setText(num1);
            // 第二个操作数的情况

            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag) {
                sign = "-";
                mark++;
                flag = false;
                pointMark = true;
            }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag) {
                sign = "+";
                mark++;
                flag = false;
                pointMark = true;
            }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag) {
                sign = "÷";
                mark++;
                flag = false;
                pointMark = true;
            }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag) {
                sign = "*";
                mark++;
                flag = false;
                pointMark = true;
            }
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (flag) {
                sign = "%";
                mark++;
                flag = false;
                pointMark = true;
            }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            flag = true;
            pointMark = true;
            if (sign.equals("+")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 = x + y;
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                equal_mark++;
                num2 = "";
            } else if (sign.equals("-")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 = x - y;
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                num2 = "";
                num1 = "";
                equal_mark++;
            } else if (sign.equals("*")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 = x * y;
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                num2 = "";
                equal_mark++;
            } else if (sign.equals("÷")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 = x / y;
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                num2 = "";
                equal_mark++;
            } else if (sign.equals("^")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 = Math.pow(x, y);
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                num2 = "";
                equal_mark++;
            } else if (sign.equals("%")) {
                double x = Double.parseDouble(num1);
                double y = Double.parseDouble(num2);
                num3 =  x % y;
                result = String.valueOf(num3);
                output.setText(num1 + sign + num2 + "=" + result);
                num2 = "";
                equal_mark++;
            }else {
                // 1. 重复点击等号的情况
                // 2. 运算完的情况 && 手贱的人输个数就点点等号
                if (equal_mark==0) {
                    double x = Double.parseDouble(num1);
                    num3 = x * (-1);
                    result = String.valueOf(num3);
                    output.setText(result);
                }else {
                    double x = Double.parseDouble(result);
                    num3 = x;
                    result = String.valueOf(num3);
                    output.setText(result);
                }
            }
            }
        });
    }

    /**
     * 找控件
     */
    private void initView() {
        output = (TextView) this.findViewById(R.id.output);
        numOne = (TextView) this.findViewById(R.id.one);
        numTwo = (TextView) this.findViewById(R.id.two);
        numThree = (TextView) this.findViewById(R.id.three);
        numFour = (TextView) this.findViewById(R.id.four);
        numFive = (TextView) this.findViewById(R.id.five);
        numSix = (TextView) this.findViewById(R.id.six);
        numSeven = (TextView) this.findViewById(R.id.seven);
        numEight = (TextView) this.findViewById(R.id.eight);
        numNine = (TextView) this.findViewById(R.id.nine);
        numZero = (TextView) this.findViewById(R.id.zero);
        point = (TextView) this.findViewById(R.id.point);
        cancle = (TextView) this.findViewById(R.id.cancle);
        plusOrMinus = (TextView) this.findViewById(R.id.plus_or_minus);
        plus = (TextView) this.findViewById(R.id.plus);
        minus = (TextView) this.findViewById(R.id.minus);
        divide = (TextView) this.findViewById(R.id.divide);
        multiply = (TextView) this.findViewById(R.id.multiply);
        mod = (TextView) this.findViewById(R.id.mod);
        equal = (TextView) this.findViewById(R.id.equal);
    }

    // 点击之后改变颜色
    public void onOneClick(View view) {
        Log.d(TAG,"color changed");
    }
}
