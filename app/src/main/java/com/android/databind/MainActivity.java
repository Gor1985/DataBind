package com.android.databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  //private TextView titleTextView;
  //private TextView AuthorTextView;

    private MainActivityButtonsHandler mainActivityButtonsHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        //titleTextView=findViewById (R.id.TitleTextView);
       // AuthorTextView=findViewById (R.id.autorTextView);

       // titleTextView.setText (getCurrentBook ().getTitle ());
      //  AuthorTextView.setText (getCurrentBook ().getAuthor ());
        com.android.databind.databinding.ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView (this, R.layout.activity_main);
        // отсылка к нашей активти и вью которое мы присоедимняем
        mainActivityButtonsHandler=new MainActivityButtonsHandler (this);
        // иницализируем переменную класа которого мы создали для обработчика кнопок
        activityMainBinding.setButtonHandler (mainActivityButtonsHandler);
// вкладываем ее в управление активити майн биндинг(вкладываем в сеттер переменную)
        activityMainBinding.setMook (getCurrentBook ());
        // тут мы через биндинг управлем разметкой и вставляем в него метод основного класса
    }



    private Book getCurrentBook(){
Book book=new Book (  );
book.setTitle ("Hamlet");
book.setAuthor ("Shecspir" );
return book;
    }

    public void onOkClicked(View view) {
        Toast.makeText (this, "Успешно", Toast.LENGTH_SHORT).show ( );
    }

    public void onCanselClicked(View view)
    {Toast.makeText (this, "неуспешно", Toast.LENGTH_SHORT).show ( );

    }
    public class MainActivityButtonsHandler{// создаем класс для управления обработчиками событий
        Context context;// через контекст будем передавать значения
        public MainActivityButtonsHandler(Context context) {
            this.context = context;
        }

        public void onOkClicked(View view) {
            Toast.makeText (context, "Успешно", Toast.LENGTH_SHORT).show ( );
            startActivity (new Intent ( MainActivity.this,ActivityOk.class ));
        }

        public void onCanselClicked(View view)
        {Toast.makeText (context, "неуспешно", Toast.LENGTH_SHORT).show ( );

            startActivity (new Intent ( MainActivity.this,TwoWeyActivity.class));

        }

    }
}