package com.example.pizzaintact.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaintact.R;
import com.example.pizzaintact.adapter.PizzaAdapter;
import com.example.pizzaintact.classes.Produit;
import com.example.pizzaintact.service.ProduitService;
import java.util.List;

// 403f2e has defined the ListPizzaActivity class to display the list of pizzas
public class ListPizzaActivity extends AppCompatActivity {

    // 403f2e has overridden the onCreate method to set up the activity
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        // 403f2e has set the content view to the list activity layout
        setContentView(R.layout.activity_list_pizza);

        // 403f2e has found the ListView component in the layout
        ListView lv = findViewById(R.id.lvPizzas);
        // 403f2e has retrieved the list of all pizzas from the service
        List<Produit> pizzas = ProduitService.getInstance().findAll();

        // 403f2e has initialized and set the PizzaAdapter for the ListView
        lv.setAdapter(new PizzaAdapter(this, pizzas));

        // 403f2e has set an item click listener to navigate to the pizza details
        lv.setOnItemClickListener((parent, view, pos, id) -> {
            // 403f2e has created an intent to start PizzaDetailActivity
            Intent it = new Intent(this, PizzaDetailActivity.class);
            // 403f2e has passed the selected pizza ID to the next activity
            it.putExtra("pizza_id", id);
            // 403f2e has started the detail activity
            startActivity(it);
        });
    }
}
