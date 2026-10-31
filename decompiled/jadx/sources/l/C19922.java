package l;

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
public final class C19922 extends Thread {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f64486;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public OutputStream f64487;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f64488;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f64489;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f64490;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f64491;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f64492;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f64493;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f64494;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Socket f64495;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f64496;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f64498;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Socket f64500;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64501;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22038 f64503;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64502 = false;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f64499 = null;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f64497 = false;

    public C19922(Socket socket, C22038 c22038) {
        AbstractC15440 abstractC15440M35468 = C14981.m35468();
        this.f64498 = abstractC15440M35468;
        this.f64486 = abstractC15440M35468;
        this.f64495 = null;
        this.f64490 = null;
        this.f64488 = null;
        this.f64487 = null;
        this.f64494 = C14981.m35466();
        this.f64496 = -1L;
        this.f64491 = -1L;
        this.f64489 = new String[]{"Size", "Modify", "Type", "Perm"};
        this.f64501 = 0;
        this.f64493 = "SHA-1";
        this.f64500 = socket;
        this.f64503 = c22038;
        this.f64492 = true;
        try {
            socket.setSoTimeout(30000);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45847(int i, int i2, byte[] bArr) {
        OutputStream outputStream = this.f64487;
        if (outputStream == null) {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        try {
            outputStream.write(bArr, i, i2);
            this.f64503.getClass();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m45840(byte[] bArr) {
        int i;
        Socket socket = this.f64495;
        if (socket == null || !socket.isConnected()) {
            return -2;
        }
        do {
            i = 0;
            try {
                i = this.f64488.read(bArr, 0, bArr.length);
            } catch (IOException unused) {
            }
        } while (i == 0);
        return i;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m45849() {
        return this.f64503.m49583();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45843(InetAddress inetAddress, int i) {
        this.f64503.m49582(inetAddress, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InetAddress m45859() {
        return this.f64500.getLocalAddress();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m45863() {
        try {
            Socket socketM49584 = this.f64503.m49584();
            this.f64495 = socketM49584;
            if (socketM49584 == null) {
                return false;
            }
            this.f64488 = socketM49584.getInputStream();
            this.f64487 = this.f64495.getOutputStream();
            return true;
        } catch (IOException unused) {
            this.f64495 = null;
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45841() {
        InputStream inputStream = this.f64488;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f64488 = null;
        }
        OutputStream outputStream = this.f64487;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused2) {
            }
            this.f64487 = null;
        }
        Socket socket = this.f64495;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused3) {
            }
        }
        this.f64495 = null;
        C22038 c22038 = this.f64503;
        if (c22038 != null) {
            c22038.m49581();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String string;
        if (this.f64492) {
            m45860("220 FTP-Server ready\r\n");
        }
        try {
            InputStream inputStream = this.f64500.getInputStream();
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
                    m45853();
                    return;
                }
                if (z || byteArrayOutputStream.size() != 0) {
                    try {
                        string = byteArrayOutputStream.toString(this.f64494);
                    } catch (UnsupportedEncodingException unused) {
                        string = byteArrayOutputStream.toString();
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    AbstractRunnableC21333.m48361(this, string);
                } else {
                    m45853();
                    return;
                }
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45853() {
        m45841();
        Socket socket = this.f64500;
        if (socket == null) {
            return;
        }
        try {
            socket.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45860(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f64494);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        try {
            OutputStream outputStream = this.f64500.getOutputStream();
            outputStream.write(bytes);
            outputStream.flush();
            C22038 c22038 = this.f64503;
            int length = bytes.length;
            c22038.getClass();
        } catch (IOException unused2) {
            m45853();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Socket m45850() {
        return this.f64500;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m45858() {
        return this.f64502;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45856(boolean z) {
        this.f64502 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45854(String str) {
        this.f64499 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m45864() {
        return this.f64499;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m45851() {
        return !this.f64497 && C14981.m35464();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45848() {
        return this.f64497;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45845(boolean z) {
        if (z) {
            this.f64497 = true;
            return;
        }
        int i = this.f64501 + 1;
        this.f64501 = i;
        if (i > 3) {
            m45853();
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m45852() {
        return this.f64498;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45855(AbstractC15440 abstractC15440) {
        this.f64498 = abstractC15440.mo23559();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m45857() {
        return this.f64490;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45844(AbstractC15440 abstractC15440) {
        this.f64490 = abstractC15440;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] m45862() {
        return this.f64489;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45846(String[] strArr) {
        this.f64489 = strArr;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m45861() {
        return this.f64493;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45842(String str) {
        this.f64493 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m45865() {
        AbstractC15440 abstractC15440 = this.f64486;
        return abstractC15440.mo23113() ? abstractC15440 : C14981.m35468();
    }
}
