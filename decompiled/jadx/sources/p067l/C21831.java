package p067l;

import android.app.ActivityManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import bin.p000mt.plus.R;
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
public final class C21831 implements InterfaceC6605, AutoCloseable {

    /* JADX INFO: renamed from: ֡֫ */
    public final ExecutorService f68678;

    /* JADX INFO: renamed from: ֫֫ */
    public final C6762 f68679;

    /* JADX INFO: renamed from: ۖ֫ */
    public final C13784 f68680;

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f68681;

    /* JADX INFO: renamed from: ۘ֫ */
    public final ArrayList f68682;

    /* JADX INFO: renamed from: ۙ */
    public boolean f68683;

    /* JADX INFO: renamed from: ۛ */
    public C15535 f68684;

    /* JADX INFO: renamed from: ۜ֫ */
    public final ExecutorService f68685;

    /* JADX INFO: renamed from: ۟ */
    public RunnableC8805 f68686;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f68687;

    /* JADX INFO: renamed from: ۢ֫ */
    public final long f68688;

    /* JADX INFO: renamed from: ۤ */
    public int f68689;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Handler f68690;

    /* JADX INFO: renamed from: ۨ */
    public C17135 f68691;

    /* JADX INFO: renamed from: ۫ */
    public volatile C17135 f68692;

    /* JADX INFO: renamed from: ۬ */
    public volatile boolean f68693;

    /* JADX INFO: renamed from: ܰ */
    public volatile long f68694;

    /* JADX INFO: renamed from: ܳ֫ */
    public C17135 f68695;

    /* JADX INFO: renamed from: ܺ֫ */
    public long f68696;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f68697;

    /* JADX INFO: renamed from: ܿ֫ */
    public final SparseArray f68698;

    /* JADX INFO: renamed from: ᩳ֫ */
    public volatile long f68699;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final long f68700;

    /* JADX INFO: renamed from: ᩵֫ */
    public AbstractC14651 f68701;

    /* JADX INFO: renamed from: ᩶ */
    public final C21358 f68702;

    /* JADX INFO: renamed from: ᩷֫ */
    public final IdentityHashMap f68703;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f68704;

    /* JADX INFO: renamed from: ᩹ */
    public final long f68705;

    /* JADX INFO: renamed from: ᩺ */
    public C23369 f68706;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C13784 f68707;

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49201(final C21831 c21831, C23369 c23369, final C7749 c7749, final boolean z, C23526 c23526, long j, final C17135 c17135, final C23526 c23527) {
        AbstractC24196 abstractC24196 = c17135.f50998;
        final C23172 c23172 = new C23172();
        c23172.f72792 = c23369;
        try {
            try {
                if (!c21831.m49203(c7749)) {
                    c23172.f72791 = false;
                    if (z) {
                        c23172.f72794 = C6762.m15442(c23526, c23369, c21831.f68688);
                        c23172.f72792 = null;
                    } else {
                        C21358 c21358 = new C21358(j, c23369);
                        if (abstractC24196.mo8378()) {
                            C13784 c13784 = c21831.f68707;
                            if (c13784 == null) {
                                throw new IOException("A cache directory is required for this image source");
                            }
                            C8419 c8419M31438 = c13784.m31438(abstractC24196, false, new InterfaceC18588() { // from class: l.ܳ᩺ۜ
                                @Override // p067l.InterfaceC18588
                                /* JADX INFO: renamed from: ᩻ */
                                public final boolean mo3924() {
                                    return this.f48357.m49203(c7749);
                                }
                            });
                            try {
                                c21831.m49198(c7749, c8419M31438, c23172, c21358, false);
                                c8419M31438.close();
                            } catch (Throwable th) {
                                try {
                                    c8419M31438.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else {
                            c21831.m49198(c7749, c17135.f50998, c23172, c21358, false);
                        }
                        c23369.m52021(c21358.m48384());
                    }
                }
                if (c23526 != null) {
                    c23526.close();
                }
            } catch (Throwable th3) {
                if (c23526 != null) {
                    c23526.close();
                }
                throw th3;
            }
        } catch (IOException e) {
            e = e;
            c23172.f72793 = e;
            if (c23526 != null) {
                c23526.close();
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            c23172.f72793 = e;
            if (c23526 != null) {
                c23526.close();
            }
        } catch (RuntimeException e3) {
            e = e3;
            c23172.f72793 = e;
            if (c23526 != null) {
                c23526.close();
            }
        } catch (StackOverflowError e4) {
            e = e4;
            c23172.f72793 = e;
            if (c23526 != null) {
                c23526.close();
            }
        }
        c21831.f68690.post(new Runnable() { // from class: l.᩻᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C21831.m49202(this.f80555, z, c17135, c23527, c7749, c23172);
            }
        });
    }

    public C21831(ActivityC17586 activityC17586, ArrayList arrayList) {
        long jMin;
        ActivityManager activityManager = (ActivityManager) activityC17586.getSystemService("activity");
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
            C21358 c21358 = new C21358(Math.max(1048576L, jMin), null);
            File file = new File(activityC17586.getCacheDir(), "gallery-sources");
            this.f68698 = new SparseArray(3);
            this.f68679 = new C6762();
            this.f68690 = new Handler(Looper.getMainLooper());
            this.f68678 = Executors.newSingleThreadExecutor(new ThreadFactoryC6408());
            this.f68685 = Executors.newSingleThreadExecutor(new ThreadFactoryC20490());
            this.f68703 = new IdentityHashMap();
            this.f68704 = true;
            if (arrayList == null || arrayList.isEmpty() || c21358.m48381() < 1048576) {
                throw new IllegalArgumentException("Invalid gallery sources or bitmap budget");
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            this.f68682 = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((AbstractC24196) it.next()) == null) {
                    throw new IllegalArgumentException("Null gallery source");
                }
            }
            this.f68702 = c21358;
            c21358.m48383(new RunnableC20875(3, this));
            long jMin2 = Math.min(X931RNG.BLOCK128_RESEED_MAX, c21358.m48381() / 8);
            this.f68688 = jMin2;
            this.f68705 = (c21358.m48381() / 3) * 2;
            this.f68700 = c21358.m48381() - (jMin2 * 3);
            this.f68680 = new C13784(file);
            this.f68707 = new C13784(file);
            return;
        }
        throw new IllegalArgumentException("Memory class must be positive");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49248(AbstractC14651 abstractC14651, int i) {
        m49242();
        if (this.f68681 || this.f68701 != null) {
            throw new IllegalStateException("Gallery session already attached or closed");
        }
        this.f68701 = abstractC14651;
        abstractC14651.getClass();
        this.f68693 = abstractC14651 instanceof C7276;
        abstractC14651.mo16689(this, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49251(AbstractC14651 abstractC14651, int i) {
        AbstractC14651 abstractC14652;
        m49242();
        if (this.f68681 || (abstractC14652 = this.f68701) == null) {
            throw new IllegalStateException("Gallery session is not attached");
        }
        abstractC14652.mo16698();
        this.f68701 = null;
        m49248(abstractC14651, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49247(RunnableC8805 runnableC8805) {
        m49242();
        this.f68686 = runnableC8805;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49244() {
        return this.f68682.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16819 m49245(int i) {
        m49242();
        C17135 c17135 = (C17135) this.f68698.get(i);
        if (c17135 == null || c17135.f50995) {
            return null;
        }
        return c17135.f51003;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m49252(int i) {
        C17135 c17135 = (C17135) this.f68698.get(i);
        return c17135 != null && c17135.f51008;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m49255(int i) {
        AbstractC24196 abstractC24196 = (AbstractC24196) this.f68682.get(i);
        abstractC24196.getClass();
        return abstractC24196 instanceof C6149;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49257(int i) {
        m49242();
        this.f68699++;
        this.f68689 = i;
        this.f68692 = (C17135) this.f68698.get(i);
        if (this.f68692 != null) {
            this.f68692.f51000 = false;
            if (this.f68692.f51003 != null) {
                this.f68692.f50985 = true;
            }
            this.f68692.f51014 |= this.f68692.f50996;
            this.f68692.f50996 = true;
        }
        for (int i2 = 0; i2 < this.f68698.size(); i2++) {
            C17135 c17135 = (C17135) this.f68698.valueAt(i2);
            if (!this.f68693 && c17135 != this.f68692) {
                c17135.m38787();
            }
            c17135.m38793();
        }
        for (int i3 = 0; i3 < this.f68698.size(); i3++) {
            ((C17135) this.f68698.valueAt(i3)).f50999 = false;
        }
        m49238();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49254() {
        if (!this.f68693 || this.f68681) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f68698.size(); i++) {
            C17135 c17135 = (C17135) this.f68698.valueAt(i);
            boolean zMo16690 = this.f68701.mo16690(c17135.f50987);
            if (c17135.f50983 != zMo16690) {
                c17135.f50983 = zMo16690;
                if (!zMo16690) {
                    c17135.m38787();
                }
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < this.f68698.size(); i2++) {
                ((C17135) this.f68698.valueAt(i2)).f51013 = false;
            }
        }
        m49238();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49250(int i, long j) {
        m49242();
        if (this.f68681) {
            return;
        }
        C17135 c17135 = (C17135) this.f68698.get(i);
        if (c17135 != null) {
            c17135.m38790();
        }
        C17135 c17136 = new C17135(this, i, j, (AbstractC24196) this.f68682.get(i));
        this.f68698.put(i, c17136);
        if (i == this.f68689) {
            this.f68692 = c17136;
            c17136.f50996 = true;
        }
        m49238();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49246(int i, long j) {
        m49242();
        C17135 c17135 = (C17135) this.f68698.get(i);
        if (c17135 == null || c17135.f50986 != j) {
            return;
        }
        this.f68698.remove(i);
        if (this.f68692 == c17135) {
            this.f68692 = null;
        }
        c17135.m38790();
        m49238();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49256() {
        AbstractC14651 abstractC14651;
        int i = this.f68689;
        m49242();
        if (this.f68681 || (abstractC14651 = this.f68701) == null) {
            return;
        }
        abstractC14651.mo16694(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49249(boolean z) {
        m49242();
        if (this.f68681 || this.f68704 == z) {
            return;
        }
        this.f68704 = z;
        this.f68694++;
        for (int i = 0; i < this.f68698.size(); i++) {
            C17135 c17135 = (C17135) this.f68698.valueAt(i);
            c17135.m38787();
            if (z && c17135.f51003 != null) {
                c17135.f50985 = true;
                c17135.f51014 = true;
            }
            c17135.m38793();
        }
        AbstractC14651 abstractC14651 = this.f68701;
        if (abstractC14651 != null) {
            abstractC14651.invalidate();
        }
        m49238();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m49253() {
        m49242();
        this.f68694++;
        for (int i = 0; i < this.f68698.size(); i++) {
            C17135 c17135 = (C17135) this.f68698.valueAt(i);
            c17135.f50981 = Math.max(262144L, c17135.f50981 / 2);
            c17135.m38787();
        }
        AbstractC14651 abstractC14651 = this.f68701;
        if (abstractC14651 != null) {
            abstractC14651.invalidate();
        }
        m49238();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m49242();
        if (this.f68681) {
            return;
        }
        this.f68681 = true;
        this.f68702.m48383((RunnableC20875) null);
        this.f68704 = false;
        this.f68692 = null;
        this.f68686 = null;
        AbstractC14651 abstractC14651 = this.f68701;
        if (abstractC14651 != null) {
            abstractC14651.mo16698();
        }
        this.f68701 = null;
        for (int i = 0; i < this.f68698.size(); i++) {
            ((C17135) this.f68698.valueAt(i)).m38790();
        }
        this.f68698.clear();
        this.f68678.execute(new RunnableC22099(6, this));
        this.f68678.shutdown();
        this.f68685.execute(new RunnableC2899(1, this));
        this.f68685.shutdown();
    }

    /* JADX INFO: renamed from: ܿ */
    public static /* synthetic */ void m49230(C21831 c21831) {
        c21831.m49207();
        c21831.m49221(true);
        C13784 c13784 = c21831.f68680;
        if (c13784 != null) {
            c13784.close();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m49228(C21831 c21831) {
        C13784 c13784 = c21831.f68707;
        if (c13784 != null) {
            c13784.close();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m49242() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Gallery UI access off main thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩵ */
    public void m49238() {
        if (this.f68681) {
            return;
        }
        this.f68697 = true;
        if (this.f68687) {
            return;
        }
        this.f68687 = true;
        this.f68690.post(new RunnableC17751(4, this));
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m49220(final C21831 c21831) {
        c21831.f68687 = false;
        if (c21831.f68681 || c21831.f68683) {
            return;
        }
        long jM49208 = c21831.m49208();
        if (jM49208 != 0 && c21831.f68702.m48381() - c21831.f68702.m48384() < jM49208 && c21831.f68695 == null) {
            for (int size = c21831.f68698.size() - 1; size >= 0; size--) {
                C17135 c17135 = (C17135) c21831.f68698.valueAt(size);
                if (c17135 != c21831.f68692 && (c17135.f51002 != null || c17135.f51017 != null)) {
                    c21831.f68701.mo16694(c17135.f50987);
                }
            }
        }
        c21831.m49236();
        final C7749 c7749M49211 = c21831.m49211();
        if (c7749M49211 != null) {
            c7749M49211.f20332 = c7749M49211.f20333 != c21831.f68692;
        }
        c21831.f68697 = false;
        c21831.f68683 = true;
        c21831.f68678.execute(new Runnable() { // from class: l.᩵᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C21831.m49215(this.f66477, c7749M49211);
            }
        });
    }

    /* JADX INFO: renamed from: ۡ */
    public static /* synthetic */ void m49215(final C21831 c21831, final C7749 c7749) {
        C17135 c17135;
        final C23172 c23172 = new C23172();
        try {
            if (c21831.f68691 != (c7749 == null ? c21831.f68692 : c7749.f20333) || !c21831.f68704 || ((c17135 = c21831.f68691) != null && c17135.f50995)) {
                c21831.m49207();
            }
            c21831.m49221(false);
            if (c7749 != null && !c7749.f20333.f50995 && c21831.f68704 && !c21831.f68681) {
                c21831.m49219(c7749, c23172);
            }
        } catch (IOException | OutOfMemoryError | RuntimeException | StackOverflowError e) {
            c23172.f72793 = e;
            if (c7749 != null && c7749.f20326 == null && c21831.f68691 == c7749.f20333) {
                c21831.m49207();
            }
        }
        if (c21831.f68681 || (c7749 != null && c7749.f20333.f50995)) {
            c23172.close();
            c21831.m49207();
        }
        c21831.f68690.post(new Runnable() { // from class: l.ۧ᩺ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C21831.m49200(this.f36842, c7749, c23172);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m49200(C21831 c21831, C7749 c7749, C23172 c23172) {
        c21831.f68683 = false;
        if (c7749 != null) {
            c21831.m49197(c7749, c23172);
        } else {
            c23172.close();
        }
        if (!c21831.f68681 && (c21831.f68697 || c21831.m49211() != null)) {
            c21831.m49238();
        }
        c21831.m49236();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ */
    public C7749 m49211() {
        C7749 c7749M49227;
        C7749 c7749M49196;
        C7749 c7749M49228;
        if (!this.f68704 || this.f68681) {
            return null;
        }
        C7749 c7749M49229 = m49227(this.f68692);
        if (c7749M49229 != null) {
            return c7749M49229;
        }
        if (this.f68693) {
            for (int i = 0; i < this.f68698.size(); i++) {
                C17135 c17135 = (C17135) this.f68698.valueAt(i);
                if (c17135 != this.f68692 && c17135.f50983 && (c7749M49228 = m49227(c17135)) != null) {
                    return c7749M49228;
                }
            }
        }
        C7749 c7749M49197 = m49196(this.f68692);
        if (c7749M49197 != null) {
            return c7749M49197;
        }
        if (this.f68693) {
            for (int i2 = 0; i2 < this.f68698.size(); i2++) {
                C17135 c17136 = (C17135) this.f68698.valueAt(i2);
                if (c17136 != this.f68692 && c17136.f50983 && (c7749M49196 = m49196(c17136)) != null) {
                    return c7749M49196;
                }
            }
        }
        if (!this.f68693) {
            return null;
        }
        for (int i3 = 0; i3 < this.f68698.size(); i3++) {
            C17135 c17137 = (C17135) this.f68698.valueAt(i3);
            if (c17137 != this.f68692 && !c17137.f50983 && c17137.f50998.mo8376() && (c7749M49227 = m49227(c17137)) != null) {
                return c7749M49227;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C7749 m49196(C17135 c17135) {
        if (c17135 == null || c17135.f50995 || c17135.f50985) {
            return null;
        }
        if (c17135.m38792() && c17135.f51011) {
            return null;
        }
        if (c17135.f51017 != null) {
            for (C24924 c24924 : c17135.f51009) {
                if (!(c17135.f50994 ? c17135.f51010 : c17135.f50988).containsKey(c24924) && !c17135.f51006.contains(c24924)) {
                    return new C7749(c17135, c24924, this.f68694, this.f68699);
                }
            }
        }
        if (c17135.f51003 == null || c17135.f51012) {
            return null;
        }
        for (C10843 c10843 : c17135.f51005) {
            if (!c17135.f51016.containsKey(c10843) && !c17135.f51001.contains(c10843)) {
                return new C7749(c17135, c10843, false, this.f68694, this.f68699);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    private C7749 m49227(C17135 c17135) {
        if (c17135 == null || c17135.f50995) {
            return null;
        }
        if (c17135.f50984 && (c17135 == this.f68692 || (this.f68693 && c17135.f50983))) {
            if (this.f68702.m48381() - this.f68702.m48384() < (this.f68693 ? Math.min(1048576L, this.f68702.m48381() / 128) : this.f68705)) {
                return null;
            }
            return new C7749(c17135, null, false, this.f68694, this.f68699);
        }
        if (c17135.f51008) {
            return null;
        }
        if (c17135 != this.f68692 && c17135.f50980) {
            return null;
        }
        if (c17135 != this.f68692 && !c17135.f50998.mo8376()) {
            return null;
        }
        if (c17135.f51003 == null) {
            if (c17135 == this.f68695) {
                return null;
            }
            return new C7749(c17135, null, false, this.f68694, this.f68699);
        }
        if (c17135.f50985) {
            return new C7749(c17135, null, true, this.f68694, this.f68699);
        }
        long jM49208 = m49208();
        if (c17135 != this.f68692 || jM49208 <= 0 || this.f68702.m48381() - this.f68702.m48384() < jM49208) {
            return null;
        }
        return new C7749(c17135, null, false, this.f68694, this.f68699);
    }

    /* JADX INFO: renamed from: ۘ */
    private long m49208() {
        if (this.f68693 || !this.f68704 || this.f68692 == null || this.f68692.f50995) {
            return 0L;
        }
        if (this.f68692.f50984) {
            return this.f68693 ? Math.min(1048576L, this.f68702.m48381() / 128) : this.f68705;
        }
        if (this.f68692.f51017 == null || this.f68692.f51000 || this.f68692.f50985) {
            return 0L;
        }
        long jM34877 = this.f68692.f51017.m34877();
        if (jM34877 <= this.f68702.m48381() - this.f68692.f51017.m34878()) {
            return jM34877;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۢ᩺ۜ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.᩷᩺ۜ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡ᩺ۜ] */
    /* JADX INFO: renamed from: ֫ */
    private void m49198(final C7749 c7749, AbstractC24196 abstractC24196, C23172 c23172, C21358 c21358, boolean z) {
        C15535 c15535M35328;
        if (abstractC24196 instanceof C6149) {
            C13468 c13468Mo8381 = abstractC24196.mo8381();
            c23172.f72794 = ((C6149) abstractC24196).m13947(c21358, this.f68688, (C22502) new InterfaceC18588() { // from class: l.᩷᩺ۜ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f70949.m49203(c7749);
                }
            });
            abstractC24196.m53500(c13468Mo8381);
            c23172.f72789 = new C16819(abstractC24196.mo8382(), c23172.f72794.f74960.getWidth(), c23172.f72794.f74960.getHeight(), 1, "video/*", c13468Mo8381);
            return;
        }
        long jMin = this.f68693 ? Math.min(1048576L, this.f68702.m48381() / 128) : this.f68688;
        C24039 c24039M44334 = C19503.m44334(abstractC24196, (C11773) new InterfaceC18588() { // from class: l.ۢ᩺ۜ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return this.f32903.m49203(c7749);
            }
        });
        C15321 c15321M44332 = C19503.m44332(abstractC24196, c24039M44334, c21358, this.f68688, this.f68705, (C11102) new InterfaceC18588() { // from class: l.ۡ᩺ۜ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return this.f30764.m49203(c7749);
            }
        });
        c23172.f72790 = c15321M44332;
        if (c15321M44332 != null) {
            c23172.f72789 = c15321M44332.f43720;
            return;
        }
        C16819 c16819M15446 = this.f68679.m15446(abstractC24196, c24039M44334.f76361, c24039M44334.f76360.f33528);
        c23172.f72789 = c16819M15446;
        if (c16819M15446.f49785 != null) {
            if (!z || abstractC24196.mo19605() == null) {
                c15535M35328 = null;
            } else {
                m49207();
                try {
                    c15535M35328 = C15535.m35328(abstractC24196, c23172.f72789, c21358, new InterfaceC18588() { // from class: l.ܺ᩺ۜ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return this.f53163.m49203(c7749);
                        }
                    });
                    this.f68684 = c15535M35328;
                    this.f68691 = c7749.f20333;
                } catch (C3409 unused) {
                    c15535M35328 = null;
                }
            }
            c23172.f72794 = C22243.m50077(abstractC24196, c23172.f72789, c21358, jMin, c15535M35328, new InterfaceC18588() { // from class: l.ۖ᩺ۜ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f11870.m49203(c7749);
                }
            }, C21515.f67888);
            return;
        }
        if (!C15535.m35329(c16819M15446.f49786)) {
            jMin = this.f68688;
        }
        if (m49203(c7749)) {
            return;
        }
        c23172.f72794 = this.f68679.m15447(abstractC24196, c23172.f72789, c21358, (!this.f68693 && z && c7749.f20333 == this.f68692 && "image/png".equals(c23172.f72789.f49786)) ? Math.min(X931RNG.BLOCK128_RESEED_MAX, this.f68688 * 2) : jMin);
    }

    /* JADX INFO: renamed from: ᩳ */
    private long m49232(C17135 c17135) {
        C23526 c23526 = c17135.f51002;
        if (c23526 == null || c17135.f50999) {
            return 0L;
        }
        long allocationByteCount = c23526.f74960.getAllocationByteCount();
        long j = this.f68688;
        if (allocationByteCount <= j) {
            return 0L;
        }
        int i = 2;
        while (C6762.m15438(c17135.f51002.f74960.getWidth(), c17135.f51002.f74960.getHeight(), i) > j) {
            i *= 2;
        }
        return C6762.m15438(c17135.f51002.f74960.getWidth(), c17135.f51002.f74960.getHeight(), i);
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m49236() {
        final C17135 c17135;
        long jMin;
        C17135 c17136;
        if (this.f68681 || !this.f68704 || this.f68695 != null || this.f68692 == null) {
            return;
        }
        if ((this.f68692.f51003 != null || this.f68692.f51008) && !this.f68692.f50985) {
            if (this.f68693 || !this.f68704 || this.f68681 || m49208() > 0) {
                c17135 = null;
            } else {
                long jM48381 = this.f68702.m48381() - this.f68702.m48384();
                int i = 0;
                while (true) {
                    if (i < this.f68698.size()) {
                        c17136 = (C17135) this.f68698.valueAt(i);
                        long jM49232 = m49232(c17136);
                        if (c17136 == this.f68692 || jM49232 <= 0 || jM49232 > jM48381) {
                            i++;
                        }
                    } else {
                        if (jM48381 >= this.f68688) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < this.f68698.size()) {
                                    c17136 = (C17135) this.f68698.valueAt(i2);
                                    if (c17136 == this.f68692 || c17136.f50995 || c17136.f51008 || c17136.f50980 || c17136.f51003 != null || !c17136.f50998.mo8376()) {
                                        i2++;
                                    }
                                }
                            }
                        }
                        c17135 = null;
                    }
                    c17135 = c17136;
                }
            }
            if (c17135 == null) {
                return;
            }
            final C23526 c23526 = c17135.f51002;
            boolean z = c23526 != null;
            long jM49233 = z ? m49232(c17135) : this.f68688;
            if (!this.f68692.f51012 || (this.f68692.f51017 != null && this.f68692.f51017.m34876())) {
                jMin = this.f68688;
            } else {
                jMin = Math.min(this.f68705, this.f68702.m48381() - this.f68702.m48384());
            }
            final long j = jMin;
            final C23369 c23369M48382 = this.f68702.m48382(jM49233);
            if (c23369M48382 == null) {
                return;
            }
            C23526 c23526M52304 = z ? c23526.m52304() : null;
            this.f68695 = c17135;
            this.f68696 = z ? jM49233 : 0L;
            this.f68706 = z ? null : c23369M48382;
            final C7749 c7749 = new C7749(c17135, null, false, this.f68694, this.f68699);
            c7749.f20332 = true;
            final boolean z2 = z;
            final C23526 c23527 = c23526M52304;
            this.f68685.execute(new Runnable() { // from class: l.֡᩺ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C21831.m49201(this.f5487, c23369M48382, c7749, z2, c23527, j, c17135, c23526);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49202(C21831 c21831, boolean z, C17135 c17135, C23526 c23526, C7749 c7749, C23172 c23172) {
        c21831.f68695 = null;
        c21831.f68696 = 0L;
        c21831.f68706 = null;
        if (z) {
            if (!c21831.f68681 && c21831.f68704 && !c17135.f50995 && c17135 != c21831.f68692 && c17135.f51002 == c23526 && c7749.f20328 == c21831.f68694 && !c23172.f72791) {
                C23526 c23527 = c23172.f72794;
                if (c23527 == null) {
                    c17135.f50999 = true;
                } else {
                    c23172.f72794 = null;
                    c17135.f51002 = c23527;
                    c23526.close();
                }
            }
            c23172.close();
        } else {
            c21831.m49197(c7749, c23172);
        }
        if (c21831.f68681) {
            return;
        }
        if (c21831.f68692 != null) {
            c21831.f68692.f51013 = false;
        }
        AbstractC14651 abstractC14651 = c21831.f68701;
        if (abstractC14651 != null) {
            abstractC14651.invalidate();
        }
        c21831.m49238();
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49219(final C7749 c7749, C23172 c23172) throws IOException {
        C17135 c17135 = c7749.f20333;
        C10843 c10843 = c7749.f20326;
        if (m49203(c7749)) {
            return;
        }
        c23172.f72791 = false;
        if (c7749.f20330) {
            c23172.f72795 = (c7749.f20329 && c17135.f50998.mo8377()) || !c17135.f51003.f49789.equals(c17135.f50998.mo8381());
            return;
        }
        C24924 c24924 = c7749.f20327;
        if (c24924 != null) {
            c23172.f72794 = c7749.f20325.m34872(c24924.f79599, c24924.f79601, this.f68702, c7749.f20334, new C18477(this, c7749));
            return;
        }
        if (c10843 == null) {
            m49198(c7749, m49218(c7749), c23172, this.f68702, true);
            return;
        }
        C17135 c17136 = this.f68691;
        C21358 c21358 = this.f68702;
        if (c17136 != c17135) {
            m49207();
            AbstractC24196 abstractC24196M49218 = m49218(c7749);
            C16819 c16819 = c17135.f51003;
            this.f68684 = c16819.f49785 == null ? C15535.m35327(abstractC24196M49218, c16819) : C15535.m35328(abstractC24196M49218, c16819, c21358, new InterfaceC18588() { // from class: l.ᩳ᩺ۜ
                @Override // p067l.InterfaceC18588
                /* JADX INFO: renamed from: ᩻ */
                public final boolean mo3924() {
                    return this.f60272.m49203(c7749);
                }
            });
            this.f68691 = c17135;
        }
        c23172.f72794 = this.f68684.m35330(new Rect(c10843.f30030, c10843.f30034, c10843.f30035, c10843.f30027), c10843.f30028, c21358, new InterfaceC18588() { // from class: l.ܿ᩺ۜ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return this.f57214.m49203(c7749);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m49203(C7749 c7749) {
        if (this.f68681 || !this.f68704 || c7749.f20328 != this.f68694 || c7749.f20333.f50995 || ((c7749.f20331 != this.f68699 && ((!this.f68693 || !c7749.f20333.f50998.mo8376() || (!c7749.f20332 && c7749.f20333.f50998.mo8378())) && (!c7749.f20332 || c7749.f20335 != null || c7749.f20333 != this.f68692 || c7749.f20326 != null || c7749.f20327 != null || !c7749.f20333.f50998.mo8376()))) || (((c7749.f20326 != null || c7749.f20327 != null) && !m49222(c7749.f20333)) || (c7749.f20327 != null && !c7749.f20333.f51009.contains(c7749.f20327))))) {
            c7749.f20324 = true;
        }
        return c7749.f20324;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public boolean m49222(C17135 c17135) {
        if (this.f68693) {
            return c17135.f50983;
        }
        return c17135 == this.f68692;
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC24196 m49218(final C7749 c7749) throws IOException {
        C17135 c17135 = c7749.f20333;
        AbstractC24196 abstractC24196 = c17135.f50998;
        if (!abstractC24196.mo8378()) {
            return abstractC24196;
        }
        IdentityHashMap identityHashMap = this.f68703;
        C8419 c8419 = (C8419) identityHashMap.get(c17135);
        if (c8419 != null) {
            return c8419;
        }
        C13784 c13784 = this.f68680;
        if (c13784 == null) {
            throw new IOException("A cache directory is required for this image source");
        }
        C8419 c8419M31438 = c13784.m31438(abstractC24196, !c7749.f20332, new InterfaceC18588() { // from class: l.ۜ᩺ۜ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return this.f24643.m49203(c7749);
            }
        });
        identityHashMap.put(c17135, c8419M31438);
        return c8419M31438;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49221(boolean z) {
        Iterator it = this.f68703.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C17135 c17135 = (C17135) entry.getKey();
            if (z || c17135.f50995 || !m49222(c17135)) {
                if (this.f68691 == c17135) {
                    m49207();
                }
                ((C8419) entry.getValue()).close();
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۖ */
    private void m49207() {
        try {
            C15535 c15535 = this.f68684;
            if (c15535 != null) {
                c15535.close();
            }
        } catch (IOException unused) {
        } finally {
            this.f68684 = null;
            this.f68691 = null;
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
    /* JADX INFO: renamed from: ֫ */
    private void m49197(C7749 c7749, C23172 c23172) {
        AbstractC14651 abstractC14651;
        C23842 c23842;
        Iterator it;
        int i;
        AbstractC14651 abstractC14652;
        C17135 c17135 = c7749.f20333;
        if (this.f68681 || !this.f68704 || c7749.f20328 != this.f68694 || c17135.f50995 || this.f68698.get(c17135.f50987) != c17135 || c23172.f72791 || m49203(c7749)) {
            c23172.close();
            return;
        }
        boolean z = true;
        if (c7749.f20332 && c17135.f51003 == null && c23172.f72793 != null && (!this.f68693 || !c17135.f50983 || !(c23172.f72793 instanceof C3409))) {
            c17135.f50980 = true;
            c17135.f50984 = this.f68693 && (c23172.f72793 instanceof C3409);
            c23172.close();
            return;
        }
        Throwable th = c23172.f72793;
        if ((th instanceof C8103) || c23172.f72795) {
            c23172.close();
            int i2 = c17135.f50987;
            m49242();
            if (this.f68681 || (abstractC14651 = this.f68701) == null) {
                return;
            }
            abstractC14651.mo16694(i2);
            return;
        }
        if (c7749.f20330) {
            c17135.f50985 = false;
            if (th != null) {
                int i3 = c17135.f50987;
                m49242();
                if (!this.f68681 && (abstractC14652 = this.f68701) != null) {
                    abstractC14652.mo16694(i3);
                }
            } else {
                c17135.m38793();
            }
        } else {
            C24924 c24924 = c7749.f20327;
            if (c24924 != null) {
                C23526 c23526 = c23172.f72794;
                if (c23526 != null) {
                    HashMap map = c17135.f50994 ? c17135.f51010 : c17135.f50988;
                    c23172.f72794 = null;
                    C23526 c23527 = (C23526) map.put(c24924, c23526);
                    if (c23527 != null) {
                        c23527.close();
                    }
                    c17135.m38784();
                    this.f68701.invalidate();
                } else {
                    if (th instanceof C3409) {
                        c17135.f50981 = Math.max(262144L, c17135.f50981 / 2);
                        c17135.m38786();
                        c17135.f51009 = new ArrayList();
                        c17135.f51013 = false;
                        this.f68701.invalidate();
                    }
                    c17135.f51006.add(c7749.f20327);
                }
            } else if (c7749.f20326 == null) {
                C15321 c15321 = c7749.f20335;
                if (c15321 != null && c23172.f72790 == null) {
                    c17135.f51000 = true;
                    c23172.close();
                    return;
                }
                if (c23172.f72794 == null && c23172.f72790 == null) {
                    boolean z2 = th instanceof C3409;
                    if (!z2 || (c23172.f72792 == null && c17135.f50984)) {
                        z = false;
                    }
                    c17135.f50984 = z;
                    c17135.f51008 = !z;
                    if (!z) {
                        AbstractC14651 abstractC14653 = this.f68701;
                        int i4 = c17135.f50987;
                        long j = c17135.f50986;
                        if (th instanceof C4080) {
                            i = R.string.MT_Protector;
                        } else if (th instanceof C13311) {
                            i = R.string.MT_Protector;
                        } else {
                            i = (z2 || (th instanceof OutOfMemoryError) || (th instanceof C7947)) ? R.string.MT_Protector : R.string.MT_Protector;
                        }
                        abstractC14653.mo16687(i4, i, j);
                    }
                } else {
                    if (c15321 != null) {
                        c15321.m34874(c17135.f50991);
                    }
                    c17135.f50980 = false;
                    c17135.f50984 = false;
                    c17135.f51008 = false;
                    c17135.f51003 = c23172.f72789;
                    C23369 c23369 = c23172.f72792;
                    c23172.f72792 = null;
                    c17135.f50991 = c23369;
                    C23526 c23528 = c23172.f72794;
                    c23172.f72794 = null;
                    c17135.f51002 = c23528;
                    C15321 c15322 = c23172.f72790;
                    c23172.f72790 = null;
                    c17135.f51017 = c15322;
                    AbstractC24196 abstractC24196 = c17135.f50998;
                    abstractC24196.getClass();
                    if (!(abstractC24196 instanceof C6149) && c17135.f51017 == null) {
                        z = false;
                    }
                    c17135.f51012 = z;
                    if (!this.f68701.mo16691(c17135.f50987, c17135.f50986, c17135)) {
                        c17135.m38790();
                    }
                    c17135.m38793();
                }
            } else if (m49222(c17135)) {
                if (c17135.m38792()) {
                    C10843 c10843 = c7749.f20326;
                    RectF rectF = c17135.f50990;
                    C23526 c23529 = c17135.f51002;
                    if (c23529 != null) {
                        float f = c17135.f50982;
                        if (f > 0.0f) {
                            C16819 c16819 = c17135.f51003;
                            List listM9146 = C4396.m9146(c16819.f49783, c16819.f49784, rectF, f, c23529.f74957, c17135.m38791(), c17135.f50992, c17135.f50993);
                            if (!listM9146.isEmpty()) {
                                C16819 c168110 = c17135.f51003;
                                if (C4396.m9149(c10843, rectF, c168110.f49783, c168110.f49784, ((C10843) listM9146.get(0)).f30028)) {
                                    if (c23172.f72794 != null) {
                                        if (c17135.m38792()) {
                                            it = c17135.f51016.values().iterator();
                                            while (it.hasNext()) {
                                                ((C23842) it.next()).f75754.close();
                                            }
                                            c17135.f51016.clear();
                                            c17135.f51005 = Collections.singletonList(c7749.f20326);
                                            this.f68690.removeCallbacks(c17135.f50979);
                                            c17135.f51011 = false;
                                            c17135.f51015.m21955();
                                            c17135.f51013 = true;
                                        }
                                        C10843 c10844 = c7749.f20326;
                                        C23526 c235210 = c23172.f72794;
                                        c23172.f72794 = null;
                                        c23842 = (C23842) c17135.f51016.put(c7749.f20326, new C23842(c10844, c235210));
                                        if (c23842 != null) {
                                            c23842.f75754.close();
                                        }
                                        ArrayList arrayList = c17135.f51004;
                                        arrayList.clear();
                                        arrayList.addAll(c17135.f51016.values());
                                        this.f68701.invalidate();
                                    } else if (c23172.f72793 instanceof C3409) {
                                        c17135.f50981 = Math.max(262144L, c17135.f50981 / 2);
                                        if (c17135.m38792()) {
                                            c17135.f51013 = false;
                                        } else {
                                            c17135.m38787();
                                        }
                                        c17135.f51001.add(c7749.f20326);
                                        this.f68701.invalidate();
                                    } else {
                                        c17135.f51012 = true;
                                        c17135.m38787();
                                    }
                                }
                            }
                        }
                    }
                } else if (c17135.f51005.contains(c7749.f20326)) {
                    if (c23172.f72794 != null) {
                        if (c17135.m38792()) {
                            it = c17135.f51016.values().iterator();
                            while (it.hasNext()) {
                                ((C23842) it.next()).f75754.close();
                            }
                            c17135.f51016.clear();
                            c17135.f51005 = Collections.singletonList(c7749.f20326);
                            this.f68690.removeCallbacks(c17135.f50979);
                            c17135.f51011 = false;
                            c17135.f51015.m21955();
                            c17135.f51013 = true;
                        }
                        C10843 c10845 = c7749.f20326;
                        C23526 c235211 = c23172.f72794;
                        c23172.f72794 = null;
                        c23842 = (C23842) c17135.f51016.put(c7749.f20326, new C23842(c10845, c235211));
                        if (c23842 != null) {
                            c23842.f75754.close();
                        }
                        ArrayList arrayList2 = c17135.f51004;
                        arrayList2.clear();
                        arrayList2.addAll(c17135.f51016.values());
                        this.f68701.invalidate();
                    } else if (c23172.f72793 instanceof C3409) {
                        c17135.f50981 = Math.max(262144L, c17135.f50981 / 2);
                        if (c17135.m38792()) {
                            c17135.f51013 = false;
                        } else {
                            c17135.m38787();
                        }
                        c17135.f51001.add(c7749.f20326);
                        this.f68701.invalidate();
                    } else {
                        c17135.f51012 = true;
                        c17135.m38787();
                    }
                }
            }
        }
        c23172.close();
        if (m49208() > 0) {
            m49238();
        }
        RunnableC8805 runnableC8805 = this.f68686;
        if (runnableC8805 != null) {
            runnableC8805.run();
        }
    }
}
