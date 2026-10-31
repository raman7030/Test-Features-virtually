package l;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.۟۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58LL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7317 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C13666();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f22473;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f22474;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C7317(Parcel parcel) {
        long j = parcel.readLong();
        long j2 = parcel.readLong();
        C22632.m50631(j >= 0);
        C22632.m50631(j2 >= 0 || j2 == -1);
        this.f22474 = j;
        this.f22473 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7317)) {
            return false;
        }
        C7317 c7317 = (C7317) obj;
        return this.f22474 == c7317.f22474 && this.f22473 == c7317.f22473;
    }

    public final int hashCode() {
        return (((int) this.f22474) * 961) + ((int) this.f22473);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22474);
        parcel.writeLong(this.f22473);
    }
}
