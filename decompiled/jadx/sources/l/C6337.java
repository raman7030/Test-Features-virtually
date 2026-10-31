package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes3.dex */
public final class C6337 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f19637;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f19638;

    public C6337(String str, String str2) {
        this.f19637 = str;
        this.f19638 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6337)) {
            return false;
        }
        C6337 c6337 = (C6337) obj;
        return C11003.equals(this.f19637, c6337.f19637) && C11003.equals(this.f19638, c6337.f19638);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f19638) + (C11003.hashCode(this.f19637) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19637, this.f19638};
        String[] strArrSplit = "recycleName;relativePath".length() == 0 ? new String[0] : "recycleName;relativePath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C6337.class, sb, "[");
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
    public final String m17613() {
        return this.f19637;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m17614() {
        return this.f19638;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m17612() {
        return C16999.m39866("$RECYCLE.BIN$/" + this.f19637 + this.f19638, new String[0]);
    }
}
