package com.ines.bissmillah;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Ines on 06/01/2019.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;

    public ViewHolder(View itemView) {
        super(itemView);
        mView = itemView;
    }

    //set detail recycler view row
    public void setDetails(Context ctx, String title, String description, String image)
    {
        TextView mTitleTv = (TextView) mView.findViewById(R.id.rTitleTv);
        TextView mDetailTv = (TextView) mView.findViewById(R.id.rDescriptionTv);
        ImageView mImageTv = (ImageView) mView.findViewById(R.id.rImageView);

        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageTv);
    }
}
