package idadedecachorro.cursoandroid.dell.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoIdade;
    private TextView resultadoIdade;
    private EditText editIdadeCachorro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoIdade = (Button) findViewById(R.id.botao_descobrir_id);
        resultadoIdade = (TextView) findViewById(R.id.texto_resultado_id);
        editIdadeCachorro = (EditText) findViewById(R.id.edit_idade_id);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String texto = editIdadeCachorro.getText().toString();

                if (texto.equals("") || texto.isEmpty()) {
                    resultadoIdade.setText("Informe uma idade");
                } else {
                    int valorDigitado = Integer.parseInt(texto);
                    Log.d("aqui", valorDigitado + "");
                    int resultadoFinal = valorDigitado * 7;
                    Log.d("resultado", resultadoFinal + "");

                    resultadoIdade.setText("A idade do cachorro em anos humanos é: " + resultadoFinal + " anos.");
                }
            }
        });
    }
}
