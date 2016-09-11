package id.sch.smktelkom_mlg.tugas01.xirpl3006.pendaftaranperguruantinggi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;

    Spinner spKelulusan;
    TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spKelulusan = (Spinner)findViewById(R.id.spinnerkelulusan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

    }
}
