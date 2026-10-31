package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21516 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1553 f69177;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence f69178;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4582 f69179;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC22221 f69180;

    public C21516(EnumC22221 enumC22221, CharSequence charSequence, C4582 c4582, C1553 c1553) {
        this.f69180 = enumC22221;
        this.f69178 = charSequence;
        this.f69179 = c4582;
        this.f69177 = c1553;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21516)) {
            return false;
        }
        C21516 c21516 = (C21516) obj;
        return C11003.equals(this.f69180, c21516.f69180) && C11003.equals(this.f69178, c21516.f69178) && C11003.equals(this.f69179, c21516.f69179) && C11003.equals(this.f69177, c21516.f69177);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f69177) + ((C11003.hashCode(this.f69179) + ((C11003.hashCode(this.f69178) + (C11003.hashCode(this.f69180) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f69180, this.f69178, this.f69179, this.f69177};
        String[] strArrSplit = "type;title;trackOption;subtitleMatch".length() == 0 ? new String[0] : "type;title;trackOption;subtitleMatch".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21516.class, sb, "[");
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
    public final C1553 m48682() {
        return this.f69177;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC22221 m48683() {
        return this.f69180;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m48684() {
        return this.f69178;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C4582 m48685() {
        return this.f69179;
    }
}
