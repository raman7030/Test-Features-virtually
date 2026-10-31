package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C18925 extends AbstractC13301 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C18925 f59633 = new C18925(null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9047 f59634;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9047 f59635;

    public /* synthetic */ C18925(C9047 c9047, C9047 c9048, int i) {
        this(c9047, c9048);
    }

    public C18925(C9047 c9047, C9047 c9048) {
        this.f59634 = c9047;
        this.f59635 = c9048;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18925)) {
            return false;
        }
        C18925 c18925 = (C18925) obj;
        return C11003.equals(this.f59634, c18925.f59634) && C11003.equals(this.f59635, c18925.f59635);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f59635) + (C11003.hashCode(this.f59634) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59634, this.f59635};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C18925.class, sb, "[");
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
