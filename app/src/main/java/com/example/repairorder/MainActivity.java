package com.example.repairorder;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener submitListener =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //double cost_order = Double.parseDouble(order_edit.getText().toString());
            double cost_paint = Double.parseDouble(paint_edit.getText().toString());
            double cost_tech = Double.parseDouble(technician_edit.getText().toString());
            double cost_insp = Double.parseDouble(inspection_edit.getText().toString());
            double cost_parts = Double.parseDouble(parts_edit.getText().toString());
            double cost_labor = Double.parseDouble(labor_edit.getText().toString());


            double sub = cost_paint + cost_tech + cost_insp + cost_parts + cost_labor;
            double tax = sub / 20;
            double total = sub + tax;


            subtotal_value.setText("$" + sub);
            tax_value.setText("$" + tax);
            total_value.setText("$" + total);
        }
    };
/*
    TextWatcher textWatcher = new TextWatcher() {
        double cost_paint, cost_tech, cost_insp, cost_parts, cost_labor;
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            cost_paint = 0;
            cost_tech = 0;
            cost_insp = 0;
            cost_parts = 0;
            cost_labor = 0;
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            cost_paint = Double.parseDouble(paint_edit.getText().toString());
            cost_tech = Double.parseDouble(technician_edit.getText().toString());
            cost_insp = Double.parseDouble(inspection_edit.getText().toString());
            cost_parts = Double.parseDouble(parts_edit.getText().toString());
            cost_labor = Double.parseDouble(labor_edit.getText().toString());

            double sub = cost_paint + cost_tech + cost_insp + cost_parts + cost_labor;
            double tax = sub / 20;
            double total = sub + tax;


            subtotal_value.setText("$" + sub);
            tax_value.setText("$" + tax);
            total_value.setText("$" + total);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

 */
    Button submitbutton;
    EditText technician_edit, order_edit, inspection_edit, paint_edit, parts_edit, labor_edit;
    TextView subtotal_value, tax_value, total_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitbutton = findViewById(R.id.submit_button);

        subtotal_value = findViewById(R.id.subtotal_value_TV);
        tax_value = findViewById(R.id.tax_value_TV);
        total_value = findViewById(R.id.total_value_TV);

        order_edit = findViewById(R.id.order_type_edittext);
        technician_edit = findViewById(R.id.technician_edittext);
        inspection_edit = findViewById(R.id.inspection_edittext);
        paint_edit = findViewById(R.id.paint_edittext);
        parts_edit = findViewById(R.id.parts_edittext);
        labor_edit = findViewById(R.id.labor_edittext);

        submitbutton.setOnClickListener(submitListener);
        //submitbutton.setText("hello");

        /*
        order_edit.addTextChangedListener(textWatcher);
        technician_edit.addTextChangedListener(textWatcher);
        inspection_edit.addTextChangedListener(textWatcher);
        paint_edit.addTextChangedListener(textWatcher);
        parts_edit.addTextChangedListener(textWatcher);
        labor_edit.addTextChangedListener(textWatcher);

         */
    }
}