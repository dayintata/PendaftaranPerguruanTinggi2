package id.sch.smktelkom_mlg.tugas01.xirpl3006.pendaftaranperguruantinggi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    EditText etNama;
    RadioButton rbLK, rbPR;
    RadioGroup rgStatus;
    CheckBox cbIND, cbING, cbIS;
    Spinner spKelulusan;
    TextView tvHasil, tvJurusan;

    int nJurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        rbLK = (RadioButton) findViewById(R.id.radioButtonLK);
//      rbPR = (RadioButton) findViewById(R.id.radioButtonPR);
        rgStatus = (RadioGroup) findViewById(R.id.radioGroupstatus);
        spKelulusan = (Spinner) findViewById(R.id.spinnerkelulusan);
        cbIND = (CheckBox) findViewById(R.id.checkboxSIND);
        cbING = (CheckBox) findViewById(R.id.checkboxSING);
        cbIS = (CheckBox) findViewById(R.id.checkboxSI);

        cbIND.setOnCheckedChangeListener(this);
        cbING.setOnCheckedChangeListener(this);
        cbIS.setOnCheckedChangeListener(this);

        tvJurusan = (TextView) findViewById(R.id.textViewJurusan);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });

    }

    private void doClick() {

        String hasil="Jurusan : \n";
        int startien = hasil.length();
        if (cbIND.isChecked())hasil +=cbIND.getText()+"\n";
        if (cbING.isChecked())hasil +=cbING.getText()+"\n";
        if (cbIS.isChecked())hasil +=cbIS.getText()+"\n";


        if (hasil.length()==startien)hasil+="Tidak Ada Pilihan";
        tvHasil.setText(hasil);


    }
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) nJurusan += 1;
        else nJurusan -= 1;

        tvJurusan.setText("Jurusan (" + nJurusan + " terpilih )");
    }
}
