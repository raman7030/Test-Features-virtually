package l;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.᩶᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6MU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20478 implements InterfaceC4458, AutoCloseable {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final ExecutorService f66001;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C4623 f66002;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C12011 f66003;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f66004;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f66005;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f66006;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C13854 f66007;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final ExecutorService f66008;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public RunnableC6772 f66009;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f66010;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final long f66011;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f66012;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Handler f66013;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C15537 f66014;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile C15537 f66015;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f66016;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile long f66017;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C15537 f66018;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f66019;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f66020;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f66021;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public volatile long f66022;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final long f66023;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public AbstractC12924 f66024;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19981 f66025;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f66026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f66027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f66028;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22097 f66029;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C12011 f66030;

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46878(final C20478 c20478, C22097 c22097, final C5661 c5661, final boolean z, C22262 c22262, long j, final C15537 c15537, final C22262 c22263) {
        AbstractC22967 abstractC22967 = c15537.f47866;
        final C21889 c21889 = new C21889();
        c21889.f70080 = c22097;
        try {
            try {
                if (!c20478.m46880(c5661)) {
                    c21889.f70079 = false;
                    if (z) {
                        c21889.f70082 = C4623.m13567(c22262, c22097, c20478.f66011);
                        c21889.f70080 = null;
                    } else {
                        C19981 c19981 = new C19981(j, c22097);
                        if (abstractC22967.mo6176()) {
                            C12011 c12011 = c20478.f66030;
                            if (c12011 == null) {
                                throw new IOException("A cache directory is required for this image source");
                            }
                            C6366 c6366M29378 = c12011.m29378(abstractC22967, false, new InterfaceC17066() { // from class: l.ܳ᩺ۜ
                                @Override // l.InterfaceC17066
                                /* JADX INFO: renamed from: ᩻ */
                                public final boolean mo1526() {
                                    return this.f45241.m46880(c5661);
                                }
                            });
                            try {
                                c20478.m46875(c5661, c6366M29378, c21889, c19981, false);
                                c6366M29378.close();
                            } catch (Throwable th) {
                                try {
                                    c6366M29378.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            c20478.m46875(c5661, c15537.f47866, c21889, c19981, false);
                        }
                        c22097.m49683(c19981.m46070());
                    }
                }
                if (c22262 != null) {
                    c22262.close();
                }
            } catch (Throwable th3) {
                if (c22262 != null) {
                    c22262.close();
                }
                throw th3;
            }
        } catch (IOException e) {
            e = e;
            c21889.f70081 = e;
            if (c22262 != null) {
                c22262.close();
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            c21889.f70081 = e;
            if (c22262 != null) {
                c22262.close();
            }
        } catch (RuntimeException e3) {
            e = e3;
            c21889.f70081 = e;
            if (c22262 != null) {
                c22262.close();
            }
        } catch (StackOverflowError e4) {
            e = e4;
            c21889.f70081 = e;
            if (c22262 != null) {
                c22262.close();
            }
        }
        c20478.f66013.post(new Runnable() { // from class: l.᩻᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C20478.m46879(this.f77803, z, c15537, c22263, c5661, c21889);
            }
        });
    }

    public C20478(ActivityC16012 activityC16012, ArrayList arrayList) {
        long jMin;
        ActivityManager activityManager = (ActivityManager) activityC16012.getSystemService("activity");
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        int memoryClass = activityManager.getMemoryClass();
        boolean zIsLowRamDevice = activityManager.isLowRamDevice();
        if (jMaxMemory <= 0) {
            throw new IllegalArgumentException("Maximum heap must be positive");
        }
        if (memoryClass > 0) {
            if (zIsLowRamDevice) {
                jMin = Math.min(16777216L, (((long) memoryClass) * 1048576) / 16);
            } else {
                jMin = Math.min(268435456L, jMaxMemory / 3);
            }
            C19981 c19981 = new C19981(Math.max(1048576L, jMin), null);
            File file = new File(activityC16012.getCacheDir(), "gallery-sources");
            this.f66021 = new SparseArray(3);
            this.f66002 = new C4623();
            this.f66013 = new Handler(Looper.getMainLooper());
            this.f66001 = Executors.newSingleThreadExecutor(new ThreadFactoryC4250());
            this.f66008 = Executors.newSingleThreadExecutor(new ThreadFactoryC19067());
            this.f66026 = new IdentityHashMap();
            this.f66027 = true;
            if (arrayList == null || arrayList.isEmpty() || c19981.m46067() < 1048576) {
                throw new IllegalArgumentException("Invalid gallery sources or bitmap budget");
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f66005 = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((AbstractC22967) it.next()) == null) {
                    throw new IllegalArgumentException("Null gallery source");
                }
            }
            this.f66025 = c19981;
            c19981.m46069(new RunnableC19472(3, this));
            long jMin2 = Math.min(X931RNG.BLOCK128_RESEED_MAX, c19981.m46067() / 8);
            this.f66011 = jMin2;
            this.f66028 = (c19981.m46067() / 3) * 2;
            this.f66023 = c19981.m46067() - (jMin2 * 3);
            this.f66003 = new C12011(file);
            this.f66030 = new C12011(file);
            return;
        }
        throw new IllegalArgumentException("Memory class must be positive");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46925(AbstractC12924 abstractC12924, int i) {
        m46919();
        if (this.f66004 || this.f66024 != null) {
            throw new IllegalStateException("Gallery session already attached or closed");
        }
        this.f66024 = abstractC12924;
        abstractC12924.getClass();
        this.f66016 = abstractC12924 instanceof C5164;
        abstractC12924.mo14781(this, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46928(AbstractC12924 abstractC12924, int i) {
        AbstractC12924 abstractC12925;
        m46919();
        if (this.f66004 || (abstractC12925 = this.f66024) == null) {
            throw new IllegalStateException("Gallery session is not attached");
        }
        abstractC12925.mo14790();
        this.f66024 = null;
        m46925(abstractC12924, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46924(RunnableC6772 runnableC6772) {
        m46919();
        this.f66009 = runnableC6772;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46921() {
        return this.f66005.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15205 m46922(int i) {
        m46919();
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 == null || c15537.f47863) {
            return null;
        }
        return c15537.f47871;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m46929(int i) {
        C15537 c15537 = (C15537) this.f66021.get(i);
        return c15537 != null && c15537.f47876;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m46932(int i) {
        AbstractC22967 abstractC22967 = (AbstractC22967) this.f66005.get(i);
        abstractC22967.getClass();
        return abstractC22967 instanceof C3978;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46934(int i) {
        m46919();
        this.f66022++;
        this.f66012 = i;
        this.f66015 = (C15537) this.f66021.get(i);
        if (this.f66015 != null) {
            this.f66015.f47868 = false;
            if (this.f66015.f47871 != null) {
                this.f66015.f47853 = true;
            }
            this.f66015.f47882 |= this.f66015.f47864;
            this.f66015.f47864 = true;
        }
        for (int i2 = 0; i2 < this.f66021.size(); i2++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i2);
            if (!this.f66016 && c15537 != this.f66015) {
                c15537.m36626();
            }
            c15537.m36632();
        }
        for (int i3 = 0; i3 < this.f66021.size(); i3++) {
            ((C15537) this.f66021.valueAt(i3)).f47867 = false;
        }
        m46915();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46931() {
        if (!this.f66016 || this.f66004) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            boolean zMo14782 = this.f66024.mo14782(c15537.f47855);
            if (c15537.f47851 != zMo14782) {
                c15537.f47851 = zMo14782;
                if (!zMo14782) {
                    c15537.m36626();
                }
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < this.f66021.size(); i2++) {
                ((C15537) this.f66021.valueAt(i2)).f47881 = false;
            }
        }
        m46915();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46927(int i, long j) {
        m46919();
        if (this.f66004) {
            return;
        }
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 != null) {
            c15537.m36629();
        }
        C15537 c15538 = new C15537(this, i, j, (AbstractC22967) this.f66005.get(i));
        this.f66021.put(i, c15538);
        if (i == this.f66012) {
            this.f66015 = c15538;
            c15538.f47864 = true;
        }
        m46915();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46923(int i, long j) {
        m46919();
        C15537 c15537 = (C15537) this.f66021.get(i);
        if (c15537 == null || c15537.f47854 != j) {
            return;
        }
        this.f66021.remove(i);
        if (this.f66015 == c15537) {
            this.f66015 = null;
        }
        c15537.m36629();
        m46915();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46933() {
        AbstractC12924 abstractC12924;
        int i = this.f66012;
        m46919();
        if (this.f66004 || (abstractC12924 = this.f66024) == null) {
            return;
        }
        abstractC12924.mo14786(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46926(boolean z) {
        m46919();
        if (this.f66004 || this.f66027 == z) {
            return;
        }
        this.f66027 = z;
        this.f66017++;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            c15537.m36626();
            if (z && c15537.f47871 != null) {
                c15537.f47853 = true;
                c15537.f47882 = true;
            }
            c15537.m36632();
        }
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        m46915();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46930() {
        m46919();
        this.f66017++;
        for (int i = 0; i < this.f66021.size(); i++) {
            C15537 c15537 = (C15537) this.f66021.valueAt(i);
            c15537.f47849 = Math.max(262144L, c15537.f47849 / 2);
            c15537.m36626();
        }
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        m46915();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46919();
        if (this.f66004) {
            return;
        }
        this.f66004 = true;
        this.f66025.m46069((RunnableC19472) null);
        this.f66027 = false;
        this.f66015 = null;
        this.f66009 = null;
        AbstractC12924 abstractC12924 = this.f66024;
        if (abstractC12924 != null) {
            abstractC12924.mo14790();
        }
        this.f66024 = null;
        for (int i = 0; i < this.f66021.size(); i++) {
            ((C15537) this.f66021.valueAt(i)).m36629();
        }
        this.f66021.clear();
        this.f66001.execute(new RunnableC20760(6, this));
        this.f66001.shutdown();
        this.f66008.execute(new RunnableC0558(1, this));
        this.f66008.shutdown();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46907(C20478 c20478) {
        c20478.m46884();
        c20478.m46898(true);
        C12011 c12011 = c20478.f66003;
        if (c12011 != null) {
            c12011.close();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46905(C20478 c20478) {
        C12011 c12011 = c20478.f66030;
        if (c12011 != null) {
            c12011.close();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m46919() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery UI access off main thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m46915() {
        if (this.f66004) {
            return;
        }
        this.f66020 = true;
        if (this.f66010) {
            return;
        }
        this.f66010 = true;
        this.f66013.post(new RunnableC16185(4, this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m46897(final C20478 c20478) {
        c20478.f66010 = false;
        if (c20478.f66004 || c20478.f66006) {
            return;
        }
        long jM46885 = c20478.m46885();
        if (jM46885 != 0 && c20478.f66025.m46067() - c20478.f66025.m46070() < jM46885 && c20478.f66018 == null) {
            for (int size = c20478.f66021.size() - 1; size >= 0; size--) {
                C15537 c15537 = (C15537) c20478.f66021.valueAt(size);
                if (c15537 != c20478.f66015 && (c15537.f47870 != null || c15537.f47885 != null)) {
                    c20478.f66024.mo14786(c15537.f47855);
                }
            }
        }
        c20478.m46913();
        final C5661 c5661M46888 = c20478.m46888();
        if (c5661M46888 != null) {
            c5661M46888.f17485 = c5661M46888.f17486 != c20478.f66015;
        }
        c20478.f66020 = false;
        c20478.f66006 = true;
        c20478.f66001.execute(new Runnable() { // from class: l.᩵᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C20478.m46892(this.f63839, c5661M46888);
            }
        });
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46892(final C20478 c20478, final C5661 c5661) {
        C15537 c15537;
        final C21889 c21889 = new C21889();
        try {
            if (c20478.f66014 != (c5661 == null ? c20478.f66015 : c5661.f17486) || !c20478.f66027 || ((c15537 = c20478.f66014) != null && c15537.f47863)) {
                c20478.m46884();
            }
            c20478.m46898(false);
            if (c5661 != null && !c5661.f17486.f47863 && c20478.f66027 && !c20478.f66004) {
                c20478.m46896(c5661, c21889);
            }
        } catch (IOException | OutOfMemoryError | RuntimeException | StackOverflowError e) {
            c21889.f70081 = e;
            if (c5661 != null && c5661.f17479 == null && c20478.f66014 == c5661.f17486) {
                c20478.m46884();
            }
        }
        if (c20478.f66004 || (c5661 != null && c5661.f17486.f47863)) {
            c21889.close();
            c20478.m46884();
        }
        c20478.f66013.post(new Runnable() { // from class: l.ۧ᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C20478.m46877(this.f33842, c5661, c21889);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m46877(C20478 c20478, C5661 c5661, C21889 c21889) {
        c20478.f66006 = false;
        if (c5661 != null) {
            c20478.m46874(c5661, c21889);
        } else {
            c21889.close();
        }
        if (!c20478.f66004 && (c20478.f66020 || c20478.m46888() != null)) {
            c20478.m46915();
        }
        c20478.m46913();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5661 m46888() {
        C5661 c5661M46904;
        C5661 c5661M46873;
        C5661 c5661M46905;
        if (!this.f66027 || this.f66004) {
            return null;
        }
        C5661 c5661M46906 = m46904(this.f66015);
        if (c5661M46906 != null) {
            return c5661M46906;
        }
        if (this.f66016) {
            for (int i = 0; i < this.f66021.size(); i++) {
                C15537 c15537 = (C15537) this.f66021.valueAt(i);
                if (c15537 != this.f66015 && c15537.f47851 && (c5661M46905 = m46904(c15537)) != null) {
                    return c5661M46905;
                }
            }
        }
        C5661 c5661M46874 = m46873(this.f66015);
        if (c5661M46874 != null) {
            return c5661M46874;
        }
        if (this.f66016) {
            for (int i2 = 0; i2 < this.f66021.size(); i2++) {
                C15537 c15538 = (C15537) this.f66021.valueAt(i2);
                if (c15538 != this.f66015 && c15538.f47851 && (c5661M46873 = m46873(c15538)) != null) {
                    return c5661M46873;
                }
            }
        }
        if (!this.f66016) {
            return null;
        }
        for (int i3 = 0; i3 < this.f66021.size(); i3++) {
            C15537 c15539 = (C15537) this.f66021.valueAt(i3);
            if (c15539 != this.f66015 && !c15539.f47851 && c15539.f47866.mo6174() && (c5661M46904 = m46904(c15539)) != null) {
                return c5661M46904;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5661 m46873(C15537 c15537) {
        if (c15537 == null || c15537.f47863 || c15537.f47853) {
            return null;
        }
        if (c15537.m36631() && c15537.f47879) {
            return null;
        }
        if (c15537.f47885 != null) {
            for (C23733 c23733 : c15537.f47877) {
                if (!(c15537.f47862 ? c15537.f47878 : c15537.f47856).containsKey(c23733) && !c15537.f47874.contains(c23733)) {
                    return new C5661(c15537, c23733, this.f66017, this.f66022);
                }
            }
        }
        if (c15537.f47871 == null || c15537.f47880) {
            return null;
        }
        for (C8917 c8917 : c15537.f47873) {
            if (!c15537.f47884.containsKey(c8917) && !c15537.f47869.contains(c8917)) {
                return new C5661(c15537, c8917, false, this.f66017, this.f66022);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C5661 m46904(C15537 c15537) {
        if (c15537 == null || c15537.f47863) {
            return null;
        }
        if (c15537.f47852 && (c15537 == this.f66015 || (this.f66016 && c15537.f47851))) {
            if (this.f66025.m46067() - this.f66025.m46070() < (this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66028)) {
                return null;
            }
            return new C5661(c15537, null, false, this.f66017, this.f66022);
        }
        if (c15537.f47876) {
            return null;
        }
        if (c15537 != this.f66015 && c15537.f47848) {
            return null;
        }
        if (c15537 != this.f66015 && !c15537.f47866.mo6174()) {
            return null;
        }
        if (c15537.f47871 == null) {
            if (c15537 == this.f66018) {
                return null;
            }
            return new C5661(c15537, null, false, this.f66017, this.f66022);
        }
        if (c15537.f47853) {
            return new C5661(c15537, null, true, this.f66017, this.f66022);
        }
        long jM46885 = m46885();
        if (c15537 != this.f66015 || jM46885 <= 0 || this.f66025.m46067() - this.f66025.m46070() < jM46885) {
            return null;
        }
        return new C5661(c15537, null, false, this.f66017, this.f66022);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m46885() {
        if (this.f66016 || !this.f66027 || this.f66015 == null || this.f66015.f47863) {
            return 0L;
        }
        if (this.f66015.f47852) {
            return this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66028;
        }
        if (this.f66015.f47885 == null || this.f66015.f47868 || this.f66015.f47853) {
            return 0L;
        }
        long jM32762 = this.f66015.f47885.m32762();
        if (jM32762 <= this.f66025.m46067() - this.f66015.f47885.m32763()) {
            return jM32762;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۢ᩺ۜ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.᩷᩺ۜ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡ᩺ۜ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46875(final C5661 c5661, AbstractC22967 abstractC22967, C21889 c21889, C19981 c19981, boolean z) {
        C13854 c13854M33209;
        if (abstractC22967 instanceof C3978) {
            C11679 c11679Mo6179 = abstractC22967.mo6179();
            c21889.f70082 = ((C3978) abstractC22967).m12023(c19981, this.f66011, (C21184) new InterfaceC17066() { // from class: l.᩷᩺ۜ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f68267.m46880(c5661);
                }
            });
            abstractC22967.m51108(c11679Mo6179);
            c21889.f70077 = new C15205(abstractC22967.mo6180(), c21889.f70082.f72236.getWidth(), c21889.f70082.f72236.getHeight(), 1, "video/*", c11679Mo6179);
            return;
        }
        long jMin = this.f66016 ? Math.min(1048576L, this.f66025.m46067() / 128) : this.f66011;
        C22802 c22802M42083 = C18029.m42083(abstractC22967, (C9895) new InterfaceC17066() { // from class: l.ۢ᩺ۜ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return this.f29945.m46880(c5661);
            }
        });
        C13629 c13629M42081 = C18029.m42081(abstractC22967, c22802M42083, c19981, this.f66011, this.f66028, (C9189) new InterfaceC17066() { // from class: l.ۡ᩺ۜ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return this.f27825.m46880(c5661);
            }
        });
        c21889.f70078 = c13629M42081;
        if (c13629M42081 != null) {
            c21889.f70077 = c13629M42081.f40640;
            return;
        }
        C15205 c15205M13571 = this.f66002.m13571(abstractC22967, c22802M42083.f73631, c22802M42083.f73630.f30566);
        c21889.f70077 = c15205M13571;
        if (c15205M13571.f46660 != null) {
            if (!z || abstractC22967.mo17660() == null) {
                c13854M33209 = null;
            } else {
                m46884();
                try {
                    c13854M33209 = C13854.m33209(abstractC22967, c21889.f70077, c19981, new InterfaceC17066() { // from class: l.ܺ᩺ۜ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return this.f49994.m46880(c5661);
                        }
                    });
                    this.f66007 = c13854M33209;
                    this.f66014 = c5661.f17486;
                } catch (C1095 unused) {
                    c13854M33209 = null;
                }
            }
            c21889.f70082 = C20912.m47747(abstractC22967, c21889.f70077, c19981, jMin, c13854M33209, new InterfaceC17066() { // from class: l.ۖ᩺ۜ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f9073.m46880(c5661);
                }
            }, C20146.f65246);
            return;
        }
        if (!C13854.m33210(c15205M13571.f46661)) {
            jMin = this.f66011;
        }
        if (m46880(c5661)) {
            return;
        }
        c21889.f70082 = this.f66002.m13572(abstractC22967, c21889.f70077, c19981, (!this.f66016 && z && c5661.f17486 == this.f66015 && "image/png".equals(c21889.f70077.f46661)) ? Math.min(X931RNG.BLOCK128_RESEED_MAX, this.f66011 * 2) : jMin);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m46909(C15537 c15537) {
        C22262 c22262 = c15537.f47870;
        if (c22262 == null || c15537.f47867) {
            return 0L;
        }
        long allocationByteCount = c22262.f72236.getAllocationByteCount();
        long j = this.f66011;
        if (allocationByteCount <= j) {
            return 0L;
        }
        int i = 2;
        while (C4623.m13563(c15537.f47870.f72236.getWidth(), c15537.f47870.f72236.getHeight(), i) > j) {
            i *= 2;
        }
        return C4623.m13563(c15537.f47870.f72236.getWidth(), c15537.f47870.f72236.getHeight(), i);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m46913() {
        final C15537 c15537;
        long jMin;
        C15537 c15538;
        if (this.f66004 || !this.f66027 || this.f66018 != null || this.f66015 == null) {
            return;
        }
        if ((this.f66015.f47871 != null || this.f66015.f47876) && !this.f66015.f47853) {
            if (this.f66016 || !this.f66027 || this.f66004 || m46885() > 0) {
                c15537 = null;
            } else {
                long jM46067 = this.f66025.m46067() - this.f66025.m46070();
                int i = 0;
                while (true) {
                    if (i < this.f66021.size()) {
                        c15538 = (C15537) this.f66021.valueAt(i);
                        long jM46909 = m46909(c15538);
                        if (c15538 == this.f66015 || jM46909 <= 0 || jM46909 > jM46067) {
                            i++;
                        }
                    } else {
                        if (jM46067 >= this.f66011) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.f66021.size()) {
                                    c15538 = (C15537) this.f66021.valueAt(i2);
                                    if (c15538 == this.f66015 || c15538.f47863 || c15538.f47876 || c15538.f47848 || c15538.f47871 != null || !c15538.f47866.mo6174()) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c15537 = null;
                    }
                    c15537 = c15538;
                }
            }
            if (c15537 == null) {
                return;
            }
            final C22262 c22262 = c15537.f47870;
            boolean z = c22262 != null;
            long jM469010 = z ? m46909(c15537) : this.f66011;
            if (!this.f66015.f47880 || (this.f66015.f47885 != null && this.f66015.f47885.m32761())) {
                jMin = this.f66011;
            } else {
                jMin = Math.min(this.f66028, this.f66025.m46067() - this.f66025.m46070());
            }
            final long j = jMin;
            final C22097 c22097M46068 = this.f66025.m46068(jM469010);
            if (c22097M46068 == null) {
                return;
            }
            C22262 c22262M49976 = z ? c22262.m49976() : null;
            this.f66018 = c15537;
            this.f66019 = z ? jM469010 : 0L;
            this.f66029 = z ? null : c22097M46068;
            final C5661 c5661 = new C5661(c15537, null, false, this.f66017, this.f66022);
            c5661.f17485 = true;
            final boolean z2 = z;
            final C22262 c22263 = c22262M49976;
            this.f66008.execute(new Runnable() { // from class: l.֡᩺ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C20478.m46878(this.f2715, c22097M46068, c5661, z2, c22263, j, c15537, c22262);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46879(C20478 c20478, boolean z, C15537 c15537, C22262 c22262, C5661 c5661, C21889 c21889) {
        c20478.f66018 = null;
        c20478.f66019 = 0L;
        c20478.f66029 = null;
        if (z) {
            if (!c20478.f66004 && c20478.f66027 && !c15537.f47863 && c15537 != c20478.f66015 && c15537.f47870 == c22262 && c5661.f17481 == c20478.f66017 && !c21889.f70079) {
                C22262 c22263 = c21889.f70082;
                if (c22263 == null) {
                    c15537.f47867 = true;
                } else {
                    c21889.f70082 = null;
                    c15537.f47870 = c22263;
                    c22262.close();
                }
            }
            c21889.close();
        } else {
            c20478.m46874(c5661, c21889);
        }
        if (c20478.f66004) {
            return;
        }
        if (c20478.f66015 != null) {
            c20478.f66015.f47881 = false;
        }
        AbstractC12924 abstractC12924 = c20478.f66024;
        if (abstractC12924 != null) {
            abstractC12924.invalidate();
        }
        c20478.m46915();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46896(final C5661 c5661, C21889 c21889) throws IOException {
        C15537 c15537 = c5661.f17486;
        C8917 c8917 = c5661.f17479;
        if (m46880(c5661)) {
            return;
        }
        c21889.f70079 = false;
        if (c5661.f17483) {
            c21889.f70083 = (c5661.f17482 && c15537.f47866.mo6175()) || !c15537.f47871.f46664.equals(c15537.f47866.mo6179());
            return;
        }
        C23733 c23733 = c5661.f17480;
        if (c23733 != null) {
            c21889.f70082 = c5661.f17478.m32757(c23733.f76848, c23733.f76850, this.f66025, c5661.f17487, new C16949(this, c5661));
            return;
        }
        if (c8917 == null) {
            m46875(c5661, m46895(c5661), c21889, this.f66025, true);
            return;
        }
        C15537 c15538 = this.f66014;
        C19981 c19981 = this.f66025;
        if (c15538 != c15537) {
            m46884();
            AbstractC22967 abstractC22967M46895 = m46895(c5661);
            C15205 c15205 = c15537.f47871;
            this.f66007 = c15205.f46660 == null ? C13854.m33208(abstractC22967M46895, c15205) : C13854.m33209(abstractC22967M46895, c15205, c19981, new InterfaceC17066() { // from class: l.ᩳ᩺ۜ
                @Override // l.InterfaceC17066
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo1526() {
                    return this.f57052.m46880(c5661);
                }
            });
            this.f66014 = c15537;
        }
        c21889.f70082 = this.f66007.m33211(new Rect(c8917.f27098, c8917.f27102, c8917.f27103, c8917.f27095), c8917.f27096, c19981, new InterfaceC17066() { // from class: l.ܿ᩺ۜ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return this.f54021.m46880(c5661);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m46880(C5661 c5661) {
        if (this.f66004 || !this.f66027 || c5661.f17481 != this.f66017 || c5661.f17486.f47863 || ((c5661.f17484 != this.f66022 && ((!this.f66016 || !c5661.f17486.f47866.mo6174() || (!c5661.f17485 && c5661.f17486.f47866.mo6176())) && (!c5661.f17485 || c5661.f17488 != null || c5661.f17486 != this.f66015 || c5661.f17479 != null || c5661.f17480 != null || !c5661.f17486.f47866.mo6174()))) || (((c5661.f17479 != null || c5661.f17480 != null) && !m46899(c5661.f17486)) || (c5661.f17480 != null && !c5661.f17486.f47877.contains(c5661.f17480))))) {
            c5661.f17477 = true;
        }
        return c5661.f17477;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m46899(C15537 c15537) {
        if (this.f66016) {
            return c15537.f47851;
        }
        return c15537 == this.f66015;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC22967 m46895(final C5661 c5661) throws IOException {
        C15537 c15537 = c5661.f17486;
        AbstractC22967 abstractC22967 = c15537.f47866;
        if (!abstractC22967.mo6176()) {
            return abstractC22967;
        }
        IdentityHashMap identityHashMap = this.f66026;
        C6366 c6366 = (C6366) identityHashMap.get(c15537);
        if (c6366 != null) {
            return c6366;
        }
        C12011 c12011 = this.f66003;
        if (c12011 == null) {
            throw new IOException("A cache directory is required for this image source");
        }
        C6366 c6366M29378 = c12011.m29378(abstractC22967, !c5661.f17485, new InterfaceC17066() { // from class: l.ۜ᩺ۜ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return this.f21762.m46880(c5661);
            }
        });
        identityHashMap.put(c15537, c6366M29378);
        return c6366M29378;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m46898(boolean z) {
        Iterator it = this.f66026.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C15537 c15537 = (C15537) entry.getKey();
            if (z || c15537.f47863 || !m46899(c15537)) {
                if (this.f66014 == c15537) {
                    m46884();
                }
                ((C6366) entry.getValue()).close();
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m46884() {
        try {
            C13854 c13854 = this.f66007;
            if (c13854 != null) {
                c13854.close();
            }
        } catch (IOException unused) {
        } finally {
            this.f66007 = null;
            this.f66014 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0203 A[LOOP:0: B:138:0x01fd->B:140:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0262  */
    /* JADX WARN: Code duplicated, block: B:150:0x0276  */
    /* JADX WARN: Code duplicated, block: B:151:0x0279  */
    /* JADX WARN: Code duplicated, block: B:153:0x0289  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46874(C5661 c5661, C21889 c21889) {
        AbstractC12924 abstractC12924;
        C22594 c22594;
        Iterator it;
        int i;
        AbstractC12924 abstractC12925;
        C15537 c15537 = c5661.f17486;
        if (this.f66004 || !this.f66027 || c5661.f17481 != this.f66017 || c15537.f47863 || this.f66021.get(c15537.f47855) != c15537 || c21889.f70079 || m46880(c5661)) {
            c21889.close();
            return;
        }
        boolean z = true;
        if (c5661.f17485 && c15537.f47871 == null && c21889.f70081 != null && (!this.f66016 || !c15537.f47851 || !(c21889.f70081 instanceof C1095))) {
            c15537.f47848 = true;
            c15537.f47852 = this.f66016 && (c21889.f70081 instanceof C1095);
            c21889.close();
            return;
        }
        Throwable th = c21889.f70081;
        if ((th instanceof C6034) || c21889.f70083) {
            c21889.close();
            int i2 = c15537.f47855;
            m46919();
            if (this.f66004 || (abstractC12924 = this.f66024) == null) {
                return;
            }
            abstractC12924.mo14786(i2);
            return;
        }
        if (c5661.f17483) {
            c15537.f47853 = false;
            if (th != null) {
                int i3 = c15537.f47855;
                m46919();
                if (!this.f66004 && (abstractC12925 = this.f66024) != null) {
                    abstractC12925.mo14786(i3);
                }
            } else {
                c15537.m36632();
            }
        } else {
            C23733 c23733 = c5661.f17480;
            if (c23733 != null) {
                C22262 c22262 = c21889.f70082;
                if (c22262 != null) {
                    HashMap map = c15537.f47862 ? c15537.f47878 : c15537.f47856;
                    c21889.f70082 = null;
                    C22262 c22263 = (C22262) map.put(c23733, c22262);
                    if (c22263 != null) {
                        c22263.close();
                    }
                    c15537.m36623();
                    this.f66024.invalidate();
                } else {
                    if (th instanceof C1095) {
                        c15537.f47849 = Math.max(262144L, c15537.f47849 / 2);
                        c15537.m36625();
                        c15537.f47877 = new ArrayList();
                        c15537.f47881 = false;
                        this.f66024.invalidate();
                    }
                    c15537.f47874.add(c5661.f17480);
                }
            } else if (c5661.f17479 == null) {
                C13629 c13629 = c5661.f17488;
                if (c13629 != null && c21889.f70078 == null) {
                    c15537.f47868 = true;
                    c21889.close();
                    return;
                }
                if (c21889.f70082 == null && c21889.f70078 == null) {
                    boolean z2 = th instanceof C1095;
                    if (!z2 || (c21889.f70080 == null && c15537.f47852)) {
                        z = false;
                    }
                    c15537.f47852 = z;
                    c15537.f47876 = !z;
                    if (!z) {
                        AbstractC12924 abstractC12926 = this.f66024;
                        int i4 = c15537.f47855;
                        long j = c15537.f47854;
                        if (th instanceof C1801) {
                            i = R.string.MT_Protector;
                        } else if (th instanceof C11514) {
                            i = R.string.MT_Protector;
                        } else {
                            i = (z2 || (th instanceof OutOfMemoryError) || (th instanceof C5870)) ? R.string.MT_Protector : R.string.MT_Protector;
                        }
                        abstractC12926.mo14779(i4, i, j);
                    }
                } else {
                    if (c13629 != null) {
                        c13629.m32759(c15537.f47859);
                    }
                    c15537.f47848 = false;
                    c15537.f47852 = false;
                    c15537.f47876 = false;
                    c15537.f47871 = c21889.f70077;
                    C22097 c22097 = c21889.f70080;
                    c21889.f70080 = null;
                    c15537.f47859 = c22097;
                    C22262 c22264 = c21889.f70082;
                    c21889.f70082 = null;
                    c15537.f47870 = c22264;
                    C13629 c136210 = c21889.f70078;
                    c21889.f70078 = null;
                    c15537.f47885 = c136210;
                    AbstractC22967 abstractC22967 = c15537.f47866;
                    abstractC22967.getClass();
                    if (!(abstractC22967 instanceof C3978) && c15537.f47885 == null) {
                        z = false;
                    }
                    c15537.f47880 = z;
                    if (!this.f66024.mo14783(c15537.f47855, c15537.f47854, c15537)) {
                        c15537.m36629();
                    }
                    c15537.m36632();
                }
            } else if (m46899(c15537)) {
                if (c15537.m36631()) {
                    C8917 c8917 = c5661.f17479;
                    RectF rectF = c15537.f47858;
                    C22262 c22265 = c15537.f47870;
                    if (c22265 != null) {
                        float f = c15537.f47850;
                        if (f > 0.0f) {
                            C15205 c15205 = c15537.f47871;
                            List listM7051 = C2133.m7051(c15205.f46658, c15205.f46659, rectF, f, c22265.f72233, c15537.m36630(), c15537.f47860, c15537.f47861);
                            if (!listM7051.isEmpty()) {
                                C15205 c15206 = c15537.f47871;
                                if (C2133.m7054(c8917, rectF, c15206.f46658, c15206.f46659, ((C8917) listM7051.get(0)).f27096)) {
                                    if (c21889.f70082 != null) {
                                        if (c15537.m36631()) {
                                            it = c15537.f47884.values().iterator();
                                            while (it.hasNext()) {
                                                ((C22594) it.next()).f73027.close();
                                            }
                                            c15537.f47884.clear();
                                            c15537.f47873 = Collections.singletonList(c5661.f17479);
                                            this.f66013.removeCallbacks(c15537.f47847);
                                            c15537.f47879 = false;
                                            c15537.f47883.m19980();
                                            c15537.f47881 = true;
                                        }
                                        C8917 c8918 = c5661.f17479;
                                        C22262 c22266 = c21889.f70082;
                                        c21889.f70082 = null;
                                        c22594 = (C22594) c15537.f47884.put(c5661.f17479, new C22594(c8918, c22266));
                                        if (c22594 != null) {
                                            c22594.f73027.close();
                                        }
                                        ArrayList arrayList = c15537.f47872;
                                        arrayList.clear();
                                        arrayList.addAll(c15537.f47884.values());
                                        this.f66024.invalidate();
                                    } else if (c21889.f70081 instanceof C1095) {
                                        c15537.f47849 = Math.max(262144L, c15537.f47849 / 2);
                                        if (c15537.m36631()) {
                                            c15537.f47881 = false;
                                        } else {
                                            c15537.m36626();
                                        }
                                        c15537.f47869.add(c5661.f17479);
                                        this.f66024.invalidate();
                                    } else {
                                        c15537.f47880 = true;
                                        c15537.m36626();
                                    }
                                }
                            }
                        }
                    }
                } else if (c15537.f47873.contains(c5661.f17479)) {
                    if (c21889.f70082 != null) {
                        if (c15537.m36631()) {
                            it = c15537.f47884.values().iterator();
                            while (it.hasNext()) {
                                ((C22594) it.next()).f73027.close();
                            }
                            c15537.f47884.clear();
                            c15537.f47873 = Collections.singletonList(c5661.f17479);
                            this.f66013.removeCallbacks(c15537.f47847);
                            c15537.f47879 = false;
                            c15537.f47883.m19980();
                            c15537.f47881 = true;
                        }
                        C8917 c8919 = c5661.f17479;
                        C22262 c22267 = c21889.f70082;
                        c21889.f70082 = null;
                        c22594 = (C22594) c15537.f47884.put(c5661.f17479, new C22594(c8919, c22267));
                        if (c22594 != null) {
                            c22594.f73027.close();
                        }
                        ArrayList arrayList2 = c15537.f47872;
                        arrayList2.clear();
                        arrayList2.addAll(c15537.f47884.values());
                        this.f66024.invalidate();
                    } else if (c21889.f70081 instanceof C1095) {
                        c15537.f47849 = Math.max(262144L, c15537.f47849 / 2);
                        if (c15537.m36631()) {
                            c15537.f47881 = false;
                        } else {
                            c15537.m36626();
                        }
                        c15537.f47869.add(c5661.f17479);
                        this.f66024.invalidate();
                    } else {
                        c15537.f47880 = true;
                        c15537.m36626();
                    }
                }
            }
        }
        c21889.close();
        if (m46885() > 0) {
            m46915();
        }
        RunnableC6772 runnableC6772 = this.f66009;
        if (runnableC6772 != null) {
            runnableC6772.run();
        }
    }
}
