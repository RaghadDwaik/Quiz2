package com.example.quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText name,salary;
    private ListView list;
    private Spinner sp;
   ArrayList<Employee> employee = new ArrayList<Employee>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.name);
        salary =findViewById(R.id.salary);
        list = findViewById(R.id.list);
        sp = findViewById(R.id.spinner);

    }

    public void btnAdd(View view) {
           String namee = name.getText().toString().trim();
           String Salary = salary.getText().toString().trim();
           String spin = sp.toString();
           employee.add(new Employee(namee,Salary));

        ArrayAdapter<Employee> adapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, employee);
        list.setAdapter( adapter );

    }

    }

