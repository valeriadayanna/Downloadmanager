package com.example.downloadmanager;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class DocumentoAdapter  extends RecyclerView.Adapter<DocumentoAdapter.ViewHolder>{
    private List<Documentos> listaDocumentos;
    private LayoutInflater lInflater;
    private Context context;

    public DocumentoAdapter(List<Documentos> listaDocumentos, Context context) {
        this.listaDocumentos = listaDocumentos;
        this.lInflater = LayoutInflater.from(context);
        this.context = context;
    }
    @Override
    public int getItemCount() {
        return listaDocumentos.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = lInflater.inflate(R.layout.documentos, null);
        RecyclerView.ViewHolder holder = new DocumentoAdapter.ViewHolder(view);
        return (ViewHolder) holder;
    }

    @Override
    public void onBindViewHolder(final DocumentoAdapter.ViewHolder holder, final int position) {
        //holder.setItem(items.get(position));
        //holder.
        holder.bindData(listaDocumentos.get(position));
    }

    public List<Documentos> listaDocumentos() {
        return listaDocumentos;
    }

    public void setListaEvaluador(List<Documentos> listaDocumentos) {
        this.listaDocumentos = listaDocumentos;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView lblID, lblTitulo, lblDocumento;
        Button btn;
        ViewHolder(View itemView) {
            super(itemView);
            lblID = itemView.findViewById(R.id.id);
            lblTitulo = itemView.findViewById(R.id.titulo);
            lblDocumento = itemView.findViewById(R.id.documento);
        }



        private void bindData(final Documentos documento) {
            //Glide.with(context).load(documento.getImgJpg()).error("https://evaladmin.uteq.edu.ec/adminimg/unknown.png").into(imageView);
            lblID.setText(documento.getId());
            lblTitulo.setText(documento.getTitulo());
            lblDocumento.setText(documento.getDocumento());
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Intent intent=new Intent(context, EvaluadosActivity.class);
                    Bundle bundle =new Bundle();
                    bundle.putSerializable("Evaluador", evaluador);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });
            btn.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Intent intent=new Intent(context, EvaluadosActivity.class);
                    Bundle bundle =new Bundle();
                    bundle.putSerializable("Evaluador", evaluador);
                    intent.putExtras(bundle);
                    context.startActivity(intent);
                }
            });*/
        }


    }

}

