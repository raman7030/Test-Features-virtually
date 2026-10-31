package l;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۟֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9US */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC7146 implements Runnable, AutoCloseable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static int f21931;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f21932 = C11321.m27961(AbstractRunnableC7146.class);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile int f21933 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f21934;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f21935;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile Thread f21936;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile C1708 f21937;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f21938;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f21939;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f21940;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m19160(long j) {
        Thread thread = this.f21936;
        if (thread != null && Thread.currentThread() != thread) {
            this.f21936 = null;
            try {
                InterfaceC2148 interfaceC2148 = f21932;
                interfaceC2148.mo7088("Interrupting transport thread");
                thread.interrupt();
                interfaceC2148.mo7088("Joining transport thread");
                thread.join(j);
                interfaceC2148.mo7088("Joined transport thread");
            } catch (InterruptedException e) {
                throw new C1708("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.f21936 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19165(Long l2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19166(InterfaceC7578 interfaceC7578);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo19167(InterfaceC13495 interfaceC13495);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo19168(InterfaceC7578 interfaceC7578, InterfaceC13495 interfaceC13495) {
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public abstract Long mo19170();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo19173(InterfaceC7578 interfaceC7578);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19175(boolean z, boolean z2);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract long mo19177(InterfaceC7578 interfaceC7578);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract void mo19179();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m19174(long j) {
        int i = this.f21933;
        try {
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 3) {
                                int i2 = this.f21933;
                                if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                    f21932.mo7080("Invalid state: " + i2);
                                    this.f21933 = 6;
                                    m19160(j);
                                }
                                return true;
                            }
                            if (i == 4) {
                                this.f21933 = 6;
                                throw new C1708("Connection in error", this.f21937);
                            }
                            if (i != 5 && i != 6) {
                                throw new C1708("Invalid state: " + i);
                            }
                            InterfaceC2148 interfaceC2148 = f21932;
                            interfaceC2148.mo7088("Trying to connect a disconnected transport");
                            int i3 = this.f21933;
                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                interfaceC2148.mo7080("Invalid state: " + i3);
                                this.f21933 = 6;
                                m19160(j);
                            }
                            return false;
                        }
                        this.f21936.wait(j);
                        int i4 = this.f21933;
                        if (i4 == 1) {
                            this.f21933 = 6;
                            m19160(j);
                            throw new C5735("Connection timeout");
                        }
                        if (i4 == 2) {
                            if (this.f21937 != null) {
                                this.f21933 = 4;
                                m19160(j);
                                throw this.f21937;
                            }
                            this.f21933 = 3;
                            int i5 = this.f21933;
                            if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                f21932.mo7080("Invalid state: " + i5);
                                this.f21933 = 6;
                                m19160(j);
                            }
                            return true;
                        }
                    }
                    InterfaceC2148 interfaceC2149 = f21932;
                    if (interfaceC2149.mo7086()) {
                        interfaceC2149.mo7088("Connecting " + this.f21940);
                    }
                    this.f21933 = 1;
                    this.f21937 = null;
                    Thread thread = new Thread(this, this.f21940);
                    thread.setDaemon(true);
                    this.f21936 = thread;
                    synchronized (this.f21936) {
                        thread.start();
                        thread.wait(j);
                        int i6 = this.f21933;
                        if (i6 == 1) {
                            this.f21933 = 6;
                            throw new C5735("Connection timeout");
                        }
                        if (i6 == 2) {
                            if (this.f21937 != null) {
                                this.f21933 = 4;
                                throw this.f21937;
                            }
                            this.f21933 = 3;
                            int i7 = this.f21933;
                            if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                                interfaceC2149.mo7080("Invalid state: " + i7);
                                this.f21933 = 6;
                                m19160(j);
                            }
                            return true;
                        }
                        if (i6 != 3) {
                            int i8 = this.f21933;
                            if (i8 != 0 && i8 != 3 && i8 != 4 && i8 != 5 && i8 != 6) {
                                interfaceC2149.mo7080("Invalid state: " + i8);
                                this.f21933 = 6;
                                m19160(j);
                            }
                            return false;
                        }
                        int i9 = this.f21933;
                        if (i9 != 0 && i9 != 3 && i9 != 4 && i9 != 5 && i9 != 6) {
                            interfaceC2149.mo7080("Invalid state: " + i9);
                            this.f21933 = 6;
                            m19160(j);
                        }
                        return true;
                    }
                } catch (C1708 e) {
                    m19160(j);
                    throw e;
                }
            } catch (InterruptedException e2) {
                this.f21933 = 6;
                m19160(j);
                throw new C1708(e2);
            } catch (C5735 e3) {
                m19160(j);
                this.f21933 = 0;
                throw e3;
            }
        } catch (Throwable th) {
            int i10 = this.f21933;
            if (i10 != 0 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
                f21932.mo7080("Invalid state: " + i10);
                this.f21933 = 6;
                m19160(j);
            }
            throw th;
        }
    }

    public AbstractRunnableC7146() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f21931;
        f21931 = i + 1;
        sb.append(i);
        this.f21940 = sb.toString();
        this.f21939 = new Object();
        this.f21938 = new Object();
        this.f21934 = new ConcurrentMapC10942(10);
        this.f21935 = new AtomicLong(1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19158(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        if (i + i2 > bArr.length) {
            throw new IOException("Buffer too short, bufsize " + bArr.length + " read " + i2);
        }
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 <= 0) {
                break;
            }
            i3 += i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19164() {
        long jIncrementAndGet = this.f21935.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f21932;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire transport " + jIncrementAndGet + " " + this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m19171();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m19171() {
        long jDecrementAndGet = this.f21935.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f21932;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C13017("Usage count dropped below zero");
            }
        } else if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Transport usage dropped to zero " + this);
        }
    }

    public final void finalize() {
        if (mo19180() || this.f21935.get() == 0) {
            return;
        }
        f21932.mo7104("Session was not properly released");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m19176() {
        return this.f21935.get();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean mo19180() {
        return this.f21933 == 4 || this.f21933 == 5 || this.f21933 == 6 || this.f21933 == 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean mo19172() {
        return this.f21933 == 5 || this.f21933 == 6;
    }

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
    public final InterfaceC13495 mo19163(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) throws C1708 {
        if (mo19180() && this.f21933 != 5) {
            throw new C1708("Transport is disconnected " + this.f21940);
        }
        try {
            try {
                try {
                    long jMo19173 = !set.contains(EnumC0214.NO_TIMEOUT) ? mo19173(interfaceC7578) : 0L;
                    long jM19162 = m19162(interfaceC7578, interfaceC1543, set, jMo19173);
                    if (Thread.currentThread() == this.f21936) {
                        synchronized (this.f21939) {
                            Long lMo19170 = mo19170();
                            if (lMo19170.longValue() == jM19162) {
                                mo19167(interfaceC1543);
                                interfaceC1543.mo28228();
                                InterfaceC13495 interfaceC13495Mo5429 = interfaceC1543;
                                while (interfaceC13495Mo5429 != null) {
                                    this.f21934.remove(Long.valueOf(interfaceC13495Mo5429.mo28210()));
                                    interfaceC7578 = interfaceC7578.mo20322();
                                    if (interfaceC7578 == null) {
                                        break;
                                    }
                                    interfaceC13495Mo5429 = interfaceC7578.mo5429();
                                }
                                return interfaceC1543;
                            }
                            mo19165(lMo19170);
                        }
                    }
                    m19159(interfaceC7578, interfaceC1543, jMo19173);
                    InterfaceC13495 interfaceC13495Mo54210 = interfaceC1543;
                    while (interfaceC13495Mo54210 != null) {
                        this.f21934.remove(Long.valueOf(interfaceC13495Mo54210.mo28210()));
                        interfaceC7578 = interfaceC7578.mo20322();
                        if (interfaceC7578 == null) {
                            break;
                        }
                        interfaceC13495Mo54210 = interfaceC7578.mo5429();
                    }
                    return interfaceC1543;
                } catch (InterruptedException e) {
                    throw new C1708(e);
                }
            } catch (IOException e2) {
                f21932.mo7083("sendrecv failed", (Throwable) e2);
                try {
                    m19178();
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                    f21932.mo7089("disconnect failed", (Exception) e3);
                }
                throw e2;
            }
        } catch (Throwable th) {
            InterfaceC13495 interfaceC13495Mo54211 = interfaceC1543;
            while (interfaceC13495Mo54211 != null) {
                this.f21934.remove(Long.valueOf(interfaceC13495Mo54211.mo28210()));
                interfaceC7578 = interfaceC7578.mo20322();
                if (interfaceC7578 == null) {
                    break;
                }
                interfaceC13495Mo54211 = interfaceC7578.mo5429();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m19162(InterfaceC7578 interfaceC7578, InterfaceC13495 interfaceC13495, Set set, long j) {
        InterfaceC7578 interfaceC7578Mo20322 = interfaceC7578;
        long j2 = 0;
        while (interfaceC13495 != null) {
            interfaceC13495.reset();
            if (set.contains(EnumC0214.RETAIN_PAYLOAD)) {
                interfaceC13495.mo10429();
            }
            long jMo19177 = mo19177(interfaceC7578Mo20322);
            if (j2 == 0) {
                j2 = jMo19177;
            }
            if (j > 0) {
                interfaceC13495.mo28203(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                interfaceC13495.mo28203((Long) null);
            }
            interfaceC13495.m32527(jMo19177);
            this.f21934.put(Long.valueOf(jMo19177), interfaceC13495);
            interfaceC7578Mo20322 = interfaceC7578Mo20322.mo20322();
            if (interfaceC7578Mo20322 == null) {
                break;
            }
            interfaceC13495 = interfaceC7578Mo20322.mo5429();
        }
        mo19166(interfaceC7578);
        return j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19159(InterfaceC7578 interfaceC7578, InterfaceC13495 interfaceC13495, long j) {
        InterfaceC7578 interfaceC7578Mo20322 = interfaceC7578;
        while (interfaceC13495 != null) {
            synchronized (interfaceC13495) {
                if (interfaceC13495.mo28213()) {
                    interfaceC7578Mo20322 = interfaceC7578Mo20322.mo20322();
                    if (interfaceC7578Mo20322 == null) {
                        return;
                    } else {
                        interfaceC13495 = interfaceC7578Mo20322.mo5429();
                    }
                } else if (j > 0) {
                    interfaceC13495.wait(j);
                    if (interfaceC13495.mo28213() || !mo19168(interfaceC7578Mo20322, interfaceC13495)) {
                        if (interfaceC13495.mo28209()) {
                            throw new C1708(this.f21940 + " error reading response to " + interfaceC7578Mo20322, interfaceC13495.getException());
                        }
                        if (mo19180() && this.f21933 != 5) {
                            throw new C1708(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.f21940, Integer.valueOf(this.f21933)));
                        }
                        j = interfaceC13495.mo28225().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            InterfaceC2148 interfaceC2148 = f21932;
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("State is " + this.f21933);
                            }
                            throw new C22668(this.f21940 + " timedout waiting for response to " + interfaceC7578Mo20322);
                        }
                    }
                } else {
                    interfaceC13495.wait();
                    if (!mo19168(interfaceC7578, interfaceC13495)) {
                        InterfaceC2148 interfaceC2149 = f21932;
                        if (interfaceC2149.mo7086()) {
                            interfaceC2149.mo7088("Wait returned state is " + this.f21933);
                        }
                        if (mo19180()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m19161() {
        while (this.f21936 == Thread.currentThread()) {
            try {
                synchronized (this.f21939) {
                    try {
                        try {
                            Long lMo19170 = mo19170();
                            if (lMo19170 == null) {
                                synchronized (this) {
                                    Iterator it = this.f21934.values().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC13495) it.next()).mo28208();
                                    }
                                }
                                throw new IOException("end of stream");
                            }
                            InterfaceC13495 interfaceC13495 = (InterfaceC13495) this.f21934.get(lMo19170);
                            if (interfaceC13495 == null) {
                                InterfaceC2148 interfaceC2148 = f21932;
                                if (interfaceC2148.mo7086()) {
                                    interfaceC2148.mo7088("Unexpected message id, skipping message " + lMo19170);
                                }
                                mo19165(lMo19170);
                            } else {
                                mo19167(interfaceC13495);
                                interfaceC13495.mo28228();
                            }
                        } catch (SocketTimeoutException e) {
                            f21932.mo7097("Socket timeout during peekKey", e);
                            if (this.f21935.get() > 0) {
                                InterfaceC2148 interfaceC2149 = f21932;
                                if (interfaceC2149.mo7086()) {
                                    interfaceC2149.mo7088("Transport still in use, no idle timeout " + this);
                                }
                                for (InterfaceC13495 interfaceC13496 : this.f21934.values()) {
                                    synchronized (interfaceC13496) {
                                        interfaceC13496.notifyAll();
                                    }
                                }
                            } else {
                                InterfaceC2148 interfaceC21410 = f21932;
                                if (interfaceC21410.mo7086()) {
                                    interfaceC21410.mo7088("Idle timeout on " + this.f21940);
                                }
                                throw e;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                boolean z = false;
                boolean z2 = (e2 instanceof SocketTimeoutException) || (message != null && message.equals("Read timed out"));
                if (message != null && message.equals("Socket closed")) {
                    f21932.mo7101("Remote closed connection");
                } else if (z2) {
                    f21932.mo7081("socket timeout in non peek state", e2);
                } else {
                    f21932.mo7081("recv failed", e2);
                }
                synchronized (this) {
                    try {
                        m19169(!z2, false);
                    } catch (IOException e3) {
                        e2.addSuppressed(e3);
                        f21932.mo7083("Failed to disconnect", (Throwable) e3);
                    }
                    f21932.mo7088("Disconnected");
                    Iterator it2 = this.f21934.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC13495) ((Map.Entry) it2.next()).getValue()).mo28202(e2);
                        it2.remove();
                        z = true;
                    }
                    if (z) {
                        f21932.mo7088("Notified clients");
                    } else {
                        f21932.mo7081("Exception without a request pending", e2);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19178() {
        m19169(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:14:0x0019, B:32:0x0057, B:27:0x004e, B:17:0x0034, B:22:0x0041, B:26:0x004c), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0055, please report this as an issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m19169(boolean z, boolean z2) {
        int i = this.f21933;
        if (i != 0) {
            IOException iOException = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        e = null;
                        this.f21936 = null;
                        this.f21933 = 6;
                        iOException = e;
                    } else if (i != 5 && i != 6) {
                        f21932.mo7080("Invalid state: " + this.f21933);
                        this.f21936 = null;
                        this.f21933 = 6;
                    }
                }
                if (iOException == null) {
                    return false;
                }
                throw iOException;
            }
            z = true;
            if (this.f21934.size() == 0 || z || !z2) {
                try {
                    this.f21933 = 5;
                    boolean zMo19175 = mo19175(z, z2);
                    this.f21933 = 6;
                    return zMo19175;
                } catch (IOException e) {
                    e = e;
                    this.f21933 = 6;
                }
            }
            if (iOException == null) {
                return false;
            }
            throw iOException;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        try {
            if (this.f21933 != 5 && this.f21933 != 6) {
                mo19179();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f21936) {
                    return;
                }
                this.f21933 = 2;
                threadCurrentThread.notify();
                m19161();
            }
        } catch (Exception e) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f21936) {
                    if (e instanceof SocketTimeoutException) {
                        f21932.mo7081("Timeout connecting", e);
                    } else {
                        f21932.mo7083("Exception in transport thread", (Throwable) e);
                    }
                } else {
                    if (e instanceof SocketTimeoutException) {
                        this.f21937 = new C5735(e);
                    } else {
                        this.f21937 = new C1708(e);
                    }
                    this.f21933 = 2;
                    threadCurrentThread.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f21936) {
                    return;
                }
                this.f21933 = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.f21940;
    }
}
