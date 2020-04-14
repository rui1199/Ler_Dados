package pt.ipg.ler_dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_NOME = "pt.ipg.ler_dados.NOME";
    public static final String EXTRA_ALTURA ="pt.ipg.ler_dados.ALTURA" ;
    public static final String EXTRA_PESO = "pt.ipg.ler_dados.PESO";
    public static final String EXTRA_IDADE ="pt.ipg.ler_dados.IDADE" ;
    public static final String EXTRA_EMAIL ="pt.ipg.ler_dados.EMAIL" ;
    public static final String EXTRA_TELE = "pt.ipg.ler_dados.TELE";
    private EditText editTextnome;
    private EditText editTextidade;
    private EditText editTexttele;
    private EditText editTextemail;
    private EditText editTextpeso;
    private EditText editTextaltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickBotaoEnviar(View view) {
        Intent intent = new Intent(getApplicationContext(), ecracommensagemfinal.class);

        EditText editTextnome =(EditText) findViewById(R.id.editTextnome);
        EditText editTexttele =(EditText) findViewById(R.id.editTexttele);
        EditText editTextemail =(EditText) findViewById(R.id.editTextemail);
        EditText editTextidade =(EditText) findViewById(R.id.editTextidade);
        EditText editTextpeso =(EditText) findViewById(R.id.editTextpeso);
        EditText editTextaltura =(EditText) findViewById(R.id.editTextaltura);

        String mensagem1 = editTextnome.getText().toString();
        //verificar se estam corretos os campos
        if(mensagem1.length()<= 0){
            editTextnome.setError("diga um nome");
            editTextnome.requestFocus();
            return;
        }
        String mensagem2 = editTexttele.getText().toString();
        if(mensagem2.length() <=0){
            editTexttele.setError("diga um telefone");
            editTexttele.requestFocus();
            return;
        }
        String mensagem3 = editTextemail.getText().toString();
        if(mensagem3.length()<=0){
            editTextemail.setError("diga um e-mail");
            editTextemail.findFocus();
            return;
        }
        String mensagem4 = editTextidade.getText().toString();
        int idade;
        try {
            idade = Integer.parseInt(mensagem4);
        }catch (NumberFormatException e){
            editTextidade.setError("diga uma idade");
            editTextidade.requestFocus();
            return;
        }
        if(idade <18){
            editTextidade.setError("nao pode ter menos de 18 anos");
            editTextidade.requestFocus();
            return;
        }
        String mensagem5 = editTextpeso.getText().toString();
        if(mensagem5.length()<=0||mensagem5.length()>=500){
            editTextpeso.setError("diga o seu peso");
            editTextpeso.findFocus();
            return;
        }
        String mensagem6 = editTextaltura.getText().toString();

        intent.putExtra(EXTRA_NOME, mensagem1);
        intent.putExtra(EXTRA_TELE, mensagem2);
        intent.putExtra(EXTRA_EMAIL, mensagem3);
        intent.putExtra(EXTRA_IDADE, mensagem4);
        intent.putExtra(EXTRA_PESO, mensagem5);
        intent.putExtra(EXTRA_ALTURA, mensagem6);

        startActivity(intent);
    }
}
