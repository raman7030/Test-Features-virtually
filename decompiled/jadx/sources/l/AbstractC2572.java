package l;

import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۖܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2572 extends AbstractC23032 implements InterfaceFutureC3277 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final boolean f8124;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14565 f8125;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C15976 f8128;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C11039 f8129;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f8130;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f8127 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C4688 f8126 = new C4688(AbstractC17388.class);

    @Override // java.util.concurrent.Future
    public Object get() {
        return m8130();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8129(C11039 c11039, C11039 c110310) {
        return f8125.mo18451(this, c11039, c110310);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return m8127(j, timeUnit);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11039 m8128(C11039 c11039) {
        return f8125.mo18446(this, c11039);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m8126(AbstractC2572 abstractC2572, Object obj, Object obj2) {
        return f8125.mo18450(abstractC2572, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m8127(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C15976 c15976 = C15976.f49301;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8130;
        if ((obj != null) && (!(obj instanceof RunnableC14131))) {
            return AbstractC17388.m40739(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C15976 c15977 = this.f8128;
            if (c15977 != c15976) {
                C15976 c15978 = new C15976();
                while (true) {
                    m8125(c15978, c15977);
                    if (f8125.mo18452(this, c15977, c15978)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m8123(c15978);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8130;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC14131))) {
                                return AbstractC17388.m40739(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m8123(c15978);
                        break;
                    }
                    c15977 = this.f8128;
                    if (c15977 == c15976) {
                    }
                }
            }
            Object obj3 = this.f8130;
            C11003.requireNonNull(obj3);
            return AbstractC17388.m40739(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f8130;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC14131))) {
                return AbstractC17388.m40739(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM31106 = C12803.m31106("Waited ", " ", j);
        sbM31106.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM31106.toString();
        if (nanos + 1000 < 0) {
            String strM37867 = C16014.m37867(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM37868 = strM37867 + jConvert + " " + lowerCase;
                if (z) {
                    strM37868 = C16014.m37867(strM37868, ",");
                }
                strM37867 = C16014.m37867(strM37868, " ");
            }
            if (z) {
                strM37867 = strM37867 + nanos2 + " nanoseconds ";
            }
            string3 = C16014.m37867(strM37867, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C16014.m37867(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C22870.m50967(string3, " for ", string));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m8130() throws InterruptedException {
        Object obj;
        C15976 c15976 = C15976.f49301;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f8130;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC14131))) {
            return AbstractC17388.m40739(obj2);
        }
        C15976 c15977 = this.f8128;
        if (c15977 != c15976) {
            C15976 c15978 = new C15976();
            do {
                m8125(c15978, c15977);
                if (!f8125.mo18452(this, c15977, c15978)) {
                    c15977 = this.f8128;
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m8123(c15978);
                            throw new InterruptedException();
                        }
                        obj = this.f8130;
                    } while (!((obj != null) & (!(obj instanceof RunnableC14131))));
                    return AbstractC17388.m40739(obj);
                }
            } while (c15977 != c15976);
        }
        Object obj3 = this.f8130;
        C11003.requireNonNull(obj3);
        return AbstractC17388.m40739(obj3);
    }

    static {
        boolean z;
        AbstractC14565 c6805;
        Throwable th;
        AbstractC14565 c8922;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f8124 = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains(AnalyticsConstants.SDK_TYPE)) {
            try {
                c8922 = new C8922();
            } catch (Error | Exception e2) {
                try {
                    c6805 = new C23738();
                } catch (Error | Exception e3) {
                    e = e3;
                    c6805 = new C6805();
                }
                AbstractC14565 abstractC14565 = c6805;
                th = e2;
                c8922 = abstractC14565;
            }
        } else {
            try {
                c8922 = new C23738();
            } catch (NoClassDefFoundError unused2) {
                c8922 = new C6805();
            }
        }
        th = null;
        f8125 = c8922;
        if (e != null) {
            C4688 c4688 = f8126;
            Logger loggerM13744 = c4688.m13744();
            Level level = Level.SEVERE;
            loggerM13744.log(level, "UnsafeAtomicHelper is broken!", th);
            c4688.m13744().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8124(C15976 c15976, Thread thread) {
        f8125.mo18448(c15976, thread);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8125(C15976 c15976, C15976 c15977) {
        f8125.mo18449(c15976, c15977);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8131() {
        for (C15976 c15976Mo18447 = f8125.mo18447(this); c15976Mo18447 != null; c15976Mo18447 = c15976Mo18447.f49302) {
            Thread thread = c15976Mo18447.f49303;
            if (thread != null) {
                c15976Mo18447.f49303 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8123(C15976 c15976) {
        c15976.f49303 = null;
        while (true) {
            C15976 c15977 = this.f8128;
            if (c15977 == C15976.f49301) {
                return;
            }
            C15976 c15978 = null;
            while (c15977 != null) {
                C15976 c15979 = c15977.f49302;
                if (c15977.f49303 != null) {
                    c15978 = c15977;
                } else if (c15978 == null) {
                    if (!f8125.mo18452(this, c15977, c15979)) {
                    }
                } else {
                    c15978.f49302 = c15979;
                    if (c15978.f49303 == null) {
                    }
                }
                c15977 = c15979;
            }
            return;
        }
    }
}
