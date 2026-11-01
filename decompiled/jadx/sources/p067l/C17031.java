package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܶ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17031 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C10327();

    /* JADX INFO: renamed from: ᩶ */
    public final int f50364;

    /* JADX INFO: renamed from: ᩸ */
    public final int f50365;

    /* JADX INFO: renamed from: ᩹ */
    public final int f50366;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C17031 c17031 = (C17031) obj;
        int i = this.f50366 - c17031.f50366;
        if (i != 0) {
            return i;
        }
        int i2 = this.f50365 - c17031.f50365;
        return i2 == 0 ? this.f50364 - c17031.f50364 : i2;
    }

    public C17031(Parcel parcel) {
        this.f50366 = parcel.readInt();
        this.f50365 = parcel.readInt();
        this.f50364 = parcel.readInt();
    }

    public final String toString() {
        return this.f50366 + "." + this.f50365 + "." + this.f50364;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17031.class == obj.getClass()) {
            C17031 c17031 = (C17031) obj;
            if (this.f50366 == c17031.f50366 && this.f50365 == c17031.f50365 && this.f50364 == c17031.f50364) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f50366 * 31) + this.f50365) * 31) + this.f50364;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50366);
        parcel.writeInt(this.f50365);
        parcel.writeInt(this.f50364);
    }

    static {
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
    }
}
