package p067l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۧᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12992 {

    /* JADX INFO: renamed from: ֫ */
    public int f36549;

    /* JADX INFO: renamed from: ۜ */
    public volatile int f36550;

    /* JADX INFO: renamed from: ۧ */
    public volatile double[] f36551;

    /* JADX INFO: renamed from: ܳ */
    public volatile int f36552;

    /* JADX INFO: renamed from: ܽ */
    public final ReentrantLock f36553;

    /* JADX INFO: renamed from: ܿ */
    public final Condition f36554;

    /* JADX INFO: renamed from: ᩳ */
    public final Condition f36555;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f36556 = true;

    /* JADX INFO: renamed from: ᩻ */
    public int f36557;

    public C12992() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f36553 = reentrantLock;
        this.f36554 = reentrantLock.newCondition();
        this.f36555 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29779() {
        this.f36551 = new double[32768];
        this.f36549 = EnumC8055.f21261;
        this.f36557 = 65535;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29782() {
        return (this.f36550 - this.f36552) & this.f36557;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29778(double[] dArr, int i, int i2) {
        double d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            this.f36553.lock();
            while (m29782() < 1) {
                try {
                    try {
                        this.f36555.await();
                    } catch (InterruptedException unused) {
                        this.f36553.unlock();
                        d = Double.NaN;
                    }
                } catch (Throwable th) {
                    this.f36553.unlock();
                    throw th;
                }
            }
            double d2 = this.f36551[this.f36552 & this.f36549];
            this.f36552 = (this.f36552 + 1) & this.f36557;
            this.f36553.unlock();
            if (this.f36556) {
                this.f36553.lock();
                this.f36554.signal();
                this.f36553.unlock();
            }
            d = d2;
            if (Double.isNaN(d)) {
                break;
            }
            dArr[i4 + i] = d;
            i3++;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29780(double d) {
        if (this.f36556) {
            this.f36553.lock();
            while (m29782() == this.f36551.length) {
                try {
                    try {
                        this.f36554.await();
                    } catch (InterruptedException unused) {
                        this.f36553.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this.f36553.unlock();
                    throw th;
                }
            }
            this.f36551[this.f36550 & this.f36549] = d;
            this.f36550 = (this.f36550 + 1) & this.f36557;
            this.f36553.unlock();
        } else if (m29782() != this.f36551.length) {
            this.f36551[this.f36550 & this.f36549] = d;
            this.f36550 = (this.f36550 + 1) & this.f36557;
        }
        this.f36553.lock();
        this.f36555.signal();
        this.f36553.unlock();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29781(boolean z) {
        this.f36556 = z;
    }
}
