package mx.edu.tesoem.isc.riclr.ejercicio20201;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText vNombre, vEdad, vTelefono, vMail;
    TextView eNombre, eEdad, eTelefono, eMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vNombre = findViewById(R.id.txtNombre);
        vEdad = findViewById(R.id.txtEdad);
        vTelefono =findViewById(R.id.txtTelefono);
        vMail = findViewById(R.id.txtMail);

        eNombre = findViewById(R.id.lblNombre);
        eEdad = findViewById(R.id.lblEdad);
        eTelefono =findViewById(R.id.lblTelefono);
        eMail = findViewById(R.id.lblMail);
    }

    public void Mostrar(View v){
        int edad;
        eNombre.setText(vNombre.getText());
        edad = Integer.parseInt(vEdad.getText().toString());
        eEdad.setText(String.valueOf(edad));
        eTelefono.setText(vTelefono.getText());
        eMail.setText(vMail.getText());
    }
}
