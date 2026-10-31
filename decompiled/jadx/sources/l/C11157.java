package l;

import com.alipay.sdk.m.y.l;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ۧᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11157 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Future f33485;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33486;

    public C11157() {
        throw null;
    }

    public C11157(C10847 c10847, int i) {
        this.f33485 = c10847;
        this.f33486 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11157)) {
            return false;
        }
        C11157 c11157 = (C11157) obj;
        return this.f33486 == c11157.f33486 && C11003.equals(this.f33485, c11157.f33485);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f33485) + (this.f33486 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f33485, Integer.valueOf(this.f33486)};
        String[] strArrSplit = "future;length".length() == 0 ? new String[0] : "future;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C11157.class, sb, "[");
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
