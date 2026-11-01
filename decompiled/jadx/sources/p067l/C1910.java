package p067l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩸ۧ */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes4.dex */
public class C1910 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1245();

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC0895 f71909;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12923(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51036(int i, Bundle bundle) {
        InterfaceC0895 interfaceC0895 = this.f71909;
        if (interfaceC0895 != null) {
            try {
                interfaceC0895.mo4200(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f71909 == null) {
                this.f71909 = new BinderC1595(this);
            }
            parcel.writeStrongBinder(this.f71909.asBinder());
        }
    }
}
