package aa.bb.expmvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import aa.bb.expmvp.R;

public class MainActivity extends AppCompatActivity
implements  AnimalView{
    AnimalPresenter ap;
    TextView txtNom, txtPrix;
    EditText editNum;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ap = new AnimalPresenter(this);
        txtNom=findViewById(R.id.txtNom);
        txtPrix=findViewById(R.id.txtPrix);
        btn=findViewById(R.id.btn);
        editNum=findViewById(R.id.editNum);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //récupération des données
            ap.recupDataByNum(Integer.parseInt(editNum.getText().toString()));
        }
    });
    }

    @Override
    public void onGetName(String nom) {
        txtNom.setText(nom);
    }
    @Override
    public void onGetPrix(Double prix) {
        txtPrix.setText(String.valueOf(prix));
    }
}