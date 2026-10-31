package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3498 implements InterfaceC1381 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f11082;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f11083;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f11084;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f11085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21843[] f11088;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21843 f11089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f11091;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Thread f11092;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC20432[] f11093;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8437 f11095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f11094 = new Object();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f11087 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f11086 = new ArrayDeque();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f11090 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫ */
    public abstract C8437 mo10(Throwable th);

    /* JADX INFO: renamed from: ֫ */
    public abstract C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z);

    /* JADX INFO: renamed from: ܿ */
    public abstract AbstractC20432 mo15();

    /* JADX INFO: renamed from: ᩳ */
    public abstract C21843 mo16();

    public AbstractC3498(C21843[] c21843Arr, AbstractC20432[] abstractC20432Arr) {
        this.f11088 = c21843Arr;
        this.f11082 = c21843Arr.length;
        for (int i = 0; i < this.f11082; i++) {
            this.f11088[i] = mo16();
        }
        this.f11093 = abstractC20432Arr;
        this.f11091 = abstractC20432Arr.length;
        for (int i2 = 0; i2 < this.f11091; i2++) {
            this.f11093[i2] = mo15();
        }
        C4909 c4909 = new C4909(this);
        this.f11092 = c4909;
        c4909.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10680(int i) {
        int i2 = this.f11082;
        C21843[] c21843Arr = this.f11088;
        C22632.m50634(i2 == c21843Arr.length);
        for (C21843 c21843 : c21843Arr) {
            c21843.m49228(i);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m10683(long j) {
        boolean z;
        synchronized (this.f11094) {
            long j2 = this.f11087;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ۧ */
    public final void mo4864(long j) {
        synchronized (this.f11094) {
            C22632.m50634(this.f11082 == this.f11088.length || this.f11085);
            this.f11087 = j;
        }
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ܽ */
    public final Object mo4865() {
        C21843 c21843;
        synchronized (this.f11094) {
            C8437 c8437 = this.f11095;
            if (c8437 == null) {
                C22632.m50634(this.f11089 == null);
                int i = this.f11082;
                if (i == 0) {
                    c21843 = null;
                } else {
                    C21843[] c21843Arr = this.f11088;
                    int i2 = i - 1;
                    this.f11082 = i2;
                    c21843 = c21843Arr[i2];
                }
                this.f11089 = c21843;
            } else {
                throw c8437;
            }
        }
        return c21843;
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo4862(C21843 c21843) {
        synchronized (this.f11094) {
            C8437 c8437 = this.f11095;
            if (c8437 == null) {
                C22632.m50631(c21843 == this.f11089);
                this.f11086.addLast(c21843);
                if (!this.f11086.isEmpty() && this.f11091 > 0) {
                    this.f11094.notify();
                }
                this.f11089 = null;
            } else {
                throw c8437;
            }
        }
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC20432 mo4863() {
        synchronized (this.f11094) {
            C8437 c8437 = this.f11095;
            if (c8437 == null) {
                if (this.f11090.isEmpty()) {
                    return null;
                }
                return (AbstractC20432) this.f11090.removeFirst();
            }
            throw c8437;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10681(AbstractC20432 abstractC20432) {
        synchronized (this.f11094) {
            abstractC20432.mo7();
            AbstractC20432[] abstractC20432Arr = this.f11093;
            int i = this.f11091;
            this.f11091 = i + 1;
            abstractC20432Arr[i] = abstractC20432;
            if (!this.f11086.isEmpty() && this.f11091 > 0) {
                this.f11094.notify();
            }
        }
    }

    @Override // l.InterfaceC1381
    public final void flush() {
        synchronized (this.f11094) {
            this.f11085 = true;
            this.f11084 = 0;
            C21843 c21843 = this.f11089;
            if (c21843 != null) {
                c21843.mo7();
                C21843[] c21843Arr = this.f11088;
                int i = this.f11082;
                this.f11082 = i + 1;
                c21843Arr[i] = c21843;
                this.f11089 = null;
            }
            while (!this.f11086.isEmpty()) {
                C21843 c21844 = (C21843) this.f11086.removeFirst();
                c21844.mo7();
                C21843[] c21843Arr2 = this.f11088;
                int i2 = this.f11082;
                this.f11082 = i2 + 1;
                c21843Arr2[i2] = c21844;
            }
            while (!this.f11090.isEmpty()) {
                ((AbstractC20432) this.f11090.removeFirst()).mo8();
            }
        }
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ֫ */
    public void mo12() {
        synchronized (this.f11094) {
            this.f11083 = true;
            this.f11094.notify();
        }
        try {
            this.f11092.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10678(AbstractC3498 abstractC3498) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC3498.m10679());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m10679() {
        C8437 c8437Mo10;
        synchronized (this.f11094) {
            while (!this.f11083) {
                if (!this.f11086.isEmpty() && this.f11091 > 0) {
                    break;
                }
                this.f11094.wait();
            }
            if (this.f11083) {
                return false;
            }
            C21843 c21843 = (C21843) this.f11086.removeFirst();
            AbstractC20432[] abstractC20432Arr = this.f11093;
            int i = this.f11091 - 1;
            this.f11091 = i;
            AbstractC20432 abstractC20432 = abstractC20432Arr[i];
            boolean z = this.f11085;
            this.f11085 = false;
            if (c21843.m12695(4)) {
                abstractC20432.m12691(4);
            } else {
                abstractC20432.f65926 = c21843.f69997;
                if (c21843.m12695(134217728)) {
                    abstractC20432.m12691(134217728);
                }
                if (!m10683(c21843.f69997)) {
                    abstractC20432.f65928 = true;
                }
                try {
                    c8437Mo10 = mo11(c21843, abstractC20432, z);
                } catch (OutOfMemoryError e) {
                    c8437Mo10 = mo10((Throwable) e);
                } catch (RuntimeException e2) {
                    c8437Mo10 = mo10((Throwable) e2);
                }
                C8437 c8437 = c8437Mo10;
                if (c8437 != null) {
                    synchronized (this.f11094) {
                        this.f11095 = c8437;
                    }
                    return false;
                }
            }
            synchronized (this.f11094) {
                if (this.f11085) {
                    abstractC20432.mo8();
                } else if (abstractC20432.f65928) {
                    this.f11084++;
                    abstractC20432.mo8();
                } else {
                    abstractC20432.f65927 = this.f11084;
                    this.f11084 = 0;
                    this.f11090.addLast(abstractC20432);
                }
                c21843.mo7();
                C21843[] c21843Arr = this.f11088;
                int i2 = this.f11082;
                this.f11082 = i2 + 1;
                c21843Arr[i2] = c21843;
            }
            return true;
        }
    }
}
