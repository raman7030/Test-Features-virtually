package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩻ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes.dex */
public final class C23428 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C14255();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f75228;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f75229;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f75230;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f75228);
        parcel.writeInt(this.f75230);
        parcel.writeInt(this.f75229 ? 1 : 0);
    }
}
