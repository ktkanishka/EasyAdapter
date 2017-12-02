package ru.surfstudio.easyadapter.recycler.holder;


import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(ViewGroup parent, @LayoutRes int layoutRes) {
        super(LayoutInflater.from(parent.getContext()).inflate(layoutRes, parent, false));
    }

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public boolean animateInsert(){
        return false;
    }

    public boolean animateChange(){
        return false;
    }

    public boolean animateRemove(){
        return false;
    }
}
