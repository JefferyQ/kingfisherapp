package nico.napp.fr.kingfisherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton0 = (Button) findViewById(R.id.button0);
        Button mButton1 = (Button) findViewById(R.id.button1);
        final TextView mTextView = (TextView) findViewById(R.id.text_view);

        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("Boutton appuyé !");
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextView.setText("Autre boutton appuyé !");
            }
        });

    }
}
