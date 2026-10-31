package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6712 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C20824 c20824 = new C20824();
        c20824.f67396 = parcel.readInt();
        c20824.f67400 = parcel.readInt();
        c20824.f67397 = parcel.readInt();
        c20824.f67398 = parcel.readInt();
        c20824.f67399 = parcel.readInt();
        return c20824;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C20824[i];
    }
}
