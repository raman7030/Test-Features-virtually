package p067l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۚۧ */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC1105 extends Binder implements InterfaceC0895 {

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ int f19380 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC0895.f6686;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            ((BinderC1595) this).mo4200(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
