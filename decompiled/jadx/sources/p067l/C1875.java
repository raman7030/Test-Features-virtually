package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩷ۧ */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes4.dex */
public class C1875 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1175();

    /* JADX INFO: renamed from: ۗ */
    public int f70079;

    /* JADX INFO: renamed from: ۙ */
    public int f70080;

    /* JADX INFO: renamed from: ᩶ */
    public int f70081;

    /* JADX INFO: renamed from: ᩸ */
    public int f70082;

    /* JADX INFO: renamed from: ᩹ */
    public int f70083;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f70079);
        parcel.writeInt(this.f70083);
        parcel.writeInt(this.f70080);
        parcel.writeInt(this.f70081);
        parcel.writeInt(this.f70082);
    }
}
