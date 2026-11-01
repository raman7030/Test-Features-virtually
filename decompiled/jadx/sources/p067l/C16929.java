package p067l;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܶܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 357K */
/* JADX INFO: loaded from: classes4.dex */
public class C16929 extends AbstractC7543 {

    /* JADX INFO: renamed from: ۠ */
    public static final String f50100 = StandardCharsets.ISO_8859_1.name();

    /* JADX INFO: renamed from: ۖ */
    public BufferedReader f50103;

    /* JADX INFO: renamed from: ۘ */
    public BufferedWriter f50104;

    /* JADX INFO: renamed from: ᩵ */
    public int f50109;

    /* JADX INFO: renamed from: ֨ */
    public boolean f50102 = true;

    /* JADX INFO: renamed from: ֡ */
    public ArrayList f50101 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ */
    public boolean f50108 = false;

    /* JADX INFO: renamed from: ۚ */
    public String f50105 = null;

    /* JADX INFO: renamed from: ܺ */
    public String f50107 = f50100;

    /* JADX INFO: renamed from: ۡ */
    public C2848 f50106 = new C2848(this);

    /* JADX INFO: renamed from: ۙ */
    public void m38510() throws IOException {
        super.mo15761();
        this.f50103 = new C2476(new InputStreamReader(this.f19789, this.f50107));
        this.f50104 = new BufferedWriter(new OutputStreamWriter(this.f19791, this.f50107));
        if (this.f19788 > 0) {
            int soTimeout = this.f19790.getSoTimeout();
            this.f19790.setSoTimeout(this.f19788);
            try {
                try {
                    m38511();
                    if (C13061.m29895(this.f50109)) {
                        m38511();
                    }
                    this.f19790.setSoTimeout(soTimeout);
                    return;
                } catch (SocketTimeoutException e) {
                    throw new IOException("Timed out waiting for initial connect reply", e);
                }
            } catch (Throwable th) {
                this.f19790.setSoTimeout(soTimeout);
                throw th;
            }
        }
        m38511();
        if (C13061.m29895(this.f50109)) {
            m38511();
        }
    }

    @Override // p067l.AbstractC7543
    /* JADX INFO: renamed from: ۡ */
    public void mo15741() {
        super.mo15741();
        this.f50103 = null;
        this.f50104 = null;
        this.f50108 = false;
        this.f50105 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38507(InetAddress inetAddress, int i) {
        String hostAddress = inetAddress.getHostAddress();
        int iIndexOf = hostAddress.indexOf(37);
        if (iIndexOf > 0) {
            hostAddress = hostAddress.substring(0, iIndexOf);
        }
        StringBuilder sb = new StringBuilder("|");
        if (inetAddress instanceof Inet4Address) {
            sb.append("1");
        } else if (inetAddress instanceof Inet6Address) {
            sb.append("2");
        }
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return m38508(EnumC14918.EPRT, sb.toString());
    }

    @Override // p067l.AbstractC7543
    /* JADX INFO: renamed from: ۠ */
    public final C2848 mo17448() {
        return this.f50106;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m38511() throws IOException {
        this.f50108 = true;
        ArrayList arrayList = this.f50101;
        arrayList.clear();
        String line = this.f50103.readLine();
        if (line == null) {
            throw new C14248("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new C4861("Truncated server reply: ".concat(line));
        }
        try {
            this.f50109 = Integer.parseInt(line.substring(0, 3));
            arrayList.add(line);
            boolean z = this.f50102;
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f50103.readLine();
                        if (line2 == null) {
                            throw new C14248("Connection closed without indication.");
                        }
                        arrayList.add(line2);
                        if (line2.length() > 3 && line2.charAt(3) != '-' && Character.isDigit(line2.charAt(0))) {
                            break;
                        }
                    }
                } else if (z && cCharAt != ' ') {
                    throw new C4861(C6988.m16053("Invalid server reply: '", line, "'"));
                }
            } else if (z) {
                throw new C4861(C6988.m16053("Truncated server reply: '", line, "'"));
            }
            m38509();
            m17441();
            int i = this.f50109;
            if (i != 421) {
                return i;
            }
            throw new C14248("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new C4861("Could not parse response code.\nServer Reply: ".concat(line));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m38513() {
        return this.f50109;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m38509() {
        if (!this.f50108) {
            return this.f50105;
        }
        this.f50108 = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f50101.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "\r\n");
            }
        }
        String string = sb.toString();
        this.f50105 = string;
        return string;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m38514(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return m38508(EnumC14918.PORT, sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38508(EnumC14918 enumC14918, String str) {
        return mo28272(enumC14918.m34138(), str);
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo28272(String str, String str2) throws IOException {
        if (this.f50104 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append("\r\n");
            try {
                this.f50104.write(sb.toString());
                this.f50104.flush();
                m17447();
                return m38511();
            } catch (SocketException e) {
                if (!m17450()) {
                    throw new C14248("Connection unexpectedly closed.");
                }
                throw e;
            }
        }
        throw new IOException("Connection is not open");
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m38512(String str) {
        this.f50107 = str;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m38515(String str) {
        return m38508(EnumC14918.SIZE, str);
    }
}
