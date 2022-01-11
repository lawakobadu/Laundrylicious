package com.example.laundrylicious;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.laundrylicious.Service.ApiClient;
import com.example.laundrylicious.Service.GetService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class riwayat_transaksi extends AppCompatActivity implements RiwayatAdapter.OnRiwayatHolderCLickListener {
    RecyclerView recyclerView;
    ProgressDialog progressDoalog;
    ArrayList<SetterGetter> datamenu;
    LinearLayoutManager linearLayoutManager;
    RiwayatAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat_transaksi);

        progressDoalog = new ProgressDialog(riwayat_transaksi.this);
        progressDoalog.setMessage("Loading....");
        progressDoalog.show();


        /*Create handle for the RetrofitInstance interface*/
        GetService service = ApiClient.getRetrofitInstance().create(GetService.class);
        Call<ArrayList<SetterGetter>> call = service.getOrderKe();
        call.enqueue(new Callback<ArrayList<SetterGetter>>() {
            @Override
            public void onResponse(Call<ArrayList<SetterGetter>> call, Response<ArrayList<SetterGetter>> response) {
                progressDoalog.dismiss();
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<ArrayList<SetterGetter>> call, Throwable t) {
                progressDoalog.dismiss();
                Toast.makeText(riwayat_transaksi.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });

//        recyclerView        =   findViewById(R.id.rv_menu);
//        linearLayoutManager   =   new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        adapter             =   new RiwayatAdapter(datamenu);
//        recyclerView.setAdapter(adapter);
//        adapter.setListener(this);

    }

    private void generateDataList(ArrayList<SetterGetter> datamenu) {
        recyclerView = findViewById(R.id.rv_menu);
        adapter = new RiwayatAdapter(this, datamenu);
        linearLayoutManager = new LinearLayoutManager(riwayat_transaksi.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        adapter.setListener(this);
    }

    public void kembali(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    @Override
    public void onClick() {
        Intent detailRiwayatTransaksi = new Intent(this, detail_riwayat_transaksi.class);
        startActivity(detailRiwayatTransaksi);
//        Toast.makeText(this, "berhasil", Toast.LENGTH_SHORT).show();
    }
}
