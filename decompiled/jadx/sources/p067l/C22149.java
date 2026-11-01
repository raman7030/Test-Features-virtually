package p067l;

/* JADX INFO: renamed from: l.᩷ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16QA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22149 implements InterfaceC24346 {

    /* JADX INFO: renamed from: ֫ */
    public int f70066;

    /* JADX INFO: renamed from: ۧ */
    public int f70067;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f70068;

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final int mo8402() {
        return -1;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ܽ */
    public final void mo8409(int i) {
    }

    public C22149(CharSequence charSequence) {
        this.f70068 = charSequence;
        m49958();
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m49959() {
        return this.f70068;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m49958() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C8737();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m49957(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if ((i & 1023) == 0) {
                m49958();
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

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final void mo8406() {
        if (this.f70066 >= this.f70068.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f70066 + 1;
        this.f70066 = i;
        if ((i & 1023) == 0) {
            m49958();
        }
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final int mo8405(int i) {
        int i2 = this.f70067 + 1;
        this.f70067 = i2;
        if ((i2 & 1023) == 0) {
            m49958();
        }
        if (i == 0) {
            return 0;
        }
        long j = this.f70066;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f70068;
        if (j2 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt((int) j2);
    }

    @Override // p067l.InterfaceC16219
    public final int index() {
        return this.f70066;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final void mo8403(int i) {
        this.f70066 = i;
    }

    @Override // p067l.InterfaceC16219
    public final int size() {
        return this.f70068.length();
    }

    @Override // p067l.InterfaceC24346
    /* JADX INFO: renamed from: ֫ */
    public final String mo13949(C16399 c16399) {
        int i = c16399.f48195;
        CharSequence charSequence = this.f70068;
        return C4965.m10523(i, Math.min(charSequence.length(), c16399.f48196 + 1), charSequence);
    }
}
