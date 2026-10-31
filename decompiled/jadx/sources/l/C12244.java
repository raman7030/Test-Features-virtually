package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final class C12244 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19883 f36497;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f36498;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f36499;

    public C12244(String str, String str2, C19883 c19883) {
        this.f36499 = str;
        this.f36498 = str2;
        this.f36497 = c19883;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12244)) {
            return false;
        }
        C12244 c12244 = (C12244) obj;
        return C11003.equals(this.f36499, c12244.f36499) && C11003.equals(this.f36498, c12244.f36498) && C11003.equals(this.f36497, c12244.f36497);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f36497) + C20361.m46680(C11003.hashCode(this.f36499) * 31, 31, this.f36498);
    }

    public final String toString() {
        Object[] objArr = {this.f36499, this.f36498, this.f36497};
        String[] strArrSplit = "title;path;icon".length() == 0 ? new String[0] : "title;path;icon".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C12244.class, sb, "[");
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
    public final C19883 m29742() {
        return this.f36497;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m29743() {
        return this.f36498;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m29744() {
        return this.f36499;
    }
}
