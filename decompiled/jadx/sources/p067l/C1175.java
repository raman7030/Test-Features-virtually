package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۜۧ */
/* JADX INFO: compiled from: X5H0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1175 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        C1875 c1875 = new C1875();
        c1875.f70079 = parcel.readInt();
        c1875.f70083 = parcel.readInt();
        c1875.f70080 = parcel.readInt();
        c1875.f70081 = parcel.readInt();
        c1875.f70082 = parcel.readInt();
        return c1875;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C1875[i];
    }
}
