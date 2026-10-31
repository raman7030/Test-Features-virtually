package l;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 43G9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1461 implements InterfaceC16277 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f5212;

    public C1461(IBinder iBinder) {
        this.f5212 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5212;
    }

    @Override // l.InterfaceC16277
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo5014(String str, Notification notification) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC16277.f50046);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1006);
            parcelObtain.writeString(null);
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f5212.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
