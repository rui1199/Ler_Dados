package pt.ipg.ler_dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =  "pt.ipg.ler_dados.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, ecracommensagemfinal.class);

        EditText editTextnome =(EditText) findViewById(R.id.editTextnome);
        EditText editTexttele =(EditText) findViewById(R.id.editTexttele);
        EditText editTextemail =(EditText) findViewById(R.id.editTextemail);
        EditText editTextidade =(EditText) findViewById(R.id.editTextidade);
        EditText editTextpeso =(EditText) findViewById(R.id.editTextpeso);
        EditText editTextaltura =(EditText) findViewById(R.id.editTextaltura);

        String mensagem1 = editTextnome.getText().toString();
        String mensagem2 = editTexttele.getText().toString();
        String mensagem3 = editTextemail.getText().toString();
        String mensagem4 = editTextidade.getText().toString();
        String mensagem5 = editTextpeso.getText().toString();
        String mensagem6 = editTextaltura.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, mensagem1);
        intent.putExtra(EXTRA_MESSAGE, mensagem2);
        intent.putExtra(EXTRA_MESSAGE, mensagem3);
        intent.putExtra(EXTRA_MESSAGE, mensagem4);
        intent.putExtra(EXTRA_MESSAGE, mensagem5);
        intent.putExtra(EXTRA_MESSAGE, mensagem6);

        startActivity(intent);
    }
}
