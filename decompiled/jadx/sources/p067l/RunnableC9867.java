package p067l;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۠ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9867 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final int f27354;

    /* JADX INFO: renamed from: ۛ */
    public boolean f27356;

    /* JADX INFO: renamed from: ۤ */
    public volatile boolean f27357;

    /* JADX INFO: renamed from: ۨ */
    public final int f27358;

    /* JADX INFO: renamed from: ۬ */
    public long f27360;

    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ C23279 f27361;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f27362;

    /* JADX INFO: renamed from: ᩸ */
    public final int f27363;

    /* JADX INFO: renamed from: ᩹ */
    public C5370 f27364;

    /* JADX INFO: renamed from: ᩺ */
    public C9729 f27365;

    /* JADX INFO: renamed from: ۙ */
    public List f27355 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f27359 = false;

    public RunnableC9867(C23279 c23279, int i, int i2) {
        this.f27361 = c23279;
        this.f27358 = i;
        this.f27363 = i2;
        this.f27354 = c23279.f73240.f70018;
    }

    public RunnableC9867(C23279 c23279, int i, int i2, int i3) {
        this.f27361 = c23279;
        this.f27358 = i;
        this.f27363 = i2;
        this.f27354 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m23143() {
        return this.f27357 || this.f27361.f73239 || this.f27361.f73229.mo3924();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23144() {
        synchronized (this.f27361.f73236) {
            this.f27357 = true;
            this.f27355 = Collections.EMPTY_LIST;
        }
        synchronized (this) {
            if (!this.f27356) {
                m23142();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m23142() {
        this.f27364 = null;
        if (this.f27365 != null) {
            this.f27361.f73232.add(this.f27365);
            this.f27365 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23145() {
        try {
            this.f27361.f73237.execute(this);
        } catch (Error | RuntimeException e) {
            m23144();
            this.f27362 = true;
            this.f27361.m51842();
            if (!(e instanceof RejectedExecutionException)) {
                throw e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x018e A[Catch: all -> 0x0195, TryCatch #1 {, blocks: (B:84:0x0181, B:86:0x0185, B:91:0x0193, B:90:0x018e), top: B:131:0x0181 }] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.֨ۖܿ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.֨ۖܿ] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this) {
            this.f27356 = true;
        }
        boolean z2 = false;
        try {
            if (!m23143() && this.f27361.f73240.m49921()) {
                ((C13241) this.f27361.f73241).getClass();
                long jNanoTime = System.nanoTime();
                if (this.f27364 == null) {
                    C9729 c9729Mo28589 = this.f27361.f73240.f70019.mo28589();
                    this.f27365 = c9729Mo28589;
                    if (c9729Mo28589.m22747() == this.f27361.f73240.f70016 && this.f27365.length() == this.f27361.f73240.f70018 && !m23143() && this.f27361.f73240.m49921()) {
                        int i = this.f27354;
                        if (this.f27359 && i < this.f27361.f73240.f70018 && i > this.f27358 && Character.isHighSurrogate(this.f27365.charAt(i - 1))) {
                            i--;
                        }
                        this.f27364 = C5370.m11639(this.f27361.f73240.f70017, this.f27359 ? new C14847(0, i, this.f27365) : this.f27365, (C3161) new InterfaceC18588() { // from class: l.֨ۖܿ
                            @Override // p067l.InterfaceC18588
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo3924() {
                                return this.f5786.m23143();
                            }
                        }, this.f27358, Math.min(this.f27363, i));
                    }
                    synchronized (this) {
                        this.f27356 = false;
                        m23142();
                        this.f27362 = true;
                    }
                }
                EnumC6711 enumC6711M11699 = this.f27364.m11699(4096, 8000000L, (C24460) null);
                long j = this.f27360;
                ((C13241) this.f27361.f73241).getClass();
                this.f27360 = (System.nanoTime() - jNanoTime) + j;
                if (enumC6711M11699 != EnumC6711.COMPLETED) {
                    if (this.f27364.m11716() < 1048576 && this.f27360 < 128000000 && !m23143()) {
                        z = true;
                    }
                    synchronized (this) {
                        this.f27356 = false;
                        if (z || m23143()) {
                            m23142();
                            this.f27362 = true;
                        } else {
                            z2 = z;
                        }
                    }
                    this.f27361.m51842();
                    if (z2) {
                        m23145();
                        return;
                    }
                    return;
                }
                List listM11714 = this.f27364.m11714();
                synchronized (this.f27361.f73236) {
                    if (!m23143() && this.f27361.f73240.m49921()) {
                        this.f27355 = listM11714;
                        if (!this.f27359 && !listM11714.isEmpty()) {
                            C23279 c23279 = this.f27361;
                            c23279.f73234 = Math.min(c23279.f73234, ((C16572) listM11714.get(0)).f48664);
                        }
                    }
                }
                if (this.f27359 && this.f27361.f73243 != null && !m23143() && this.f27361.f73240.m49921()) {
                    C23279 c232710 = this.f27361;
                    c232710.m51833(listM11714, c232710.f73228, (InterfaceC18588) new InterfaceC18588() { // from class: l.֨ۖܿ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return this.f5786.m23143();
                        }
                    });
                }
                z = false;
                synchronized (this) {
                    this.f27356 = false;
                    if (z) {
                        m23142();
                        this.f27362 = true;
                    } else {
                        m23142();
                        this.f27362 = true;
                    }
                    this.f27361.m51842();
                    if (z2) {
                        m23145();
                        return;
                    }
                    return;
                }
            }
            synchronized (this) {
                this.f27356 = false;
                m23142();
                this.f27362 = true;
            }
            this.f27361.m51842();
        } catch (RuntimeException unused) {
            synchronized (this) {
                this.f27356 = false;
                m23142();
                this.f27362 = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f27356 = false;
                m23142();
                this.f27362 = true;
                this.f27361.m51842();
                throw th;
            }
        }
    }
}
