package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۡܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10902 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f30213;

    /* JADX INFO: renamed from: ۜ */
    public final long f30214;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f30215;

    /* JADX INFO: renamed from: ۢ */
    public final String f30216;

    /* JADX INFO: renamed from: ۧ */
    public final String f30217;

    /* JADX INFO: renamed from: ܳ */
    public final long f30218;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f30219;

    /* JADX INFO: renamed from: ܿ */
    public final Long f30220;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f30221;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f30222;

    /* JADX INFO: renamed from: ᩻ */
    public final Long f30223;

    public C10902(String str, boolean z, boolean z2, boolean z3, long j, long j2, Long l2, Long l3, String str2, boolean z4, boolean z5) {
        this.f30216 = str;
        this.f30215 = z;
        this.f30221 = z2;
        this.f30222 = z3;
        this.f30214 = j;
        this.f30218 = j2;
        this.f30223 = l2;
        this.f30220 = l3;
        this.f30217 = str2;
        this.f30219 = z4;
        this.f30213 = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10902)) {
            return false;
        }
        C10902 c10902 = (C10902) obj;
        return this.f30215 == c10902.f30215 && this.f30221 == c10902.f30221 && this.f30222 == c10902.f30222 && this.f30219 == c10902.f30219 && this.f30213 == c10902.f30213 && this.f30214 == c10902.f30214 && this.f30218 == c10902.f30218 && C12826.equals(this.f30216, c10902.f30216) && C12826.equals(this.f30223, c10902.f30223) && C12826.equals(this.f30220, c10902.f30220) && C12826.equals(this.f30217, c10902.f30217);
    }

    public final int hashCode() {
        int i = (((((((this.f30215 ? 1231 : 1237) * 31) + (this.f30221 ? 1231 : 1237)) * 31) + (this.f30222 ? 1231 : 1237)) * 31) + (this.f30219 ? 1231 : 1237)) * 31;
        int i2 = this.f30213 ? 1231 : 1237;
        long j = this.f30214;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f30218;
        return C12826.hashCode(this.f30217) + ((C12826.hashCode(this.f30220) + ((C12826.hashCode(this.f30223) + C21720.m49003((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f30216)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30216, Boolean.valueOf(this.f30215), Boolean.valueOf(this.f30221), Boolean.valueOf(this.f30222), Long.valueOf(this.f30214), Long.valueOf(this.f30218), this.f30223, this.f30220, this.f30217, Boolean.valueOf(this.f30219), Boolean.valueOf(this.f30213)};
        String[] strArrSplit = "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".length() == 0 ? new String[0] : "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10902.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
