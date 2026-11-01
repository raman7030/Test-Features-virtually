package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: S97P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8392 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f22509;

    /* JADX INFO: renamed from: ۧ */
    public final String f22510;

    public C8392(String str, String str2) {
        this.f22509 = str;
        this.f22510 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8392)) {
            return false;
        }
        C8392 c8392 = (C8392) obj;
        return C12826.equals(this.f22509, c8392.f22509) && C12826.equals(this.f22510, c8392.f22510);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f22510) + (C12826.hashCode(this.f22509) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22509, this.f22510};
        String[] strArrSplit = "recycleName;relativePath".length() == 0 ? new String[0] : "recycleName;relativePath".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8392.class, sb, "[");
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

    /* JADX INFO: renamed from: ܽ */
    public final String m19553() {
        return this.f22509;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m19554() {
        return this.f22510;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m19552() {
        return C18524.m42109("$RECYCLE.BIN$/" + this.f22509 + this.f22510, new String[0]);
    }
}
