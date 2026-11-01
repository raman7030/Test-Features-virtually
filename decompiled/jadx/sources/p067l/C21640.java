package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩶ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1YZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21640 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f68197;

    /* JADX INFO: renamed from: ۧ */
    public final int f68198;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC9476 f68199;

    /* JADX INFO: renamed from: ᩳ */
    public final C12252 f68200;

    public C21640(AbstractC9476 abstractC9476, int i, int i2, C12252 c12252) {
        this.f68199 = abstractC9476;
        this.f68198 = i;
        this.f68197 = i2;
        this.f68200 = c12252;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21640)) {
            return false;
        }
        C21640 c21640 = (C21640) obj;
        return this.f68198 == c21640.f68198 && this.f68197 == c21640.f68197 && C12826.equals(this.f68199, c21640.f68199) && C12826.equals(this.f68200, c21640.f68200);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f68200) + ((C12826.hashCode(this.f68199) + C6316.m14441(this.f68198, 31, this.f68197, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f68199, Integer.valueOf(this.f68198), Integer.valueOf(this.f68197), this.f68200};
        String[] strArrSplit = "instruction;index;data;intMatcher".length() == 0 ? new String[0] : "instruction;index;data;intMatcher".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C21640.class, sb, "[");
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
