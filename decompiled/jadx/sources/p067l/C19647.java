package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ᩳܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19647 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final int f59768;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f59769;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f59770;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f59771;

    /* JADX INFO: renamed from: ᩳ */
    public final C11477 f59772;

    /* JADX INFO: renamed from: ᩳ */
    public static /* bridge */ /* synthetic */ C11477 m44667(C19647 c19647) {
        return c19647.f59772;
    }

    public C19647(C11477 c11477, boolean z, int i, boolean z2, boolean z3) {
        this.f59772 = c11477;
        this.f59770 = z;
        this.f59768 = i;
        this.f59771 = z2;
        this.f59769 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19647)) {
            return false;
        }
        C19647 c19647 = (C19647) obj;
        return this.f59770 == c19647.f59770 && this.f59771 == c19647.f59771 && this.f59769 == c19647.f59769 && this.f59768 == c19647.f59768 && C12826.equals(this.f59772, c19647.f59772);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f59772) + ((((((((this.f59770 ? 1231 : 1237) * 31) + (this.f59771 ? 1231 : 1237)) * 31) + (this.f59769 ? 1231 : 1237)) * 31) + this.f59768) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59772, Boolean.valueOf(this.f59770), Integer.valueOf(this.f59768), Boolean.valueOf(this.f59771), Boolean.valueOf(this.f59769)};
        String[] strArrSplit = "painter;keepWord;arrowWidth;startArrow;endArrow".length() == 0 ? new String[0] : "painter;keepWord;arrowWidth;startArrow;endArrow".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C19647.class, sb, "[");
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
