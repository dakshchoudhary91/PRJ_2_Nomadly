package com.example.nomadly;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnCreatePlan, btnExpenseTracker;
    TextView txtUserName;
    ImageView imgProfile, imgTrip1, imgTrip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize views
        btnCreatePlan = findViewById(R.id.btnCreatePlan);
        btnExpenseTracker = findViewById(R.id.btnExpenseTracker);
        txtUserName = findViewById(R.id.txtUserName);
        imgProfile = findViewById(R.id.imgProfile);
        imgTrip1 = findViewById(R.id.imgTrip1);
        imgTrip2 = findViewById(R.id.imgTrip2);

        // Navigate to AddPlanIntroActivity (Frame 4) first
        btnCreatePlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AddPlanIntroActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to ExpenseTrackerActivity
        btnExpenseTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ExpenseTrackerActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to PlanDetailsActivity when clicking on Trip1 or Trip2
        imgTrip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PlanDetailsActivity.class);
                startActivity(intent);
            }
        });

        imgTrip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, PlanDetailsActivity.class);
                startActivity(intent);
            }
        });
    }
}
