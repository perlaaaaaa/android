package pl.edu.zslp.bmi_euapp16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BmiCalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);
    }

    public void MBMI(View view) {

        /* Getting the double value of the number entered into an editTextWeight */
        EditText editWeight=(EditText)findViewById(R.id.editTextWeight);
        Double weight=Double.parseDouble(editWeight.getText().toString());

         /* Getting the double value of the number entered into an editTextHeight */
        EditText editHeight=(EditText)findViewById(R.id.editTextHeight);
        Integer height=Integer.parseInt(editHeight.getText().toString());

        /* Creating double variable named bmi and assigning it a value of 10000*weight/(height*height)*/
        Double bmi=(10000*weight)/(height*height);

        /* Creating String variable named message*/
        String message;

        /* Creating if statement using variable bmi*/
        if(bmi<=18.5) message=getString(R.string.underweight_message);
        else if(bmi>=25) message=getString(R.string.overweight_message);
        else message=getString(R.string.right_weight_message);

        /*Creating Toast message showing the result of if statement */
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_LONG).show();

        /* Clearing editText files to use it again*/
        editHeight.setText("");
        editWeight.setText("");
    }
}

