package p067l;

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
public final class C22575 implements InterfaceC24263 {

    /* JADX INFO: renamed from: ֫ */
    public Object f71276;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f71277;

    /* JADX INFO: renamed from: ܽ */
    public final C18724 f71278;

    /* JADX INFO: renamed from: ᩳ */
    public volatile C17208 f71279;

    public C22575(C18724 c18724) {
        this.f71278 = c18724;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50599() {
        this.f71277 = true;
        C17208 c17208 = this.f71279;
        if (c17208 != null) {
            c17208.m38971();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50601() {
        return this.f71277;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50600(Object obj) {
        this.f71276 = obj;
    }

    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) throws IOException {
        C10678 c10678M23010 = c9833.m23010();
        InterfaceC18228 interfaceC18228M23000 = c9833.m23000();
        AbstractC21582 abstractC21582M23008 = c9833.m23008();
        C17208 c17208 = new C17208(this.f71278.m42728(), m50595(c10678M23010.m24591()), interfaceC18228M23000, abstractC21582M23008, this.f71276);
        this.f71279 = c17208;
        int i = 0;
        C20066 c20066 = null;
        while (!this.f71277) {
            try {
                try {
                    C20066 c20066M23002 = c9833.m23002(c10678M23010, c17208, null, null);
                    if (c20066 != null) {
                        C5984 c5984M45438 = c20066M23002.m45438();
                        C5984 c5984M45439 = c20066.m45438();
                        c5984M45439.m13414((AbstractC2630) null);
                        c5984M45438.m13424(c5984M45439.m13410());
                        c20066M23002 = c5984M45438.m13410();
                    }
                    try {
                        C10678 c10678M50596 = m50596(c20066M23002, c17208.m38980());
                        if (c10678M50596 == null) {
                            c17208.m38976();
                            return c20066M23002;
                        }
                        C21407.m48495(c20066M23002.m45436());
                        int i2 = i + 1;
                        if (i2 > 20) {
                            c17208.m38976();
                            throw new ProtocolException(C20778.m46922(i2, "Too many follow-up requests: "));
                        }
                        if (c10678M50596.m24585() instanceof InterfaceC21234) {
                            c17208.m38976();
                            throw new HttpRetryException("Cannot retry streamed HTTP body", c20066M23002.m45443());
                        }
                        if (!m50598(c20066M23002, c10678M50596.m24591())) {
                            c17208.m38976();
                            c17208 = new C17208(this.f71278.m42728(), m50595(c10678M50596.m24591()), interfaceC18228M23000, abstractC21582M23008, this.f71276);
                            this.f71279 = c17208;
                        } else if (c17208.m38975() != null) {
                            throw new IllegalStateException("Closing the body of " + c20066M23002 + " didn't close its backing stream. Bad interceptor?");
                        }
                        c20066 = c20066M23002;
                        c10678M23010 = c10678M50596;
                        i = i2;
                    } catch (IOException e) {
                        c17208.m38976();
                        throw e;
                    }
                } catch (IOException e2) {
                    if (!m50597(e2, c17208, !(e2 instanceof C23915), c10678M23010)) {
                        throw e2;
                    }
                } catch (C8492 e3) {
                    if (!m50597(e3.m19748(), c17208, false, c10678M23010)) {
                        throw e3.m19746();
                    }
                }
            } catch (Throwable th) {
                c17208.m38972((IOException) null);
                c17208.m38976();
                throw th;
            }
        }
        c17208.m38976();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: ֫ */
    private C7088 m50595(C13535 c13535) {
        SSLSocketFactory sSLSocketFactoryM42725;
        HostnameVerifier hostnameVerifierM42726;
        C24934 c24934M42727;
        boolean zM30827 = c13535.m30827();
        C18724 c18724 = this.f71278;
        if (zM30827) {
            sSLSocketFactoryM42725 = c18724.m42725();
            hostnameVerifierM42726 = c18724.m42726();
            c24934M42727 = c18724.m42727();
        } else {
            sSLSocketFactoryM42725 = null;
            hostnameVerifierM42726 = null;
            c24934M42727 = null;
        }
        return new C7088(c13535.m30820(), c13535.m30818(), c18724.m42731(), c18724.m42721(), sSLSocketFactoryM42725, hostnameVerifierM42726, c24934M42727, c18724.m42730(), null, c18724.m42718(), c18724.m42724(), c18724.m42713());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0045 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    private boolean m50597(IOException iOException, C17208 c17208, boolean z, C10678 c10678) {
        c17208.m38972(iOException);
        if (!this.f71278.m42714() || ((z && ((c10678.m24585() instanceof InterfaceC21234) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if ((iOException instanceof SocketTimeoutException) && !z) {
                if (!c17208.m38979()) {
                    return true;
                }
            }
        } else {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            if (!c17208.m38979()) {
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
    /* JADX INFO: renamed from: ֫ */
    private C10678 m50596(C20066 c20066, C7325 c7325) throws ProtocolException {
        String strM45435;
        C13535 c13535M30813;
        C11349 c11349M24587;
        boolean zEquals;
        int iM45443 = c20066.m45443();
        String strM24589 = c20066.m45434().m24589();
        C18724 c18724 = this.f71278;
        if (iM45443 == 307 || iM45443 == 308) {
            if (strM24589.equals("GET") || strM24589.equals("HEAD")) {
                if (c18724.m42723() && (strM45435 = c20066.m45435("Location")) != null && (c13535M30813 = c20066.m45434().m24591().m30813(strM45435)) != null && (c13535M30813.m30814().equals(c20066.m45434().m24591().m30814()) || c18724.m42722())) {
                    c11349M24587 = c20066.m45434().m24587();
                    if (C5595.m12397(strM24589)) {
                        zEquals = strM24589.equals("PROPFIND");
                        if (!strM24589.equals("PROPFIND")) {
                            c11349M24587.m26287("GET", (AbstractC4643) null);
                        } else {
                            c11349M24587.m26287(strM24589, zEquals ? c20066.m45434().m24585() : null);
                        }
                        if (!zEquals) {
                            c11349M24587.m26285("Transfer-Encoding");
                            c11349M24587.m26285("Content-Length");
                            c11349M24587.m26285("Content-Type");
                        }
                    }
                    if (!m50598(c20066, c13535M30813)) {
                        c11349M24587.m26285("Authorization");
                    }
                    c11349M24587.m26290(c13535M30813);
                    return c11349M24587.m26284();
                }
            }
        } else {
            if (iM45443 == 401) {
                return c18724.m42715().mo12799(c20066);
            }
            int iIntValue = Integer.MAX_VALUE;
            if (iM45443 != 503) {
                if (iM45443 == 407) {
                    if (c7325.m16902().type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return c18724.m42730().mo12799(c20066);
                }
                if (iM45443 != 408) {
                    switch (iM45443) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            if (c18724.m42723()) {
                                c11349M24587 = c20066.m45434().m24587();
                                if (C5595.m12397(strM24589)) {
                                    zEquals = strM24589.equals("PROPFIND");
                                    if (!strM24589.equals("PROPFIND")) {
                                        c11349M24587.m26287("GET", (AbstractC4643) null);
                                    } else {
                                        c11349M24587.m26287(strM24589, zEquals ? c20066.m45434().m24585() : null);
                                    }
                                    if (!zEquals) {
                                        c11349M24587.m26285("Transfer-Encoding");
                                        c11349M24587.m26285("Content-Length");
                                        c11349M24587.m26285("Content-Type");
                                    }
                                }
                                if (!m50598(c20066, c13535M30813)) {
                                    c11349M24587.m26285("Authorization");
                                }
                                c11349M24587.m26290(c13535M30813);
                                return c11349M24587.m26284();
                            }
                        default:
                            return null;
                    }
                } else if (c18724.m42714() && !(c20066.m45434().m24585() instanceof InterfaceC21234) && (c20066.m45444() == null || c20066.m45444().m45443() != 408)) {
                    String strM45436 = c20066.m45435("Retry-After");
                    if (strM45436 == null) {
                        iIntValue = 0;
                    } else if (strM45436.matches("\\d+")) {
                        iIntValue = Integer.valueOf(strM45436).intValue();
                    }
                    if (iIntValue <= 0) {
                        return c20066.m45434();
                    }
                }
            } else if (c20066.m45444() == null || c20066.m45444().m45443() != 503) {
                String strM45437 = c20066.m45435("Retry-After");
                if (strM45437 != null && strM45437.matches("\\d+")) {
                    iIntValue = Integer.valueOf(strM45437).intValue();
                }
                if (iIntValue == 0) {
                    return c20066.m45434();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50598(C20066 c20066, C13535 c13535) {
        C13535 c13535M24591 = c20066.m45434().m24591();
        return c13535M24591.m30820().equals(c13535.m30820()) && c13535M24591.m30818() == c13535.m30818() && c13535M24591.m30814().equals(c13535.m30814());
    }
}
