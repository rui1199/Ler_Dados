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

        String mensagem1 = intent.getStringExtra(MainActivity.EXTRA_NOME);
        String mensagem2 = intent.getStringExtra(MainActivity.EXTRA_TELE);
        String mensagem3 = intent.getStringExtra(MainActivity.EXTRA_EMAIL);
        String mensagem4 = intent.getStringExtra(MainActivity.EXTRA_IDADE);
        String mensagem5 = intent.getStringExtra(MainActivity.EXTRA_PESO);
        String mensagem6 = intent.getStringExtra(MainActivity.EXTRA_ALTURA);


        TextView textViewnome = findViewById(R.id.textViewnome);
        textViewnome.setText(mensagem1 );
        TextView textViewtelefone = findViewById(R.id.textViewtelefone);
        textViewtelefone.setText(mensagem2);
        TextView textViewemail = findViewById(R.id.textViewemail);
        textViewemail.setText(mensagem3);
        TextView textViewidade = findViewById(R.id.textViewidade);
        textViewidade.setText(mensagem4);
        TextView textViewnpeso = findViewById(R.id.textViewpeso);
        textViewnpeso.setText(mensagem5);
        TextView textViewaltura = findViewById(R.id.textViewaltura);
        textViewaltura.setText(mensagem6);

    }
}
