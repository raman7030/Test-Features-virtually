package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21619 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f69401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69402;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f69403;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69404;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f69405;

    public C21619(int i, int i2, int i3, boolean z, boolean z2) {
        this.f69405 = i;
        this.f69402 = i2;
        this.f69404 = i3;
        this.f69401 = z;
        this.f69403 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21619)) {
            return false;
        }
        C21619 c21619 = (C21619) obj;
        return this.f69401 == c21619.f69401 && this.f69403 == c21619.f69403 && this.f69405 == c21619.f69405 && this.f69402 == c21619.f69402 && this.f69404 == c21619.f69404;
    }

    public final int hashCode() {
        return ((((((((this.f69401 ? 1231 : 1237) * 31) + (this.f69403 ? 1231 : 1237)) * 31) + this.f69405) * 31) + this.f69402) * 31) + this.f69404;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f69405), Integer.valueOf(this.f69402), Integer.valueOf(this.f69404), Boolean.valueOf(this.f69401), Boolean.valueOf(this.f69403)};
        String[] strArrSplit = "start;end;type;breakBefore;protectedText".length() == 0 ? new String[0] : "start;end;type;breakBefore;protectedText".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21619.class, sb, "[");
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
