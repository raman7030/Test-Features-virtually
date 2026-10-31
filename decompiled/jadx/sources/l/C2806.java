package l;

/* JADX INFO: renamed from: l.ۖ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2806 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f8773;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f8774;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public char f8775;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f8776;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8777;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8681(char c) {
        char c2 = this.f8775;
        if (c2 != 0) {
            this.f8775 = (char) 0;
            if (Character.isLowSurrogate(c)) {
                m8679(Character.toCodePoint(c2, c));
                return;
            }
            m8679((int) c2);
        }
        if (Character.isHighSurrogate(c)) {
            this.f8775 = c;
        } else {
            m8679((int) c);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8679(int i) {
        boolean zIsLetterOrDigit;
        int i2 = C2164.f7153;
        boolean z = false;
        if (i > 127) {
            zIsLetterOrDigit = Character.isLetterOrDigit(i);
        } else {
            zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
        }
        boolean z2 = C2164.m7146(i) == 6;
        boolean z3 = i == 95 || zIsLetterOrDigit || (z2 && this.f8773);
        boolean z4 = Character.isLetter(i) || (i >= 48 && i <= 57);
        if (this.f8777 && !z4) {
            if (!z3) {
                this.f8774++;
            }
            this.f8777 = false;
        }
        if (z4 && !this.f8776) {
            this.f8777 = true;
        }
        boolean z5 = i <= 65535 && (zIsLetterOrDigit || (z2 && this.f8773));
        this.f8773 = z5;
        if (i == 95 || zIsLetterOrDigit || (z2 && z5)) {
            z = true;
        }
        this.f8776 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8680() {
        return this.f8774 + (this.f8777 ? 1L : 0L);
    }
}
