package br.com.ifsudestemg.sistemapdvif.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import br.com.ifsudestemg.sistemapdvif.R;
import br.com.ifsudestemg.sistemapdvif.database.DadosDBHelper;


public class CadEstadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_estado);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        criarConexao();
    }

    private void criarConexao(){

        DadosDBHelper dbHelper = null;

        try{

            dbHelper = new DadosDBHelper(this);

            SQLiteDatabase db = dbHelper.getWritableDatabase();

            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage("Conexão criada com sucesso");
            dialog.show();

        }catch(Exception ex){
            AlertDialog.Builder dialog = new AlertDialog.Builder(this);
            dialog.setMessage(ex.getMessage());
            dialog.show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_confirmarcancelar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}