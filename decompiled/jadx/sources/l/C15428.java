package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܶ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 08RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15428 implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C8374();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f47235;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f47236;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f47237;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C15428 c15428 = (C15428) obj;
        int i = this.f47237 - c15428.f47237;
        if (i != 0) {
            return i;
        }
        int i2 = this.f47236 - c15428.f47236;
        return i2 == 0 ? this.f47235 - c15428.f47235 : i2;
    }

    public C15428(Parcel parcel) {
        this.f47237 = parcel.readInt();
        this.f47236 = parcel.readInt();
        this.f47235 = parcel.readInt();
    }

    public final String toString() {
        return this.f47237 + "." + this.f47236 + "." + this.f47235;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15428.class == obj.getClass()) {
            C15428 c15428 = (C15428) obj;
            if (this.f47237 == c15428.f47237 && this.f47236 == c15428.f47236 && this.f47235 == c15428.f47235) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f47237 * 31) + this.f47236) * 31) + this.f47235;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f47237);
        parcel.writeInt(this.f47236);
        parcel.writeInt(this.f47235);
    }

    static {
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
    }
}
