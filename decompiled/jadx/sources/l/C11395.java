package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C11395 extends AbstractC13301 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11395 f34087 = new C11395(null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12100 f34088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12100 f34089;

    public /* synthetic */ C11395(C12100 c12100, C12100 c12101, int i) {
        this(c12100, c12101);
    }

    public C11395(C12100 c12100, C12100 c12101) {
        this.f34088 = c12100;
        this.f34089 = c12101;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11395)) {
            return false;
        }
        C11395 c11395 = (C11395) obj;
        return C11003.equals(this.f34088, c11395.f34088) && C11003.equals(this.f34089, c11395.f34089);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f34089) + (C11003.hashCode(this.f34088) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f34088, this.f34089};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C11395.class, sb, "[");
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
