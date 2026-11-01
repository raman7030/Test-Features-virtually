package p067l;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: l.ܿܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 31HA */
/* JADX INFO: loaded from: classes5.dex */
public final class C18962 extends C22316 {
    @Override // p067l.C22316, p067l.C20304
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ֫ */
    public final void mo10362(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C20304.m45845(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // p067l.C22316, p067l.C20304
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ۧ */
    public final String mo10363(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
