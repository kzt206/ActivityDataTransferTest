package jp.ne.sakura.penguin.activitydatatransfertest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int number = 1000;
                Intent intent = new Intent(getApplication(),SubActivity.class);
//                intent.putExtra("Int1",3);
                intent.putExtra("Int1",number);
                startActivity(intent);

            }
        });
    }
}
