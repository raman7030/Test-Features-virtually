package p067l;

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
public class C4466 {

    /* JADX INFO: renamed from: ۜ */
    public static final /* synthetic */ int f10034 = 0;

    /* JADX INFO: renamed from: ۢ */
    public static final InterfaceC4410 f10035 = C13128.m30022(C4466.class);

    /* JADX INFO: renamed from: ᩷ */
    public static final Random f10036 = new Random();

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20106 f10037;

    /* JADX INFO: renamed from: ۧ */
    public final C4466 f10038;

    /* JADX INFO: renamed from: ܳ */
    public volatile boolean f10039;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f10040;

    /* JADX INFO: renamed from: ܿ */
    public C20560 f10041;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC11172 f10042;

    /* JADX INFO: renamed from: ᩻ */
    public final AtomicLong f10043;

    /* JADX INFO: renamed from: ۢ */
    private synchronized C20560 m9406() {
        C20560 c20560 = this.f10041;
        if (c20560 != null) {
            return c20560;
        }
        C4466 c4466 = this.f10038;
        if (c4466 == null) {
            return null;
        }
        return c4466.m9406();
    }

    /* JADX INFO: renamed from: ᩷ */
    private synchronized C20560 m9409() {
        C20560 c20560 = this.f10041;
        if (c20560 != null) {
            c20560.m46492();
            return c20560;
        }
        C4466 c4466 = this.f10038;
        if (c4466 == null) {
            return c20560;
        }
        C20560 c20560M9409 = c4466.m9409();
        this.f10041 = c20560M9409;
        return c20560M9409;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C5807 m9411(C19218 c19218) {
        C24582 c24582M9423 = m9423();
        try {
            if (m9424()) {
                C21901 c21901M54201 = c24582M9423.m54201();
                try {
                    if (c21901M54201.mo21123() || c21901M54201.m49432() == null) {
                        f10035.mo9183("Disconnecting failed tree and session");
                        m9419();
                    }
                    c21901M54201.m21114();
                } catch (Throwable th) {
                    try {
                        c21901M54201.m21114();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            if (!m9424()) {
                C5807 c5807M9412 = m9412(c19218, c19218.m43772());
                if (c24582M9423 != null) {
                    c24582M9423.m54210();
                }
                return c5807M9412;
            }
            f10035.mo9196("Already connected");
            C5807 c5807 = new C5807(c19218, this);
            if (c24582M9423 != null) {
                c24582M9423.m54210();
            }
            return c5807;
        } catch (Throwable th3) {
            if (c24582M9423 != null) {
                try {
                    c24582M9423.m54210();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m9419() {
        C24582 c24582M9423 = m9423();
        if (c24582M9423 == null) {
            if (c24582M9423 != null) {
                c24582M9423.m54210();
            }
            return;
        }
        try {
            C21901 c21901M54201 = c24582M9423.m54201();
            try {
                synchronized (c21901M54201) {
                    C20560 c20560M9406 = m9406();
                    if (c20560M9406 != null) {
                        try {
                            c20560M9406.m46495(true, true);
                            this.f10041 = null;
                            this.f10039 = false;
                        } catch (Throwable th) {
                            this.f10041 = null;
                            this.f10039 = false;
                            throw th;
                        }
                    } else {
                        this.f10038.m9419();
                    }
                }
                c21901M54201.m21114();
                c24582M9423.m54210();
            } catch (Throwable th2) {
                try {
                    c21901M54201.m21114();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            try {
                c24582M9423.m54210();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized boolean m9424() {
        C20560 c20560M9406;
        c20560M9406 = m9406();
        return c20560M9406 != null && c20560M9406.m46496();
    }

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m9405(C20560 c20560) {
        C20560 c20560M9409 = m9409();
        if (c20560M9409 == c20560) {
            if (c20560M9409 != null) {
                c20560M9409.m46488();
            }
            return;
        }
        try {
            boolean z = this.f10039;
            InterfaceC4410 interfaceC4410 = f10035;
            interfaceC4410.mo9183("Switching tree");
            interfaceC4410.mo9183("Acquired tree on switch " + c20560);
            c20560.m46492();
            this.f10039 = true;
            this.f10041 = c20560;
            if (c20560M9409 != null && z) {
                c20560M9409.m46488();
            }
            if (this.f10038 != null && this.f10040) {
                interfaceC4410.mo9183("Releasing delegate");
                this.f10040 = false;
                this.f10038.m9417();
            }
            if (c20560M9409 != null) {
                c20560M9409.m46488();
            }
        } catch (Throwable th) {
            if (c20560M9409 != null) {
                try {
                    c20560M9409.m46488();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C4466(InterfaceC20106 interfaceC20106) {
        this.f10043 = new AtomicLong();
        this.f10037 = interfaceC20106;
        this.f10038 = null;
    }

    public C4466(C4466 c4466) {
        this.f10043 = new AtomicLong();
        this.f10037 = c4466.f10037;
        this.f10038 = c4466;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C4466 m9407(C4466 c4466) {
        c4466.f10037.mo29602().getClass();
        return new C4466(c4466);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3341 m9421() {
        return this.f10037.mo29602();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9415() {
        long jIncrementAndGet = this.f10043.incrementAndGet();
        InterfaceC4410 interfaceC4410 = f10035;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Acquire tree connection " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                C20560 c20560M9409 = m9409();
                if (c20560M9409 != null) {
                    try {
                        if (!this.f10039) {
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9183("Acquire tree on first usage " + c20560M9409);
                            }
                            c20560M9409.m46492();
                            this.f10039 = true;
                        }
                    } catch (Throwable th) {
                        try {
                            c20560M9409.m46488();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c20560M9409 != null) {
                    c20560M9409.m46488();
                }
                if (this.f10038 != null && !this.f10040) {
                    interfaceC4410.mo9183("Acquire delegate on first usage");
                    this.f10038.m9415();
                    this.f10040 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m9417() {
        long jDecrementAndGet = this.f10043.decrementAndGet();
        InterfaceC4410 interfaceC4410 = f10035;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Release tree connection " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet >= 0) {
                return;
            }
            interfaceC4410.mo9175("Usage count dropped below zero " + this);
            throw new C14740("Usage count dropped below zero");
        }
        synchronized (this) {
            C20560 c20560M9409 = m9409();
            try {
                if (this.f10039 && c20560M9409 != null) {
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Tree connection no longer in use, release tree " + c20560M9409);
                    }
                    this.f10039 = false;
                    c20560M9409.m46488();
                }
                if (c20560M9409 != null) {
                    c20560M9409.m46488();
                }
                if (this.f10038 != null && this.f10040) {
                    this.f10040 = false;
                    this.f10038.m9417();
                }
            } catch (Throwable th) {
                if (c20560M9409 != null) {
                    try {
                        c20560M9409.m46488();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        Object obj = this.f10042;
        if (obj != null) {
            synchronized (this) {
                try {
                    interfaceC4410.mo9183("Disconnecting exclusive transport");
                    this.f10042 = null;
                    this.f10041 = null;
                    this.f10039 = false;
                    ((AbstractRunnableC9160) obj).m21114();
                    ((AbstractRunnableC9160) obj).m21112(false, false);
                } catch (Exception e) {
                    f10035.mo9186("Failed to close exclusive transport", (Throwable) e);
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
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m9410(C19218 c19218, InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, EnumC2572... enumC2572Arr) throws Exception {
        InterfaceC4410 interfaceC4410;
        char c;
        Exception exc;
        C5807 c5807M9418;
        C4466 c4466 = this;
        EnumSet enumSetNoneOf = enumC2572Arr.length == 0 ? EnumSet.noneOf(EnumC2572.class) : EnumSet.copyOf((Collection) Arrays.asList(enumC2572Arr));
        InterfaceC17916 interfaceC17916 = interfaceC9571 instanceof InterfaceC17916 ? (InterfaceC17916) interfaceC9571 : null;
        String path = interfaceC17916 != null ? interfaceC17916.getPath() : null;
        String strMo8767 = interfaceC17916 != null ? interfaceC17916.mo8767() : null;
        String str = "\\" + c19218.m43773() + "\\" + c19218.m43769() + c19218.m43775();
        int iM35122 = ((C15410) c4466.f10037.mo29602()).m35122();
        String str2 = null;
        Exception exc2 = null;
        int i = 1;
        while (true) {
            interfaceC4410 = f10035;
            if (i > iM35122) {
                break;
            }
            if (interfaceC17916 != null) {
                interfaceC17916.mo8757(str2, str2, str);
            }
            try {
                return c4466.m9403(c19218, interfaceC9571, interfaceC3835, enumSetNoneOf);
            } catch (C5255 e) {
                C5255 c5255 = e;
                if (enumSetNoneOf.contains(EnumC2572.NO_RETRY) || (!(c5255.getCause() instanceof C3992) && c5255.m11333() != -1073741811)) {
                    interfaceC4410.mo9176("Not retrying", (Exception) c5255);
                    throw c5255;
                }
                c = 1;
                interfaceC4410.mo9176("send", (Exception) c5255);
                exc = c5255;
                if (interfaceC4410.mo9181()) {
                    Integer numValueOf = Integer.valueOf(i);
                    Integer numValueOf2 = Integer.valueOf(iM35122);
                    Object[] objArr = new Object[3];
                    objArr[0] = numValueOf;
                    objArr[c] = numValueOf2;
                    objArr[2] = interfaceC9571;
                    interfaceC4410.mo9183(String.format("Retrying (%d/%d) request %s", objArr));
                }
                interfaceC4410.mo9176("Disconnecting tree on send retry", exc);
                m9419();
                if (i >= iM35122) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC4410.mo9176("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C5255("All attempts failed, but no exception");
                }
                if (i != 1) {
                    try {
                        Thread.sleep(f10036.nextInt(1000) + 500);
                    } catch (InterruptedException e2) {
                        interfaceC4410.mo9176("interrupted sleep in send", (Exception) e2);
                    }
                }
                if (interfaceC9571 != null) {
                    interfaceC4410.mo9183("Restting request");
                    interfaceC9571.reset();
                }
                if (interfaceC17916 != null) {
                    interfaceC17916.mo8756(path);
                    interfaceC17916.mo8757(interfaceC17916.mo8763(), interfaceC17916.mo8755(), strMo8767);
                }
                if (interfaceC3835 != null) {
                    interfaceC3835.reset();
                }
                try {
                    c5807M9418 = m9418(c19218);
                    try {
                        interfaceC4410.mo9183("Have new tree connection for retry");
                        c5807M9418.close();
                    } catch (Throwable th) {
                        try {
                            c5807M9418.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C5255 e3) {
                    interfaceC4410.mo9176("Failed to connect tree on retry", (Exception) e3);
                    exc = e3;
                }
                i++;
                str2 = null;
                c4466 = this;
                exc2 = exc;
            } catch (C20777 e4) {
                C20777 c20777 = e4;
                interfaceC4410.mo9176("send", (Exception) c20777);
                c = 1;
                exc = c20777;
                if (interfaceC4410.mo9181()) {
                    Integer numValueOf3 = Integer.valueOf(i);
                    Integer numValueOf4 = Integer.valueOf(iM35122);
                    Object[] objArr2 = new Object[3];
                    objArr2[0] = numValueOf3;
                    objArr2[c] = numValueOf4;
                    objArr2[2] = interfaceC9571;
                    interfaceC4410.mo9183(String.format("Retrying (%d/%d) request %s", objArr2));
                }
                interfaceC4410.mo9176("Disconnecting tree on send retry", exc);
                m9419();
                if (i >= iM35122) {
                    exc2 = exc;
                    if (exc2 != null) {
                        interfaceC4410.mo9176("All attempts have failed, last exception", exc2);
                        throw exc2;
                    }
                    throw new C5255("All attempts failed, but no exception");
                }
                if (i != 1) {
                    Thread.sleep(f10036.nextInt(1000) + 500);
                }
                if (interfaceC9571 != null) {
                    interfaceC4410.mo9183("Restting request");
                    interfaceC9571.reset();
                }
                if (interfaceC17916 != null) {
                    interfaceC17916.mo8756(path);
                    interfaceC17916.mo8757(interfaceC17916.mo8763(), interfaceC17916.mo8755(), strMo8767);
                }
                if (interfaceC3835 != null) {
                    interfaceC3835.reset();
                }
                c5807M9418 = m9418(c19218);
                interfaceC4410.mo9183("Have new tree connection for retry");
                c5807M9418.close();
                i++;
                str2 = null;
                c4466 = this;
                exc2 = exc;
            }
            i++;
            str2 = null;
            c4466 = this;
            exc2 = exc;
        }
        if (exc2 != null) {
            interfaceC4410.mo9176("All attempts have failed, last exception", exc2);
            throw exc2;
        }
        throw new C5255("All attempts failed, but no exception");
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC3835 m9403(C19218 c19218, InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, EnumSet enumSet) throws C20777 {
        for (int i = 10; i > 0; i--) {
            if (interfaceC9571 instanceof InterfaceC17916) {
                m9414(c19218, (InterfaceC17916) interfaceC9571);
            }
            try {
                C20560 c20560M9409 = m9409();
                try {
                    if (c20560M9409 == null) {
                        throw new C20777("Failed to get tree connection");
                    }
                    InterfaceC3835 interfaceC3835M46490 = c20560M9409.m46490(interfaceC9571, interfaceC3835, enumSet);
                    c20560M9409.m46488();
                    return interfaceC3835M46490;
                } catch (Throwable th) {
                    if (c20560M9409 != null) {
                        try {
                            c20560M9409.m46488();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (C9140 e) {
                ((C10541) e.m21086()).mo24307();
                interfaceC9571.reset();
                f10035.mo9192("send0", e);
            }
        }
        throw new C20777("Loop in DFS referrals");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C5807 m9418(C19218 c19218) throws C5255 {
        try {
            return m9411(c19218);
        } catch (UnknownHostException e) {
            throw new C5255("Failed to connect to server", e);
        } catch (C5255 e2) {
            throw e2;
        } catch (IOException e3) {
            throw new C5255("Failed to connect to server", e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C5807 m9412(C19218 c19218, String str) {
        return m9413(c19218, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized C5807 m9413(C19218 c19218, String str, InterfaceC17245 interfaceC17245) {
        String strM54202;
        InterfaceC17245 interfaceC17245M34597;
        String str2;
        String str3;
        C10541 next;
        Throwable th;
        C24582 c24582;
        C20560 c20560M9409 = m9409();
        String strM43775 = null;
        if (c20560M9409 != null) {
            try {
                InterfaceC4410 interfaceC4410 = f10035;
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Tree is " + c20560M9409);
                }
                if (C12826.equals(c19218.m43769(), c20560M9409.m46502())) {
                    C24582 c24582M46501 = c20560M9409.m46501();
                    try {
                        strM54202 = c24582M46501.m54202();
                        if (!c24582M46501.m54209()) {
                            C21901 c21901M54201 = c24582M46501.m54201();
                            try {
                                C20560 c20560M9404 = m9404(c19218, str, c20560M9409.m46502(), c21901M54201, c20560M9409, null);
                                try {
                                    m9405(c20560M9404);
                                    C5807 c5807 = new C5807(c19218, this);
                                    c20560M9404.m46488();
                                    c21901M54201.m21114();
                                    c24582M46501.m54210();
                                    c20560M9409.m46488();
                                    return c5807;
                                } catch (Throwable th2) {
                                    try {
                                        c20560M9404.m46488();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                try {
                                    c21901M54201.m21114();
                                    throw th4;
                                } catch (Throwable th5) {
                                    th4.addSuppressed(th5);
                                    throw th4;
                                }
                            }
                        }
                        interfaceC4410.mo9183("Session no longer valid");
                        c24582M46501.m54210();
                    } catch (Throwable th6) {
                        try {
                            c24582M46501.m54210();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                    try {
                        c20560M9409.m46488();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
                strM54202 = null;
            } catch (Throwable th9) {
                c20560M9409.m46488();
                throw th9;
            }
        } else {
            strM54202 = null;
        }
        if (c20560M9409 != null) {
            c20560M9409.m46488();
        }
        String strM43772 = c19218.m43772();
        if (c19218.m43766() != 8 && c19218.m43775() != null && !"\\".equals(c19218.m43775())) {
            strM43775 = c19218.m43775();
        }
        String strM43769 = c19218.m43769();
        if (interfaceC17245 != null) {
            interfaceC17245M34597 = interfaceC17245;
        } else {
            interfaceC17245M34597 = ((C15174) this.f10037.mo29603()).m34597(this.f10037, strM43772, c19218.m43769(), strM43775);
        }
        String str4 = strM54202;
        C19218 c19219 = c19218;
        InterfaceC17245 interfaceC17246 = interfaceC17245M34597;
        String str5 = str;
        while (true) {
            if (interfaceC17246 != null) {
                String strMo24312 = interfaceC17246.mo24312();
                String lowerCase = interfaceC17246.mo24298().toLowerCase(Locale.ROOT);
                strM43769 = interfaceC17246.mo24310();
                str3 = strMo24312;
                str2 = lowerCase;
            } else {
                str2 = str5;
                str3 = str4;
            }
            String str6 = strM43769;
            try {
                C21901 c21901 = (C21901) ((C17205) this.f10037.mo29600()).m38960(this.f10037, str2, c19219.m43771(), false, c19219.m43774());
                c21901.m49425(InterfaceC11172.class);
                try {
                    try {
                        C24582 c24582M49426 = c21901.m49426(this.f10037, str2, str3);
                        c24582M49426.m54203();
                        try {
                            C20560 c20560M54196 = c24582M49426.m54196(str6);
                            c20560M54196.m46499();
                            c24582 = c24582M49426;
                            try {
                                C20560 c20560M9405 = m9404(c19218, str2, str6, c21901, c20560M54196, interfaceC17246);
                                if (interfaceC17246 != null) {
                                    try {
                                        c20560M9405.m46493(interfaceC17246);
                                        if (interfaceC17246 != interfaceC17245M34597) {
                                            interfaceC17246.mo24307().mo24315();
                                        }
                                    } catch (Throwable th10) {
                                        try {
                                            c20560M9405.m46488();
                                        } catch (Throwable th11) {
                                            th10.addSuppressed(th11);
                                        }
                                        throw th10;
                                    }
                                }
                                m9405(c20560M9405);
                                C5807 c5808 = new C5807(c19218, this);
                                c20560M9405.m46488();
                                try {
                                    c20560M54196.m46488();
                                    c24582.m54210();
                                    try {
                                        c21901.m21114();
                                        return c5808;
                                    } catch (IOException e) {
                                        e = e;
                                        c19219 = c19218;
                                        f10035.mo9176("Referral failed, trying next", (Exception) e);
                                        interfaceC17246 = interfaceC17246;
                                        if (interfaceC17246 != null) {
                                            next = interfaceC17246.next();
                                        }
                                        if (interfaceC17246 == interfaceC17245M34597) {
                                            interfaceC17246 = next;
                                            throw e;
                                        }
                                        interfaceC17246 = next;
                                        str5 = str2;
                                        str4 = str3;
                                        strM43769 = str6;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    Throwable th13 = th;
                                    try {
                                        c24582.m54210();
                                        throw th13;
                                    } catch (Throwable th14) {
                                        th13.addSuppressed(th14);
                                        throw th13;
                                    }
                                }
                            } catch (Throwable th15) {
                                try {
                                    c20560M54196.m46488();
                                } catch (Throwable th16) {
                                    th15.addSuppressed(th16);
                                }
                                throw th15;
                            }
                        } catch (Throwable th17) {
                            th = th17;
                            c24582 = c24582M49426;
                        }
                    } catch (Throwable th18) {
                        th = th18;
                        c19219 = c19218;
                        try {
                            c21901.m21114();
                        } catch (Throwable th19) {
                            th.addSuppressed(th19);
                        }
                        throw th;
                    }
                } catch (Throwable th20) {
                    th = th20;
                    c21901.m21114();
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            interfaceC17246 = next;
            str5 = str2;
            str4 = str3;
            strM43769 = str6;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C20560 m9404(C19218 c19218, String str, String str2, InterfaceC11172 interfaceC11172, C20560 c20560, InterfaceC17245 interfaceC17245) {
        InterfaceC4410 interfaceC4410 = f10035;
        boolean zMo9181 = interfaceC4410.mo9181();
        InterfaceC20106 interfaceC20106 = this.f10037;
        if (zMo9181 && ((C21901) interfaceC11172).m49443() && !c19218.m43770()) {
            interfaceC20106.mo29602().getClass();
            interfaceC4410.mo9183("Signatures for file enabled but not required " + this);
        }
        if (interfaceC17245 != null) {
            c20560.m46504();
        }
        try {
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196("doConnect: " + str);
            }
            c20560.m46489((InterfaceC9571) null, (InterfaceC3835) null);
            c20560.m46492();
            return c20560;
        } catch (C23360 e) {
            interfaceC4410.mo9176("Authentication failed", (Exception) e);
            C24582 c24582M46501 = c20560.m46501();
            try {
                if (c24582M46501.m54207().mo18056() || c24582M46501.m54207().mo18054()) {
                    try {
                        C24582 c24582M49426 = ((C21901) interfaceC11172).m49426(interfaceC20106.mo8531(), c24582M46501.m54200(), c24582M46501.m54202());
                        c24582M49426.m54203();
                        try {
                            C20560 c20560M54196 = c24582M49426.m54196(str2);
                            c20560M54196.m46499();
                            try {
                                c20560M54196.m46489((InterfaceC9571) null, (InterfaceC3835) null);
                                interfaceC4410.mo9183("Anonymous retry succeeded");
                                c20560M54196.m46492();
                                c20560M54196.m46488();
                                c24582M49426.m54210();
                                c24582M46501.m54210();
                                return c20560M54196;
                            } catch (Throwable th) {
                                try {
                                    c20560M54196.m46488();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                c24582M49426.m54210();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Exception e2) {
                        interfaceC4410.mo9176("Retry also failed", e2);
                        throw e;
                    }
                }
                c19218.m43768().toString();
                if (!interfaceC20106.mo8533()) {
                    throw e;
                }
                interfaceC4410.mo9183("Trying to renew credentials after auth error");
                C24582 c24582M49427 = ((C21901) interfaceC11172).m49426(interfaceC20106, c24582M46501.m54200(), c24582M46501.m54202());
                c24582M49427.m54203();
                try {
                    C20560 c20560M54197 = c24582M49427.m54196(str2);
                    c20560M54197.m46499();
                    if (interfaceC17245 != null) {
                        try {
                            c20560M54197.m46504();
                        } catch (Throwable th5) {
                            try {
                                c20560M54197.m46488();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    }
                    c20560M54197.m46489((InterfaceC9571) null, (InterfaceC3835) null);
                    c20560M54197.m46492();
                    c20560M54197.m46488();
                    c24582M49427.m54210();
                    c24582M46501.m54210();
                    return c20560M54197;
                } catch (Throwable th7) {
                    try {
                        c24582M49427.m54210();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (Throwable th9) {
                c24582M46501.m54210();
                throw th9;
            }
            try {
                c24582M46501.m54210();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8035 m9414(C19218 c19218, InterfaceC17916 interfaceC17916) {
        if (interfaceC17916 instanceof C3874) {
            return c19218;
        }
        for (int i = 0; i < ((C15410) this.f10037.mo29602()).m35122() + 1; i++) {
            try {
                return m9408(c19218, interfaceC17916);
            } catch (C5255 e) {
                if (e.m11333() != -1073741275 && !(e.getCause() instanceof C3992)) {
                    throw e;
                }
                InterfaceC4410 interfaceC4410 = f10035;
                interfaceC4410.mo9176("resolveDfs", (Exception) e);
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Retrying (" + i + ") resolveDfs: " + interfaceC17916);
                }
                interfaceC4410.mo9183("Disconnecting tree on DFS retry");
                m9419();
                try {
                    Thread.sleep(f10036.nextInt(OpenAuthTask.Duplex) + 500);
                } catch (InterruptedException e2) {
                    interfaceC4410.mo9176("resolveDfs", (Exception) e2);
                }
                m9418(c19218).close();
            }
        }
        return c19218;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[Catch: all -> 0x01f7, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x01f7, blocks: (B:3:0x0014, B:56:0x013d, B:75:0x016b, B:92:0x01b6, B:30:0x009e, B:101:0x01c9, B:128:0x01f6, B:127:0x01f3, B:123:0x01ed, B:4:0x0018, B:55:0x013a, B:74:0x0168, B:91:0x01b3, B:29:0x009b, B:100:0x01c6, B:119:0x01e8, B:118:0x01e5), top: B:144:0x0014, inners: #0, #5 }] */
    /* JADX INFO: renamed from: ۧ */
    private InterfaceC8035 m9408(C19218 c19218, InterfaceC17916 interfaceC17916) throws C5255 {
        String strMo8767;
        InterfaceC20106 interfaceC20106 = this.f10037;
        C5807 c5807M9418 = m9418(c19218);
        try {
            C24582 c24582M13074 = c5807M9418.m13074();
            try {
                C21901 c21901M54201 = c24582M13074.m54201();
                try {
                    try {
                        C20560 c20560M9409 = m9409();
                        try {
                            c21901M54201.m49438();
                            String path = interfaceC17916 != null ? interfaceC17916.getPath() : c19218.m43775();
                            if (interfaceC17916 != null) {
                                strMo8767 = interfaceC17916.mo8767();
                            } else {
                                strMo8767 = "\\" + c19218.m43773() + '\\' + c19218.m43769() + c19218.m43775();
                            }
                            boolean zM46497 = c20560M9409.m46497();
                            InterfaceC4410 interfaceC4410 = f10035;
                            if (zM46497 || !c20560M9409.m46503()) {
                                if (!c20560M9409.m46497()) {
                                    interfaceC4410.mo9196("Not in DFS");
                                    c20560M9409.m46488();
                                    c21901M54201.m21114();
                                    c24582M13074.m54210();
                                    c5807M9418.close();
                                    return c19218;
                                }
                                InterfaceC17245 interfaceC17245M46505 = c20560M9409.m46505();
                                if (interfaceC17245M46505 != null) {
                                    if (interfaceC4410.mo9181()) {
                                        interfaceC4410.mo9183(String.format("Need to adjust request path %s (full: %s) -> %s", path, strMo8767, interfaceC17245M46505));
                                    }
                                    String strM43760 = c19218.m43760(interfaceC17245M46505, path);
                                    if (interfaceC17916 != null) {
                                        interfaceC17916.mo8756(strM43760);
                                    }
                                    c20560M9409.m46488();
                                    c21901M54201.m21114();
                                    c24582M13074.m54210();
                                    c5807M9418.close();
                                    return c19218;
                                }
                                interfaceC4410.mo9183("No tree referral but in DFS");
                            }
                            if (interfaceC17916 != null) {
                                interfaceC17916.mo8757(c24582M13074.m54202(), c24582M13074.m54200(), strMo8767);
                            }
                            InterfaceC17245 interfaceC17245M34597 = ((C15174) interfaceC20106.mo29603()).m34597(interfaceC20106, c19218.m43773(), c19218.m43769(), c19218.m43775());
                            if (interfaceC17245M34597 == null) {
                                if (!c20560M9409.m46497() || (interfaceC17916 instanceof C3874) || (interfaceC17916 instanceof C18626)) {
                                    interfaceC4410.mo9196("Not in DFS");
                                    c20560M9409.m46488();
                                    c21901M54201.m21114();
                                    c24582M13074.m54210();
                                    c5807M9418.close();
                                    return c19218;
                                }
                                if (interfaceC4410.mo9181()) {
                                    interfaceC4410.mo9183("No referral available for  " + strMo8767);
                                }
                                throw new C20777("No referral but in domain DFS " + strMo8767);
                            }
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9183("Resolved " + strMo8767 + " -> " + interfaceC17245M34597);
                            }
                            String strM43761 = c19218.m43760(interfaceC17245M34597, path);
                            if (interfaceC17916 != null) {
                                interfaceC17916.mo8756(strM43761);
                            }
                            if (c20560M9409.m46502().equals(interfaceC17245M34597.mo24310())) {
                                c20560M9409.m46488();
                                c21901M54201.m21114();
                                c24582M13074.m54210();
                                c5807M9418.close();
                                return c19218;
                            }
                            InterfaceC17245 next = interfaceC17245M34597;
                            do {
                                if (interfaceC4410.mo9181()) {
                                    interfaceC4410.mo9183("Need to switch tree for " + next);
                                }
                                try {
                                    C5807 c5807M9413 = m9413(c19218, c24582M13074.m54200(), next);
                                    try {
                                        interfaceC4410.mo9183("Switched tree");
                                        c5807M9413.close();
                                        c20560M9409.m46488();
                                        c21901M54201.m21114();
                                        c24582M13074.m54210();
                                        c5807M9418.close();
                                        return c19218;
                                    } catch (Throwable th) {
                                        try {
                                            c5807M9413.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e) {
                                    interfaceC4410.mo9176("Failed to connect tree", (Exception) e);
                                    next = next.next();
                                }
                            } while (next != interfaceC17245M34597);
                            throw new C20777("All referral tree connections failed", e);
                        } catch (Throwable th3) {
                            if (c20560M9409 == null) {
                                throw th3;
                            }
                            try {
                                c20560M9409.m46488();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            if (c24582M13074 != null) {
                                throw th;
                            }
                            try {
                                c24582M13074.m54210();
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                    } catch (Throwable th6) {
                        c21901M54201.m21114();
                        throw th6;
                    }
                    c21901M54201.m21114();
                    throw th6;
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                    throw th6;
                }
            } catch (Throwable th8) {
                if (c24582M13074 != null) {
                    throw th8;
                }
                c24582M13074.m54210();
                throw th8;
            }
        } catch (Throwable th9) {
            try {
                c5807M9418.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final long m9422() {
        C20560 c20560M9406 = m9406();
        if (c20560M9406 == null) {
            return -1L;
        }
        return c20560M9406.m46500();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C24582 m9423() {
        C20560 c20560M9406 = m9406();
        if (c20560M9406 != null) {
            return c20560M9406.m46501();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m9420() {
        C20560 c20560M9409 = m9409();
        try {
            int iM46498 = c20560M9409.m46498();
            c20560M9409.m46488();
            return iM46498;
        } catch (Throwable th) {
            if (c20560M9409 != null) {
                try {
                    c20560M9409.m46488();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m9416(C4466 c4466) {
        C20560 c20560M9409 = m9409();
        try {
            C20560 c20560M94010 = c4466.m9409();
            boolean z = c20560M9409 == c20560M94010;
            if (c20560M94010 != null) {
                c20560M94010.m46488();
            }
            if (c20560M9409 != null) {
                c20560M9409.m46488();
            }
            return z;
        } catch (Throwable th) {
            if (c20560M9409 != null) {
                try {
                    c20560M9409.m46488();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
