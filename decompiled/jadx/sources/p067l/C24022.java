package p067l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.᩺ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F993 */
/* JADX INFO: loaded from: classes.dex */
public final class C24022 implements InterfaceC9270 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f76299;

    public C24022(IBinder iBinder) {
        this.f76299 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f76299;
    }

    @Override // p067l.InterfaceC9270
    /* JADX INFO: renamed from: ֫ */
    public final int mo21447() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            this.f76299.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC9270
    /* JADX INFO: renamed from: ֫ */
    public final Bundle mo21448(int i, String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("bin.mt.shell.IShizukuCommand");
            parcelObtain.writeString("sh");
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i);
            this.f76299.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
