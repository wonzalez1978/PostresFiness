package cl.desafiolatam.postresfiness;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import cl.desafiolatam.postresfiness.model.Recipe;

public class RecipeFitAdapter extends RecyclerView.Adapter<RecipeFitAdapter.MyViewHolder> {

    private static final String TAG = "DatFitAdapter";

    private List<Recipe> recipes;
    private LayoutInflater mLayoutInflater;
    private OnItemClickListener listener;

    public RecipeFitAdapter(Context context, List<Recipe> recipes, OnItemClickListener listener) {
        mLayoutInflater = LayoutInflater.from(context);
        this.recipes = recipes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecipeFitAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder entrando...");
        View mRecipeView;
        mRecipeView = mLayoutInflater.inflate(R.layout.item_list_dessert, parent, false);
        return new MyViewHolder(mRecipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeFitAdapter.MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder entrando...");
        Recipe Recipe = recipes.get(position);
        holder.setNombre(Recipe.getNombre());
        Glide.with(holder.mImagen.getContext())
                .load(Recipe.getImagen())
                .into(holder.mImagen);
    }

    @Override
    public int getItemCount() {
        return this.recipes.size();
    }

    private int getIdRecipe(int position){
        return position != RecyclerView.NO_POSITION ? recipes.get(position).getId() : -1;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mNombre;
        private ImageView mImagen;

        public MyViewHolder(View RecipeView){
            super(RecipeView);
            mNombre = RecipeView.findViewById(R.id.list_item_textView);
            mImagen = RecipeView.findViewById(R.id.avatar);
            RecipeView.setOnClickListener(this);
            mNombre.setOnClickListener(this);
            mImagen.setOnClickListener(this);
        }
        public void setNombre(String text) {
            mNombre.setText(text);
        }

        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick entrando...");
            listener.onClick(this, getIdRecipe(getAdapterPosition()));
        }
    }

    public interface OnItemClickListener{
        void onClick(MyViewHolder myViewHolder, int idRecipe);
    }
}
