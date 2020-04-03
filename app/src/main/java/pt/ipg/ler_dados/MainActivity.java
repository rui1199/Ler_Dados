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
    public void onClickBotaoEnviar(View view) {

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

        Intent intent = new Intent(getApplicationContext(), ecracommensagemfinal.class);
        Bundle parametros = new Bundle();

        parametros.putString("Nome", mensagem1);
        parametros.putString("Telemovel", mensagem2);
        parametros.putString("E-mail", mensagem3);
        parametros.putString("Idade", mensagem4);
        parametros.putString("Peso", mensagem5);
        parametros.putString("Altura", mensagem6);

        intent.putExtra(EXTRA_MESSAGE, parametros);

        startActivity(intent);
    }
}
