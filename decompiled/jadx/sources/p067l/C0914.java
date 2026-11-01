package p067l;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.֫ */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0914 implements InterfaceC1649 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f7985;

    public C0914(IBinder iBinder) {
        this.f7985 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7985;
    }

    @Override // p067l.InterfaceC1649
    /* JADX INFO: renamed from: ֫ */
    public final void mo7257(String str, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1649.f53213);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1006);
            parcelObtain.writeString(null);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f7985.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
