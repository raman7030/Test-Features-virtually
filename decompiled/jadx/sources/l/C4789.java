package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C4789 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15184;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f15185;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f15186;

    public C4789(int i, int i2, String str) {
        this.f15186 = i;
        this.f15184 = i2;
        this.f15185 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4789)) {
            return false;
        }
        C4789 c4789 = (C4789) obj;
        return this.f15186 == c4789.f15186 && this.f15184 == c4789.f15184 && C11003.equals(this.f15185, c4789.f15185);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f15185) + C4153.m12551(this.f15186, 31, this.f15184, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f15186), Integer.valueOf(this.f15184), this.f15185};
        String[] strArrSplit = "start;end;replacement".length() == 0 ? new String[0] : "start;end;replacement".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4789.class, sb, "[");
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
