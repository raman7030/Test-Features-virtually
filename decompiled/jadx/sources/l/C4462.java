package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4462 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f14224;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f14225;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14226;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f14227;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f14228;

    public C4462(String str, int i, String str2, int i2, int i3) {
        this.f14226 = i;
        this.f14228 = str;
        this.f14224 = str2;
        this.f14227 = i2;
        this.f14225 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4462)) {
            return false;
        }
        C4462 c4462 = (C4462) obj;
        return this.f14226 == c4462.f14226 && this.f14227 == c4462.f14227 && this.f14225 == c4462.f14225 && C11003.equals(this.f14228, c4462.f14228) && C11003.equals(this.f14224, c4462.f14224);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f14224) + C20361.m46680(((((this.f14226 * 31) + this.f14227) * 31) + this.f14225) * 31, 31, this.f14228);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f14226), this.f14228, this.f14224, Integer.valueOf(this.f14227), Integer.valueOf(this.f14225)};
        String[] strArrSplit = "index;name;cacheTag;size;dataIconMark".length() == 0 ? new String[0] : "index;name;cacheTag;size;dataIconMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4462.class, sb, "[");
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
