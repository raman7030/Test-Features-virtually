package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ۧ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12526 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C3808();

    /* JADX INFO: renamed from: ᩸ */
    public final long f35134;

    /* JADX INFO: renamed from: ᩹ */
    public final long f35135;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C12526(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C23877.m52957(j2 >= 0 || j2 == -9223372036854775807L);
        this.f35135 = j;
        this.f35134 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12526)) {
            return false;
        }
        C12526 c12526 = (C12526) obj;
        return this.f35135 == c12526.f35135 && this.f35134 == c12526.f35134;
    }

    public final int hashCode() {
        return (((int) this.f35135) * 961) + ((int) this.f35134);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35135);
        parcel.writeLong(this.f35134);
    }
}
