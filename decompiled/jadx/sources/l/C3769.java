package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۘۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C3769 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2358();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f11889;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f11890;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C3769(String str, int i) {
        this.f11890 = str;
        this.f11889 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11890);
        parcel.writeInt(this.f11889);
    }
}
