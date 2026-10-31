package l;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseLongArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡ᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1K7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0577 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f2271;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11005 f2272;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11005 f2274;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f2276;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18923 f2277;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11005 f2278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f2280;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11005 f2281;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12366 f2282;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f2283;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1769 f2284;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2273 = new AtomicInteger();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2279 = new AtomicInteger();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2275 = new AtomicInteger();

    public C0577(C12366 c12366) throws IOException {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        this.f2283 = concurrentMapC10942;
        C1769 c1769NewKeySet = ConcurrentMapC10942.newKeySet();
        this.f2284 = c1769NewKeySet;
        this.f2280 = new ConcurrentMapC10942();
        this.f2271 = new C0225();
        this.f2282 = c12366;
        C11005 c11005 = new C11005(c12366.m36263(), "smali");
        this.f2281 = c11005;
        if (c11005.m27340().mo23119()) {
            c11005.m27333();
        }
        c11005.m27340().m36508();
        C11005 c11006 = new C11005(c11005, "x");
        this.f2272 = c11006;
        C11005 c11007 = new C11005(c11005, "y");
        this.f2274 = c11007;
        this.f2278 = new C11005(c11005, "f");
        if (!C12248.m29747(c11005.m27340())) {
            m2367();
        } else {
            try {
                SparseLongArray sparseLongArray = new SparseLongArray();
                m2356(c11006, true, sparseLongArray);
                m2356(c11007, false, sparseLongArray);
                m2363();
                if (concurrentMapC10942.isEmpty() && c1769NewKeySet.isEmpty()) {
                    m2367();
                }
            } catch (IOException unused) {
                m2367();
            }
        }
        this.f2277 = new C18923(this);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m2363() throws IOException {
        C11005 c11005 = this.f2278;
        if (c11005.m27336()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c11005.m27334()));
            while (dataInputStream.available() > 0) {
                try {
                    this.f2284.add(C12248.m29745(dataInputStream));
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2356(C11005 c11005, boolean z, SparseLongArray sparseLongArray) throws IOException {
        String strM29745;
        long jMo23127;
        if (c11005.m27336()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c11005.m27334()));
            while (dataInputStream.available() > 0) {
                try {
                    if (!z) {
                        strM29745 = C12248.m29745(dataInputStream);
                    } else {
                        strM29745 = dataInputStream.readUTF();
                    }
                    int unsignedShort = dataInputStream.readUnsignedShort();
                    int i = dataInputStream.readInt();
                    int i2 = dataInputStream.readInt();
                    int iIndexOfKey = sparseLongArray.indexOfKey(unsignedShort);
                    if (iIndexOfKey >= 0) {
                        jMo23127 = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        AbstractC15440 abstractC15440M27330 = this.f2281.m27330(String.valueOf(unsignedShort));
                        if (!abstractC15440M27330.mo23119()) {
                            throw new IOException("Missing smali cache data file");
                        }
                        jMo23127 = abstractC15440M27330.mo23127();
                        sparseLongArray.put(unsignedShort, jMo23127);
                    }
                    if (i >= 0 && i2 > 0 && ((long) i) + ((long) i2) <= jMo23127) {
                        this.f2283.put(strM29745, new C19629(unsignedShort, i, i2));
                    } else {
                        throw new IOException("Invalid smali cache offset");
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m2367() throws IOException {
        this.f2283.clear();
        this.f2284.clear();
        this.f2280.clear();
        C11005 c11005 = this.f2281;
        C11005[] c11005ArrM27335 = c11005.m27335();
        if (c11005ArrM27335 != null) {
            for (C11005 c11006 : c11005ArrM27335) {
                if (c11006.m27336() && !c11006.m27333()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C12248.m29750(c11005.m27340());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2360(String str) {
        return (this.f2283.containsKey(str) || this.f2284.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2369(ActivityC17169 activityC17169) {
        AbstractC7379 lifecycle = activityC17169.getLifecycle();
        final AtomicReference atomicReference = activityC17169.f52614;
        if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        lifecycle.mo19833(new C4106(this));
        this.f2277.m43663();
        this.f2276 = false;
        final int iIncrementAndGet = this.f2273.incrementAndGet();
        final C20765 c20765 = (C20765) lifecycle;
        Thread thread = new Thread(new Runnable() { // from class: l.ۢᩳۢ
            @Override // java.lang.Runnable
            public final void run() {
                C0577.m2353(this.f29518, iIncrementAndGet, c20765, atomicReference);
            }
        });
        thread.setName("SmaliCache-1");
        thread.start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2353(final C0577 c0577, int i, C20765 c20765, AtomicReference atomicReference) {
        C18923 c18923 = c0577.f2277;
        System.out.println("SmaliCache prepare");
        AtomicInteger atomicInteger = c0577.f2279;
        atomicInteger.incrementAndGet();
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (C18011 c18011 : c0577.f2282.m30063()) {
                if (c18011.f56168 != null) {
                    i2++;
                    if (c18011.f56171 == null && c0577.m2360(c18011.f56169)) {
                        arrayList.add(c18011);
                    }
                }
            }
            Collections.sort(arrayList, C18011.f56166);
            C19277 c19277 = new C19277(i2);
            c19277.m44459(new C9045());
            c19277.m44460(i2 - arrayList.size());
            final C16099 c16099 = new C16099(c0577, new AtomicInteger(), arrayList, i, c20765, atomicReference, c19277);
            int i3 = C17615.f53826 >= 4 ? 3 : 2;
            for (int i4 = 2; i4 <= i3; i4++) {
                final int i5 = i4 - 1;
                Thread thread = new Thread(new Runnable() { // from class: l.ۖᩳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0577.m2355(this.f8435, c16099, i5);
                    }
                });
                thread.setName("SmaliCache-" + i4);
                thread.start();
            }
            c16099.accept(0);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18923.m43663();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2354(C0577 c0577, AtomicInteger atomicInteger, ArrayList arrayList, int i, C20765 c20765, AtomicReference atomicReference, C19277 c19277, int i2) {
        System.out.println(Thread.currentThread().getName() + " start");
        C12953 c12953 = new C12953();
        while (true) {
            int andIncrement = atomicInteger.getAndIncrement();
            if (andIncrement >= arrayList.size()) {
                System.out.println(Thread.currentThread().getName() + " finish");
                return;
            }
            C18011 c18011 = (C18011) arrayList.get(andIncrement);
            if (c0577.f2273.get() != i || c20765.mo19832() == EnumC13728.DESTROYED) {
                System.out.println(Thread.currentThread().getName() + " canceled");
                return;
            }
            if (c0577.f2276 || !c20765.mo19832().m33028(EnumC13728.RESUMED) || (i2 > 0 && atomicReference.get() != C23840.class)) {
                System.out.println(Thread.currentThread().getName() + " paused");
                c0577.f2275.incrementAndGet();
                while (true) {
                    if (!c0577.f2276 && c20765.mo19832().m33028(EnumC13728.RESUMED) && (i2 <= 0 || atomicReference.get() == C23840.class)) {
                        break;
                    }
                    if (c0577.f2273.get() != i || c20765.mo19832() == EnumC13728.DESTROYED) {
                        System.out.println(Thread.currentThread().getName() + " canceled");
                        return;
                    }
                    SystemClock.sleep(500L);
                }
                c0577.f2275.decrementAndGet();
                System.out.println(Thread.currentThread().getName() + " resumed");
            }
            if (i2 == 0 && atomicReference.get() != C23840.class) {
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < 262144) {
                    SystemClock.sleep(250L);
                } else if (jFreeMemory < 524288) {
                    SystemClock.sleep(100L);
                } else if (jFreeMemory < 1048576) {
                    SystemClock.sleep(50L);
                } else if (jFreeMemory < 2097152) {
                    SystemClock.sleep(10L);
                }
            }
            if (c0577.m2360(c18011.f56169)) {
                try {
                    c0577.m2358(c18011, c12953);
                } catch (Throwable unused) {
                }
            }
            c19277.m44460(1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2355(C0577 c0577, C16099 c16099, int i) {
        C18923 c18923 = c0577.f2277;
        AtomicInteger atomicInteger = c0577.f2279;
        atomicInteger.incrementAndGet();
        try {
            c16099.accept(i);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18923.m43663();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2358(C18011 c18011, C12953 c12953) throws IOException {
        C13533 c13533M31519 = c12953.m31519();
        try {
            m2357(c18011, c13533M31519);
            c13533M31519.close();
            String str = c18011.f56169;
            if (m2360(str)) {
                if (!c12953.m31520()) {
                    c12953.m31514();
                    if (m2360(str)) {
                        this.f2277.m43662(str, c12953);
                        return;
                    }
                    return;
                }
                C18923 c18923 = this.f2277;
                synchronized (c18923) {
                    try {
                        if (c18923.f59611.f2283.containsKey(str) || c18923.f59611.f2284.contains(str)) {
                            return;
                        }
                        try {
                            if (c18923.f59616 == null) {
                                c18923.f59616 = new C2951(c18923.f59611.f2278.m27340().mo23555(true));
                            }
                            C2951 c2951 = c18923.f59616;
                            C12248.m29746(c2951, C5773.m16233(str));
                            C5773.m16236(c2951, str);
                            c18923.f59616.flush();
                            c18923.f59611.f2284.add(str);
                        } catch (IOException e) {
                            c18923.m43663();
                            throw e;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                c13533M31519.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2370(C18011 c18011, C22706 c22706) {
        try {
            C19629 c19629 = (C19629) this.f2283.get(c18011.f56169);
            if (c19629 != null) {
                m2359(c18011, c19629, c22706);
                return;
            }
        } catch (IOException unused) {
        }
        try {
            m2357(c18011, (Writer) c22706);
        } catch (Throwable th) {
            c22706.m50718();
            c22706.append((CharSequence) Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2359(C18011 c18011, C19629 c19629, C22706 c22706) throws IOException {
        int i;
        byte[] bArrM36506;
        String str = c18011.f56169;
        int i2 = c19629.f63372;
        Reference reference = (Reference) this.f2280.get(Integer.valueOf(i2));
        byte[] bArr = reference != null ? (byte[]) reference.get() : null;
        if (bArr == null) {
            synchronized (this.f2280) {
                Reference reference2 = (Reference) this.f2280.get(Integer.valueOf(i2));
                bArrM36506 = reference2 != null ? (byte[]) reference2.get() : null;
                if (bArrM36506 == null) {
                    try {
                        bArrM36506 = this.f2281.m27330(String.valueOf(i2)).m36506();
                        this.f2280.put(Integer.valueOf(i2), new SoftReference(bArrM36506));
                    } catch (IOException unused) {
                        bArr = new byte[0];
                    }
                }
            }
            bArr = bArrM36506;
        }
        int i3 = c19629.f63374;
        if (i3 < 0 || (i = c19629.f63373) <= 0 || ((long) i3) + ((long) i) > bArr.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        C12953 c12953 = (C12953) this.f2271.m1479();
        if (c12953 == null) {
            c12953 = new C12953();
        }
        try {
            c12953.m31515(c19629.f63374, c19629.f63373, bArr);
            C5773.m16239(c12953.m31517(), c12953.m31521(), c22706);
        } finally {
            this.f2271.m1477(c12953);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2357(C18011 c18011, Writer writer) throws IOException {
        String name = c18011.f56168.getName();
        C12366 c12366 = this.f2282;
        C7980 c7980 = new C7980(c12366.m30065(name), c18011.f56167, c18011.f56172);
        if (c12366.m30048()) {
            writer.write("# ");
            writer.write(c18011.f56170);
            writer.write(".dex\n\n");
        }
        C21652.m48913(writer, c7980, c12366.m30064(c18011.f56170));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2362(C0577 c0577, int i) {
        c0577.f2280.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m2351(C0577 c0577, int i) {
        return c0577.f2281.m27330(String.valueOf(i));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2372() {
        this.f2273.incrementAndGet();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2368() {
        this.f2276 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2371() {
        this.f2277.m43661();
        this.f2276 = false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2374() {
        while (true) {
            AtomicInteger atomicInteger = this.f2279;
            if (atomicInteger.get() <= 0 || this.f2275.get() >= atomicInteger.get()) {
                return;
            } else {
                SystemClock.sleep(100L);
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2373() {
        if (this.f2279.get() > 0) {
            SystemClock.sleep(100L);
        }
    }
}
