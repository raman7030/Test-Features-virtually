package l;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܿ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9T7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17636 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f53877;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Condition f53878;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Condition f53879;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Lock f53880;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f53881;

    public C17636(int i, ReentrantLock reentrantLock, Condition condition, Condition condition2, int[] iArr) {
        this.f53881 = i;
        this.f53880 = reentrantLock;
        this.f53878 = condition;
        this.f53879 = condition2;
        this.f53877 = iArr;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C17636[] m41221() {
        C17636[] c17636Arr = new C17636[2];
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition[] conditionArr = new Condition[2];
        for (int i = 0; i < 2; i++) {
            conditionArr[i] = reentrantLock.newCondition();
        }
        int[] iArr = {0};
        int i2 = 0;
        while (i2 < 2) {
            int i3 = i2 + 1;
            c17636Arr[i2] = new C17636(i2, reentrantLock, conditionArr[i2], i3 == 2 ? conditionArr[0] : conditionArr[i3], iArr);
            i2 = i3;
        }
        return c17636Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41222() throws InterruptedException {
        this.f53880.lock();
        if (this.f53877[0] % 2 != this.f53881) {
            this.f53878.await();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41223() {
        Lock lock = this.f53880;
        try {
            int[] iArr = this.f53877;
            iArr[0] = iArr[0] + 1;
            this.f53879.signal();
        } finally {
            lock.unlock();
        }
    }
}
