package edu.chapman.cpsc356.tvshows;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ryanburns on 11/14/16.
 */

public class ShowViewHolder extends RecyclerView.ViewHolder
{
    private TextView showTitleTextView;

    public ShowViewHolder(TextView itemView)
    {
        super(itemView);

        this.showTitleTextView = itemView;
        // or = (TextView) itemView
    }

    public void populate(String showTitle)
    {
        this.showTitleTextView.setText(showTitle);
    }
}
