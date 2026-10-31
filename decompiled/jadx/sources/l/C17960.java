package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C17960 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C16548();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f55990;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55990);
    }
}
