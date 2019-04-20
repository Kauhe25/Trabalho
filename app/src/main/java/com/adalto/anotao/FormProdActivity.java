package com.adalto.anotao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormProdActivity extends AppCompatActivity {

    private EditText etTituloProd, etPrecoProd;
    private Button btnSalvarProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_prod);

        etTituloProd = (EditText) findViewById(R.id.etTituloProd);
        etPrecoProd = (EditText) findViewById(R.id.etPrecoProd);
        btnSalvarProd = (Button) findViewById(R.id.btnSalvarProd);

        btnSalvarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salvarProduto();
            }
        });
    }

    private void salvarProduto() {
        Produto p = new Produto();
        p.setNomeProduto( etTituloProd.getText().toString() );
        p.setPreco( etPrecoProd.getText().toString() );
        //AnotacaoDAO.inserir(nota, this);   // Necessito criar ProdutoDAO
        this.finish();
    }
}
