package hocc.fun.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView add;

    ImageView minus;

    TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(getResources().getColor(com.google.android.material.R.color.material_dynamic_neutral95));
        setContentView(R.layout.activity_main);

        add = (ImageView) findViewById(R.id.add_back);
        count=(TextView) findViewById(R.id.number);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(count.getText().toString());
                count.setText(String.valueOf(currentValue + 1));
            }
        });
        minus = (ImageView) findViewById(R.id.minus_back);
        count=(TextView) findViewById(R.id.number);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentValue = Integer.parseInt(count.getText().toString());
                count.setText(String.valueOf(currentValue - 1));
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
