package moe.shizuku.api;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class BinderContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: moe.shizuku.api.BinderContainer.1
        @Override // android.os.Parcelable.Creator
        public BinderContainer createFromParcel(Parcel parcel) {
            return new BinderContainer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public BinderContainer[] newArray(int i) {
            return new BinderContainer[i];
        }
    };
    public IBinder binder;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BinderContainer(IBinder iBinder) {
        this.binder = iBinder;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.binder);
    }

    public BinderContainer(Parcel parcel) {
        this.binder = parcel.readStrongBinder();
    }
}
