package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18209 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56601;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56602;

    public C18209(int i, int i2) {
        this.f56602 = i;
        this.f56601 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18209)) {
            return false;
        }
        C18209 c18209 = (C18209) obj;
        return this.f56602 == c18209.f56602 && this.f56601 == c18209.f56601;
    }

    public final int hashCode() {
        return (this.f56602 * 31) + this.f56601;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f56602), Integer.valueOf(this.f56601)};
        String[] strArrSplit = "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".length() == 0 ? new String[0] : "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18209.class, sb, "[");
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m42425() {
        return this.f56601;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m42426() {
        return this.f56602;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42424() {
        return this.f56602 > 0 || this.f56601 > 0;
    }
}
