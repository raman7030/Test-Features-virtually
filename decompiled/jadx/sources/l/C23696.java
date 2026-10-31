package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩻۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes.dex */
public final class C23696 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C6763 c6763 = new C6763();
        c6763.f21011 = parcel.readInt();
        c6763.f21006 = parcel.readInt();
        int i = parcel.readInt();
        c6763.f21004 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            c6763.f21005 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        c6763.f21007 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            c6763.f21008 = iArr2;
            parcel.readIntArray(iArr2);
        }
        c6763.f21002 = parcel.readInt() == 1;
        c6763.f21010 = parcel.readInt() == 1;
        c6763.f21003 = parcel.readInt() == 1;
        c6763.f21009 = parcel.readArrayList(C17346.class.getClassLoader());
        return c6763;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C6763[i];
    }
}
