package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0708d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۚܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7549 implements Closeable {

    /* JADX INFO: renamed from: ۟ */
    public static final long f19799 = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: ۗ */
    public ScheduledThreadPoolExecutor f19800;

    /* JADX INFO: renamed from: ۙ */
    public final int f19801;

    /* JADX INFO: renamed from: ۛ */
    public final Semaphore f19802;

    /* JADX INFO: renamed from: ۤ */
    public boolean f19803;

    /* JADX INFO: renamed from: ۨ */
    public final long f19804;

    /* JADX INFO: renamed from: ۫ */
    public final C13241 f19805;

    /* JADX INFO: renamed from: ۬ */
    public boolean f19806;

    /* JADX INFO: renamed from: ܰ */
    public final C19247 f19807;

    /* JADX INFO: renamed from: ᩶ */
    public final long f19808;

    /* JADX INFO: renamed from: ᩸ */
    public final HashSet f19809;

    /* JADX INFO: renamed from: ᩹ */
    public final LinkedHashMap f19810;

    /* JADX INFO: renamed from: ᩺ */
    public final long f19811;

    /* JADX INFO: renamed from: ֫ */
    private synchronized C5276 m17459(String str) {
        JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, str == null ? JSON.NULL : JSON.value(str));
        if (this.f19803) {
            return C5276.m11407("FILE_SEARCH_CANCELED", "Text search service is closed. Restore the MCP service before retrying. After an application process restart, start a new search with cursor=\"\".", "warning", (JSONArray) null, jSONObjectAdd);
        }
        return C5276.m11404(jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized C22640 m17461(String str, C3192 c3192) {
        C20290 c20290;
        m17462();
        c20290 = (C20290) this.f19810.remove(str);
        if (c20290 != null) {
            c3192.m5502(c20290.f62691);
        }
        return c20290 == null ? null : c20290.f62691;
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m17463(String str, C22640 c22640, C3192 c3192) {
        if (!this.f19803 && this.f19801 != 0 && c22640.m50690() <= this.f19808) {
            m17462();
            m17467(str);
            c3192.m5506();
            LinkedHashMap linkedHashMap = this.f19810;
            this.f19805.getClass();
            linkedHashMap.put(str, new C20290(c22640, System.nanoTime()));
            while (true) {
                if (this.f19810.size() <= this.f19801) {
                    Iterator it = this.f19810.values().iterator();
                    long jM50690 = 0;
                    while (it.hasNext()) {
                        jM50690 += ((C20290) it.next()).f62691.m50690();
                    }
                    if (jM50690 <= this.f19808) {
                        m17466();
                        return;
                    }
                }
                m17467((String) this.f19810.keySet().iterator().next());
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m17467(String str) {
        C20290 c20290 = (C20290) this.f19810.remove(str);
        if (c20290 != null) {
            try {
                c20290.f62691.close();
            } catch (IOException unused) {
            }
        }
    }

    public C7549(C19247 c19247) {
        C13241 c13241 = new C13241();
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.f19802 = new Semaphore(4, true);
        this.f19810 = new LinkedHashMap(16, 0.75f, true);
        this.f19809 = new HashSet();
        this.f19807 = c19247;
        this.f19805 = c13241;
        this.f19804 = X931RNG.BLOCK128_RESEED_MAX;
        this.f19811 = nanos;
        this.f19801 = 8;
        this.f19808 = 16777216L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2854 m17468(String str, C20961 c20961, String str2) throws Throwable {
        int i;
        Throwable th;
        C3192 c3192 = new C3192();
        String str3 = null;
        int i2 = 0;
        try {
            try {
                synchronized (this) {
                    if (this.f19803) {
                        throw new IOException("Text search service is closed.");
                    }
                    this.f19809.add(c3192);
                }
                try {
                    this.f19802.acquire();
                    try {
                        try {
                            synchronized (this) {
                                if (this.f19803) {
                                    throw new IOException("Text search service is closed.");
                                }
                            }
                            C2521.m3687();
                            C9385 c9385M43852 = this.f19807.m43852();
                            this.f19807.getClass();
                            String strM43844 = C19247.m43844(str, c9385M43852, MotionUtils.EASING_TYPE_PATH);
                            try {
                                C17273 c17273M39122 = str2.isEmpty() ? null : C17273.m39122(str2, strM43844);
                                if (c17273M39122 != null && (!c20961.f65858.equals(c17273M39122.f51477) || !c20961.m47287(c17273M39122.f51477).equals(c17273M39122.f51475))) {
                                    throw C5276.m11407("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844));
                                }
                                C13259 c13259M17460 = str2.isEmpty() ? m17460(c20961) : null;
                                try {
                                    C11872 c11872M43853 = this.f19807.m43853(strM43844);
                                    try {
                                        C14362 c14362M43858 = this.f19807.m43858(strM43844);
                                        C19247 c19247 = this.f19807;
                                        try {
                                            if (c14362M43858.m32962() == EnumC5645.MISSING) {
                                                c19247.getClass();
                                                throw C19247.m43851(strM43844);
                                            }
                                            if (c14362M43858.m32962() != EnumC5645.REGULAR) {
                                                EnumC5645 enumC5645M32962 = c14362M43858.m32962();
                                                c19247.getClass();
                                                throw C19247.m43848("FILE_NOT_REGULAR", "Text search requires a regular file.", strM43844, enumC5645M32962);
                                            }
                                            if (c14362M43858.m32961() > 9007199254740991L) {
                                                throw C5276.m11407("FILE_STORAGE_ERROR", "File size exceeds the supported JSON integer range.", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844));
                                            }
                                            byte[] bArrCopyOf = new byte[32768];
                                            InputStream inputStreamMo29987 = c14362M43858.m32959().mo29987();
                                            C7216 c7216M5502 = c3192.m5502(inputStreamMo29987);
                                            while (i2 < 32768) {
                                                try {
                                                    try {
                                                        C2521.m3687();
                                                        int i3 = inputStreamMo29987.read(bArrCopyOf, i2, 32768 - i2);
                                                        if (i3 < 0) {
                                                            break;
                                                        }
                                                        if (i3 == 0) {
                                                            int i4 = inputStreamMo29987.read();
                                                            if (i4 < 0) {
                                                                break;
                                                            }
                                                            int i5 = i2 + 1;
                                                            bArrCopyOf[i2] = (byte) i4;
                                                            i2 = i5;
                                                            th = th;
                                                        } else {
                                                            i2 += i3;
                                                        }
                                                    } catch (Throwable th2) {
                                                        try {
                                                            c7216M5502.close();
                                                            throw th2;
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            }
                                            c7216M5502.close();
                                            if (i2 != 32768) {
                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                                            }
                                            String strM36665 = C16111.m36665(C16111.m36668().digest(bArrCopyOf));
                                            C18615 c18615M36053 = C15932.m36053(c20961.f65858, bArrCopyOf);
                                            if (c17273M39122 == null) {
                                                c17273M39122 = new C17273(strM43844, c20961.m47287(c18615M36053.f55586), c18615M36053.f55586, c14362M43858.m32961(), c14362M43858.m32960(), strM36665);
                                                long j = c18615M36053.f55584;
                                                c17273M39122.f51473 = j;
                                                c17273M39122.f51469 = j;
                                            } else if (c17273M39122.f51479 != c14362M43858.m32961() || c17273M39122.f51481 != c14362M43858.m32960() || !c17273M39122.f51468.equals(strM36665) || !c17273M39122.f51477.equals(c18615M36053.f55586)) {
                                                throw m17465(strM43844);
                                            }
                                            C17273 c17273 = c17273M39122;
                                            C22640 c22640M17461 = m17461(str2, c3192);
                                            if (c22640M17461 == null) {
                                                C22640 c22640 = new C22640(c14362M43858.m32959(), c18615M36053, c17273, c20961, c13259M17460 == null ? m17460(c20961) : c13259M17460, c3192);
                                                c3192.m5502(c22640);
                                                c22640M17461 = c22640;
                                            } else {
                                                c17273 = c22640M17461.f71435;
                                            }
                                            C16603 c16603M50691 = c22640M17461.m50691(this.f19804, this.f19811, this.f19805);
                                            synchronized (this) {
                                                if (this.f19803) {
                                                    throw new IOException("Text search service is closed.");
                                                }
                                            }
                                            C14362 c14362M43859 = this.f19807.m43858(strM43844);
                                            if (c16603M50691.f48764.equals(C0708d.f2613aB)) {
                                                long j2 = c17273.f51479;
                                                if (j2 >= 0 && c17273.f51469 != j2) {
                                                    throw m17465(strM43844);
                                                }
                                            }
                                            if (c14362M43859.m32962() != EnumC5645.REGULAR || c14362M43859.m32961() != c14362M43858.m32961() || c14362M43859.m32960() != c14362M43858.m32960()) {
                                                throw m17465(strM43844);
                                            }
                                            this.f19807.m43852().m21856(strM43844);
                                            JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844).add("encoding", c17273.f51477).add("matchedLines", c16603M50691.f48765).add("blocks", c16603M50691.m37616()).add("searchedThroughByteOffset", c17273.f51469);
                                            long j3 = c17273.f51479;
                                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanSize", j3 < 0 ? JSON.NULL : JSON.value(j3)).add("stopReason", c16603M50691.f48764).add("warnings", c16603M50691.f48766);
                                            String strM39124 = (c16603M50691.f48764.equals(C0708d.f2613aB) || c16603M50691.f48764.equals("resource_limit") || c16603M50691.f48764.equals("decode_error")) ? "" : c17273.m39124();
                                            if (!strM39124.isEmpty()) {
                                                m17463(strM39124, c22640M17461, c3192);
                                            }
                                            C2854 c2854 = new C2854(jSONObjectAdd2, strM39124);
                                            c11872M43853.close();
                                            c3192.m5504();
                                            synchronized (this) {
                                                this.f19809.remove(c3192);
                                            }
                                            m17467(str2);
                                            this.f19802.release();
                                            return c2854;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                    }
                                    try {
                                        c11872M43853.close();
                                        throw th;
                                    } catch (Throwable th7) {
                                        th.addSuppressed(th7);
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    e = e;
                                    str3 = strM43844;
                                    i2 = 1;
                                    synchronized (this) {
                                        if (!this.f19803 && !c3192.m5505() && !Thread.currentThread().isInterrupted()) {
                                        }
                                        throw m17459(str3);
                                    }
                                    this.f19807.getClass();
                                    throw C19247.m43846(str3, e);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    str3 = strM43844;
                                    this.f19807.getClass();
                                    throw C19247.m43845(e, str3);
                                } catch (SecurityException e3) {
                                    e = e3;
                                    str3 = strM43844;
                                    this.f19807.getClass();
                                    throw C19247.m43845(e, str3);
                                } catch (C5276 e4) {
                                    e = e4;
                                    str3 = strM43844;
                                    if (e.f12413.equals("FILE_OPERATION_INTERRUPTED") && Thread.currentThread().isInterrupted()) {
                                        throw m17459(str3);
                                    }
                                    throw e;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (IllegalArgumentException e6) {
                                e = e6;
                                str3 = strM43844;
                                this.f19807.getClass();
                                throw C19247.m43845(e, str3);
                            } catch (SecurityException e7) {
                                e = e7;
                                str3 = strM43844;
                                this.f19807.getClass();
                                throw C19247.m43845(e, str3);
                            } catch (C5276 e8) {
                                e = e8;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            i = 1;
                            c3192.m5504();
                            synchronized (this) {
                                this.f19809.remove(c3192);
                            }
                            m17467(str2);
                            if (i != 0) {
                                this.f19802.release();
                            }
                            throw th;
                        }
                    } catch (IOException e9) {
                        e = e9;
                    } catch (IllegalArgumentException e10) {
                        e = e10;
                    } catch (SecurityException e11) {
                        e = e11;
                    } catch (C5276 e12) {
                        e = e12;
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("Text search canceled while waiting.");
                }
            } catch (Throwable th9) {
                th = th9;
                i = i2;
            }
        } catch (IOException e13) {
            e = e13;
        } catch (IllegalArgumentException e14) {
            e = e14;
        } catch (SecurityException e15) {
            e = e15;
        } catch (C5276 e16) {
            e = e16;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13259 m17460(C20961 c20961) throws C5276 {
        int i = c20961.f65853 ? 0 : 16;
        if (!c20961.f65852) {
            i |= 66;
        }
        try {
            return C13259.m30303(i, c20961.f65859);
        } catch (PatternSyntaxException e) {
            throw C5276.m11406("Invalid regular expression: " + e.getDescription(), "pattern", JSON.value(c20961.f65859), JSON.array(), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m17465(String str) {
        return C5276.m11407("FILE_CHANGED_DURING_READ", "The file changed. Restart text search with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17462() {
        this.f19805.getClass();
        long jNanoTime = System.nanoTime();
        Iterator it = this.f19810.values().iterator();
        while (it.hasNext()) {
            C20290 c20290 = (C20290) it.next();
            if (jNanoTime - c20290.f62692 >= f19799) {
                it.remove();
                try {
                    c20290.f62691.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m17466() {
        if (this.f19806) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f19810;
        if (linkedHashMap.isEmpty() || this.f19803) {
            return;
        }
        if (this.f19800 == null) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC6208());
            this.f19800 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.setKeepAliveTime(1L, TimeUnit.SECONDS);
            this.f19800.allowCoreThreadTimeOut(true);
            this.f19800.setRemoveOnCancelPolicy(true);
        }
        Iterator it = linkedHashMap.values().iterator();
        long jMin = C14849.FOREVER_NS;
        while (it.hasNext()) {
            jMin = Math.min(jMin, ((C20290) it.next()).f62692);
        }
        this.f19806 = true;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = this.f19800;
        RunnableC24722 runnableC24722 = new RunnableC24722(1, this);
        this.f19805.getClass();
        scheduledThreadPoolExecutor2.schedule(runnableC24722, Math.max(1L, f19799 - (System.nanoTime() - jMin)), TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m17464(C7549 c7549) {
        synchronized (c7549) {
            c7549.f19806 = false;
            c7549.m17462();
            c7549.m17466();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        C20290[] c20290Arr;
        HashSet hashSet;
        synchronized (this) {
            this.f19803 = true;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f19800;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
            c20290Arr = (C20290[]) this.f19810.values().toArray(new C20290[0]);
            this.f19810.clear();
            hashSet = new HashSet(this.f19809);
            this.f19809.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C3192) it.next()).m5503();
        }
        for (C20290 c20290 : c20290Arr) {
            try {
                c20290.f62691.close();
            } catch (IOException unused) {
            }
        }
    }
}
