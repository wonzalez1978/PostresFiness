package cl.desafiolatam.postresfiness;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private RecipeFitAdapter.OnItemClickListener onItemClickListener = new RecipeFitAdapter.OnItemClickListener() {
        @Override
        public void onClick(RecipeFitAdapter.MyViewHolder myViewHolder, int idDessertFit) {
            Log.d(TAG, "onClick entrando, método no implementado");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        RecipeFitAdapter adapter = new RecipeFitAdapter(this, DataSource.getRecipes(), onItemClickListener);
        mRecyclerView.setAdapter(adapter);
    }
}
