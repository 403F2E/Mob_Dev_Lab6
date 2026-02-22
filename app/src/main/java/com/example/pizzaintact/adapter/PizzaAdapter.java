package com.example.pizzaintact.adapter;

import android.content.Context;
import android.view.*;
import android.widget.*;
import com.example.pizzaintact.R;
import com.example.pizzaintact.classes.Produit;
import java.util.List;

// 403f2e has defined the PizzaAdapter class which extends BaseAdapter to manage pizza data display
public class PizzaAdapter extends BaseAdapter {
    // 403f2e has declared the context used for layout inflation
    private final Context ctx;
    // 403f2e has declared the list of Produit objects to be displayed
    private final List<Produit> pizzas;

    // 403f2e has implemented the constructor to initialize the adapter with context and data
    public PizzaAdapter(Context ctx, List<Produit> pizzas) {
        this.ctx = ctx;
        this.pizzas = pizzas;
    }

    // 403f2e has overridden getCount to return the size of the pizza list
    @Override public int getCount() { return pizzas.size(); }
    // 403f2e has overridden getItem to return a pizza object at a specific position
    @Override public Object getItem(int i) { return pizzas.get(i); }
    // 403f2e has overridden getItemId to return the unique identifier of a pizza
    @Override public long getItemId(int i) { return pizzas.get(i).getId(); }

    // 403f2e has overridden getView to create and configure the view for each list item
    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        // 403f2e has checked if convertView is null and inflated the row layout if needed
        if (convertView == null)
            convertView = LayoutInflater.from(ctx).inflate(R.layout.row_pizza, parent, false);

        // 403f2e has found the view components within the inflated layout
        ImageView img = convertView.findViewById(R.id.imgPizza);
        TextView tvNom = convertView.findViewById(R.id.tvNom);
        TextView tvMeta = convertView.findViewById(R.id.tvMeta);

        // 403f2e has retrieved the pizza data for the current position and updated the views
        Produit p = pizzas.get(pos);
        img.setImageResource(p.getImageRes());
        tvNom.setText(p.getNom());
        tvMeta.setText(p.getDuree() + " • " + p.getPrix() + " €");

        // 403f2e has returned the populated view to be displayed in the list
        return convertView;
    }
}
