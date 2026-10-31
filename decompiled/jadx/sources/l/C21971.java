package l;

import java.io.Closeable;
import java.io.IOException;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩹֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9DJ */
/* JADX INFO: loaded from: classes.dex */
public final class C21971 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f70367 = C11321.m27961(C21971.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5470 f70368;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC10942 f70369;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17464 f70370;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C4332 f70371;

    public C21971(C4332 c4332) {
        C17464 c17464 = new C17464();
        this.f70369 = new ConcurrentMapC10942();
        this.f70368 = new C5470();
        this.f70371 = c4332;
        this.f70370 = c17464;
        c17464.m40833(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23650 m49458(String str) {
        return m49457(445, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23650 m49459(int i, String str) {
        return m49457(i, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C23650 m49457(int i, String str) {
        synchronized (this) {
            String str2 = str + ":" + i;
            C23650 c23650 = (C23650) this.f70369.get(str2);
            if (c23650 != null) {
                c23650 = (C23650) c23650.m32531();
            }
            if (c23650 != null && c23650.m52166()) {
                return c23650;
            }
            C23650 c23651 = new C23650(this.f70371, this, this.f70370, this.f70368);
            try {
                c23651.m52162(i, str);
                this.f70369.put(str2, c23651);
                return c23651;
            } catch (IOException e) {
                AutoCloseable[] autoCloseableArr = {c23651};
                int i2 = C4680.f14871;
                AutoCloseable autoCloseable = autoCloseableArr[0];
                if (autoCloseable != null) {
                    try {
                        C5368.m15342(autoCloseable);
                    } catch (Exception unused) {
                    }
                }
                throw e;
            }
        }
    }

    public C21971() {
        this(C4332.m13008().m45668());
    }

    @Handler
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49456(C11115 c11115) {
        synchronized (this) {
            String str = c11115.m27545() + ":" + c11115.m27546();
            this.f70369.remove(str);
            this.f70368.m15570(c11115.m27545());
            f70367.mo7100(str, "Connection to << {} >> closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC2148 interfaceC2148 = f70367;
        interfaceC2148.mo7096("Going to close all remaining connections");
        for (C23650 c23650 : this.f70369.values()) {
            try {
                c23650.m52158(true);
            } catch (Exception e) {
                interfaceC2148.mo7100(c23650.m52160(), "Error closing connection to host {}");
                interfaceC2148.mo7081("Exception was: ", e);
            }
        }
    }
}
