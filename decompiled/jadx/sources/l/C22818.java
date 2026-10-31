package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩺ۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J62A */
/* JADX INFO: loaded from: classes.dex */
public final class C22818 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C13645 c13645 = new C13645(parcel);
        c13645.f40702 = parcel.readString();
        return c13645;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C13645[i];
    }
}
