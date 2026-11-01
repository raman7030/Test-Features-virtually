package p067l;

/* JADX INFO: renamed from: l.ۙ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: C8I7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7054 implements InterfaceC4114, InterfaceC19537 {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f18373;

    /* JADX INFO: renamed from: ۗ */
    public long f18374;

    /* JADX INFO: renamed from: ۙ */
    public int f18375;

    /* JADX INFO: renamed from: ۟ */
    public C10307[] f18377;

    /* JADX INFO: renamed from: ۤ */
    public C15512 f18378;

    /* JADX INFO: renamed from: ۧ֫ */
    public long f18379;

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC18195 f18380;

    /* JADX INFO: renamed from: ۫ */
    public C17474 f18381;

    /* JADX INFO: renamed from: ܰ */
    public InterfaceC20314 f18383;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f18384;

    /* JADX INFO: renamed from: ܿ֫ */
    public final int f18385;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC17980 f18388;

    /* JADX INFO: renamed from: ᩹ */
    public C18866 f18389;

    /* JADX INFO: renamed from: ᩺ */
    public int f18390;

    /* JADX INFO: renamed from: ۬ */
    public final Object f18382 = new Object();

    /* JADX INFO: renamed from: ᩶ */
    public final C5221 f18387 = new C5221();

    /* JADX INFO: renamed from: ۛ */
    public long f18376 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ᩳ֫ */
    public AbstractC6974 f18386 = AbstractC6974.f18145;

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo8283(float f, float f2) {
    }

    @Override // p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public void mo15338(int i, Object obj) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15339(long j, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public void mo15345(boolean z, boolean z2) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۘ */
    public final AbstractC7054 mo8291() {
        return this;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۚ */
    public InterfaceC23996 mo8292() {
        return null;
    }

    /* JADX INFO: renamed from: ۛ */
    public void mo15349() {
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۜ */
    public /* synthetic */ void mo8293() {
    }

    /* JADX INFO: renamed from: ۟ */
    public void mo15350() {
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract void mo15352();

    /* JADX INFO: renamed from: ܰ */
    public void mo15354() {
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ᩵ */
    public int mo16265() {
        return 0;
    }

    /* JADX INFO: renamed from: ᩺ */
    public void mo15361() {
    }

    public AbstractC7054(int i) {
        this.f18385 = i;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۖ */
    public final int mo8290() {
        return this.f18385;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public boolean mo8296() {
        return mo8302();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8284(int i, C15512 c15512, InterfaceC17980 interfaceC17980) {
        this.f18375 = i;
        this.f18378 = c15512;
        this.f18388 = interfaceC17980;
    }

    @Override // p067l.InterfaceC4114
    public final int getState() {
        return this.f18390;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public long mo8295(long j, long j2) {
        if (this.f18390 == 1) {
            return (mo8299() || mo8296()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8288(C18866 c18866, C10307[] c10307Arr, InterfaceC20314 interfaceC20314, boolean z, boolean z2, long j, long j2, C17474 c17474) {
        C23877.m52960(this.f18390 == 0);
        this.f18389 = c18866;
        this.f18381 = c17474;
        this.f18390 = 1;
        mo15345(z, z2);
        mo8289(c10307Arr, interfaceC20314, j, j2, c17474);
        this.f18373 = false;
        this.f18374 = j;
        this.f18376 = j;
        mo15339(j, z);
    }

    @Override // p067l.InterfaceC4114
    public final void start() {
        C23877.m52960(this.f18390 == 1);
        this.f18390 = 2;
        mo15354();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8289(C10307[] c10307Arr, InterfaceC20314 interfaceC20314, long j, long j2, C17474 c17474) {
        C23877.m52960(!this.f18373);
        this.f18383 = interfaceC20314;
        this.f18381 = c17474;
        if (this.f18376 == Long.MIN_VALUE) {
            this.f18376 = j;
        }
        this.f18377 = c10307Arr;
        this.f18379 = j2;
        mo16256(c10307Arr, j, j2, c17474);
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC20314 mo8297() {
        return this.f18383;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo8302() {
        return this.f18376 == Long.MIN_VALUE;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֡ */
    public final long mo8281() {
        return this.f18376;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ᩷ */
    public final void mo8301() {
        this.f18373 = true;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo8298() {
        return this.f18373;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۡ */
    public final void mo8294() {
        InterfaceC20314 interfaceC20314 = this.f18383;
        interfaceC20314.getClass();
        interfaceC20314.mo8568();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8287(AbstractC6974 abstractC6974) {
        if (C12826.equals(this.f18386, abstractC6974)) {
            return;
        }
        this.f18386 = abstractC6974;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8285(long j) {
        this.f18373 = false;
        this.f18374 = j;
        this.f18376 = j;
        mo15339(j, false);
    }

    @Override // p067l.InterfaceC4114
    public final void stop() {
        C23877.m52960(this.f18390 == 2);
        this.f18390 = 1;
        mo15350();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ᩳ */
    public final void mo8300() {
        C23877.m52960(this.f18390 == 1);
        this.f18387.m11196();
        this.f18390 = 0;
        this.f18383 = null;
        this.f18377 = null;
        this.f18373 = false;
        mo15352();
        this.f18381 = null;
    }

    @Override // p067l.InterfaceC4114
    public final void reset() {
        C23877.m52960(this.f18390 == 0);
        this.f18387.m11196();
        mo15361();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8282() {
        C23877.m52960(this.f18390 == 0);
        mo15349();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m16255(InterfaceC18195 interfaceC18195) {
        synchronized (this.f18382) {
            this.f18380 = interfaceC18195;
        }
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m16251() {
        synchronized (this.f18382) {
            this.f18380 = null;
        }
    }

    /* JADX INFO: renamed from: ᩹ */
    public final long m16268() {
        return this.f18374;
    }

    /* JADX INFO: renamed from: ۗ */
    public final long m16257() {
        return this.f18379;
    }

    /* JADX INFO: renamed from: ᩸ */
    public final C5221 m16267() {
        C5221 c5221 = this.f18387;
        c5221.m11196();
        return c5221;
    }

    /* JADX INFO: renamed from: ۙ */
    public final C10307[] m16258() {
        C10307[] c10307Arr = this.f18377;
        c10307Arr.getClass();
        return c10307Arr;
    }

    /* JADX INFO: renamed from: ܶ */
    public final C18866 m16264() {
        C18866 c18866 = this.f18389;
        c18866.getClass();
        return c18866;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final C15512 m16266() {
        C15512 c15512 = this.f18378;
        c15512.getClass();
        return c15512;
    }

    /* JADX INFO: renamed from: ۠ */
    public final InterfaceC17980 m16259() {
        InterfaceC17980 interfaceC17980 = this.f18388;
        interfaceC17980.getClass();
        return interfaceC17980;
    }

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC6974 m16263() {
        return this.f18386;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19735 m16253(Throwable th, C10307 c10307, int i) {
        return m16254(th, c10307, false, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19735 m16254(Throwable th, C10307 c10307, boolean z, int i) {
        int i2;
        if (c10307 == null || this.f18384) {
            i2 = 4;
        } else {
            this.f18384 = true;
            try {
                int iMo18494 = mo18494(c10307) & 7;
                this.f18384 = false;
                i2 = iMo18494;
            } catch (C19735 unused) {
                this.f18384 = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.f18384 = false;
                throw th2;
            }
        }
        return C19735.m44864(th, getName(), this.f18375, c10307, i2, this.f18381, z, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m16252(C5221 c5221, C23128 c23128, int i) {
        InterfaceC20314 interfaceC20314 = this.f18383;
        interfaceC20314.getClass();
        int iMo8567 = interfaceC20314.mo8567(c5221, c23128, i);
        if (iMo8567 == -4) {
            if (c23128.m14573()) {
                this.f18376 = Long.MIN_VALUE;
                return this.f18373 ? -4 : -3;
            }
            long j = c23128.f72706 + this.f18379;
            c23128.f72706 = j;
            this.f18376 = Math.max(this.f18376, j);
            return iMo8567;
        }
        if (iMo8567 == -5) {
            C10307 c10307 = c5221.f12253;
            c10307.getClass();
            long j2 = c10307.f28534;
            if (j2 != C14849.FOREVER_NS) {
                C3601 c3601M23918 = c10307.m23918();
                c3601M23918.m6675(j2 + this.f18379);
                c5221.f12253 = c3601M23918.m6672();
            }
        }
        return iMo8567;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m16260(long j) {
        InterfaceC20314 interfaceC20314 = this.f18383;
        interfaceC20314.getClass();
        return interfaceC20314.mo8566(j - this.f18379);
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m16262() {
        if (mo8302()) {
            return this.f18373;
        }
        InterfaceC20314 interfaceC20314 = this.f18383;
        interfaceC20314.getClass();
        return interfaceC20314.mo8569();
    }

    /* JADX INFO: renamed from: ۨ */
    public final void m16261() {
        InterfaceC18195 interfaceC18195;
        synchronized (this.f18382) {
            interfaceC18195 = this.f18380;
        }
        if (interfaceC18195 != null) {
            ((C8934) interfaceC18195).m20649(this);
        }
    }
}
