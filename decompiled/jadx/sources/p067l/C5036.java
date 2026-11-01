package p067l;

/* JADX INFO: renamed from: l.ۖ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6NC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5036 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f11567;

    /* JADX INFO: renamed from: ۧ */
    public long f11568;

    /* JADX INFO: renamed from: ܽ */
    public char f11569;

    /* JADX INFO: renamed from: ܿ */
    public boolean f11570;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f11571;

    /* JADX INFO: renamed from: ֫ */
    public final void m10741(char c) {
        char c2 = this.f11569;
        if (c2 != 0) {
            this.f11569 = (char) 0;
            if (Character.isLowSurrogate(c)) {
                m10739(Character.toCodePoint(c2, c));
                return;
            }
            m10739((int) c2);
        }
        if (Character.isHighSurrogate(c)) {
            this.f11569 = c;
        } else {
            m10739((int) c);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10739(int i) {
        boolean zIsLetterOrDigit;
        int i2 = C4426.f9939;
        boolean z = false;
        if (i > 127) {
            zIsLetterOrDigit = Character.isLetterOrDigit(i);
        } else {
            zIsLetterOrDigit = (97 <= i && i <= 122) || (65 <= i && i <= 90) || (48 <= i && i <= 57);
        }
        boolean z2 = C4426.m9241(i) == 6;
        boolean z3 = i == 95 || zIsLetterOrDigit || (z2 && this.f11567);
        boolean z4 = Character.isLetter(i) || (i >= 48 && i <= 57);
        if (this.f11571 && !z4) {
            if (!z3) {
                this.f11568++;
            }
            this.f11571 = false;
        }
        if (z4 && !this.f11570) {
            this.f11571 = true;
        }
        boolean z5 = i <= 65535 && (zIsLetterOrDigit || (z2 && this.f11567));
        this.f11567 = z5;
        if (i == 95 || zIsLetterOrDigit || (z2 && z5)) {
            z = true;
        }
        this.f11570 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m10740() {
        return this.f11568 + (this.f11571 ? 1L : 0L);
    }
}
