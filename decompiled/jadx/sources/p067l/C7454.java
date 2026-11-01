package p067l;

/* JADX INFO: renamed from: l.ۚ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7454 implements InterfaceC2808 {

    /* JADX INFO: renamed from: ۗ */
    public final int f19515;

    /* JADX INFO: renamed from: ۙ */
    public final int f19516;

    /* JADX INFO: renamed from: ᩶ */
    public final int f19517;

    /* JADX INFO: renamed from: ᩸ */
    public final int f19518;

    /* JADX INFO: renamed from: ᩹ */
    public final C3430 f19519;

    public C7454(C3430 c3430, int i, int i2, int i3, int i4) {
        this.f19519 = c3430;
        this.f19517 = i;
        this.f19516 = i2;
        this.f19518 = i3;
        this.f19515 = i4;
    }

    @Override // p067l.InterfaceC2808
    public final String getText() {
        C3430 c3430 = this.f19519;
        int size = c3430.f6843.size();
        int i = this.f19517;
        return i >= size ? "<EOF>" : c3430.f6843.mo13949(C16399.m37214(i, this.f19516));
    }

    @Override // p067l.InterfaceC2808
    public final int getType() {
        return this.f19515 >> 1;
    }

    @Override // p067l.InterfaceC2808
    public final int getLine() {
        return C3430.m6086(this.f19519, this.f19517) + 1;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ֫ */
    public final int mo4429() {
        C3430 c3430 = this.f19519;
        int i = this.f19517;
        return i - c3430.f6845[C3430.m6086(c3430, i)];
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ۧ */
    public final int mo4430() {
        return this.f19515 & 1;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܽ */
    public final int mo4432() {
        return this.f19518;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ᩳ */
    public final int mo4434() {
        return this.f19517;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܿ */
    public final int mo4433() {
        return this.f19516;
    }

    @Override // p067l.InterfaceC2808
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC3479 mo4431() {
        return this.f19519.f6844;
    }

    @Override // p067l.InterfaceC2808
    public final InterfaceC24346 getInputStream() {
        return this.f19519.f6843;
    }
}
