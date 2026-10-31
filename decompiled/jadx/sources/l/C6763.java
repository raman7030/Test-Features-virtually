package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6763 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23696();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f21002;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f21003;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f21004;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f21005;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21006;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f21007;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int[] f21008;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f21009;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f21010;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f21011;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21011);
        parcel.writeInt(this.f21006);
        parcel.writeInt(this.f21004);
        if (this.f21004 > 0) {
            parcel.writeIntArray(this.f21005);
        }
        parcel.writeInt(this.f21007);
        if (this.f21007 > 0) {
            parcel.writeIntArray(this.f21008);
        }
        parcel.writeInt(this.f21002 ? 1 : 0);
        parcel.writeInt(this.f21010 ? 1 : 0);
        parcel.writeInt(this.f21003 ? 1 : 0);
        parcel.writeList(this.f21009);
    }
}
