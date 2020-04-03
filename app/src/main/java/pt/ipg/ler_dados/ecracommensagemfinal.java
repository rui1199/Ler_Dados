package pt.ipg.ler_dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ecracommensagemfinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecracommensagemfinal);

        Intent intent = getIntent();
        Bundle parametros = intent.getExtras();

        String mensagem1  = parametros.getString("Nome");
        String mensagem2 = parametros.getString("Telemovel");
        String mensagem3 = parametros.getString("E_mail");

        String mensagem4 = parametros.getString("Idade");
        String mensagem5 = parametros.getString("Peso");
        String mensagem6 = parametros.getString("Altura");

        TextView textViewnome = findViewById(R.id.textViewnome);
        textViewnome.setText(mensagem1 );
        TextView textViewtelefone = findViewById(R.id.textViewtelefone);
        textViewnome.setText(mensagem2);
        TextView textViewemail = findViewById(R.id.textViewemail);
        textViewnome.setText(mensagem3);
        TextView textViewidade = findViewById(R.id.textViewidade);
        textViewnome.setText(mensagem4);
        TextView textViewnpeso = findViewById(R.id.textViewpeso);
        textViewnome.setText(mensagem5);
        TextView textViewaltura = findViewById(R.id.editTextaltura);
        textViewnome.setText(mensagem6);
    }
}
