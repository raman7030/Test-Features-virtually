package p067l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܿ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19130 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f57070;

    /* JADX INFO: renamed from: ۧ */
    public final Condition f57071;

    /* JADX INFO: renamed from: ܽ */
    public final Condition f57072;

    /* JADX INFO: renamed from: ܿ */
    public final Lock f57073;

    /* JADX INFO: renamed from: ᩳ */
    public final int f57074;

    public C19130(int i, ReentrantLock reentrantLock, Condition condition, Condition condition2, int[] iArr) {
        this.f57074 = i;
        this.f57073 = reentrantLock;
        this.f57071 = condition;
        this.f57072 = condition2;
        this.f57070 = iArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C19130[] m43467() {
        C19130[] c19130Arr = new C19130[2];
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition[] conditionArr = new Condition[2];
        for (int i = 0; i < 2; i++) {
            conditionArr[i] = reentrantLock.newCondition();
        }
        int[] iArr = {0};
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 + 1;
            c19130Arr[i2] = new C19130(i2, reentrantLock, conditionArr[i2], i3 == 2 ? conditionArr[0] : conditionArr[i3], iArr);
            i2 = i3;
        }
        return c19130Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43468() throws InterruptedException {
        this.f57073.lock();
        if (this.f57070[0] % 2 != this.f57074) {
            this.f57071.await();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43469() {
        Lock lock = this.f57073;
        try {
            int[] iArr = this.f57070;
            iArr[0] = iArr[0] + 1;
            this.f57072.signal();
        } finally {
            lock.unlock();
        }
    }
}
