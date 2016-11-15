package edu.chapman.cpsc356.tvshows;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ryanburns on 11/14/16.
 */

public class ShowAdapter extends RecyclerView.Adapter<ShowViewHolder>
{
    private Context ctx;
    private List<String> showTitles;

    public ShowAdapter(Context ctx, List<String> titles)
    {
        this.ctx = ctx;
        this.showTitles = titles;
    }

    @Override
    public ShowViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(this.ctx);

        TextView v = (TextView) inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        // or View v

        return new ShowViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ShowViewHolder holder, int position)
    {
        holder.populate(this.showTitles.get(position));
    }

    @Override
    public int getItemCount()
    {
        return this.showTitles.size();
    }
}
