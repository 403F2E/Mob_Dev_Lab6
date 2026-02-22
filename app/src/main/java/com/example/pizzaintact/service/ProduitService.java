package com.example.pizzaintact.service;

import com.example.pizzaintact.R;
import com.example.pizzaintact.classes.Produit;
import com.example.pizzaintact.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 403f2e has implemented the ProduitService class to handle business logic for pizza products
public class ProduitService implements IDao<Produit> {

    // 403f2e has declared a static instance for the singleton pattern
    private static ProduitService INSTANCE;
    // 403f2e has declared an in-memory list to store pizza data
    private final List<Produit> ProductList403403 = new ArrayList<>();

    // 403f2e has implemented a private constructor to prevent external instantiation and seed initial data
    private ProduitService() {
        seed();
    }

    // 403f2e has implemented the getInstance method to provide a global access point to the service
    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    // 403f2e has implemented the seed method to populate the data list with sample pizzas
    private void seed() {
        // 403f2e has added various pizza products to the data list with details like name, price, and ingredients
        ProductList403403.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                com.example.pizzaintact.R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves\n- 1 cup barbecue sauce...",
                "Pizza au poulet barbecue simple et rapide.",
                "STEP 1: Griller le poulet.\nSTEP 2: Garnir et cuire."));
        ProductList403403.add(new Produit("SPINACH PIZZA", 2.0,
                R.mipmap.pizza2, "25 min",
                "- Sauce Alfredo, épinards, tomates, fromage.",
                "Pizza crémeuse et légère aux légumes.",
                "STEP 1: Étaler la pâte.\nSTEP 2: Ajouter la garniture."));
        ProductList403403.add(new Produit("PIZZA ÉPINARDS ALFREDO", 2.0, R.mipmap.pizza3, "25 min", "- Pâte à pizza\n- Sauce Alfredo\n- Épinards\n- Tomates\n- 4 fromages", "Légère et crémeuse aux épinards.", "ÉTAPE 1 :\nÉtaler la pâte.\n\nÉTAPE 2 :\nGarnir et cuire 10-15 min à 230°C."));
        ProductList403403.add(new Produit("PIZZA SAUCISSE DEEP-DISH", 8.0, R.mipmap.pizza4, "45 min", "- Levure\n- Farine\n- Saucisse\n- Mozzarella\n- Poivron\n- Tomates", "Pâte épaisse façon grand-mère.", "ÉTAPE 1 :\nPétrir la pâte, lever 1h.\n\nÉTAPE 2 :\nGarnir et cuire 20 min à 200°C."));
        ProductList403403.add(new Produit("PIZZA BŒUF MAISON", 4.0, R.mipmap.pizza5, "50 min", "- Bœuf haché\n- Oignon\n- Sauce tomate\n- Poivron\n- Mozzarella", "Pizza familiale classique.", "ÉTAPE 1 :\nPréparer la pâte.\n\nÉTAPE 2 :\nFaire revenir le bœuf.\n\nÉTAPE 3 :\nGarnir et cuire 25-30 min."));
        ProductList403403.add(new Produit("PIZZA PESTO POULET", 3.0, R.mipmap.pizza6, "50 min", "- Poulet\n- Pesto\n- Poivrons\n- Champignons\n- Mozzarella", "Pesto et poulet aux légumes colorés.", "ÉTAPE 1 :\nPétrir la pâte.\n\nÉTAPE 2 :\nCuire le poulet.\n\nÉTAPE 3 :\nGarnir et cuire 18-20 min."));
        ProductList403403.add(new Produit("PIZZA MEXICAINE", 3.0, R.mipmap.pizza7, "30 min", "- Haricots noirs\n- Jalapeño\n- Épinards\n- Cheddar\n- Pepper jack", "Épicée façon tex-mex.", "ÉTAPE 1 :\nÉcraser les haricots.\n\nÉTAPE 2 :\nGarnir et cuire 12-15 min."));
        ProductList403403.add(new Produit("PIZZA BURGER BACON", 2.0, R.mipmap.pizza8, "20 min", "- Bœuf haché\n- Bacon\n- Cornichons\n- Mozzarella\n- Cheddar", "Le burger rencontre la pizza !", "ÉTAPE 1 :\nCuire le bœuf.\n\nÉTAPE 2 :\nGarnir et cuire 8-10 min."));
        ProductList403403.add(new Produit("PIZZA MARGHERITA", 1.0, R.mipmap.pizza9, "30 min", "- Pâte maison\n- Coulis tomates\n- Mozzarella\n- Basilic\n- Huile d'olive", "La reine des pizzas tricolore.", "ÉTAPE 1 :\nPréparer la pâte.\n\nÉTAPE 2 :\nGarnir et cuire 15-20 min à 230°C."));
        ProductList403403.add(new Produit("PIZZA FARCIE PEPPERONI", 5.0, R.mipmap.pizza10, "45 min", "- Pâte double couche\n- Saucisse\n- Pepperoni\n- Mozzarella\n- Cheddar", "Double couche farcie généreuse.", "ÉTAPE 1 :\nPréparer la pâte.\n\nÉTAPE 2 :\nFarcir et cuire 40 min."));
    }

    // 403f2e has overridden the create method to add a new pizza to the list
    @Override
    public Produit create(Produit p) {
        ProductList403403.add(p);
        return p;
    }

    // 403f2e has overridden the update method to replace an existing pizza in the list
    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < ProductList403403.size(); i++) {
            if (ProductList403403.get(i).getId() == p.getId()) {
                ProductList403403.set(i, p);
                return p;
            }
        }
        return null;
    }

    // 403f2e has overridden the delete method to remove a pizza from the list by its ID
    @Override
    public boolean delete(long id) {
        return ProductList403403.removeIf(x -> x.getId() == id);
    }

    // 403f2e has overridden the findById method to search for a pizza by its ID
    @Override
    public Produit findById(long id) {
        for (Produit p : ProductList403403) if (p.getId() == id) return p;
        return null;
    }

    // 403f2e has overridden the findAll method to return all pizzas in the list
    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(ProductList403403);
    }
}
