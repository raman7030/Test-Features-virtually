package l;

/* JADX INFO: renamed from: l.᩷ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20813 implements InterfaceC23125 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f67383;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67384;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence f67385;

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final int mo6200() {
        return -1;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ܽ */
    public final void mo6207(int i) {
    }

    public C20813(CharSequence charSequence) {
        this.f67385 = charSequence;
        m47630();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CharSequence m47631() {
        return this.f67385;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m47630() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C6701();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47629(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                m47630();
            }
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n') {
                return "\n";
            }
            if (cCharAt == '\r') {
                int i2 = i + 1;
                return (i2 >= charSequence.length() || charSequence.charAt(i2) != '\n') ? "\r" : "\r\n";
            }
        }
        return "\n";
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final void mo6204() {
        if (this.f67383 >= this.f67385.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f67383 + 1;
        this.f67383 = i;
        if ((i & 1023) == 0) {
            m47630();
        }
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final int mo6203(int i) {
        int i2 = this.f67384 + 1;
        this.f67384 = i2;
        if ((i2 & 1023) == 0) {
            m47630();
        }
        if (i == 0) {
            return 0;
        }
        long j = this.f67383;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f67385;
        if (j2 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt((int) j2);
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f67383;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final void mo6201(int i) {
        this.f67383 = i;
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f67385.length();
    }

    @Override // l.InterfaceC23125
    /* JADX INFO: renamed from: ֫ */
    public final String mo12025(C14763 c14763) {
        int i = c14763.f45081;
        CharSequence charSequence = this.f67385;
        return C2732.m8476(i, Math.min(charSequence.length(), c14763.f45082 + 1), charSequence);
    }
}
