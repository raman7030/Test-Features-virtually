package p067l;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۤ */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return C1509.m34580(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1509[i];
    }
}
