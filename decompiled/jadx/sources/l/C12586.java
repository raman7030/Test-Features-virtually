package l;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.۫ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C12586 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f37950;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final UUID f37951;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f37952;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f37953;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f37954;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Uri f37955;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f37956;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f37957;

    public C12586(C13291 c13291) {
        C22632.m50634((c13291.f39783 && c13291.f39788 == null) ? false : true);
        UUID uuid = c13291.f39784;
        uuid.getClass();
        this.f37951 = uuid;
        this.f37955 = c13291.f39788;
        AbstractC9608 unused = c13291.f39789;
        this.f37956 = c13291.f39789;
        this.f37953 = c13291.f39786;
        this.f37950 = c13291.f39783;
        this.f37957 = c13291.f39790;
        AbstractC14545 unused2 = c13291.f39785;
        this.f37952 = c13291.f39785;
        this.f37954 = c13291.f39787 != null ? Arrays.copyOf(c13291.f39787, c13291.f39787.length) : null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m30850() {
        byte[] bArr = this.f37954;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12586)) {
            return false;
        }
        C12586 c12586 = (C12586) obj;
        return this.f37951.equals(c12586.f37951) && C11003.equals(this.f37955, c12586.f37955) && C11003.equals(this.f37956, c12586.f37956) && this.f37953 == c12586.f37953 && this.f37950 == c12586.f37950 && this.f37957 == c12586.f37957 && this.f37952.equals(c12586.f37952) && Arrays.equals(this.f37954, c12586.f37954);
    }

    public final int hashCode() {
        int iHashCode = this.f37951.hashCode() * 31;
        Uri uri = this.f37955;
        return Arrays.hashCode(this.f37954) + ((this.f37952.hashCode() + ((((((((this.f37956.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f37953 ? 1 : 0)) * 31) + (this.f37950 ? 1 : 0)) * 31) + (this.f37957 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
        C3603.m11056(7);
    }
}
