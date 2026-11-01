package p067l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C9322 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C15356();

    /* JADX INFO: renamed from: ᩸ */
    public final long f25364;

    /* JADX INFO: renamed from: ᩹ */
    public final long f25365;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C9322(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C23877.m52957(j >= 0);
        C23877.m52957(j2 >= 0 || j2 == -1);
        this.f25365 = j;
        this.f25364 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9322)) {
            return false;
        }
        C9322 c9322 = (C9322) obj;
        return this.f25365 == c9322.f25365 && this.f25364 == c9322.f25364;
    }

    public final int hashCode() {
        return (((int) this.f25365) * 961) + ((int) this.f25364);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25365);
        parcel.writeLong(this.f25364);
    }
}
