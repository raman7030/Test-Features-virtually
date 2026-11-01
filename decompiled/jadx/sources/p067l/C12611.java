package p067l;

/* JADX INFO: renamed from: l.ۧۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12611 implements InterfaceC15962 {

    /* JADX INFO: renamed from: a */
    public final char f35403a;

    public C12611(char c) {
        this.f35403a = c;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        sb.append(this.f35403a);
        return true;
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.f35403a;
        return (cCharAt == c || (!c5234.f12335b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.f35403a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
