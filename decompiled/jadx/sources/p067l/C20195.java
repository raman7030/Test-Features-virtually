package p067l;

/* JADX INFO: renamed from: l.ᩴ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6P4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20195 implements InterfaceC24346 {

    /* JADX INFO: renamed from: ֫ */
    public int f62485;

    /* JADX INFO: renamed from: ۧ */
    public int f62486;

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence f62487;

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final int mo8402() {
        return -1;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ܽ */
    public final void mo8409(int i) {
    }

    public C20195(CharSequence charSequence) {
        this.f62487 = charSequence;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final char m45698(int i) {
        return this.f62487.charAt(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m45697() {
        if (Thread.currentThread().isInterrupted()) {
            throw new C6113();
        }
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final void mo8406() {
        if (this.f62485 >= this.f62487.length()) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f62485 + 1;
        this.f62485 = i;
        if ((i & 1023) == 0) {
            m45697();
        }
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final int mo8405(int i) {
        int i2 = this.f62486 + 1;
        this.f62486 = i2;
        if ((i2 & 1023) == 0) {
            m45697();
        }
        if (i == 0) {
            return 0;
        }
        int i3 = this.f62485;
        if (i > 0) {
            i--;
        }
        int i4 = i3 + i;
        if (i4 < 0) {
            return -1;
        }
        CharSequence charSequence = this.f62487;
        if (i4 >= charSequence.length()) {
            return -1;
        }
        return charSequence.charAt(i4);
    }

    @Override // p067l.InterfaceC16219
    public final int index() {
        return this.f62485;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final void mo8403(int i) {
        this.f62485 = i;
    }

    @Override // p067l.InterfaceC16219
    public final int size() {
        return this.f62487.length();
    }

    @Override // p067l.InterfaceC24346
    /* JADX INFO: renamed from: ֫ */
    public final String mo13949(C16399 c16399) {
        int i = c16399.f48195;
        CharSequence charSequence = this.f62487;
        return C4965.m10523(i, Math.min(charSequence.length(), c16399.f48196 + 1), charSequence);
    }
}
