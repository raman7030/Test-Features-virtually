package l;

/* JADX INFO: renamed from: l.ۧۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10777 implements InterfaceC14303 {
    public final char a;

    public C10777(char c) {
        this.a = c;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (!c3015.b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
