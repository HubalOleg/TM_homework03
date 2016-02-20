package oleg.hubal.com.tm_homework03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button btnSum, btnDif;
    public TextView tvAns;
    public EditText edtA, edtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSum = (Button) findViewById(R.id.btn_sum);
        btnDif = (Button) findViewById(R.id.btn_dif);
        tvAns = (TextView) findViewById(R.id.tv_ans);
        edtA = (EditText) findViewById(R.id.edt_value_a);
        edtB = (EditText) findViewById(R.id.edt_value_b);

        btnSum.setOnClickListener(this);
        btnDif.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String answer = "";

        int a = Integer.parseInt(edtA.getText().toString());
        int b = Integer.parseInt(edtB.getText().toString());

        switch (v.getId()) {
            case R.id.btn_sum:
                answer = String.valueOf(a + b);
                break;
            case R.id.btn_dif:
                answer = String.valueOf(a - b);
                break;
        }

        tvAns.setText(answer);
    }
}
