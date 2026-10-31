package l;

/* JADX INFO: renamed from: l.۬ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAP1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13277 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39751;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f39752;

    public C13277(CharSequence charSequence) {
        this.f39752 = charSequence;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32240() {
        int i = this.f39751;
        CharSequence charSequence = this.f39752;
        if (i >= charSequence.length()) {
            return null;
        }
        char cCharAt = charSequence.charAt(this.f39751);
        if (cCharAt == 'L') {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f39751;
            this.f39751 = i2 + 1;
            sb.append(charSequence.charAt(i2));
            while (this.f39751 < charSequence.length()) {
                int i3 = this.f39751;
                this.f39751 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                sb.append(cCharAt2);
                if (cCharAt2 == ';') {
                    break;
                }
            }
            return sb.toString();
        }
        if (cCharAt != '[') {
            this.f39751++;
            return String.valueOf(cCharAt);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f39751;
        this.f39751 = i4 + 1;
        sb2.append(charSequence.charAt(i4));
        while (this.f39751 < charSequence.length()) {
            char cCharAt3 = charSequence.charAt(this.f39751);
            if (cCharAt3 == '[') {
                this.f39751++;
                sb2.append(cCharAt3);
            } else {
                sb2.append(m32240());
                break;
            }
        }
        return sb2.toString();
    }
}
