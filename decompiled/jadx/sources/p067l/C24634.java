package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩻ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes.dex */
public final class C24634 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15916();

    /* JADX INFO: renamed from: ᩶ */
    public int f77974;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f77975;

    /* JADX INFO: renamed from: ᩹ */
    public int f77976;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77974);
        parcel.writeInt(this.f77976);
        parcel.writeInt(this.f77975 ? 1 : 0);
    }
}
