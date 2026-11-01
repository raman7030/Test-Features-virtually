package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.Socket;

/* JADX INFO: renamed from: l.᩶ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q541 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21302 extends Thread {

    /* JADX INFO: renamed from: ֫֫ */
    public AbstractC17043 f67123;

    /* JADX INFO: renamed from: ۗ */
    public OutputStream f67124;

    /* JADX INFO: renamed from: ۙ */
    public InputStream f67125;

    /* JADX INFO: renamed from: ۛ */
    public String[] f67126;

    /* JADX INFO: renamed from: ۟ */
    public AbstractC17043 f67127;

    /* JADX INFO: renamed from: ۤ */
    public long f67128;

    /* JADX INFO: renamed from: ۧ֫ */
    public boolean f67129;

    /* JADX INFO: renamed from: ۨ */
    public String f67130;

    /* JADX INFO: renamed from: ۫ */
    public String f67131;

    /* JADX INFO: renamed from: ۬ */
    public Socket f67132;

    /* JADX INFO: renamed from: ܰ */
    public long f67133;

    /* JADX INFO: renamed from: ܿ֫ */
    public AbstractC17043 f67135;

    /* JADX INFO: renamed from: ᩶ */
    public Socket f67137;

    /* JADX INFO: renamed from: ᩸ */
    public int f67138;

    /* JADX INFO: renamed from: ᩺ */
    public C23313 f67140;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f67139 = false;

    /* JADX INFO: renamed from: ᩳ֫ */
    public String f67136 = null;

    /* JADX INFO: renamed from: ܽ֫ */
    public boolean f67134 = false;

    public C21302(Socket socket, C23313 c23313) {
        AbstractC17043 abstractC17043M37624 = C16606.m37624();
        this.f67135 = abstractC17043M37624;
        this.f67123 = abstractC17043M37624;
        this.f67132 = null;
        this.f67127 = null;
        this.f67125 = null;
        this.f67124 = null;
        this.f67131 = C16606.m37622();
        this.f67133 = -1L;
        this.f67128 = -1L;
        this.f67126 = new String[]{"Size", "Modify", "Type", "Perm"};
        this.f67138 = 0;
        this.f67130 = "SHA-1";
        this.f67137 = socket;
        this.f67140 = c23313;
        this.f67129 = true;
        try {
            socket.setSoTimeout(30000);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m48160(int i, int i2, byte[] bArr) {
        OutputStream outputStream = this.f67124;
        if (outputStream == null) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        try {
            outputStream.write(bArr, i, i2);
            this.f67140.getClass();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m48153(byte[] bArr) {
        int i;
        Socket socket = this.f67132;
        if (socket == null || !socket.isConnected()) {
            return -2;
        }
        do {
            i = 0;
            try {
                i = this.f67125.read(bArr, 0, bArr.length);
            } catch (IOException unused) {
            }
        } while (i == 0);
        return i;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m48162() {
        return this.f67140.m51919();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48156(InetAddress inetAddress, int i) {
        this.f67140.m51918(inetAddress, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InetAddress m48172() {
        return this.f67137.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m48176() {
        try {
            Socket socketM51920 = this.f67140.m51920();
            this.f67132 = socketM51920;
            if (socketM51920 == null) {
                return false;
            }
            this.f67125 = socketM51920.getInputStream();
            this.f67124 = this.f67132.getOutputStream();
            return true;
        } catch (IOException unused) {
            this.f67132 = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48154() {
        InputStream inputStream = this.f67125;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f67125 = null;
        }
        OutputStream outputStream = this.f67124;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.f67124 = null;
        }
        Socket socket = this.f67132;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }
        this.f67132 = null;
        C23313 c23313 = this.f67140;
        if (c23313 != null) {
            c23313.m51917();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String string;
        if (this.f67129) {
            m48173("220 FTP-Server ready\r\n");
        }
        try {
            InputStream inputStream = this.f67137.getInputStream();
            while (true) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
                int i = 0;
                boolean z = false;
                while (true) {
                    int i2 = inputStream.read();
                    if (i2 == -1) {
                        break;
                    }
                    if (i2 == 10) {
                        z = true;
                        break;
                    } else {
                        if (i >= 8192) {
                            throw new IOException("FTP command line too long");
                        }
                        i++;
                        if (i2 != 13) {
                            byteArrayOutputStream.write(i2);
                        }
                        z = true;
                    }
                    m48166();
                    return;
                }
                if (z || byteArrayOutputStream.size() != 0) {
                    try {
                        string = byteArrayOutputStream.toString(this.f67131);
                    } catch (UnsupportedEncodingException unused) {
                        string = byteArrayOutputStream.toString();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    AbstractRunnableC22643.m50696(this, string);
                } else {
                    m48166();
                    return;
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48166() {
        m48154();
        Socket socket = this.f67137;
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m48173(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f67131);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        try {
            OutputStream outputStream = this.f67137.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            C23313 c23313 = this.f67140;
            int length = bytes.length;
            c23313.getClass();
        } catch (IOException unused2) {
            m48166();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final Socket m48163() {
        return this.f67137;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m48171() {
        return this.f67139;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48169(boolean z) {
        this.f67139 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48167(String str) {
        this.f67136 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m48177() {
        return this.f67136;
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m48164() {
        return !this.f67134 && C16606.m37620();
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m48161() {
        return this.f67134;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48158(boolean z) {
        if (z) {
            this.f67134 = true;
            return;
        }
        int i = this.f67138 + 1;
        this.f67138 = i;
        if (i > 3) {
            m48166();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final AbstractC17043 m48165() {
        return this.f67135;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48168(AbstractC17043 abstractC17043) {
        this.f67135 = abstractC17043.mo25510();
    }

    /* JADX INFO: renamed from: ܳ */
    public final AbstractC17043 m48170() {
        return this.f67127;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48157(AbstractC17043 abstractC17043) {
        this.f67127 = abstractC17043;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String[] m48175() {
        return this.f67126;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48159(String[] strArr) {
        this.f67126 = strArr;
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m48174() {
        return this.f67130;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48155(String str) {
        this.f67130 = str;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC17043 m48178() {
        AbstractC17043 abstractC17043 = this.f67123;
        return abstractC17043.mo25087() ? abstractC17043 : C16606.m37624();
    }
}
