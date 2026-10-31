package l;

/* JADX INFO: renamed from: l.ᩴ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18960 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23171 f59798;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C10472 f59799;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11883 f59800;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11883 f59801;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0614 f59802;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59803;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7649 f59804;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19666 f59806;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13998 f59807;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2026 f59808;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f59809;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f59810;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double f59797 = 0.16666666666666666d;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC20371 f59805 = new C4143(this);

    public C18960(C0614 c0614, int i) {
        this.f59802 = c0614;
        this.f59803 = i;
        if (i == 9) {
            this.f59809 = true;
            this.f59810 = 128;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43770(C19666 c19666) {
        this.f59806 = c19666;
        C0614 c0614 = this.f59802;
        InterfaceC4394 interfaceC4394 = c0614.f2370;
        C7649 c7649 = new C7649();
        this.f59804 = c7649;
        ((C7216) interfaceC4394).m19307(c7649);
        InterfaceC4394 interfaceC4395 = c0614.f2370;
        C2026 c2026 = new C2026();
        C8355 c8355 = new C8355("Frequency");
        c2026.f6759 = c8355;
        c2026.m52649(c8355);
        c8355.m21953(40.0d, 440.0d, 8000.0d);
        C8355 c8356 = new C8355(1, "Amplitude", 1.0d);
        c2026.f6757 = c8356;
        c2026.m52649(c8356);
        C22466 c22466 = new C22466("Phase");
        c2026.f6758 = c22466;
        c2026.m52649(c22466);
        C15409 c15409 = new C15409(0);
        c2026.f6756 = c15409;
        c2026.m52649(c15409);
        this.f59808 = c2026;
        ((C7216) interfaceC4395).m19307(c2026);
        InterfaceC4394 interfaceC4396 = c0614.f2370;
        C11883 c11883 = new C11883();
        this.f59801 = c11883;
        ((C7216) interfaceC4396).m19307(c11883);
        this.f59801.f35427.m21952(0.02d);
        InterfaceC4394 interfaceC4397 = c0614.f2370;
        C11883 c11884 = new C11883();
        this.f59800 = c11884;
        ((C7216) interfaceC4397).m19307(c11884);
        this.f59800.f35427.m21952(0.02d);
        InterfaceC4394 interfaceC4398 = c0614.f2370;
        C10472 c10472 = new C10472();
        this.f59799 = c10472;
        ((C7216) interfaceC4398).m19307(c10472);
        this.f59799.f53642.m21952(1.0d);
        this.f59799.f31431.m21952(0.02d);
        InterfaceC4394 interfaceC4399 = c0614.f2370;
        C23171 c23171 = new C23171();
        this.f59798 = c23171;
        ((C7216) interfaceC4399).m19307(c23171);
        InterfaceC4394 interfaceC43910 = c0614.f2370;
        C13998 c13998 = new C13998();
        C8355 c8357 = new C8355("Input");
        c13998.f41726 = c8357;
        c13998.m52649(c8357);
        C8355 c8358 = new C8355("Pan");
        c13998.f41725 = c8358;
        c13998.m52649(c8358);
        c8358.m21953(-1.0d, 0.0d, 1.0d);
        C15409 c154010 = new C15409("Output");
        c13998.f41727 = c154010;
        c13998.m52649(c154010);
        this.f59807 = c13998;
        ((C7216) interfaceC43910).m19307(c13998);
        this.f59804.f23621.m21960();
        this.f59808.f6756.m36460(0, this.f59804.f23621, 0);
        this.f59808.f6757.m21952(0.0d);
        this.f59808.f6759.m21952(5.0d);
        this.f59799.f53643.m36460(0, this.f59798.f56768, 0);
        this.f59798.f56766.m36460(0, this.f59807.f41726, 0);
        this.f59807.f41727.m36460(0, c0614.f2369.f51700, 0);
        this.f59807.f41727.m36460(1, c0614.f2369.f51701, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43766(C18960 c18960, InterfaceC21077 interfaceC21077) {
        AbstractC23898 abstractC23898 = (AbstractC23898) interfaceC21077;
        C8355 c8355 = (C8355) abstractC23898.mo14057("FreqScaler");
        if (c8355 != null) {
            c8355.m38022();
            c18960.f59804.f23622.m36460(0, c8355, 0);
        }
        C8355 c8356 = (C8355) abstractC23898.mo14057("Timbre");
        if (c8356 != null) {
            c8356.m38022();
            c18960.f59801.f53643.m36460(0, c8356, 0);
            c18960.f59801.f53642.m21956(c8356);
        }
        C8355 c8357 = (C8355) abstractC23898.mo14057("Pressure");
        if (c8357 != null) {
            c8357.m38022();
            c18960.f59800.f53643.m36460(0, c8357, 0);
            c18960.f59800.f53642.m21956(c8357);
        }
        interfaceC21077.mo6592().m38022();
        interfaceC21077.mo6592().m36460(0, c18960.f59798.f56767, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43772(int i) {
        if (this.f59809) {
            return;
        }
        int iM50440 = i % this.f59806.f63520.m50440();
        String str = this.f59806.f63520.m50441()[iM50440];
        this.f59810 = iM50440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43768(int i) {
        C21245 c21245M19305 = ((C7216) this.f59802.f2370).m19305();
        C21782 c21782 = this.f59806.f63519;
        int i2 = (this.f59803 << 8) + i;
        ((C7216) c21782.m49111()).m19306(c21245M19305, new C8376(c21782, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43769(int i, double d) {
        C21245 c21245M19305 = ((C7216) this.f59802.f2370).m19305();
        double dM2989 = C0782.m2989(i);
        C21782 c21782 = this.f59806.f63519;
        ((C7216) c21782.m49111()).m19306(c21245M19305, new C1320(c21782, (this.f59803 << 8) + i, this.f59805, dM2989, d));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43774(double d) {
        this.f59804.f23621.m21952(this.f59797 * d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43767(double d) {
        this.f59797 = d / 12.0d;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m43773(double d) {
        this.f59808.f6757.m21952(d);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m43777(double d) {
        this.f59799.f53642.m21952(Math.pow(63095.73444801944d, d) * 1.5848931924611107E-5d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43771(double d) {
        this.f59807.f41725.m21952(d);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m43775(double d) {
        double dM21961 = this.f59801.f53642.m21961();
        this.f59801.f53642.m21952(((this.f59801.f53642.m21959() - dM21961) * d) + dM21961);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43776(double d) {
        double dM21961 = this.f59800.f53642.m21961();
        this.f59800.f53642.m21952(Math.pow(this.f59800.f53642.m21959() / dM21961, d) * dM21961);
    }
}
