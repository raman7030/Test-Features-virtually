package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4582 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f14619;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23190 f14620;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f14621;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14622;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f14623;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f14624;

    public C4582(C23190 c23190, int i, String str, String str2, String str3, int i2) {
        this.f14620 = c23190;
        this.f14623 = i;
        this.f14624 = str;
        this.f14621 = str2;
        this.f14619 = str3;
        this.f14622 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4582)) {
            return false;
        }
        C4582 c4582 = (C4582) obj;
        return this.f14623 == c4582.f14623 && this.f14622 == c4582.f14622 && C11003.equals(this.f14620, c4582.f14620) && C11003.equals(this.f14624, c4582.f14624) && C11003.equals(this.f14621, c4582.f14621) && C11003.equals(this.f14619, c4582.f14619);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f14619) + C20361.m46680(C20361.m46680((C11003.hashCode(this.f14620) + C4153.m12551(this.f14623, 31, this.f14622, 31)) * 31, 31, this.f14624), 31, this.f14621);
    }

    public final String toString() {
        Object[] objArr = {this.f14620, Integer.valueOf(this.f14623), this.f14624, this.f14621, this.f14619, Integer.valueOf(this.f14622)};
        String[] strArrSplit = "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".length() == 0 ? new String[0] : "group;trackIndex;trackId;trackLabel;displayName;logicalIndex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C4582.class, sb, "[");
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
    public final CharSequence m13474() {
        return this.f14619;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m13475() {
        return this.f14621;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m13476() {
        return this.f14624;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23190 m13477() {
        return this.f14620;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m13478() {
        return this.f14622;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m13479() {
        return this.f14623;
    }
}
