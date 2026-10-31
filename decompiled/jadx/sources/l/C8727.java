package l;

/* JADX INFO: renamed from: l.ۡ۟֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N4U4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8727 extends AbstractC15781 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12918 f26566;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f26567;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26568 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26569;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18729 f26570;

    public C8727(C12918 c12918, int i) {
        this.f26569 = -1;
        this.f26566 = c12918;
        C18729 c18729M11939 = c12918.m31418().m11939(i);
        this.f26570 = c18729M11939;
        int iM43368 = c18729M11939.m43368();
        this.f26567 = iM43368;
        if (this.f26568 >= iM43368) {
            this.f26569 = c18729M11939.m43364();
            c18729M11939.m43359();
        }
    }

    @Override // l.AbstractC15781
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10410 mo22558() {
        int i = this.f26568;
        int i2 = this.f26567;
        if (i >= i2) {
            return null;
        }
        this.f26568 = i + 1;
        C12918 c12918 = this.f26566;
        C18729 c18729 = this.f26570;
        InterfaceC10410 interfaceC10410M26390 = AbstractC10494.m26390(c12918, c18729);
        if (this.f26568 >= i2) {
            this.f26569 = c18729.m43364();
            c18729.m43359();
        }
        return interfaceC10410M26390;
    }

    @Override // l.AbstractC15781
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo22560() {
        int i = this.f26568;
        int i2 = this.f26567;
        if (i < i2) {
            this.f26568 = i + 1;
            C18729 c18729 = this.f26570;
            AbstractC10494.m26391(c18729);
            if (this.f26568 >= i2) {
                this.f26569 = c18729.m43364();
                c18729.m43359();
            }
        }
    }

    @Override // l.AbstractC15781
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo22559() {
        int i = this.f26569;
        return i == -1 ? this.f26570.m43364() : i;
    }

    @Override // l.AbstractC15781
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo22557() {
        return this.f26567;
    }
}
