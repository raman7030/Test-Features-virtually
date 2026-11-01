package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 986Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C8232 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f21818;

    /* JADX INFO: renamed from: ۧ */
    public final String f21819;

    /* JADX INFO: renamed from: ܽ */
    public final String f21820;

    public C8232(String str, String str2, String str3) {
        this.f21819 = str;
        this.f21820 = str2;
        this.f21818 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8232)) {
            return false;
        }
        C8232 c8232 = (C8232) obj;
        return C12826.equals(this.f21819, c8232.f21819) && C12826.equals(this.f21820, c8232.f21820) && C12826.equals(this.f21818, c8232.f21818);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f21818) + C21720.m49003(C12826.hashCode(this.f21819) * 31, 31, this.f21820);
    }

    public final String toString() {
        Object[] objArr = {this.f21819, this.f21820, this.f21818};
        String[] strArrSplit = "name;region;endpoint".length() == 0 ? new String[0] : "name;region;endpoint".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder("BucketInfo[");
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

    /* JADX INFO: renamed from: ֫ */
    public final String m19006() {
        return this.f21818;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m19007() {
        return this.f21819;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m19008() {
        return this.f21820;
    }
}
