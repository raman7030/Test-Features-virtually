package p067l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.᩵ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: L78E */
/* JADX INFO: loaded from: classes4.dex */
public final class C21001 {

    /* JADX INFO: renamed from: ֡ */
    public final C16484 f65922;

    /* JADX INFO: renamed from: ֫ */
    public final C6248 f65923;

    /* JADX INFO: renamed from: ۖ */
    public boolean f65924;

    /* JADX INFO: renamed from: ۘ */
    public boolean f65925;

    /* JADX INFO: renamed from: ۜ */
    public int f65926;

    /* JADX INFO: renamed from: ۡ */
    public final C24729 f65927;

    /* JADX INFO: renamed from: ۢ */
    public final C3974 f65928;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicBoolean f65929;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f65930;

    /* JADX INFO: renamed from: ܺ */
    public final int f65931;

    /* JADX INFO: renamed from: ܽ */
    public final C11785 f65932;

    /* JADX INFO: renamed from: ܿ */
    public final int f65933;

    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ C7589 f65935;

    /* JADX INFO: renamed from: ᩵ */
    public final Thread[] f65936;

    /* JADX INFO: renamed from: ᩷ */
    public int f65937;

    /* JADX INFO: renamed from: ᩻ */
    public final Object f65938 = new Object();

    /* JADX INFO: renamed from: ᩳ */
    public final C16305[] f65934 = new C16305[16];

    public C21001(C7589 c7589, C16484 c16484, C24729 c24729, C6248 c6248, int i, C3974 c3974, ArrayList arrayList, int i2, int i3, int i4, C11785 c11785, AtomicBoolean atomicBoolean) {
        this.f65935 = c7589;
        this.f65922 = c16484;
        this.f65927 = c24729;
        this.f65923 = c6248;
        this.f65931 = i;
        this.f65928 = c3974;
        this.f65930 = arrayList;
        this.f65926 = i2;
        this.f65937 = i2;
        this.f65933 = i3;
        this.f65932 = c11785;
        this.f65929 = atomicBoolean;
        Thread[] threadArr = new Thread[i4];
        this.f65936 = threadArr;
        int i5 = 0;
        while (i5 < i4) {
            final C2894 c2894 = new C2894(this.f65927);
            Runnable runnable = new Runnable() { // from class: l.ᩴܿۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C21001.m47340(this.f62797, c2894);
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

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47344() {
        do {
            synchronized (this.f65938) {
                if (this.f65937 >= this.f65933) {
                    this.f65925 = true;
                    this.f65938.notifyAll();
                    return false;
                }
            }
        } while (!C7589.m17530(this.f65923, this.f65931, m47342()));
        m47341();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m47340(C21001 c21001, C2894 c2894) {
        int i;
        int i2;
        while (true) {
            synchronized (c21001.f65938) {
                while (true) {
                    if (c21001.f65924 || c21001.f65925 || (i2 = c21001.f65926) >= c21001.f65933) {
                        i = -1;
                        break;
                    }
                    if (i2 < c21001.f65937 + 16) {
                        c21001.f65926 = i2 + 1;
                        i = i2;
                        break;
                    } else {
                        Object obj = c21001.f65938;
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c21001.f65924 = true;
                            obj.notifyAll();
                        }
                    }
                }
            }
            if (i < 0) {
                return;
            } else {
                c21001.m47339(c21001.f65935.m17512(c21001.f65922, c21001.f65927, c21001.f65928, c21001.f65930, c2894, i, 0, c21001.f65932, c21001.f65929));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m47339(C16305 c16305) {
        boolean z;
        synchronized (this.f65938) {
            try {
                int i = c16305.f47924 % 16;
                while (true) {
                    z = this.f65924;
                    if (z || this.f65934[i] == null) {
                        break;
                    }
                    Object obj = this.f65938;
                    try {
                        obj.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        this.f65924 = true;
                        obj.notifyAll();
                    }
                }
                if (z) {
                    return;
                }
                this.f65934[i] = c16305;
                if (c16305.f47925 != null) {
                    this.f65925 = true;
                }
                this.f65938.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private C16305 m47342() {
        C16305 c16305;
        synchronized (this.f65938) {
            while (true) {
                int i = this.f65937;
                int i2 = i % 16;
                C16305[] c16305Arr = this.f65934;
                c16305 = c16305Arr[i2];
                if (c16305 != null) {
                    if (c16305.f47924 != i) {
                        throw C5276.m11410("SMALI_READ_FAILED", "Smali search result window is out of order");
                    }
                    c16305Arr[i2] = null;
                    this.f65937 = i + 1;
                    this.f65938.notifyAll();
                } else {
                    if (this.f65924) {
                        throw C5276.m11410("SMALI_READ_FAILED", "Smali search worker stopped");
                    }
                    try {
                        this.f65938.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw C5276.m11410("SMALI_READ_FAILED", "Interrupted while searching smali");
                    }
                }
            }
        }
        return c16305;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m47341() {
        synchronized (this.f65938) {
            this.f65925 = true;
            this.f65938.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47343() {
        synchronized (this.f65938) {
            this.f65924 = true;
            this.f65925 = true;
            this.f65938.notifyAll();
        }
        for (Thread thread : this.f65936) {
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
