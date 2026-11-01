package p067l;

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
public final class C15867 {

    /* JADX INFO: renamed from: ֫ */
    public final List f45957;

    /* JADX INFO: renamed from: ۧ */
    public boolean f45958;

    /* JADX INFO: renamed from: ܽ */
    public boolean f45959;

    /* JADX INFO: renamed from: ᩳ */
    public int f45960 = 0;

    public C15867(List list) {
        this.f45957 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4818 m36000(SSLSocket sSLSocket) throws UnknownServiceException {
        boolean z;
        C4818 c4818;
        int i = this.f45960;
        List list = this.f45957;
        int size = list.size();
        while (true) {
            z = true;
            if (i >= size) {
                c4818 = null;
                break;
            }
            c4818 = (C4818) list.get(i);
            if (c4818.m10216(sSLSocket)) {
                this.f45960 = i + 1;
                break;
            }
            i++;
        }
        if (c4818 == null) {
            throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f45958 + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
        }
        for (int i2 = this.f45960; i2 < list.size(); i2++) {
            if (((C4818) list.get(i2)).m10216(sSLSocket)) {
                this.f45959 = z;
                AbstractC10007.f27689.mo23318(c4818, sSLSocket, this.f45958);
                return c4818;
            }
        }
        z = false;
        this.f45959 = z;
        AbstractC10007.f27689.mo23318(c4818, sSLSocket, this.f45958);
        return c4818;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m36001(IOException iOException) {
        this.f45958 = true;
        if (!this.f45959 || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException);
    }
}
