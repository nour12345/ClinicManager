package com.example.ClinicManager.ui.activity.procedures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ClinicManager.R;
import com.example.ClinicManager.ui.activity.add_drug.AddDrugActivity;
import com.example.ClinicManager.ui.activity.add_procedures.AddProcedureActivity;
import com.example.ClinicManager.ui.adapter.PatientAdapter;
import com.example.ClinicManager.ui.adapter.ProceduresAdapter;
import com.example.ClinicManager.ui.fragment.patient.PatientsViewModel;

public class ProceduresActivity extends AppCompatActivity {

    private ProceduresAdapter proceduresAdapter;
    private RecyclerView recyclerView;
    private CardView addProcedure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedures);

        recyclerView = findViewById(R.id.procedures_recycler);
        addProcedure = findViewById(R.id.add_procedure);

        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        proceduresAdapter = new ProceduresAdapter(this);

        recyclerView.setAdapter(proceduresAdapter);
        addProcedure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProceduresActivity.this, AddProcedureActivity.class));
            }
        });
    }
}