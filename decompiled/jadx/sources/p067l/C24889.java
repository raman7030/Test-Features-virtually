package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩻۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes.dex */
public final class C24889 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C8796 c8796 = new C8796();
        c8796.f23886 = parcel.readInt();
        c8796.f23881 = parcel.readInt();
        int i = parcel.readInt();
        c8796.f23879 = i;
        if (i > 0) {
            int[] iArr = new int[i];
            c8796.f23880 = iArr;
            parcel.readIntArray(iArr);
        }
        int i2 = parcel.readInt();
        c8796.f23882 = i2;
        if (i2 > 0) {
            int[] iArr2 = new int[i2];
            c8796.f23883 = iArr2;
            parcel.readIntArray(iArr2);
        }
        c8796.f23877 = parcel.readInt() == 1;
        c8796.f23885 = parcel.readInt() == 1;
        c8796.f23878 = parcel.readInt() == 1;
        c8796.f23884 = parcel.readArrayList(C18854.class.getClassLoader());
        return c8796;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C8796[i];
    }
}
