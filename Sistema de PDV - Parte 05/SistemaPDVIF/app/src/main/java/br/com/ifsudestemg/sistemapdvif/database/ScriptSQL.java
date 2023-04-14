package br.com.ifsudestemg.sistemapdvif.database;

/**
 * Classe responsável por conter todo o código de script
 * DDL
 */
public class ScriptSQL {

    public static String createTableEstado(){

        String sql = "CREATE TABLE ESTADO(\n" +
                "       _ID INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
                "       SIGLA VARCHAR(2) NOT NULL DEFAULT ''\n" +
                ");";

        return sql;
    }

    public static String dropTableEstado(){
        String sql = "DROP TABLE IF EXISTS ESTADO";
        return sql;
    }

}
