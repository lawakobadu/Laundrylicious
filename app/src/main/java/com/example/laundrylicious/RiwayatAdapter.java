package com.example.laundrylicious;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.RiwayatHolder> {

    private ArrayList<SetterGetter> listdata;

    public RiwayatAdapter(ArrayList<SetterGetter> listdata) {
        this.listdata = listdata;
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
        String orderke = getData.getOrderke();
        String status = getData.getStatus();
        String total = getData.getTotal();

        holder.orderkeMenu.setText(orderke);
        holder.statusMenu.setText(status);
        holder.totalMenu.setText(total);

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class RiwayatHolder extends RecyclerView.ViewHolder {

        TextView orderkeMenu ;
        TextView statusMenu;
        TextView totalMenu;

        public RiwayatHolder(@NonNull View itemView) {
            super(itemView);
            orderkeMenu = itemView.findViewById(R.id.textOrderKe);
            statusMenu = itemView.findViewById(R.id.textStatus);
            totalMenu = itemView.findViewById(R.id.textTotal);

        }

    }
}
