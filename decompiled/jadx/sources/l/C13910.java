package l;

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
public class C13910 extends C4739 {

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f41459 = {"C", "E", "S", "P"};

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f41460;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public SSLContext f41464;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public Socket f41466;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f41465 = "TLS";

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f41467 = true;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f41463 = true;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public TrustManager f41461 = C4349.m13051();

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final String f41462 = "TLS";

    /* JADX INFO: renamed from: ۧ */
    public void mo26239(Socket socket) {
        throw null;
    }

    public C13910(boolean z) {
        this.f41460 = z;
    }

    @Override // l.C4739, l.AbstractC5445
    /* JADX INFO: renamed from: ᩵ */
    public final void mo13881() throws IOException {
        boolean z = this.f41460;
        if (z) {
            m15529();
            m33318();
        }
        super.mo13881();
        if (z) {
            return;
        }
        int iMo26243 = mo26243("AUTH", this.f41465);
        if (334 == iMo26243 || 234 == iMo26243) {
            m33318();
            return;
        }
        throw new SSLException(m36351());
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m33319() throws IOException {
        for (int i = 0; i < 4; i++) {
            if (f41459[i].equals("P")) {
                if (200 != mo26243("PROT", "P")) {
                    throw new SSLException(m36351());
                }
                if ("C".equals("P")) {
                    m15532((C1526) null);
                    m15533((C7561) null);
                    return;
                } else {
                    m15532(new C1526(this.f41464));
                    m15533(new C7561(this.f41464));
                    m33316();
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // l.C4739, l.C15321, l.AbstractC5445
    /* JADX INFO: renamed from: ۡ */
    public final void mo13861() {
        super.mo13861();
        Socket socket = this.f41466;
        if (socket != null) {
            socket.close();
        }
        m15532((C1526) null);
        m15533((C7561) null);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33320() throws SSLException {
        if (200 != mo26243("PBSZ", String.valueOf(0L))) {
            throw new SSLException(m36351());
        }
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m33316() throws IOException {
        if (this.f41464 == null) {
            String str = this.f41462;
            TrustManager trustManager = this.f41461;
            TrustManager[] trustManagerArr = trustManager == null ? null : new TrustManager[]{trustManager};
            try {
                SSLContext sSLContext = SSLContext.getInstance(str);
                sSLContext.init(null, trustManagerArr, null);
                this.f41464 = sSLContext;
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
    @Override // l.C4739
    /* JADX INFO: renamed from: ܿ */
    public Socket mo13874(String str, String str2) throws IOException {
        Socket socketAccept;
        Socket socket = null;
        if (m13859() == 0 || m13859() == 2) {
            boolean z = m15541() instanceof Inet6Address;
            long millis = m13871().toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (m13859() == 0) {
                ServerSocket serverSocketCreateServerSocket = this.f16952.createServerSocket(0, 1, m15538());
                try {
                    if (z) {
                        if (C11250.m27829(m36349(m15538(), serverSocketCreateServerSocket.getLocalPort()))) {
                            if (m13860() > 0 || m13867(m13860())) {
                                if (C11250.m27833(mo26243(str, str2))) {
                                    if (iMin >= 0) {
                                        serverSocketCreateServerSocket.setSoTimeout(iMin);
                                    }
                                    socketAccept = serverSocketCreateServerSocket.accept();
                                    if (iMin >= 0) {
                                        socketAccept.setSoTimeout(iMin);
                                    }
                                    serverSocketCreateServerSocket.close();
                                    if (!m13869() && !m15534(socketAccept)) {
                                        InetAddress inetAddress = socketAccept.getInetAddress();
                                        Closeable[] closeableArr = {socketAccept, null};
                                        byte[] bArr = C22194.f71991;
                                        C19352.m44574(new C8083(), closeableArr);
                                        throw new IOException("Host attempting data connection " + inetAddress.getHostAddress() + " is not same as server " + m15541().getHostAddress());
                                    }
                                    socket = socketAccept;
                                } else if (serverSocketCreateServerSocket != null) {
                                }
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        }
                    } else if (C11250.m27829(m36356(m15538(), serverSocketCreateServerSocket.getLocalPort()))) {
                        if (m13860() > 0) {
                            if (C11250.m27833(mo26243(str, str2))) {
                                if (iMin >= 0) {
                                    serverSocketCreateServerSocket.setSoTimeout(iMin);
                                }
                                socketAccept = serverSocketCreateServerSocket.accept();
                                if (iMin >= 0) {
                                    socketAccept.setSoTimeout(iMin);
                                }
                                serverSocketCreateServerSocket.close();
                                if (!m13869()) {
                                }
                                socket = socketAccept;
                            } else if (serverSocketCreateServerSocket != null) {
                            }
                        } else if (C11250.m27833(mo26243(str, str2))) {
                            if (iMin >= 0) {
                                serverSocketCreateServerSocket.setSoTimeout(iMin);
                            }
                            socketAccept = serverSocketCreateServerSocket.accept();
                            if (iMin >= 0) {
                                socketAccept.setSoTimeout(iMin);
                            }
                            serverSocketCreateServerSocket.close();
                            if (!m13869()) {
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
                ArrayList arrayList = this.f46975;
                if (z && m36350(EnumC13205.EPSV, (String) null) == 229) {
                    m13863((String) arrayList.get(0));
                } else if (!z && m36350(EnumC13205.PASV, (String) null) == 227) {
                    m13862((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f16951.createSocket();
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(m13870(), m13865()), this.f16947);
                if (m13860() > 0 && !m13867(m13860())) {
                    byte[] bArr2 = C22194.f71991;
                    C19352.m44574(new C8083(), socketCreateSocket, null);
                } else if (!C11250.m27833(mo26243(str, str2))) {
                    byte[] bArr3 = C22194.f71991;
                    C19352.m44574(new C8083(), socketCreateSocket, null);
                } else {
                    socketAccept = socketCreateSocket;
                    if (!m13869()) {
                    }
                    socket = socketAccept;
                }
            }
        }
        mo26239(socket);
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            boolean z2 = this.f41463;
            sSLSocket.setUseClientMode(z2);
            sSLSocket.setEnableSessionCreation(this.f41467);
            if (!z2) {
                sSLSocket.setNeedClientAuth(false);
                sSLSocket.setWantClientAuth(false);
            }
            sSLSocket.startHandshake();
        }
        return socket;
    }

    @Override // l.C15321, l.InterfaceC13224
    /* JADX INFO: renamed from: ܽ */
    public int mo26243(String str, String str2) throws IOException {
        int iMo26243 = super.mo26243(str, str2);
        if (!"CCC".equals(str)) {
            return iMo26243;
        }
        if (200 != iMo26243) {
            throw new SSLException(m36351());
        }
        this.f16949.close();
        this.f16949 = this.f41466;
        this.f46977 = new BufferedReader(new InputStreamReader(this.f16949.getInputStream(), this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(this.f16949.getOutputStream(), this.f46981));
        return iMo26243;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33317(boolean z) {
        this.f41467 = z;
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m33318() throws IOException {
        this.f41466 = this.f16949;
        m33316();
        Socket socket = this.f16949;
        SSLSocket sSLSocket = socket != null ? (SSLSocket) this.f41464.getSocketFactory().createSocket(socket, this.f16946, socket.getPort(), false) : null;
        sSLSocket.setEnableSessionCreation(this.f41467);
        boolean z = this.f41463;
        sSLSocket.setUseClientMode(z);
        if (!z) {
            sSLSocket.setNeedClientAuth(false);
            sSLSocket.setWantClientAuth(false);
        }
        sSLSocket.startHandshake();
        this.f16949 = sSLSocket;
        this.f46977 = new BufferedReader(new InputStreamReader(sSLSocket.getInputStream(), this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(sSLSocket.getOutputStream(), this.f46981));
    }
}
