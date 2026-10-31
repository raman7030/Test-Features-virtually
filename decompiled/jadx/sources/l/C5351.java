package l;

/* JADX INFO: renamed from: l.ۚ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5351 implements InterfaceC0463 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f16676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16677;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f16678;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16679;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1117 f16680;

    public C5351(C1117 c1117, int i, int i2, int i3, int i4) {
        this.f16680 = c1117;
        this.f16678 = i;
        this.f16677 = i2;
        this.f16679 = i3;
        this.f16676 = i4;
    }

    @Override // l.InterfaceC0463
    public final String getText() {
        C1117 c1117 = this.f16680;
        int size = c1117.f4072.size();
        int i = this.f16678;
        return i >= size ? "<EOF>" : c1117.f4072.mo12025(C14763.m35067(i, this.f16677));
    }

    @Override // l.InterfaceC0463
    public final int getType() {
        return this.f16676 >> 1;
    }

    @Override // l.InterfaceC0463
    public final int getLine() {
        return C1117.m3829(this.f16680, this.f16678) + 1;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ֫ */
    public final int mo2049() {
        C1117 c1117 = this.f16680;
        int i = this.f16678;
        return i - c1117.f4074[C1117.m3829(c1117, i)];
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ۧ */
    public final int mo2050() {
        return this.f16676 & 1;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܽ */
    public final int mo2052() {
        return this.f16679;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ᩳ */
    public final int mo2054() {
        return this.f16678;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܿ */
    public final int mo2053() {
        return this.f16677;
    }

    @Override // l.InterfaceC0463
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC1169 mo2051() {
        return this.f16680.f4073;
    }

    @Override // l.InterfaceC0463
    public final InterfaceC23125 getInputStream() {
        return this.f16680.f4072;
    }
}
