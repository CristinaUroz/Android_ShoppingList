package com.example.cristina.shoppinglist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Cristina on 23/10/2017.
 */

public class ShoppingListAdapter extends ArrayAdapter <ShoppingItem>{

    public ShoppingListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View result = (convertView);
        if (result==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            result = inflater.inflate(R.layout.shopping_item,null);
        }

        CheckBox Checkbox = result.findViewById(R.id.shopping_item);
        ShoppingItem item = getItem(position);
        Checkbox.setText(item.getText());
        Checkbox.setChecked(item.getChecked());
        return result;
    }
}
