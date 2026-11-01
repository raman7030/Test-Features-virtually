package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6B6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15199 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        if (parcel.readParcelable(null) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return AbstractC9165.EMPTY_STATE;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) != null) {
            throw new IllegalStateException("superState must be null");
        }
        return AbstractC9165.EMPTY_STATE;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new AbstractC9165[i];
    }
}
