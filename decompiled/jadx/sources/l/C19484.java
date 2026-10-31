package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩵۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19484 implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new C0432(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new C0432(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0432[i];
    }
}
