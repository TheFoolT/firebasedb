package com.stack.user.firebasedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    int hitDevTimes = 0;
    int devRemainHealth = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database_error);

        Button hitDev = (Button) findViewById(R.id.button3);
        hitDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitDev();
            }
        });
    }

    private void hitDev() {

        TextView devReply = (TextView) findViewById(R.id.textView4);

        hitDevTimes++;
        devRemainHealth--;

        switch (hitDevTimes) {
            case 101:
                devReply.setText("The damn developer said his name is Jimmy, and dead.");
                break;

            default:
                if (devRemainHealth > 0) {
                    devReply.setText("You have hit the damn developer and deal 1 damage. The damn developer remains " + devRemainHealth + " hp.");
                } else {
                    devReply.setText("The damn deveoper is dead.");
                }
                break;
        }
    }
}

