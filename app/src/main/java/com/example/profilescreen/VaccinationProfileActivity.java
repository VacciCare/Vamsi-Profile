package com.example.profilescreen;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class VaccinationProfileActivity extends AppCompatActivity {

    private ImageButton btnBack;
    private Button btnParentGuardian, btnVaccinationRecords, btnAppointmentHistory,
            btnMedicalSafetyInfo, btnChangePassword, btnHelpSupport, btnRegisterChild;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination_profile);

        initializeProfileDashboardViews();
        setupDashboardMenuClickListeners();
    }

    private void initializeProfileDashboardViews() {
        btnBack = findViewById(R.id.btnBack);
        btnParentGuardian = findViewById(R.id.btnParentGuardian);
        btnVaccinationRecords = findViewById(R.id.btnVaccinationRecords);
        btnAppointmentHistory = findViewById(R.id.btnAppointmentHistory);
        btnMedicalSafetyInfo = findViewById(R.id.btnMedicalSafetyInfo);
        btnChangePassword = findViewById(R.id.btnChangePassword);
        btnHelpSupport = findViewById(R.id.btnHelpSupport);
        btnLogout = findViewById(R.id.btnLogout);
    }

    private void setupDashboardMenuClickListeners() {
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        if (btnParentGuardian != null) {
            btnParentGuardian.setOnClickListener(v ->
                    showLogFeedback("Opening Parent / Guardian Profiles..."));
        }

        if (btnVaccinationRecords != null) {
            btnVaccinationRecords.setOnClickListener(v ->
                    showLogFeedback("Opening Historical Vaccination Cards list..."));
        }

        if (btnAppointmentHistory != null) {
            btnAppointmentHistory.setOnClickListener(v ->
                    showLogFeedback("Loading historic and pending doctor appointments..."));
        }

        if (btnMedicalSafetyInfo != null) {
            btnMedicalSafetyInfo.setOnClickListener(v ->
                    showLogFeedback("Opening allergen and critical medical warnings data..."));
        }

        if (btnChangePassword != null) {
            btnChangePassword.setOnClickListener(v ->
                    showLogFeedback("Opening Account Password Modification wizard..."));
        }

        if (btnHelpSupport != null) {
            btnHelpSupport.setOnClickListener(v ->
                    showLogFeedback("Opening Contact Center & FAQ Documentation..."));
        }

        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                showLogFeedback("Clearing cached credentials and logging out...");
                finish();
            });
        }
    }

    private void showLogFeedback(String dynamicMessage) {
        Toast.makeText(VaccinationProfileActivity.this, dynamicMessage, Toast.LENGTH_SHORT).show();
    }
}