package l;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: l.ܿܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 31HA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17460 extends C20989 {
    @Override // l.C20989, l.C18872
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ֫ */
    public final void mo8318(SSLSocket sSLSocket, String str, List list) throws IOException {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C18872.m43579(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    @Override // l.C20989, l.C18872
    @IgnoreJRERequirement
    /* JADX INFO: renamed from: ۧ */
    public final String mo8319(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
