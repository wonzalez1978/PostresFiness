package cl.desafiolatam.postresfiness;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import cl.desafiolatam.postresfiness.data.DataSource;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecipeFitAdapter.OnItemClickListener onItemClickListener = new RecipeFitAdapter.OnItemClickListener() {
        @Override
        public void onClick(RecipeFitAdapter.MyViewHolder myViewHolder, int idRecipe) {
            Log.d(TAG, "onClick entrando, método no implementado");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "bla");
            }
        });

        RecipeFitAdapter adapter = new RecipeFitAdapter(this, DataSource.getRecipes(), onItemClickListener);
        mRecyclerView.setAdapter(adapter);

        mRecyclerView.setHasFixedSize(true);
    }
}
