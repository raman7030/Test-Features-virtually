package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20604 implements InterfaceC21449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f66311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f66312;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f66313 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3104 f66314;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9315 f66315;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f66316;

    public C20604(C9315 c9315) {
        this.f66315 = c9315;
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f66313;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final long mo1620(C3104 c3104) throws Exception {
        if (this.f66312 != null) {
            throw new IOException("Data source is already open");
        }
        C9315 c9315 = this.f66315;
        String strMo10986 = c9315.f28263.mo10986(c3104);
        C4515 c4515M9467 = c3104.m9467();
        c4515M9467.m13282(strMo10986);
        c4515M9467.m13279(c3104.f9710 | 4);
        C3104 c3104M13278 = c4515M9467.m13278();
        C16197 c16197M52285 = c9315.f28261.m52285();
        this.f66314 = c3104;
        this.f66311 = 0L;
        this.f66316 = c16197M52285 != null;
        this.f66312 = c16197M52285 == null ? c9315.f28260.mo6247() : C9315.m23960(c9315, c16197M52285);
        m47149();
        try {
            return this.f66312.mo1620(c3104M13278);
        } catch (IOException | RuntimeException e) {
            if (!m47148(e)) {
                throw e;
            }
            InterfaceC21449 interfaceC21449 = this.f66312;
            if (interfaceC21449 != null) {
                try {
                    interfaceC21449.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f66312 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C8248) {
                    c9315.f28261.m52287();
                    break;
                }
            }
            this.f66316 = false;
            return m47147(c3104, e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47149() {
        if (this.f66312 != null) {
            Iterator it = this.f66313.iterator();
            while (it.hasNext()) {
                this.f66312.mo5937((InterfaceC0486) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47148(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C8248) {
                return true;
            }
            if (this.f66315.f28264 && (cause instanceof C22510)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 == null) {
            throw new IOException("Data source is not open");
        }
        try {
            int i3 = interfaceC21449.read(bArr, i, i2);
            if (i3 > 0) {
                this.f66311 += (long) i3;
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            if (!this.f66316 || !m47148(e)) {
                throw e;
            }
            C3104 c3104 = this.f66314;
            if (c3104 == null) {
                throw new IOException("Media data spec is missing");
            }
            InterfaceC21449 interfaceC214410 = this.f66312;
            if (interfaceC214410 != null) {
                try {
                    interfaceC214410.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f66312 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C8248) {
                    this.f66315.f28261.m52287();
                    break;
                }
            }
            this.f66316 = false;
            long j = this.f66311;
            long j2 = c3104.f9713;
            m47147(c3104.m9466(j, j2 != -1 ? j2 - j : -1L), e);
            int i4 = this.f66312.read(bArr, i, i2);
            if (i4 > 0) {
                this.f66311 += (long) i4;
            }
            return i4;
        }
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f66312;
        if (interfaceC21449 == null) {
            return null;
        }
        return interfaceC21449.mo1621();
    }

    @Override // l.InterfaceC21449
    /* JADX INFO: renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f66312;
        return interfaceC21449 == null ? Collections.EMPTY_MAP : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        Throwable cause;
        boolean z;
        InterfaceC21449 interfaceC21449 = this.f66312;
        try {
            if (interfaceC21449 != null) {
                try {
                    interfaceC21449.close();
                } catch (IOException | RuntimeException e) {
                    if (!this.f66316 || !m47148(e)) {
                        cause = e;
                        throw e;
                    }
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        } else {
                            if (cause instanceof C8248) {
                                z = true;
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    if (z) {
                        this.f66315.f28261.m52287();
                    }
                }
            }
            this.f66312 = null;
            this.f66314 = null;
            this.f66311 = 0L;
            this.f66316 = false;
        } catch (Throwable th) {
            this.f66312 = null;
            this.f66314 = null;
            this.f66311 = 0L;
            this.f66316 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m47147(C3104 c3104, Exception exc) {
        C9315 c9315;
        InterfaceC15097 interfaceC15097;
        Throwable cause = exc;
        while (true) {
            c9315 = this.f66315;
            if (cause == null) {
                interfaceC15097 = c9315.f28260;
                break;
            }
            if (cause instanceof C22510) {
                interfaceC15097 = c9315.f28262;
                break;
            }
            cause = cause.getCause();
        }
        InterfaceC21449 interfaceC21449Mo6247 = interfaceC15097.mo6247();
        this.f66312 = interfaceC21449Mo6247;
        m47149();
        try {
            return interfaceC21449Mo6247.mo1620(c3104);
        } catch (IOException | RuntimeException e) {
            if (interfaceC15097 != c9315.f28262 && c9315.f28264) {
                for (Throwable cause2 = e; cause2 != null; cause2 = cause2.getCause()) {
                    if (cause2 instanceof C22510) {
                        try {
                            interfaceC21449Mo6247.close();
                        } catch (IOException | RuntimeException unused) {
                        }
                        InterfaceC21449 interfaceC21449Mo6248 = c9315.f28262.mo6247();
                        this.f66312 = interfaceC21449Mo6248;
                        m47149();
                        return interfaceC21449Mo6248.mo1620(c3104);
                    }
                }
            }
            throw e;
        }
    }
}
