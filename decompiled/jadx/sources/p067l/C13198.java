package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۨ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C13198 extends AbstractC15010 {

    /* JADX INFO: renamed from: ܽ */
    public static final C13198 f37085 = new C13198(null, null);

    /* JADX INFO: renamed from: ֫ */
    public final C13868 f37086;

    /* JADX INFO: renamed from: ۧ */
    public final C13868 f37087;

    public /* synthetic */ C13198(C13868 c13868, C13868 c13869, int i) {
        this(c13868, c13869);
    }

    public C13198(C13868 c13868, C13868 c13869) {
        this.f37086 = c13868;
        this.f37087 = c13869;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13198)) {
            return false;
        }
        C13198 c13198 = (C13198) obj;
        return C12826.equals(this.f37086, c13198.f37086) && C12826.equals(this.f37087, c13198.f37087);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f37087) + (C12826.hashCode(this.f37086) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f37086, this.f37087};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C13198.class, sb, "[");
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
