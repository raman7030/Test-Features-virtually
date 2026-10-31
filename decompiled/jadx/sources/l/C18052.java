package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ᩳ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18052 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C17346 c17346 = new C17346();
        c17346.f53136 = parcel.readInt();
        c17346.f53138 = parcel.readInt();
        c17346.f53137 = parcel.readInt() == 1;
        int i = parcel.readInt();
        if (i > 0) {
            int[] iArr = new int[i];
            c17346.f53139 = iArr;
            parcel.readIntArray(iArr);
        }
        return c17346;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C17346[i];
    }
}
