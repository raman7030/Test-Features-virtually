package p067l;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۤܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OAQ1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12198 implements InterfaceC13539 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f34105;

    public C12198(IBinder iBinder) {
        this.f34105 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f34105;
    }

    @Override // p067l.InterfaceC13539
    /* JADX INFO: renamed from: a */
    public final String mo28167a() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f34105.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p067l.InterfaceC13539
    /* JADX INFO: renamed from: c */
    public final boolean mo28168c() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
            this.f34105.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
