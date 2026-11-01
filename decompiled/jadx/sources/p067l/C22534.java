package p067l;

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
public final class C22534 {

    /* JADX INFO: renamed from: ۖ */
    public final boolean f71046;

    /* JADX INFO: renamed from: ۜ */
    public final int f71048;

    /* JADX INFO: renamed from: ܺ */
    public final C23480 f71053;

    /* JADX INFO: renamed from: ܽ */
    public CountDownLatch f71054;

    /* JADX INFO: renamed from: ᩳ */
    public final C4304 f71056;

    /* JADX INFO: renamed from: ᩴ */
    public final AbstractC5375 f71057;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC25215 f71058;

    /* JADX INFO: renamed from: ܿ */
    public final AtomicInteger f71055 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۢ */
    public final LinkedBlockingQueue f71050 = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ֫ */
    public final List f71045 = C18426.m41997();

    /* JADX INFO: renamed from: ܳ */
    public final ConcurrentMapC12768 f71052 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ۡ */
    public final AtomicBoolean f71049 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩻ */
    public final AtomicReference f71059 = new AtomicReference();

    /* JADX INFO: renamed from: ۘ */
    public final Object f71047 = new Object();

    /* JADX INFO: renamed from: ۧ */
    public ThreadLocal f71051 = new ThreadLocal();

    public C22534(AbstractC5375 abstractC5375, InterfaceC7717 interfaceC7717) {
        boolean z;
        int i;
        boolean zMo11733 = false;
        this.f71057 = abstractC5375;
        this.f71048 = abstractC5375.m11748();
        String strMo11730 = abstractC5375.mo11730();
        String str = null;
        if (strMo11730 != null) {
            String strTrim = strMo11730.trim();
            String lowerCase = (strTrim.endsWith(".") ? C17073.m38720(1, 0, strTrim) : strTrim).toLowerCase(Locale.ROOT);
            if (lowerCase.startsWith("[") && lowerCase.endsWith("]") && lowerCase.length() > 2) {
                lowerCase = C17073.m38720(1, 1, lowerCase);
            }
            if (!lowerCase.isEmpty()) {
                str = lowerCase;
            }
        }
        if (str != null && !str.contains("://") && str.indexOf(47) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0) {
            if (!str.endsWith(".local")) {
                if (str.contains(":")) {
                    if (str.indexOf(37) < 0 && C23847.m52921(str)) {
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
        this.f71053 = new C23480(z, z ? 500L : 1000L, z ? 2L : 5L, strMo11730);
        this.f71056 = new C19180(this, C4304.m8746(interfaceC7717));
        try {
            zMo11733 = abstractC5375.mo11733();
        } catch (IOException unused2) {
        }
        this.f71046 = zMo11733;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50497(InterfaceC25215 interfaceC25215) {
        this.f71058 = interfaceC25215;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50496(String str, String str2, AbstractC17043 abstractC17043, long j, long j2, String str3, C19056 c19056, boolean z, boolean z2) {
        this.f71050.add(new C16497(str, str2, abstractC17043, j, j2, str3, c19056, z, z2));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m50500() {
        C4304 c4304;
        if (this.f71050.isEmpty()) {
            return;
        }
        int i = this.f71048;
        this.f71054 = new CountDownLatch(i);
        for (final int i2 = 0; i2 < i; i2++) {
            C4081.f8987.submit(new Runnable(i2) { // from class: l.ᩳ᩻᩻
                @Override // java.lang.Runnable
                public final void run() {
                    C22534.m50492(this.f60331);
                }
            });
        }
        while (true) {
            boolean zAwait = this.f71054.await(500L, TimeUnit.MILLISECONDS);
            c4304 = this.f71056;
            if (!zAwait) {
                if (c4304.mo3924()) {
                    m50499();
                    break;
                }
            } else {
                break;
            }
        }
        c4304.mo8748();
        Exception exc = (Exception) this.f71059.get();
        if (exc != null) {
            throw exc;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50499() {
        this.f71049.set(true);
        for (C5099 c5099 : this.f71052.values()) {
            synchronized (c5099) {
                if (!c5099.f11956) {
                    c5099.f11956 = true;
                    synchronized (c5099.f11953) {
                        C2700.m4192(c5099.f11953);
                    }
                    c5099.f11955.mo25503();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50498() {
        return this.f71049.get();
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
    
        r3 = (p067l.C5099) r7.f71052.get(r2.f30867);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r3 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r0 = r7.f71047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r7.f71045.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
    
        r3.f11943.incrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
    
        r2.m25662(r7.f71057, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0051, code lost:
    
        r0 = r7.f71047;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
    
        monitor-enter(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        r7.f71045.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        monitor-exit(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005a, code lost:
    
        r3.m10866(r2, r1.mo3924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0063, code lost:
    
        if (r3.f11956 == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        r4 = r3.f11960;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007f, code lost:
    
        r4 = r7.f71059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        monitor-enter(r7.f71047);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0091, code lost:
    
        r7.f71045.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0097, code lost:
    
        r3.m10866(r2, r1.mo3924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if (r3.f11956 != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        r7.f71052.remove(r2.f30867);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00af, code lost:
    
        monitor-enter(r7.f71047);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b0, code lost:
    
        r7.f71045.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b6, code lost:
    
        r3.m10866(r2, r1.mo3924());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r3.f11956 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
    
        r7.f71052.remove(r2.f30867);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c8, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m50492(C22534 c22534) {
        C4304 c4304 = c22534.f71056;
        while (!c4304.mo3924()) {
            try {
                synchronized (c22534.f71047) {
                    C11134 c11134M50495 = c22534.m50495();
                    if (c11134M50495 != null || !c22534.f71050.isEmpty() || !c22534.f71045.isEmpty()) {
                    }
                    c22534.f71054.countDown();
                    throw th;
                }
            } catch (Throwable th) {
                c22534.f71054.countDown();
                throw th;
            }
        }
        c22534.f71054.countDown();
    }

    /* JADX INFO: renamed from: ᩳ */
    private C11134 m50495() {
        C9122 c9122;
        int size;
        C16497 c16497 = (C16497) this.f71050.poll();
        if (c16497 != null) {
            try {
                int iIncrementAndGet = this.f71055.incrementAndGet();
                String strSubstring = c16497.f48463;
                AbstractC17043 abstractC17043 = c16497.f48462;
                int iLastIndexOf = strSubstring.lastIndexOf(47);
                if (iLastIndexOf >= 0) {
                    strSubstring = strSubstring.substring(iLastIndexOf + 1);
                }
                String str = strSubstring;
                abstractC17043.mo37342();
                boolean zMo25094 = abstractC17043.mo25094();
                AbstractC17043 abstractC17043M38650 = zMo25094 ? abstractC17043.m38682(str + ".downloading").m38650(true) : abstractC17043;
                C24618 c24618M38671 = abstractC17043M38650.m38671("rw");
                c24618M38671.setLength(c16497.f48455);
                C5099 c5099 = new C5099(iIncrementAndGet, c16497.f48458, str, c16497.f48463, c16497.f48462, abstractC17043M38650, zMo25094, c24618M38671, c16497.f48455, c16497.f48457, c16497.f48456, c16497.f48460, c16497.f48461, c16497.f48459, this.f71051, this.f71058);
                this.f71052.put(c16497.f48463, c5099);
                int iIncrementAndGet2 = c5099.f11941.incrementAndGet();
                String str2 = c16497.f48463;
                long j = c16497.f48455;
                C11134 c11134 = new C11134(iIncrementAndGet, str, iIncrementAndGet2, str2, j, 0L, j, c24618M38671);
                this.f71045.add(c11134);
                return c11134;
            } catch (IOException e) {
                AtomicReference atomicReference = this.f71059;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
                return null;
            }
        }
        if (!this.f71046) {
            return null;
        }
        synchronized (this.f71045) {
            ArrayList<C9122> arrayList = new ArrayList();
            double d = 0.0d;
            long j2 = 0;
            for (C11134 c11135 : this.f71045) {
                C5099 c50910 = (C5099) this.f71052.get(c11135.f30867);
                if (c50910 != null) {
                    if (c50910.f11960.get() != null) {
                    }
                }
                long j3 = c11135.f30861 - c11135.f30858.get();
                long jM14740 = c11135.f30859.m14740();
                double d2 = j3;
                double d3 = d2 / 1048576.0d;
                if (jM14740 > 0) {
                    d3 = d2 / jM14740;
                } else if (j3 <= 52428800) {
                    d3 = -1.0d;
                }
                if (d3 >= 0.0d) {
                    arrayList.add(new C9122(c11135, c50910, j3, d3));
                    d += d3;
                    j2 += j3;
                }
            }
            double d4 = 0.0d;
            if (d <= 0.0d || j2 <= 0) {
                c9122 = null;
            } else {
                c9122 = null;
                for (C9122 c9123 : arrayList) {
                    double d5 = d;
                    C9122 c9124 = c9122;
                    double d6 = ((c9123.f24692 / j2) * 0.3d) + ((c9123.f24693 / d) * 0.7d);
                    if (d6 > d4) {
                        d4 = d6;
                        c9122 = c9123;
                    } else {
                        c9122 = c9124;
                    }
                    d = d5;
                }
            }
        }
        if (c9122 == null || (size = this.f71048 - this.f71045.size()) <= 0) {
            return null;
        }
        C11134 c11134M25661 = c9122.f24694.m25661(c9122.f24695, size, this.f71053);
        if (c11134M25661 != null) {
            this.f71045.add(c11134M25661);
        }
        return c11134M25661;
    }
}
