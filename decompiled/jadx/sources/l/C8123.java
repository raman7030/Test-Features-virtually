package l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8123 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC1067 c0361;
        C21529 c21529 = new C21529();
        IBinder strongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC5301.f16543;
        if (strongBinder == null) {
            c0361 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC1067.f3915);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC1067)) {
                c0361 = (InterfaceC1067) iInterfaceQueryLocalInterface;
            } else {
                c0361 = new C0361(strongBinder);
            }
        }
        c21529.f69209 = c0361;
        return c21529;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C21529[i];
    }
}
