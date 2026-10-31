package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ۖ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1A1B */
/* JADX INFO: loaded from: classes2.dex */
public class C2207 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f7246 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f7247 = C11321.m27961(C2207.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Random f7248 = new Random();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 f7249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2207 f7250;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7251;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f7252;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C19141 f7253;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC9263 f7254;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AtomicLong f7255;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private synchronized C19141 m7323() {
        C19141 c19141 = this.f7253;
        if (c19141 != null) {
            return c19141;
        }
        C2207 c2207 = this.f7250;
        if (c2207 == null) {
            return null;
        }
        return c2207.m7323();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized C19141 m7326() {
        C19141 c19141 = this.f7253;
        if (c19141 != null) {
            c19141.m44198();
            return c19141;
        }
        C2207 c2207 = this.f7250;
        if (c2207 == null) {
            return c19141;
        }
        C19141 c19141M7326 = c2207.m7326();
        this.f7253 = c19141M7326;
        return c19141M7326;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m7328(C17729 c17729) {
        C23373 c23373M7340 = m7340();
        try {
            if (m7341()) {
                C20552 c20552M51804 = c23373M7340.m51804();
                try {
                    if (c20552M51804.mo19180() || c20552M51804.m47108() == null) {
                        f7247.mo7088("Disconnecting failed tree and session");
                        m7336();
                    }
                    c20552M51804.m19171();
                } catch (Throwable th) {
                    try {
                        c20552M51804.m19171();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (!m7341()) {
                C3618 c3618M7329 = m7329(c17729, c17729.m41526());
                if (c23373M7340 != null) {
                    c23373M7340.m51813();
                }
                return c3618M7329;
            }
            f7247.mo7101("Already connected");
            C3618 c3618 = new C3618(c17729, this);
            if (c23373M7340 != null) {
                c23373M7340.m51813();
            }
            return c3618;
        } catch (Throwable th3) {
            if (c23373M7340 != null) {
                try {
                    c23373M7340.m51813();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m7336() {
        C23373 c23373M7340 = m7340();
        if (c23373M7340 == null) {
            if (c23373M7340 != null) {
                c23373M7340.m51813();
            }
            return;
        }
        try {
            C20552 c20552M51804 = c23373M7340.m51804();
            try {
                synchronized (c20552M51804) {
                    C19141 c19141M7323 = m7323();
                    if (c19141M7323 != null) {
                        try {
                            c19141M7323.m44201(true, true);
                            this.f7253 = null;
                            this.f7251 = false;
                        } catch (Throwable th) {
                            this.f7253 = null;
                            this.f7251 = false;
                            throw th;
                        }
                    } else {
                        this.f7250.m7336();
                    }
                }
                c20552M51804.m19171();
                c23373M7340.m51813();
            } catch (Throwable th2) {
                try {
                    c20552M51804.m19171();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                c23373M7340.m51813();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m7341() {
        C19141 c19141M7323;
        c19141M7323 = m7323();
        return c19141M7323 != null && c19141M7323.m44202();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m7322(C19141 c19141) {
        C19141 c19141M7326 = m7326();
        if (c19141M7326 == c19141) {
            if (c19141M7326 != null) {
                c19141M7326.m44194();
            }
            return;
        }
        try {
            boolean z = this.f7251;
            InterfaceC2148 interfaceC2148 = f7247;
            interfaceC2148.mo7088("Switching tree");
            interfaceC2148.mo7088("Acquired tree on switch " + c19141);
            c19141.m44198();
            this.f7251 = true;
            this.f7253 = c19141;
            if (c19141M7326 != null && z) {
                c19141M7326.m44194();
            }
            if (this.f7250 != null && this.f7252) {
                interfaceC2148.mo7088("Releasing delegate");
                this.f7252 = false;
                this.f7250.m7334();
            }
            if (c19141M7326 != null) {
                c19141M7326.m44194();
            }
        } catch (Throwable th) {
            if (c19141M7326 != null) {
                try {
                    c19141M7326.m44194();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C2207(InterfaceC18663 interfaceC18663) {
        this.f7255 = new AtomicLong();
        this.f7249 = interfaceC18663;
        this.f7250 = null;
    }

    public C2207(C2207 c2207) {
        this.f7255 = new AtomicLong();
        this.f7249 = c2207.f7249;
        this.f7250 = c2207;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2207 m7324(C2207 c2207) {
        c2207.f7249.mo27540().getClass();
        return new C2207(c2207);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m7338() {
        return this.f7249.mo27540();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7332() {
        long jIncrementAndGet = this.f7255.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f7247;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire tree connection " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                C19141 c19141M7326 = m7326();
                if (c19141M7326 != null) {
                    try {
                        if (!this.f7251) {
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("Acquire tree on first usage " + c19141M7326);
                            }
                            c19141M7326.m44198();
                            this.f7251 = true;
                        }
                    } catch (Throwable th) {
                        try {
                            c19141M7326.m44194();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c19141M7326 != null) {
                    c19141M7326.m44194();
                }
                if (this.f7250 != null && !this.f7252) {
                    interfaceC2148.mo7088("Acquire delegate on first usage");
                    this.f7250.m7332();
                    this.f7252 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m7334() {
        long jDecrementAndGet = this.f7255.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f7247;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release tree connection " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet >= 0) {
                return;
            }
            interfaceC2148.mo7080("Usage count dropped below zero " + this);
            throw new C13017("Usage count dropped below zero");
        }
        synchronized (this) {
            C19141 c19141M7326 = m7326();
            try {
                if (this.f7251 && c19141M7326 != null) {
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Tree connection no longer in use, release tree " + c19141M7326);
                    }
                    this.f7251 = false;
                    c19141M7326.m44194();
                }
                if (c19141M7326 != null) {
                    c19141M7326.m44194();
                }
                if (this.f7250 != null && this.f7252) {
                    this.f7252 = false;
                    this.f7250.m7334();
                }
            } catch (Throwable th) {
                if (c19141M7326 != null) {
                    try {
                        c19141M7326.m44194();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        Object obj = this.f7254;
        if (obj != null) {
            synchronized (this) {
                try {
                    interfaceC2148.mo7088("Disconnecting exclusive transport");
                    this.f7254 = null;
                    this.f7253 = null;
                    this.f7251 = false;
                    ((AbstractRunnableC7146) obj).m19171();
                    ((AbstractRunnableC7146) obj).m19169(false, false);
                } catch (Exception e) {
                    f7247.mo7091("Failed to close exclusive transport", (Throwable) e);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d0 A[SYNTHETIC] */
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m7327(C17729 c17729, InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, EnumC0214... enumC0214Arr) throws Exception {
        InterfaceC2148 interfaceC2148;
        char c;
        Exception exc;
        C3618 c3618M7335;
        C2207 c2207 = this;
        EnumSet enumSetNoneOf = enumC0214Arr.length == 0 ? EnumSet.noneOf(EnumC0214.class) : EnumSet.copyOf((Collection) Arrays.asList(enumC0214Arr));
        InterfaceC16359 interfaceC16359 = interfaceC7578 instanceof InterfaceC16359 ? (InterfaceC16359) interfaceC7578 : null;
        String path = interfaceC16359 != null ? interfaceC16359.getPath() : null;
        String strMo6641 = interfaceC16359 != null ? interfaceC16359.mo6641() : null;
        String str = "\\" + c17729.m41527() + "\\" + c17729.m41523() + c17729.m41529();
        int iM33008 = ((C13722) c2207.f7249.mo27540()).m33008();
        String str2 = null;
        Exception exc2 = null;
        int i = 1;
        while (true) {
            interfaceC2148 = f7247;
            if (i > iM33008) {
                break;
            }
            if (interfaceC16359 != null) {
                interfaceC16359.mo6631(str2, str2, str);
            }
            try {
                return c2207.m7320(c17729, interfaceC7578, interfaceC1543, enumSetNoneOf);
            } catch (C3037 e) {
                C3037 c3037 = e;
                if (enumSetNoneOf.contains(EnumC0214.NO_RETRY) || (!(c3037.getCause() instanceof C1708) && c3037.m9291() != -1073741811)) {
                    interfaceC2148.mo7081("Not retrying", (Exception) c3037);
                    throw c3037;
                }
                c = 1;
                interfaceC2148.mo7081("send", (Exception) c3037);
                exc = c3037;
                if (interfaceC2148.mo7086()) {
                    Integer numValueOf = Integer.valueOf(i);
                    Integer numValueOf2 = Integer.valueOf(iM33008);
                    Object[] objArr = new Object[3];
                    objArr[0] = numValueOf;
                    objArr[c] = numValueOf2;
                    objArr[2] = interfaceC7578;
                    interfaceC2148.mo7088(String.format("Retrying (%d/%d) request %s", objArr));
                }
                interfaceC2148.mo7081("Disconnecting tree on send retry", exc);
                m7336();
                if (i >= iM33008) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC2148.mo7081("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C3037("All attempts failed, but no exception");
                }
                if (i != 1) {
                    try {
                        Thread.sleep(f7248.nextInt(1000) + 500);
                    } catch (InterruptedException e2) {
                        interfaceC2148.mo7081("interrupted sleep in send", (Exception) e2);
                    }
                }
                if (interfaceC7578 != null) {
                    interfaceC2148.mo7088("Restting request");
                    interfaceC7578.reset();
                }
                if (interfaceC16359 != null) {
                    interfaceC16359.mo6630(path);
                    interfaceC16359.mo6631(interfaceC16359.mo6637(), interfaceC16359.mo6629(), strMo6641);
                }
                if (interfaceC1543 != null) {
                    interfaceC1543.reset();
                }
                try {
                    c3618M7335 = m7335(c17729);
                    try {
                        interfaceC2148.mo7088("Have new tree connection for retry");
                        c3618M7335.close();
                    } catch (Throwable th) {
                        try {
                            c3618M7335.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C3037 e3) {
                    interfaceC2148.mo7081("Failed to connect tree on retry", (Exception) e3);
                    exc = e3;
                }
                i++;
                str2 = null;
                c2207 = this;
                exc2 = exc;
            } catch (C19369 e4) {
                C19369 c19369 = e4;
                interfaceC2148.mo7081("send", (Exception) c19369);
                c = 1;
                exc = c19369;
                if (interfaceC2148.mo7086()) {
                    Integer numValueOf3 = Integer.valueOf(i);
                    Integer numValueOf4 = Integer.valueOf(iM33008);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = numValueOf3;
                    objArr2[c] = numValueOf4;
                    objArr2[2] = interfaceC7578;
                    interfaceC2148.mo7088(String.format("Retrying (%d/%d) request %s", objArr2));
                }
                interfaceC2148.mo7081("Disconnecting tree on send retry", exc);
                m7336();
                if (i >= iM33008) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC2148.mo7081("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C3037("All attempts failed, but no exception");
                }
                if (i != 1) {
                    Thread.sleep(f7248.nextInt(1000) + 500);
                }
                if (interfaceC7578 != null) {
                    interfaceC2148.mo7088("Restting request");
                    interfaceC7578.reset();
                }
                if (interfaceC16359 != null) {
                    interfaceC16359.mo6630(path);
                    interfaceC16359.mo6631(interfaceC16359.mo6637(), interfaceC16359.mo6629(), strMo6641);
                }
                if (interfaceC1543 != null) {
                    interfaceC1543.reset();
                }
                c3618M7335 = m7335(c17729);
                interfaceC2148.mo7088("Have new tree connection for retry");
                c3618M7335.close();
                i++;
                str2 = null;
                c2207 = this;
                exc2 = exc;
            }
            i++;
            str2 = null;
            c2207 = this;
            exc2 = exc;
        }
        if (exc2 != null) {
            interfaceC2148.mo7081("All attempts have failed, last exception", exc2);
            throw exc2;
        }
        throw new C3037("All attempts failed, but no exception");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC1543 m7320(C17729 c17729, InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, EnumSet enumSet) throws C19369 {
        for (int i = 10; i > 0; i--) {
            if (interfaceC7578 instanceof InterfaceC16359) {
                m7331(c17729, (InterfaceC16359) interfaceC7578);
            }
            try {
                C19141 c19141M7326 = m7326();
                try {
                    if (c19141M7326 == null) {
                        throw new C19369("Failed to get tree connection");
                    }
                    InterfaceC1543 interfaceC1543M44196 = c19141M7326.m44196(interfaceC7578, interfaceC1543, enumSet);
                    c19141M7326.m44194();
                    return interfaceC1543M44196;
                } catch (Throwable th) {
                    if (c19141M7326 != null) {
                        try {
                            c19141M7326.m44194();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (C7125 e) {
                ((C8599) e.m19143()).mo22338();
                interfaceC7578.reset();
                f7247.mo7097("send0", e);
            }
        }
        throw new C19369("Loop in DFS referrals");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3618 m7335(C17729 c17729) throws C3037 {
        try {
            return m7328(c17729);
        } catch (UnknownHostException e) {
            throw new C3037("Failed to connect to server", e);
        } catch (C3037 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C3037("Failed to connect to server", e3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m7329(C17729 c17729, String str) {
        return m7330(c17729, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C3618 m7330(C17729 c17729, String str, InterfaceC15653 interfaceC15653) {
        String strM51805;
        InterfaceC15653 interfaceC15653M32495;
        String str2;
        String str3;
        C8599 next;
        Throwable th;
        C23373 c23373;
        C19141 c19141M7326 = m7326();
        String strM41529 = null;
        if (c19141M7326 != null) {
            try {
                InterfaceC2148 interfaceC2148 = f7247;
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Tree is " + c19141M7326);
                }
                if (C11003.equals(c17729.m41523(), c19141M7326.m44208())) {
                    C23373 c23373M44207 = c19141M7326.m44207();
                    try {
                        strM51805 = c23373M44207.m51805();
                        if (!c23373M44207.m51812()) {
                            C20552 c20552M51804 = c23373M44207.m51804();
                            try {
                                C19141 c19141M7321 = m7321(c17729, str, c19141M7326.m44208(), c20552M51804, c19141M7326, null);
                                try {
                                    m7322(c19141M7321);
                                    C3618 c3618 = new C3618(c17729, this);
                                    c19141M7321.m44194();
                                    c20552M51804.m19171();
                                    c23373M44207.m51813();
                                    c19141M7326.m44194();
                                    return c3618;
                                } catch (Throwable th2) {
                                    try {
                                        c19141M7321.m44194();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    c20552M51804.m19171();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                        interfaceC2148.mo7088("Session no longer valid");
                        c23373M44207.m51813();
                    } catch (Throwable th6) {
                        try {
                            c23373M44207.m51813();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    try {
                        c19141M7326.m44194();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
                strM51805 = null;
            } catch (Throwable th9) {
                c19141M7326.m44194();
                throw th9;
            }
        } else {
            strM51805 = null;
        }
        if (c19141M7326 != null) {
            c19141M7326.m44194();
        }
        String strM41526 = c17729.m41526();
        if (c17729.m41520() != 8 && c17729.m41529() != null && !"\\".equals(c17729.m41529())) {
            strM41529 = c17729.m41529();
        }
        String strM41523 = c17729.m41523();
        if (interfaceC15653 != null) {
            interfaceC15653M32495 = interfaceC15653;
        } else {
            interfaceC15653M32495 = ((C13474) this.f7249.mo27541()).m32495(this.f7249, strM41526, c17729.m41523(), strM41529);
        }
        String str4 = strM51805;
        C17729 c177210 = c17729;
        InterfaceC15653 interfaceC15654 = interfaceC15653M32495;
        String str5 = str;
        while (true) {
            if (interfaceC15654 != null) {
                String strMo22343 = interfaceC15654.mo22343();
                String lowerCase = interfaceC15654.mo22329().toLowerCase(Locale.ROOT);
                strM41523 = interfaceC15654.mo22341();
                str3 = strMo22343;
                str2 = lowerCase;
            } else {
                str2 = str5;
                str3 = str4;
            }
            String str6 = strM41523;
            try {
                C20552 c20552 = (C20552) ((C15611) this.f7249.mo27538()).m36794(this.f7249, str2, c177210.m41525(), false, c177210.m41528());
                c20552.m47101(InterfaceC9263.class);
                try {
                    try {
                        C23373 c23373M47102 = c20552.m47102(this.f7249, str2, str3);
                        c23373M47102.m51806();
                        try {
                            C19141 c19141M51799 = c23373M47102.m51799(str6);
                            c19141M51799.m44205();
                            c23373 = c23373M47102;
                            try {
                                C19141 c19141M7322 = m7321(c17729, str2, str6, c20552, c19141M51799, interfaceC15654);
                                if (interfaceC15654 != null) {
                                    try {
                                        c19141M7322.m44199(interfaceC15654);
                                        if (interfaceC15654 != interfaceC15653M32495) {
                                            interfaceC15654.mo22338().mo22346();
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            c19141M7322.m44194();
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                        }
                                        throw th10;
                                    }
                                }
                                m7322(c19141M7322);
                                C3618 c3619 = new C3618(c17729, this);
                                c19141M7322.m44194();
                                try {
                                    c19141M51799.m44194();
                                    c23373.m51813();
                                    try {
                                        c20552.m19171();
                                        return c3619;
                                    } catch (IOException e) {
                                        e = e;
                                        c177210 = c17729;
                                        f7247.mo7081("Referral failed, trying next", (Exception) e);
                                        interfaceC15654 = interfaceC15654;
                                        if (interfaceC15654 != null) {
                                            next = interfaceC15654.next();
                                        }
                                        if (interfaceC15654 == interfaceC15653M32495) {
                                            interfaceC15654 = next;
                                            throw e;
                                        }
                                        interfaceC15654 = next;
                                        str5 = str2;
                                        str4 = str3;
                                        strM41523 = str6;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    Throwable th13 = th;
                                    try {
                                        c23373.m51813();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            } catch (Throwable th15) {
                                try {
                                    c19141M51799.m44194();
                                } catch (Throwable th16) {
                                    th15.addSuppressed(th16);
                                }
                                throw th15;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            c23373 = c23373M47102;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        c177210 = c17729;
                        try {
                            c20552.m19171();
                        } catch (Throwable th19) {
                            th.addSuppressed(th19);
                        }
                        throw th;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c20552.m19171();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            interfaceC15654 = next;
            str5 = str2;
            str4 = str3;
            strM41523 = str6;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19141 m7321(C17729 c17729, String str, String str2, InterfaceC9263 interfaceC9263, C19141 c19141, InterfaceC15653 interfaceC15653) {
        InterfaceC2148 interfaceC2148 = f7247;
        boolean zMo7086 = interfaceC2148.mo7086();
        InterfaceC18663 interfaceC18663 = this.f7249;
        if (zMo7086 && ((C20552) interfaceC9263).m47119() && !c17729.m41524()) {
            interfaceC18663.mo27540().getClass();
            interfaceC2148.mo7088("Signatures for file enabled but not required " + this);
        }
        if (interfaceC15653 != null) {
            c19141.m44210();
        }
        try {
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("doConnect: " + str);
            }
            c19141.m44195((InterfaceC7578) null, (InterfaceC1543) null);
            c19141.m44198();
            return c19141;
        } catch (C22087 e) {
            interfaceC2148.mo7081("Authentication failed", (Exception) e);
            C23373 c23373M44207 = c19141.m44207();
            try {
                if (c23373M44207.m51810().mo16137() || c23373M44207.m51810().mo16135()) {
                    try {
                        C23373 c23373M47102 = ((C20552) interfaceC9263).m47102(interfaceC18663.mo6358(), c23373M44207.m51803(), c23373M44207.m51805());
                        c23373M47102.m51806();
                        try {
                            C19141 c19141M51799 = c23373M47102.m51799(str2);
                            c19141M51799.m44205();
                            try {
                                c19141M51799.m44195((InterfaceC7578) null, (InterfaceC1543) null);
                                interfaceC2148.mo7088("Anonymous retry succeeded");
                                c19141M51799.m44198();
                                c19141M51799.m44194();
                                c23373M47102.m51813();
                                c23373M44207.m51813();
                                return c19141M51799;
                            } catch (Throwable th) {
                                try {
                                    c19141M51799.m44194();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                c23373M47102.m51813();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Exception e2) {
                        interfaceC2148.mo7081("Retry also failed", e2);
                        throw e;
                    }
                }
                c17729.m41522().toString();
                if (!interfaceC18663.mo6360()) {
                    throw e;
                }
                interfaceC2148.mo7088("Trying to renew credentials after auth error");
                C23373 c23373M47103 = ((C20552) interfaceC9263).m47102(interfaceC18663, c23373M44207.m51803(), c23373M44207.m51805());
                c23373M47103.m51806();
                try {
                    C19141 c19141M517910 = c23373M47103.m51799(str2);
                    c19141M517910.m44205();
                    if (interfaceC15653 != null) {
                        try {
                            c19141M517910.m44210();
                        } catch (Throwable th5) {
                            try {
                                c19141M517910.m44194();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                    c19141M517910.m44195((InterfaceC7578) null, (InterfaceC1543) null);
                    c19141M517910.m44198();
                    c19141M517910.m44194();
                    c23373M47103.m51813();
                    c23373M44207.m51813();
                    return c19141M517910;
                } catch (Throwable th7) {
                    try {
                        c23373M47103.m51813();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                c23373M44207.m51813();
                throw th9;
            }
            try {
                c23373M44207.m51813();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5962 m7331(C17729 c17729, InterfaceC16359 interfaceC16359) {
        if (interfaceC16359 instanceof C1584) {
            return c17729;
        }
        for (int i = 0; i < ((C13722) this.f7249.mo27540()).m33008() + 1; i++) {
            try {
                return m7325(c17729, interfaceC16359);
            } catch (C3037 e) {
                if (e.m9291() != -1073741275 && !(e.getCause() instanceof C1708)) {
                    throw e;
                }
                InterfaceC2148 interfaceC2148 = f7247;
                interfaceC2148.mo7081("resolveDfs", (Exception) e);
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Retrying (" + i + ") resolveDfs: " + interfaceC16359);
                }
                interfaceC2148.mo7088("Disconnecting tree on DFS retry");
                m7336();
                try {
                    Thread.sleep(f7248.nextInt(OpenAuthTask.Duplex) + 500);
                } catch (InterruptedException e2) {
                    interfaceC2148.mo7081("resolveDfs", (Exception) e2);
                }
                m7335(c17729).close();
            }
        }
        return c17729;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[Catch: all -> 0x01f7, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x01f7, blocks: (B:3:0x0014, B:56:0x013d, B:75:0x016b, B:92:0x01b6, B:30:0x009e, B:101:0x01c9, B:128:0x01f6, B:127:0x01f3, B:123:0x01ed, B:4:0x0018, B:55:0x013a, B:74:0x0168, B:91:0x01b3, B:29:0x009b, B:100:0x01c6, B:119:0x01e8, B:118:0x01e5), top: B:144:0x0014, inners: #0, #5 }] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC5962 m7325(C17729 c17729, InterfaceC16359 interfaceC16359) throws C3037 {
        String strMo6641;
        InterfaceC18663 interfaceC18663 = this.f7249;
        C3618 c3618M7335 = m7335(c17729);
        try {
            C23373 c23373M11098 = c3618M7335.m11098();
            try {
                C20552 c20552M51804 = c23373M11098.m51804();
                try {
                    try {
                        C19141 c19141M7326 = m7326();
                        try {
                            c20552M51804.m47114();
                            String path = interfaceC16359 != null ? interfaceC16359.getPath() : c17729.m41529();
                            if (interfaceC16359 != null) {
                                strMo6641 = interfaceC16359.mo6641();
                            } else {
                                strMo6641 = "\\" + c17729.m41527() + '\\' + c17729.m41523() + c17729.m41529();
                            }
                            boolean zM44203 = c19141M7326.m44203();
                            InterfaceC2148 interfaceC2148 = f7247;
                            if (zM44203 || !c19141M7326.m44209()) {
                                if (!c19141M7326.m44203()) {
                                    interfaceC2148.mo7101("Not in DFS");
                                    c19141M7326.m44194();
                                    c20552M51804.m19171();
                                    c23373M11098.m51813();
                                    c3618M7335.close();
                                    return c17729;
                                }
                                InterfaceC15653 interfaceC15653M44211 = c19141M7326.m44211();
                                if (interfaceC15653M44211 != null) {
                                    if (interfaceC2148.mo7086()) {
                                        interfaceC2148.mo7088(String.format("Need to adjust request path %s (full: %s) -> %s", path, strMo6641, interfaceC15653M44211));
                                    }
                                    String strM41514 = c17729.m41514(interfaceC15653M44211, path);
                                    if (interfaceC16359 != null) {
                                        interfaceC16359.mo6630(strM41514);
                                    }
                                    c19141M7326.m44194();
                                    c20552M51804.m19171();
                                    c23373M11098.m51813();
                                    c3618M7335.close();
                                    return c17729;
                                }
                                interfaceC2148.mo7088("No tree referral but in DFS");
                            }
                            if (interfaceC16359 != null) {
                                interfaceC16359.mo6631(c23373M11098.m51805(), c23373M11098.m51803(), strMo6641);
                            }
                            InterfaceC15653 interfaceC15653M32495 = ((C13474) interfaceC18663.mo27541()).m32495(interfaceC18663, c17729.m41527(), c17729.m41523(), c17729.m41529());
                            if (interfaceC15653M32495 == null) {
                                if (!c19141M7326.m44203() || (interfaceC16359 instanceof C1584) || (interfaceC16359 instanceof C17106)) {
                                    interfaceC2148.mo7101("Not in DFS");
                                    c19141M7326.m44194();
                                    c20552M51804.m19171();
                                    c23373M11098.m51813();
                                    c3618M7335.close();
                                    return c17729;
                                }
                                if (interfaceC2148.mo7086()) {
                                    interfaceC2148.mo7088("No referral available for  " + strMo6641);
                                }
                                throw new C19369("No referral but in domain DFS " + strMo6641);
                            }
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("Resolved " + strMo6641 + " -> " + interfaceC15653M32495);
                            }
                            String strM41515 = c17729.m41514(interfaceC15653M32495, path);
                            if (interfaceC16359 != null) {
                                interfaceC16359.mo6630(strM41515);
                            }
                            if (c19141M7326.m44208().equals(interfaceC15653M32495.mo22341())) {
                                c19141M7326.m44194();
                                c20552M51804.m19171();
                                c23373M11098.m51813();
                                c3618M7335.close();
                                return c17729;
                            }
                            InterfaceC15653 next = interfaceC15653M32495;
                            do {
                                if (interfaceC2148.mo7086()) {
                                    interfaceC2148.mo7088("Need to switch tree for " + next);
                                }
                                try {
                                    C3618 c3618M7330 = m7330(c17729, c23373M11098.m51803(), next);
                                    try {
                                        interfaceC2148.mo7088("Switched tree");
                                        c3618M7330.close();
                                        c19141M7326.m44194();
                                        c20552M51804.m19171();
                                        c23373M11098.m51813();
                                        c3618M7335.close();
                                        return c17729;
                                    } catch (Throwable th) {
                                        try {
                                            c3618M7330.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    interfaceC2148.mo7081("Failed to connect tree", (Exception) e);
                                    next = next.next();
                                }
                            } while (next != interfaceC15653M32495);
                            throw new C19369("All referral tree connections failed", e);
                        } catch (Throwable th3) {
                            if (c19141M7326 == null) {
                                throw th3;
                            }
                            try {
                                c19141M7326.m44194();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            if (c23373M11098 != null) {
                                throw th;
                            }
                            try {
                                c23373M11098.m51813();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        c20552M51804.m19171();
                        throw th6;
                    }
                    c20552M51804.m19171();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            } catch (Throwable th8) {
                if (c23373M11098 != null) {
                    throw th8;
                }
                c23373M11098.m51813();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c3618M7335.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long m7339() {
        C19141 c19141M7323 = m7323();
        if (c19141M7323 == null) {
            return -1L;
        }
        return c19141M7323.m44206();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23373 m7340() {
        C19141 c19141M7323 = m7323();
        if (c19141M7323 != null) {
            return c19141M7323.m44207();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m7337() {
        C19141 c19141M7326 = m7326();
        try {
            int iM44204 = c19141M7326.m44204();
            c19141M7326.m44194();
            return iM44204;
        } catch (Throwable th) {
            if (c19141M7326 != null) {
                try {
                    c19141M7326.m44194();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m7333(C2207 c2207) {
        C19141 c19141M7326 = m7326();
        try {
            C19141 c19141M7327 = c2207.m7326();
            boolean z = c19141M7326 == c19141M7327;
            if (c19141M7327 != null) {
                c19141M7327.m44194();
            }
            if (c19141M7326 != null) {
                c19141M7326.m44194();
            }
            return z;
        } catch (Throwable th) {
            if (c19141M7326 != null) {
                try {
                    c19141M7326.m44194();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
