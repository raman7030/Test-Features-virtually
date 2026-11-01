package p067l;

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
public abstract class AbstractRunnableC9160 implements Runnable, AutoCloseable {

    /* JADX INFO: renamed from: ۛ */
    public static int f24810;

    /* JADX INFO: renamed from: ۨ */
    public static final InterfaceC4410 f24811 = C13128.m30022(AbstractRunnableC9160.class);

    /* JADX INFO: renamed from: ۗ */
    public volatile int f24812 = 0;

    /* JADX INFO: renamed from: ۙ */
    public final ConcurrentMapC12768 f24813;

    /* JADX INFO: renamed from: ۤ */
    public final AtomicLong f24814;

    /* JADX INFO: renamed from: ۫ */
    public volatile Thread f24815;

    /* JADX INFO: renamed from: ۬ */
    public volatile C3992 f24816;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f24817;

    /* JADX INFO: renamed from: ᩸ */
    public final Object f24818;

    /* JADX INFO: renamed from: ᩹ */
    public String f24819;

    /* JADX INFO: renamed from: ᩳ */
    private synchronized void m21103(long j) {
        Thread thread = this.f24815;
        if (thread != null && Thread.currentThread() != thread) {
            this.f24815 = null;
            try {
                InterfaceC4410 interfaceC4410 = f24811;
                interfaceC4410.mo9183("Interrupting transport thread");
                thread.interrupt();
                interfaceC4410.mo9183("Joining transport thread");
                thread.join(j);
                interfaceC4410.mo9183("Joined transport thread");
            } catch (InterruptedException e) {
                throw new C3992("Failed to join transport thread", e);
            }
        } else if (thread != null) {
            this.f24815 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21108(Long l2);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21109(InterfaceC9571 interfaceC9571);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo21110(InterfaceC15194 interfaceC15194);

    /* JADX INFO: renamed from: ֫ */
    public boolean mo21111(InterfaceC9571 interfaceC9571, InterfaceC15194 interfaceC15194) {
        return false;
    }

    /* JADX INFO: renamed from: ۖ */
    public abstract Long mo21113();

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo21116(InterfaceC9571 interfaceC9571);

    /* JADX INFO: renamed from: ۧ */
    public abstract boolean mo21118(boolean z, boolean z2);

    /* JADX INFO: renamed from: ܽ */
    public abstract long mo21120(InterfaceC9571 interfaceC9571);

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo21122();

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m21117(long j) {
        int i = this.f24812;
        try {
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 3) {
                                int i2 = this.f24812;
                                if (i2 != 0 && i2 != 3 && i2 != 4 && i2 != 5 && i2 != 6) {
                                    f24811.mo9175("Invalid state: " + i2);
                                    this.f24812 = 6;
                                    m21103(j);
                                }
                                return true;
                            }
                            if (i == 4) {
                                this.f24812 = 6;
                                throw new C3992("Connection in error", this.f24816);
                            }
                            if (i != 5 && i != 6) {
                                throw new C3992("Invalid state: " + i);
                            }
                            InterfaceC4410 interfaceC4410 = f24811;
                            interfaceC4410.mo9183("Trying to connect a disconnected transport");
                            int i3 = this.f24812;
                            if (i3 != 0 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6) {
                                interfaceC4410.mo9175("Invalid state: " + i3);
                                this.f24812 = 6;
                                m21103(j);
                            }
                            return false;
                        }
                        this.f24815.wait(j);
                        int i4 = this.f24812;
                        if (i4 == 1) {
                            this.f24812 = 6;
                            m21103(j);
                            throw new C7819("Connection timeout");
                        }
                        if (i4 == 2) {
                            if (this.f24816 != null) {
                                this.f24812 = 4;
                                m21103(j);
                                throw this.f24816;
                            }
                            this.f24812 = 3;
                            int i5 = this.f24812;
                            if (i5 != 0 && i5 != 3 && i5 != 4 && i5 != 5 && i5 != 6) {
                                f24811.mo9175("Invalid state: " + i5);
                                this.f24812 = 6;
                                m21103(j);
                            }
                            return true;
                        }
                    }
                    InterfaceC4410 interfaceC4411 = f24811;
                    if (interfaceC4411.mo9181()) {
                        interfaceC4411.mo9183("Connecting " + this.f24819);
                    }
                    this.f24812 = 1;
                    this.f24816 = null;
                    Thread thread = new Thread(this, this.f24819);
                    thread.setDaemon(true);
                    this.f24815 = thread;
                    synchronized (this.f24815) {
                        thread.start();
                        thread.wait(j);
                        int i6 = this.f24812;
                        if (i6 == 1) {
                            this.f24812 = 6;
                            throw new C7819("Connection timeout");
                        }
                        if (i6 == 2) {
                            if (this.f24816 != null) {
                                this.f24812 = 4;
                                throw this.f24816;
                            }
                            this.f24812 = 3;
                            int i7 = this.f24812;
                            if (i7 != 0 && i7 != 3 && i7 != 4 && i7 != 5 && i7 != 6) {
                                interfaceC4411.mo9175("Invalid state: " + i7);
                                this.f24812 = 6;
                                m21103(j);
                            }
                            return true;
                        }
                        if (i6 != 3) {
                            int i8 = this.f24812;
                            if (i8 != 0 && i8 != 3 && i8 != 4 && i8 != 5 && i8 != 6) {
                                interfaceC4411.mo9175("Invalid state: " + i8);
                                this.f24812 = 6;
                                m21103(j);
                            }
                            return false;
                        }
                        int i9 = this.f24812;
                        if (i9 != 0 && i9 != 3 && i9 != 4 && i9 != 5 && i9 != 6) {
                            interfaceC4411.mo9175("Invalid state: " + i9);
                            this.f24812 = 6;
                            m21103(j);
                        }
                        return true;
                    }
                } catch (C3992 e) {
                    m21103(j);
                    throw e;
                }
            } catch (InterruptedException e2) {
                this.f24812 = 6;
                m21103(j);
                throw new C3992(e2);
            } catch (C7819 e3) {
                m21103(j);
                this.f24812 = 0;
                throw e3;
            }
        } catch (Throwable th) {
            int i10 = this.f24812;
            if (i10 != 0 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
                f24811.mo9175("Invalid state: " + i10);
                this.f24812 = 6;
                m21103(j);
            }
            throw th;
        }
    }

    public AbstractRunnableC9160() {
        StringBuilder sb = new StringBuilder("Transport");
        int i = f24810;
        f24810 = i + 1;
        sb.append(i);
        this.f24819 = sb.toString();
        this.f24818 = new Object();
        this.f24817 = new Object();
        this.f24813 = new ConcurrentMapC12768(10);
        this.f24814 = new AtomicLong(1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m21101(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
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

    /* JADX INFO: renamed from: ֫ */
    public final void m21107() {
        long jIncrementAndGet = this.f24814.incrementAndGet();
        InterfaceC4410 interfaceC4410 = f24811;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Acquire transport " + jIncrementAndGet + " " + this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m21114();
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m21114() {
        long jDecrementAndGet = this.f24814.decrementAndGet();
        InterfaceC4410 interfaceC4410 = f24811;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Release transport " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C14740("Usage count dropped below zero");
            }
        } else if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Transport usage dropped to zero " + this);
        }
    }

    public final void finalize() {
        if (mo21123() || this.f24814.get() == 0) {
            return;
        }
        f24811.mo9199("Session was not properly released");
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m21119() {
        return this.f24814.get();
    }

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo21123() {
        return this.f24812 == 4 || this.f24812 == 5 || this.f24812 == 6 || this.f24812 == 0;
    }

    /* JADX INFO: renamed from: ۜ */
    public boolean mo21115() {
        return this.f24812 == 5 || this.f24812 == 6;
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
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15194 mo21106(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) throws C3992 {
        if (mo21123() && this.f24812 != 5) {
            throw new C3992("Transport is disconnected " + this.f24819);
        }
        try {
            try {
                try {
                    long jMo21116 = !set.contains(EnumC2572.NO_TIMEOUT) ? mo21116(interfaceC9571) : 0L;
                    long jM21105 = m21105(interfaceC9571, interfaceC3835, set, jMo21116);
                    if (Thread.currentThread() == this.f24815) {
                        synchronized (this.f24818) {
                            Long lMo21113 = mo21113();
                            if (lMo21113.longValue() == jM21105) {
                                mo21110(interfaceC3835);
                                interfaceC3835.mo30272();
                                InterfaceC15194 interfaceC15194Mo7658 = interfaceC3835;
                                while (interfaceC15194Mo7658 != null) {
                                    this.f24813.remove(Long.valueOf(interfaceC15194Mo7658.mo30254()));
                                    interfaceC9571 = interfaceC9571.mo22299();
                                    if (interfaceC9571 == null) {
                                        break;
                                    }
                                    interfaceC15194Mo7658 = interfaceC9571.mo7658();
                                }
                                return interfaceC3835;
                            }
                            mo21108(lMo21113);
                        }
                    }
                    m21102(interfaceC9571, interfaceC3835, jMo21116);
                    InterfaceC15194 interfaceC15194Mo7659 = interfaceC3835;
                    while (interfaceC15194Mo7659 != null) {
                        this.f24813.remove(Long.valueOf(interfaceC15194Mo7659.mo30254()));
                        interfaceC9571 = interfaceC9571.mo22299();
                        if (interfaceC9571 == null) {
                            break;
                        }
                        interfaceC15194Mo7659 = interfaceC9571.mo7658();
                    }
                    return interfaceC3835;
                } catch (InterruptedException e) {
                    throw new C3992(e);
                }
            } catch (IOException e2) {
                f24811.mo9178("sendrecv failed", (Throwable) e2);
                try {
                    m21121();
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                    f24811.mo9184("disconnect failed", (Exception) e3);
                }
                throw e2;
            }
        } catch (Throwable th) {
            InterfaceC15194 interfaceC15194Mo76510 = interfaceC3835;
            while (interfaceC15194Mo76510 != null) {
                this.f24813.remove(Long.valueOf(interfaceC15194Mo76510.mo30254()));
                interfaceC9571 = interfaceC9571.mo22299();
                if (interfaceC9571 == null) {
                    break;
                }
                interfaceC15194Mo76510 = interfaceC9571.mo7658();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m21105(InterfaceC9571 interfaceC9571, InterfaceC15194 interfaceC15194, Set set, long j) {
        InterfaceC9571 interfaceC9571Mo22299 = interfaceC9571;
        long j2 = 0;
        while (interfaceC15194 != null) {
            interfaceC15194.reset();
            if (set.contains(EnumC2572.RETAIN_PAYLOAD)) {
                interfaceC15194.mo12468();
            }
            long jMo21120 = mo21120(interfaceC9571Mo22299);
            if (j2 == 0) {
                j2 = jMo21120;
            }
            if (j > 0) {
                interfaceC15194.mo30247(Long.valueOf(System.currentTimeMillis() + j));
            } else {
                interfaceC15194.mo30247((Long) null);
            }
            interfaceC15194.m34629(jMo21120);
            this.f24813.put(Long.valueOf(jMo21120), interfaceC15194);
            interfaceC9571Mo22299 = interfaceC9571Mo22299.mo22299();
            if (interfaceC9571Mo22299 == null) {
                break;
            }
            interfaceC15194 = interfaceC9571Mo22299.mo7658();
        }
        mo21109(interfaceC9571);
        return j2;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21102(InterfaceC9571 interfaceC9571, InterfaceC15194 interfaceC15194, long j) {
        InterfaceC9571 interfaceC9571Mo22299 = interfaceC9571;
        while (interfaceC15194 != null) {
            synchronized (interfaceC15194) {
                if (interfaceC15194.mo30257()) {
                    interfaceC9571Mo22299 = interfaceC9571Mo22299.mo22299();
                    if (interfaceC9571Mo22299 == null) {
                        return;
                    } else {
                        interfaceC15194 = interfaceC9571Mo22299.mo7658();
                    }
                } else if (j > 0) {
                    interfaceC15194.wait(j);
                    if (interfaceC15194.mo30257() || !mo21111(interfaceC9571Mo22299, interfaceC15194)) {
                        if (interfaceC15194.mo30253()) {
                            throw new C3992(this.f24819 + " error reading response to " + interfaceC9571Mo22299, interfaceC15194.getException());
                        }
                        if (mo21123() && this.f24812 != 5) {
                            throw new C3992(String.format("Transport was disconnected while waiting for a response (transport: %s state: %d),", this.f24819, Integer.valueOf(this.f24812)));
                        }
                        j = interfaceC15194.mo30269().longValue() - System.currentTimeMillis();
                        if (j <= 0) {
                            InterfaceC4410 interfaceC4410 = f24811;
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9183("State is " + this.f24812);
                            }
                            throw new C23912(this.f24819 + " timedout waiting for response to " + interfaceC9571Mo22299);
                        }
                    }
                } else {
                    interfaceC15194.wait();
                    if (!mo21111(interfaceC9571, interfaceC15194)) {
                        InterfaceC4410 interfaceC4411 = f24811;
                        if (interfaceC4411.mo9181()) {
                            interfaceC4411.mo9183("Wait returned state is " + this.f24812);
                        }
                        if (mo21123()) {
                            throw new InterruptedException("Transport was disconnected while waiting for a response");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m21104() {
        while (this.f24815 == Thread.currentThread()) {
            try {
                synchronized (this.f24818) {
                    try {
                        try {
                            Long lMo21113 = mo21113();
                            if (lMo21113 == null) {
                                synchronized (this) {
                                    Iterator it = this.f24813.values().iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC15194) it.next()).mo30252();
                                    }
                                }
                                throw new IOException("end of stream");
                            }
                            InterfaceC15194 interfaceC15194 = (InterfaceC15194) this.f24813.get(lMo21113);
                            if (interfaceC15194 == null) {
                                InterfaceC4410 interfaceC4410 = f24811;
                                if (interfaceC4410.mo9181()) {
                                    interfaceC4410.mo9183("Unexpected message id, skipping message " + lMo21113);
                                }
                                mo21108(lMo21113);
                            } else {
                                mo21110(interfaceC15194);
                                interfaceC15194.mo30272();
                            }
                        } catch (SocketTimeoutException e) {
                            f24811.mo9192("Socket timeout during peekKey", e);
                            if (this.f24814.get() > 0) {
                                InterfaceC4410 interfaceC4411 = f24811;
                                if (interfaceC4411.mo9181()) {
                                    interfaceC4411.mo9183("Transport still in use, no idle timeout " + this);
                                }
                                for (InterfaceC15194 interfaceC15195 : this.f24813.values()) {
                                    synchronized (interfaceC15195) {
                                        interfaceC15195.notifyAll();
                                    }
                                }
                            } else {
                                InterfaceC4410 interfaceC4412 = f24811;
                                if (interfaceC4412.mo9181()) {
                                    interfaceC4412.mo9183("Idle timeout on " + this.f24819);
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
                    f24811.mo9196("Remote closed connection");
                } else if (z2) {
                    f24811.mo9176("socket timeout in non peek state", e2);
                } else {
                    f24811.mo9176("recv failed", e2);
                }
                synchronized (this) {
                    try {
                        m21112(!z2, false);
                    } catch (IOException e3) {
                        e2.addSuppressed(e3);
                        f24811.mo9178("Failed to disconnect", (Throwable) e3);
                    }
                    f24811.mo9183("Disconnected");
                    Iterator it2 = this.f24813.entrySet().iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC15194) ((Map.Entry) it2.next()).getValue()).mo30246(e2);
                        it2.remove();
                        z = true;
                    }
                    if (z) {
                        f24811.mo9183("Notified clients");
                    } else {
                        f24811.mo9176("Exception without a request pending", e2);
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m21121() {
        m21112(true, true);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x0057 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0004, B:14:0x0019, B:32:0x0057, B:27:0x004e, B:17:0x0034, B:22:0x0041, B:26:0x004c), top: B:38:0x0004, inners: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0055, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m21112(boolean z, boolean z2) {
        int i = this.f24812;
        if (i != 0) {
            IOException iOException = null;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        e = null;
                        this.f24815 = null;
                        this.f24812 = 6;
                        iOException = e;
                    } else if (i != 5 && i != 6) {
                        f24811.mo9175("Invalid state: " + this.f24812);
                        this.f24815 = null;
                        this.f24812 = 6;
                    }
                }
                if (iOException == null) {
                    return false;
                }
                throw iOException;
            }
            z = true;
            if (this.f24813.size() == 0 || z || !z2) {
                try {
                    this.f24812 = 5;
                    boolean zMo21118 = mo21118(z, z2);
                    this.f24812 = 6;
                    return zMo21118;
                } catch (IOException e) {
                    e = e;
                    this.f24812 = 6;
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
            if (this.f24812 != 5 && this.f24812 != 6) {
                mo21122();
            }
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f24815) {
                    return;
                }
                this.f24812 = 2;
                threadCurrentThread.notify();
                m21104();
            }
        } catch (Exception e) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f24815) {
                    if (e instanceof SocketTimeoutException) {
                        f24811.mo9176("Timeout connecting", e);
                    } else {
                        f24811.mo9178("Exception in transport thread", (Throwable) e);
                    }
                } else {
                    if (e instanceof SocketTimeoutException) {
                        this.f24816 = new C7819(e);
                    } else {
                        this.f24816 = new C3992(e);
                    }
                    this.f24812 = 2;
                    threadCurrentThread.notify();
                }
            }
        } catch (Throwable th) {
            synchronized (threadCurrentThread) {
                if (threadCurrentThread != this.f24815) {
                    return;
                }
                this.f24812 = 2;
                threadCurrentThread.notify();
                throw th;
            }
        }
    }

    public String toString() {
        return this.f24819;
    }
}
