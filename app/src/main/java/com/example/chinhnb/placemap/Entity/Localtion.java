package com.example.chinhnb.placemap.Entity;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by CHINHNB on 11/16/2016.
 */

public class Localtion {
    private int Id, AccountId,CountCheckIn;
    private boolean IsCheck;
    private String Name, Address, Email, Phone, Avatar,Code,RepresentActive;
    private Double Lag, Lng;

    public Localtion() {
    }

    public Localtion(int id,int accountId,Double lag,Double lng) {
        this.Id=id;
        this.AccountId=accountId;
        this.Lag=lag;
        this.Lng=lng;
    }

    public Localtion(int id,int accountId,boolean isCheck,String name, String address, String email, String phone, String avatar,Double lag,Double lng,String code,String representActive,int countCheckIn) {
        this.Id=id;
        this.AccountId=accountId;
        this.IsCheck=isCheck;
        this.Name = name;
        this.Address = address;
        this.Email = email;
        this.Phone = phone;
        this.Avatar = avatar;
        this.Lag=lag;
        this.Lng=lng;
        this.Code=code;
        this.RepresentActive=representActive;
        this.CountCheckIn=countCheckIn;
    }

    public Localtion NewInstance(JSONObject obj){
        Log.d("Localtion", "JSONObject: " + obj.toString());
        Localtion localtion=new Localtion();
        if(obj!=null){
            try {
                localtion.setId(obj.getInt("Id"));
                localtion.setIscheck(obj.getBoolean("IsCheck"));
                localtion.setName(obj.getString("Name"));
                localtion.setAddress(obj.getString("Address"));
                localtion.setEmail(obj.getString("Email"));
                localtion.setPhone(obj.getString("Phone"));
                localtion.setAvatar(obj.getString("Avatar"));
                localtion.setName(obj.getString("Lag"));
                localtion.setName(obj.getString("Lng"));
                localtion.setAccountId(obj.getInt("AccountId"));
                localtion.setCode(obj.getString("Code"));
                localtion.setRepresentActive(obj.getString("RepresentActive"));
                localtion.setCountCheckIn(obj.getInt("CountCheckIn"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Log.d("Localtion", "localtionObject: " + localtion.toString());
        }

        return localtion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getAccountId() {
        return AccountId;
    }

    public void setAccountId(int accountId) {
        this.AccountId = accountId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        this.Phone = phone;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String avatar) {
        this.Avatar = avatar;
    }

    public boolean getIsCheck() {
        return IsCheck;
    }

    public void setIscheck(boolean ischeck) {
        this.IsCheck = ischeck;
    }

    public Double getLag() {
        return Lag;
    }

    public void setLag(Double lag) {
        this.Lag = lag;
    }

    public Double getLng() {
        return Lng;
    }

    public void setLng(Double lng) {
        this.Lag = lng;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        this.Code = code;
    }

    public String getRepresentActive() {
        return RepresentActive;
    }

    public void setRepresentActive(String representActive) {
        this.RepresentActive = representActive;
    }

    public int getCountCheckIn() {
        return CountCheckIn;
    }

    public void setCountCheckIn(int countCheckIn) {
        this.CountCheckIn = countCheckIn;
    }
}
