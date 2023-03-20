package br.com.ifsudestemg.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
                implements View.OnClickListener {

    private EditText edtValor1;
    private EditText edtValor2;
    private Button btnCalcular;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializaComponentes();
    }

    /**
     * Método responsável por inicializar os componentes da interface.
     */
    private void inicializaComponentes(){
        edtValor1 = findViewById(R.id.edtValor1);
        edtValor2 = findViewById(R.id.edtValor2);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);

        /**Para registrar o evento do botão passamos a referência da
         * classe que está implementado o ouvinte de eventos
         * OnClickListener*/
        btnCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        /** Recuperando o conteúdo digitado pelo usuário na caixa
         * de texto. Utilizamos o método getText() para recuperar
         * conteúdo, entretanto, devemos utilizamos o método toString
         * para de fato retornar o conteúdo.*/
        String strValor1 = edtValor1.getText().toString();
        String strValor2 = edtValor2.getText().toString();

        /**Converte a variável String para Double*/
        Double valor1 = Double.parseDouble(strValor1);
        Double valor2 = Double.parseDouble(strValor2);

        Double resultado = valor1 + valor2;

        txtResultado.setText(String.valueOf(resultado));

    }

}