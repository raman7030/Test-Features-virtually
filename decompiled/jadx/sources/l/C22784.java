package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩺ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F993 */
/* JADX INFO: loaded from: classes.dex */
public final class C22784 implements InterfaceC7262 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f73569;

    public C22784(IBinder iBinder) {
        this.f73569 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f73569;
    }

    @Override // l.InterfaceC7262
    /* JADX INFO: renamed from: ֫ */
    public final int mo19481() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            this.f73569.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC7262
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo19482(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            parcelObtain.writeString("sh");
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.f73569.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
