package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18180 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56555;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f56556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f56557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f56558;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C9584 f56559;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C9584 m42406(C18180 c18180) {
        return c18180.f56559;
    }

    public C18180(C9584 c9584, boolean z, int i, boolean z2, boolean z3) {
        this.f56559 = c9584;
        this.f56557 = z;
        this.f56555 = i;
        this.f56558 = z2;
        this.f56556 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18180)) {
            return false;
        }
        C18180 c18180 = (C18180) obj;
        return this.f56557 == c18180.f56557 && this.f56558 == c18180.f56558 && this.f56556 == c18180.f56556 && this.f56555 == c18180.f56555 && C11003.equals(this.f56559, c18180.f56559);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f56559) + ((((((((this.f56557 ? 1231 : 1237) * 31) + (this.f56558 ? 1231 : 1237)) * 31) + (this.f56556 ? 1231 : 1237)) * 31) + this.f56555) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56559, Boolean.valueOf(this.f56557), Integer.valueOf(this.f56555), Boolean.valueOf(this.f56558), Boolean.valueOf(this.f56556)};
        String[] strArrSplit = "painter;keepWord;arrowWidth;startArrow;endArrow".length() == 0 ? new String[0] : "painter;keepWord;arrowWidth;startArrow;endArrow".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18180.class, sb, "[");
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
