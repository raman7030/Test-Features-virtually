package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 970R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19684 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C19013 f59832;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f59833;

    public C19684(C19013 c19013, boolean z) {
        this.f59832 = c19013;
        this.f59833 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19684)) {
            return false;
        }
        C19684 c19684 = (C19684) obj;
        return this.f59833 == c19684.f59833 && C12826.equals(this.f59832, c19684.f59832);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f59832) + ((this.f59833 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59832, Boolean.valueOf(this.f59833)};
        String[] strArrSplit = "patches;removedPatternIdentity".length() == 0 ? new String[0] : "patches;removedPatternIdentity".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19684.class, sb, "[");
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
    public final C19013 m44701() {
        return this.f59832;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m44702() {
        return this.f59833;
    }
}
