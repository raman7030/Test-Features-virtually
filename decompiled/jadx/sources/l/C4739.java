package l;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۙܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes3.dex */
public class C4739 extends C15321 implements InterfaceC1211 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15026 = 0;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f15027 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public String f15028;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f15029;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15030;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f15031;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f15032;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17754 f15033;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22378 f15034;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f15035;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3328 f15036;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f15037;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f15038;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f15039;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2828 f15040 = C2828.ofMillis(-1);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC6150 f15041;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f15042;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13878(String str) {
        return C11250.m27829(m36350(EnumC13205.DELE, str));
    }

    public C4739() {
        new Random();
        this.f15037 = true;
        this.f15033 = new C17754();
        C2828 c2828 = C2828.ZERO;
        C2828.ofSeconds(1L);
        this.f15034 = new C22378(this);
        this.f15035 = Boolean.getBoolean("org.apache.commons.net.ftp.ipAddressFromPasvResponse");
        m13853();
    }

    @Override // l.AbstractC5445
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void mo13881() throws IOException {
        super.m36352();
        m13853();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Socket m13866(EnumC13205 enumC13205, String str) {
        return mo13874(enumC13205.m32040(), str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Socket mo13874(String str, String str2) throws IOException {
        Socket socketAccept;
        int i = this.f15038;
        if (i == 0 || i == 2) {
            boolean z = m15541() instanceof Inet6Address;
            long millis = this.f15040.toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (this.f15038 != 0) {
                ArrayList arrayList = this.f46975;
                if (z && m36350(EnumC13205.EPSV, (String) null) == 229) {
                    m13863((String) arrayList.get(0));
                } else if (!z && m36350(EnumC13205.PASV, (String) null) == 227) {
                    m13862((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f16951.createSocket();
                if (this.f15030 == 13) {
                    socketCreateSocket = new C8267(socketCreateSocket);
                }
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(this.f15031, this.f15042), this.f16947);
                long j = this.f15032;
                if (j > 0 && !m13867(j)) {
                    socketCreateSocket.close();
                    return null;
                }
                if (!C11250.m27833(mo26243(str, str2))) {
                    socketCreateSocket.close();
                    return null;
                }
                socketAccept = socketCreateSocket;
                if (this.f15037) {
                }
                return socketAccept;
            }
            ServerSocket serverSocketCreateServerSocket = this.f16952.createServerSocket(0, 1, m15538());
            try {
                if (z) {
                    if (!C11250.m27829(m36349(m15538(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!C11250.m27829(m36356(m15538(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                long j2 = this.f15032;
                if (j2 <= 0 || m13867(j2)) {
                    if (C11250.m27833(mo26243(str, str2))) {
                        if (iMin >= 0) {
                            serverSocketCreateServerSocket.setSoTimeout(iMin);
                        }
                        socketAccept = serverSocketCreateServerSocket.accept();
                        if (this.f15030 == 13) {
                            socketAccept = new C8267(socketAccept);
                        }
                        if (iMin >= 0) {
                            socketAccept.setSoTimeout(iMin);
                        }
                        serverSocketCreateServerSocket.close();
                        if (this.f15037 || m15534(socketAccept)) {
                            return socketAccept;
                        }
                        InetAddress inetAddress = socketAccept.getInetAddress();
                        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                        InetAddress inetAddress2 = this.f16949.getInetAddress();
                        String hostAddress2 = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
                        C22194.m49850(socketAccept);
                        throw new IOException(C19462.m44858("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2));
                    }
                    if (serverSocketCreateServerSocket != null) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (serverSocketCreateServerSocket != null) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
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
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m13863(String str) throws C2623 {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cM19937 = C7416.m19937(1, strTrim);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cM19937) {
            throw new C2623("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
        try {
            int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.f15031 = m15541().getHostAddress();
            this.f15042 = i;
        } catch (NumberFormatException unused) {
            throw new C2623("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13857(String str, String str2) {
        return C11250.m27829(m36350(EnumC13205.MFMT, str2 + ' ' + str));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13882(String str) {
        return C11250.m27829(m36350(EnumC13205.MKD, str));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m13862(String str) throws C2623 {
        Matcher matcher = f15027.matcher(str);
        if (!matcher.find()) {
            throw new C2623(C20094.m46315("Could not parse passive host information.\nServer Reply: ", str));
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.f16949.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int i = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (this.f15035) {
                C22378 c22378 = this.f15034;
                if (c22378 != null) {
                    try {
                        String strM50242 = c22378.m50242(hostAddress);
                        if (!hostAddress.equals(strM50242)) {
                            m15530();
                            hostAddress = strM50242;
                        }
                    } catch (UnknownHostException unused) {
                        throw new C2623(C20094.m46315("Could not parse passive host information.\nServer Reply: ", str));
                    }
                }
            } else {
                Socket socket = this.f16949;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.f15031 = hostAddress;
            this.f15042 = i;
        } catch (NumberFormatException unused2) {
            throw new C2623(C20094.m46315("Could not parse passive port information.\nServer Reply: ", str));
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13864() {
        return C11250.m27829(m36350(EnumC13205.NOOP, (String) null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13856(String str) {
        return C11250.m27829(m36350(EnumC13205.RMD, str));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13879(String str, String str2) {
        int iM36350 = m36350(EnumC13205.RNFR, str);
        if (iM36350 < 300 || iM36350 >= 400) {
            return false;
        }
        return C11250.m27829(m36350(EnumC13205.RNTO, str2));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m13877() {
        return C11250.m27829(m36353());
    }

    @Override // l.InterfaceC1211
    /* JADX INFO: renamed from: ֫ */
    public final void mo4051(C3328 c3328) {
        this.f15036 = c3328;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10384[] m13876() throws IOException {
        String property;
        if (this.f15041 == null) {
            C3328 c3328 = this.f15036;
            C17754 c17754 = this.f15033;
            if (c3328 == null || c3328.m10184().isEmpty()) {
                String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property2 == null) {
                    if (this.f15028 == null) {
                        if (C11250.m27829(m36350(EnumC13205.SYST, (String) null))) {
                            this.f15028 = ((String) C18566.m43105(this.f46975, 1)).substring(4);
                        } else {
                            String property3 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property3 == null) {
                                throw new IOException("Unable to determine system type - response: " + m36351());
                            }
                            this.f15028 = property3;
                        }
                    }
                    property2 = this.f15028;
                    Properties properties = C20262.f65499;
                    if (properties != null && (property = properties.getProperty(property2)) != null) {
                        property2 = property;
                    }
                }
                if (this.f15036 != null) {
                    this.f15041 = c17754.m41581(new C3328(property2, this.f15036));
                } else {
                    this.f15041 = c17754.m41580(property2);
                }
            } else {
                this.f15041 = c17754.m41581(this.f15036);
                this.f15036.getClass();
            }
        }
        InterfaceC6150 interfaceC6150 = this.f15041;
        Socket socketM13866 = m13866(EnumC13205.LIST, (String) null);
        C23083 c23083 = new C23083(interfaceC6150, this.f15036);
        if (socketM13866 != null) {
            try {
                c23083.m51246(socketM13866.getInputStream(), this.f46981);
                C22194.m49850(socketM13866);
                m13877();
            } catch (Throwable th) {
                C22194.m49850(socketM13866);
                throw th;
            }
        }
        return c23083.m51247();
    }

    @Override // l.C15321, l.AbstractC5445
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public void mo13861() {
        super.mo13861();
        m13853();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13854() {
        this.f15038 = 2;
        this.f15031 = null;
        this.f15042 = -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m13884(String str) {
        return C11250.m27829(m36350(EnumC13205.SITE, str));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m13880() {
        if (!C11250.m27829(m36350(EnumC13205.TYPE, "AEILNTCFRPSBCZ".substring(2, 3)))) {
            return false;
        }
        this.f15029 = 2;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13868(String str, String str2) {
        m36350(EnumC13205.USER, str);
        if (C11250.m27829(this.f46983)) {
            return true;
        }
        int i = this.f46983;
        if (i < 300 || i >= 400) {
            return false;
        }
        return C11250.m27829(m36350(EnumC13205.PASS, str2));
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m13859() {
        return this.f15038;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2828 m13871() {
        return this.f15040;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m13870() {
        return this.f15031;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m13865() {
        return this.f15042;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long m13860() {
        return this.f15032;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13858(EnumC13205 enumC13205) {
        String strSubstring;
        String strSubstring2;
        String strName = enumC13205.name();
        if (this.f15039 == null) {
            int iM36350 = m36350(EnumC13205.FEAT, (String) null);
            if (iM36350 == 530) {
                return false;
            }
            boolean zM27829 = C11250.m27829(iM36350);
            this.f15039 = new HashMap();
            if (!zM27829) {
                return false;
            }
            for (String str : this.f46975) {
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    ((Set) C13843.computeIfAbsent(this.f15039, strSubstring.toUpperCase(Locale.ENGLISH), new C21673(0))).add(strSubstring2);
                }
            }
        }
        return this.f15039.containsKey(strName.toUpperCase(Locale.ENGLISH));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m13853() {
        this.f15038 = 0;
        this.f15031 = null;
        this.f15042 = -1;
        this.f15029 = 0;
        this.f15030 = 10;
        this.f15032 = 0L;
        this.f15028 = null;
        this.f15041 = null;
        this.f15039 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C10384[] m13873() {
        Socket socketM13866 = m13866(EnumC13205.MLSD, (String) null);
        C23083 c23083 = new C23083(C14225.m33883(), this.f15036);
        if (socketM13866 != null) {
            try {
                c23083.m51246(socketM13866.getInputStream(), this.f46981);
            } finally {
                C22194.m49850(socketM13866);
                m13877();
            }
        }
        return c23083.m51247();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m13869() {
        return this.f15037;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13867(long j) {
        this.f15032 = 0L;
        int iM36350 = m36350(EnumC13205.REST, Long.toString(j));
        return iM36350 >= 300 && iM36350 < 400;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C0820 m13875(String str) throws IOException {
        InputStream inputStream;
        Socket socketMo13874 = mo13874(EnumC13205.RETR.m32040(), str);
        if (socketMo13874 == null) {
            return null;
        }
        if (this.f15029 == 0) {
            inputStream = new C5054(new BufferedInputStream(socketMo13874.getInputStream()));
        } else {
            inputStream = socketMo13874.getInputStream();
        }
        return new C0820(socketMo13874, inputStream);
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m13883() {
        this.f15040 = C2828.ofMillis(60000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13855(long j) {
        if (j >= 0) {
            this.f15032 = j;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public OutputStream mo13872(String str) throws IOException {
        OutputStream outputStream;
        Socket socketMo13874 = mo13874(EnumC13205.STOR.m32040(), str);
        if (socketMo13874 == null) {
            return null;
        }
        if (this.f15029 == 0) {
            outputStream = new C14931(new BufferedOutputStream(socketMo13874.getOutputStream()));
        } else {
            outputStream = socketMo13874.getOutputStream();
        }
        return new C7876(socketMo13874, outputStream);
    }
}
