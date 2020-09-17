package comscisdu.piyawat.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1EditText, num2EditText;
    Button addButton , minusButton , multiplyButton , divideButton;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Initial view ประกาศให้ JAVA รู้จัก element บน XML
        num1EditText = findViewById(R.id.edtNumber1);
        num2EditText = findViewById(R.id.edtNumber2);
        addButton = findViewById(R.id.btAdd);
        minusButton = findViewById(R.id.btMinus);
        multiplyButton = findViewById(R.id.btMultiply);
        divideButton = findViewById(R.id.btDivide);
        resultTextView = findViewById(R.id.tvResult);
    //เมื่อ user คลิกปุ่ม ADD
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result+"");
            }
        });

    //เมื่อ user คลิกปุ่ม MINUS
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 - num2;
                resultTextView.setText(result+"");
            }
        });
    //เมื่อ user คลิกปุ่ม MULTIPLY
        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 * num2;
                resultTextView.setText(result+"");
            }
        });
    //เมื่อ user คลิกปุ่ม DIVIDE
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());
                int result = num1 / num2;
                resultTextView.setText(result+"");

            }
        });
    }
}