package p067l;

import java.io.Closeable;
import java.io.IOException;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩹֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9DJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23249 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public static final InterfaceC4410 f73078 = C13128.m30022(C23249.class);

    /* JADX INFO: renamed from: ۙ */
    public C7567 f73079;

    /* JADX INFO: renamed from: ᩶ */
    public ConcurrentMapC12768 f73080;

    /* JADX INFO: renamed from: ᩸ */
    public C18966 f73081;

    /* JADX INFO: renamed from: ᩹ */
    public C6485 f73082;

    public C23249(C6485 c6485) {
        C18966 c18966 = new C18966();
        this.f73080 = new ConcurrentMapC12768();
        this.f73079 = new C7567();
        this.f73082 = c6485;
        this.f73081 = c18966;
        c18966.m43091(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24845 m51795(String str) {
        return m51794(445, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24845 m51796(int i, String str) {
        return m51794(i, str);
    }

    /* JADX INFO: renamed from: ܽ */
    private C24845 m51794(int i, String str) {
        synchronized (this) {
            String str2 = str + ":" + i;
            C24845 c24845 = (C24845) this.f73080.get(str2);
            if (c24845 != null) {
                c24845 = (C24845) c24845.m34633();
            }
            if (c24845 != null && c24845.m54569()) {
                return c24845;
            }
            C24845 c24846 = new C24845(this.f73082, this, this.f73081, this.f73079);
            try {
                c24846.m54565(i, str);
                this.f73080.put(str2, c24846);
                return c24846;
            } catch (IOException e) {
                AutoCloseable[] autoCloseableArr = {c24846};
                int i2 = C6816.f17700;
                AutoCloseable autoCloseable = autoCloseableArr[0];
                if (autoCloseable != null) {
                    try {
                        C7470.m17251(autoCloseable);
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        }
    }

    public C23249() {
        this(C6485.m14872().m47979());
    }

    @Handler
    /* JADX INFO: renamed from: ֫ */
    private void m51793(C12932 c12932) {
        synchronized (this) {
            String str = c12932.m29607() + ":" + c12932.m29608();
            this.f73080.remove(str);
            this.f73079.m17481(c12932.m29607());
            f73078.mo9195(str, "Connection to << {} >> closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC4410 interfaceC4410 = f73078;
        interfaceC4410.mo9191("Going to close all remaining connections");
        for (C24845 c24845 : this.f73080.values()) {
            try {
                c24845.m54561(true);
            } catch (Exception e) {
                interfaceC4410.mo9195(c24845.m54563(), "Error closing connection to host {}");
                interfaceC4410.mo9176("Exception was: ", e);
            }
        }
    }
}
