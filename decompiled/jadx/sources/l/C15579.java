package l;

/* JADX INFO: renamed from: l.ܺ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15579 implements InterfaceC5577 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f47998;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0637 f47999;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f48000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5577 f48001;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21658 f48002;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0637 f48003;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16431 f48004;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7819 f48005;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19689 f48006;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48007;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f48008 = true;

    public C15579(AbstractC13921 abstractC13921, C17843 c17843, InterfaceC19689 interfaceC19689) {
        this.f48006 = interfaceC19689;
        C16431 c16431 = new C16431(null, abstractC13921, c17843, EnumC10788.NORMAL, null);
        c16431.m38735(new C18403(interfaceC19689));
        this.f48004 = c16431;
        C9231 c9231 = new C9231(this, interfaceC19689);
        this.f47999 = c9231;
        C8525 c8525 = new C8525(this);
        this.f48003 = c8525;
        C7819 c7819 = new C7819(abstractC13921, c16431, c9231);
        this.f48005 = c7819;
        this.f48002 = new C21658(c16431, c8525);
        this.f48001 = c7819;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36741(C15579 c15579, C11197 c11197, InterfaceC5577 interfaceC5577, C0637 c0637, C0637 c0638) {
        c15579.f48001.reset();
        c15579.f48001 = interfaceC5577;
        c0637.m2595(InterfaceC5577.f17276);
        c0638.m2595(c15579.f48006);
        c15579.f47998 = false;
        c15579.f48007 = true;
        c15579.f48001.mo15848(c11197);
    }

    @Override // l.InterfaceC5577
    public final void reset() {
        this.f48001.reset();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15847(int i, RunnableC16865 runnableC16865) {
        this.f48001.mo15847(i, runnableC16865);
    }

    @Override // l.InterfaceC5577
    public final int getCurrentPosition() {
        return this.f48001.getCurrentPosition();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ۧ */
    public final void mo15849() {
        this.f48001.mo15849();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15852() {
        this.f48001.mo15852();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15845() {
        this.f48005.mo15845();
        this.f48002.mo15845();
        C16431 c16431 = this.f48004;
        c16431.m38742();
        c16431.m38740();
        this.f48000 = true;
    }

    @Override // l.InterfaceC5577
    public final void pause() {
        if (this.f48007) {
            return;
        }
        if (this.f47998) {
            this.f48001.pause();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC5577
    public final void start() {
        if (this.f48007) {
            return;
        }
        if (this.f47998) {
            this.f48001.start();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15848(C11197 c11197) {
        boolean z;
        if (this.f48007 || this.f48000) {
            throw new IllegalStateException();
        }
        C11881 c11881 = c11197.f33612;
        if (c11881 != null) {
            Object obj = c11881.f35422;
            if ((obj instanceof InterfaceC17889) && ((InterfaceC17889) obj).getName().toLowerCase().endsWith(".wav")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.f48008 = z;
        InterfaceC5577 interfaceC5577 = z ? this.f48005 : this.f48002;
        InterfaceC5577 interfaceC5578 = this.f48001;
        if (interfaceC5578 != interfaceC5577) {
            interfaceC5578.reset();
            this.f48001 = interfaceC5577;
            InterfaceC19689 interfaceC19689 = this.f48006;
            C0637 c0637 = this.f47999;
            InterfaceC19689 interfaceC196810 = InterfaceC5577.f17276;
            C0637 c0638 = this.f48003;
            if (z) {
                c0638.m2595(interfaceC196810);
                c0637.m2595(interfaceC19689);
            } else {
                c0637.m2595(interfaceC196810);
                c0638.m2595(interfaceC19689);
            }
        }
        this.f47998 = false;
        this.f48007 = true;
        this.f48001.mo15848(c11197);
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo15851() {
        return this.f48007;
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ֫ */
    public final void mo15846(float f) {
        if (this.f47998) {
            this.f48001.mo15846(f);
        }
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo15850() {
        return this.f47998;
    }

    @Override // l.InterfaceC5577
    public final boolean isPlaying() {
        return this.f48001.isPlaying();
    }

    @Override // l.InterfaceC5577
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo15853() {
        return this.f48000;
    }
}
