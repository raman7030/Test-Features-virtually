package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64W0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6443 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m17798(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }
}
