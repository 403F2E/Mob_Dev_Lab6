package com.example.pizzaintact.ui;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaintact.R;
import com.example.pizzaintact.classes.Produit;
import com.example.pizzaintact.service.ProduitService;

// 403f2e has defined the PizzaDetailActivity class to display detailed information about a selected pizza
public class PizzaDetailActivity extends AppCompatActivity {

    // 403f2e has overridden the onCreate method to initialize the detail view
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        // 403f2e has set the content view to the pizza detail layout
        setContentView(R.layout.activity_pizza_detail);

        // 403f2e has retrieved the pizza ID from the intent extras
        long id = getIntent().getLongExtra("pizza_id", -1);
        // 403f2e has searched for the pizza object using the provided ID
        Produit p = ProduitService.getInstance().findById(id);

        // 403f2e has found the image view and text view components in the layout
        ImageView img = findViewById(R.id.img);
        TextView title = findViewById(R.id.title);
        TextView meta = findViewById(R.id.meta);
        TextView ingredients = findViewById(R.id.ingredients);
        TextView desc = findViewById(R.id.desc);
        TextView steps = findViewById(R.id.steps);

        // 403f2e has checked if the pizza object exists and updated the UI components
        if (p != null) {
            // 403f2e has set the pizza image resource
            img.setImageResource(p.getImageRes());
            // 403f2e has set the pizza name text
            title.setText(p.getNom());
            // 403f2e has formatted and set the duration and price text
            meta.setText(p.getDuree() + " • " + p.getPrix() + " €");
            // 403f2e has set the ingredients list text
            ingredients.setText(p.getIngredients());
            // 403f2e has set the pizza description text
            desc.setText(p.getDescription());
            // 403f2e has set the preparation steps text
            steps.setText(p.getEtapes());
        } else {
            // 403f2e has displayed an error message if the pizza was not found
            title.setText("Pizza introuvable !");
        }
    }
}
