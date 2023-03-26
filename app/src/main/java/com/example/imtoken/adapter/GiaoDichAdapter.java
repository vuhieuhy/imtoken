package com.example.imtoken.adapter;

import android.content.Context;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imtoken.R;
import com.example.imtoken.model.GiaoDich;
import com.example.imtoken.my_interface.IClickItemGdList;

import java.util.List;

public class GiaoDichAdapter extends RecyclerView.Adapter<GiaoDichAdapter.UserViewHolder> {

    private Context mContext;
    private List<GiaoDich> mListUser;
    private IClickItemGdList iClickItemGdList;

    public GiaoDichAdapter(Context mContext,IClickItemGdList list) {
        this.mContext = mContext;
        this.iClickItemGdList = list;
    }

    public void setData(List<GiaoDich> list){
        this.mListUser = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gd,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        final GiaoDich giaoDich = mListUser.get(position);
        if(giaoDich==null){
            return;
        }
        holder.imageViewGd.setImageResource(giaoDich.getImgGdId());
        holder.textViewTenGd.setText(giaoDich.getTenGiaoDich());
        holder.textViewNgayGd.setText(giaoDich.getDateGiaoDich());
        holder.textViewTienGd.setText(giaoDich.getTienGiaoDich());
        holder.layoutGd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iClickItemGdList.onClickItemGd(giaoDich);
            }
        });
    }


    @Override
    public int getItemCount() {
        if(mListUser != null){
            return mListUser.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout layoutGd;
        private ImageView imageViewGd;
        private TextView textViewTenGd;
        private TextView textViewNgayGd;
        private TextView textViewTienGd;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            layoutGd = itemView.findViewById(R.id.layoutGd);
            imageViewGd = itemView.findViewById(R.id.imv10);
            textViewTenGd = itemView.findViewById(R.id.txtTenGd);
            textViewNgayGd = itemView.findViewById(R.id.txtNgayGd);
            textViewTienGd = itemView.findViewById(R.id.txtTienGd);

        }
    }
}
