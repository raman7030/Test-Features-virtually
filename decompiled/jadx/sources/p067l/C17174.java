package p067l;

/* JADX INFO: renamed from: l.ܺ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17174 implements InterfaceC7669 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f51130;

    /* JADX INFO: renamed from: ۡ */
    public final C2974 f51131;

    /* JADX INFO: renamed from: ۢ */
    public boolean f51132;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC7669 f51133;

    /* JADX INFO: renamed from: ܳ */
    public final C22952 f51134;

    /* JADX INFO: renamed from: ܺ */
    public final C2974 f51135;

    /* JADX INFO: renamed from: ܽ */
    public final C17984 f51136;

    /* JADX INFO: renamed from: ܿ */
    public final C9799 f51137;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC21081 f51138;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f51139;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f51140 = true;

    public C17174(AbstractC15599 abstractC15599, C19326 c19326, InterfaceC21081 interfaceC21081) {
        this.f51138 = interfaceC21081;
        C17984 c17984 = new C17984(null, abstractC15599, c19326, EnumC12621.NORMAL, null);
        c17984.m40960(new C19858(interfaceC21081));
        this.f51136 = c17984;
        C11141 c11141 = new C11141(this, interfaceC21081);
        this.f51131 = c11141;
        C10470 c10470 = new C10470(this);
        this.f51135 = c10470;
        C9799 c9799 = new C9799(abstractC15599, c17984, c11141);
        this.f51137 = c9799;
        this.f51134 = new C22952(c17984, c10470);
        this.f51133 = c9799;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38901(C17174 c17174, C13010 c13010, InterfaceC7669 interfaceC7669, C2974 c2974, C2974 c2975) {
        c17174.f51133.reset();
        c17174.f51133 = interfaceC7669;
        c2974.m4935(InterfaceC7669.f20116);
        c2975.m4935(c17174.f51138);
        c17174.f51130 = false;
        c17174.f51139 = true;
        c17174.f51133.mo17763(c13010);
    }

    @Override // p067l.InterfaceC7669
    public final void reset() {
        this.f51133.reset();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17762(int i, RunnableC18397 runnableC18397) {
        this.f51133.mo17762(i, runnableC18397);
    }

    @Override // p067l.InterfaceC7669
    public final int getCurrentPosition() {
        return this.f51133.getCurrentPosition();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ۧ */
    public final void mo17764() {
        this.f51133.mo17764();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17767() {
        this.f51133.mo17767();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17760() {
        this.f51137.mo17760();
        this.f51134.mo17760();
        C17984 c17984 = this.f51136;
        c17984.m40967();
        c17984.m40965();
        this.f51132 = true;
    }

    @Override // p067l.InterfaceC7669
    public final void pause() {
        if (this.f51139) {
            return;
        }
        if (this.f51130) {
            this.f51133.pause();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // p067l.InterfaceC7669
    public final void start() {
        if (this.f51139) {
            return;
        }
        if (this.f51130) {
            this.f51133.start();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17763(C13010 c13010) {
        boolean z;
        if (this.f51139 || this.f51132) {
            throw new IllegalStateException();
        }
        C13660 c13660 = c13010.f36611;
        if (c13660 != null) {
            Object obj = c13660.f38432;
            if ((obj instanceof InterfaceC19370) && ((InterfaceC19370) obj).getName().toLowerCase().endsWith(".wav")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.f51140 = z;
        InterfaceC7669 interfaceC7669 = z ? this.f51137 : this.f51134;
        InterfaceC7669 interfaceC76610 = this.f51133;
        if (interfaceC76610 != interfaceC7669) {
            interfaceC76610.reset();
            this.f51133 = interfaceC7669;
            InterfaceC21081 interfaceC21081 = this.f51138;
            C2974 c2974 = this.f51131;
            InterfaceC21081 interfaceC21082 = InterfaceC7669.f20116;
            C2974 c2975 = this.f51135;
            if (z) {
                c2975.m4935(interfaceC21082);
                c2974.m4935(interfaceC21081);
            } else {
                c2974.m4935(interfaceC21082);
                c2975.m4935(interfaceC21081);
            }
        }
        this.f51130 = false;
        this.f51139 = true;
        this.f51133.mo17763(c13010);
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo17766() {
        return this.f51139;
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ֫ */
    public final void mo17761(float f) {
        if (this.f51130) {
            this.f51133.mo17761(f);
        }
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo17765() {
        return this.f51130;
    }

    @Override // p067l.InterfaceC7669
    public final boolean isPlaying() {
        return this.f51133.isPlaying();
    }

    @Override // p067l.InterfaceC7669
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo17768() {
        return this.f51132;
    }
}
