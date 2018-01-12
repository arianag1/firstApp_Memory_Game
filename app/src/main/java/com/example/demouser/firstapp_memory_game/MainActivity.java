/*package com.example.demouser.firstapp_memory_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boolean b = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Integer [] images = {R.drawable.lion, R.drawable.amarillo, R.drawable.cheeta,
                R.drawable.gorilla, R.drawable.penguins, R.drawable.rabbits};
        List<Integer> pic = new ArrayList<Integer>();
        if (pic.addAll(Arrays.asList(images))) {
            b = true;
        } else {
            b = false;
        }
        RelativeLayout background = findViewById(R.id.back_image);
        Collections.shuffle(pic);
        for(int i = 0 ; i < pic.size() ; i++) {
            background.setBackgroundResource(pic.get(i));
        }

        //background.setBackgroundResource(pic.get(1));


    }
}*/
package com.example.demouser.firstapp_memory_game;

        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.RelativeLayout;

        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    private boolean b = false;
    int image_num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Integer[] images = {R.drawable.lion, R.drawable.amarillo, R.drawable.cheeta,
                R.drawable.gorilla, R.drawable.penguins, R.drawable.rabbits};
        final List<Integer> pic = new ArrayList<Integer>();
        if (pic.addAll(Arrays.asList(images))) {
            b = true;
        } else {
            b = false;
        }
        final RelativeLayout background = findViewById(R.id.back_image);
        final Button shuffle = findViewById(R.id.shuffle_bt);
        shuffle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(image_num < pic.size()){
                    background.setBackgroundResource(pic.get(image_num));
                    image_num++;
                }
                else image_num = 0;
            }
        });
        final Button pick = findViewById(R.id.pick_bt);
        pick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                background.setBackgroundResource(pic.get(image_num));
            }
        });


        //background.setBackgroundResource(pic.get(1));


    }

}
