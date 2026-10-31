package l;

/* JADX INFO: renamed from: l.ۙ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8I7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4930 implements InterfaceC1837, InterfaceC18065 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f15541;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f15542;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15543;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C8353[] f15545;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13830 f15546;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public long f15547;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC16653 f15548;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15894 f15549;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC18882 f15551;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f15552;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final int f15553;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f15556;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17359 f15557;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f15558;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f15550 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3002 f15555 = new C3002();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f15544 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public AbstractC4846 f15554 = AbstractC4846.f15313;

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo6085(float f, float f2) {
    }

    @Override // l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public void mo13450(int i, Object obj) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo13451(long j, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public void mo13457(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC4930 mo6093() {
        return this;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۚ */
    public InterfaceC22757 mo6094() {
        return null;
    }

    /* JADX INFO: renamed from: ۛ */
    public void mo13461() {
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۜ */
    public /* synthetic */ void mo6095() {
    }

    /* JADX INFO: renamed from: ۟ */
    public void mo13462() {
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo13464();

    /* JADX INFO: renamed from: ܰ */
    public void mo13466() {
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int mo14368() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩺ */
    public void mo13473() {
    }

    public AbstractC4930(int i) {
        this.f15553 = i;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۖ */
    public final int mo6092() {
        return this.f15553;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public boolean mo6098() {
        return mo6104();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6086(int i, C13830 c13830, InterfaceC16427 interfaceC16427) {
        this.f15543 = i;
        this.f15546 = c13830;
        this.f15556 = interfaceC16427;
    }

    @Override // l.InterfaceC1837
    public final int getState() {
        return this.f15558;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public long mo6097(long j, long j2) {
        if (this.f15558 == 1) {
            return (mo6101() || mo6098()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6090(C17359 c17359, C8353[] c8353Arr, InterfaceC18882 interfaceC18882, boolean z, boolean z2, long j, long j2, C15894 c15894) {
        C22632.m50634(this.f15558 == 0);
        this.f15557 = c17359;
        this.f15549 = c15894;
        this.f15558 = 1;
        mo13457(z, z2);
        mo6091(c8353Arr, interfaceC18882, j, j2, c15894);
        this.f15541 = false;
        this.f15542 = j;
        this.f15544 = j;
        mo13451(j, z);
    }

    @Override // l.InterfaceC1837
    public final void start() {
        C22632.m50634(this.f15558 == 1);
        this.f15558 = 2;
        mo13466();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6091(C8353[] c8353Arr, InterfaceC18882 interfaceC18882, long j, long j2, C15894 c15894) {
        C22632.m50634(!this.f15541);
        this.f15551 = interfaceC18882;
        this.f15549 = c15894;
        if (this.f15544 == Long.MIN_VALUE) {
            this.f15544 = j;
        }
        this.f15545 = c8353Arr;
        this.f15547 = j2;
        mo14359(c8353Arr, j, j2, c15894);
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC18882 mo6099() {
        return this.f15551;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo6104() {
        return this.f15544 == Long.MIN_VALUE;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֡ */
    public final long mo6083() {
        return this.f15544;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ᩷ */
    public final void mo6103() {
        this.f15541 = true;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo6100() {
        return this.f15541;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ۡ */
    public final void mo6096() {
        InterfaceC18882 interfaceC18882 = this.f15551;
        interfaceC18882.getClass();
        interfaceC18882.mo6411();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6089(AbstractC4846 abstractC4846) {
        if (C11003.equals(this.f15554, abstractC4846)) {
            return;
        }
        this.f15554 = abstractC4846;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6087(long j) {
        this.f15541 = false;
        this.f15542 = j;
        this.f15544 = j;
        mo13451(j, false);
    }

    @Override // l.InterfaceC1837
    public final void stop() {
        C22632.m50634(this.f15558 == 2);
        this.f15558 = 1;
        mo13462();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ᩳ */
    public final void mo6102() {
        C22632.m50634(this.f15558 == 1);
        this.f15555.m9145();
        this.f15558 = 0;
        this.f15551 = null;
        this.f15545 = null;
        this.f15541 = false;
        mo13464();
        this.f15549 = null;
    }

    @Override // l.InterfaceC1837
    public final void reset() {
        C22632.m50634(this.f15558 == 0);
        this.f15555.m9145();
        mo13473();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6084() {
        C22632.m50634(this.f15558 == 0);
        mo13461();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14358(InterfaceC16653 interfaceC16653) {
        synchronized (this.f15550) {
            this.f15548 = interfaceC16653;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m14354() {
        synchronized (this.f15550) {
            this.f15548 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long m14371() {
        return this.f15542;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long m14360() {
        return this.f15547;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3002 m14370() {
        C3002 c3002 = this.f15555;
        c3002.m9145();
        return c3002;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8353[] m14361() {
        C8353[] c8353Arr = this.f15545;
        c8353Arr.getClass();
        return c8353Arr;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17359 m14367() {
        C17359 c17359 = this.f15557;
        c17359.getClass();
        return c17359;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13830 m14369() {
        C13830 c13830 = this.f15546;
        c13830.getClass();
        return c13830;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 m14362() {
        InterfaceC16427 interfaceC16427 = this.f15556;
        interfaceC16427.getClass();
        return interfaceC16427;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m14366() {
        return this.f15554;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18273 m14356(Throwable th, C8353 c8353, int i) {
        return m14357(th, c8353, false, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18273 m14357(Throwable th, C8353 c8353, boolean z, int i) {
        int i2;
        if (c8353 == null || this.f15552) {
            i2 = 4;
        } else {
            this.f15552 = true;
            try {
                int iMo16568 = mo16568(c8353) & 7;
                this.f15552 = false;
                i2 = iMo16568;
            } catch (C18273 unused) {
                this.f15552 = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.f15552 = false;
                throw th2;
            }
        }
        return C18273.m42605(th, getName(), this.f15543, c8353, i2, this.f15549, z, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14355(C3002 c3002, C21843 c21843, int i) {
        InterfaceC18882 interfaceC18882 = this.f15551;
        interfaceC18882.getClass();
        int iMo6410 = interfaceC18882.mo6410(c3002, c21843, i);
        if (iMo6410 == -4) {
            if (c21843.m12697()) {
                this.f15544 = Long.MIN_VALUE;
                return this.f15541 ? -4 : -3;
            }
            long j = c21843.f69997 + this.f15547;
            c21843.f69997 = j;
            this.f15544 = Math.max(this.f15544, j);
            return iMo6410;
        }
        if (iMo6410 == -5) {
            C8353 c8353 = c3002.f9455;
            c8353.getClass();
            long j2 = c8353.f25620;
            if (j2 != C13132.FOREVER_NS) {
                C1297 c1297M21948 = c8353.m21948();
                c1297M21948.m4443(j2 + this.f15547);
                c3002.f9455 = c1297M21948.m4440();
            }
        }
        return iMo6410;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m14363(long j) {
        InterfaceC18882 interfaceC18882 = this.f15551;
        interfaceC18882.getClass();
        return interfaceC18882.mo6409(j - this.f15547);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m14365() {
        if (mo6104()) {
            return this.f15541;
        }
        InterfaceC18882 interfaceC18882 = this.f15551;
        interfaceC18882.getClass();
        return interfaceC18882.mo6412();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14364() {
        InterfaceC16653 interfaceC16653;
        synchronized (this.f15550) {
            interfaceC16653 = this.f15548;
        }
        if (interfaceC16653 != null) {
            ((C6908) interfaceC16653).m18700(this);
        }
    }
}
