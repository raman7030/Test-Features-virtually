package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: l.ܳ֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4D7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f42867;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42868;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42869;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42870 = 0;

    public C14204(List list) {
        this.f42867 = list;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2577 m33868(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C2577 c2577;
        int i = this.f42870;
        List list = this.f42867;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                c2577 = null;
                break;
            }
            c2577 = (C2577) list.get(i);
            if (c2577.m8177(sSLSocket)) {
                this.f42870 = i + 1;
                break;
            }
            i++;
        }
        if (c2577 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f42868 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        for (int i2 = this.f42870; i2 < list.size(); i2++) {
            if (((C2577) list.get(i2)).m8177(sSLSocket)) {
                this.f42869 = z;
                AbstractC8037.f24775.mo21351(c2577, sSLSocket, this.f42868);
                return c2577;
            }
        }
        z = false;
        this.f42869 = z;
        AbstractC8037.f24775.mo21351(c2577, sSLSocket, this.f42868);
        return c2577;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33869(IOException iOException) {
        this.f42868 = true;
        if (!this.f42869 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
