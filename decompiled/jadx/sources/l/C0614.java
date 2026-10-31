package l;

/* JADX INFO: renamed from: l.֡᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48CR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18960[] f2368 = new C18960[16];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16842 f2369;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC4394 f2370;

    public C0614() {
        int i = 0;
        while (true) {
            C18960[] c18960Arr = this.f2368;
            if (i >= c18960Arr.length) {
                return;
            }
            c18960Arr[i] = new C18960(this, i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2529(C7216 c7216, AbstractC22487 abstractC22487) {
        this.f2370 = c7216;
        if (this.f2369 == null) {
            C16842 c16842 = new C16842();
            C8355 c8355 = new C8355("InputA");
            c16842.f51700 = c8355;
            c16842.m52649(c8355);
            C8355 c8356 = new C8355("InputB");
            c16842.f51701 = c8356;
            c16842.m52649(c8356);
            C15409 c15409 = new C15409("OutputB");
            c16842.f51699 = c15409;
            c16842.m52649(c15409);
            this.f2369 = c16842;
            c7216.m19307(c16842);
        }
        C19666 c19666 = new C19666(this, 64, abstractC22487);
        for (int i = 0; i < 16; i++) {
            this.f2368[i].m43770(c19666);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2527(int i, int i2) {
        this.f2368[i].m43772(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2528(int i, int i2, int i3) {
        this.f2368[i].m43768(i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2531(int i, int i2, int i3) {
        this.f2368[i].m43769(i2, ((double) i3) * 0.007874015748031496d * 0.25d);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2533(int i, double d) {
        this.f2368[i].m43774(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2526(int i, double d) {
        this.f2368[i].m43767(d);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2535(int i, double d) {
        this.f2368[i].m43776(d);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m2532(int i, double d) {
        this.f2368[i].m43773(d);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2534(int i, double d) {
        this.f2368[i].m43775(d);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m2536(int i, double d) {
        this.f2368[i].m43777(d);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2530(int i, double d) {
        this.f2368[i].m43771(d);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15409 m2525() {
        return this.f2369.f51699;
    }
}
