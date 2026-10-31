package l;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.۠ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6VA */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7890 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f24438;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24441;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24442;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f24444;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22002 f24445;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f24446;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24447;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3158 f24448;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7744 f24449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f24439 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f24443 = false;

    public RunnableC7890(C22002 c22002, int i, int i2) {
        this.f24445 = c22002;
        this.f24442 = i;
        this.f24447 = i2;
        this.f24438 = c22002.f70526.f67335;
    }

    public RunnableC7890(C22002 c22002, int i, int i2, int i3) {
        this.f24445 = c22002;
        this.f24442 = i;
        this.f24447 = i2;
        this.f24438 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21178() {
        return this.f24441 || this.f24445.f70525 || this.f24445.f70515.mo1526();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21179() {
        synchronized (this.f24445.f70522) {
            this.f24441 = true;
            this.f24439 = Collections.EMPTY_LIST;
        }
        synchronized (this) {
            if (!this.f24440) {
                m21177();
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21177() {
        this.f24448 = null;
        if (this.f24449 != null) {
            this.f24445.f70518.add(this.f24449);
            this.f24449 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21180() {
        try {
            this.f24445.f70523.execute(this);
        } catch (Error | RuntimeException e) {
            m21179();
            this.f24446 = true;
            this.f24445.m49507();
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
            this.f24440 = true;
        }
        boolean z2 = false;
        try {
            if (!m21178() && this.f24445.f70526.m47593()) {
                ((C11440) this.f24445.f70527).getClass();
                long jNanoTime = System.nanoTime();
                if (this.f24448 == null) {
                    C7744 c7744Mo26556 = this.f24445.f70526.f67336.mo26556();
                    this.f24449 = c7744Mo26556;
                    if (c7744Mo26556.m20767() == this.f24445.f70526.f67333 && this.f24449.length() == this.f24445.f70526.f67335 && !m21178() && this.f24445.f70526.m47593()) {
                        int i = this.f24438;
                        if (this.f24443 && i < this.f24445.f70526.f67335 && i > this.f24442 && Character.isHighSurrogate(this.f24449.charAt(i - 1))) {
                            i--;
                        }
                        this.f24448 = C3158.m9595(this.f24445.f70526.f67334, this.f24443 ? new C13130(0, i, this.f24449) : this.f24449, (C0834) new InterfaceC17066() { // from class: l.֨ۖܿ
                            @Override // l.InterfaceC17066
                            /* JADX INFO: renamed from: ᩻ */
                            public final boolean mo1526() {
                                return this.f3012.m21178();
                            }
                        }, this.f24442, Math.min(this.f24447, i));
                    }
                    synchronized (this) {
                        this.f24440 = false;
                        m21177();
                        this.f24446 = true;
                    }
                }
                EnumC4569 enumC4569M9655 = this.f24448.m9655(4096, 8000000L, (C23244) null);
                long j = this.f24444;
                ((C11440) this.f24445.f70527).getClass();
                this.f24444 = (System.nanoTime() - jNanoTime) + j;
                if (enumC4569M9655 != EnumC4569.COMPLETED) {
                    if (this.f24448.m9672() < 1048576 && this.f24444 < 128000000 && !m21178()) {
                        z = true;
                    }
                    synchronized (this) {
                        this.f24440 = false;
                        if (z || m21178()) {
                            m21177();
                            this.f24446 = true;
                        } else {
                            z2 = z;
                        }
                    }
                    this.f24445.m49507();
                    if (z2) {
                        m21180();
                        return;
                    }
                    return;
                }
                List listM9670 = this.f24448.m9670();
                synchronized (this.f24445.f70522) {
                    if (!m21178() && this.f24445.f70526.m47593()) {
                        this.f24439 = listM9670;
                        if (!this.f24443 && !listM9670.isEmpty()) {
                            C22002 c22002 = this.f24445;
                            c22002.f70520 = Math.min(c22002.f70520, ((C14945) listM9670.get(0)).f45550);
                        }
                    }
                }
                if (this.f24443 && this.f24445.f70529 != null && !m21178() && this.f24445.f70526.m47593()) {
                    C22002 c22003 = this.f24445;
                    c22003.m49498(listM9670, c22003.f70514, (InterfaceC17066) new InterfaceC17066() { // from class: l.֨ۖܿ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return this.f3012.m21178();
                        }
                    });
                }
                z = false;
                synchronized (this) {
                    this.f24440 = false;
                    if (z) {
                        m21177();
                        this.f24446 = true;
                    } else {
                        m21177();
                        this.f24446 = true;
                    }
                    this.f24445.m49507();
                    if (z2) {
                        m21180();
                        return;
                    }
                    return;
                }
            }
            synchronized (this) {
                this.f24440 = false;
                m21177();
                this.f24446 = true;
            }
            this.f24445.m49507();
        } catch (RuntimeException unused) {
            synchronized (this) {
                this.f24440 = false;
                m21177();
                this.f24446 = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f24440 = false;
                m21177();
                this.f24446 = true;
                this.f24445.m49507();
                throw th;
            }
        }
    }
}
