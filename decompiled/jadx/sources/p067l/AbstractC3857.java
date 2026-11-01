package p067l;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

/* JADX INFO: renamed from: l.֫ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UAIG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3857 extends AbstractC14547 {

    /* JADX INFO: renamed from: ۚ֫ */
    public static final String f8314 = InterfaceC18609.class.getName();

    /* JADX INFO: renamed from: ֫֫ */
    public volatile InterfaceC18609 f8316;

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f8318;

    /* JADX INFO: renamed from: ۧ֫ */
    public RunnableC23935 f8327;

    /* JADX INFO: renamed from: ۫ */
    public final String f8329;

    /* JADX INFO: renamed from: ܰ */
    public C13207 f8331;

    /* JADX INFO: renamed from: ܺ֫ */
    public final ObjectName f8333;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final WeakReference f8336;

    /* JADX INFO: renamed from: ۜ֫ */
    public volatile int f8322 = -1;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f8342 = true;

    /* JADX INFO: renamed from: ᩷֫ */
    public volatile C5057 f8340 = C2515.f4092;

    /* JADX INFO: renamed from: ܳ֫ */
    public volatile boolean f8332 = true;

    /* JADX INFO: renamed from: ᩴ֫ */
    public volatile boolean f8337 = false;

    /* JADX INFO: renamed from: ᩵֫ */
    public volatile boolean f8338 = false;

    /* JADX INFO: renamed from: ᩺ */
    public volatile C5057 f8343 = C2515.f4096;

    /* JADX INFO: renamed from: ۡ֫ */
    public volatile int f8324 = 3;

    /* JADX INFO: renamed from: ۢ֫ */
    public volatile C5057 f8325 = C2515.f4094;

    /* JADX INFO: renamed from: ۘ֫ */
    public volatile C5057 f8319 = C2515.f4099;

    /* JADX INFO: renamed from: ܽ֫ */
    public volatile C5057 f8334 = C2515.f4093;

    /* JADX INFO: renamed from: ۙ */
    public final Object f8320 = new Object();

    /* JADX INFO: renamed from: ۟ */
    public final Object f8323 = new Object();

    /* JADX INFO: renamed from: ᩶ */
    public final AtomicLong f8339 = new AtomicLong();

    /* JADX INFO: renamed from: ۖ֫ */
    public final AtomicLong f8317 = new AtomicLong();

    /* JADX INFO: renamed from: ۬ */
    public final AtomicLong f8330 = new AtomicLong();

    /* JADX INFO: renamed from: ۨ */
    public final AtomicLong f8328 = new AtomicLong();

    /* JADX INFO: renamed from: ۛ */
    public final AtomicLong f8321 = new AtomicLong();

    /* JADX INFO: renamed from: ۤ */
    public final AtomicLong f8326 = new AtomicLong();

    /* JADX INFO: renamed from: ᩸ */
    public final C9183 f8341 = new C9183();

    /* JADX INFO: renamed from: ܿ֫ */
    public final C9183 f8335 = new C9183();

    /* JADX INFO: renamed from: ֡֫ */
    public final C9183 f8315 = new C9183();

    /* JADX INFO: renamed from: ᩻֫ */
    public final AtomicReference f8344 = new AtomicReference(C5057.ZERO);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7593();

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo7605();

    public AbstractC3857(C8192 c8192, String str) {
        if (c8192.m3676()) {
            this.f8333 = m7591(c8192, str);
        } else {
            this.f8333 = null;
        }
        Exception exc = new Exception();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this.f8329 = stringWriter.toString();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            this.f8336 = null;
        } else {
            this.f8336 = new WeakReference(contextClassLoader);
        }
    }

    static {
        C5057.ofSeconds(2147483647L);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m7606() {
        return this.f8342;
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC18609 m7603() {
        return this.f8316;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m7601() {
        return this.f8332;
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m7598() {
        return this.f8322;
    }

    /* JADX INFO: renamed from: ۘ */
    public final C5057 m7600() {
        return this.f8340;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final C5057 m7607() {
        return this.f8325;
    }

    /* JADX INFO: renamed from: ֡ */
    public final int m7592() {
        return this.f8324;
    }

    /* JADX INFO: renamed from: ܶ */
    public final C5057 m7604() {
        return this.f8319;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final boolean m7609() {
        return this.f8337;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final boolean m7608() {
        return this.f8338;
    }

    /* JADX INFO: renamed from: ֫ */
    private ObjectName m7591(C8192 c8192, String str) {
        ObjectName objectName;
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName2 = null;
        boolean z = false;
        int i = 1;
        while (!z) {
            if (i == 1) {
                try {
                    objectName = new ObjectName("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=" + str);
                } catch (MBeanRegistrationException | NotCompliantMBeanException unused) {
                } catch (MalformedObjectNameException unused2) {
                    if (!"pool".equals(str) || !"org.apache.commons.pool2:type=GenericKeyedObjectPool,name=".equals("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=")) {
                        str = "pool";
                    }
                } catch (InstanceAlreadyExistsException unused3) {
                    i++;
                }
            } else {
                objectName = new ObjectName("org.apache.commons.pool2:type=GenericKeyedObjectPool,name=" + str + i);
            }
            platformMBeanServer.registerMBean(this, objectName);
            objectName2 = objectName;
            z = true;
        }
        return objectName2;
    }

    /* JADX INFO: renamed from: ۗ */
    public final void m7599() {
        if (this.f8333 != null) {
            try {
                ManagementFactory.getPlatformMBeanServer().unregisterMBean(this.f8333);
            } catch (MBeanRegistrationException | InstanceNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7596(C8192 c8192) {
        this.f8332 = true;
        this.f8340 = C14586.m33378(c8192.m3672(), C2515.f4092);
        this.f8342 = true;
        this.f8337 = c8192.m3677();
        this.f8338 = c8192.m3684();
        this.f8324 = 3;
        this.f8325 = C14586.m33378(c8192.m3682(), C2515.f4094);
        this.f8343 = C14586.m33378(c8192.m3666(), C2515.f4096);
        m7595(this.f8343);
        this.f8319 = C14586.m33378(c8192.m3665(), C2515.f4099);
        String strM3678 = c8192.m3678();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String str = f8314;
        ClassLoader classLoader = InterfaceC18609.class.getClassLoader();
        try {
            try {
                try {
                    this.f8316 = (InterfaceC18609) Class.forName(strM3678, true, contextClassLoader).getConstructor(null).newInstance(null);
                } catch (ClassCastException | ClassNotFoundException unused) {
                    this.f8316 = (InterfaceC18609) Class.forName(strM3678, true, classLoader).getConstructor(null).newInstance(null);
                }
                this.f8334 = C14586.m33378(c8192.m3681(), C2515.f4093);
            } catch (ClassCastException unused2) {
                throw new IllegalArgumentException("Class " + strM3678 + " from class loaders [" + contextClassLoader + ", " + classLoader + "] do not implement " + str);
            } catch (ClassNotFoundException e) {
                e = e;
                throw new IllegalArgumentException(C20865.m47154("Unable to create ", str, " instance of type ", strM3678), e);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new IllegalArgumentException(C20865.m47154("Unable to create ", str, " instance of type ", strM3678), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new IllegalArgumentException(C20865.m47154("Unable to create ", str, " instance of type ", strM3678), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new IllegalArgumentException(C20865.m47154("Unable to create ", str, " instance of type ", strM3678), e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new IllegalArgumentException(C20865.m47154("Unable to create ", str, " instance of type ", strM3678), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7594(int i) {
        this.f8322 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7595(C5057 c5057) {
        synchronized (this.f8323) {
            boolean zM33379 = C14586.m33379(c5057);
            RunnableC23935 runnableC23935 = this.f8327;
            if (runnableC23935 == null) {
                if (zM33379) {
                    RunnableC23935 runnableC23936 = new RunnableC23935(this);
                    this.f8327 = runnableC23936;
                    C11234.m26020(runnableC23936, c5057, c5057);
                }
            } else if (zM33379) {
                synchronized (C11234.class) {
                    C11234.m26021(this.f8327, this.f8334, true);
                    this.f8331 = null;
                    RunnableC23935 runnableC23937 = new RunnableC23935(this);
                    this.f8327 = runnableC23937;
                    C11234.m26020(runnableC23937, c5057, c5057);
                }
            } else {
                C11234.m26021(runnableC23935, this.f8334, false);
            }
        }
    }

    @Override // p067l.AbstractC14547
    /* JADX INFO: renamed from: ֫ */
    public void mo3668(StringBuilder sb) {
        sb.append("maxTotal=");
        sb.append(this.f8322);
        sb.append(", blockWhenExhausted=");
        sb.append(this.f8342);
        sb.append(", maxWaitDuration=");
        sb.append(this.f8340);
        sb.append(", lifo=");
        sb.append(this.f8332);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f8337);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f8338);
        sb.append(", durationBetweenEvictionRuns=");
        sb.append(this.f8343);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(this.f8324);
        sb.append(", minEvictableIdleTimeDuration=");
        sb.append(this.f8325);
        sb.append(", softMinEvictableIdleTimeDuration=");
        sb.append(this.f8319);
        sb.append(", evictionPolicy=");
        sb.append(this.f8316);
        sb.append(", closeLock=");
        sb.append(this.f8320);
        sb.append(", closed=");
        sb.append(this.f8318);
        sb.append(", evictionLock=");
        sb.append(this.f8323);
        sb.append(", evictor=");
        sb.append(this.f8327);
        sb.append(", evictionIterator=");
        sb.append(this.f8331);
        sb.append(", factoryClassLoader=");
        sb.append(this.f8336);
        sb.append(", oname=");
        sb.append(this.f8333);
        sb.append(", creationStackTrace=");
        sb.append(this.f8329);
        sb.append(", borrowedCount=");
        sb.append(this.f8339);
        sb.append(", returnedCount=");
        sb.append(this.f8317);
        sb.append(", createdCount=");
        sb.append(this.f8330);
        sb.append(", destroyedCount=");
        sb.append(this.f8328);
        sb.append(", destroyedByEvictorCount=");
        sb.append(this.f8321);
        sb.append(", destroyedByBorrowValidationCount=");
        sb.append(this.f8326);
        sb.append(", activeTimes=");
        sb.append(this.f8341);
        sb.append(", idleTimes=");
        sb.append(this.f8335);
        sb.append(", waitTimes=");
        sb.append(this.f8315);
        sb.append(", maxBorrowWaitDuration=");
        sb.append(this.f8344);
        sb.append(", swallowedExceptionListener=");
        sb.append((Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7597(InterfaceC11866 interfaceC11866, C5057 c5057) {
        this.f8339.incrementAndGet();
        this.f8335.m21142(interfaceC11866.mo27174());
        this.f8315.m21142(c5057);
        while (true) {
            AtomicReference atomicReference = this.f8344;
            C5057 c5058 = (C5057) atomicReference.get();
            if (c5058.compareTo(c5057) >= 0) {
                return;
            }
            while (!atomicReference.compareAndSet(c5058, c5057)) {
                if (atomicReference.get() != c5058) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7602(C5057 c5057) {
        this.f8317.incrementAndGet();
        this.f8341.m21142(c5057);
    }
}
