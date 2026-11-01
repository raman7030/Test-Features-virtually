package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4068 {

    /* JADX INFO: renamed from: ֫ */
    public FutureC5767 f8948;

    /* JADX INFO: renamed from: ۧ */
    public final Object f8949 = new Object();

    /* JADX INFO: renamed from: ܳ */
    public boolean f8950;

    /* JADX INFO: renamed from: ܽ */
    public int f8951;

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC9177 f8952;

    /* JADX INFO: renamed from: ᩳ */
    public int f8953;

    /* JADX INFO: renamed from: ᩻ */
    public RunnableC3931 f8954;

    public C4068(InterfaceC9177 interfaceC9177) {
        this.f8952 = interfaceC9177;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8146(boolean z) {
        synchronized (this.f8949) {
            try {
                if (z) {
                    if (this.f8950) {
                        throw new IllegalStateException("Text owner is closed");
                    }
                    this.f8953++;
                } else {
                    int i = this.f8953;
                    if (i == 0) {
                        throw new IllegalStateException("Unbalanced internal read-only state");
                    }
                    this.f8953 = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m8141();
        m8142();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m8148() {
        return Thread.holdsLock(this.f8949) && this.f8951 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m8147() {
        boolean z;
        synchronized (this.f8949) {
            z = !this.f8950 && this.f8953 == 0 && this.f8951 == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final FutureC5767 m8150() {
        synchronized (this.f8949) {
            if (this.f8950) {
                return FutureC5767.m12872(new IllegalStateException("Text owner is closed"));
            }
            if (m8147()) {
                return FutureC5767.m12882(null);
            }
            if (this.f8948 == null) {
                this.f8948 = new FutureC5767();
            }
            return this.f8948.m12898((InterfaceC22729) new C7470());
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m8141() {
        synchronized (this.f8949) {
            if (this.f8948 != null && (this.f8950 || m8147())) {
                FutureC5767 futureC5767 = this.f8948;
                this.f8948 = null;
                boolean z = this.f8950;
                if (z) {
                    futureC5767.m12891((Throwable) new IllegalStateException("Text owner is closed"));
                } else {
                    futureC5767.m12889((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m8143(Object obj, Supplier supplier) {
        try {
            synchronized (this.f8949) {
                if (!this.f8950) {
                    this.f8951++;
                    try {
                        obj = supplier.get();
                        this.f8951--;
                    } catch (Throwable th) {
                        this.f8951--;
                        throw th;
                    }
                }
            }
            m8141();
            m8142();
            return obj;
        } catch (Throwable th2) {
            m8141();
            m8142();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m8144(C21248 c21248) {
        Object objM8143;
        synchronized (this.f8949) {
            objM8143 = null;
            if (this.f8953 == 0) {
                objM8143 = m8143(null, c21248);
            }
        }
        return objM8143;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8145(RunnableC3931 runnableC3931) {
        synchronized (this.f8949) {
            if (this.f8950) {
                return;
            }
            this.f8950 = true;
            this.f8954 = runnableC3931;
            m8141();
            m8142();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m8142() {
        synchronized (this.f8949) {
            if (this.f8953 == 0 && this.f8951 == 0) {
                RunnableC3931 runnableC3931 = this.f8954;
                this.f8954 = null;
                if (runnableC3931 != null) {
                    runnableC3931.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8149() {
        synchronized (this.f8949) {
            this.f8950 = true;
        }
        m8141();
    }
}
