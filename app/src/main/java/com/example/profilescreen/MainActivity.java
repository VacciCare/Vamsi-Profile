package com.example.profilescreen;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton btnBack;
    private Button btnParentGuardian, btnVaccinationRecords, btnAppointmentHistory,
            btnMedicalSafetyInfo, btnChangePassword, btnHelpSupport, btnRegisterChild;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccination_profile);

        initializeInterfaceElements();
        setupMenuClickListeners();
    }

    private void initializeInterfaceElements() {
        btnBack = findViewById(R.id.btnBack);

        // Menu Button items
        btnParentGuardian = findViewById(R.id.btnParentGuardian);
        btnVaccinationRecords = findViewById(R.id.btnVaccinationRecords);
        btnAppointmentHistory = findViewById(R.id.btnAppointmentHistory);
        btnMedicalSafetyInfo = findViewById(R.id.btnMedicalSafetyInfo);
        btnChangePassword = findViewById(R.id.btnChangePassword);
        btnHelpSupport = findViewById(R.id.btnHelpSupport);
        btnLogout = findViewById(R.id.btnLogout);
    }

    private void setupMenuClickListeners() {
        if (btnBack != null) {
            btnBack.setOnClickListener(v -> finish());
        }

        if (btnParentGuardian != null) {
            btnParentGuardian.setOnClickListener(v ->
                    showToast("Opening Parent / Guardian Details Profile Panel..."));
        }

        if (btnVaccinationRecords != null) {
            btnVaccinationRecords.setOnClickListener(v ->
                    showToast("Loading historic Vaccination Records..."));
        }

        if (btnAppointmentHistory != null) {
            btnAppointmentHistory.setOnClickListener(v ->
                    showToast("Fetching upcoming and past Appointment Schedules..."));
        }

        if (btnMedicalSafetyInfo != null) {
            btnMedicalSafetyInfo.setOnClickListener(v ->
                    showToast("Opening Medical Safety Logs..."));
        }

        if (btnChangePassword != null) {
            btnChangePassword.setOnClickListener(v ->
                    showToast("Redirecting to security change settings screen..."));
        }

        if (btnHelpSupport != null) {
            btnHelpSupport.setOnClickListener(v ->
                    showToast("Launching Help & Customer Care Module..."));
        }

        if (btnLogout != null) {
            btnLogout.setOnClickListener(v -> {
                showToast("Logging user account session out...");
                finish();
            });
        }
    }

    private void showToast(String promptMessage) {
        Toast.makeText(MainActivity.this, promptMessage, Toast.LENGTH_SHORT).show();
    }
}