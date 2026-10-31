package l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C18937 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4120();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final UUID f59726;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59727;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f59728;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f59729;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f59730;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C18937(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f59726 = uuid;
        this.f59728 = str;
        str2.getClass();
        this.f59727 = C9786.m24800(str2);
        this.f59729 = bArr;
    }

    public C18937(Parcel parcel) {
        this.f59726 = new UUID(parcel.readLong(), parcel.readLong());
        this.f59728 = parcel.readString();
        String string = parcel.readString();
        String str = C3603.f11424;
        this.f59727 = string;
        this.f59729 = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43701(UUID uuid) {
        UUID uuid2 = C23875.f77204;
        UUID uuid3 = this.f59726;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18937)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C18937 c18937 = (C18937) obj;
        return C11003.equals(this.f59728, c18937.f59728) && C11003.equals(this.f59727, c18937.f59727) && C11003.equals(this.f59726, c18937.f59726) && Arrays.equals(this.f59729, c18937.f59729);
    }

    public final int hashCode() {
        if (this.f59730 == 0) {
            int iHashCode = this.f59726.hashCode() * 31;
            String str = this.f59728;
            this.f59730 = Arrays.hashCode(this.f59729) + C11010.m27349((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f59727);
        }
        return this.f59730;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f59726;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f59728);
        parcel.writeString(this.f59727);
        parcel.writeByteArray(this.f59729);
    }
}
