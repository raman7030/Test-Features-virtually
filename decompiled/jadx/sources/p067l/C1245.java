package p067l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۠ۧ */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1245 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        InterfaceC0895 c0860;
        C1910 c1910 = new C1910();
        IBinder strongBinder = parcel.readStrongBinder();
        int i = AbstractBinderC1105.f19380;
        if (strongBinder == null) {
            c0860 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0895.f6686);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC0895)) {
                c0860 = (InterfaceC0895) iInterfaceQueryLocalInterface;
            } else {
                c0860 = new C0860(strongBinder);
            }
        }
        c1910.f71909 = c0860;
        return c1910;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1910[i];
    }
}
