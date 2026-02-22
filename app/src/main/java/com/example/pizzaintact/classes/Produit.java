package com.example.pizzaintact.classes;

// 403f2e has defined the Produit class to represent a pizza product
public class Produit {
    // 403f2e has declared a static variable for auto-incrementing IDs
    private static long AUTO_ID = 1;

    // 403f2e has declared the id field for the product
    private long id;
    // 403f2e has declared the nom field for the product name
    private String nom;
    // 403f2e has declared the prix field for the product price
    private double prix;
    // 403f2e has declared the imageRes field for the image resource ID
    private int imageRes;
    // 403f2e has declared the duree field for the preparation time
    private String duree;
    // 403f2e has declared the ingredients field for the product ingredients
    private String ingredients;
    // 403f2e has declared the description field for the product description
    private String description;
    // 403f2e has declared the etapes field for the preparation steps
    private String etapes;

    // 403f2e has implemented a no-argument constructor that assigns a unique ID
    public Produit() {
        this.id = AUTO_ID++;
    }

    // 403f2e has implemented a full constructor to initialize all product fields
    public Produit(String nom, double prix, int imageRes, String duree,
                   String ingredients, String description, String etapes) {
        this.id = AUTO_ID++;
        this.nom = nom;
        this.prix = prix;
        this.imageRes = imageRes;
        this.duree = duree;
        this.ingredients = ingredients;
        this.description = description;
        this.etapes = etapes;
    }

    // 403f2e has implemented the getId method to return the product ID
    public long getId() { return id; }
    // 403f2e has implemented the getNom method to return the product name
    public String getNom() { return nom; }
    // 403f2e has implemented the setNom method to update the product name
    public void setNom(String nom) { this.nom = nom; }
    // 403f2e has implemented the getPrix method to return the product price
    public double getPrix() { return prix; }
    // 403f2e has implemented the setPrix method to update the product price
    public void setPrix(double prix) { this.prix = prix; }
    // 403f2e has implemented the getImageRes method to return the image resource ID
    public int getImageRes() { return imageRes; }
    // 403f2e has implemented the setImageRes method to update the image resource ID
    public void setImageRes(int imageRes) { this.imageRes = imageRes; }
    // 403f2e has implemented the getDuree method to return the preparation time
    public String getDuree() { return duree; }
    // 403f2e has implemented the setDuree method to update the preparation time
    public void setDuree(String duree) { this.duree = duree; }
    // 403f2e has implemented the getIngredients method to return the ingredients
    public String getIngredients() { return ingredients; }
    // 403f2e has implemented the setIngredients method to update the ingredients
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
    // 403f2e has implemented the getDescription method to return the description
    public String getDescription() { return description; }
    // 403f2e has implemented the setDescription method to update the description
    public void setDescription(String description) { this.description = description; }
    // 403f2e has implemented the getEtapes method to return the preparation steps
    public String getEtapes() { return etapes; }
    // 403f2e has implemented the setEtapes method to update the preparation steps
    public void setEtapes(String etapes) { this.etapes = etapes; }

    // 403f2e has overridden the toString method to provide a string representation of the product
    @Override
    public String toString() {
        return nom + " - " + prix + " €";
    }
}
