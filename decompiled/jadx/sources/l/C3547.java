package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۗ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W23P */
/* JADX INFO: loaded from: classes2.dex */
public class C3547 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4958();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC6369 f11279;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C3547(InterfaceC6369 interfaceC6369) {
        this.f11279 = interfaceC6369;
    }

    public C3547(Parcel parcel) {
        this.f11279 = new C10603(parcel).m31000();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6369 m10816() {
        return this.f11279;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C10603(parcel).m30998(this.f11279);
    }
}
