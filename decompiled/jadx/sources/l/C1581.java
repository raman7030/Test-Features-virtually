package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes2.dex */
public final class C1581 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f5598;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5599;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16397 f5600;

    public C1581(C16397 c16397, int i, int i2) {
        this.f5600 = c16397;
        this.f5599 = i;
        this.f5598 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1581)) {
            return false;
        }
        C1581 c1581 = (C1581) obj;
        return this.f5599 == c1581.f5599 && this.f5598 == c1581.f5598 && C11003.equals(this.f5600, c1581.f5600);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f5600) + C4153.m12551(this.f5599, 31, this.f5598, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5600, Integer.valueOf(this.f5599), Integer.valueOf(this.f5598)};
        String[] strArrSplit = "restarts;oldStart;oldEnd".length() == 0 ? new String[0] : "restarts;oldStart;oldEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C1581.class, sb, "[");
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
    public final int m5401() {
        return this.f5598;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m5402() {
        return this.f5599;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16397 m5403() {
        return this.f5600;
    }
}
