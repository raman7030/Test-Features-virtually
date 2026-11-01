package p067l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;

/* JADX INFO: renamed from: l.ܰܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 42VH */
/* JADX INFO: loaded from: classes4.dex */
public class C15588 extends C6872 {

    /* JADX INFO: renamed from: ܺ֫ */
    public static final String[] f44540 = {"C", "E", "S", "P"};

    /* JADX INFO: renamed from: ۜ֫ */
    public final boolean f44541;

    /* JADX INFO: renamed from: ܿ֫ */
    public SSLContext f44545;

    /* JADX INFO: renamed from: ᩷֫ */
    public Socket f44547;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f44546 = "TLS";

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f44548 = true;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f44544 = true;

    /* JADX INFO: renamed from: ۡ֫ */
    public TrustManager f44542 = C6501.m14915();

    /* JADX INFO: renamed from: ۢ֫ */
    public final String f44543 = "TLS";

    /* JADX INFO: renamed from: ۧ */
    public void mo28268(Socket socket) {
        throw null;
    }

    public C15588(boolean z) {
        this.f44541 = z;
    }

    @Override // p067l.C6872, p067l.AbstractC7543
    /* JADX INFO: renamed from: ᩵ */
    public final void mo15761() throws IOException {
        boolean z = this.f44541;
        if (z) {
            m17440();
            m35437();
        }
        super.mo15761();
        if (z) {
            return;
        }
        int iMo28272 = mo28272("AUTH", this.f44546);
        if (334 == iMo28272 || 234 == iMo28272) {
            m35437();
            return;
        }
        throw new SSLException(m38509());
    }

    /* JADX INFO: renamed from: ۟ */
    public final void m35438() throws IOException {
        for (int i = 0; i < 4; i++) {
            if (f44540[i].equals("P")) {
                if (200 != mo28272("PROT", "P")) {
                    throw new SSLException(m38509());
                }
                if ("C".equals("P")) {
                    m17443((C3818) null);
                    m17444((C9554) null);
                    return;
                } else {
                    m17443(new C3818(this.f44545));
                    m17444(new C9554(this.f44545));
                    m35435();
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // p067l.C6872, p067l.C16929, p067l.AbstractC7543
    /* JADX INFO: renamed from: ۡ */
    public final void mo15741() {
        super.mo15741();
        Socket socket = this.f44547;
        if (socket != null) {
            socket.close();
        }
        m17443((C3818) null);
        m17444((C9554) null);
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m35439() throws SSLException {
        if (200 != mo28272("PBSZ", String.valueOf(0L))) {
            throw new SSLException(m38509());
        }
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private void m35435() throws IOException {
        if (this.f44545 == null) {
            String str = this.f44543;
            TrustManager trustManager = this.f44542;
            TrustManager[] trustManagerArr = trustManager == null ? null : new TrustManager[]{trustManager};
            try {
                SSLContext sSLContext = SSLContext.getInstance(str);
                sSLContext.init(null, trustManagerArr, null);
                this.f44545 = sSLContext;
            } catch (GeneralSecurityException e) {
                throw new IOException("Could not initialize SSL context", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[Catch: all -> 0x00a7, TRY_ENTER, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #0 {all -> 0x00a7, blocks: (B:15:0x0048, B:21:0x006e, B:23:0x0076, B:27:0x0083, B:32:0x0096, B:33:0x0099, B:35:0x009f, B:18:0x005b), top: B:82:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    @Override // p067l.C6872
    /* JADX INFO: renamed from: ܿ */
    public Socket mo15754(String str, String str2) throws IOException {
        Socket socketAccept;
        Socket socket = null;
        if (m15739() == 0 || m15739() == 2) {
            boolean z = m17452() instanceof Inet6Address;
            long millis = m15751().toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (m15739() == 0) {
                ServerSocket serverSocketCreateServerSocket = this.f19793.createServerSocket(0, 1, m17449());
                try {
                    if (z) {
                        if (C13061.m29891(m38507(m17449(), serverSocketCreateServerSocket.getLocalPort()))) {
                            if (m15740() > 0 || m15747(m15740())) {
                                if (C13061.m29895(mo28272(str, str2))) {
                                    if (iMin >= 0) {
                                        serverSocketCreateServerSocket.setSoTimeout(iMin);
                                    }
                                    socketAccept = serverSocketCreateServerSocket.accept();
                                    if (iMin >= 0) {
                                        socketAccept.setSoTimeout(iMin);
                                    }
                                    serverSocketCreateServerSocket.close();
                                    if (!m15749() && !m17445(socketAccept)) {
                                        InetAddress inetAddress = socketAccept.getInetAddress();
                                        Closeable[] closeableArr = {socketAccept, null};
                                        byte[] bArr = C23461.f74712;
                                        C20760.m46868(new C10050(), closeableArr);
                                        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + m17452().getHostAddress());
                                    }
                                    socket = socketAccept;
                                } else if (serverSocketCreateServerSocket != null) {
                                }
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        }
                    } else if (C13061.m29891(m38514(m17449(), serverSocketCreateServerSocket.getLocalPort()))) {
                        if (m15740() > 0) {
                            if (C13061.m29895(mo28272(str, str2))) {
                                if (iMin >= 0) {
                                    serverSocketCreateServerSocket.setSoTimeout(iMin);
                                }
                                socketAccept = serverSocketCreateServerSocket.accept();
                                if (iMin >= 0) {
                                    socketAccept.setSoTimeout(iMin);
                                }
                                serverSocketCreateServerSocket.close();
                                if (!m15749()) {
                                }
                                socket = socketAccept;
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        } else if (C13061.m29895(mo28272(str, str2))) {
                            if (iMin >= 0) {
                                serverSocketCreateServerSocket.setSoTimeout(iMin);
                            }
                            socketAccept = serverSocketCreateServerSocket.accept();
                            if (iMin >= 0) {
                                socketAccept.setSoTimeout(iMin);
                            }
                            serverSocketCreateServerSocket.close();
                            if (!m15749()) {
                            }
                            socket = socketAccept;
                        } else if (serverSocketCreateServerSocket != null) {
                        }
                    }
                    serverSocketCreateServerSocket.close();
                } catch (Throwable th) {
                    if (serverSocketCreateServerSocket != null) {
                        try {
                            serverSocketCreateServerSocket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                ArrayList arrayList = this.f50101;
                if (z && m38508(EnumC14918.EPSV, (String) null) == 229) {
                    m15743((String) arrayList.get(0));
                } else if (!z && m38508(EnumC14918.PASV, (String) null) == 227) {
                    m15742((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f19792.createSocket();
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(m15750(), m15745()), this.f19788);
                if (m15740() > 0 && !m15747(m15740())) {
                    byte[] bArr2 = C23461.f74712;
                    C20760.m46868(new C10050(), socketCreateSocket, null);
                } else if (!C13061.m29895(mo28272(str, str2))) {
                    byte[] bArr3 = C23461.f74712;
                    C20760.m46868(new C10050(), socketCreateSocket, null);
                } else {
                    socketAccept = socketCreateSocket;
                    if (!m15749()) {
                    }
                    socket = socketAccept;
                }
            }
        }
        mo28268(socket);
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            boolean z2 = this.f44544;
            sSLSocket.setUseClientMode(z2);
            sSLSocket.setEnableSessionCreation(this.f44548);
            if (!z2) {
                sSLSocket.setNeedClientAuth(false);
                sSLSocket.setWantClientAuth(false);
            }
            sSLSocket.startHandshake();
        }
        return socket;
    }

    @Override // p067l.C16929, p067l.InterfaceC14937
    /* JADX INFO: renamed from: ܽ */
    public int mo28272(String str, String str2) throws IOException {
        int iMo28272 = super.mo28272(str, str2);
        if (!"CCC".equals(str)) {
            return iMo28272;
        }
        if (200 != iMo28272) {
            throw new SSLException(m38509());
        }
        this.f19790.close();
        this.f19790 = this.f44547;
        this.f50103 = new BufferedReader(new InputStreamReader(this.f19790.getInputStream(), this.f50107));
        this.f50104 = new BufferedWriter(new OutputStreamWriter(this.f19790.getOutputStream(), this.f50107));
        return iMo28272;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m35436(boolean z) {
        this.f44548 = z;
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m35437() throws IOException {
        this.f44547 = this.f19790;
        m35435();
        Socket socket = this.f19790;
        SSLSocket sSLSocket = socket != null ? (SSLSocket) this.f44545.getSocketFactory().createSocket(socket, this.f19787, socket.getPort(), false) : null;
        sSLSocket.setEnableSessionCreation(this.f44548);
        boolean z = this.f44544;
        sSLSocket.setUseClientMode(z);
        if (!z) {
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.setWantClientAuth(false);
        }
        sSLSocket.startHandshake();
        this.f19790 = sSLSocket;
        this.f50103 = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.f50107));
        this.f50104 = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.f50107));
    }
}
