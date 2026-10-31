package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0361 implements InterfaceC1067 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public IBinder f1773;

    public C0361(IBinder iBinder) {
        this.f1773 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1773;
    }

    @Override // l.InterfaceC1067
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1800(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC1067.f3915);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f1773.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
