package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۧᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12972 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final Future f36485;

    /* JADX INFO: renamed from: ۧ */
    public final int f36486;

    public C12972() {
        throw null;
    }

    public C12972(C12677 c12677, int i) {
        this.f36485 = c12677;
        this.f36486 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12972)) {
            return false;
        }
        C12972 c12972 = (C12972) obj;
        return this.f36486 == c12972.f36486 && C12826.equals(this.f36485, c12972.f36485);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f36485) + (this.f36486 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f36485, Integer.valueOf(this.f36486)};
        String[] strArrSplit = "future;length".length() == 0 ? new String[0] : "future;length".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C12972.class, sb, "[");
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
