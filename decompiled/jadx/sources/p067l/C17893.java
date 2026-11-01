package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܽ֫ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17893 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f53463;

    /* JADX INFO: renamed from: ۧ */
    public final int f53464;

    /* JADX INFO: renamed from: ܽ */
    public final String f53465;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f53466;

    public C17893(String str, int i, boolean z, boolean z2) {
        this.f53465 = str;
        this.f53466 = z;
        this.f53463 = z2;
        this.f53464 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17893)) {
            return false;
        }
        C17893 c17893 = (C17893) obj;
        return this.f53466 == c17893.f53466 && this.f53463 == c17893.f53463 && this.f53464 == c17893.f53464 && C12826.equals(this.f53465, c17893.f53465);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f53465) + ((((((this.f53466 ? 1231 : 1237) * 31) + (this.f53463 ? 1231 : 1237)) * 31) + this.f53464) * 31);
    }

    public final int size() {
        return this.f53464;
    }

    public final String toString() {
        Object[] objArr = {this.f53465, Boolean.valueOf(this.f53466), Boolean.valueOf(this.f53463), Integer.valueOf(this.f53464)};
        String[] strArrSplit = "text;warning;searching;size".length() == 0 ? new String[0] : "text;warning;searching;size".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C17893.class, sb, "[");
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
    public final boolean m40693() {
        return this.f53463;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m40694() {
        return this.f53465;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m40695() {
        return this.f53466;
    }
}
