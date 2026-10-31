package l;

/* JADX INFO: renamed from: l.ۚ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5042 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15853;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f15854 = new StringBuilder();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharSequence f15855;

    public C5042(int i, CharSequence charSequence) {
        this.f15855 = charSequence;
        this.f15853 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m14562() {
        CharSequence charSequence;
        char cCharAt;
        while (true) {
            int i = this.f15853;
            charSequence = this.f15855;
            if (i < 0 || !((cCharAt = charSequence.charAt(i)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) {
                break;
            }
            this.f15853--;
        }
        StringBuilder sb = this.f15854;
        sb.setLength(0);
        while (true) {
            int i2 = this.f15853;
            if (i2 >= 0) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r') {
                    break;
                }
                sb.append(cCharAt2);
                this.f15853--;
            } else {
                return sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }
}
