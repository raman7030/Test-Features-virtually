package p067l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.֡ۧ */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0860 implements InterfaceC0895 {

    /* JADX INFO: renamed from: ܿ */
    public IBinder f4552;

    public C0860(IBinder iBinder) {
        this.f4552 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4552;
    }

    @Override // p067l.InterfaceC0895
    /* JADX INFO: renamed from: ֫ */
    public final void mo4200(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC0895.f6686);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f4552.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
