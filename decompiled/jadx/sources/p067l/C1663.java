package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܽۢ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C1663 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C1733 c1733 = new C1733();
        c1733.f59187 = parcel.readInt();
        return c1733;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1733[i];
    }
}
