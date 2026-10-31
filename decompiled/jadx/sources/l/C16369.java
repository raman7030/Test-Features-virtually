package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C16369 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f50358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f50359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f50360;

    public C16369(int i, String str, String str2) {
        this.f50360 = str;
        this.f50358 = str2;
        this.f50359 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16369)) {
            return false;
        }
        C16369 c16369 = (C16369) obj;
        return this.f50359 == c16369.f50359 && C11003.equals(this.f50360, c16369.f50360) && C11003.equals(this.f50358, c16369.f50358);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f50358) + C20361.m46680(this.f50359 * 31, 31, this.f50360);
    }

    public final String toString() {
        Object[] objArr = {this.f50360, this.f50358, Integer.valueOf(this.f50359)};
        String[] strArrSplit = "suffix;mimeType;priority".length() == 0 ? new String[0] : "suffix;mimeType;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C16369.class, sb, "[");
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
    public final String m38531() {
        return this.f50358;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38532() {
        return this.f50359;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m38533() {
        return this.f50360;
    }

    public C16369(String str, String str2) {
        this(Integer.MAX_VALUE, str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16369 m38530(C16369 c16369, int i) {
        return c16369.f50359 == i ? c16369 : new C16369(i, c16369.f50360, c16369.f50358);
    }
}
