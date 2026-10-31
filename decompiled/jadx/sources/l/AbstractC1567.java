package l;

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
public abstract class AbstractC1567 extends AbstractC12815 {

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final String f5533 = InterfaceC17089.class.getName();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC17089 f5535;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f5537;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public RunnableC22693 f5546;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f5548;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11405 f5550;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final ObjectName f5552;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f5555;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public volatile int f5541 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f5561 = true;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public volatile C2828 f5559 = C0155.f1317;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f5551 = true;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f5556 = false;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f5557 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile C2828 f5562 = C0155.f1321;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public volatile int f5543 = 3;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public volatile C2828 f5544 = C0155.f1319;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public volatile C2828 f5538 = C0155.f1324;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public volatile C2828 f5553 = C0155.f1318;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f5539 = new Object();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final Object f5542 = new Object();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5558 = new AtomicLong();

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5536 = new AtomicLong();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5549 = new AtomicLong();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5547 = new AtomicLong();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5540 = new AtomicLong();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f5545 = new AtomicLong();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7171 f5560 = new C7171();

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C7171 f5554 = new C7171();

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C7171 f5534 = new C7171();

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f5563 = new AtomicReference(C2828.ZERO);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo5364();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo5376();

    public AbstractC1567(C6127 c6127, String str) {
        if (c6127.m1268()) {
            this.f5552 = m5362(c6127, str);
        } else {
            this.f5552 = null;
        }
        Exception exc = new Exception();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        this.f5548 = stringWriter.toString();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            this.f5555 = null;
        } else {
            this.f5555 = new WeakReference(contextClassLoader);
        }
    }

    static {
        C2828.ofSeconds(2147483647L);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m5377() {
        return this.f5561;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17089 m5374() {
        return this.f5535;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m5372() {
        return this.f5551;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m5369() {
        return this.f5541;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2828 m5371() {
        return this.f5559;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C2828 m5378() {
        return this.f5544;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m5363() {
        return this.f5543;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2828 m5375() {
        return this.f5538;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m5380() {
        return this.f5556;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m5379() {
        return this.f5557;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ObjectName m5362(C6127 c6127, String str) {
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

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m5370() {
        if (this.f5552 != null) {
            try {
                ManagementFactory.getPlatformMBeanServer().unregisterMBean(this.f5552);
            } catch (MBeanRegistrationException | InstanceNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5367(C6127 c6127) {
        this.f5551 = true;
        this.f5559 = C12856.m31292(c6127.m1264(), C0155.f1317);
        this.f5561 = true;
        this.f5556 = c6127.m1269();
        this.f5557 = c6127.m1276();
        this.f5543 = 3;
        this.f5544 = C12856.m31292(c6127.m1274(), C0155.f1319);
        this.f5562 = C12856.m31292(c6127.m1258(), C0155.f1321);
        m5366(this.f5562);
        this.f5538 = C12856.m31292(c6127.m1257(), C0155.f1324);
        String strM1270 = c6127.m1270();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        String str = f5533;
        ClassLoader classLoader = InterfaceC17089.class.getClassLoader();
        try {
            try {
                try {
                    this.f5535 = (InterfaceC17089) Class.forName(strM1270, true, contextClassLoader).getConstructor(null).newInstance(null);
                } catch (ClassCastException | ClassNotFoundException unused) {
                    this.f5535 = (InterfaceC17089) Class.forName(strM1270, true, classLoader).getConstructor(null).newInstance(null);
                }
                this.f5553 = C12856.m31292(c6127.m1273(), C0155.f1318);
            } catch (ClassCastException unused2) {
                throw new IllegalArgumentException("Class " + strM1270 + " from class loaders [" + contextClassLoader + ", " + classLoader + "] do not implement " + str);
            } catch (ClassNotFoundException e) {
                e = e;
                throw new IllegalArgumentException(C19462.m44858("Unable to create ", str, " instance of type ", strM1270), e);
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new IllegalArgumentException(C19462.m44858("Unable to create ", str, " instance of type ", strM1270), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new IllegalArgumentException(C19462.m44858("Unable to create ", str, " instance of type ", strM1270), e);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new IllegalArgumentException(C19462.m44858("Unable to create ", str, " instance of type ", strM1270), e);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new IllegalArgumentException(C19462.m44858("Unable to create ", str, " instance of type ", strM1270), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5365(int i) {
        this.f5541 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5366(C2828 c2828) {
        synchronized (this.f5542) {
            boolean zM31293 = C12856.m31293(c2828);
            RunnableC22693 runnableC22693 = this.f5546;
            if (runnableC22693 == null) {
                if (zM31293) {
                    RunnableC22693 runnableC22694 = new RunnableC22693(this);
                    this.f5546 = runnableC22694;
                    C9329.m24011(runnableC22694, c2828, c2828);
                }
            } else if (zM31293) {
                synchronized (C9329.class) {
                    C9329.m24012(this.f5546, this.f5553, true);
                    this.f5550 = null;
                    RunnableC22693 runnableC22695 = new RunnableC22693(this);
                    this.f5546 = runnableC22695;
                    C9329.m24011(runnableC22695, c2828, c2828);
                }
            } else {
                C9329.m24012(runnableC22693, this.f5553, false);
            }
        }
    }

    @Override // l.AbstractC12815
    /* JADX INFO: renamed from: ֫ */
    public void mo1260(StringBuilder sb) {
        sb.append("maxTotal=");
        sb.append(this.f5541);
        sb.append(", blockWhenExhausted=");
        sb.append(this.f5561);
        sb.append(", maxWaitDuration=");
        sb.append(this.f5559);
        sb.append(", lifo=");
        sb.append(this.f5551);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f5556);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f5557);
        sb.append(", durationBetweenEvictionRuns=");
        sb.append(this.f5562);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(this.f5543);
        sb.append(", minEvictableIdleTimeDuration=");
        sb.append(this.f5544);
        sb.append(", softMinEvictableIdleTimeDuration=");
        sb.append(this.f5538);
        sb.append(", evictionPolicy=");
        sb.append(this.f5535);
        sb.append(", closeLock=");
        sb.append(this.f5539);
        sb.append(", closed=");
        sb.append(this.f5537);
        sb.append(", evictionLock=");
        sb.append(this.f5542);
        sb.append(", evictor=");
        sb.append(this.f5546);
        sb.append(", evictionIterator=");
        sb.append(this.f5550);
        sb.append(", factoryClassLoader=");
        sb.append(this.f5555);
        sb.append(", oname=");
        sb.append(this.f5552);
        sb.append(", creationStackTrace=");
        sb.append(this.f5548);
        sb.append(", borrowedCount=");
        sb.append(this.f5558);
        sb.append(", returnedCount=");
        sb.append(this.f5536);
        sb.append(", createdCount=");
        sb.append(this.f5549);
        sb.append(", destroyedCount=");
        sb.append(this.f5547);
        sb.append(", destroyedByEvictorCount=");
        sb.append(this.f5540);
        sb.append(", destroyedByBorrowValidationCount=");
        sb.append(this.f5545);
        sb.append(", activeTimes=");
        sb.append(this.f5560);
        sb.append(", idleTimes=");
        sb.append(this.f5554);
        sb.append(", waitTimes=");
        sb.append(this.f5534);
        sb.append(", maxBorrowWaitDuration=");
        sb.append(this.f5563);
        sb.append(", swallowedExceptionListener=");
        sb.append((Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5368(InterfaceC9994 interfaceC9994, C2828 c2828) {
        this.f5558.incrementAndGet();
        this.f5554.m19195(interfaceC9994.mo25157());
        this.f5534.m19195(c2828);
        while (true) {
            AtomicReference atomicReference = this.f5563;
            C2828 c2829 = (C2828) atomicReference.get();
            if (c2829.compareTo(c2828) >= 0) {
                return;
            }
            while (!atomicReference.compareAndSet(c2829, c2828)) {
                if (atomicReference.get() != c2829) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5373(C2828 c2828) {
        this.f5536.incrementAndGet();
        this.f5560.m19195(c2828);
    }
}
