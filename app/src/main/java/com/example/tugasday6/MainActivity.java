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
        namemember.add(new NameMember("Gita", "6th Generation", "Jakarta", R.drawable.gita,"Diam bukan berarti tidak memperhatikanmu, aku Gita!","Gita Sekar Andarini",R.drawable.gita2, "30 June 2001", "Jakarta", "O", "Reading, Playing with cats"));
        namemember.add(new NameMember("Eli", "7th Generation", "Bandung", R.drawable.eli,"Pang! Pang! Si gadis penuh kejutan, penyebar virus kebahagiaan. Halo, aku Eli.","Helisma Mauludzunia Putri Kurnia",R.drawable.eli2, "15 June 2000", "Bandung", "B", "Reading, Coloring"));
        namemember.add(new NameMember("Zee", "7th Generation", "Jakarta", R.drawable.zee,"Si gadis tomboy yang semangatnya meletup-letup. Halo, aku Zee.","Azizi Shafa Asadel",R.drawable.zee2, "16 May 2004", "Jakarta", "B", "Social Media Activities, Playing Mobile Games"));
        namemember.add(new NameMember("Olla", "7th Generation", "Jakarta", R.drawable.olla,"Dengan keajaibanku, aku akan membuat kalian selalu tertawa. Hallo, aku Olla si mechanic girl!","Febriola Sinambela",R.drawable.olla2, "26 Februari 2005", "Jakarta", "B", "Dance"));
        namemember.add(new NameMember("Jessi", "7th Generation", "Jakarta", R.drawable.jessi,"Suka menari dan akan berusaha menjadi sumber energimu. Aku Jessi","Jessica Rich Chandra",R.drawable.jessi2, "23 September 2005", "Jakarta", "B", "Dance, modelling, ,Make up"));
        namemember.add(new NameMember("Christy", "7th Generation", "Jakarta", R.drawable.christy,"Peduli Dan Berbaik Hati Siapakah dia? Chris...(ty).","Angelina Christy",R.drawable.christy2, "5 December 2005", "Jakarta", "O", "Dancing"));
        namemember.add(new NameMember("Freya", "7th Generation", "Tangerang", R.drawable.freya,"Gadis koleris yang suka berimajinasi, terangi harimu dengan senyuman karamelku. Halo, aku Freya!!","Freyanashifa Jayawardana",R.drawable.freyana2, "13 February 2006", "Tanggerang", "B", "Dance, Singing, Reading Novel"));
        namemember.add(new NameMember("Muthe", "7th Generation", "Jakarta", R.drawable.muthe,"Dengan kelincahanku, aku akan menari setiap hari! Panggil aku Mu Mu Mu… Muthe!","Mutiara Azzahra Umandana",R.drawable.muthe2, "12 January 2004", "Jakarta", "B", "Dancing, Sewing"));
        namemember.add(new NameMember("Fiony", "8th Generation", "Jakarta", R.drawable.fiony,"Seperti simfoni yang menenangkan hati. Hai aku Fiony!","Fiony Alveria Tantri",R.drawable.fiony2, "4 February 2002", "Jakarta", "O", "Dance, Drawing, Listening Music"));
        namemember.add(new NameMember("Oniel", "8th Generation", "Tanggerang", R.drawable.oniel,"Seperti teka-teki, kalian akan selalu penasaran denganku! Aku Oniel!","Cornellia Vanisa",R.drawable.oniel2, "26 July 2002", "Tanggerang", "B", "Playing the guitar / ukulele, Listening music, Lettering"));
        namemember.add(new NameMember("Lulu", "8th Generation", "Serang", R.drawable.lulu,"Seperti kerang ajaib yang indah, suara semangatku akan mengiringi hidupmu. Halo aku Lulu","Lulu Azkiya Salsabila",R.drawable.lulu2, "23 october 2002", "Serang", "B", "Dance, Playing the piano, Cooking"));
        namemember.add(new NameMember("Flora", "8th Generation", "Tanggerang", R.drawable.flora,"Ada yang mau ikut aku??!! Ayo ikut ke dunia Flora! Simsalabin... akan kubuat kalian menjadi berbunga-bunga! Halo aku Flora!!","Flora Syafiqa Riyadi",R.drawable.flora2, "4 April 2005", "Tanggerang", "B", "Lettering, Singging"));
        namemember.add(new NameMember("Adel", "8th Generation", "Jakarta", R.drawable.adel,"Bagai kucing yang kalem, tapi selalu memikat hati kamu, hai aku Adel!","Reva Fidela Adel Panjoro",R.drawable.adel2, "14 July 2006", "Jakarta", "B", "Travelling, Drawing"));
        namemember.add(new NameMember("Indah", "9th Generation", "Jambi", R.drawable.indah,"Tak banyak bicara bercerita lewat tulisan! Halo aku Indah!","Indah Cahya Nabilla",R.drawable.indah2, "20 March 2001", "Jambi", "A", "Cooking, Traveling, Watching"));
        namemember.add(new NameMember("Marsha", "9th Generation", "Jakarta", R.drawable.marsha,"Seperti pizza yang selalu dinanti-nantikan semua orang, selalu nantikan aku yah! Halo aku Marsha.","Marsha Lenathea",R.drawable.marsha2, "9 Januari 2006", "Jakarta", "B", "Drawing, Listening Music, Gaming"));
        namemember.add(new NameMember("Kathrina", "9th Generation", "Bekasi", R.drawable.kathrina,"Never miss a chance to be a star! Halo aku Kathrina!","Khatrina Irene Putri Indarto",R.drawable.kathrina2, "26 July 2006", "Bekasi", "B", "Drawing, Dance, Listening Music"));
        namemember.add(new NameMember("Lyn", "10th Generation", "Jakarta", R.drawable.lyn,"Seperti ombak laut yang tenang, tiba-tiba aku akan menyapumu dengan banyak cinta","Jesslyn Elly",R.drawable.lyn2, "13 September 2001", "Jakarta", "B", "Reading, Playing Music, Travelling"));
        namemember.add(new NameMember("Lia", "10th Generation", "Jakarta", R.drawable.lia,"Si Social Butterfly Yang Energik Dan Periang","Aurellia",R.drawable.lia2, "29 October 2002", "Kebumen", "B", "Dance, Listening to Music"));
        namemember.add(new NameMember("Indira", "10th Generation", "Bandung", R.drawable.indira,"Watashi no kokoro, unlock! Aku akan menemani hari-harimu dengan sepenuh hati. Halo, aku Indira!","Indira Putri Seruni",R.drawable.indira2, "26 April 2004", "Bandung", "A", "Dance"));
        namemember.add(new NameMember("Amanda", "10th Generation", "Malang", R.drawable.manda,"Melaju cepat bagai motor 1000cc! Aku si gadis penyuka motor.","Amanda Puspita Sukma Mulyadewi",R.drawable.manda2, "17 December 2004", "Malang", "O", "Dance, Automotive"));
        namemember.add(new NameMember("Callie", "10th Generation", "Jakarta", R.drawable.callie,"Si beruang madu, penyuka madu!","Callista Alifia Wardhana",R.drawable.callie2, "8 Agustus 2005", "Jakarta", "O", "Dance, Listening To Music"));
        namemember.add(new NameMember("Ella", "10th Generation", "Jakarta", R.drawable.ella,"Ohayo! Konnichiwa! Oyasumi! Aku ingin ada di setiap waktumu","Gabriela Abigail Mewengkang",R.drawable.ella2, "7 August 2006", "Jakarta", "B+", "Dance, Listening To Music, Drawing"));
        namemember.add(new NameMember("Raisha", "10th Generation", "Jakarta", R.drawable.raisha,"Kalau sakura itu kembang, Aku itu kembanggaanmu!","Raisha syifa Wardhana",R.drawable.raisha2, "11 November 2007", "Jakarta", "AB+", "Dance, Sing, Sport"));
        namemember.add(new NameMember("Greesel", "11th Generation", "Bogor", R.drawable.greesel,"Pandangan mataku akan menyinari hatimu bagaikan kunang-kunang di malam hari. Halo, aku Greesel!","Gresella Adhalia", R.drawable.greesel2, " 10 Januari 2006", "Bogor", "O", "Acting, Watching movies, singing, reading manga"));
        namemember.add(new NameMember("Gracie", "11th Generation", "Tanggerang", R.drawable.gracie,"Manis seperti gulali, imut seperti kelinci! Halo, aku Gracie!","Grace Octaviani",R.drawable.gracie2, "18 october 2007", "Tanggerang", "B", "Dance, Fashion Design, Drawing"));
    }
}
