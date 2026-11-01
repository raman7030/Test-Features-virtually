package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8796 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C24889();

    /* JADX INFO: renamed from: ۗ */
    public boolean f23877;

    /* JADX INFO: renamed from: ۙ */
    public boolean f23878;

    /* JADX INFO: renamed from: ۛ */
    public int f23879;

    /* JADX INFO: renamed from: ۤ */
    public int[] f23880;

    /* JADX INFO: renamed from: ۨ */
    public int f23881;

    /* JADX INFO: renamed from: ۫ */
    public int f23882;

    /* JADX INFO: renamed from: ۬ */
    public int[] f23883;

    /* JADX INFO: renamed from: ᩶ */
    public ArrayList f23884;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f23885;

    /* JADX INFO: renamed from: ᩹ */
    public int f23886;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23886);
        parcel.writeInt(this.f23881);
        parcel.writeInt(this.f23879);
        if (this.f23879 > 0) {
            parcel.writeIntArray(this.f23880);
        }
        parcel.writeInt(this.f23882);
        if (this.f23882 > 0) {
            parcel.writeIntArray(this.f23883);
        }
        parcel.writeInt(this.f23877 ? 1 : 0);
        parcel.writeInt(this.f23885 ? 1 : 0);
        parcel.writeInt(this.f23878 ? 1 : 0);
        parcel.writeList(this.f23884);
    }
}
