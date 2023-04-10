package br.com.ifsudestemg.sistemapdvif;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.com.ifsudestemg.sistemapdvif.ui.CadCidadeActivity;
import br.com.ifsudestemg.sistemapdvif.ui.CadEstadoActivity;
import br.com.ifsudestemg.sistemapdvif.ui.ListagemCidadeFragment;
import br.com.ifsudestemg.sistemapdvif.ui.ListagemEstadoFragment;

public class MainActivity extends AppCompatActivity {

    /**
     * Variável utilizada para saber quando fragmento está seleciondo na
     * tela
     */
    private int id_fragmento = 1; //Estado

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        FragmentManager fragmentManager = getSupportFragmentManager();

        switch (id){

            case R.id.action_cadastroestado:

                id_fragmento = 1;
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ListagemEstadoFragment.class, null)
                        .commit();


                break;

            case R.id.action_cadastrocidade:
                id_fragmento = 2;
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, ListagemCidadeFragment.class, null)
                        .commit();

                break;

            case R.id.action_incluir:

                incluir();

                break;

            case R.id.acton_sair:
                finish();

                break;
        }


        return super.onOptionsItemSelected(item);
    }

    private void incluir() {

        Intent it = null;

        switch (id_fragmento){

            case 1: //Estado

                it = new Intent(this, CadEstadoActivity.class);
                startActivity(it);

                break;
            case 2: //Cidade

                it = new Intent(this, CadCidadeActivity.class);
                startActivity(it);

                break;

        }



    }
}