package com.example.mariem_hammouda_tp2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnconsulter;
    private TextView msg;
12
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnconsulter = findViewById(R.id.btnconsulter);
        msg = findViewById(R.id.msg);
        btnconsulter.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msg.setText("Félicitation");
            }
        }));
    }
}
//public void calculer(View view){
//toast.makeText(this,"le button consulter a été !",Toast.LENGTH.