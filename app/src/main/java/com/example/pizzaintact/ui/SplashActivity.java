package com.example.pizzaintact.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaintact.R;

// 403f2e has defined the SplashActivity class to show an initial splash screen
public class SplashActivity extends AppCompatActivity {
    // 403f2e has overridden the onCreate method to initialize the activity
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        // 403f2e has set the content view to the splash screen layout
        setContentView(R.layout.activity_splash);

        // 403f2e has created a new thread to handle the splash screen delay
        Thread t = new Thread(() -> {
            try {
                // 403f2e has paused the thread for 2 seconds
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {}
            // 403f2e has started the ListPizzaActivity after the delay
            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            // 403f2e has finished the SplashActivity so it is removed from the back stack
            finish();
        });
        // 403f2e has started the splash screen timer thread
        t.start();
    }
}
