package com.example.laundrylicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class riwayat_transaksi extends AppCompatActivity implements RiwayatAdapter.OnRiwayatHolderCLickListener {
    RecyclerView recyclerView;

    ArrayList<SetterGetter> datamenu;
    LinearLayoutManager linearLayoutManager;
    RiwayatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat_transaksi);

        recyclerView        =   findViewById(R.id.rv_menu);

        addData();
        linearLayoutManager   =   new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter             =   new RiwayatAdapter(datamenu);
        recyclerView.setAdapter(adapter);
        adapter.setListener(this);

    }

    public void addData(){
        datamenu            =   new ArrayList<>();
        datamenu.add(new SetterGetter(
                "1",
                "selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "2",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "3",
                "selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "4",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "5",
                "selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
        datamenu.add(new SetterGetter(
                "6",
                "belum selesai",
                "100.000"));
    }

    public void kembali(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    @Override
    public void onClick() {
        Intent detailRiwayatTransaksi = new Intent(this, dashboard.class);
        startActivity(detailRiwayatTransaksi);
//        Toast.makeText(this, "berhasil", Toast.LENGTH_SHORT).show();
    }
}

