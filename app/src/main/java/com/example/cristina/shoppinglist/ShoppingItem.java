package com.example.cristina.shoppinglist;

/**
 * Created by Cristina on 23/10/2017.
 */

public class ShoppingItem {
    private String text;
    private Boolean checked;

    public ShoppingItem(String text) {
        this.text = text;
        this.checked = false; // potser no necessitem
    }

    public ShoppingItem(String text, Boolean checked) {
        this.text = text;
        this.checked = checked;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public void toggleChecked() {
        this.checked=!this.checked;
    }
}
