package l;

import android.media.MediaDescription;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9929 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return C13455.m32478(MediaDescription.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C13455[i];
    }
}
