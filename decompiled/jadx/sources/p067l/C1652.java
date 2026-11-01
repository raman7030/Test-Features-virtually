package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܽ֫ */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes4.dex */
public final class C1652 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C1687(parcel.readFloat(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1687[i];
    }
}
