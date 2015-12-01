package com.example.abhinav.viewpager.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by abhinav on 30/11/15.
 */
public class Message implements Parcelable {
    private int messageType;
    private ArrayList<String> data;

    public Message(int messageType, ArrayList<String> data) {
        this.messageType = messageType;
        this.data = data;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public ArrayList<String> getData() {
        return data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(messageType);
        parcel.writeStringList(data);
    }

    public static final Parcelable.Creator<Message> CREATOR = new Parcelable.Creator<Message>() {

        @Override
        public Message createFromParcel(Parcel parcel) {
            return new Message(parcel);
        }

        @Override
        public Message[] newArray(int i) {
            return new Message[i];
        }
    };

    public Message(Parcel parcel) {
        messageType = parcel.readInt();
        parcel.readStringList(data);
    }
}
