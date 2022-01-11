package com.example.laundrylicious;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.RiwayatHolder> {

    private ArrayList<SetterGetter> listdata;
    private Context context;

    public RiwayatAdapter(Context context, ArrayList<SetterGetter> listdata) {
        this.listdata = listdata;
        this.context = context;

    }

    @NonNull
    @Override
    public RiwayatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        RiwayatHolder holder = new RiwayatHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayatHolder holder, int position) {

        final SetterGetter getData = listdata.get(position);
        Integer orderke = getData.getOrderke();
        String status = getData.getStatus();
        Integer total = getData.getTotal();

        holder.orderkeMenu.setText(String.valueOf(orderke));
        holder.statusMenu.setText(status);
        holder.totalMenu.setText(String.valueOf(total));

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class RiwayatHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView orderkeMenu;
        TextView statusMenu;
        TextView totalMenu;
        CardView cardItemRiwayat;

        public RiwayatHolder(@NonNull View itemView) {
            super(itemView);
            orderkeMenu = itemView.findViewById(R.id.textOrderKe);
            statusMenu = itemView.findViewById(R.id.textStatus);
            totalMenu = itemView.findViewById(R.id.textTotal);
            cardItemRiwayat = itemView.findViewById(R.id.cardItemRiwayat);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View view) {
            if(listener != null){
                listener.onClick();
            }
        }
    }
//    Click Listener
    OnRiwayatHolderCLickListener listener = null;

    public interface OnRiwayatHolderCLickListener{
        void onClick();
    }

    public void setListener(OnRiwayatHolderCLickListener listener) {
        this.listener = listener;
    }

}
