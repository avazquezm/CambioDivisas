package iam48096227.escoladeltreball.org.cambiodivisas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btn_convert;
    private EditText euros, dollars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_convert = (Button) findViewById(R.id.btn_convert);
        euros = (EditText) findViewById(R.id.Euro);
        dollars = (EditText) findViewById(R.id.dollar);

        btn_convert.setOnClickListener(v -> doConversion());

//        double d = Double.parseDouble(euros.getText().toString()) * 1.17623;
//        btn_convert.setOnClickListener(view -> dollars.setText((int) d));

    }

    private void doConversion() {
        double valor_euros = Double.parseDouble(euros.getText().toString());
        double valor_dollars = valor_euros * 1.17;
        dollars.setText(String.valueOf(valor_dollars));
    }
}
