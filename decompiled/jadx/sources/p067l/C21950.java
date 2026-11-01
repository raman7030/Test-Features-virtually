package p067l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩷ۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes5.dex */
public final class C21950 implements InterfaceC22753 {

    /* JADX INFO: renamed from: ֫ */
    public long f68991;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC22753 f68992;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f68993 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public C5318 f68994;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C11221 f68995;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f68996;

    public C21950(C11221 c11221) {
        this.f68995 = c11221;
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final void mo8132(InterfaceC2830 interfaceC2830) {
        ArrayList arrayList = this.f68993;
        if (arrayList.contains(interfaceC2830)) {
            return;
        }
        arrayList.add(interfaceC2830);
        InterfaceC22753 interfaceC22753 = this.f68992;
        if (interfaceC22753 != null) {
            interfaceC22753.mo8132(interfaceC2830);
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final long mo4020(C5318 c5318) throws Exception {
        if (this.f68992 != null) {
            throw new IOException("Data source is already open");
        }
        C11221 c11221 = this.f68995;
        String strMo12962 = c11221.f31212.mo12962(c5318);
        C6659 c6659M11510 = c5318.m11510();
        c6659M11510.m15165(strMo12962);
        c6659M11510.m15162(c5318.f12513 | 4);
        C5318 c5318M15161 = c6659M11510.m15161();
        C17762 c17762M54688 = c11221.f31210.m54688();
        this.f68994 = c5318;
        this.f68991 = 0L;
        this.f68996 = c17762M54688 != null;
        this.f68992 = c17762M54688 == null ? c11221.f31209.mo8449() : C11221.m25969(c11221, c17762M54688);
        m49475();
        try {
            return this.f68992.mo4020(c5318M15161);
        } catch (IOException | RuntimeException e) {
            if (!m49474(e)) {
                throw e;
            }
            InterfaceC22753 interfaceC22753 = this.f68992;
            if (interfaceC22753 != null) {
                try {
                    interfaceC22753.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f68992 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C10207) {
                    c11221.f31210.m54690();
                    break;
                }
            }
            this.f68996 = false;
            return m49473(c5318, e);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m49475() {
        if (this.f68992 != null) {
            Iterator it = this.f68993.iterator();
            while (it.hasNext()) {
                this.f68992.mo8132((InterfaceC2830) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m49474(Exception exc) {
        for (Throwable cause = exc; cause != null; cause = cause.getCause()) {
            if (cause instanceof C10207) {
                return true;
            }
            if (this.f68995.f31213 && (cause instanceof C23762)) {
                return true;
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC11649
    public final int read(byte[] bArr, int i, int i2) throws Exception {
        InterfaceC22753 interfaceC22753 = this.f68992;
        if (interfaceC22753 == null) {
            throw new IOException("Data source is not open");
        }
        try {
            int i3 = interfaceC22753.read(bArr, i, i2);
            if (i3 > 0) {
                this.f68991 += (long) i3;
            }
            return i3;
        } catch (IOException | RuntimeException e) {
            if (!this.f68996 || !m49474(e)) {
                throw e;
            }
            C5318 c5318 = this.f68994;
            if (c5318 == null) {
                throw new IOException("Media data spec is missing");
            }
            InterfaceC22753 interfaceC22754 = this.f68992;
            if (interfaceC22754 != null) {
                try {
                    interfaceC22754.close();
                } catch (IOException | RuntimeException unused) {
                }
            }
            this.f68992 = null;
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if (cause instanceof C10207) {
                    this.f68995.f31210.m54690();
                    break;
                }
            }
            this.f68996 = false;
            long j = this.f68991;
            long j2 = c5318.f12516;
            m49473(c5318.m11509(j, j2 != -1 ? j2 - j : -1L), e);
            int i4 = this.f68992.read(bArr, i, i2);
            if (i4 > 0) {
                this.f68991 += (long) i4;
            }
            return i4;
        }
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ܿ */
    public final Uri mo4021() {
        InterfaceC22753 interfaceC22753 = this.f68992;
        if (interfaceC22753 == null) {
            return null;
        }
        return interfaceC22753.mo4021();
    }

    @Override // p067l.InterfaceC22753
    /* JADX INFO: renamed from: ֫ */
    public final Map mo8131() {
        InterfaceC22753 interfaceC22753 = this.f68992;
        return interfaceC22753 == null ? Collections.EMPTY_MAP : interfaceC22753.mo8131();
    }

    @Override // p067l.InterfaceC22753
    public final void close() {
        Throwable cause;
        boolean z;
        InterfaceC22753 interfaceC22753 = this.f68992;
        try {
            if (interfaceC22753 != null) {
                try {
                    interfaceC22753.close();
                } catch (IOException | RuntimeException e) {
                    if (!this.f68996 || !m49474(e)) {
                        cause = e;
                        throw e;
                    }
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        } else {
                            if (cause instanceof C10207) {
                                z = true;
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    if (z) {
                        this.f68995.f31210.m54690();
                    }
                }
            }
            this.f68992 = null;
            this.f68994 = null;
            this.f68991 = 0L;
            this.f68996 = false;
        } catch (Throwable th) {
            this.f68992 = null;
            this.f68994 = null;
            this.f68991 = 0L;
            this.f68996 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private long m49473(C5318 c5318, Exception exc) {
        C11221 c11221;
        InterfaceC16716 interfaceC16716;
        Throwable cause = exc;
        while (true) {
            c11221 = this.f68995;
            if (cause == null) {
                interfaceC16716 = c11221.f31209;
                break;
            }
            if (cause instanceof C23762) {
                interfaceC16716 = c11221.f31211;
                break;
            }
            cause = cause.getCause();
        }
        InterfaceC22753 interfaceC22753Mo8449 = interfaceC16716.mo8449();
        this.f68992 = interfaceC22753Mo8449;
        m49475();
        try {
            return interfaceC22753Mo8449.mo4020(c5318);
        } catch (IOException | RuntimeException e) {
            if (interfaceC16716 != c11221.f31211 && c11221.f31213) {
                for (Throwable cause2 = e; cause2 != null; cause2 = cause2.getCause()) {
                    if (cause2 instanceof C23762) {
                        try {
                            interfaceC22753Mo8449.close();
                        } catch (IOException | RuntimeException unused) {
                        }
                        InterfaceC22753 interfaceC22753Mo84410 = c11221.f31211.mo8449();
                        this.f68992 = interfaceC22753Mo84410;
                        m49475();
                        return interfaceC22753Mo84410.mo4020(c5318);
                    }
                }
            }
            throw e;
        }
    }
}
