package l;

import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.᩻֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 14DT */
/* JADX INFO: loaded from: classes.dex */
public final class C23377 extends AbstractC0362 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Socket f75103;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC6171 f75104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f75105;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5215 f75106;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Socket f75107;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22235 f75109;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC10405 f75110;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13159 f75112;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C8927 f75113;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f75114;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC14386 f75115;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f75108 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f75111 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f75116 = C13132.FOREVER_NS;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51822(int i, int i2, int i3, int i4, boolean z, AbstractC20216 abstractC20216) {
        if (this.f75115 != null) {
            throw new IllegalStateException("already connected");
        }
        List listM14407 = this.f75106.m14991().m14407();
        C14204 c14204 = new C14204(listM14407);
        if (this.f75106.m14991().m14406() == null) {
            if (!listM14407.contains(C2577.f8153)) {
                throw new C6444(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM28773 = this.f75106.m14991().m14405().m28773();
            if (!C18872.m43580().mo43585(strM28773)) {
                throw new C6444(new UnknownServiceException(C4860.m14172("CLEARTEXT communication to ", strM28773, " not permitted by network security policy")));
            }
        } else if (this.f75106.m14991().m14410().contains(EnumC14386.H2_PRIOR_KNOWLEDGE)) {
            throw new C6444(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C6444 c6444 = null;
        while (true) {
            try {
                if (this.f75106.m14993()) {
                    m51817(i, i2, i3, abstractC20216);
                    if (this.f75107 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m51818(i, i2, abstractC20216);
                m51819(c14204, i4, abstractC20216);
                this.f75106.getClass();
                this.f75106.getClass();
                abstractC20216.getClass();
                break;
            } catch (IOException e) {
                C20032.m46181(this.f75103);
                C20032.m46181(this.f75107);
                this.f75103 = null;
                this.f75107 = null;
                this.f75104 = null;
                this.f75110 = null;
                this.f75112 = null;
                this.f75115 = null;
                this.f75109 = null;
                this.f75106.getClass();
                this.f75106.getClass();
                abstractC20216.getClass();
                if (c6444 == null) {
                    c6444 = new C6444(e);
                } else {
                    c6444.m17800(e);
                }
                if (!z) {
                    throw c6444;
                }
                if (!c14204.m33869(e)) {
                    throw c6444;
                }
            }
        }
        if (this.f75106.m14993() && this.f75107 == null) {
            throw new C6444(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f75109 != null) {
            synchronized (this.f75113) {
                this.f75108 = this.f75109.m49922();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51818(int i, int i2, AbstractC20216 abstractC20216) throws IOException {
        Socket socketCreateSocket;
        C5215 c5215 = this.f75106;
        Proxy proxyM14992 = c5215.m14992();
        C4965 c4965M14991 = c5215.m14991();
        if (proxyM14992.type() == Proxy.Type.DIRECT || proxyM14992.type() == Proxy.Type.HTTP) {
            socketCreateSocket = c4965M14991.m14412().createSocket();
        } else {
            socketCreateSocket = new Socket(proxyM14992);
        }
        this.f75107 = socketCreateSocket;
        abstractC20216.getClass();
        this.f75107.setSoTimeout(i2);
        try {
            C18872.m43580().mo43584(this.f75107, c5215.m14994(), i);
            try {
                this.f75104 = C23852.m52567(C23852.m52569(this.f75107));
                this.f75110 = C23852.m52568(C23852.m52566(this.f75107));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + c5215.m14994());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51819(C14204 c14204, int i, AbstractC20216 abstractC20216) throws Throwable {
        SSLSocket sSLSocket;
        EnumC14386 enumC14386M34359;
        C5215 c5215 = this.f75106;
        if (c5215.m14991().m14406() == null) {
            List listM14410 = c5215.m14991().m14410();
            EnumC14386 enumC14386 = EnumC14386.H2_PRIOR_KNOWLEDGE;
            if (listM14410.contains(enumC14386)) {
                this.f75103 = this.f75107;
                this.f75115 = enumC14386;
                m51816(i);
                return;
            } else {
                this.f75103 = this.f75107;
                this.f75115 = EnumC14386.HTTP_1_1;
                return;
            }
        }
        abstractC20216.getClass();
        C4965 c4965M14991 = c5215.m14991();
        try {
            try {
                sSLSocket = (SSLSocket) c4965M14991.m14406().createSocket(this.f75107, c4965M14991.m14405().m28773(), c4965M14991.m14405().m28771(), true);
                try {
                    C2577 c2577M33868 = c14204.m33868(sSLSocket);
                    if (c2577M33868.m8176()) {
                        C18872.m43580().mo8318(sSLSocket, c4965M14991.m14405().m28773(), c4965M14991.m14410());
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    C13159 c13159M31886 = C13159.m31886(session);
                    if (!c4965M14991.m14411().verify(c4965M14991.m14405().m28773(), session)) {
                        List listM31890 = c13159M31886.m31890();
                        if (!listM31890.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listM31890.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c4965M14991.m14405().m28773() + " not verified:\n    certificate: " + C23743.m52389(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C8288.m21883(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c4965M14991.m14405().m28773() + " not verified (no certificates)");
                    }
                    c4965M14991.m14402().m52391(c4965M14991.m14405().m28773(), c13159M31886.m31890());
                    String strMo8319 = c2577M33868.m8176() ? C18872.m43580().mo8319(sSLSocket) : null;
                    this.f75103 = sSLSocket;
                    this.f75104 = C23852.m52567(C23852.m52569(sSLSocket));
                    this.f75110 = C23852.m52568(C23852.m52566(this.f75103));
                    this.f75112 = c13159M31886;
                    if (strMo8319 != null) {
                        enumC14386M34359 = EnumC14386.m34359(strMo8319);
                    } else {
                        enumC14386M34359 = EnumC14386.HTTP_1_1;
                    }
                    this.f75115 = enumC14386M34359;
                    C18872.m43580().mo8317(sSLSocket);
                    if (this.f75115 == EnumC14386.HTTP_2) {
                        m51816(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C20032.m46182(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        C18872.m43580().mo8317(sSLSocket);
                    }
                    C20032.m46181((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51816(int i) throws SocketException {
        this.f75103.setSoTimeout(0);
        C3891 c3891 = new C3891();
        c3891.m11754(this.f75103, this.f75106.m14991().m14405().m28773(), this.f75104, this.f75110);
        c3891.m11755(this);
        c3891.m11753(i);
        C22235 c22235M11752 = c3891.m11752();
        this.f75109 = c22235M11752;
        c22235M11752.m49938();
    }

    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ܺ֫֡, l.ܿ۟᩵] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51817(int i, int i2, int i3, AbstractC20216 abstractC20216) throws IOException {
        int i4;
        C9449 c9449 = new C9449();
        C5215 c5215 = this.f75106;
        c9449.m24280(c5215.m14991().m14405());
        Object obj = null;
        c9449.m24277("CONNECT", (AbstractC2393) null);
        boolean z = true;
        c9449.m24283("Host", C20032.m46172(c5215.m14991().m14405(), true));
        c9449.m24283("Proxy-Connection", "Keep-Alive");
        c9449.m24283("User-Agent", "okhttp/3.12.13");
        C8743 c8743M24274 = c9449.m24274();
        C3804 c3804 = new C3804();
        c3804.m11479(c8743M24274);
        c3804.m11482(EnumC14386.HTTP_1_1);
        c3804.m11475(407);
        c3804.m11486("Preemptive Authenticate");
        c3804.m11478(C20032.f64894);
        c3804.m11485(-1L);
        c3804.m11476(-1L);
        c3804.m11484();
        C8743 c8743Mo10819 = c5215.m14991().m14413().mo10819(c3804.m11474());
        if (c8743Mo10819 != null) {
            c8743M24274 = c8743Mo10819;
        }
        C11749 c11749M22622 = c8743M24274.m22622();
        int i5 = 0;
        while (i5 < 21) {
            m51818(i, i2, abstractC20216);
            String str = "CONNECT " + C20032.m46172(c11749M22622, z) + " HTTP/1.1";
            ?? r5 = obj;
            while (true) {
                InterfaceC6171 interfaceC6171 = this.f75104;
                C11384 c11384 = new C11384(r5, r5, interfaceC6171, this.f75110);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                interfaceC6171.mo4333().mo20329(i2);
                this.f75110.mo8912().mo20329(i3);
                str = str;
                c11384.m28145(c8743M24274.m22619(), str);
                c11384.mo28143();
                C3804 c3804Mo28140 = c11384.mo28140(false);
                c3804Mo28140.m11479(c8743M24274);
                C18621 c18621M11474 = c3804Mo28140.m11474();
                long jM3017 = C0799.m3017(c18621M11474);
                if (jM3017 == -1) {
                    jM3017 = 0;
                }
                i4 = i5;
                InterfaceC1274 interfaceC1274M28139 = c11384.m28139(jM3017);
                C20032.m46184(interfaceC1274M28139, Integer.MAX_VALUE);
                interfaceC1274M28139.close();
                int iM43177 = c18621M11474.m43177();
                if (iM43177 == 200) {
                    if (!this.f75104.mo12315().mo12308() || !this.f75110.mo26253().mo12308()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    c8743M24274 = null;
                    break;
                }
                if (iM43177 == 407) {
                    C8743 c8743Mo108110 = c5215.m14991().m14413().mo10819(c18621M11474);
                    if (c8743Mo108110 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(c18621M11474.m43169("Connection"))) {
                        c8743M24274 = c8743Mo108110;
                        break;
                    } else {
                        i5 = i4;
                        c8743M24274 = c8743Mo108110;
                        r5 = 0;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c18621M11474.m43177());
                }
            }
            if (c8743M24274 == null) {
                return;
            }
            C20032.m46181(this.f75107);
            this.f75107 = null;
            this.f75110 = null;
            this.f75104 = null;
            i5 = i4 + 1;
            obj = null;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51823(C4965 c4965, C5215 c5215) {
        if (this.f75111.size() >= this.f75108 || this.f75105) {
            return false;
        }
        AbstractC8037 abstractC8037 = AbstractC8037.f24775;
        C5215 c5216 = this.f75106;
        if (!abstractC8037.mo21354(c5216.m14991(), c4965)) {
            return false;
        }
        if (c4965.m14405().m28773().equals(c5216.m14991().m14405().m28773())) {
            return true;
        }
        if (this.f75109 == null || c5215 == null) {
            return false;
        }
        Proxy.Type type = c5215.m14992().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || c5216.m14992().type() != type2 || !c5216.m14994().equals(c5215.m14994()) || c5215.m14991().m14411() != C8288.f25465 || !m51824(c4965.m14405())) {
            return false;
        }
        try {
            c4965.m14402().m52391(c4965.m14405().m28773(), this.f75112.m31890());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51824(C11749 c11749) {
        int iM28771 = c11749.m28771();
        C5215 c5215 = this.f75106;
        if (iM28771 == c5215.m14991().m14405().m28771()) {
            if (c11749.m28773().equals(c5215.m14991().m14405().m28773())) {
                return true;
            }
            if (this.f75112 != null) {
                if (C8288.m21885((X509Certificate) this.f75112.m31890().get(0), c11749.m28773())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19145 m51820(C17209 c17209, C7855 c7855, C15615 c15615) {
        if (this.f75109 != null) {
            return new C14473(c17209, c7855, c15615, this.f75109);
        }
        this.f75103.setSoTimeout(c7855.m21040());
        C15384 c15384Mo4333 = this.f75104.mo4333();
        long jM21040 = c7855.m21040();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c15384Mo4333.mo20329(jM21040);
        this.f75110.mo8912().mo20329(c7855.m21044());
        return new C11384(c17209, c15615, this.f75104, this.f75110);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C5215 m51829() {
        return this.f75106;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51821() {
        C20032.m46181(this.f75107);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Socket m51828() {
        return this.f75103;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51825(boolean z) {
        if (!this.f75103.isClosed() && !this.f75103.isInputShutdown() && !this.f75103.isOutputShutdown()) {
            C22235 c22235 = this.f75109;
            if (c22235 != null) {
                return c22235.m49936(System.nanoTime());
            }
            if (z) {
                try {
                    int soTimeout = this.f75103.getSoTimeout();
                    try {
                        this.f75103.setSoTimeout(1);
                        if (this.f75104.mo12308()) {
                            this.f75103.setSoTimeout(soTimeout);
                            return false;
                        }
                        this.f75103.setSoTimeout(soTimeout);
                        return true;
                    } catch (Throwable th) {
                        this.f75103.setSoTimeout(soTimeout);
                        throw th;
                    }
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.AbstractC0362
    /* JADX INFO: renamed from: ֫ */
    public final void mo1801(C10241 c10241) {
        c10241.m25937(EnumC13499.REFUSED_STREAM);
    }

    @Override // l.AbstractC0362
    /* JADX INFO: renamed from: ֫ */
    public final void mo1802(C22235 c22235) {
        synchronized (this.f75113) {
            this.f75108 = c22235.m49922();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13159 m51826() {
        return this.f75112;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m51827() {
        return this.f75109 != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C5215 c5215 = this.f75106;
        sb.append(c5215.m14991().m14405().m28773());
        sb.append(":");
        sb.append(c5215.m14991().m14405().m28771());
        sb.append(", proxy=");
        sb.append(c5215.m14992());
        sb.append(" hostAddress=");
        sb.append(c5215.m14994());
        sb.append(" cipherSuite=");
        C13159 c13159 = this.f75112;
        sb.append(c13159 != null ? c13159.m31888() : "none");
        sb.append(" protocol=");
        sb.append(this.f75115);
        sb.append('}');
        return sb.toString();
    }

    public C23377(C8927 c8927, C5215 c5215) {
        this.f75113 = c8927;
        this.f75106 = c5215;
    }
}
