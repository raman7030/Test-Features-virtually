package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۧᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8CK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11178 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f33548;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile int f33549;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile double[] f33550;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile int f33551;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f33552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Condition f33553;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Condition f33554;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f33555 = true;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f33556;

    public C11178() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f33552 = reentrantLock;
        this.f33553 = reentrantLock.newCondition();
        this.f33554 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27717() {
        this.f33550 = new double[32768];
        this.f33548 = EnumC5983.f18409;
        this.f33556 = 65535;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27720() {
        return (this.f33549 - this.f33551) & this.f33556;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27716(double[] dArr, int i, int i2) {
        double d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            this.f33552.lock();
            while (m27720() < 1) {
                try {
                    try {
                        this.f33554.await();
                    } catch (InterruptedException unused) {
                        this.f33552.unlock();
                        d = Double.NaN;
                    }
                } catch (Throwable th) {
                    this.f33552.unlock();
                    throw th;
                }
            }
            double d2 = this.f33550[this.f33551 & this.f33548];
            this.f33551 = (this.f33551 + 1) & this.f33556;
            this.f33552.unlock();
            if (this.f33555) {
                this.f33552.lock();
                this.f33553.signal();
                this.f33552.unlock();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27718(double d) {
        if (this.f33555) {
            this.f33552.lock();
            while (m27720() == this.f33550.length) {
                try {
                    try {
                        this.f33553.await();
                    } catch (InterruptedException unused) {
                        this.f33552.unlock();
                        return;
                    }
                } catch (Throwable th) {
                    this.f33552.unlock();
                    throw th;
                }
            }
            this.f33550[this.f33549 & this.f33548] = d;
            this.f33549 = (this.f33549 + 1) & this.f33556;
            this.f33552.unlock();
        } else if (m27720() != this.f33550.length) {
            this.f33550[this.f33549 & this.f33548] = d;
            this.f33549 = (this.f33549 + 1) & this.f33556;
        }
        this.f33552.lock();
        this.f33554.signal();
        this.f33552.unlock();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27719(boolean z) {
        this.f33555 = z;
    }
}
