package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۗ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5693 implements InterfaceC3681 {

    /* JADX INFO: renamed from: ֫ */
    public int f13887;

    /* JADX INFO: renamed from: ۖ */
    public boolean f13888;

    /* JADX INFO: renamed from: ۘ */
    public int f13889;

    /* JADX INFO: renamed from: ۜ */
    public boolean f13890;

    /* JADX INFO: renamed from: ۧ */
    public final C23128[] f13893;

    /* JADX INFO: renamed from: ܳ */
    public C23128 f13894;

    /* JADX INFO: renamed from: ܽ */
    public int f13896;

    /* JADX INFO: renamed from: ܿ */
    public final Thread f13897;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC21787[] f13898;

    /* JADX INFO: renamed from: ᩻ */
    public C10387 f13900;

    /* JADX INFO: renamed from: ᩷ */
    public final Object f13899 = new Object();

    /* JADX INFO: renamed from: ۢ */
    public long f13892 = -9223372036854775807L;

    /* JADX INFO: renamed from: ۡ */
    public final ArrayDeque f13891 = new ArrayDeque();

    /* JADX INFO: renamed from: ܺ */
    public final ArrayDeque f13895 = new ArrayDeque();

    /* JADX INFO: renamed from: ֫ */
    public abstract C10387 mo10(Throwable th);

    /* JADX INFO: renamed from: ֫ */
    public abstract C10387 mo11(C23128 c23128, AbstractC21787 abstractC21787, boolean z);

    /* JADX INFO: renamed from: ܿ */
    public abstract AbstractC21787 mo15();

    /* JADX INFO: renamed from: ᩳ */
    public abstract C23128 mo16();

    public AbstractC5693(C23128[] c23128Arr, AbstractC21787[] abstractC21787Arr) {
        this.f13893 = c23128Arr;
        this.f13887 = c23128Arr.length;
        for (int i = 0; i < this.f13887; i++) {
            this.f13893[i] = mo16();
        }
        this.f13898 = abstractC21787Arr;
        this.f13896 = abstractC21787Arr.length;
        for (int i2 = 0; i2 < this.f13896; i2++) {
            this.f13898[i2] = mo15();
        }
        C7034 c7034 = new C7034(this);
        this.f13897 = c7034;
        c7034.start();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12675(int i) {
        int i2 = this.f13887;
        C23128[] c23128Arr = this.f13893;
        C23877.m52960(i2 == c23128Arr.length);
        for (C23128 c23128 : c23128Arr) {
            c23128.m51579(i);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m12678(long j) {
        boolean z;
        synchronized (this.f13899) {
            long j2 = this.f13892;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ۧ */
    public final void mo7102(long j) {
        synchronized (this.f13899) {
            C23877.m52960(this.f13887 == this.f13893.length || this.f13890);
            this.f13892 = j;
        }
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ܽ */
    public final Object mo7103() {
        C23128 c23128;
        synchronized (this.f13899) {
            C10387 c10387 = this.f13900;
            if (c10387 == null) {
                C23877.m52960(this.f13894 == null);
                int i = this.f13887;
                if (i == 0) {
                    c23128 = null;
                } else {
                    C23128[] c23128Arr = this.f13893;
                    int i2 = i - 1;
                    this.f13887 = i2;
                    c23128 = c23128Arr[i2];
                }
                this.f13894 = c23128;
            } else {
                throw c10387;
            }
        }
        return c23128;
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final void mo7100(C23128 c23128) {
        synchronized (this.f13899) {
            C10387 c10387 = this.f13900;
            if (c10387 == null) {
                C23877.m52957(c23128 == this.f13894);
                this.f13891.addLast(c23128);
                if (!this.f13891.isEmpty() && this.f13896 > 0) {
                    this.f13899.notify();
                }
                this.f13894 = null;
            } else {
                throw c10387;
            }
        }
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21787 mo7101() {
        synchronized (this.f13899) {
            C10387 c10387 = this.f13900;
            if (c10387 == null) {
                if (this.f13895.isEmpty()) {
                    return null;
                }
                return (AbstractC21787) this.f13895.removeFirst();
            }
            throw c10387;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12676(AbstractC21787 abstractC21787) {
        synchronized (this.f13899) {
            abstractC21787.mo7();
            AbstractC21787[] abstractC21787Arr = this.f13898;
            int i = this.f13896;
            this.f13896 = i + 1;
            abstractC21787Arr[i] = abstractC21787;
            if (!this.f13891.isEmpty() && this.f13896 > 0) {
                this.f13899.notify();
            }
        }
    }

    @Override // p067l.InterfaceC3681
    public final void flush() {
        synchronized (this.f13899) {
            this.f13890 = true;
            this.f13889 = 0;
            C23128 c23128 = this.f13894;
            if (c23128 != null) {
                c23128.mo7();
                C23128[] c23128Arr = this.f13893;
                int i = this.f13887;
                this.f13887 = i + 1;
                c23128Arr[i] = c23128;
                this.f13894 = null;
            }
            while (!this.f13891.isEmpty()) {
                C23128 c23129 = (C23128) this.f13891.removeFirst();
                c23129.mo7();
                C23128[] c23128Arr2 = this.f13893;
                int i2 = this.f13887;
                this.f13887 = i2 + 1;
                c23128Arr2[i2] = c23129;
            }
            while (!this.f13895.isEmpty()) {
                ((AbstractC21787) this.f13895.removeFirst()).mo8();
            }
        }
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public void mo12() {
        synchronized (this.f13899) {
            this.f13888 = true;
            this.f13899.notify();
        }
        try {
            this.f13897.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12673(AbstractC5693 abstractC5693) {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (abstractC5693.m12674());
    }

    /* JADX INFO: renamed from: ܳ */
    private boolean m12674() {
        C10387 c10387Mo10;
        synchronized (this.f13899) {
            while (!this.f13888) {
                if (!this.f13891.isEmpty() && this.f13896 > 0) {
                    break;
                }
                this.f13899.wait();
            }
            if (this.f13888) {
                return false;
            }
            C23128 c23128 = (C23128) this.f13891.removeFirst();
            AbstractC21787[] abstractC21787Arr = this.f13898;
            int i = this.f13896 - 1;
            this.f13896 = i;
            AbstractC21787 abstractC21787 = abstractC21787Arr[i];
            boolean z = this.f13890;
            this.f13890 = false;
            if (c23128.m14571(4)) {
                abstractC21787.m14567(4);
            } else {
                abstractC21787.f68601 = c23128.f72706;
                if (c23128.m14571(134217728)) {
                    abstractC21787.m14567(134217728);
                }
                if (!m12678(c23128.f72706)) {
                    abstractC21787.f68603 = true;
                }
                try {
                    c10387Mo10 = mo11(c23128, abstractC21787, z);
                } catch (OutOfMemoryError e) {
                    c10387Mo10 = mo10((Throwable) e);
                } catch (RuntimeException e2) {
                    c10387Mo10 = mo10((Throwable) e2);
                }
                C10387 c10387 = c10387Mo10;
                if (c10387 != null) {
                    synchronized (this.f13899) {
                        this.f13900 = c10387;
                    }
                    return false;
                }
            }
            synchronized (this.f13899) {
                if (this.f13890) {
                    abstractC21787.mo8();
                } else if (abstractC21787.f68603) {
                    this.f13889++;
                    abstractC21787.mo8();
                } else {
                    abstractC21787.f68602 = this.f13889;
                    this.f13889 = 0;
                    this.f13895.addLast(abstractC21787);
                }
                c23128.mo7();
                C23128[] c23128Arr = this.f13893;
                int i2 = this.f13887;
                this.f13887 = i2 + 1;
                c23128Arr[i2] = c23128;
            }
            return true;
        }
    }
}
