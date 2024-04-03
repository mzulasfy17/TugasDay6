//package com.example.tugasday6;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import android.os.Bundle;
//import android.os.Parcel;
//import android.os.Parcelable;
//
//public class Detail extends AppCompatActivity implements Parcelable {
//
//    private String Shortname;
//    private String generation;
//    private String jiko;
//    private String fullname;
//    private String birthday;
//    private String birthplace;
//    private String blood;
//    private String hobby;
//    private String foto;
//
//    public String getShortname() {
//        return Shortname;
//    }
//
//    public void setShortname(String shortname) {
//        Shortname = shortname;
//    }
//
//    public String getGeneration() {
//        return generation;
//    }
//
//    public void setGeneration(String generation) {
//        this.generation = generation;
//    }
//
//    public String getJiko() {
//        return jiko;
//    }
//
//    public void setJiko(String jiko) {
//        this.jiko = jiko;
//    }
//
//    public String getFullname() {
//        return fullname;
//    }
//
//    public void setFullname(String fullname) {
//        this.fullname = fullname;
//    }
//
//    public String getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
//
//    public String getBirthplace() {
//        return birthplace;
//    }
//
//    public void setBirthplace(String birthplace) {
//        this.birthplace = birthplace;
//    }
//
//    public String getBlood() {
//        return blood;
//    }
//
//    public void setBlood(String blood) {
//        this.blood = blood;
//    }
//
//    public String getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
//
//    public String getFoto() {
//        return foto;
//    }
//
//    public void setFoto(String foto) {
//        this.foto = foto;
//    }
//
//    protected Detail(Parcel in) {
//        Shortname = in.readString();
//        generation = in.readString();
//        jiko = in.readString();
//        fullname = in.readString();
//        birthday = in.readString();
//        birthplace = in.readString();
//        blood = in.readString();
//        hobby = in.readString();
//        foto = in.readString();
//
//    }
//
//    public static final Creator<Detail> CREATOR = new Creator<Detail>() {
//        @Override
//        public Detail createFromParcel(Parcel in) {
//            return new Detail(in);
//        }
//
//        @Override
//        public Detail[] newArray(int size) {
//            return new Detail[size];
//        }
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail2);
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel( Parcel dest, int flags) {
//        dest.writeString(Shortname);
//        dest.writeString(generation);
//        dest.writeString(jiko);
//        dest.writeString(fullname);
//        dest.writeString(birthday);
//        dest.writeString(birthplace);
//        dest.writeString(blood);
//        dest.writeString(hobby);
//        dest.writeString(foto);
//    }
//}