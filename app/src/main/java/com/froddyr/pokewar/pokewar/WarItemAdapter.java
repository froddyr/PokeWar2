package com.froddyr.pokewar.pokewar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Frode Dyrseth on 11.08.2014.
 */
public class WarItemAdapter extends ArrayAdapter<WarItem> {
    public WarItemAdapter(Context context, List<WarItem> values) {
        super(context, R.layout.war_item, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View theView = theInflater.inflate(R.layout.war_item, parent, false);

        String oponentName = ((WarItem) getItem(position)).getOponentName();
        int oponentTimeRemaining = ((WarItem) getItem(position)).getOponentTimeRemaining();
        int myTimeRemaining = ((WarItem) getItem(position)).getMyTimeRemaining();

        TextView oponentNameView = (TextView) theView.findViewById(R.id.oponent_name);
        TextView oponentTimeRemainingView = (TextView) theView.findViewById(R.id.oponent_time_remaining);
        TextView myTimeRemainingView = (TextView) theView.findViewById(R.id.my_time_remaining);

        oponentNameView.setText(oponentName);
        oponentTimeRemainingView.setText(oponentTimeRemaining + "");
        myTimeRemainingView.setText(myTimeRemaining + "");

        return theView;
    }
}
