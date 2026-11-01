package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21178 {

    /* JADX INFO: renamed from: ֨ */
    public static final AtomicInteger f66544 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡ */
    public Thread f66545;

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f66546;

    /* JADX INFO: renamed from: ۖ */
    public volatile int f66547;

    /* JADX INFO: renamed from: ۘ */
    public volatile int f66548;

    /* JADX INFO: renamed from: ۚ */
    public byte[] f66549;

    /* JADX INFO: renamed from: ۜ */
    public volatile int f66550;

    /* JADX INFO: renamed from: ۡ */
    public volatile boolean f66551;

    /* JADX INFO: renamed from: ۢ */
    public int f66552;

    /* JADX INFO: renamed from: ۧ */
    public volatile int f66553;

    /* JADX INFO: renamed from: ܳ */
    public C21099 f66554;

    /* JADX INFO: renamed from: ܺ */
    public volatile int f66555 = -1;

    /* JADX INFO: renamed from: ܽ */
    public volatile boolean f66556;

    /* JADX INFO: renamed from: ܿ */
    public int f66557;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f66558;

    /* JADX INFO: renamed from: ᩴ */
    public volatile long f66559;

    /* JADX INFO: renamed from: ᩵ */
    public C9383 f66560;

    /* JADX INFO: renamed from: ᩷ */
    public volatile int f66561;

    /* JADX INFO: renamed from: ᩻ */
    public volatile int f66562;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m47797(long j) {
        this.f66559 += j;
        if (this.f66552 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo7821() {
    }

    /* JADX INFO: renamed from: ۡ */
    public abstract void mo5176();

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m47802(int i) {
        this.f66555 = i;
        if (this.f66552 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m47803(long j) {
        this.f66559 = j;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo7828() {
    }

    public AbstractC21178() {
        byte[] bArr = C20764.f65273;
        this.f66549 = "foo".getBytes(StandardCharsets.UTF_8);
        this.f66561 = 1048576;
        this.f66550 = this.f66561;
        this.f66562 = 16384;
        this.f66559 = 0L;
        this.f66548 = 0;
        this.f66554 = null;
        this.f66545 = null;
        this.f66558 = false;
        this.f66546 = false;
        this.f66556 = false;
        this.f66551 = false;
        this.f66547 = 0;
        this.f66553 = 0;
        this.f66552 = 0;
        this.f66557 = f66544.getAndIncrement() & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo24167(int i) {
        this.f66553 = i;
        try {
            m47805();
            mo7828();
        } catch (Exception e) {
            this.f66556 = false;
            m47801();
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            throw new C14392(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12833(C17823 c17823) {
        m47802(c17823.m40464());
        m47803(c17823.m40457());
        this.f66548 = c17823.m40464();
    }

    /* JADX INFO: renamed from: ܳ */
    public final InputStream m47804() {
        int i;
        C9383 c9383 = this.f66560;
        if (c9383 != null && m47800()) {
            c9383.f25608.m49100().getClass();
        }
        try {
            i = Integer.parseInt(m47808().m21829("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        C5084 c5084 = new C5084(i);
        this.f66554.f66298 = new C20507(c5084, 32768 < i);
        return c5084;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo5175(byte[] bArr, int i, int i2) throws IOException {
        try {
            C21099 c21099 = this.f66554;
            c21099.f66298.write(bArr, i, i2);
            c21099.f66298.flush();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo5177() {
        try {
            this.f66554.m47708();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m47806() {
        if (this.f66558) {
            return;
        }
        this.f66558 = true;
        int i = this.f66555;
        if (i == -1) {
            return;
        }
        try {
            C17823 c17823 = new C17823(100);
            C10054 c10054 = new C10054(c17823);
            c10054.m23425();
            c17823.m40448(UTF8.S_P4B);
            c17823.m40459(i);
            synchronized (this) {
                try {
                    if (!this.f66546) {
                        m47808().m21845(c10054);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47796() {
        if (this.f66546) {
            return;
        }
        this.f66546 = true;
        this.f66558 = true;
        int i = this.f66555;
        if (i == -1) {
            return;
        }
        try {
            C17823 c17823 = new C17823(100);
            C10054 c10054 = new C10054(c17823);
            c10054.m23425();
            c17823.m40448((byte) 97);
            c17823.m40459(i);
            synchronized (this) {
                try {
                    m47808().m21845(c10054);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m47807() {
        return this.f66546;
    }

    /* JADX INFO: renamed from: ۧ */
    public void m47801() {
        try {
            synchronized (this) {
                if (this.f66556) {
                    this.f66556 = false;
                    m47796();
                    this.f66558 = true;
                    this.f66545 = null;
                    try {
                        C21099 c21099 = this.f66554;
                        if (c21099 != null) {
                            c21099.m47703();
                        }
                    } catch (Exception unused) {
                    }
                    C9383 c9383 = this.f66560;
                    if (c9383 != null) {
                        c9383.m21838(this);
                        return;
                    }
                    return;
                }
                C9383 c9384 = this.f66560;
                if (c9384 != null) {
                    c9384.m21838(this);
                }
            }
        } catch (Throwable th) {
            C9383 c9385 = this.f66560;
            if (c9385 != null) {
                c9385.m21838(this);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m47800() {
        C9383 c9383 = this.f66560;
        return c9383 != null && c9383.m21841() && this.f66556;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C9383 m47808() {
        C9383 c9383 = this.f66560;
        if (c9383 != null) {
            return c9383;
        }
        throw new C14392("session is not available");
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m47798() throws C14392 {
        C17823 c17823 = new C17823(200);
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 91);
        c17823.m40459(this.f66555);
        c17823.m40459(this.f66557);
        c17823.m40459(this.f66550);
        c17823.m40459(this.f66562);
        m47808().m21845(c10054);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m47799() {
        try {
            C17823 c17823 = new C17823(200);
            C10054 c10054 = new C10054(c17823);
            c10054.m23425();
            c17823.m40448((byte) 92);
            c17823.m40459(this.f66555);
            c17823.m40459(1);
            byte[] bArr = C20764.f65273;
            c17823.m40470("open failed".getBytes(StandardCharsets.UTF_8));
            c17823.m40470(C20764.f65273);
            m47808().m21845(c10054);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public C10054 mo17919() {
        C17823 c17823 = new C17823(200);
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 90);
        c17823.m40470(this.f66549);
        c17823.m40459(this.f66557);
        c17823.m40459(this.f66550);
        c17823.m40459(this.f66562);
        return c10054;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m47805() throws C14392 {
        C9383 c9383M47808 = m47808();
        if (!c9383M47808.m21841()) {
            throw new C14392("session is down");
        }
        c9383M47808.m21845(mo17919());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f66553;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (this.f66555 == -1 && c9383M47808.m21841() && i > 0) {
                if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                    long j2 = j == 0 ? 10L : j;
                    try {
                        this.f66552 = 1;
                        wait(j2);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        this.f66552 = 0;
                        throw th;
                    }
                    this.f66552 = 0;
                    i--;
                } else {
                    i = 0;
                }
            }
        }
        if (!c9383M47808.m21841()) {
            throw new C14392("session is down");
        }
        if (this.f66555 == -1) {
            throw new C14392("channel is not opened.");
        }
        if (!this.f66551) {
            throw new C14392("channel is not opened.");
        }
        this.f66556 = true;
    }
}
