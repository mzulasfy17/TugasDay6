package com.example.tugasday6;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class NameMember implements Parcelable {

    private String namaMember;
    private String generasi;
    private String asal;
    private int fotoMember;
    private String Jiko;
    private String fullname;
    private int foto;
    private String birthday;
    private String birthplace;
    private String blood;
    private String hobby;


    public NameMember(String namaMember, String generasi, String asal, int fotoMember, String Jiko, String fullname, int foto, String birthday, String birthplace, String blood, String hobby) {
        this.namaMember = namaMember;
        this.generasi = generasi;
        this.asal = asal;
        this.fotoMember = fotoMember;
        this.foto = foto;
        this.Jiko = Jiko;
        this.fullname = fullname;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.blood = blood;
        this.hobby = hobby;
    }

    protected NameMember(Parcel in) {
        namaMember = in.readString();
        generasi = in.readString();
        asal = in.readString();
        fotoMember = in.readInt();
        Jiko = in.readString();
        fullname = in.readString();
        foto = in.readInt();
        birthday = in.readString();
        birthplace = in.readString();
        blood = in.readString();
        hobby = in.readString();

    }

    public static final Creator<NameMember> CREATOR = new Creator<NameMember>() {
        @Override
        public NameMember createFromParcel(Parcel in) {
            return new NameMember(in);
        }

        @Override
        public NameMember[] newArray(int size) {
            return new NameMember[size];
        }
    };

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public String getGenerasi() {
        return generasi;
    }

    public void setGenerasi(String generasi) {
        this.generasi = generasi;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getFotoMember() {
        return fotoMember;
    }

    public void setFotoMember(int fotoMember) {
        this.fotoMember = fotoMember;
    }

    public String getJiko() {
        return Jiko;
    }

    public void setJiko(String jiko) {
        Jiko = jiko;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(namaMember);
        dest.writeString(generasi);
        dest.writeString(asal);
        dest.writeInt(fotoMember);
        dest.writeString(Jiko);
        dest.writeString(fullname);
        dest.writeInt(foto);
        dest.writeString(birthday);
        dest.writeString(birthplace);
        dest.writeString(blood);
        dest.writeString(hobby);
    }
}
