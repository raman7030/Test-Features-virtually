package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8502 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C21914(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C21914[i];
    }
}
