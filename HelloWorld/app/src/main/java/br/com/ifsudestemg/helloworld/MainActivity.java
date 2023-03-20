package br.com.ifsudestemg.helloworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*Declarando os componentes que foram adicionados na interface.
     Essa declaração é necessário para que possamos interagir com os
     elementos da interface.*/
    private EditText edtNome;
    private Button btnConfirmar;

    /*
    * O método onCreate é chamado sempre que inicializamos a aplicação
    * com um Activity definido como principal ou caso seja chamado
    * algum outro Activity.
    * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*O método setContentView é responsável por vincular o Activity
        * a algum layout de tela.
        * O valor passado como parâmetro para o método representa um ID
        * do layout, neste caso, activity_main. O ID é acessado através
        * da classe "R" que representa a pasta de arquivos de recursos(res).
        * Se você observar o atributo "layout" ele representa a pasta
        * layout dos recursos da aplicação.
        * */
        setContentView(R.layout.activity_main);

        /*Buscando as referências dos componentes que foram declarados
        * na interface. Caso não seja buscado essas referências não
        * conseguiremos utilizar os componentes da interface.*/
        edtNome         = findViewById(R.id.edtNome);
        btnConfirmar    = findViewById(R.id.btnConfirmar);

        /*Utilizando um evento para o botão executar alguma função
        * quando ele for clicado*/
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("Aviso");
                dlg.setMessage(edtNome.getText());
                dlg.show();

            }
        });


    }
}