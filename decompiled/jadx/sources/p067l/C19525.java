package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19525 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C18854 c18854 = new C18854();
        c18854.f56320 = parcel.readInt();
        c18854.f56322 = parcel.readInt();
        c18854.f56321 = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            c18854.f56323 = iArr;
            parcel.readIntArray(iArr);
        }
        return c18854;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C18854[i];
    }
}
