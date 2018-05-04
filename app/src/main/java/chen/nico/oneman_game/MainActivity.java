package chen.nico.oneman_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageView heart1;
    private ImageView heart2;
    private ImageView heart3;
    private ImageView heart4;
    private ImageView heart5;
    private ArrayList<ImageView> heartList;
    private Button addHeart;
    private Button reduceHeart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getInit();
        addHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addHeart();
            }
        });
        reduceHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reduceHeart();
            }
        });





    }

    private void getInit() {
        heart1 = findViewById(R.id.heart_1);
        heart2 = findViewById(R.id.heart_2);
        heart3 = findViewById(R.id.heart_3);
        heart4 = findViewById(R.id.heart_4);
        heart5 = findViewById(R.id.heart_5);
        heartList = new ArrayList<ImageView>();
        heartList.add(heart1);
        heartList.add(heart2);
        heartList.add(heart3);
        heartList.add(heart4);
        heartList.add(heart5);
        addHeart = findViewById(R.id.add_heart);
        reduceHeart = findViewById(R.id.reduce_heart);
    }

    private void addHeart() {
        for(int i=0;i<heartList.size();i++) {
            if(heartList.get(i).getVisibility() == View.INVISIBLE) {
                heartList.get(i).setVisibility(View.VISIBLE);
                break;
            }
        }
    }

    private void reduceHeart() {
        for(int i=heartList.size()-1;i>=0;i--) {
            if(heartList.get(i).getVisibility() == View.VISIBLE) {
                heartList.get(i).setVisibility(View.INVISIBLE);
                break;
            }
        }
    }



}
