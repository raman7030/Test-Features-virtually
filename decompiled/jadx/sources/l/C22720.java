package l;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩺ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes.dex */
public final class C22720 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f73404;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Executor f73405;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f73406;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20177 f73407;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11432 f73408;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f73409;

    public C22720(Context context) {
        ExecutorService executorService = C1802.f6208;
        C20177 c20177 = new C20177();
        this.f73409 = new Object();
        this.f73404 = context.getApplicationContext();
        this.f73405 = executorService;
        this.f73407 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50778(InterfaceC17889 interfaceC17889, C12053 c12053, long j, int i, InterfaceC22015 interfaceC22015) {
        String strM29435 = c12053.m29435();
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null && c11432.f34192 == i) {
                InterfaceC17889 interfaceC178810 = c11432.f34200;
                String path = null;
                String path2 = interfaceC178810 == null ? null : interfaceC178810.getPath();
                if (interfaceC17889 != null) {
                    path = interfaceC17889.getPath();
                }
                if (C11003.equals(path2, path) && C11003.equals(this.f73408.f34191, strM29435)) {
                    C11432 c11433 = this.f73408;
                    c11433.f34200 = interfaceC17889;
                    c11433.f34194 = c12053;
                    c11433.f34191 = strM29435;
                    c11433.f34198 = j;
                    c11433.f34189 = interfaceC22015;
                    if (c11433.f34190 == null && !this.f73406) {
                        c11433.f34197 = false;
                    }
                    return;
                }
            }
            C11432 c11434 = this.f73408;
            m50771(c11434);
            this.f73408 = new C11432(interfaceC17889, c12053, strM29435, j, i, interfaceC22015);
            if (!this.f73406 && c11434 != null && c11434.f34190 != null) {
                this.f73406 = true;
                this.f73405.execute(new RunnableC0141(this, c11434));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50776(int i, int i2, long j) {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 == null) {
                return;
            }
            int iMax = Math.max(1, i);
            int iMax2 = Math.max(1, i2);
            int i3 = c11432.f34192;
            int i4 = c11432.f34199;
            long j2 = c11432.f34198;
            long jMax = Math.max(1L, 1000L);
            if (j2 <= 0) {
                j2 = C13132.FOREVER_NS;
            }
            C5787 c5787 = new C5787(i3, i4, iMax, iMax2, (Math.max(0L, Math.min(j, j2)) / jMax) * jMax);
            if (c5787.equals(c11432.f34196)) {
                return;
            }
            c11432.f34202 = c5787;
            if (!this.f73406) {
                m50773();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50775() {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null) {
                c11432.f34199++;
                c11432.f34202 = null;
                c11432.f34195 = true;
                if (!this.f73406) {
                    m50773();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50779() {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null && !c11432.f34197) {
                if (c11432.f34190 != null || this.f73406) {
                    m50771(c11432);
                    if (!this.f73406) {
                        m50773();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50777(Runnable runnable) {
        synchronized (this.f73409) {
            C11432 c11432 = this.f73408;
            if (c11432 != null) {
                m50771(c11432);
                c11432.f34193.add(runnable);
                if (!this.f73406) {
                    m50773();
                }
                return;
            }
            Object[] objArr = {runnable};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            C11003.requireNonNull(obj);
            arrayList.add(obj);
            List listUnmodifiableList = C20195.unmodifiableList(arrayList);
            this.f73406 = true;
            this.f73405.execute(new RunnableC0847(this, listUnmodifiableList));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m50771(C11432 c11432) {
        if (c11432 == null) {
            return;
        }
        c11432.f34199++;
        c11432.f34202 = null;
        c11432.f34195 = false;
        c11432.f34197 = true;
        c11432.f34201 = false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m50773() {
        List list;
        final C11432 c11432 = this.f73408;
        if (c11432 == null) {
            return;
        }
        boolean z = c11432.f34197;
        Executor executor = this.f73405;
        if (z && c11432.f34190 != null) {
            this.f73406 = true;
            executor.execute(new RunnableC0141(this, c11432));
            return;
        }
        if (z && c11432.f34190 == null) {
            c11432.f34197 = false;
            ArrayList arrayList = c11432.f34193;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
            if (!list.isEmpty()) {
                this.f73406 = true;
                executor.execute(new RunnableC0847(this, list));
                return;
            }
        }
        if (c11432.f34195) {
            final InterfaceC12842 interfaceC12842 = c11432.f34190;
            c11432.f34195 = false;
            if (interfaceC12842 != null && interfaceC12842.mo9070()) {
                this.f73406 = true;
                executor.execute(new Runnable() { // from class: l.ۚۗۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22720.m50766(this.f15965, interfaceC12842, c11432);
                    }
                });
                return;
            }
        }
        C5787 c5787 = c11432.f34202;
        if (c5787 == null) {
            return;
        }
        c11432.f34202 = null;
        c11432.f34196 = c5787;
        this.f73406 = true;
        executor.execute(new RunnableC7341(this, c11432, c5787));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50762(C22720 c22720, C11432 c11432) {
        c22720.m50767(c11432);
        c22720.m50774(c11432);
        c22720.m50770();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50766(C22720 c22720, InterfaceC12842 interfaceC12842, C11432 c11432) {
        try {
            interfaceC12842.mo9071();
        } catch (Throwable unused) {
        }
        if (c22720.m50772(c11432)) {
            c22720.m50767(c11432);
            c22720.m50774(c11432);
        }
        c22720.m50770();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50764(final C22720 c22720, final C11432 c11432, final C5787 c5787) {
        Bitmap bitmapMo9068;
        try {
            InterfaceC12842 interfaceC12842M50757 = c22720.m50757(c11432);
            if (interfaceC12842M50757 != null) {
                bitmapMo9068 = interfaceC12842M50757.mo9068(c5787.f17816 * 1000, c5787.f17815, c5787.f17813, new InterfaceC19899() { // from class: l.۠ۗۜ
                    @Override // l.InterfaceC19899
                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final void mo21195() {
                        C22720.m50769(this.f24486, c11432, c5787);
                    }
                });
                c22720.m50759(c11432, interfaceC12842M50757);
            } else {
                bitmapMo9068 = null;
            }
        } catch (Throwable unused) {
        }
        c22720.m50758(c11432, c5787, bitmapMo9068);
        synchronized (c22720.f73409) {
            c11432.f34196 = null;
        }
        if (c22720.m50772(c11432)) {
            c22720.m50767(c11432);
            c22720.m50774(c11432);
        }
        c22720.m50770();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC12842 m50757(C11432 c11432) {
        InterfaceC12842 interfaceC12842M29563;
        InterfaceC12842 interfaceC12842 = c11432.f34190;
        if (interfaceC12842 != null) {
            return interfaceC12842;
        }
        C20177 c20177 = this.f73407;
        Context context = this.f73404;
        C12053 c12053 = c11432.f34194;
        long j = c11432.f34198;
        c20177.getClass();
        if (c12053.m29438()) {
            int i = C23068.f74198;
            if (j > 0 && j <= 10000) {
                try {
                    interfaceC12842M29563 = new C10021(context, c12053, C23068.m51227(c12053, j));
                } catch (IOException | RuntimeException unused) {
                    interfaceC12842M29563 = C12137.m29563(context, c12053);
                }
            } else {
                interfaceC12842M29563 = C12137.m29563(context, c12053);
            }
        } else {
            interfaceC12842M29563 = C12137.m29563(context, c12053);
        }
        InterfaceC12842 interfaceC12843 = interfaceC12842M29563;
        synchronized (this.f73409) {
            if (!c11432.f34197 && this.f73408 == c11432) {
                c11432.f34190 = interfaceC12843;
                return interfaceC12843;
            }
            interfaceC12843.mo9069();
            return null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50769(C22720 c22720, C11432 c11432, C5787 c5787) {
        synchronized (c22720.f73409) {
            if (Thread.currentThread().isInterrupted() || c22720.f73408 != c11432 || c11432.f34197 || c11432.f34199 != c5787.f17812) {
                throw new InterruptedIOException("Video preview request was canceled");
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50759(final C11432 c11432, InterfaceC12842 interfaceC12842) {
        C13547 c13547Mo9072;
        synchronized (this.f73409) {
            if (c11432.f34201) {
                return;
            }
            c11432.f34201 = true;
            try {
                c13547Mo9072 = interfaceC12842.mo9072();
            } catch (Throwable unused) {
                c13547Mo9072 = null;
            }
            final C13547 c13547 = c13547Mo9072;
            if (c13547 == null) {
                return;
            }
            synchronized (this.f73409) {
                if (this.f73408 == c11432 && !c11432.f34197) {
                    final int i = c11432.f34192;
                    final int i2 = c11432.f34199;
                    C4925.m14315(new Runnable() { // from class: l.ܶۗۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C22720.m50763(this.f45611, c11432, i2, i, c13547);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50763(C22720 c22720, C11432 c11432, int i, int i2, C13547 c13547) {
        synchronized (c22720.f73409) {
            if (c22720.f73408 == c11432 && c11432.f34199 == i && c11432.f34192 == i2 && !c11432.f34197) {
                c11432.f34189.mo5885(i2, c13547);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m50758(final C11432 c11432, final C5787 c5787, final Bitmap bitmap) {
        synchronized (this.f73409) {
            if (this.f73408 == c11432 && c11432.f34199 == c5787.f17812 && c11432.f34192 == c5787.f17814) {
                C4925.m14315(new Runnable() { // from class: l.᩸ۗۜ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C22720.m50765(this.f68698, c11432, c5787, bitmap);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50765(C22720 c22720, C11432 c11432, C5787 c5787, Bitmap bitmap) {
        synchronized (c22720.f73409) {
            if (c22720.f73408 == c11432 && c11432.f34199 == c5787.f17812 && c11432.f34192 == c5787.f17814) {
                c11432.f34189.mo5884(c5787.f17814, bitmap);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m50772(C11432 c11432) {
        boolean z;
        synchronized (this.f73409) {
            z = c11432.f34197;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m50767(C11432 c11432) {
        InterfaceC12842 interfaceC12842;
        synchronized (this.f73409) {
            interfaceC12842 = c11432.f34190;
            c11432.f34190 = null;
            c11432.f34197 = false;
            c11432.f34201 = false;
        }
        m50768(interfaceC12842);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m50774(C11432 c11432) {
        List list;
        synchronized (this.f73409) {
            ArrayList arrayList = c11432.f34193;
            if (arrayList.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList.clear();
                list = arrayList2;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50761(C22720 c22720, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        c22720.m50770();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m50770() {
        synchronized (this.f73409) {
            this.f73406 = false;
            m50773();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m50768(InterfaceC12842 interfaceC12842) {
        if (interfaceC12842 != null) {
            interfaceC12842.mo9069();
        }
    }
}
