package com.prathameshmore.toasty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.prathameshmore.toastylibrary.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPrimary, btnSecondary, btnSuccess, btnDanger, btnWarning, btnInfo, btnLight, btnDark, btnGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimary = findViewById(R.id.btn_primary);
        btnSecondary = findViewById(R.id.btn_secondary);
        btnSuccess = findViewById(R.id.btn_success);
        btnDanger = findViewById(R.id.btn_danger);
        btnWarning = findViewById(R.id.btn_warning);
        btnInfo = findViewById(R.id.btn_info);
        btnLight = findViewById(R.id.btn_light);
        btnDark = findViewById(R.id.btn_dark);
        btnGitHub = findViewById(R.id.btn_github);


        btnPrimary.setOnClickListener(this);
        btnSecondary.setOnClickListener(this);
        btnSuccess.setOnClickListener(this);
        btnDanger.setOnClickListener(this);
        btnWarning.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btnLight.setOnClickListener(this);
        btnDark.setOnClickListener(this);
        btnGitHub.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Context context = MainActivity.this;
        Toasty toasty = new Toasty(MainActivity.this);
        switch (v.getId()) {
            case R.id.btn_primary:
                toasty.primaryToasty(context, "3 missed call", Toasty.LENGTH_LONG, Toasty.BOTTOM);
                break;

            case R.id.btn_secondary:
                toasty.secondaryToasty(context, "I am Secondary Toasty", Toasty.LENGTH_LONG, Toasty.TOP);
                break;

            case R.id.btn_success:
                toasty.successToasty(context, "Download complete", Toasty.LENGTH_LONG, Toasty.CENTER);
                break;
            case R.id.btn_danger:
                toasty.dangerToasty(context, "Downloading failed", Toasty.LENGTH_LONG, Toasty.CENTER);
                break;
            case R.id.btn_warning:
                toasty.warningToasty(context, "Data limit over", Toasty.LENGTH_LONG, Toasty.LEFT );
                break;
            case R.id.btn_info:
                toasty.infoToasty(context, "Calling...", Toasty.LENGTH_LONG, Toasty.TOP);
                break;
            case R.id.btn_light:
                toasty.lightToasty(context, "Searching for network", Toasty.LENGTH_LONG, Toasty.BOTTOM);
                break;
            case R.id.btn_dark:
                toasty.darkToasty(context, "Dark theme on", Toasty.LENGTH_LONG, Toasty.TOP);
                break;

            case R.id.btn_github:
                Uri url = Uri.parse("https://github.com/pprathameshmore/Toasty");
                Intent intentUrl = new Intent(Intent.ACTION_VIEW, url);
                startActivity(intentUrl);
                toasty.darkToasty(context, "Thank you for staring on GitHub", Toasty.LENGTH_LONG, Toasty.BOTTOM);
                break;
        }
    }
}
