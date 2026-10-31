package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20312 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f65583;

    public C20312(int i) {
        this.f65583 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C20312) && this.f65583 == ((C20312) obj).f65583;
    }

    public final int hashCode() {
        return this.f65583;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f65583)};
        String[] strArrSplit = "indent".length() == 0 ? new String[0] : "indent".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C20312.class, sb, "[");
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
