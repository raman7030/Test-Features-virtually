package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes.dex */
public final class C1942 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C1837 c1837 = new C1837(parcel);
        c1837.f67614 = parcel.readByte() != 0;
        return c1837;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1837[i];
    }
}
