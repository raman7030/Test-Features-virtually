package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C14255 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C23428 c23428 = new C23428();
        c23428.f75228 = parcel.readInt();
        c23428.f75230 = parcel.readInt();
        c23428.f75229 = parcel.readInt() == 1;
        return c23428;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C23428[i];
    }
}
