package p067l;

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
public final class C24585 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۖ */
    public Socket f77849;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC8233 f77850;

    /* JADX INFO: renamed from: ۜ */
    public boolean f77851;

    /* JADX INFO: renamed from: ۡ */
    public final C7325 f77852;

    /* JADX INFO: renamed from: ۢ */
    public Socket f77853;

    /* JADX INFO: renamed from: ܳ */
    public C23500 f77855;

    /* JADX INFO: renamed from: ܺ */
    public InterfaceC12257 f77856;

    /* JADX INFO: renamed from: ܿ */
    public C14875 f77858;

    /* JADX INFO: renamed from: ᩳ */
    public final C10853 f77859;

    /* JADX INFO: renamed from: ᩴ */
    public int f77860;

    /* JADX INFO: renamed from: ᩷ */
    public EnumC16041 f77861;

    /* JADX INFO: renamed from: ۧ */
    public int f77854 = 1;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f77857 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public long f77862 = C14849.FOREVER_NS;

    /* JADX INFO: renamed from: ֫ */
    public final void m54219(int i, int i2, int i3, int i4, boolean z, AbstractC21582 abstractC21582) {
        if (this.f77861 != null) {
            throw new IllegalStateException("already connected");
        }
        List listM16311 = this.f77852.m16901().m16311();
        C15867 c15867 = new C15867(listM16311);
        if (this.f77852.m16901().m16310() == null) {
            if (!listM16311.contains(C4818.f10945)) {
                throw new C8492(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM30820 = this.f77852.m16901().m16309().m30820();
            if (!C20304.m45846().mo45851(strM30820)) {
                throw new C8492(new UnknownServiceException(C6988.m16053("CLEARTEXT communication to ", strM30820, " not permitted by network security policy")));
            }
        } else if (this.f77852.m16901().m16314().contains(EnumC16041.H2_PRIOR_KNOWLEDGE)) {
            throw new C8492(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        C8492 c8492 = null;
        while (true) {
            try {
                if (this.f77852.m16903()) {
                    m54214(i, i2, i3, abstractC21582);
                    if (this.f77853 != null) {
                        break;
                    } else {
                        break;
                    }
                }
                m54215(i, i2, abstractC21582);
                m54216(c15867, i4, abstractC21582);
                this.f77852.getClass();
                this.f77852.getClass();
                abstractC21582.getClass();
                break;
            } catch (IOException e) {
                C21407.m48497(this.f77849);
                C21407.m48497(this.f77853);
                this.f77849 = null;
                this.f77853 = null;
                this.f77850 = null;
                this.f77856 = null;
                this.f77858 = null;
                this.f77861 = null;
                this.f77855 = null;
                this.f77852.getClass();
                this.f77852.getClass();
                abstractC21582.getClass();
                if (c8492 == null) {
                    c8492 = new C8492(e);
                } else {
                    c8492.m19747(e);
                }
                if (!z) {
                    throw c8492;
                }
                if (!c15867.m36001(e)) {
                    throw c8492;
                }
            }
        }
        if (this.f77852.m16903() && this.f77853 == null) {
            throw new C8492(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f77855 != null) {
            synchronized (this.f77859) {
                this.f77854 = this.f77855.m52250();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54215(int i, int i2, AbstractC21582 abstractC21582) throws IOException {
        Socket socketCreateSocket;
        C7325 c7325 = this.f77852;
        Proxy proxyM16902 = c7325.m16902();
        C7088 c7088M16901 = c7325.m16901();
        if (proxyM16902.type() == Proxy.Type.DIRECT || proxyM16902.type() == Proxy.Type.HTTP) {
            socketCreateSocket = c7088M16901.m16316().createSocket();
        } else {
            socketCreateSocket = new Socket(proxyM16902);
        }
        this.f77853 = socketCreateSocket;
        abstractC21582.getClass();
        this.f77853.setSoTimeout(i2);
        try {
            C20304.m45846().mo45850(this.f77853, c7325.m16904(), i);
            try {
                this.f77850 = C25037.m54976(C25037.m54978(this.f77853));
                this.f77856 = C25037.m54977(C25037.m54975(this.f77853));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + c7325.m16904());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54216(C15867 c15867, int i, AbstractC21582 abstractC21582) throws Throwable {
        SSLSocket sSLSocket;
        EnumC16041 enumC16041M36493;
        C7325 c7325 = this.f77852;
        if (c7325.m16901().m16310() == null) {
            List listM16314 = c7325.m16901().m16314();
            EnumC16041 enumC16041 = EnumC16041.H2_PRIOR_KNOWLEDGE;
            if (listM16314.contains(enumC16041)) {
                this.f77849 = this.f77853;
                this.f77861 = enumC16041;
                m54213(i);
                return;
            } else {
                this.f77849 = this.f77853;
                this.f77861 = EnumC16041.HTTP_1_1;
                return;
            }
        }
        abstractC21582.getClass();
        C7088 c7088M16901 = c7325.m16901();
        try {
            try {
                sSLSocket = (SSLSocket) c7088M16901.m16310().createSocket(this.f77853, c7088M16901.m16309().m30820(), c7088M16901.m16309().m30818(), true);
                try {
                    C4818 c4818M36000 = c15867.m36000(sSLSocket);
                    if (c4818M36000.m10215()) {
                        C20304.m45846().mo10362(sSLSocket, c7088M16901.m16309().m30820(), c7088M16901.m16314());
                    }
                    sSLSocket.startHandshake();
                    SSLSession session = sSLSocket.getSession();
                    C14875 c14875M33982 = C14875.m33982(session);
                    if (!c7088M16901.m16315().verify(c7088M16901.m16309().m30820(), session)) {
                        List listM33986 = c14875M33982.m33986();
                        if (!listM33986.isEmpty()) {
                            X509Certificate x509Certificate = (X509Certificate) listM33986.get(0);
                            throw new SSLPeerUnverifiedException("Hostname " + c7088M16901.m16309().m30820() + " not verified:\n    certificate: " + C24934.m54798(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C10245.m23853(x509Certificate));
                        }
                        throw new SSLPeerUnverifiedException("Hostname " + c7088M16901.m16309().m30820() + " not verified (no certificates)");
                    }
                    c7088M16901.m16306().m54800(c7088M16901.m16309().m30820(), c14875M33982.m33986());
                    String strMo10363 = c4818M36000.m10215() ? C20304.m45846().mo10363(sSLSocket) : null;
                    this.f77849 = sSLSocket;
                    this.f77850 = C25037.m54976(C25037.m54978(sSLSocket));
                    this.f77856 = C25037.m54977(C25037.m54975(this.f77849));
                    this.f77858 = c14875M33982;
                    if (strMo10363 != null) {
                        enumC16041M36493 = EnumC16041.m36493(strMo10363);
                    } else {
                        enumC16041M36493 = EnumC16041.HTTP_1_1;
                    }
                    this.f77861 = enumC16041M36493;
                    C20304.m45846().mo10361(sSLSocket);
                    if (this.f77861 == EnumC16041.HTTP_2) {
                        m54213(i);
                    }
                } catch (AssertionError e) {
                    e = e;
                    if (!C21407.m48498(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    if (sSLSocket != null) {
                        C20304.m45846().mo10361(sSLSocket);
                    }
                    C21407.m48497((Socket) sSLSocket);
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

    /* JADX INFO: renamed from: ֫ */
    private void m54213(int i) throws SocketException {
        this.f77849.setSoTimeout(0);
        C6066 c6066 = new C6066();
        c6066.m13690(this.f77849, this.f77852.m16901().m16309().m30820(), this.f77850, this.f77856);
        c6066.m13691(this);
        c6066.m13689(i);
        C23500 c23500M13688 = c6066.m13688();
        this.f77855 = c23500M13688;
        c23500M13688.m52266();
    }

    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [l.ܺ֫֡, l.ܿ۟᩵] */
    /* JADX INFO: renamed from: ֫ */
    private void m54214(int i, int i2, int i3, AbstractC21582 abstractC21582) throws IOException {
        int i4;
        C11349 c11349 = new C11349();
        C7325 c7325 = this.f77852;
        c11349.m26290(c7325.m16901().m16309());
        Object obj = null;
        c11349.m26287("CONNECT", (AbstractC4643) null);
        boolean z = true;
        c11349.m26293("Host", C21407.m48488(c7325.m16901().m16309(), true));
        c11349.m26293("Proxy-Connection", "Keep-Alive");
        c11349.m26293("User-Agent", "okhttp/3.12.13");
        C10678 c10678M26284 = c11349.m26284();
        C5984 c5984 = new C5984();
        c5984.m13415(c10678M26284);
        c5984.m13418(EnumC16041.HTTP_1_1);
        c5984.m13411(407);
        c5984.m13422("Preemptive Authenticate");
        c5984.m13414(C21407.f67536);
        c5984.m13421(-1L);
        c5984.m13412(-1L);
        c5984.m13420();
        C10678 c10678Mo12799 = c7325.m16901().m16317().mo12799(c5984.m13410());
        if (c10678Mo12799 != null) {
            c10678M26284 = c10678Mo12799;
        }
        C13535 c13535M24591 = c10678M26284.m24591();
        int i5 = 0;
        while (i5 < 21) {
            m54215(i, i2, abstractC21582);
            String str = "CONNECT " + C21407.m48488(c13535M24591, z) + " HTTP/1.1";
            ?? r5 = obj;
            while (true) {
                InterfaceC8233 interfaceC8233 = this.f77850;
                C13187 c13187 = new C13187(r5, r5, interfaceC8233, this.f77856);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                interfaceC8233.mo6579().mo22306(i2);
                this.f77856.mo10980().mo22306(i3);
                str = str;
                c13187.m30189(c10678M26284.m24588(), str);
                c13187.mo30187();
                C5984 c5984Mo30184 = c13187.mo30184(false);
                c5984Mo30184.m13415(c10678M26284);
                C20066 c20066M13410 = c5984Mo30184.m13410();
                long jM5330 = C3127.m5330(c20066M13410);
                if (jM5330 == -1) {
                    jM5330 = 0;
                }
                i4 = i5;
                InterfaceC3579 interfaceC3579M30183 = c13187.m30183(jM5330);
                C21407.m48500(interfaceC3579M30183, Integer.MAX_VALUE);
                interfaceC3579M30183.close();
                int iM45443 = c20066M13410.m45443();
                if (iM45443 == 200) {
                    if (!this.f77850.mo14220().mo14213() || !this.f77856.mo28282().mo14213()) {
                        throw new IOException("TLS tunnel buffered too many bytes!");
                    }
                    c10678M26284 = null;
                    break;
                }
                if (iM45443 == 407) {
                    C10678 c10678Mo127910 = c7325.m16901().m16317().mo12799(c20066M13410);
                    if (c10678Mo127910 == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                    if ("close".equalsIgnoreCase(c20066M13410.m45435("Connection"))) {
                        c10678M26284 = c10678Mo127910;
                        break;
                    } else {
                        i5 = i4;
                        c10678M26284 = c10678Mo127910;
                        r5 = 0;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c20066M13410.m45443());
                }
            }
            if (c10678M26284 == null) {
                return;
            }
            C21407.m48497(this.f77853);
            this.f77853 = null;
            this.f77856 = null;
            this.f77850 = null;
            i5 = i4 + 1;
            obj = null;
            z = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54220(C7088 c7088, C7325 c7325) {
        if (this.f77857.size() >= this.f77854 || this.f77851) {
            return false;
        }
        AbstractC10007 abstractC10007 = AbstractC10007.f27689;
        C7325 c7326 = this.f77852;
        if (!abstractC10007.mo23321(c7326.m16901(), c7088)) {
            return false;
        }
        if (c7088.m16309().m30820().equals(c7326.m16901().m16309().m30820())) {
            return true;
        }
        if (this.f77855 == null || c7325 == null) {
            return false;
        }
        Proxy.Type type = c7325.m16902().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || c7326.m16902().type() != type2 || !c7326.m16904().equals(c7325.m16904()) || c7325.m16901().m16315() != C10245.f28375 || !m54221(c7088.m16309())) {
            return false;
        }
        try {
            c7088.m16306().m54800(c7088.m16309().m30820(), this.f77858.m33986());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54221(C13535 c13535) {
        int iM30818 = c13535.m30818();
        C7325 c7325 = this.f77852;
        if (iM30818 == c7325.m16901().m16309().m30818()) {
            if (c13535.m30820().equals(c7325.m16901().m16309().m30820())) {
                return true;
            }
            if (this.f77858 != null) {
                if (C10245.m23855((X509Certificate) this.f77858.m33986().get(0), c13535.m30820())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20563 m54217(C18724 c18724, C9833 c9833, C17208 c17208) {
        if (this.f77855 != null) {
            return new C16123(c18724, c9833, c17208, this.f77855);
        }
        this.f77849.setSoTimeout(c9833.m23005());
        C16989 c16989Mo6579 = this.f77850.mo6579();
        long jM23005 = c9833.m23005();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c16989Mo6579.mo22306(jM23005);
        this.f77856.mo10980().mo22306(c9833.m23009());
        return new C13187(c18724, c17208, this.f77850, this.f77856);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C7325 m54226() {
        return this.f77852;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54218() {
        C21407.m48497(this.f77853);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Socket m54225() {
        return this.f77849;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54222(boolean z) {
        if (!this.f77849.isClosed() && !this.f77849.isInputShutdown() && !this.f77849.isOutputShutdown()) {
            C23500 c23500 = this.f77855;
            if (c23500 != null) {
                return c23500.m52264(System.nanoTime());
            }
            if (z) {
                try {
                    int soTimeout = this.f77849.getSoTimeout();
                    try {
                        this.f77849.setSoTimeout(1);
                        if (this.f77850.mo14213()) {
                            this.f77849.setSoTimeout(soTimeout);
                            return false;
                        }
                        this.f77849.setSoTimeout(soTimeout);
                        return true;
                    } catch (Throwable th) {
                        this.f77849.setSoTimeout(soTimeout);
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

    @Override // p067l.AbstractC2712
    /* JADX INFO: renamed from: ֫ */
    public final void mo4201(C12101 c12101) {
        c12101.m27959(EnumC15197.REFUSED_STREAM);
    }

    @Override // p067l.AbstractC2712
    /* JADX INFO: renamed from: ֫ */
    public final void mo4202(C23500 c23500) {
        synchronized (this.f77859) {
            this.f77854 = c23500.m52250();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C14875 m54223() {
        return this.f77858;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m54224() {
        return this.f77855 != null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        C7325 c7325 = this.f77852;
        sb.append(c7325.m16901().m16309().m30820());
        sb.append(":");
        sb.append(c7325.m16901().m16309().m30818());
        sb.append(", proxy=");
        sb.append(c7325.m16902());
        sb.append(" hostAddress=");
        sb.append(c7325.m16904());
        sb.append(" cipherSuite=");
        C14875 c14875 = this.f77858;
        sb.append(c14875 != null ? c14875.m33984() : "none");
        sb.append(" protocol=");
        sb.append(this.f77861);
        sb.append('}');
        return sb.toString();
    }

    public C24585(C10853 c10853, C7325 c7325) {
        this.f77859 = c10853;
        this.f77852 = c7325;
    }
}
