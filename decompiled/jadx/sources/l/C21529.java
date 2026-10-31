package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: renamed from: l.᩸ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25NL */
/* JADX INFO: loaded from: classes4.dex */
public class C21529 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C8123();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC1067 f69209;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10947(int i, Bundle bundle) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48691(int i, Bundle bundle) {
        InterfaceC1067 interfaceC1067 = this.f69209;
        if (interfaceC1067 != null) {
            try {
                interfaceC1067.mo1800(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f69209 == null) {
                this.f69209 = new BinderC15177(this);
            }
            parcel.writeStrongBinder(this.f69209.asBinder());
        }
    }
}
