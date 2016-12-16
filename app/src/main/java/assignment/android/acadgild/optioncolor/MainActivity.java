package assignment.android.acadgild.optioncolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewColor=(TextView)findViewById(R.id.textViewColor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.text_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.menuRed:
                textViewColor.setTextColor(Color.RED);
                return  true;
            case R.id.menuGreen:
                textViewColor.setTextColor(Color.GREEN);
                return  true;
            case R.id.menuBlue:
                textViewColor.setTextColor(Color.BLUE);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
