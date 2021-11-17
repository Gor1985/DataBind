package com.android.databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import com.android.databind.databinding.ActivityOkBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class ActivityOk extends AppCompatActivity {

        private ActivityOkBinding activityOkBinding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ok);
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            FloatingActionButton fab = findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });

            activityOkBinding = DataBindingUtil.setContentView(this,
                    R.layout.activity_ok);// присваиваем переменной класса наш лайот
            activityOkBinding.setBook(getCurrentBook());// присваиваем классу биндинг управление классом
        }


    private com.android.databind.Book getCurrentBook() {

            Book book = new Book();
            book.setTitle("Hamlet");
            book.setAuthor("Shakespeare");
            return book;

        }

    }