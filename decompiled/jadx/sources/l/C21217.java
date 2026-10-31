package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩷᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 07HC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21217 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f68363;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f68365;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C22213 f68370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CountDownLatch f68371;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2036 f68373;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f68374;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC24038 f68375;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f68372 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final LinkedBlockingQueue f68367 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f68362 = C16895.m39756();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f68369 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f68366 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicReference f68376 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Object f68364 = new Object();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ThreadLocal f68368 = new ThreadLocal();

    public C21217(AbstractC3163 abstractC3163, InterfaceC5627 interfaceC5627) {
        boolean z;
        int i;
        boolean zMo9689 = false;
        this.f68374 = abstractC3163;
        this.f68365 = abstractC3163.m9704();
        String strMo9686 = abstractC3163.mo9686();
        String str = null;
        if (strMo9686 != null) {
            String strTrim = strMo9686.trim();
            String lowerCase = (strTrim.endsWith(".") ? C15472.m36561(1, 0, strTrim) : strTrim).toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]") && lowerCase.length() > 2) {
                lowerCase = C15472.m36561(1, 1, lowerCase);
            }
            if (!lowerCase.isEmpty()) {
                str = lowerCase;
            }
        }
        if (str != null && !str.contains("://") && str.indexOf(47) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0) {
            if (!str.endsWith(".local")) {
                if (str.contains(":")) {
                    if (str.indexOf(37) < 0 && C22599.m50579(str)) {
                        if (!"::1".equals(str)) {
                            int iIndexOf = str.indexOf(58);
                            if (iIndexOf > 0 && iIndexOf <= 4) {
                                String strSubstring = str.substring(0, iIndexOf);
                                if (!strSubstring.isEmpty() && strSubstring.length() <= 4) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < strSubstring.length()) {
                                            char cCharAt = strSubstring.charAt(i2);
                                            if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                                                i2++;
                                            }
                                        } else {
                                            try {
                                                int i3 = Integer.parseInt(strSubstring, 16);
                                                if ((65024 & i3) == 64512 || (i3 & 65472) == 65152) {
                                                }
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                } else {
                    String[] strArrSplit = str.split("\\.", -1);
                    if (strArrSplit.length == 4) {
                        int[] iArr = new int[4];
                        int i4 = 0;
                        while (true) {
                            if (i4 >= strArrSplit.length) {
                                int i5 = iArr[0];
                                if (i5 == 10 || i5 == 127 || ((i5 == 192 && iArr[1] == 168) || ((i5 == 172 && (i = iArr[1]) >= 16 && i <= 31) || (i5 == 169 && iArr[1] == 254)))) {
                                }
                            } else if (!strArrSplit[i4].isEmpty()) {
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < strArrSplit[i4].length()) {
                                        char cCharAt2 = strArrSplit[i4].charAt(i6);
                                        if (cCharAt2 >= '0' && cCharAt2 <= '9' && (i7 = (i7 * 10) + (cCharAt2 - '0')) <= 255) {
                                            i6++;
                                        }
                                    } else {
                                        iArr[i4] = i7;
                                        i4++;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.f68370 = new C22213(z, z ? 500L : 1000L, z ? 2L : 5L, strMo9686);
        this.f68373 = new C17688(this, C2036.m6620(interfaceC5627));
        try {
            zMo9689 = abstractC3163.mo9689();
        } catch (IOException unused2) {
        }
        this.f68363 = zMo9689;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48166(InterfaceC24038 interfaceC24038) {
        this.f68375 = interfaceC24038;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48165(String str, String str2, AbstractC15440 abstractC15440, long j, long j2, String str3, C17558 c17558, boolean z, boolean z2) {
        this.f68367.add(new C14865(str, str2, abstractC15440, j, j2, str3, c17558, z, z2));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48169() {
        C2036 c2036;
        if (this.f68367.isEmpty()) {
            return;
        }
        int i = this.f68365;
        this.f68371 = new CountDownLatch(i);
        for (final int i2 = 0; i2 < i; i2++) {
            C1802.f6208.submit(new Runnable(i2) { // from class: l.ᩳ᩻᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C21217.m48161(this.f57111);
                }
            });
        }
        while (true) {
            boolean zAwait = this.f68371.await(500L, TimeUnit.MILLISECONDS);
            c2036 = this.f68373;
            if (!zAwait) {
                if (c2036.mo1526()) {
                    m48168();
                    break;
                }
            } else {
                break;
            }
        }
        c2036.mo6622();
        Exception exc = (Exception) this.f68376.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48168() {
        this.f68366.set(true);
        for (C2872 c2872 : this.f68369.values()) {
            synchronized (c2872) {
                if (!c2872.f9158) {
                    c2872.f9158 = true;
                    synchronized (c2872.f9155) {
                        C0349.m1793(c2872.f9155);
                    }
                    c2872.f9157.mo23552();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48167() {
        return this.f68366.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r2 != null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        android.os.SystemClock.sleep(100);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        r3 = (l.C2872) r7.f68369.get(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r0 = r7.f68364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r3.f9145.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        r2.m23663(r7.f68374, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r0 = r7.f68364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r3.f9158 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        r4 = r3.f9162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r4 = r7.f68376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        monitor-enter(r7.f68364);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0097, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if (r3.f9158 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        r7.f68369.remove(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00af, code lost:
    
        monitor-enter(r7.f68364);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
    
        r7.f68362.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b6, code lost:
    
        r3.m8799(r2, r1.mo1526());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r3.f9158 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
    
        r7.f68369.remove(r2.f27921);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m48161(C21217 c21217) {
        C2036 c2036 = c21217.f68373;
        while (!c2036.mo1526()) {
            try {
                synchronized (c21217.f68364) {
                    C9222 c9222M48164 = c21217.m48164();
                    if (c9222M48164 != null || !c21217.f68367.isEmpty() || !c21217.f68362.isEmpty()) {
                    }
                    c21217.f68371.countDown();
                    throw th;
                }
            } catch (Throwable th) {
                c21217.f68371.countDown();
                throw th;
            }
        }
        c21217.f68371.countDown();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C9222 m48164() {
        C7105 c7105;
        int size;
        C14865 c14865 = (C14865) this.f68367.poll();
        if (c14865 != null) {
            try {
                int iIncrementAndGet = this.f68372.incrementAndGet();
                String strSubstring = c14865.f45348;
                AbstractC15440 abstractC15440 = c14865.f45347;
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                String str = strSubstring;
                abstractC15440.mo35195();
                boolean zMo23120 = abstractC15440.mo23120();
                AbstractC15440 abstractC15440M36492 = zMo23120 ? abstractC15440.m36524(str + ".downloading").m36492(true) : abstractC15440;
                C23411 c23411M36513 = abstractC15440M36492.m36513("rw");
                c23411M36513.setLength(c14865.f45340);
                C2872 c2872 = new C2872(iIncrementAndGet, c14865.f45343, str, c14865.f45348, c14865.f45347, abstractC15440M36492, zMo23120, c23411M36513, c14865.f45340, c14865.f45342, c14865.f45341, c14865.f45345, c14865.f45346, c14865.f45344, this.f68368, this.f68375);
                this.f68369.put(c14865.f45348, c2872);
                int iIncrementAndGet2 = c2872.f9143.incrementAndGet();
                String str2 = c14865.f45348;
                long j = c14865.f45340;
                C9222 c9222 = new C9222(iIncrementAndGet, str, iIncrementAndGet2, str2, j, 0L, j, c23411M36513);
                this.f68362.add(c9222);
                return c9222;
            } catch (IOException e) {
                AtomicReference atomicReference = this.f68376;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                return null;
            }
        }
        if (!this.f68363) {
            return null;
        }
        synchronized (this.f68362) {
            ArrayList<C7105> arrayList = new ArrayList();
            double d = 0.0d;
            long j2 = 0;
            for (C9222 c9223 : this.f68362) {
                C2872 c2873 = (C2872) this.f68369.get(c9223.f27921);
                if (c2873 != null) {
                    if (c2873.f9162.get() != null) {
                    }
                }
                long j3 = c9223.f27915 - c9223.f27912.get();
                long jM12876 = c9223.f27913.m12876();
                double d2 = j3;
                double d3 = d2 / 1048576.0d;
                if (jM12876 > 0) {
                    d3 = d2 / jM12876;
                } else if (j3 <= 52428800) {
                    d3 = -1.0d;
                }
                if (d3 >= 0.0d) {
                    arrayList.add(new C7105(c9223, c2873, j3, d3));
                    d += d3;
                    j2 += j3;
                }
            }
            double d4 = 0.0d;
            if (d <= 0.0d || j2 <= 0) {
                c7105 = null;
            } else {
                c7105 = null;
                for (C7105 c7106 : arrayList) {
                    double d5 = d;
                    C7105 c7107 = c7105;
                    double d6 = ((c7106.f21811 / j2) * 0.3d) + ((c7106.f21812 / d) * 0.7d);
                    if (d6 > d4) {
                        d4 = d6;
                        c7105 = c7106;
                    } else {
                        c7105 = c7107;
                    }
                    d = d5;
                }
            }
        }
        if (c7105 == null || (size = this.f68365 - this.f68362.size()) <= 0) {
            return null;
        }
        C9222 c9222M23662 = c7105.f21813.m23662(c7105.f21814, size, this.f68370);
        if (c9222M23662 != null) {
            this.f68362.add(c9222M23662);
        }
        return c9222M23662;
    }
}
