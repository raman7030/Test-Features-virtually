package p067l;

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
public abstract class AbstractC4813 extends AbstractC24258 implements InterfaceFutureC5483 {

    /* JADX INFO: renamed from: ۗ */
    public static final boolean f10914;

    /* JADX INFO: renamed from: ۙ */
    public static final AbstractC16211 f10915;

    /* JADX INFO: renamed from: ᩶ */
    public volatile C17552 f10918;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C12860 f10919;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f10920;

    /* JADX INFO: renamed from: ۬ */
    public static final Object f10917 = new Object();

    /* JADX INFO: renamed from: ۫ */
    public static final C6824 f10916 = new C6824(AbstractC18894.class);

    @Override // java.util.concurrent.Future
    public Object get() {
        return m10163();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10162(C12860 c12860, C12860 c12861) {
        return f10915.mo20400(this, c12860, c12861);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return m10160(j, timeUnit);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12860 m10161(C12860 c12860) {
        return f10915.mo20395(this, c12860);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m10159(AbstractC4813 abstractC4813, Object obj, Object obj2) {
        return f10915.mo20399(abstractC4813, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m10160(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C17552 c17552 = C17552.f52459;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10920;
        if ((obj != null) && (!(obj instanceof RunnableC15799))) {
            return AbstractC18894.m42992(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C17552 c17553 = this.f10918;
            if (c17553 != c17552) {
                C17552 c17554 = new C17552();
                while (true) {
                    m10158(c17554, c17553);
                    if (f10915.mo20401(this, c17553, c17554)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m10156(c17554);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10920;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC15799))) {
                                return AbstractC18894.m42992(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10156(c17554);
                        break;
                    }
                    c17553 = this.f10918;
                    if (c17553 == c17552) {
                    }
                }
            }
            Object obj3 = this.f10920;
            C12826.requireNonNull(obj3);
            return AbstractC18894.m42992(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f10920;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC15799))) {
                return AbstractC18894.m42992(obj4);
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
        StringBuilder sbM33191 = C14536.m33191("Waited ", " ", j);
        sbM33191.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM33191.toString();
        if (nanos + 1000 < 0) {
            String strM40053 = C17588.m40053(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM40054 = strM40053 + jConvert + " " + lowerCase;
                if (z) {
                    strM40054 = C17588.m40053(strM40054, ",");
                }
                strM40053 = C17588.m40053(strM40054, " ");
            }
            if (z) {
                strM40053 = strM40053 + nanos2 + " nanoseconds ";
            }
            string3 = C17588.m40053(strM40053, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C17588.m40053(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C24104.m53357(string3, " for ", string));
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m10163() throws InterruptedException {
        Object obj;
        C17552 c17552 = C17552.f52459;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f10920;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC15799))) {
            return AbstractC18894.m42992(obj2);
        }
        C17552 c17553 = this.f10918;
        if (c17553 != c17552) {
            C17552 c17554 = new C17552();
            do {
                m10158(c17554, c17553);
                if (!f10915.mo20401(this, c17553, c17554)) {
                    c17553 = this.f10918;
                } else {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m10156(c17554);
                            throw new InterruptedException();
                        }
                        obj = this.f10920;
                    } while (!((obj != null) & (!(obj instanceof RunnableC15799))));
                    return AbstractC18894.m42992(obj);
                }
            } while (c17553 != c17552);
        }
        Object obj3 = this.f10920;
        C12826.requireNonNull(obj3);
        return AbstractC18894.m42992(obj3);
    }

    static {
        boolean z;
        AbstractC16211 c8836;
        Throwable th;
        AbstractC16211 c10848;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f10914 = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable e = null;
        if (property == null || property.contains(AnalyticsConstants.SDK_TYPE)) {
            try {
                c10848 = new C10848();
            } catch (Error | Exception e2) {
                try {
                    c8836 = new C24929();
                } catch (Error | Exception e3) {
                    e = e3;
                    c8836 = new C8836();
                }
                AbstractC16211 abstractC16211 = c8836;
                th = e2;
                c10848 = abstractC16211;
            }
        } else {
            try {
                c10848 = new C24929();
            } catch (NoClassDefFoundError unused2) {
                c10848 = new C8836();
            }
        }
        th = null;
        f10915 = c10848;
        if (e != null) {
            C6824 c6824 = f10916;
            Logger loggerM15619 = c6824.m15619();
            Level level = Level.SEVERE;
            loggerM15619.log(level, "UnsafeAtomicHelper is broken!", th);
            c6824.m15619().log(level, "AtomicReferenceFieldUpdaterAtomicHelper is broken!", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10157(C17552 c17552, Thread thread) {
        f10915.mo20397(c17552, thread);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m10158(C17552 c17552, C17552 c17553) {
        f10915.mo20398(c17552, c17553);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m10164() {
        for (C17552 c17552Mo20396 = f10915.mo20396(this); c17552Mo20396 != null; c17552Mo20396 = c17552Mo20396.f52460) {
            Thread thread = c17552Mo20396.f52461;
            if (thread != null) {
                c17552Mo20396.f52461 = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10156(C17552 c17552) {
        c17552.f52461 = null;
        while (true) {
            C17552 c17553 = this.f10918;
            if (c17553 == C17552.f52459) {
                return;
            }
            C17552 c17554 = null;
            while (c17553 != null) {
                C17552 c17555 = c17553.f52460;
                if (c17553.f52461 != null) {
                    c17554 = c17553;
                } else if (c17554 == null) {
                    if (!f10915.mo20401(this, c17553, c17555)) {
                    }
                } else {
                    c17554.f52460 = c17555;
                    if (c17554.f52461 == null) {
                    }
                }
                c17553 = c17555;
            }
            return;
        }
    }
}
