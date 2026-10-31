package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes.dex */
public final class C22172 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C20056 c20056 = new C20056(parcel);
        c20056.f64973 = parcel.readByte() != 0;
        return c20056;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C20056[i];
    }
}
