package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩺ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes.dex */
public final class C24054 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C15336 c15336 = new C15336(parcel);
        c15336.f43783 = parcel.readString();
        return c15336;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C15336[i];
    }
}
