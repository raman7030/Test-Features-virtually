package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C8332 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC13697 f22280;

    /* JADX INFO: renamed from: ۧ */
    public final C13836 f22281;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC9673 f22282;

    public C8332(C13836 c13836, EnumC9673 enumC9673, EnumC13697 enumC13697) {
        this.f22281 = c13836;
        this.f22282 = enumC9673;
        this.f22280 = enumC13697;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8332)) {
            return false;
        }
        C8332 c8332 = (C8332) obj;
        return C12826.equals(this.f22281, c8332.f22281) && C12826.equals(this.f22282, c8332.f22282) && C12826.equals(this.f22280, c8332.f22280);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f22280) + ((C12826.hashCode(this.f22282) + (C12826.hashCode(this.f22281) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22281, this.f22282, this.f22280};
        String[] strArrSplit = "key;signingMode;dialectMode".length() == 0 ? new String[0] : "key;signingMode;dialectMode".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8332.class, sb, "[");
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
    public final EnumC13697 m19222() {
        return this.f22280;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13836 m19223() {
        return this.f22281;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC9673 m19224() {
        return this.f22282;
    }
}
