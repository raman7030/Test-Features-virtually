package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final class C7404 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f22780;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f22781;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f22782;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f22783;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23190 f22784;

    public C7404(C23190 c23190, int i, C8353 c8353, String str, String str2) {
        this.f22784 = c23190;
        this.f22783 = i;
        this.f22782 = c8353;
        this.f22781 = str;
        this.f22780 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7404)) {
            return false;
        }
        C7404 c7404 = (C7404) obj;
        return this.f22783 == c7404.f22783 && C11003.equals(this.f22784, c7404.f22784) && C11003.equals(this.f22782, c7404.f22782) && C11003.equals(this.f22781, c7404.f22781) && C11003.equals(this.f22780, c7404.f22780);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f22780) + C20361.m46680((C11003.hashCode(this.f22782) + ((C11003.hashCode(this.f22784) + (this.f22783 * 31)) * 31)) * 31, 31, this.f22781);
    }

    public final String toString() {
        Object[] objArr = {this.f22784, Integer.valueOf(this.f22783), this.f22782, this.f22781, this.f22780};
        String[] strArrSplit = "group;trackIndex;format;displayName;compactName".length() == 0 ? new String[0] : "group;trackIndex;format;displayName;compactName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C7404.class, sb, "[");
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
    public final String m19923() {
        return this.f22780;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C23190 m19924() {
        return this.f22784;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m19925() {
        return this.f22781;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8353 m19926() {
        return this.f22782;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m19927() {
        return this.f22783;
    }
}
