package by.itstep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent doubleTextIntent = getIntent();
        String text = doubleTextIntent.getStringExtra(MainActivity.TEXT_PARAM);
        final String resultText = text + text;

        TextView textViewSecondActivity = findViewById(R.id.textViewSecondActivity);
        textViewSecondActivity.setText(resultText);

        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                result.putExtra(MainActivity.TEXT_PARAM, resultText);
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}
