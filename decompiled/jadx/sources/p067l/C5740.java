package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۗ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W23P */
/* JADX INFO: loaded from: classes2.dex */
public class C5740 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7081();

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC8422 f14085;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C5740(InterfaceC8422 interfaceC8422) {
        this.f14085 = interfaceC8422;
    }

    public C5740(Parcel parcel) {
        this.f14085 = new C12446(parcel).m33080();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8422 m12796() {
        return this.f14085;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C12446(parcel).m33078(this.f14085);
    }
}
