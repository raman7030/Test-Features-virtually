package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9753 extends AbstractC13301 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9753 f29521 = new C9753(0, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f29522;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9047 f29523;

    public final int length() {
        C9047 c9047 = this.f29523;
        if (c9047 == null) {
            return 0;
        }
        return c9047.f27431;
    }

    public C9753(int i, C9047 c9047) {
        this.f29522 = i;
        this.f29523 = c9047;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9753)) {
            return false;
        }
        C9753 c9753 = (C9753) obj;
        return this.f29522 == c9753.f29522 && C11003.equals(this.f29523, c9753.f29523);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f29523) + (this.f29522 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f29522), this.f29523};
        String[] strArrSplit = "offset;spans".length() == 0 ? new String[0] : "offset;spans".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C9753.class, sb, "[");
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
    public final int m24731() {
        return this.f29522;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9047 m24732() {
        return this.f29523;
    }
}
