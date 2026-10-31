package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19791 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f63907 = new AtomicInteger();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Thread f63908;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f63909;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile int f63910;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile int f63911;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f63912;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile int f63913;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile boolean f63914;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f63915;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f63916;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19708 f63917;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile int f63918 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f63919;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63920;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f63921;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile long f63922;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C7381 f63923;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f63924;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile int f63925;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m45486(long j) {
        this.f63922 += j;
        if (this.f63915 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public void mo5591() {
    }

    /* JADX INFO: renamed from: ۡ */
    public abstract void mo2847();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45491(int i) {
        this.f63918 = i;
        if (this.f63915 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45492(long j) {
        this.f63922 = j;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo5598() {
    }

    public AbstractC19791() {
        byte[] bArr = C19356.f62660;
        this.f63912 = "foo".getBytes(StandardCharsets.UTF_8);
        this.f63924 = 1048576;
        this.f63913 = this.f63924;
        this.f63925 = 16384;
        this.f63922 = 0L;
        this.f63911 = 0;
        this.f63917 = null;
        this.f63908 = null;
        this.f63921 = false;
        this.f63909 = false;
        this.f63919 = false;
        this.f63914 = false;
        this.f63910 = 0;
        this.f63916 = 0;
        this.f63915 = 0;
        this.f63920 = f63907.getAndIncrement() & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo22199(int i) {
        this.f63916 = i;
        try {
            m45494();
            mo5598();
        } catch (Exception e) {
            this.f63919 = false;
            m45490();
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10853(C16261 c16261) {
        m45491(c16261.m38250());
        m45492(c16261.m38243());
        this.f63911 = c16261.m38250();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m45493() {
        int i;
        C7381 c7381 = this.f63923;
        if (c7381 != null && m45489()) {
            c7381.f22696.m46777().getClass();
        }
        try {
            i = Integer.parseInt(m45497().m19856("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        C2857 c2857 = new C2857(i);
        this.f63917.f63667 = new C19085(c2857, 32768 < i);
        return c2857;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo2846(byte[] bArr, int i, int i2) throws IOException {
        try {
            C19708 c19708 = this.f63917;
            c19708.f63667.write(bArr, i, i2);
            c19708.f63667.flush();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public void mo2848() {
        try {
            this.f63917.m45404();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45495() {
        if (this.f63921) {
            return;
        }
        this.f63921 = true;
        int i = this.f63918;
        if (i == -1) {
            return;
        }
        try {
            C16261 c16261 = new C16261(100);
            C8087 c8087 = new C8087(c16261);
            c8087.m21457();
            c16261.m38234(UTF8.S_P4B);
            c16261.m38245(i);
            synchronized (this) {
                try {
                    if (!this.f63909) {
                        m45497().m19872(c8087);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45485() {
        if (this.f63909) {
            return;
        }
        this.f63909 = true;
        this.f63921 = true;
        int i = this.f63918;
        if (i == -1) {
            return;
        }
        try {
            C16261 c16261 = new C16261(100);
            C8087 c8087 = new C8087(c16261);
            c8087.m21457();
            c16261.m38234((byte) 97);
            c16261.m38245(i);
            synchronized (this) {
                try {
                    m45497().m19872(c8087);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m45496() {
        return this.f63909;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m45490() {
        try {
            synchronized (this) {
                if (this.f63919) {
                    this.f63919 = false;
                    m45485();
                    this.f63921 = true;
                    this.f63908 = null;
                    try {
                        C19708 c19708 = this.f63917;
                        if (c19708 != null) {
                            c19708.m45399();
                        }
                    } catch (Exception unused) {
                    }
                    C7381 c7381 = this.f63923;
                    if (c7381 != null) {
                        c7381.m19865(this);
                        return;
                    }
                    return;
                }
                C7381 c7382 = this.f63923;
                if (c7382 != null) {
                    c7382.m19865(this);
                }
            }
        } catch (Throwable th) {
            C7381 c7383 = this.f63923;
            if (c7383 != null) {
                c7383.m19865(this);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m45489() {
        C7381 c7381 = this.f63923;
        return c7381 != null && c7381.m19868() && this.f63919;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7381 m45497() {
        C7381 c7381 = this.f63923;
        if (c7381 != null) {
            return c7381;
        }
        throw new C12651("session is not available");
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45487() throws C12651 {
        C16261 c16261 = new C16261(200);
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 91);
        c16261.m38245(this.f63918);
        c16261.m38245(this.f63920);
        c16261.m38245(this.f63913);
        c16261.m38245(this.f63925);
        m45497().m19872(c8087);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m45488() {
        try {
            C16261 c16261 = new C16261(200);
            C8087 c8087 = new C8087(c16261);
            c8087.m21457();
            c16261.m38234((byte) 92);
            c16261.m38245(this.f63918);
            c16261.m38245(1);
            byte[] bArr = C19356.f62660;
            c16261.m38256("open failed".getBytes(StandardCharsets.UTF_8));
            c16261.m38256(C19356.f62660);
            m45497().m19872(c8087);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public C8087 mo15984() {
        C16261 c16261 = new C16261(200);
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 90);
        c16261.m38256(this.f63912);
        c16261.m38245(this.f63920);
        c16261.m38245(this.f63913);
        c16261.m38245(this.f63925);
        return c8087;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m45494() throws C12651 {
        C7381 c7381M45497 = m45497();
        if (!c7381M45497.m19868()) {
            throw new C12651("session is down");
        }
        c7381M45497.m19872(mo15984());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f63916;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (this.f63918 == -1 && c7381M45497.m19868() && i > 0) {
                try {
                    if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                        long j2 = j == 0 ? 10L : j;
                        try {
                            this.f63915 = 1;
                            wait(j2);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            this.f63915 = 0;
                            throw th;
                        }
                        this.f63915 = 0;
                        i--;
                    } else {
                        i = 0;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (!c7381M45497.m19868()) {
            throw new C12651("session is down");
        }
        if (this.f63918 == -1) {
            throw new C12651("channel is not opened.");
        }
        if (!this.f63914) {
            throw new C12651("channel is not opened.");
        }
        this.f63919 = true;
    }
}
