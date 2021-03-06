package com.example.course_work;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



    public class Conferences extends AppCompatActivity {

        LinearLayoutManager mLinearLayoutManager;
        RecyclerView mRecyclerView;
        FirebaseDatabase mFirebaseDatabase;
        DatabaseReference mDatabaseReference;
        FirebaseRecyclerAdapter<Model,ViewHolder> firebaseRecyclerAdapter;
        FirebaseRecyclerOptions<Model> options;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_conferences);

            mLinearLayoutManager = new LinearLayoutManager(this);
            mLinearLayoutManager.setReverseLayout(true);
            mLinearLayoutManager.setStackFromEnd(true);

            mRecyclerView = findViewById(R.id.recyclerView);

            mFirebaseDatabase = FirebaseDatabase.getInstance();

            mDatabaseReference = mFirebaseDatabase.getReference("Data");

            showData();
        }

        private void showData() {

            options = new FirebaseRecyclerOptions.Builder<Model>().setQuery(mDatabaseReference,Model.class).build();

            firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Model, ViewHolder>(options) {
                @Override
                protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Model model) {

                    holder.setDetails(getApplicationContext(),model.getImage(),model.getTitle());

                }

                @NonNull
                @Override
                public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

                    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layoutconferense,parent,false);

                    ViewHolder viewHolder = new ViewHolder(itemView);
                    viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {

                            Toast.makeText(Conferences.this, "hello", Toast.LENGTH_SHORT).show();

                        }

                        @Override
                        public void onItemLongClick(View view, int position) {

                            Toast.makeText(Conferences.this, "Long Click", Toast.LENGTH_SHORT).show();

                        }
                    });


                    return viewHolder;
                }
            };

            mRecyclerView.setLayoutManager(mLinearLayoutManager);
            firebaseRecyclerAdapter.startListening();
            mRecyclerView.setAdapter(firebaseRecyclerAdapter);
        }

        protected void onStart(){
            super.onStart();

            if (firebaseRecyclerAdapter !=null)
            {

                firebaseRecyclerAdapter.startListening();
            }

        }

    }