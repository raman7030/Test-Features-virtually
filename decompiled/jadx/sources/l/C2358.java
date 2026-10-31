package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۖۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2358 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C3769 c3769 = new C3769();
        c3769.f11890 = parcel.readString();
        c3769.f11889 = parcel.readInt();
        return c3769;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C3769[i];
    }
}
