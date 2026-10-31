package l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۤܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10343 implements InterfaceC11754 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f31143;

    public C10343(IBinder iBinder) {
        this.f31143 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f31143;
    }

    @Override // l.InterfaceC11754
    public final String a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f31143.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // l.InterfaceC11754
    public final boolean c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f31143.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
