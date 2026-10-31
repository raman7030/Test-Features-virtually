package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: l.᩸֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K4CY */
/* JADX INFO: loaded from: classes5.dex */
public final class C21262 implements InterfaceC23037 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object f68593;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f68594;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17209 f68595;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C15615 f68596;

    public C21262(C17209 c17209) {
        this.f68595 = c17209;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48268() {
        this.f68594 = true;
        C15615 c15615 = this.f68596;
        if (c15615 != null) {
            c15615.m36805();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48270() {
        return this.f68594;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48269(Object obj) {
        this.f68593 = obj;
    }

    @Override // l.InterfaceC23037
    /* JADX INFO: renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) throws IOException {
        C8743 c8743M21045 = c7855.m21045();
        InterfaceC16687 interfaceC16687M21035 = c7855.m21035();
        AbstractC20216 abstractC20216M21043 = c7855.m21043();
        C15615 c15615 = new C15615(this.f68595.m40481(), m48264(c8743M21045.m22622()), interfaceC16687M21035, abstractC20216M21043, this.f68593);
        this.f68596 = c15615;
        int i = 0;
        C18621 c18621 = null;
        while (!this.f68594) {
            try {
                try {
                    C18621 c18621M21037 = c7855.m21037(c8743M21045, c15615, null, null);
                    if (c18621 != null) {
                        C3804 c3804M43172 = c18621M21037.m43172();
                        C3804 c3804M43173 = c18621.m43172();
                        c3804M43173.m11478((AbstractC0275) null);
                        c3804M43172.m11488(c3804M43173.m11474());
                        c18621M21037 = c3804M43172.m11474();
                    }
                    try {
                        C8743 c8743M48265 = m48265(c18621M21037, c15615.m36814());
                        if (c8743M48265 == null) {
                            c15615.m36810();
                            return c18621M21037;
                        }
                        C20032.m46179(c18621M21037.m43170());
                        int i2 = i + 1;
                        if (i2 > 20) {
                            c15615.m36810();
                            throw new ProtocolException(C19370.m44628(i2, "Too many follow-up requests: "));
                        }
                        if (c8743M48265.m22616() instanceof InterfaceC19851) {
                            c15615.m36810();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", c18621M21037.m43177());
                        }
                        if (!m48267(c18621M21037, c8743M48265.m22622())) {
                            c15615.m36810();
                            c15615 = new C15615(this.f68595.m40481(), m48264(c8743M48265.m22622()), interfaceC16687M21035, abstractC20216M21043, this.f68593);
                            this.f68596 = c15615;
                        } else if (c15615.m36809() != null) {
                            throw new IllegalStateException("Closing the body of " + c18621M21037 + " didn't close its backing stream. Bad interceptor?");
                        }
                        c18621 = c18621M21037;
                        c8743M21045 = c8743M48265;
                        i = i2;
                    } catch (IOException e) {
                        c15615.m36810();
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!m48266(e2, c15615, !(e2 instanceof C22672), c8743M21045)) {
                        throw e2;
                    }
                } catch (C6444 e3) {
                    if (!m48266(e3.m17801(), c15615, false, c8743M21045)) {
                        throw e3.m17799();
                    }
                }
            } catch (Throwable th) {
                c15615.m36806((IOException) null);
                c15615.m36810();
                throw th;
            }
        }
        c15615.m36810();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4965 m48264(C11749 c11749) {
        SSLSocketFactory sSLSocketFactoryM40478;
        HostnameVerifier hostnameVerifierM40479;
        C23743 c23743M40480;
        boolean zM28780 = c11749.m28780();
        C17209 c17209 = this.f68595;
        if (zM28780) {
            sSLSocketFactoryM40478 = c17209.m40478();
            hostnameVerifierM40479 = c17209.m40479();
            c23743M40480 = c17209.m40480();
        } else {
            sSLSocketFactoryM40478 = null;
            hostnameVerifierM40479 = null;
            c23743M40480 = null;
        }
        return new C4965(c11749.m28773(), c11749.m28771(), c17209.m40484(), c17209.m40474(), sSLSocketFactoryM40478, hostnameVerifierM40479, c23743M40480, c17209.m40483(), null, c17209.m40471(), c17209.m40477(), c17209.m40466());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m48266(IOException iOException, C15615 c15615, boolean z, C8743 c8743) {
        c15615.m36806(iOException);
        if (!this.f68595.m40467() || ((z && ((c8743.m22616() instanceof InterfaceC19851) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                if (!c15615.m36813()) {
                    return true;
                }
            }
        } else {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            if (!c15615.m36813()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0148  */
    /* JADX WARN: Code duplicated, block: B:90:0x015d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8743 m48265(C18621 c18621, C5215 c5215) throws ProtocolException {
        String strM43169;
        C11749 c11749M28766;
        C9449 c9449M22618;
        boolean zEquals;
        int iM43177 = c18621.m43177();
        String strM22620 = c18621.m43168().m22620();
        C17209 c17209 = this.f68595;
        if (iM43177 == 307 || iM43177 == 308) {
            if (strM22620.equals("GET") || strM22620.equals("HEAD")) {
                if (c17209.m40476() && (strM43169 = c18621.m43169("Location")) != null && (c11749M28766 = c18621.m43168().m22622().m28766(strM43169)) != null && (c11749M28766.m28767().equals(c18621.m43168().m22622().m28767()) || c17209.m40475())) {
                    c9449M22618 = c18621.m43168().m22618();
                    if (C3395.m10358(strM22620)) {
                        zEquals = strM22620.equals("PROPFIND");
                        if (!strM22620.equals("PROPFIND")) {
                            c9449M22618.m24277("GET", (AbstractC2393) null);
                        } else {
                            c9449M22618.m24277(strM22620, zEquals ? c18621.m43168().m22616() : null);
                        }
                        if (!zEquals) {
                            c9449M22618.m24275("Transfer-Encoding");
                            c9449M22618.m24275("Content-Length");
                            c9449M22618.m24275("Content-Type");
                        }
                    }
                    if (!m48267(c18621, c11749M28766)) {
                        c9449M22618.m24275("Authorization");
                    }
                    c9449M22618.m24280(c11749M28766);
                    return c9449M22618.m24274();
                }
            }
        } else {
            if (iM43177 == 401) {
                return c17209.m40468().mo10819(c18621);
            }
            int iIntValue = Integer.MAX_VALUE;
            if (iM43177 != 503) {
                if (iM43177 == 407) {
                    if (c5215.m14992().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return c17209.m40483().mo10819(c18621);
                }
                if (iM43177 != 408) {
                    switch (iM43177) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (c17209.m40476()) {
                                c9449M22618 = c18621.m43168().m22618();
                                if (C3395.m10358(strM22620)) {
                                    zEquals = strM22620.equals("PROPFIND");
                                    if (!strM22620.equals("PROPFIND")) {
                                        c9449M22618.m24277("GET", (AbstractC2393) null);
                                    } else {
                                        c9449M22618.m24277(strM22620, zEquals ? c18621.m43168().m22616() : null);
                                    }
                                    if (!zEquals) {
                                        c9449M22618.m24275("Transfer-Encoding");
                                        c9449M22618.m24275("Content-Length");
                                        c9449M22618.m24275("Content-Type");
                                    }
                                }
                                if (!m48267(c18621, c11749M28766)) {
                                    c9449M22618.m24275("Authorization");
                                }
                                c9449M22618.m24280(c11749M28766);
                                return c9449M22618.m24274();
                            }
                        default:
                            return null;
                    }
                } else if (c17209.m40467() && !(c18621.m43168().m22616() instanceof InterfaceC19851) && (c18621.m43178() == null || c18621.m43178().m43177() != 408)) {
                    String strM431610 = c18621.m43169("Retry-After");
                    if (strM431610 == null) {
                        iIntValue = 0;
                    } else if (strM431610.matches("\\d+")) {
                        iIntValue = Integer.valueOf(strM431610).intValue();
                    }
                    if (iIntValue <= 0) {
                        return c18621.m43168();
                    }
                }
            } else if (c18621.m43178() == null || c18621.m43178().m43177() != 503) {
                String strM431611 = c18621.m43169("Retry-After");
                if (strM431611 != null && strM431611.matches("\\d+")) {
                    iIntValue = Integer.valueOf(strM431611).intValue();
                }
                if (iIntValue == 0) {
                    return c18621.m43168();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48267(C18621 c18621, C11749 c11749) {
        C11749 c11749M22622 = c18621.m43168().m22622();
        return c11749M22622.m28773().equals(c11749.m28773()) && c11749M22622.m28771() == c11749.m28771() && c11749M22622.m28767().equals(c11749.m28767());
    }
}
