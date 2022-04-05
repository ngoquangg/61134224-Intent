package cntt61.a61134224.a61134224_inten;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editUserName = findViewById(R.id.edtUserName);
        EditText editPass = findViewById(R.id.edtPass);
        EditText editMail = findViewById(R.id.edtMail);
        Button butOK = findViewById(R.id.btnOK);

        butOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editUserName.getText().toString();
                String pass = editPass.getText().toString();
                String mail = editMail.getText().toString();
                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                i.putExtra ("USERNAME",username);
                i.putExtra ("PASS", pass);
                i.putExtra ("MAIL", mail);
                startActivity(i);
            }
        });
    }
}