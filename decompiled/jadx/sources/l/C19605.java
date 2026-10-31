package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩵ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes4.dex */
public final class C19605 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14852 f63304;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4082 f63305;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f63306;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f63307;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f63308;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23528 f63309;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1689 f63310;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63311;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f63312;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f63313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9907 f63314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63315;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5493 f63317;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Thread[] f63318;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f63319;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f63320 = new Object();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14664[] f63316 = new C14664[16];

    public C19605(C5493 c5493, C14852 c14852, C23528 c23528, C4082 c4082, int i, C1689 c1689, ArrayList arrayList, int i2, int i3, int i4, C9907 c9907, AtomicBoolean atomicBoolean) {
        this.f63317 = c5493;
        this.f63304 = c14852;
        this.f63309 = c23528;
        this.f63305 = c4082;
        this.f63313 = i;
        this.f63310 = c1689;
        this.f63312 = arrayList;
        this.f63308 = i2;
        this.f63319 = i2;
        this.f63315 = i3;
        this.f63314 = c9907;
        this.f63311 = atomicBoolean;
        Thread[] threadArr = new Thread[i4];
        this.f63318 = threadArr;
        int i5 = 0;
        while (i5 < i4) {
            final C0553 c0553 = new C0553(this.f63309);
            Runnable runnable = new Runnable() { // from class: l.ᩴܿۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C19605.m45045(this.f59567, c0553);
                }
            };
            StringBuilder sb = new StringBuilder("MT MCP Smali Search #");
            int i6 = i5 + 1;
            sb.append(i6);
            Thread thread = new Thread(runnable, sb.toString());
            threadArr[i5] = thread;
            thread.start();
            i5 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45049() {
        do {
            synchronized (this.f63320) {
                if (this.f63319 >= this.f63315) {
                    this.f63307 = true;
                    this.f63320.notifyAll();
                    return false;
                }
            }
        } while (!C5493.m15619(this.f63305, this.f63313, m45047()));
        m45046();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45045(C19605 c19605, C0553 c0553) {
        int i;
        int i2;
        while (true) {
            synchronized (c19605.f63320) {
                while (true) {
                    if (c19605.f63306 || c19605.f63307 || (i2 = c19605.f63308) >= c19605.f63315) {
                        i = -1;
                        break;
                    }
                    if (i2 < c19605.f63319 + 16) {
                        c19605.f63308 = i2 + 1;
                        i = i2;
                        break;
                    } else {
                        Object obj = c19605.f63320;
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c19605.f63306 = true;
                            obj.notifyAll();
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                c19605.m45044(c19605.f63317.m15601(c19605.f63304, c19605.f63309, c19605.f63310, c19605.f63312, c0553, i, 0, c19605.f63314, c19605.f63311));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45044(C14664 c14664) {
        boolean z;
        synchronized (this.f63320) {
            try {
                int i = c14664.f44814 % 16;
                while (true) {
                    z = this.f63306;
                    if (z || this.f63316[i] == null) {
                        break;
                    }
                    Object obj = this.f63320;
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f63306 = true;
                        obj.notifyAll();
                    }
                }
                if (z) {
                    return;
                }
                this.f63316[i] = c14664;
                if (c14664.f44815 != null) {
                    this.f63307 = true;
                }
                this.f63320.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14664 m45047() {
        C14664 c14664;
        synchronized (this.f63320) {
            while (true) {
                int i = this.f63319;
                int i2 = i % 16;
                C14664[] c14664Arr = this.f63316;
                c14664 = c14664Arr[i2];
                if (c14664 != null) {
                    if (c14664.f44814 != i) {
                        throw C3059.m9368("SMALI_READ_FAILED", "Smali search result window is out of order");
                    }
                    c14664Arr[i2] = null;
                    this.f63319 = i + 1;
                    this.f63320.notifyAll();
                } else {
                    if (this.f63306) {
                        throw C3059.m9368("SMALI_READ_FAILED", "Smali search worker stopped");
                    }
                    try {
                        this.f63320.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw C3059.m9368("SMALI_READ_FAILED", "Interrupted while searching smali");
                    }
                }
            }
        }
        return c14664;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45046() {
        synchronized (this.f63320) {
            this.f63307 = true;
            this.f63320.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45048() {
        synchronized (this.f63320) {
            this.f63306 = true;
            this.f63307 = true;
            this.f63320.notifyAll();
        }
        for (Thread thread : this.f63318) {
            if (thread != null) {
                boolean z = false;
                while (true) {
                    try {
                        thread.join();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
