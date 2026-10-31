package l;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05LV */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5301 extends Binder implements InterfaceC1067 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16543 = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC1067.f3915;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            ((BinderC15177) this).mo1800(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
