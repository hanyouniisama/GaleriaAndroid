package com.tesis.galeria.galeria;

import android.app.SearchManager;
import android.content.Intent;
import android.provider.SearchRecentSuggestions;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tesis.galeria.R;
import com.tesis.galeria.galeria.componentes.HistorialBusqueda;

public class BusquedaActivity extends AppCompatActivity {

    private String mQuery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busqueda);

        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            mQuery = intent.getStringExtra(SearchManager.QUERY).trim();
            SearchRecentSuggestions suggestions = new SearchRecentSuggestions(this,
                    HistorialBusqueda.AUTHORITY, HistorialBusqueda.MODE);
            suggestions.saveRecentQuery(mQuery, null);

            getSupportActionBar().setTitle(mQuery);


        } else if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            String uri = intent.getDataString();
        }
    }
}