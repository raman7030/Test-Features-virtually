package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes.dex */
public final class C22673 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1069 f73182;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f73183;

    public C22673(String str, C1069 c1069) {
        this.f73183 = str;
        this.f73182 = c1069;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22673)) {
            return false;
        }
        C22673 c22673 = (C22673) obj;
        return C11003.equals(this.f73183, c22673.f73183) && C11003.equals(this.f73182, c22673.f73182);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f73182) + (C11003.hashCode(this.f73183) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f73183, this.f73182};
        String[] strArrSplit = "strBsm;cpx2Const".length() == 0 ? new String[0] : "strBsm;cpx2Const".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C22673.class, sb, "[");
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
    public final C1069 m50662() {
        return this.f73182;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m50663() {
        return this.f73183;
    }
}
