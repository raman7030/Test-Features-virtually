package p067l;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: l.۫ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes3.dex */
public final class C14330 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f40978;

    /* JADX INFO: renamed from: ۜ */
    public final UUID f40979;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 f40980;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f40981;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f40982;

    /* JADX INFO: renamed from: ܿ */
    public final Uri f40983;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC11500 f40984;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f40985;

    public C14330(C15000 c15000) {
        C23877.m52960((c15000.f42850 && c15000.f42855 == null) ? false : true);
        UUID uuid = c15000.f42851;
        uuid.getClass();
        this.f40979 = uuid;
        this.f40983 = c15000.f42855;
        AbstractC11500 unused = c15000.f42856;
        this.f40984 = c15000.f42856;
        this.f40981 = c15000.f42853;
        this.f40978 = c15000.f42850;
        this.f40985 = c15000.f42857;
        AbstractC16192 unused2 = c15000.f42852;
        this.f40980 = c15000.f42852;
        this.f40982 = c15000.f42854 != null ? Arrays.copyOf(c15000.f42854, c15000.f42854.length) : null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m32927() {
        byte[] bArr = this.f40982;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14330)) {
            return false;
        }
        C14330 c14330 = (C14330) obj;
        return this.f40979.equals(c14330.f40979) && C12826.equals(this.f40983, c14330.f40983) && C12826.equals(this.f40984, c14330.f40984) && this.f40981 == c14330.f40981 && this.f40978 == c14330.f40978 && this.f40985 == c14330.f40985 && this.f40980.equals(c14330.f40980) && Arrays.equals(this.f40982, c14330.f40982);
    }

    public final int hashCode() {
        int iHashCode = this.f40979.hashCode() * 31;
        Uri uri = this.f40983;
        return Arrays.hashCode(this.f40982) + ((this.f40980.hashCode() + ((((((((this.f40984.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f40981 ? 1 : 0)) * 31) + (this.f40978 ? 1 : 0)) * 31) + (this.f40985 ? 1 : 0)) * 31)) * 31);
    }

    static {
        C7470.m17250(0, 1, 2, 3, 4);
        C5792.m13032(5);
        C5792.m13032(6);
        C5792.m13032(7);
    }
}
