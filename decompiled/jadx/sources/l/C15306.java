package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܶܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15306 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable f46952;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f46953;

    public C15306(int i, Runnable runnable) {
        this.f46953 = i;
        this.f46952 = runnable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15306)) {
            return false;
        }
        C15306 c15306 = (C15306) obj;
        return this.f46953 == c15306.f46953 && C11003.equals(this.f46952, c15306.f46952);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f46952) + (this.f46953 * 31);
    }

    public final int position() {
        return this.f46953;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f46953), this.f46952};
        String[] strArrSplit = "position;callback".length() == 0 ? new String[0] : "position;callback".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C15306.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Runnable m36324() {
        return this.f46952;
    }
}
