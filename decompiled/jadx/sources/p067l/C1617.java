package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܺ֫ */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C1617 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m38964(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38965(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }
}
