package p067l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: l.ܺۙ */
/* JADX INFO: compiled from: 5B1T */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractBinderC1621 extends Binder implements InterfaceC0956 {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        InterfaceC1271 c1306;
        String str = InterfaceC0956.f10202;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1306 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1271.f29308);
                if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1271)) {
                    c1306 = (InterfaceC1271) iInterfaceQueryLocalInterface;
                } else {
                    c1306 = new C1306(strongBinder);
                }
            }
            mo9625(c1306);
            return true;
        }
        return super.onTransact(i, parcel, parcel2, i2);
    }
}
