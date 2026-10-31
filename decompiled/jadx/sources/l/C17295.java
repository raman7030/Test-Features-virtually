package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17295 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C14472(parcel.readParcelable(null), null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C14472[i];
    }
}
