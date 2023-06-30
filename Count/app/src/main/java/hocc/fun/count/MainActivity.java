package hocc.fun.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView add;

    ImageView minus;

    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(getResources().getColor(com.google.android.material.R.color.material_dynamic_neutral95));
        setContentView(R.layout.activity_main);
        count=(TextView) findViewById(R.id.number);

        //add
        add = (ImageView) findViewById(R.id.add_back);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(count.getText().toString());
                if (currentValue > 98){
                    CharSequence text = "Count between 0 and 99 !";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(MainActivity.this /* MyActivity */, text, duration);
                    toast.show();
                } else {
                    count.setText(String.valueOf(currentValue + 1));
                }
            }
        });

        //minus
        minus = (ImageView) findViewById(R.id.minus_back);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(count.getText().toString());
                if (currentValue < 1){
                    CharSequence text = "Count between 0 and 99 !";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(MainActivity.this /* MyActivity */, text, duration);
                    toast.show();
                } else {
                    count.setText(String.valueOf(currentValue - 1));
                }
            }
        });

        TextView reset = (TextView) findViewById(R.id.number);

        reset.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                int currentValue = Integer.parseInt(count.getText().toString());
                count.setText(String.valueOf("0"));
                return false;
            }
        });

    }

}
