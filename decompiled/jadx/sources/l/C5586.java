package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C5586 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17297;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2309 f17298;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11999 f17299;

    public C5586(C11999 c11999, C2309 c2309, int i) {
        this.f17299 = c11999;
        this.f17298 = c2309;
        this.f17297 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5586)) {
            return false;
        }
        C5586 c5586 = (C5586) obj;
        return this.f17297 == c5586.f17297 && C11003.equals(this.f17299, c5586.f17299) && C11003.equals(this.f17298, c5586.f17298);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f17298) + ((C11003.hashCode(this.f17299) + (this.f17297 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17299, this.f17298, Integer.valueOf(this.f17297)};
        String[] strArrSplit = "text;history;activePageOffset".length() == 0 ? new String[0] : "text;history;activePageOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C5586.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15874() {
        return this.f17297;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2309 m15875() {
        return this.f17298;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11999 m15876() {
        return this.f17299;
    }
}
