package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E708 */
/* JADX INFO: loaded from: classes.dex */
public final class C23327 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f74981;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f74982;

    public C23327(int i, String str) {
        this.f74981 = i;
        this.f74982 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23327)) {
            return false;
        }
        C23327 c23327 = (C23327) obj;
        return this.f74981 == c23327.f74981 && C11003.equals(this.f74982, c23327.f74982);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f74982) + (this.f74981 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f74981), this.f74982};
        String[] strArrSplit = "group;name".length() == 0 ? new String[0] : "group;name".split(l.b);
        StringBuilder sb = new StringBuilder("CaptureExport[");
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
    public final int m51733() {
        return this.f74981;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m51734() {
        return this.f74982;
    }
}
