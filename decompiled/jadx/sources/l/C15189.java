package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C15189 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f46404;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f46405;

    public C15189(int i, int i2) {
        this.f46404 = i;
        this.f46405 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15189)) {
            return false;
        }
        C15189 c15189 = (C15189) obj;
        return this.f46404 == c15189.f46404 && this.f46405 == c15189.f46405;
    }

    public final int hashCode() {
        return (this.f46404 * 31) + this.f46405;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46404), Integer.valueOf(this.f46405)};
        String[] strArrSplit = "blockCount;lastLength".length() == 0 ? new String[0] : "blockCount;lastLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C15189.class, sb, "[");
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
