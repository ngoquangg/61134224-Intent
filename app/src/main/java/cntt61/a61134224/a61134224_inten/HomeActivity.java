package cntt61.a61134224.a61134224_inten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent i = getIntent();
        String username = i.getStringExtra("USERNAME");

        TextView textView = findViewById(R.id.tvUserName);

        textView.setText("Chào mừng:   "+username);
    }
}