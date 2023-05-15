package sg.edu.rp.c346.id22026074.l04_reservation;

import static sg.edu.rp.c346.id22026074.l04_reservation.R.id.etName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etMobile;
    EditText etSize;
    DatePicker datePicker;
    TimePicker timePicker;
    CheckBox checkBox;
    Button btnSubmit;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link
        etName = findViewById(R.id.etName);
        etMobile = findViewById(R.id.etMobile);
        etSize = findViewById(R.id.etSize);
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        checkBox = findViewById(R.id.checkBox);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnReset = findViewById(R.id.btnReset);

        datePicker.updateDate(2019, 07, 01);
        timePicker.setCurrentHour(19);
        timePicker.setCurrentMinute(30);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();

                int getDay = datePicker.getDayOfMonth();
                int getMonth = datePicker.getMonth();
                int getYear = datePicker.getYear();
                String getDate = "Date is " + getDay + "/" + getMonth + "/" + getYear;

                int getHour = timePicker.getCurrentHour();
                int getMin = timePicker.getCurrentMinute();
                String getTime = "Time is " + getHour + ":" + getMin;


                Toast.makeText(getApplicationContext(),
                        "Name: " + name + " Mobile: " + etMobile +
                                " No. of Pax: " + etSize + " Date: " + getDate
                        + "Time: " + getTime, Toast.LENGTH_LONG).show();
                ;
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.getText().clear();
                etMobile.getText().clear();
                etSize.getText().clear();
                checkBox.setChecked(false);
                datePicker.updateDate(2019, 07, 01);
                timePicker.setCurrentHour(19);
                timePicker.setCurrentMinute(30);

            }
        });

    }}