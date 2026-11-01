package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܿۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C1700 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1560(parcel.readParcelable(null), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1560[i];
    }
}
