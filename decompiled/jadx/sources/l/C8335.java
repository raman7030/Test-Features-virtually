package l;

/* JADX INFO: renamed from: l.۠ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R4RJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8335 extends AbstractC9747 implements InterfaceC2922, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f25548;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25549;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23589 f25550;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f25551;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7382 f25552;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C7382 f25553;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f25554;

    @Override // l.InterfaceC7860
    /* JADX INFO: renamed from: ܽ */
    public final int mo8424() {
        return 3;
    }

    public C8335(String str, int i, String str2, String str3, int i2) {
        super(i);
        this.f25549 = i2;
        this.f25554 = str;
        this.f25551 = str2;
        this.f25548 = str3;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ֫ */
    public final int mo8920() {
        return this.f25549;
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15347 mo8923() {
        C7382 c7382 = this.f25553;
        if (c7382 != null) {
            return c7382;
        }
        if (this.f25554 == null) {
            return null;
        }
        return new C0573(this);
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ۡ */
    public final InterfaceC21699 mo8921() {
        C23589 c23589 = this.f25550;
        if (c23589 != null) {
            return c23589;
        }
        if (this.f25551 == null) {
            return null;
        }
        return new C5513(this);
    }

    @Override // l.InterfaceC2922
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC15347 mo8922() {
        C7382 c7382 = this.f25552;
        if (c7382 != null) {
            return c7382;
        }
        if (this.f25548 == null) {
            return null;
        }
        return new C1279(this);
    }

    @Override // l.InterfaceC21972
    public final String getName() {
        return this.f25554;
    }

    @Override // l.InterfaceC21972
    public final String getType() {
        return this.f25551;
    }

    @Override // l.InterfaceC21972
    public final String getSignature() {
        return this.f25548;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f25553 = c19357.m44608(this.f25554);
        this.f25552 = c19357.m44608(this.f25548);
        String str = this.f25551;
        this.f25550 = str != null ? c19357.f68957.m34448(str) : null;
    }
}
