package p067l;

/* JADX INFO: renamed from: l.۬ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAP1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14987 {

    /* JADX INFO: renamed from: ֫ */
    public int f42816;

    /* JADX INFO: renamed from: ۧ */
    public CharSequence f42817;

    public C14987(CharSequence charSequence) {
        this.f42817 = charSequence;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34339() {
        int i = this.f42816;
        CharSequence charSequence = this.f42817;
        if (i >= charSequence.length()) {
            return null;
        }
        char cCharAt = charSequence.charAt(this.f42816);
        if (cCharAt == 'L') {
            StringBuilder sb = new StringBuilder();
            int i2 = this.f42816;
            this.f42816 = i2 + 1;
            sb.append(charSequence.charAt(i2));
            while (this.f42816 < charSequence.length()) {
                int i3 = this.f42816;
                this.f42816 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                sb.append(cCharAt2);
                if (cCharAt2 == ';') {
                    break;
                }
            }
            return sb.toString();
        }
        if (cCharAt != '[') {
            this.f42816++;
            return String.valueOf(cCharAt);
        }
        StringBuilder sb2 = new StringBuilder();
        int i4 = this.f42816;
        this.f42816 = i4 + 1;
        sb2.append(charSequence.charAt(i4));
        while (this.f42816 < charSequence.length()) {
            char cCharAt3 = charSequence.charAt(this.f42816);
            if (cCharAt3 == '[') {
                this.f42816++;
                sb2.append(cCharAt3);
            } else {
                sb2.append(m34339());
                break;
            }
        }
        return sb2.toString();
    }
}
