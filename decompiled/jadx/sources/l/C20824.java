package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩷ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes4.dex */
public class C20824 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6712();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f67396;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f67397;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f67398;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f67399;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f67400;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f67396);
        parcel.writeInt(this.f67400);
        parcel.writeInt(this.f67397);
        parcel.writeInt(this.f67398);
        parcel.writeInt(this.f67399);
    }
}
