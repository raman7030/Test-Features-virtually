package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 223J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16677 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9973();

    /* JADX INFO: renamed from: ۙ */
    public int f49065;

    /* JADX INFO: renamed from: ۫ */
    public ArrayList f49067;

    /* JADX INFO: renamed from: ᩶ */
    public C16221[] f49069;

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f49070;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f49071;

    /* JADX INFO: renamed from: ۤ */
    public String f49066 = null;

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f49064 = new ArrayList();

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f49068 = new ArrayList();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f49070);
        parcel.writeStringList(this.f49071);
        parcel.writeTypedArray(this.f49069, i);
        parcel.writeInt(this.f49065);
        parcel.writeString(this.f49066);
        parcel.writeStringList(this.f49064);
        parcel.writeTypedList(this.f49068);
        parcel.writeTypedList(this.f49067);
    }
}
