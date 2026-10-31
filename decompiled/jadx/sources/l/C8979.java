package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8979 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f27278;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f27279;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f27280;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f27281;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f27282;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f27283;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f27284;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Long f27285;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f27286;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f27287;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Long f27288;

    public C8979(String str, boolean z, boolean z2, boolean z3, long j, long j2, Long l2, Long l3, String str2, boolean z4, boolean z5) {
        this.f27281 = str;
        this.f27280 = z;
        this.f27286 = z2;
        this.f27287 = z3;
        this.f27279 = j;
        this.f27283 = j2;
        this.f27288 = l2;
        this.f27285 = l3;
        this.f27282 = str2;
        this.f27284 = z4;
        this.f27278 = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8979)) {
            return false;
        }
        C8979 c8979 = (C8979) obj;
        return this.f27280 == c8979.f27280 && this.f27286 == c8979.f27286 && this.f27287 == c8979.f27287 && this.f27284 == c8979.f27284 && this.f27278 == c8979.f27278 && this.f27279 == c8979.f27279 && this.f27283 == c8979.f27283 && C11003.equals(this.f27281, c8979.f27281) && C11003.equals(this.f27288, c8979.f27288) && C11003.equals(this.f27285, c8979.f27285) && C11003.equals(this.f27282, c8979.f27282);
    }

    public final int hashCode() {
        int i = (((((((this.f27280 ? 1231 : 1237) * 31) + (this.f27286 ? 1231 : 1237)) * 31) + (this.f27287 ? 1231 : 1237)) * 31) + (this.f27284 ? 1231 : 1237)) * 31;
        int i2 = this.f27278 ? 1231 : 1237;
        long j = this.f27279;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f27283;
        return C11003.hashCode(this.f27282) + ((C11003.hashCode(this.f27285) + ((C11003.hashCode(this.f27288) + C20361.m46680((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f27281)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f27281, Boolean.valueOf(this.f27280), Boolean.valueOf(this.f27286), Boolean.valueOf(this.f27287), Long.valueOf(this.f27279), Long.valueOf(this.f27283), this.f27288, this.f27285, this.f27282, Boolean.valueOf(this.f27284), Boolean.valueOf(this.f27278)};
        String[] strArrSplit = "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".length() == 0 ? new String[0] : "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8979.class, sb, "[");
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
