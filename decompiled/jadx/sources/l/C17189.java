package l;

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
public final class C17189 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final int f52689;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final int f52690;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final long f52691;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int f52692;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C14157 f52693;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final long f52694;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final C17189 f52695;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final Unsafe f52696;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f52697;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final RuntimePermission f52698;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f52699;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52700;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17895[] f52701;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Thread.UncaughtExceptionHandler f52702;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f52703;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile long f52704;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile int f52705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC7808 f52706;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52707;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile long f52708;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C10631.m26668(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractFutureC8723 c9429;
        runnable.getClass();
        if (runnable instanceof AbstractFutureC8723) {
            c9429 = (AbstractFutureC8723) runnable;
        } else {
            c9429 = new C9429(runnable);
        }
        m40433(c9429);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        AbstractFutureC8723 runnableFutureC6606 = runnable instanceof AbstractFutureC8723 ? (AbstractFutureC8723) runnable : new RunnableFutureC6606(runnable);
        m40433(runnableFutureC6606);
        return runnableFutureC6606;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f52698);
        }
        m40431(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f52698);
        }
        m40431(true, true);
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AccessControlContext m40427(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40428(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f52696;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40426(long j, Object obj) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f52696;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!C6397.m17724(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m40436() {
        InterfaceC7808 interfaceC7808 = this.f52706;
        C3784 th = null;
        if (interfaceC7808 != null) {
            try {
                C3784 c3784Mo20831 = interfaceC7808.mo20831(this);
                if (c3784Mo20831 != null) {
                    try {
                        c3784Mo20831.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C3784 c3784 = th;
                th = c3784Mo20831;
                th = c3784;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            th = null;
        }
        m40439(th, th);
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40432(long j) {
        long j2 = j;
        do {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j2) & 281470681743360L);
            if (this.f52708 == j2 && f52696.compareAndSwapLong(this, f52691, j2, j3)) {
                m40436();
                return;
            } else {
                j2 = this.f52708;
                if ((140737488355328L & j2) == 0) {
                    return;
                }
            }
        } while (((int) j2) == 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17895 m40438(C3784 c3784) {
        int i;
        int length;
        c3784.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f52702;
        if (uncaughtExceptionHandler != null) {
            c3784.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C17895 c17895 = new C17895(this, c3784);
        int i2 = this.f52705 & 65536;
        String str = this.f52703;
        if (str == null) {
            return c17895;
        }
        synchronized (str) {
            C17895[] c17895Arr = this.f52701;
            int i3 = this.f52700 - 1640531527;
            this.f52700 = i3;
            i = 0;
            if (c17895Arr != null && (length = c17895Arr.length) > 1) {
                int i4 = length - 1;
                int i5 = i3 & i4;
                int i6 = ((i3 << 1) | 1) & i4;
                int i7 = length >>> 1;
                while (true) {
                    C17895 c17896 = c17895Arr[i6];
                    if (c17896 == null || c17896.f54644 == 1073741824) {
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
                c17895.f54645 = i8;
                c17895.f54644 = i8;
                if (i6 < length) {
                    c17895Arr[i6] = c17895;
                } else {
                    int i9 = length << 1;
                    C17895[] c17895Arr2 = new C17895[i9];
                    c17895Arr2[i6] = c17895;
                    int i10 = i9 - 1;
                    while (i < length) {
                        C17895 c17897 = c17895Arr[i];
                        if (c17897 != null) {
                            c17895Arr2[c17897.f54645 & i10 & 126] = c17897;
                        }
                        int i11 = i + 1;
                        if (i11 >= length) {
                            break;
                        }
                        c17895Arr2[i11] = c17895Arr[i11];
                        i += 2;
                    }
                    this.f52701 = c17895Arr2;
                }
                i = i5;
            }
        }
        c3784.setName(str.concat(Integer.toString(i)));
        return c17895;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40439(C3784 c3784, Throwable th) {
        C17895 c17895;
        int i;
        Unsafe unsafe;
        long j;
        long j2;
        C17895 c17896 = null;
        if (c3784 == null) {
            c17895 = c17896;
            i = 0;
        } else {
            c17895 = c3784.f11956;
            if (c17895 != null) {
                String str = this.f52703;
                long j3 = ((long) c17895.f54647) & 4294967295L;
                int i2 = c17895.f54645 & 65535;
                if (str != null) {
                    synchronized (str) {
                        C17895[] c17895Arr = this.f52701;
                        if (c17895Arr != null && c17895Arr.length > i2 && c17895Arr[i2] == c17895) {
                            c17895Arr[i2] = null;
                        }
                        this.f52704 += j3;
                    }
                }
                i = c17895.f54644;
            } else {
                c17896 = c17895;
                c17895 = c17896;
                i = 0;
            }
        }
        if (i != 1073741824) {
            do {
                unsafe = f52696;
                j = f52691;
                j2 = this.f52708;
            } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & 281470681743360L) | (j2 & 4294967295L)));
        }
        if (c17895 != null) {
            while (true) {
                AbstractFutureC8723 abstractFutureC8723M41862 = c17895.m41862();
                if (abstractFutureC8723M41862 == null) {
                    break;
                } else if (abstractFutureC8723M41862.f26563 >= 0) {
                    try {
                        abstractFutureC8723M41862.cancel(false);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (!m40431(false, false) && c17895 != null && c17895.f54640 != null) {
            m40443();
        }
        if (th == null) {
            AbstractFutureC8723.m22546();
        } else {
            int i3 = AbstractFutureC8723.f26562;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40443() {
        int i;
        C17895 c17895;
        while (true) {
            long j = this.f52708;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    m40432(j);
                    return;
                }
                return;
            }
            C17895[] c17895Arr = this.f52701;
            if (c17895Arr == null || c17895Arr.length <= (i = 65535 & i2) || (c17895 = c17895Arr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = c17895.f54644;
            long j2 = (((long) c17895.f54648) & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            C3784 c3784 = c17895.f54646;
            if (i2 == i4 && f52696.compareAndSwapLong(this, f52691, j, j2)) {
                c17895.f54644 = i3;
                if (c17895.f54641 < 0) {
                    LockSupport.unpark(c3784);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m40435(C17895 c17895) {
        int length;
        Thread.State state;
        long j = this.f52708;
        C17895[] c17895Arr = this.f52701;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (c17895Arr == null || (length = c17895Arr.length) <= 0 || c17895 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C17895 c17896 = c17895Arr[i & (length - 1)];
                int i2 = c17895.f54644;
                long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (c17896 == null) {
                    return 0;
                }
                int i4 = c17896.f54644;
                C3784 c3784 = c17896.f54646;
                long j3 = (((long) c17896.f54648) & 4294967295L) | j2;
                if (i4 != i || !f52696.compareAndSwapLong(this, f52691, j, j3)) {
                    return 0;
                }
                c17896.f54644 = i3;
                if (c17896.f54641 < 0) {
                    LockSupport.unpark(c3784);
                }
                return i2 < 0 ? -1 : 1;
            }
            if (((int) (j >> 48)) - ((short) (this.f52707 & 65535)) > 0) {
                return f52696.compareAndSwapLong(this, f52691, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
            }
            int i5 = this.f52705 & 65535;
            int i6 = i5 + s;
            int i7 = 0;
            int i8 = i6;
            for (int i9 = 1; i9 < length; i9 += 2) {
                C17895 c17897 = c17895Arr[i9];
                if (c17897 != null) {
                    if (c17897.f54641 == 0) {
                        return 0;
                    }
                    i8--;
                    C3784 c3785 = c17897.f54646;
                    if (c3785 != null && ((state = c3785.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                        i7++;
                    }
                }
            }
            if (i8 != 0 || this.f52708 != j) {
                return 0;
            }
            if (i6 >= 32767 || s >= (this.f52707 >>> 16)) {
                if (i7 < i5) {
                    Thread.yield();
                    return 0;
                }
                throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
            }
        }
        return (f52696.compareAndSwapLong(this, f52691, j, ((-281470681743361L) & j) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j) & 281470681743360L)) && m40436()) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ab A[EDGE_INSN: B:95:0x00ab->B:46:0x00ab BREAK  A[LOOP:1: B:9:0x001d->B:44:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40442(C17895 c17895) {
        int i;
        long j;
        C17895 c17896;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int length;
        c17895.m41859();
        int iM14970 = c17895.f54645 ^ C5195.m14970();
        if (iM14970 == 0) {
            iM14970 = 1;
        }
        int i2 = 0;
        C17189 c17189 = this;
        C17895 c17897 = c17895;
        while (true) {
            C17895[] c17895Arr = c17189.f52701;
            if (c17895Arr == null) {
                return;
            }
            int length2 = c17895Arr.length;
            int i3 = length2 - 1;
            boolean z = false;
            C17895 c17898 = c17897;
            int i4 = length2;
            while (true) {
                if (i4 <= 0) {
                    i = 65536;
                    break;
                }
                int i5 = iM14970 & i3;
                if (i5 < 0 || i5 >= length2 || (c17896 = c17895Arr[i5]) == null) {
                    i = 65536;
                    if (z) {
                        break;
                    } else {
                        iM14970++;
                    }
                } else {
                    int i6 = c17896.f54643;
                    if (i6 - c17896.f54642 >= 0 || (abstractFutureC8723Arr = c17896.f54640) == null || (length = abstractFutureC8723Arr.length) <= 0) {
                        i = 65536;
                        if (z) {
                            break;
                            break;
                        }
                        iM14970++;
                    } else {
                        int i7 = c17896.f54645;
                        long j2 = (((long) ((length - 1) & i6)) << f52692) + ((long) f52697);
                        Unsafe unsafe = f52696;
                        AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j2);
                        if (abstractFutureC8723 != null) {
                            int i8 = i6 + 1;
                            if (i6 == c17896.f54643 && C6397.m17724(unsafe, abstractFutureC8723Arr, j2, abstractFutureC8723)) {
                                c17896.f54643 = i8;
                                if (i8 - c17896.f54642 < 0 && i7 != i2) {
                                    c17189.m40443();
                                }
                                c17895.f54641 = i7;
                                abstractFutureC8723.m22555();
                                if ((c17895.f54645 & 65536) != 0) {
                                    c17895.m41860(1024);
                                } else {
                                    c17895.m41863(1024);
                                }
                                C3784 c3784 = c17895.f54646;
                                c17895.f54647++;
                                c17895.f54641 = 0;
                                if (c3784 != null) {
                                    c3784.mo7689();
                                }
                                i2 = i7;
                            }
                        }
                        c17898 = c17895;
                        z = true;
                    }
                }
                i4--;
                c17895Arr = c17895Arr;
                length2 = length2;
            }
            if (z) {
                int i9 = iM14970 ^ (iM14970 << 13);
                int i10 = i9 ^ (i9 >>> 17);
                iM14970 = i10 ^ (i10 << 5);
            } else {
                int i11 = c17898.f54644;
                if (i11 >= 0) {
                    int i12 = (i11 + i) | Integer.MIN_VALUE;
                    c17898.f54644 = i12;
                    do {
                        j = c17189.f52708;
                        c17898.f54648 = (int) j;
                    } while (!f52696.compareAndSwapLong(c17189, f52691, j, (((long) i12) & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i13 = c17898.f54648;
                    c17898.f54641 = -1073741824;
                    int i14 = 0;
                    while (c17898.f54644 < 0) {
                        int i15 = c17189.f52705;
                        if (i15 < 0) {
                            return;
                        }
                        long j3 = c17189.f52708;
                        int i16 = (65535 & i15) + ((int) (j3 >> 48));
                        if (i16 <= 0 && (i15 & 262144) != 0 && c17189.m40431(false, false)) {
                            return;
                        }
                        i14++;
                        if ((i14 & 1) == 0) {
                            Thread.interrupted();
                        } else if (i16 <= 0 && i13 != 0 && i11 == ((int) j3)) {
                            long jCurrentTimeMillis = System.currentTimeMillis() + c17189.f52699;
                            LockSupport.parkUntil(c17189, jCurrentTimeMillis);
                            if (c17189.f52708 == j3 && jCurrentTimeMillis - System.currentTimeMillis() <= 20) {
                                if (f52696.compareAndSwapLong(c17189, f52691, j3, (((long) i13) & 4294967295L) | ((j3 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & (-4294967296L)))) {
                                    c17898.f54644 = 1073741824;
                                    return;
                                }
                            }
                        } else {
                            LockSupport.park(this);
                        }
                        c17189 = this;
                    }
                    c17898.f54641 = 0;
                }
                i2 = 0;
            }
            c17897 = c17898;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m40437(C17895 c17895, AbstractFutureC8723 abstractFutureC8723, long j) {
        long millis;
        C17895 c17896;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int length;
        if (c17895 == null) {
            return 0;
        }
        c17895.m41864(abstractFutureC8723);
        int i = c17895.f54641;
        int i2 = c17895.f54645;
        int i3 = abstractFutureC8723.f26563;
        while (i3 >= 0) {
            boolean z = true;
            int iM14970 = C5195.m14970() | 1;
            C17895[] c17895Arr = this.f52701;
            if (c17895Arr == null) {
                z = false;
                break;
            }
            int length2 = c17895Arr.length;
            int i4 = length2 - 1;
            int i5 = -length2;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                int i6 = (iM14970 + i5) & i4;
                if (i6 >= 0 && i6 < length2 && (c17896 = c17895Arr[i6]) != null && c17896.f54641 == i2) {
                    int i7 = c17896.f54643;
                    if (i7 - c17896.f54642 < 0 && (abstractFutureC8723Arr = c17896.f54640) != null && (length = abstractFutureC8723Arr.length) > 0) {
                        int i8 = c17896.f54645;
                        long j2 = (((long) ((length - 1) & i7)) << f52692) + ((long) f52697);
                        Unsafe unsafe = f52696;
                        AbstractFutureC8723 abstractFutureC8724 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j2);
                        if (abstractFutureC8724 == null) {
                            break;
                        }
                        int i9 = i7 + 1;
                        if (i7 != c17896.f54643 || i2 != c17896.f54641 || !C6397.m17724(unsafe, abstractFutureC8723Arr, j2, abstractFutureC8724)) {
                            break;
                            break;
                            break;
                        }
                        c17896.f54643 = i9;
                        c17895.f54641 = i8;
                        abstractFutureC8724.m22555();
                        c17895.f54641 = i;
                        break;
                    }
                }
                i5 += 2;
            }
            i3 = abstractFutureC8723.f26563;
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
                    int iM40435 = m40435(c17895);
                    if (iM40435 != 0) {
                        abstractFutureC8723.m22552(millis);
                        m40428(this, f52691, iM40435 > 0 ? 281474976710656L : 0L);
                    }
                    i3 = abstractFutureC8723.f26563;
                }
            }
            return i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40440(C17895 c17895) {
        int i;
        boolean z;
        boolean z2;
        C17895 c17896;
        int i2;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int i3 = c17895.f54641;
        int i4 = c17895.f54645 & 65536;
        byte b = -1;
        byte b2 = -1;
        int i5 = i3;
        while (true) {
            if (i4 != 0) {
                c17895.m41860(0);
            } else {
                c17895.m41863(0);
            }
            if (b2 == b && c17895.f54644 >= 0) {
                b2 = 1;
            }
            int iM14970 = C5195.m14970();
            C17895[] c17895Arr = this.f52701;
            long j = 281474976710656L;
            if (c17895Arr != null) {
                int length = c17895Arr.length;
                int i6 = length - 1;
                z2 = true;
                int i7 = length;
                while (true) {
                    if (i7 <= 0) {
                        i = i4;
                        z = true;
                        break;
                    }
                    int i8 = (iM14970 - i7) & i6;
                    if (i8 < 0 || i8 >= length || (c17896 = c17895Arr[i8]) == null) {
                        i = i4;
                        iM14970 = iM14970;
                    } else {
                        int i9 = c17896.f54643;
                        i = i4;
                        if (i9 - c17896.f54642 < 0 && (abstractFutureC8723Arr = c17896.f54640) != null) {
                            i2 = 1073741824;
                            int length2 = abstractFutureC8723Arr.length;
                            if (length2 > 0) {
                                if (b2 == 0) {
                                    m40428(this, f52691, j);
                                    b2 = 1;
                                }
                                long j2 = (((long) ((length2 - 1) & i9)) << f52692) + ((long) f52697);
                                Unsafe unsafe = f52696;
                                AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j2);
                                if (abstractFutureC8723 != null) {
                                    int i10 = i9 + 1;
                                    if (i9 == c17896.f54643 && C6397.m17724(unsafe, abstractFutureC8723Arr, j2, abstractFutureC8723)) {
                                        c17896.f54643 = i10;
                                        c17895.f54641 = c17896.f54645;
                                        abstractFutureC8723.m22555();
                                        c17895.f54641 = i3;
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
                        if ((c17896.f54641 & i2) == 0) {
                            z2 = false;
                        }
                    }
                    i7--;
                    j = 281474976710656L;
                    i4 = i;
                    iM14970 = iM14970;
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
                    c17895.f54641 = 1073741824;
                    i5 = 1073741824;
                }
                if (b2 == 1) {
                    m40428(this, f52691, -281474976710656L);
                    b2 = 0;
                }
            }
            b = -1;
            i4 = i;
        }
        if (b2 == 0) {
            m40428(this, f52691, 281474976710656L);
        }
        c17895.f54641 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private AbstractFutureC8723 m40434() {
        C17895[] c17895Arr;
        int length;
        C17895 c17895;
        int i;
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int length2;
        while ((this.f52705 & Integer.MIN_VALUE) == 0 && (c17895Arr = this.f52701) != null && (length = c17895Arr.length) > 0) {
            int i2 = length - 1;
            int iM14970 = C5195.m14970();
            int i3 = iM14970 >>> 16;
            int i4 = iM14970 & i2;
            int i5 = i3 | 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = i4;
            while (true) {
                c17895 = c17895Arr[i8];
                if (c17895 != null) {
                    i = c17895.f54643;
                    i6 += i;
                    if (i - c17895.f54642 < 0 && (abstractFutureC8723Arr = c17895.f54640) != null && (length2 = abstractFutureC8723Arr.length) > 0) {
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
            long j = (((long) ((length2 - 1) & i)) << f52692) + ((long) f52697);
            Unsafe unsafe = f52696;
            AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j);
            if (abstractFutureC8723 != null) {
                int i9 = i + 1;
                if (i == c17895.f54643 && C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC8723)) {
                    c17895.f54643 = i9;
                    return abstractFutureC8723;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40433(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        C17895 c17895;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C3784) {
            C3784 c3784 = (C3784) threadCurrentThread;
            if (c3784.f11955 == this && (c17895 = c3784.f11956) != null) {
                c17895.m41861(abstractFutureC8723);
                return;
            }
        }
        int iM14963 = C5195.m14963();
        if (iM14963 == 0) {
            C5195.m14969();
            iM14963 = C5195.m14963();
        }
        int iM14964 = iM14963;
        while (true) {
            int i = this.f52705;
            C17895[] c17895Arr = this.f52701;
            if ((i & 262144) != 0 || c17895Arr == null || (length = c17895Arr.length) <= 0) {
                break;
            }
            C17895 c17896 = c17895Arr[(length - 1) & iM14964 & 126];
            if (c17896 == null) {
                String str = this.f52703;
                int i2 = (iM14964 | 1073741824) & (-65538);
                C17895 c17897 = new C17895(this, null);
                c17897.f54645 = i2;
                c17897.f54641 = 1073741824;
                c17897.f54644 = 1;
                if (str != null) {
                    synchronized (str) {
                        C17895[] c17895Arr2 = this.f52701;
                        if (c17895Arr2 == null || (length4 = c17895Arr2.length) <= 0) {
                            z = false;
                            z2 = false;
                        } else {
                            int i3 = i2 & (length4 - 1) & 126;
                            if (c17895Arr2[i3] == null) {
                                c17895Arr2[i3] = c17897;
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
                c17896 = c17897;
            } else if (c17896.m41865()) {
                int i4 = c17896.f54643;
                int i5 = c17896.f54642;
                AbstractFutureC8723[] abstractFutureC8723Arr = c17896.f54640;
                if (abstractFutureC8723Arr == null || (length2 = abstractFutureC8723Arr.length) <= 0) {
                    z2 = true;
                } else {
                    int i6 = length2 - 1;
                    int i7 = i4 - i5;
                    if (i6 + i7 > 0) {
                        abstractFutureC8723Arr[i6 & i5] = abstractFutureC8723;
                        c17896.f54642 = i5 + 1;
                        c17896.f54644 = 0;
                        if (i7 < 0 && c17896.f54643 - i5 < -1) {
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
                        c17896.m41859();
                        int i8 = c17896.f54642;
                        AbstractFutureC8723[] abstractFutureC8723Arr2 = c17896.f54640;
                        if (abstractFutureC8723Arr2 != null && (length3 = abstractFutureC8723Arr2.length) > 0) {
                            abstractFutureC8723Arr2[(length3 - 1) & i8] = abstractFutureC8723;
                            c17896.f54642 = i8 + 1;
                        }
                        c17896.f54644 = 0;
                    } catch (Throwable th) {
                        c17896.f54644 = 0;
                        throw th;
                    }
                }
                m40443();
                return;
            }
            iM14964 = C5195.m14964(iM14964);
        }
        throw new RejectedExecutionException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40441(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        C17895 c17895;
        int iM14963 = C5195.m14963();
        C17895[] c17895Arr = this.f52701;
        return c17895Arr != null && (length = c17895Arr.length) > 0 && (c17895 = c17895Arr[(iM14963 & (length - 1)) & 126]) != null && c17895.m41866(abstractFutureC8723);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40431(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        while (true) {
            int i6 = this.f52705;
            if ((262144 & i6) != 0) {
                while (true) {
                    int i7 = this.f52705;
                    int i8 = 65535;
                    int i9 = 1;
                    if ((Integer.MIN_VALUE & i7) != 0) {
                        while ((this.f52705 & 524288) == 0) {
                            long j2 = 0;
                            while (true) {
                                long j3 = this.f52708;
                                C17895[] c17895Arr = this.f52701;
                                if (c17895Arr != null) {
                                    for (C17895 c17895 : c17895Arr) {
                                        if (c17895 != null) {
                                            C3784 c3784 = c17895.f54646;
                                            while (true) {
                                                AbstractFutureC8723 abstractFutureC8723M41862 = c17895.m41862();
                                                if (abstractFutureC8723M41862 == null) {
                                                    break;
                                                }
                                                if (abstractFutureC8723M41862.f26563 >= 0) {
                                                    try {
                                                        abstractFutureC8723M41862.cancel(false);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (c3784 != null) {
                                                try {
                                                    c3784.interrupt();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            j3 += (((long) c17895.f54644) << 32) + ((long) c17895.f54643);
                                        }
                                    }
                                }
                                i = this.f52705;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f52701 == c17895Arr) {
                                    if (j2 == j3) {
                                        break;
                                    }
                                    j2 = j3;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (this.f52708 >>> 32)) > 0) {
                                break;
                            }
                            if (f52696.compareAndSwapInt(this, f52694, i, i | 524288)) {
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
                            long j5 = this.f52708;
                            C17895[] c17895Arr2 = this.f52701;
                            if ((i7 & i8) + ((int) (j5 >> 48)) > 0) {
                                i4 = Integer.MIN_VALUE;
                                j = j4;
                            } else if (c17895Arr2 != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < c17895Arr2.length) {
                                        C17895 c17896 = c17895Arr2[i10];
                                        if (c17896 != null) {
                                            int i11 = c17896.f54641;
                                            int i12 = c17896.f54644;
                                            int i13 = c17896.f54645;
                                            int i14 = c17896.f54643;
                                            if (i14 != c17896.f54642 || ((i13 & 1) == i9 && (i11 >= 0 || i12 >= 0))) {
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
                            i5 = this.f52705;
                            if ((i5 & i4) != 0) {
                                break;
                            }
                            if (i9 != 0) {
                                return false;
                            }
                            if (this.f52701 != c17895Arr2) {
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
                        f52696.compareAndSwapInt(this, f52694, i3, i3 | i4);
                    }
                }
            } else {
                if (!z2 || this == f52695) {
                    return false;
                }
                f52696.compareAndSwapInt(this, f52694, i6, i6 | 262144);
            }
        }
    }

    public C17189() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int iAvailableProcessors = -1;
        InterfaceC7808 c10840 = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            iAvailableProcessors = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            InterfaceC7808 interfaceC7808 = (InterfaceC7808) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                uncaughtExceptionHandler = null;
            }
            c10840 = interfaceC7808;
        } catch (Exception unused2) {
            uncaughtExceptionHandler = null;
        }
        if (c10840 == null) {
            if (System.getSecurityManager() == null) {
                c10840 = f52693;
            } else {
                c10840 = new C10840();
            }
        }
        if (iAvailableProcessors < 0 && (iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            iAvailableProcessors = 1;
        }
        iAvailableProcessors = iAvailableProcessors > 32767 ? EnumC5983.f18409 : iAvailableProcessors;
        long j = -iAvailableProcessors;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - iAvailableProcessors) & 65535) | (f52690 << 16);
        int i2 = iAvailableProcessors > 1 ? iAvailableProcessors - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.f52703 = "FJPool.commonPool-worker-";
        this.f52701 = new C17895[((i6 | (i6 >>> 16)) + 1) << 1];
        this.f52706 = c10840;
        this.f52702 = uncaughtExceptionHandler;
        this.f52699 = 60000L;
        this.f52707 = i;
        this.f52705 = iAvailableProcessors;
        this.f52708 = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        RunnableFutureC14366 runnableFutureC14366 = new RunnableFutureC14366(callable);
        m40433(runnableFutureC14366);
        return runnableFutureC14366;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        RunnableFutureC23539 runnableFutureC23539 = new RunnableFutureC23539(runnable, obj);
        m40433(runnableFutureC23539);
        return runnableFutureC23539;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RunnableFutureC14366 runnableFutureC14366 = new RunnableFutureC14366((Callable) it.next());
                arrayList.add(runnableFutureC14366);
                m40433(runnableFutureC14366);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractFutureC8723) arrayList.get(i)).m22556();
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
        long j2 = this.f52704;
        C17895[] c17895Arr = this.f52701;
        long j3 = 0;
        if (c17895Arr != null) {
            j = 0;
            i = 0;
            for (int i2 = 0; i2 < c17895Arr.length; i2++) {
                C17895 c17895 = c17895Arr[i2];
                if (c17895 != null) {
                    int i3 = c17895.f54643 - c17895.f54642;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j += (long) i4;
                    } else {
                        j3 += (long) i4;
                        j2 += ((long) c17895.f54647) & 4294967295L;
                        C3784 c3784 = c17895.f54646;
                        if (c3784 != null && (state = c3784.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
            j = 0;
        }
        int i5 = this.f52705;
        int i6 = 65535 & i5;
        long j4 = this.f52708;
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
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, super.toString(), "[", str, ", parallelism = ");
        C5834.m16344(sb, i6, ", size = ", i7, ", active = ");
        C5834.m16344(sb, i9, ", running = ", i, ", steals = ");
        sb.append(j2);
        sb.append(", tasks = ");
        sb.append(j3);
        sb.append(", submissions = ");
        return C15942.m37718(sb, j, "]");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f52705 & 524288) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f52705 & 262144) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this != f52695) {
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
            if (threadCurrentThread instanceof C3784) {
                C3784 c3784 = (C3784) threadCurrentThread;
                if (c3784.f11955 == this) {
                    m40440(c3784.f11956);
                    return false;
                }
            }
            long jNanoTime2 = System.nanoTime();
            while (true) {
                AbstractFutureC8723 abstractFutureC8723M40434 = m40434();
                if (abstractFutureC8723M40434 != null) {
                    abstractFutureC8723M40434.m22555();
                } else {
                    while (true) {
                        long j2 = this.f52708;
                        int i = this.f52705;
                        int i2 = 65535 & i;
                        int i3 = ((short) (j2 >>> 32)) + i2;
                        int i4 = i2 + ((int) (j2 >> 48));
                        if ((i & (-2146959360)) == 0) {
                            if (i4 <= 0) {
                                C17895[] c17895Arr = this.f52701;
                                if (c17895Arr != null) {
                                    int i5 = 1;
                                    while (true) {
                                        if (i5 < c17895Arr.length) {
                                            C17895 c17895 = c17895Arr[i5];
                                            if (c17895 != null) {
                                                if ((c17895.f54641 & 1073741824) != 0) {
                                                    i3--;
                                                }
                                            }
                                            i5 += 2;
                                        }
                                    }
                                }
                                if (i3 != 0 || this.f52708 != j2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40430(C19098 c19098) {
        C3784 c3784;
        C17189 c17189;
        C17895 c17895;
        long j = c19098.f60138;
        long j2 = f52691;
        Thread threadCurrentThread = Thread.currentThread();
        long j3 = 0;
        if ((threadCurrentThread instanceof C3784) && (c17189 = (c3784 = (C3784) threadCurrentThread).f11955) != null && (c17895 = c3784.f11956) != null) {
            while (!c19098.m43985()) {
                int iM40435 = c17189.m40435(c17895);
                if (iM40435 != 0) {
                    try {
                        if (!c19098.m43985()) {
                            while (!c19098.m43985()) {
                                if (j == 0) {
                                    LockSupport.park(c19098);
                                } else {
                                    LockSupport.parkNanos(c19098, c19098.f60141);
                                }
                            }
                        }
                        return;
                    } finally {
                        m40428(c17189, j2, iM40435 > 0 ? 281474976710656L : 0L);
                    }
                }
            }
            return;
        }
        if (c19098.m43985()) {
            return;
        }
        while (!c19098.m43985()) {
            if (j == 0) {
                LockSupport.park(c19098);
            } else {
                LockSupport.parkNanos(c19098, c19098.f60141);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40429(Executor executor, C19098 c19098) {
        int iM14963;
        C17895 c17895;
        C17895[] c17895Arr;
        int length;
        int i;
        int length2;
        if (!(executor instanceof C17189)) {
            return;
        }
        C17189 c17189 = (C17189) executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C3784) {
            C3784 c3784 = (C3784) threadCurrentThread;
            if (c3784.f11955 == c17189) {
                c17895 = c3784.f11956;
            } else {
                iM14963 = C5195.m14963();
                if (iM14963 != 0 || (c17895Arr = c17189.f52701) == null || (length = c17895Arr.length) <= 0) {
                    c17895 = null;
                } else {
                    c17895 = c17895Arr[iM14963 & (length - 1) & 126];
                }
            }
        } else {
            iM14963 = C5195.m14963();
            if (iM14963 != 0) {
                c17895 = null;
            } else {
                c17895 = null;
            }
        }
        if (c17895 == null) {
            return;
        }
        while (true) {
            int i2 = c17895.f54643;
            int i3 = c17895.f54642;
            AbstractFutureC8723[] abstractFutureC8723Arr = c17895.f54640;
            if (abstractFutureC8723Arr == null || (i = i2 - i3) >= 0 || (length2 = abstractFutureC8723Arr.length) <= 0) {
                return;
            }
            long j = (((long) ((length2 - 1) & i2)) << f52692) + ((long) f52697);
            Unsafe unsafe = f52696;
            AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j);
            if (c19098.m43985()) {
                return;
            }
            int i4 = i2 + 1;
            if (i2 == c17895.f54643) {
                if (abstractFutureC8723 == null) {
                    if (i == -1) {
                        return;
                    }
                } else {
                    if (!(abstractFutureC8723 instanceof InterfaceC9926)) {
                        return;
                    }
                    if (C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC8723)) {
                        c17895.f54643 = i4;
                        abstractFutureC8723.m22555();
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC23539(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC14366(callable);
    }

    static {
        Unsafe unsafe = C0961.f3616;
        f52696 = unsafe;
        try {
            f52691 = unsafe.objectFieldOffset(C17189.class.getDeclaredField("᩹"));
            f52694 = unsafe.objectFieldOffset(C17189.class.getDeclaredField("۬"));
            f52697 = unsafe.arrayBaseOffset(AbstractFutureC8723[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC8723[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f52692 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            f52690 = i;
            f52693 = new C14157();
            f52698 = new RuntimePermission("modifyThread");
            C17189 c17189 = (C17189) AccessController.doPrivileged(new C12042());
            f52695 = c17189;
            f52689 = Math.max(c17189.f52705 & 65535, 1);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
