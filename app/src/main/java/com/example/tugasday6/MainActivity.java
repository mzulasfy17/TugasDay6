package com.example.tugasday6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Adapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<NameMember> namemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recyclerview);
        adapter = new Adapter(namemember, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        NameMember clickedMember = namemember.get(position);

        Intent detailIntent = new Intent(MainActivity.this, DetailActivity.class);
        detailIntent.putExtra("name", clickedMember.getNamaMember());
        detailIntent.putExtra("generation", clickedMember.getGenerasi());
        detailIntent.putExtra("location", clickedMember.getAsal());
        detailIntent.putExtra("image", clickedMember.getFotoMember());
        detailIntent.putExtra(DetailActivity.KEY_DATA,clickedMember);

        startActivity(detailIntent);
    }

    private void getData() {
        namemember = new ArrayList<>();
        namemember.add(new NameMember("Shani", "3th Generation", "Yogyakarta", R.drawable.shani,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Shania Indira Natio",R.drawable.shani3, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Gracia", "3th Generation", "Jakarta", R.drawable.gracia,"Senyumku akan terekam jelas dalam ingatanmu seperti foto dengan sejuta warna! Namaku Gracia, always smile!","Shania Gracia",R.drawable.gracia2, "31 August 1999", "Jakarta", "A", "Traveling, Photoshoot, Playing ukulele" ));
        namemember.add(new NameMember("Feni", "3th Generation", "Cianjur", R.drawable.feni,"Matahari yang indah, yang akan memberikan kehangatan di setiap harinya. Panggil aku Feni.","Feni Fitriyanti",R.drawable.feni2, "16 January 1999", "Cianjur", "O", "Watching movies, Cooking, Dancing, Fashion"));
        namemember.add(new NameMember("Gita", "6th Generation", "Jakarta", R.drawable.gita,"Diam bukan berarti tidak memperhatikanmu, aku Gita!","Gita Sekar Andarini",R.drawable.gita2, "5 october 1998", "Kebumen", "B", "Reading, Playing with cats"));
        namemember.add(new NameMember("Eli", "7th Generation", "Bandung", R.drawable.eli,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Helisma Mauludzunia Putri Kurnia",R.drawable.eli2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Zee", "7th Generation", "Jakarta", R.drawable.zee,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Azizi Shafa Asadel",R.drawable.zee2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Olla", "7th Generation", "Jakarta", R.drawable.olla,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Febriola Sinambela",R.drawable.olla2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Jessi", "7th Generation", "Jakarta", R.drawable.jessi,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Jessica Rich Chandra",R.drawable.jessi2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Christy", "7th Generation", "Jakarta", R.drawable.christy,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Angelina Christy",R.drawable.christy2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Freya", "7th Generation", "Tangerang", R.drawable.freya,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Freyanashifa Jayawardana",R.drawable.freyana2, "13 February 2006", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Muthe", "7th Generation", "Jakarta", R.drawable.muthe,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Mutiara Azzahra Umandana",R.drawable.muthe2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Fiony", "8th Generation", "Jakarta", R.drawable.fiony,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Fiony Alveria Tantri",R.drawable.fiony2, "4 February 2002", "Kebumen", "O", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Oniel", "8th Generation", "Tanggerang", R.drawable.oniel,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Cornellia Vanisa",R.drawable.oniel2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Lulu", "8th Generation", "Serang", R.drawable.lulu,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Lulu Azkiya Salsabila",R.drawable.lulu2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Flora", "8th Generation", "Tanggerang", R.drawable.flora,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Flora Syafiqa Riyadi",R.drawable.flora2, "4 April 2005", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Adel", "8th Generation", "Jakarta", R.drawable.adel,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Reva Fidela Adel Panjoro",R.drawable.adel2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Indah", "9th Generation", "Jambi", R.drawable.indah,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Indah Cahya Nabilla",R.drawable.indah2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Marsha", "9th Generation", "Jakarta", R.drawable.marsha,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Marsha Lenathea",R.drawable.marsha2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Kathrina", "9th Generation", "Bekasi", R.drawable.kathrina,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Khatrina Irene Putri Indarto",R.drawable.kathrina2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Lyn", "10th Generation", "Jakarta", R.drawable.lyn,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Jesslyn Elly",R.drawable.lyn2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Lia", "10th Generation", "Jakarta", R.drawable.lia,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Aurellia",R.drawable.lia2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Indira", "10th Generation", "Bandung", R.drawable.indira,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Indira Putri Seruni",R.drawable.indira2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Amanda", "10th Generation", "Malang", R.drawable.manda,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Amanda Puspita Sukma Mulyadewi",R.drawable.manda2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Callie", "10th Generation", "Jakarta", R.drawable.callie,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Callista Alifia Wardhana",R.drawable.callie2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Ella", "10th Generation", "Jakarta", R.drawable.ella,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Gabriela Abigail Mewengkang",R.drawable.ella2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Raisha", "10th Generation", "Jakarta", R.drawable.raisha,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Raisha syifa Wardhana",R.drawable.raisha2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Greesel", "11th Generation", "Bogor", R.drawable.greesel,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Gresella Adhalia",R.drawable.greesel2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
        namemember.add(new NameMember("Gracie", "11th Generation", "Tanggerang", R.drawable.gracie,"Semanis Coklat Selembut Sutra, Hai Aku Shani!","Grace Octaviani",R.drawable.gracie2, "5 october 1998", "Kebumen", "B", "Swimming, Listening to Music, Strolling"));
    }
}
