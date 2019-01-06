package com.ines.bissmillah;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private Context context;
    private List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_post, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bindPost(postList.get(i));
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPost;
        private TextView tvPostTitle;
        private TextView tvPostDesciption;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPost = (ImageView) itemView.findViewById(R.id.imgPost);
            tvPostTitle = (TextView) itemView.findViewById(R.id.tvPostTitle);
            tvPostDesciption = (TextView) itemView.findViewById(R.id.tvPostDescription);
        }

        public void bindPost(Post post) {
            /*TODO bind image using Picasso here*/
            tvPostTitle.setText(post.getTitle());
            tvPostDesciption.setText(post.getDescription());
        }
    }
}
