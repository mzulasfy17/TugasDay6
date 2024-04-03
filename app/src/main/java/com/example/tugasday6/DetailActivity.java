package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.jar.Attributes;

public class DetailActivity extends AppCompatActivity {

    private ImageView Foto;
    private TextView shortnameTextView, generationTextView, jikoTextView, fullnameTextView, birthdayTextView, birthplaceTextView, bloodTextView, hobbyTextView;
    private Button btnshare;


    public static final String KEY_DATA = "key_object";

//    DetailItem[] detailItems = new DetailItem[]{
//            new DetailItem("Shani", "3th Generation", "Semanis Coklat Selembut Sutra, Hai aku Shani!", "Shani Indira Natio", "5 october 1998", "Kebumen", "B", "Swimming, Listening to music, and Strolling", R.drawable.shani2),
//            new DetailItem("Gracia", "3th Generation", "Semanis Coklat Selembut Sutra, Hai aku Shani!", "Shania Gracia Harlan", "5 october 1998", "Jakarta", "B", "Swimming, Listening to music, and Strolling", R.drawable.gracia2),
//            // Add other DetailItem objects here
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Foto = findViewById(R.id.foto);
        shortnameTextView = findViewById(R.id.shortname);
        generationTextView = findViewById(R.id.Generation);
        jikoTextView = findViewById(R.id.Jiko);
        fullnameTextView = findViewById(R.id.fullname);
        birthdayTextView = findViewById(R.id.birthday);
        birthplaceTextView = findViewById(R.id.birthplace);
        bloodTextView = findViewById(R.id.blood);
        hobbyTextView = findViewById(R.id.hobby);
        btnshare = findViewById(R.id.share);

        // Mendapatkan data indeks dari intent
//        Intent intent = getIntent();
//        int index = intent.getIntExtra("index", 0); // Jika tidak ada indeks yang dilewatkan, gunakan indeks 0 sebagai default

        // Mendapatkan objek DetailItem dari array detailItems
        NameMember currentItem = getIntent().getParcelableExtra(KEY_DATA);

        // Set data ke tampilan
        Foto.setImageResource(currentItem.getFoto());
        shortnameTextView.setText(currentItem.getNamaMember());
        generationTextView.setText(currentItem.getGenerasi());
        jikoTextView.setText(currentItem.getJiko());
        fullnameTextView.setText(currentItem.getFullname());
        birthdayTextView.setText(currentItem.getBirthday());
        birthplaceTextView.setText(currentItem.getBirthplace());
        bloodTextView.setText(currentItem.getBlood());
        hobbyTextView.setText(currentItem.getHobby());

        btnshare.setOnClickListener(click -> {
            Uri imageUri = getImageUri(Foto);
            Intent intent1 = new Intent(Intent.ACTION_SEND);
            intent1.setType("text/plain");
            String shareMessage ="Nama : " + currentItem.getNamaMember() + "\n Generasi : " + currentItem.getGenerasi() + "\n Jikoshoukai : " + currentItem.getJiko() + "\n fullname : " + currentItem.getFullname() + "\n birthday : " + currentItem.getBirthday() + "\n birthplace : " + currentItem.getBirthplace() + "\n Blood Type : " + currentItem.getBlood() + "\n Hobby : " + currentItem.getHobby();
            intent1.putExtra(Intent.EXTRA_TEXT, shareMessage);
            intent1.putExtra(Intent.EXTRA_STREAM, imageUri);
            intent1.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            startActivity(Intent.createChooser(intent1, "Bagikan melalui"));
        });
    }
    private Uri getImageUri(ImageView imageView) {
        Uri imageUri;
        try {
            // Mendapatkan URI gambar dari ImageView
            BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
            Bitmap bitmap = drawable.getBitmap();
            String path = MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, "Title", null);
            imageUri = Uri.parse(path);
        } catch (Exception e) {
            e.printStackTrace();
            imageUri = null;
        }
        return imageUri;
    }
}
