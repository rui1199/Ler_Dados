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
        String mensagem1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String mensagem2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String mensagem3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String mensagem4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String mensagem5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String mensagem6 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textViewnome = findViewById(R.id.textViewnome);
        textViewnome.setText(mensagem1);
        TextView textViewtelefone = findViewById(R.id.textViewtelefone);
        textViewnome.setText(mensagem2);
        TextView textViewemail = findViewById(R.id.textView1email);
        textViewnome.setText(mensagem3);
        TextView textViewidade = findViewById(R.id.textViewidade);
        textViewnome.setText(mensagem4);
        TextView textViewnpeso = findViewById(R.id.textViewpeso);
        textViewnome.setText(mensagem5);
        TextView textViewaltura = findViewById(R.id.editTextaltura);
        textViewnome.setText(mensagem6);
    }
}
