package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 04ZB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15614 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m36798(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36799(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }
}
