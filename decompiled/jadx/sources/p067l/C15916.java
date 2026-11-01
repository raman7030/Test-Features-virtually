package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܳۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4ND */
/* JADX INFO: loaded from: classes3.dex */
public final class C15916 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C24634 c24634 = new C24634();
        c24634.f77974 = parcel.readInt();
        c24634.f77976 = parcel.readInt();
        c24634.f77975 = parcel.readInt() == 1;
        return c24634;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C24634[i];
    }
}
