package p067l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.ᩴᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U8TP */
/* JADX INFO: loaded from: classes4.dex */
public final class C20366 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C6284();

    /* JADX INFO: renamed from: ۗ */
    public final UUID f62957;

    /* JADX INFO: renamed from: ۙ */
    public final String f62958;

    /* JADX INFO: renamed from: ᩶ */
    public final String f62959;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f62960;

    /* JADX INFO: renamed from: ᩹ */
    public int f62961;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C20366(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f62957 = uuid;
        this.f62959 = str;
        str2.getClass();
        this.f62958 = C11669.m26815(str2);
        this.f62960 = bArr;
    }

    public C20366(Parcel parcel) {
        this.f62957 = new UUID(parcel.readLong(), parcel.readLong());
        this.f62959 = parcel.readString();
        String string = parcel.readString();
        String str = C5792.f14228;
        this.f62958 = string;
        this.f62960 = parcel.createByteArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45967(UUID uuid) {
        UUID uuid2 = C25059.f79956;
        UUID uuid3 = this.f62957;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20366)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C20366 c20366 = (C20366) obj;
        return C12826.equals(this.f62959, c20366.f62959) && C12826.equals(this.f62958, c20366.f62958) && C12826.equals(this.f62957, c20366.f62957) && Arrays.equals(this.f62960, c20366.f62960);
    }

    public final int hashCode() {
        if (this.f62961 == 0) {
            int iHashCode = this.f62957.hashCode() * 31;
            String str = this.f62959;
            this.f62961 = Arrays.hashCode(this.f62960) + C12832.m29411((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f62958);
        }
        return this.f62961;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f62957;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f62959);
        parcel.writeString(this.f62958);
        parcel.writeByteArray(this.f62960);
    }
}
