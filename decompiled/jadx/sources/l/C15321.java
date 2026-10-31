package l;

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
public class C15321 extends AbstractC5445 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String f46974 = StandardCharsets.ISO_8859_1.name();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public BufferedReader f46977;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public BufferedWriter f46978;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f46983;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f46976 = true;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f46975 = new ArrayList();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f46982 = false;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f46979 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f46981 = f46974;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C0505 f46980 = new C0505(this);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m36352() throws IOException {
        super.mo13881();
        this.f46977 = new C0114(new InputStreamReader(this.f16948, this.f46981));
        this.f46978 = new BufferedWriter(new OutputStreamWriter(this.f16950, this.f46981));
        if (this.f16947 > 0) {
            int soTimeout = this.f16949.getSoTimeout();
            this.f16949.setSoTimeout(this.f16947);
            try {
                try {
                    m36353();
                    if (C11250.m27833(this.f46983)) {
                        m36353();
                    }
                    this.f16949.setSoTimeout(soTimeout);
                    return;
                } catch (SocketTimeoutException e) {
                    throw new IOException("Timed out waiting for initial connect reply", e);
                }
            } catch (Throwable th) {
                this.f16949.setSoTimeout(soTimeout);
                throw th;
            }
        }
        m36353();
        if (C11250.m27833(this.f46983)) {
            m36353();
        }
    }

    @Override // l.AbstractC5445
    /* JADX INFO: renamed from: ۡ */
    public void mo13861() {
        super.mo13861();
        this.f46977 = null;
        this.f46978 = null;
        this.f46982 = false;
        this.f46979 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36349(InetAddress inetAddress, int i) {
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
        return m36350(EnumC13205.EPRT, sb.toString());
    }

    @Override // l.AbstractC5445
    /* JADX INFO: renamed from: ۠ */
    public final C0505 mo15537() {
        return this.f46980;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m36353() throws IOException {
        this.f46982 = true;
        ArrayList arrayList = this.f46975;
        arrayList.clear();
        String line = this.f46977.readLine();
        if (line == null) {
            throw new C12500("Connection closed without indication.");
        }
        int length = line.length();
        if (length < 3) {
            throw new C2623("Truncated server reply: ".concat(line));
        }
        try {
            this.f46983 = Integer.parseInt(line.substring(0, 3));
            arrayList.add(line);
            boolean z = this.f46976;
            if (length > 3) {
                char cCharAt = line.charAt(3);
                if (cCharAt == '-') {
                    while (true) {
                        String line2 = this.f46977.readLine();
                        if (line2 == null) {
                            throw new C12500("Connection closed without indication.");
                        }
                        arrayList.add(line2);
                        if (line2.length() > 3 && line2.charAt(3) != '-' && Character.isDigit(line2.charAt(0))) {
                            break;
                        }
                    }
                } else if (z && cCharAt != ' ') {
                    throw new C2623(C4860.m14172("Invalid server reply: '", line, "'"));
                }
            } else if (z) {
                throw new C2623(C4860.m14172("Truncated server reply: '", line, "'"));
            }
            m36351();
            m15530();
            int i = this.f46983;
            if (i != 421) {
                return i;
            }
            throw new C12500("FTP response 421 received.  Server closed connection.");
        } catch (NumberFormatException unused) {
            throw new C2623("Could not parse response code.\nServer Reply: ".concat(line));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36355() {
        return this.f46983;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m36351() {
        if (!this.f46982) {
            return this.f46979;
        }
        this.f46982 = false;
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f46975.iterator();
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
        this.f46979 = string;
        return string;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m36356(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        sb.append(',');
        sb.append(i >>> 8);
        sb.append(',');
        sb.append(i & 255);
        return m36350(EnumC13205.PORT, sb.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m36350(EnumC13205 enumC13205, String str) {
        return mo26243(enumC13205.m32040(), str);
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo26243(String str, String str2) throws IOException {
        if (this.f46978 != null) {
            StringBuilder sb = new StringBuilder(str);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            sb.append("\r\n");
            try {
                this.f46978.write(sb.toString());
                this.f46978.flush();
                m15536();
                return m36353();
            } catch (SocketException e) {
                if (!m15539()) {
                    throw new C12500("Connection unexpectedly closed.");
                }
                throw e;
            }
        }
        throw new IOException("Connection is not open");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m36354(String str) {
        this.f46981 = str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m36357(String str) {
        return m36350(EnumC13205.SIZE, str);
    }
}
