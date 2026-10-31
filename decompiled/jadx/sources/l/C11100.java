package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11100 extends AbstractC14626 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f33317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f33318;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f33319;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f33320;

    public C11100(byte[] bArr, String str, String str2, String str3) {
        super("GEOB");
        this.f33319 = str;
        this.f33320 = str2;
        this.f33318 = str3;
        this.f33317 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11100.class == obj.getClass()) {
            C11100 c11100 = (C11100) obj;
            if (C11003.equals(this.f33319, c11100.f33319) && C11003.equals(this.f33320, c11100.f33320) && C11003.equals(this.f33318, c11100.f33318) && Arrays.equals(this.f33317, c11100.f33317)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f33319;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f33320;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f33318;
        return Arrays.hashCode(this.f33317) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // l.AbstractC14626
    public final String toString() {
        return this.f44734 + ": mimeType=" + this.f33319 + ", filename=" + this.f33320 + ", description=" + this.f33318;
    }
}
