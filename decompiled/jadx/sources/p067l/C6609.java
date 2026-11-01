package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6609 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f17048;

    /* JADX INFO: renamed from: ۧ */
    public final int f17049;

    /* JADX INFO: renamed from: ܽ */
    public final int f17050;

    /* JADX INFO: renamed from: ܿ */
    public final int f17051;

    /* JADX INFO: renamed from: ᩳ */
    public final String f17052;

    public C6609(String str, int i, String str2, int i2, int i3) {
        this.f17050 = i;
        this.f17052 = str;
        this.f17048 = str2;
        this.f17051 = i2;
        this.f17049 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6609)) {
            return false;
        }
        C6609 c6609 = (C6609) obj;
        return this.f17050 == c6609.f17050 && this.f17051 == c6609.f17051 && this.f17049 == c6609.f17049 && C12826.equals(this.f17052, c6609.f17052) && C12826.equals(this.f17048, c6609.f17048);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f17048) + C21720.m49003(((((this.f17050 * 31) + this.f17051) * 31) + this.f17049) * 31, 31, this.f17052);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17050), this.f17052, this.f17048, Integer.valueOf(this.f17051), Integer.valueOf(this.f17049)};
        String[] strArrSplit = "index;name;cacheTag;size;dataIconMark".length() == 0 ? new String[0] : "index;name;cacheTag;size;dataIconMark".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6609.class, sb, "[");
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
