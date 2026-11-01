package p067l;

/* JADX INFO: renamed from: l.ۚ֫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7160 {

    /* JADX INFO: renamed from: ֫ */
    public int f18685;

    /* JADX INFO: renamed from: ۧ */
    public final StringBuilder f18686 = new StringBuilder();

    /* JADX INFO: renamed from: ܽ */
    public CharSequence f18687;

    public C7160(int i, CharSequence charSequence) {
        this.f18687 = charSequence;
        this.f18685 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m16466() {
        CharSequence charSequence;
        char cCharAt;
        while (true) {
            int i = this.f18685;
            charSequence = this.f18687;
            if (i < 0 || !((cCharAt = charSequence.charAt(i)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r')) {
                break;
            }
            this.f18685--;
        }
        StringBuilder sb = this.f18686;
        sb.setLength(0);
        while (true) {
            int i2 = this.f18685;
            if (i2 >= 0) {
                char cCharAt2 = charSequence.charAt(i2);
                if (cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\r') {
                    break;
                }
                sb.append(cCharAt2);
                this.f18685--;
            } else {
                return sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }
}
