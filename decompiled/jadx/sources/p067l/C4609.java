package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۖۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C4609 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C5950 c5950 = new C5950();
        c5950.f14696 = parcel.readString();
        c5950.f14695 = parcel.readInt();
        return c5950;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C5950[i];
    }
}
