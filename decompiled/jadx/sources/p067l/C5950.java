package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۘۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5950 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4609();

    /* JADX INFO: renamed from: ᩸ */
    public int f14695;

    /* JADX INFO: renamed from: ᩹ */
    public String f14696;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C5950(String str, int i) {
        this.f14696 = str;
        this.f14695 = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14696);
        parcel.writeInt(this.f14695);
    }
}
