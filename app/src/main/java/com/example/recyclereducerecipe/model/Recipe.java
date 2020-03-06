package com.example.recyclereducerecipe.model;


import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class Recipe implements Parcelable{

    private String recipeName;
    private ArrayList<String> recipeIngredients;

    public Recipe(String recipeName, ArrayList<String> recipeIngredients) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
    }

    protected Recipe(Parcel in){
        recipeName = in.readString();
        recipeIngredients=in.readArrayList(String.class.getClassLoader());
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public ArrayList<String> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(ArrayList<String> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(recipeName);
        dest.writeList(recipeIngredients);

    }
}
