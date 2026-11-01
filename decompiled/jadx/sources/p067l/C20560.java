package p067l;

import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.᩵֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9W1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20560 implements InterfaceC24128 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final InterfaceC4410 f63556 = C13128.m30022(C20560.class);

    /* JADX INFO: renamed from: ۟ */
    public static AtomicLong f63557 = new AtomicLong();

    /* JADX INFO: renamed from: ۗ */
    public final String f63558;

    /* JADX INFO: renamed from: ۤ */
    public final String f63561;

    /* JADX INFO: renamed from: ۨ */
    public volatile long f63562;

    /* JADX INFO: renamed from: ۬ */
    public final C24582 f63564;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f63566;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f63568;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC17245 f63569;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicInteger f63567 = new AtomicInteger();

    /* JADX INFO: renamed from: ۛ */
    public volatile int f63560 = -1;

    /* JADX INFO: renamed from: ۙ */
    public volatile String f63559 = "?????";

    /* JADX INFO: renamed from: ܰ */
    public final AtomicLong f63565 = new AtomicLong(0);

    /* JADX INFO: renamed from: ۫ */
    public final AtomicBoolean f63563 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC24128 m46499() {
        if (C20560.class.isAssignableFrom(C20560.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C20560(C24582 c24582, String str) {
        c24582.m54197();
        this.f63564 = c24582;
        this.f63561 = str.toUpperCase();
        this.f63558 = this.f63559;
        c24582.m54206().getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46494(String str, String str2) {
        if (this.f63561.equalsIgnoreCase(str)) {
            return str2 == null || str2.startsWith("??") || this.f63559.equalsIgnoreCase(str2);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20560)) {
            return false;
        }
        C20560 c20560 = (C20560) obj;
        return m46494(c20560.f63561, c20560.f63559);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46492() {
        long jIncrementAndGet = this.f63565.incrementAndGet();
        InterfaceC4410 interfaceC4410 = f63556;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Acquire tree " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f63563.compareAndSet(false, true)) {
                    interfaceC4410.mo9183("Reacquire session");
                    this.f63564.m54197();
                }
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m46488();
    }

    /* JADX INFO: renamed from: ֡ */
    public final void m46488() {
        long jDecrementAndGet = this.f63565.decrementAndGet();
        InterfaceC4410 interfaceC4410 = f63556;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Release tree " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet == 0) {
            synchronized (this) {
                interfaceC4410.mo9183("Usage dropped to zero, release session");
                if (this.f63563.compareAndSet(true, false)) {
                    this.f63564.m54210();
                }
            }
            return;
        }
        if (jDecrementAndGet >= 0) {
            return;
        }
        interfaceC4410.mo9175("Usage count dropped below zero " + this);
        throw new C14740("Usage count dropped below zero");
    }

    public final void finalize() {
        if (!m46496() || this.f63565.get() == 0) {
            return;
        }
        f63556.mo9199("Tree was not properly released");
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m46496() {
        return this.f63560 != -1 && this.f63564.m54208() && this.f63567.get() == 2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m46498() {
        String str = this.f63559;
        if ("LPT1:".equals(str)) {
            return 32;
        }
        return "COMM".equals(str) ? 64 : 8;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m46502() {
        return this.f63561;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m46504() {
        this.f63566 = true;
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m46497() {
        return this.f63566;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46493(InterfaceC17245 interfaceC17245) {
        this.f63569 = interfaceC17245;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC17245 m46505() {
        return this.f63569;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m46503() {
        if (this.f63567.get() == 2) {
            return this.f63568;
        }
        C21901 c21901M54201 = this.f63564.m54201();
        try {
            boolean zMo12569 = c21901M54201.m49441().mo12569();
            c21901M54201.m21114();
            return zMo12569;
        } catch (Throwable th) {
            try {
                c21901M54201.m21114();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m46489(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835) {
        InterfaceC3835 c5216;
        InterfaceC9571 c6557;
        C24582 c24582 = this.f63564;
        c24582.m54197();
        try {
            C21901 c21901M54201 = c24582.m54201();
            try {
                synchronized (c21901M54201) {
                    c21901M54201.m49438();
                    InterfaceC9571 interfaceC9572 = null;
                    if (m46484(c21901M54201) == 2) {
                        c21901M54201.m21114();
                        c24582.m54210();
                        return null;
                    }
                    int andSet = this.f63567.getAndSet(1);
                    if (andSet == 1) {
                        if (m46484(c21901M54201) != 2) {
                            throw new C5255("Tree disconnected while waiting for connection");
                        }
                        c21901M54201.m21114();
                        c24582.m54210();
                        return null;
                    }
                    if (andSet == 2) {
                        c21901M54201.m21114();
                        c24582.m54210();
                        return null;
                    }
                    InterfaceC4410 interfaceC4410 = f63556;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Connection state was " + andSet);
                    }
                    try {
                        try {
                            String strM54200 = c24582.m54200();
                            if (strM54200 == null) {
                                throw new C5255("Transport disconnected while waiting for connection");
                            }
                            InterfaceC21941 interfaceC21941M49441 = c21901M54201.m49441();
                            String str = "\\\\" + strM54200 + '\\' + this.f63561;
                            String str2 = this.f63558;
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9183("treeConnect: unc=" + str + ",service=" + str2);
                            }
                            if (c21901M54201.m49436()) {
                                C13695 c13695 = new C13695(str, c24582.m54206());
                                if (interfaceC9571 != 0) {
                                    c13695.mo12477((AbstractC5628) interfaceC9571);
                                }
                                c6557 = c13695;
                                c5216 = null;
                            } else {
                                c5216 = new C5216(c24582.m54206(), (AbstractC13224) interfaceC3835);
                                c6557 = new C6557(c24582.getContext(), ((C10580) interfaceC21941M49441).m24379(), str, str2, (AbstractC13224) interfaceC9571);
                            }
                            try {
                                InterfaceC11212 interfaceC11212 = (InterfaceC11212) c24582.m54193(c6557, c5216, Collections.EMPTY_SET);
                                m46487(c21901M54201, c24582, interfaceC11212);
                                if (interfaceC3835 != null && interfaceC3835.mo30257()) {
                                    c21901M54201.notifyAll();
                                    c21901M54201.m21114();
                                    c24582.m54210();
                                    return interfaceC3835;
                                }
                                if (!c21901M54201.m49436()) {
                                    c21901M54201.notifyAll();
                                    c21901M54201.m21114();
                                    c24582.m54210();
                                    return null;
                                }
                                InterfaceC3835 interfaceC3835Mo7519 = interfaceC11212.mo7519();
                                c21901M54201.notifyAll();
                                c21901M54201.m21114();
                                c24582.m54210();
                                return interfaceC3835Mo7519;
                            } catch (IOException e) {
                                e = e;
                                interfaceC9572 = c6557;
                                if (interfaceC9572 != null && interfaceC9572.mo7658() != null) {
                                    InterfaceC11212 interfaceC11213 = (InterfaceC11212) interfaceC9572.mo7658();
                                    if (interfaceC11213.mo30257() && !interfaceC11213.mo30253() && interfaceC11213.getErrorCode() == 0) {
                                        if (!c21901M54201.mo21123()) {
                                            m46487(c21901M54201, c24582, interfaceC11213);
                                        }
                                        throw e;
                                    }
                                }
                                try {
                                    f63556.mo9176("Disconnect tree on treeConnectFailure", (Exception) e);
                                    m46495(true, true);
                                    throw e;
                                } finally {
                                    this.f63567.set(0);
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        c21901M54201.notifyAll();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    c21901M54201.m21114();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                c24582.m54210();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m46490(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) {
        C24582 c24582 = this.f63564;
        c24582.m54197();
        try {
            C21901 c21901M54201 = c24582.m54201();
            if (interfaceC3835 != null) {
                try {
                    interfaceC3835.mo30260();
                } catch (Throwable th) {
                    try {
                        c21901M54201.m21114();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            String str = null;
            InterfaceC3835 interfaceC3835M46489 = ((interfaceC9571 instanceof C14603) || (interfaceC9571 instanceof C15705)) ? null : m46489(interfaceC9571, interfaceC3835);
            if (interfaceC9571 != null && (interfaceC3835M46489 == null || !interfaceC3835M46489.mo30257())) {
                interfaceC9571.mo22300(this.f63560);
                if (!c21901M54201.m49436()) {
                    AbstractC13224 abstractC13224 = (AbstractC13224) interfaceC9571;
                    str = this.f63559;
                    if (str == null) {
                        throw new C5255("Service is null in state " + this.f63567.get());
                    }
                    m46485(abstractC13224, str);
                }
                if (this.f63568 && !"IPC".equals(str) && !"IPC$".equals(this.f63561) && (interfaceC9571 instanceof InterfaceC17916)) {
                    InterfaceC17916 interfaceC17916 = (InterfaceC17916) interfaceC9571;
                    if (interfaceC17916.getPath() != null && interfaceC17916.getPath().length() > 0) {
                        InterfaceC4410 interfaceC4410 = f63556;
                        if (interfaceC4410.mo9181()) {
                            interfaceC4410.mo9183("Setting DFS request path from " + interfaceC17916.getPath() + " to " + interfaceC17916.mo8767());
                        }
                        interfaceC17916.mo8761();
                        interfaceC17916.mo8756(interfaceC17916.mo8767());
                    }
                }
                try {
                    InterfaceC3835 interfaceC3835M54193 = c24582.m54193(interfaceC9571, interfaceC3835, set);
                    c21901M54201.m21114();
                    c24582.m54210();
                    return interfaceC3835M54193;
                } catch (C5255 e) {
                    if (e.m11333() == -1073741623) {
                        f63556.mo9183("Disconnect tree on NT_STATUS_NETWORK_NAME_DELETED");
                        m46495(true, true);
                    }
                    throw e;
                }
            }
            c21901M54201.m21114();
            c24582.m54210();
            return interfaceC3835M46489;
        } catch (Throwable th3) {
            try {
                c24582.m54210();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46495(boolean z, boolean z2) {
        boolean z3;
        C24582 c24582 = this.f63564;
        c24582.m54197();
        try {
            C21901 c21901M54201 = c24582.m54201();
            try {
                synchronized (c21901M54201) {
                    if (this.f63567.getAndSet(3) == 2) {
                        long j = this.f63565.get();
                        if ((!z2 || j == 1) && (z2 || j <= 0)) {
                            z3 = false;
                        } else {
                            f63556.mo9199("Disconnected tree while still in use " + this);
                            c24582.m54206().getClass();
                            z3 = true;
                        }
                        if (!z && this.f63560 != -1) {
                            try {
                                if (!c21901M54201.m49436()) {
                                    m46490(new C14603(c24582.m54206()), new C9200(c24582.m54206()), Collections.EMPTY_SET);
                                } else {
                                    m46491(new C15705(c24582.m54206(), 4), new EnumC2572[0]);
                                }
                            } catch (C20777 e) {
                                f63556.mo9186("Tree disconnect failed", (Throwable) e);
                            }
                        }
                        throw th;
                    }
                    z3 = false;
                    this.f63568 = false;
                    this.f63566 = false;
                    this.f63567.set(0);
                    c21901M54201.notifyAll();
                }
                c21901M54201.m21114();
                c24582.m54210();
                return z3;
            } catch (Throwable th) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c24582.m54210();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C24582 m46501() {
        C24582 c24582 = this.f63564;
        c24582.m54197();
        return c24582;
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m46500() {
        return this.f63562;
    }

    public final int hashCode() {
        return (this.f63559.hashCode() * 7) + this.f63561.hashCode();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m46491(AbstractC15015 abstractC15015, EnumC2572... enumC2572Arr) {
        return m46490(abstractC15015, abstractC15015.mo7658(), enumC2572Arr.length > 0 ? EnumSet.copyOf((Collection) Arrays.asList(enumC2572Arr)) : EnumSet.noneOf(EnumC2572.class));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46485(AbstractC13224 abstractC13224, String str) throws C5255 {
        int iMo12502;
        if ("A:".equals(str) || (iMo12502 = abstractC13224.mo12502()) == -94 || iMo12502 == 4) {
            return;
        }
        if (iMo12502 != 37 && iMo12502 != 50) {
            if (iMo12502 != 113) {
                switch (iMo12502) {
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                        return;
                    default:
                        throw new C5255("Invalid operation for " + str + " service" + abstractC13224);
                }
            }
            return;
        }
        int iM44787 = ((AbstractC19710) abstractC13224).m44787() & 255;
        if (iM44787 == -41 || iM44787 == 0 || iM44787 == 16 || iM44787 == 35 || iM44787 == 38 || iM44787 == 104 || iM44787 == 83 || iM44787 == 84) {
            return;
        }
        throw new C5255("Invalid operation for " + str + " service: " + abstractC13224);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46487(C21901 c21901, C24582 c24582, InterfaceC11212 interfaceC11212) throws C20777 {
        if (!interfaceC11212.mo11185()) {
            throw new C5255("TreeID is invalid");
        }
        this.f63560 = interfaceC11212.m25901();
        String strMo11186 = interfaceC11212.mo11186();
        if (strMo11186 == null && !c21901.m49436()) {
            throw new C5255("Service is NULL");
        }
        if (((C15410) c21901.getContext().mo29602()).m35098() && (("IPC$".equals(this.f63561) || "IPC".equals(strMo11186)) && !c24582.m54207().mo18056() && c24582.m54204() == null)) {
            throw new C5255("IPC signing is enforced, but no signing is available");
        }
        this.f63559 = strMo11186;
        this.f63568 = interfaceC11212.mo11187();
        this.f63562 = f63557.incrementAndGet();
        this.f63567.set(2);
        try {
            m46486(c21901, c24582);
        } catch (C20777 e) {
            try {
                c21901.m21121();
            } catch (IOException e2) {
                f63556.mo9178("Failed to disconnect transport", (Throwable) e2);
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46486(C21901 c21901, C24582 c24582) throws C20777 {
        boolean zM49436 = c21901.m49436();
        InterfaceC4410 interfaceC4410 = f63556;
        if (!zM49436 || c21901.m49439() == null || !((C15410) c24582.m54206()).m35126()) {
            interfaceC4410.mo9183("Secure negotiation does not apply");
            return;
        }
        C5648 c5648 = (C5648) c21901.m49441();
        if (c5648.mo12576().m50996(EnumC22788.SMB311)) {
            interfaceC4410.mo9183("Secure negotiation does not apply, is SMB3.1");
            return;
        }
        C6989 c6989 = new C6989(c24582.m54206(), c21901.m49423(c5648));
        interfaceC4410.mo9183("Sending VALIDATE_NEGOTIATE_INFO");
        C4978 c4978 = new C4978(c24582.m54206(), 1311236);
        c4978.m10537();
        c4978.m10535(new C7660(c6989.m16058(), c6989.m16061(), (short) c6989.m16059(), c6989.m16062()));
        try {
            C3636 c3636 = (C3636) ((C6319) m46491(c4978, EnumC2572.NO_RETRY)).m14447(C3636.class);
            if (c5648.m12566() != c3636.m6896() || c5648.m12573() != c3636.m6897() || c5648.m12565() != c3636.m6898() || !Arrays.equals(c5648.m12575(), c3636.m6899())) {
                interfaceC4410.mo9183("Secure negotiation failure");
                throw new C20777("Mismatched attributes validating negotiate info");
            }
            interfaceC4410.mo9183("Secure negotiation OK");
        } catch (C9949 e) {
            throw new C3243("Signature error during negotiate validation", e);
        } catch (C5255 e2) {
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183(String.format("VALIDATE_NEGOTIATE_INFO response code 0x%x", Integer.valueOf(e2.m11333())));
            }
            interfaceC4410.mo9192("VALIDATE_NEGOTIATE_INFO returned error", e2);
            if ((((C6319) c4978.mo7658()).mo30257() && ((C6319) c4978.mo7658()).mo30258()) || e2.m11333() == -1073741790) {
                throw new C3243("Signature error during negotiate validation", e2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m46484(C21901 c21901) throws C5255 {
        int i;
        while (true) {
            i = this.f63567.get();
            if (i == 0 || i == 2) {
                break;
            }
            if (i == 3) {
                throw new C5255("Disconnecting during tree connect");
            }
            try {
                f63556.mo9183("Waiting for transport");
                c21901.wait();
            } catch (InterruptedException e) {
                throw new C5255(e.getMessage(), e);
            }
        }
        return i;
    }

    public final String toString() {
        return "SmbTree[share=" + this.f63561 + ",service=" + this.f63559 + ",tid=" + this.f63560 + ",inDfs=" + this.f63568 + ",inDomainDfs=" + this.f63566 + ",connectionState=" + this.f63567 + ",usage=" + this.f63565.get() + "]";
    }
}
