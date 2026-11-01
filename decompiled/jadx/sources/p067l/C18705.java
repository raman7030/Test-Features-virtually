package p067l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܿۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18705 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public static final int f55870;

    /* JADX INFO: renamed from: ۟ */
    public static final int f55871;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final long f55872;

    /* JADX INFO: renamed from: ܰ */
    public static final int f55873;

    /* JADX INFO: renamed from: ܳ֫ */
    public static final C15824 f55874;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final long f55875;

    /* JADX INFO: renamed from: ܿ֫ */
    public static final C18705 f55876;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final Unsafe f55877;

    /* JADX INFO: renamed from: ᩺ */
    public static final int f55878;

    /* JADX INFO: renamed from: ᩻֫ */
    public static final RuntimePermission f55879;

    /* JADX INFO: renamed from: ۗ */
    public final long f55880;

    /* JADX INFO: renamed from: ۙ */
    public int f55881;

    /* JADX INFO: renamed from: ۛ */
    public C19376[] f55882;

    /* JADX INFO: renamed from: ۤ */
    public final Thread.UncaughtExceptionHandler f55883;

    /* JADX INFO: renamed from: ۨ */
    public final String f55884;

    /* JADX INFO: renamed from: ۫ */
    public volatile long f55885;

    /* JADX INFO: renamed from: ۬ */
    public volatile int f55886;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC9790 f55887;

    /* JADX INFO: renamed from: ᩸ */
    public final int f55888;

    /* JADX INFO: renamed from: ᩹ */
    public volatile long f55889;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C12473.m28708(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractFutureC10659 c11330;
        runnable.getClass();
        if (runnable instanceof AbstractFutureC10659) {
            c11330 = (AbstractFutureC10659) runnable;
        } else {
            c11330 = new C11330(runnable);
        }
        m42678(c11330);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        AbstractFutureC10659 runnableFutureC8647 = runnable instanceof AbstractFutureC10659 ? (AbstractFutureC10659) runnable : new RunnableFutureC8647(runnable);
        m42678(runnableFutureC8647);
        return runnableFutureC8647;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f55879);
        }
        m42676(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f55879);
        }
        m42676(true, true);
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AccessControlContext m42672(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42673(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f55877;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m42671(long j, Object obj) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f55877;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!C8449.m19671(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m42681() {
        InterfaceC9790 interfaceC9790 = this.f55887;
        C5965 th = null;
        if (interfaceC9790 != null) {
            try {
                C5965 c5965Mo22812 = interfaceC9790.mo22812(this);
                if (c5965Mo22812 != null) {
                    try {
                        c5965Mo22812.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C5965 c5965 = th;
                th = c5965Mo22812;
                th = c5965;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            th = null;
        }
        m42684(th, th);
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42677(long j) {
        long j2 = j;
        do {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j2) & 281470681743360L);
            if (this.f55889 == j2 && f55877.compareAndSwapLong(this, f55872, j2, j3)) {
                m42681();
                return;
            } else {
                j2 = this.f55889;
                if ((140737488355328L & j2) == 0) {
                    return;
                }
            }
        } while (((int) j2) == 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19376 m42683(C5965 c5965) {
        int i;
        int length;
        c5965.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f55883;
        if (uncaughtExceptionHandler != null) {
            c5965.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C19376 c19376 = new C19376(this, c5965);
        int i2 = this.f55886 & 65536;
        String str = this.f55884;
        if (str == null) {
            return c19376;
        }
        synchronized (str) {
            C19376[] c19376Arr = this.f55882;
            int i3 = this.f55881 - 1640531527;
            this.f55881 = i3;
            i = 0;
            if (c19376Arr != null && (length = c19376Arr.length) > 1) {
                int i4 = length - 1;
                int i5 = i3 & i4;
                int i6 = ((i3 << 1) | 1) & i4;
                int i7 = length >>> 1;
                while (true) {
                    C19376 c19377 = c19376Arr[i6];
                    if (c19377 == null || c19377.f57841 == 1073741824) {
                        break;
                        break;
                    }
                    i7--;
                    if (i7 == 0) {
                        i6 = length | 1;
                        break;
                    }
                    i6 = (i6 + 2) & i4;
                }
                int i8 = i2 | i6 | (i3 & 1073610752);
                c19376.f57842 = i8;
                c19376.f57841 = i8;
                if (i6 < length) {
                    c19376Arr[i6] = c19376;
                } else {
                    int i9 = length << 1;
                    C19376[] c19376Arr2 = new C19376[i9];
                    c19376Arr2[i6] = c19376;
                    int i10 = i9 - 1;
                    while (i < length) {
                        C19376 c19378 = c19376Arr[i];
                        if (c19378 != null) {
                            c19376Arr2[c19378.f57842 & i10 & 126] = c19378;
                        }
                        int i11 = i + 1;
                        if (i11 >= length) {
                            break;
                        }
                        c19376Arr2[i11] = c19376Arr[i11];
                        i += 2;
                    }
                    this.f55882 = c19376Arr2;
                }
                i = i5;
            }
        }
        c5965.setName(str.concat(Integer.toString(i)));
        return c19376;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42684(C5965 c5965, Throwable th) {
        C19376 c19376;
        int i;
        Unsafe unsafe;
        long j;
        long j2;
        C19376 c19377 = null;
        if (c5965 == null) {
            c19376 = c19377;
            i = 0;
        } else {
            c19376 = c5965.f14762;
            if (c19376 != null) {
                String str = this.f55884;
                long j3 = ((long) c19376.f57844) & 4294967295L;
                int i2 = c19376.f57842 & 65535;
                if (str != null) {
                    synchronized (str) {
                        C19376[] c19376Arr = this.f55882;
                        if (c19376Arr != null && c19376Arr.length > i2 && c19376Arr[i2] == c19376) {
                            c19376Arr[i2] = null;
                        }
                        this.f55885 += j3;
                    }
                }
                i = c19376.f57841;
            } else {
                c19377 = c19376;
                c19376 = c19377;
                i = 0;
            }
        }
        if (i != 1073741824) {
            do {
                unsafe = f55877;
                j = f55872;
                j2 = this.f55889;
            } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & 281470681743360L) | (j2 & 4294967295L)));
        }
        if (c19376 != null) {
            while (true) {
                AbstractFutureC10659 abstractFutureC10659M44109 = c19376.m44109();
                if (abstractFutureC10659M44109 == null) {
                    break;
                } else if (abstractFutureC10659M44109.f29488 >= 0) {
                    try {
                        abstractFutureC10659M44109.cancel(false);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (!m42676(false, false) && c19376 != null && c19376.f57837 != null) {
            m42688();
        }
        if (th == null) {
            AbstractFutureC10659.m24515();
        } else {
            int i3 = AbstractFutureC10659.f29487;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42688() {
        int i;
        C19376 c19376;
        while (true) {
            long j = this.f55889;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    m42677(j);
                    return;
                }
                return;
            }
            C19376[] c19376Arr = this.f55882;
            if (c19376Arr == null || c19376Arr.length <= (i = 65535 & i2) || (c19376 = c19376Arr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = c19376.f57841;
            long j2 = (((long) c19376.f57845) & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            C5965 c5965 = c19376.f57843;
            if (i2 == i4 && f55877.compareAndSwapLong(this, f55872, j, j2)) {
                c19376.f57841 = i3;
                if (c19376.f57838 < 0) {
                    LockSupport.unpark(c5965);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private int m42680(C19376 c19376) {
        int length;
        Thread.State state;
        long j = this.f55889;
        C19376[] c19376Arr = this.f55882;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (c19376Arr == null || (length = c19376Arr.length) <= 0 || c19376 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C19376 c19377 = c19376Arr[i & (length - 1)];
                int i2 = c19376.f57841;
                long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (c19377 == null) {
                    return 0;
                }
                int i4 = c19377.f57841;
                C5965 c5965 = c19377.f57843;
                long j3 = (((long) c19377.f57845) & 4294967295L) | j2;
                if (i4 != i || !f55877.compareAndSwapLong(this, f55872, j, j3)) {
                    return 0;
                }
                c19377.f57841 = i3;
                if (c19377.f57838 < 0) {
                    LockSupport.unpark(c5965);
                }
                return i2 < 0 ? -1 : 1;
            }
            if (((int) (j >> 48)) - ((short) (this.f55888 & 65535)) > 0) {
                return f55877.compareAndSwapLong(this, f55872, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
            }
            int i5 = this.f55886 & 65535;
            int i6 = i5 + s;
            int i7 = 0;
            int i8 = i6;
            for (int i9 = 1; i9 < length; i9 += 2) {
                C19376 c19378 = c19376Arr[i9];
                if (c19378 != null) {
                    if (c19378.f57838 == 0) {
                        return 0;
                    }
                    i8--;
                    C5965 c5966 = c19378.f57843;
                    if (c5966 != null && ((state = c5966.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                        i7++;
                    }
                }
            }
            if (i8 != 0 || this.f55889 != j) {
                return 0;
            }
            if (i6 >= 32767 || s >= (this.f55888 >>> 16)) {
                if (i7 < i5) {
                    Thread.yield();
                    return 0;
                }
                throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
            }
        }
        return (f55877.compareAndSwapLong(this, f55872, j, ((-281470681743361L) & j) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j) & 281470681743360L)) && m42681()) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ab A[EDGE_INSN: B:95:0x00ab->B:46:0x00ab BREAK  A[LOOP:1: B:9:0x001d->B:44:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final void m42687(C19376 c19376) {
        int i;
        long j;
        C19376 c19377;
        AbstractFutureC10659[] abstractFutureC10659Arr;
        int length;
        c19376.m44106();
        int iM16880 = c19376.f57842 ^ C7306.m16880();
        if (iM16880 == 0) {
            iM16880 = 1;
        }
        int i2 = 0;
        C18705 c18705 = this;
        C19376 c19378 = c19376;
        while (true) {
            C19376[] c19376Arr = c18705.f55882;
            if (c19376Arr == null) {
                return;
            }
            int length2 = c19376Arr.length;
            int i3 = length2 - 1;
            boolean z = false;
            C19376 c19379 = c19378;
            int i4 = length2;
            while (true) {
                if (i4 <= 0) {
                    i = 65536;
                    break;
                }
                int i5 = iM16880 & i3;
                if (i5 < 0 || i5 >= length2 || (c19377 = c19376Arr[i5]) == null) {
                    i = 65536;
                    if (z) {
                        break;
                    } else {
                        iM16880++;
                    }
                } else {
                    int i6 = c19377.f57840;
                    if (i6 - c19377.f57839 >= 0 || (abstractFutureC10659Arr = c19377.f57837) == null || (length = abstractFutureC10659Arr.length) <= 0) {
                        i = 65536;
                        if (z) {
                            break;
                            break;
                        }
                        iM16880++;
                    } else {
                        int i7 = c19377.f57842;
                        long j2 = (((long) ((length - 1) & i6)) << f55873) + ((long) f55878);
                        Unsafe unsafe = f55877;
                        AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j2);
                        if (abstractFutureC10659 != null) {
                            int i8 = i6 + 1;
                            if (i6 == c19377.f57840 && C8449.m19671(unsafe, abstractFutureC10659Arr, j2, abstractFutureC10659)) {
                                c19377.f57840 = i8;
                                if (i8 - c19377.f57839 < 0 && i7 != i2) {
                                    c18705.m42688();
                                }
                                c19376.f57838 = i7;
                                abstractFutureC10659.m24524();
                                if ((c19376.f57842 & 65536) != 0) {
                                    c19376.m44107(1024);
                                } else {
                                    c19376.m44110(1024);
                                }
                                C5965 c5965 = c19376.f57843;
                                c19376.f57844++;
                                c19376.f57838 = 0;
                                if (c5965 != null) {
                                    c5965.mo9750();
                                }
                                i2 = i7;
                            }
                        }
                        c19379 = c19376;
                        z = true;
                    }
                }
                i4--;
                c19376Arr = c19376Arr;
                length2 = length2;
            }
            if (z) {
                int i9 = iM16880 ^ (iM16880 << 13);
                int i10 = i9 ^ (i9 >>> 17);
                iM16880 = i10 ^ (i10 << 5);
            } else {
                int i11 = c19379.f57841;
                if (i11 >= 0) {
                    int i12 = (i11 + i) | Integer.MIN_VALUE;
                    c19379.f57841 = i12;
                    do {
                        j = c18705.f55889;
                        c19379.f57845 = (int) j;
                    } while (!f55877.compareAndSwapLong(c18705, f55872, j, (((long) i12) & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i13 = c19379.f57845;
                    c19379.f57838 = -1073741824;
                    int i14 = 0;
                    while (c19379.f57841 < 0) {
                        int i15 = c18705.f55886;
                        if (i15 < 0) {
                            return;
                        }
                        long j3 = c18705.f55889;
                        int i16 = (65535 & i15) + ((int) (j3 >> 48));
                        if (i16 <= 0 && (i15 & 262144) != 0 && c18705.m42676(false, false)) {
                            return;
                        }
                        i14++;
                        if ((i14 & 1) == 0) {
                            Thread.interrupted();
                        } else if (i16 <= 0 && i13 != 0 && i11 == ((int) j3)) {
                            long jCurrentTimeMillis = System.currentTimeMillis() + c18705.f55880;
                            LockSupport.parkUntil(c18705, jCurrentTimeMillis);
                            if (c18705.f55889 == j3 && jCurrentTimeMillis - System.currentTimeMillis() <= 20) {
                                if (f55877.compareAndSwapLong(c18705, f55872, j3, (((long) i13) & 4294967295L) | ((j3 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & (-4294967296L)))) {
                                    c19379.f57841 = 1073741824;
                                    return;
                                }
                            }
                        } else {
                            LockSupport.park(this);
                        }
                        c18705 = this;
                    }
                    c19379.f57838 = 0;
                }
                i2 = 0;
            }
            c19378 = c19379;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m42682(C19376 c19376, AbstractFutureC10659 abstractFutureC10659, long j) {
        long millis;
        C19376 c19377;
        AbstractFutureC10659[] abstractFutureC10659Arr;
        int length;
        if (c19376 == null) {
            return 0;
        }
        c19376.m44111(abstractFutureC10659);
        int i = c19376.f57838;
        int i2 = c19376.f57842;
        int i3 = abstractFutureC10659.f29488;
        while (i3 >= 0) {
            boolean z = true;
            int iM16880 = C7306.m16880() | 1;
            C19376[] c19376Arr = this.f55882;
            if (c19376Arr == null) {
                z = false;
                break;
            }
            int length2 = c19376Arr.length;
            int i4 = length2 - 1;
            int i5 = -length2;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                int i6 = (iM16880 + i5) & i4;
                if (i6 >= 0 && i6 < length2 && (c19377 = c19376Arr[i6]) != null && c19377.f57838 == i2) {
                    int i7 = c19377.f57840;
                    if (i7 - c19377.f57839 < 0 && (abstractFutureC10659Arr = c19377.f57837) != null && (length = abstractFutureC10659Arr.length) > 0) {
                        int i8 = c19377.f57842;
                        long j2 = (((long) ((length - 1) & i7)) << f55873) + ((long) f55878);
                        Unsafe unsafe = f55877;
                        AbstractFutureC10659 abstractFutureC106510 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j2);
                        if (abstractFutureC106510 == null) {
                            break;
                        }
                        int i9 = i7 + 1;
                        if (i7 != c19377.f57840 || i2 != c19377.f57838 || !C8449.m19671(unsafe, abstractFutureC10659Arr, j2, abstractFutureC106510)) {
                            break;
                            break;
                            break;
                        }
                        c19377.f57840 = i9;
                        c19376.f57838 = i8;
                        abstractFutureC106510.m24524();
                        c19376.f57838 = i;
                        break;
                    }
                }
                i5 += 2;
            }
            i3 = abstractFutureC10659.f29488;
            if (i3 >= 0) {
                if (!z) {
                    if (j == 0) {
                        millis = 0;
                    } else {
                        long jNanoTime = j - System.nanoTime();
                        if (jNanoTime > 0) {
                            millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime);
                            if (millis <= 0) {
                                millis = 1;
                            }
                        }
                    }
                    int iM42680 = m42680(c19376);
                    if (iM42680 != 0) {
                        abstractFutureC10659.m24521(millis);
                        m42673(this, f55872, iM42680 > 0 ? 281474976710656L : 0L);
                    }
                    i3 = abstractFutureC10659.f29488;
                }
            }
            return i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42685(C19376 c19376) {
        int i;
        boolean z;
        boolean z2;
        C19376 c19377;
        int i2;
        AbstractFutureC10659[] abstractFutureC10659Arr;
        int i3 = c19376.f57838;
        int i4 = c19376.f57842 & 65536;
        byte b = -1;
        byte b2 = -1;
        int i5 = i3;
        while (true) {
            if (i4 != 0) {
                c19376.m44107(0);
            } else {
                c19376.m44110(0);
            }
            if (b2 == b && c19376.f57841 >= 0) {
                b2 = 1;
            }
            int iM16880 = C7306.m16880();
            C19376[] c19376Arr = this.f55882;
            long j = 281474976710656L;
            if (c19376Arr != null) {
                int length = c19376Arr.length;
                int i6 = length - 1;
                z2 = true;
                int i7 = length;
                while (true) {
                    if (i7 <= 0) {
                        i = i4;
                        z = true;
                        break;
                    }
                    int i8 = (iM16880 - i7) & i6;
                    if (i8 < 0 || i8 >= length || (c19377 = c19376Arr[i8]) == null) {
                        i = i4;
                        iM16880 = iM16880;
                    } else {
                        int i9 = c19377.f57840;
                        i = i4;
                        if (i9 - c19377.f57839 < 0 && (abstractFutureC10659Arr = c19377.f57837) != null) {
                            i2 = 1073741824;
                            int length2 = abstractFutureC10659Arr.length;
                            if (length2 > 0) {
                                if (b2 == 0) {
                                    m42673(this, f55872, j);
                                    b2 = 1;
                                }
                                long j2 = (((long) ((length2 - 1) & i9)) << f55873) + ((long) f55878);
                                Unsafe unsafe = f55877;
                                AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j2);
                                if (abstractFutureC10659 != null) {
                                    int i10 = i9 + 1;
                                    if (i9 == c19377.f57840 && C8449.m19671(unsafe, abstractFutureC10659Arr, j2, abstractFutureC10659)) {
                                        c19377.f57840 = i10;
                                        c19376.f57838 = c19377.f57842;
                                        abstractFutureC10659.m24524();
                                        c19376.f57838 = i3;
                                        i5 = i3;
                                    }
                                }
                                z = false;
                                z2 = false;
                                break;
                            }
                        } else {
                            i2 = 1073741824;
                        }
                        if ((c19377.f57838 & i2) == 0) {
                            z2 = false;
                        }
                    }
                    i7--;
                    j = 281474976710656L;
                    i4 = i;
                    iM16880 = iM16880;
                }
            } else {
                i = i4;
                z = true;
                z2 = true;
            }
            if (z2) {
                break;
            }
            if (z) {
                if (i5 != 1073741824) {
                    c19376.f57838 = 1073741824;
                    i5 = 1073741824;
                }
                if (b2 == 1) {
                    m42673(this, f55872, -281474976710656L);
                    b2 = 0;
                }
            }
            b = -1;
            i4 = i;
        }
        if (b2 == 0) {
            m42673(this, f55872, 281474976710656L);
        }
        c19376.f57838 = i3;
    }

    /* JADX INFO: renamed from: ܳ */
    private AbstractFutureC10659 m42679() {
        C19376[] c19376Arr;
        int length;
        C19376 c19376;
        int i;
        AbstractFutureC10659[] abstractFutureC10659Arr;
        int length2;
        while ((this.f55886 & Integer.MIN_VALUE) == 0 && (c19376Arr = this.f55882) != null && (length = c19376Arr.length) > 0) {
            int i2 = length - 1;
            int iM16880 = C7306.m16880();
            int i3 = iM16880 >>> 16;
            int i4 = iM16880 & i2;
            int i5 = i3 | 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = i4;
            while (true) {
                c19376 = c19376Arr[i8];
                if (c19376 != null) {
                    i = c19376.f57840;
                    i6 += i;
                    if (i - c19376.f57839 < 0 && (abstractFutureC10659Arr = c19376.f57837) != null && (length2 = abstractFutureC10659Arr.length) > 0) {
                        break;
                    }
                }
                i8 = (i8 + i5) & i2;
                if (i8 == i4) {
                    if (i7 == i6) {
                        return null;
                    }
                    i7 = i6;
                    i6 = 0;
                }
            }
            long j = (((long) ((length2 - 1) & i)) << f55873) + ((long) f55878);
            Unsafe unsafe = f55877;
            AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j);
            if (abstractFutureC10659 != null) {
                int i9 = i + 1;
                if (i == c19376.f57840 && C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC10659)) {
                    c19376.f57840 = i9;
                    return abstractFutureC10659;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX INFO: renamed from: ۧ */
    private void m42678(AbstractFutureC10659 abstractFutureC10659) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        C19376 c19376;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C5965) {
            C5965 c5965 = (C5965) threadCurrentThread;
            if (c5965.f14761 == this && (c19376 = c5965.f14762) != null) {
                c19376.m44108(abstractFutureC10659);
                return;
            }
        }
        int iM16873 = C7306.m16873();
        if (iM16873 == 0) {
            C7306.m16879();
            iM16873 = C7306.m16873();
        }
        int iM16874 = iM16873;
        while (true) {
            int i = this.f55886;
            C19376[] c19376Arr = this.f55882;
            if ((i & 262144) != 0 || c19376Arr == null || (length = c19376Arr.length) <= 0) {
                break;
            }
            C19376 c19377 = c19376Arr[(length - 1) & iM16874 & 126];
            if (c19377 == null) {
                String str = this.f55884;
                int i2 = (iM16874 | 1073741824) & (-65538);
                C19376 c19378 = new C19376(this, null);
                c19378.f57842 = i2;
                c19378.f57838 = 1073741824;
                c19378.f57841 = 1;
                if (str != null) {
                    synchronized (str) {
                        C19376[] c19376Arr2 = this.f55882;
                        if (c19376Arr2 == null || (length4 = c19376Arr2.length) <= 0) {
                            z = false;
                            z2 = false;
                        } else {
                            int i3 = i2 & (length4 - 1) & 126;
                            if (c19376Arr2[i3] == null) {
                                c19376Arr2[i3] = c19378;
                                z = true;
                                z2 = true;
                            } else {
                                z = false;
                                z2 = false;
                            }
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                c19377 = c19378;
            } else if (c19377.m44112()) {
                int i4 = c19377.f57840;
                int i5 = c19377.f57839;
                AbstractFutureC10659[] abstractFutureC10659Arr = c19377.f57837;
                if (abstractFutureC10659Arr == null || (length2 = abstractFutureC10659Arr.length) <= 0) {
                    z2 = true;
                } else {
                    int i6 = length2 - 1;
                    int i7 = i4 - i5;
                    if (i6 + i7 > 0) {
                        abstractFutureC10659Arr[i6 & i5] = abstractFutureC10659;
                        c19377.f57839 = i5 + 1;
                        c19377.f57841 = 0;
                        if (i7 < 0 && c19377.f57840 - i5 < -1) {
                            return;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                }
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                if (z2) {
                    try {
                        c19377.m44106();
                        int i8 = c19377.f57839;
                        AbstractFutureC10659[] abstractFutureC10659Arr2 = c19377.f57837;
                        if (abstractFutureC10659Arr2 != null && (length3 = abstractFutureC10659Arr2.length) > 0) {
                            abstractFutureC10659Arr2[(length3 - 1) & i8] = abstractFutureC10659;
                            c19377.f57839 = i8 + 1;
                        }
                        c19377.f57841 = 0;
                    } catch (Throwable th) {
                        c19377.f57841 = 0;
                        throw th;
                    }
                }
                m42688();
                return;
            }
            iM16874 = C7306.m16874(iM16874);
        }
        throw new RejectedExecutionException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42686(AbstractFutureC10659 abstractFutureC10659) {
        int length;
        C19376 c19376;
        int iM16873 = C7306.m16873();
        C19376[] c19376Arr = this.f55882;
        return c19376Arr != null && (length = c19376Arr.length) > 0 && (c19376 = c19376Arr[(iM16873 & (length - 1)) & 126]) != null && c19376.m44113(abstractFutureC10659);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42676(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        while (true) {
            int i6 = this.f55886;
            if ((262144 & i6) != 0) {
                while (true) {
                    int i7 = this.f55886;
                    int i8 = 65535;
                    int i9 = 1;
                    if ((Integer.MIN_VALUE & i7) != 0) {
                        while ((this.f55886 & 524288) == 0) {
                            long j2 = 0;
                            while (true) {
                                long j3 = this.f55889;
                                C19376[] c19376Arr = this.f55882;
                                if (c19376Arr != null) {
                                    for (C19376 c19376 : c19376Arr) {
                                        if (c19376 != null) {
                                            C5965 c5965 = c19376.f57843;
                                            while (true) {
                                                AbstractFutureC10659 abstractFutureC10659M44109 = c19376.m44109();
                                                if (abstractFutureC10659M44109 == null) {
                                                    break;
                                                }
                                                if (abstractFutureC10659M44109.f29488 >= 0) {
                                                    try {
                                                        abstractFutureC10659M44109.cancel(false);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (c5965 != null) {
                                                try {
                                                    c5965.interrupt();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            j3 += (((long) c19376.f57841) << 32) + ((long) c19376.f57840);
                                        }
                                    }
                                }
                                i = this.f55886;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f55882 == c19376Arr) {
                                    if (j2 == j3) {
                                        break;
                                    }
                                    j2 = j3;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (this.f55889 >>> 32)) > 0) {
                                break;
                            }
                            if (f55877.compareAndSwapInt(this, f55875, i, i | 524288)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                break;
                            }
                        }
                        return true;
                    }
                    if (z) {
                        i3 = i7;
                        i4 = Integer.MIN_VALUE;
                    } else {
                        long j4 = 0;
                        while (true) {
                            long j5 = this.f55889;
                            C19376[] c19376Arr2 = this.f55882;
                            if ((i7 & i8) + ((int) (j5 >> 48)) > 0) {
                                i4 = Integer.MIN_VALUE;
                                j = j4;
                            } else if (c19376Arr2 != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < c19376Arr2.length) {
                                        C19376 c19377 = c19376Arr2[i10];
                                        if (c19377 != null) {
                                            int i11 = c19377.f57838;
                                            int i12 = c19377.f57841;
                                            int i13 = c19377.f57842;
                                            int i14 = c19377.f57840;
                                            if (i14 != c19377.f57839 || ((i13 & 1) == i9 && (i11 >= 0 || i12 >= 0))) {
                                                j = j4;
                                                i9 = 1;
                                                i4 = Integer.MIN_VALUE;
                                            } else {
                                                j5 = (((long) i11) << 48) + (((long) i12) << 32) + (((long) i14) << 16) + ((long) i13) + j5;
                                            }
                                        }
                                        i10++;
                                        i9 = 1;
                                        j4 = j4;
                                    } else {
                                        j = j4;
                                        i4 = Integer.MIN_VALUE;
                                        i9 = 0;
                                    }
                                }
                            } else {
                                j = j4;
                                i4 = Integer.MIN_VALUE;
                                i9 = 0;
                            }
                            i5 = this.f55886;
                            if ((i5 & i4) != 0) {
                                break;
                            }
                            if (i9 != 0) {
                                return false;
                            }
                            if (this.f55882 != c19376Arr2) {
                                j4 = j;
                            } else {
                                if (j == j5) {
                                    break;
                                }
                                j4 = j5;
                            }
                            i9 = 1;
                            i7 = i5;
                            i8 = 65535;
                        }
                        i3 = i5;
                    }
                    if ((i3 & i4) == 0) {
                        f55877.compareAndSwapInt(this, f55875, i3, i3 | i4);
                    }
                }
            } else {
                if (!z2 || this == f55876) {
                    return false;
                }
                f55877.compareAndSwapInt(this, f55875, i6, i6 | 262144);
            }
        }
    }

    public C18705() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int iAvailableProcessors = -1;
        InterfaceC9790 c12671 = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            iAvailableProcessors = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            InterfaceC9790 interfaceC9790 = (InterfaceC9790) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                uncaughtExceptionHandler = null;
            }
            c12671 = interfaceC9790;
        } catch (Exception unused2) {
            uncaughtExceptionHandler = null;
        }
        if (c12671 == null) {
            if (System.getSecurityManager() == null) {
                c12671 = f55874;
            } else {
                c12671 = new C12671();
            }
        }
        if (iAvailableProcessors < 0 && (iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            iAvailableProcessors = 1;
        }
        iAvailableProcessors = iAvailableProcessors > 32767 ? EnumC8055.f21261 : iAvailableProcessors;
        long j = -iAvailableProcessors;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - iAvailableProcessors) & 65535) | (f55871 << 16);
        int i2 = iAvailableProcessors > 1 ? iAvailableProcessors - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.f55884 = "FJPool.commonPool-worker-";
        this.f55882 = new C19376[((i6 | (i6 >>> 16)) + 1) << 1];
        this.f55887 = c12671;
        this.f55883 = uncaughtExceptionHandler;
        this.f55880 = 60000L;
        this.f55888 = i;
        this.f55886 = iAvailableProcessors;
        this.f55889 = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        RunnableFutureC16022 runnableFutureC16022 = new RunnableFutureC16022(callable);
        m42678(runnableFutureC16022);
        return runnableFutureC16022;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        RunnableFutureC24740 runnableFutureC24740 = new RunnableFutureC24740(runnable, obj);
        m42678(runnableFutureC24740);
        return runnableFutureC24740;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RunnableFutureC16022 runnableFutureC16022 = new RunnableFutureC16022((Callable) it.next());
                arrayList.add(runnableFutureC16022);
                m42678(runnableFutureC16022);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractFutureC10659) arrayList.get(i)).m24525();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    public final String toString() {
        int i;
        long j;
        String str;
        Thread.State state;
        long j2 = this.f55885;
        C19376[] c19376Arr = this.f55882;
        long j3 = 0;
        if (c19376Arr != null) {
            j = 0;
            i = 0;
            for (int i2 = 0; i2 < c19376Arr.length; i2++) {
                C19376 c19376 = c19376Arr[i2];
                if (c19376 != null) {
                    int i3 = c19376.f57840 - c19376.f57839;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j += (long) i4;
                    } else {
                        j3 += (long) i4;
                        j2 += ((long) c19376.f57844) & 4294967295L;
                        C5965 c5965 = c19376.f57843;
                        if (c5965 != null && (state = c5965.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
            j = 0;
        }
        int i5 = this.f55886;
        int i6 = 65535 & i5;
        long j4 = this.f55889;
        int i7 = ((short) (j4 >>> 32)) + i6;
        int i8 = ((int) (j4 >> 48)) + i6;
        int i9 = i8 >= 0 ? i8 : 0;
        if ((524288 & i5) != 0) {
            str = "Terminated";
        } else if ((Integer.MIN_VALUE & i5) != 0) {
            str = "Terminating";
        } else {
            str = (i5 & 262144) != 0 ? "Shutting down" : "Running";
        }
        StringBuilder sb = new StringBuilder();
        ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb, super.toString(), "[", str, ", parallelism = ");
        C7913.m18269(sb, i6, ", size = ", i7, ", active = ");
        C7913.m18269(sb, i9, ", running = ", i, ", steals = ");
        sb.append(j2);
        sb.append(", tasks = ");
        sb.append(j3);
        sb.append(", submissions = ");
        return C17520.m39893(sb, j, "]");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f55886 & 524288) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f55886 & 262144) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this != f55876) {
            long nanos = timeUnit.toNanos(j);
            if (isTerminated()) {
                return true;
            }
            if (nanos > 0) {
                long jNanoTime = System.nanoTime() + nanos;
                synchronized (this) {
                    while (!isTerminated()) {
                        if (nanos <= 0) {
                            return false;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                        if (millis <= 0) {
                            millis = 1;
                        }
                        wait(millis);
                        nanos = jNanoTime - System.nanoTime();
                    }
                    return true;
                }
            }
        } else {
            long nanos2 = timeUnit.toNanos(j);
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C5965) {
                C5965 c5965 = (C5965) threadCurrentThread;
                if (c5965.f14761 == this) {
                    m42685(c5965.f14762);
                    return false;
                }
            }
            long jNanoTime2 = System.nanoTime();
            while (true) {
                AbstractFutureC10659 abstractFutureC10659M42679 = m42679();
                if (abstractFutureC10659M42679 != null) {
                    abstractFutureC10659M42679.m24524();
                } else {
                    while (true) {
                        long j2 = this.f55889;
                        int i = this.f55886;
                        int i2 = 65535 & i;
                        int i3 = ((short) (j2 >>> 32)) + i2;
                        int i4 = i2 + ((int) (j2 >> 48));
                        if ((i & (-2146959360)) == 0) {
                            if (i4 <= 0) {
                                C19376[] c19376Arr = this.f55882;
                                if (c19376Arr != null) {
                                    int i5 = 1;
                                    while (true) {
                                        if (i5 < c19376Arr.length) {
                                            C19376 c19376 = c19376Arr[i5];
                                            if (c19376 != null) {
                                                if ((c19376.f57838 & 1073741824) != 0) {
                                                    i3--;
                                                }
                                            }
                                            i5 += 2;
                                        }
                                    }
                                }
                                if (i3 != 0 || this.f55889 != j2) {
                                }
                            }
                            z = false;
                            if (!z || System.nanoTime() - jNanoTime2 > nanos2) {
                                break;
                            }
                            Thread.yield();
                        }
                        z = true;
                        if (!z) {
                            break;
                        }
                        Thread.yield();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42675(C20520 c20520) {
        C5965 c5965;
        C18705 c18705;
        C19376 c19376;
        long j = c20520.f63372;
        long j2 = f55872;
        Thread threadCurrentThread = Thread.currentThread();
        long j3 = 0;
        if ((threadCurrentThread instanceof C5965) && (c18705 = (c5965 = (C5965) threadCurrentThread).f14761) != null && (c19376 = c5965.f14762) != null) {
            while (!c20520.m46279()) {
                int iM42680 = c18705.m42680(c19376);
                if (iM42680 != 0) {
                    try {
                        if (!c20520.m46279()) {
                            while (!c20520.m46279()) {
                                if (j == 0) {
                                    LockSupport.park(c20520);
                                } else {
                                    LockSupport.parkNanos(c20520, c20520.f63375);
                                }
                            }
                        }
                        return;
                    } finally {
                        m42673(c18705, j2, iM42680 > 0 ? 281474976710656L : 0L);
                    }
                }
            }
            return;
        }
        if (c20520.m46279()) {
            return;
        }
        while (!c20520.m46279()) {
            if (j == 0) {
                LockSupport.park(c20520);
            } else {
                LockSupport.parkNanos(c20520, c20520.f63375);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: ֫ */
    public static void m42674(Executor executor, C20520 c20520) {
        int iM16873;
        C19376 c19376;
        C19376[] c19376Arr;
        int length;
        int i;
        int length2;
        if (!(executor instanceof C18705)) {
            return;
        }
        C18705 c18705 = (C18705) executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C5965) {
            C5965 c5965 = (C5965) threadCurrentThread;
            if (c5965.f14761 == c18705) {
                c19376 = c5965.f14762;
            } else {
                iM16873 = C7306.m16873();
                if (iM16873 != 0 || (c19376Arr = c18705.f55882) == null || (length = c19376Arr.length) <= 0) {
                    c19376 = null;
                } else {
                    c19376 = c19376Arr[iM16873 & (length - 1) & 126];
                }
            }
        } else {
            iM16873 = C7306.m16873();
            if (iM16873 != 0) {
                c19376 = null;
            } else {
                c19376 = null;
            }
        }
        if (c19376 == null) {
            return;
        }
        while (true) {
            int i2 = c19376.f57840;
            int i3 = c19376.f57839;
            AbstractFutureC10659[] abstractFutureC10659Arr = c19376.f57837;
            if (abstractFutureC10659Arr == null || (i = i2 - i3) >= 0 || (length2 = abstractFutureC10659Arr.length) <= 0) {
                return;
            }
            long j = (((long) ((length2 - 1) & i2)) << f55873) + ((long) f55878);
            Unsafe unsafe = f55877;
            AbstractFutureC10659 abstractFutureC10659 = (AbstractFutureC10659) unsafe.getObjectVolatile(abstractFutureC10659Arr, j);
            if (c20520.m46279()) {
                return;
            }
            int i4 = i2 + 1;
            if (i2 == c19376.f57840) {
                if (abstractFutureC10659 == null) {
                    if (i == -1) {
                        return;
                    }
                } else {
                    if (!(abstractFutureC10659 instanceof InterfaceC11803)) {
                        return;
                    }
                    if (C8449.m19671(unsafe, abstractFutureC10659Arr, j, abstractFutureC10659)) {
                        c19376.f57840 = i4;
                        abstractFutureC10659.m24524();
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC24740(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC16022(callable);
    }

    static {
        Unsafe unsafe = C3282.f6392;
        f55877 = unsafe;
        try {
            f55872 = unsafe.objectFieldOffset(C18705.class.getDeclaredField("᩹"));
            f55875 = unsafe.objectFieldOffset(C18705.class.getDeclaredField("۬"));
            f55878 = unsafe.arrayBaseOffset(AbstractFutureC10659[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC10659[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f55873 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            f55871 = i;
            f55874 = new C15824();
            f55879 = new RuntimePermission("modifyThread");
            C18705 c18705 = (C18705) AccessController.doPrivileged(new C13814());
            f55876 = c18705;
            f55870 = Math.max(c18705.f55886 & 65535, 1);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
