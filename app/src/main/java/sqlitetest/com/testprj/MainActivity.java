package sqlitetest.com.testprj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnClk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClk=(Button)findViewById(R.id.btnClk);


        btnClk.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show();
    }
}
