package p067l;

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
public class C6872 extends C16929 implements InterfaceC3519 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final /* synthetic */ int f17857 = 0;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final Pattern f17858 = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* JADX INFO: renamed from: ֫֫ */
    public String f17859;

    /* JADX INFO: renamed from: ۗ */
    public int f17860;

    /* JADX INFO: renamed from: ۙ */
    public int f17861;

    /* JADX INFO: renamed from: ۛ */
    public String f17862;

    /* JADX INFO: renamed from: ۟ */
    public long f17863;

    /* JADX INFO: renamed from: ۤ */
    public C19241 f17864;

    /* JADX INFO: renamed from: ۨ */
    public C23636 f17865;

    /* JADX INFO: renamed from: ۫ */
    public boolean f17866;

    /* JADX INFO: renamed from: ۬ */
    public C5531 f17867;

    /* JADX INFO: renamed from: ܰ */
    public boolean f17868;

    /* JADX INFO: renamed from: ܶ */
    public int f17869;

    /* JADX INFO: renamed from: ᩶ */
    public HashMap f17870;

    /* JADX INFO: renamed from: ᩸ */
    public C5057 f17871 = C5057.ofMillis(-1);

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC8213 f17872;

    /* JADX INFO: renamed from: ᩺ */
    public int f17873;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m15758(String str) {
        return C13061.m29891(m38508(EnumC14918.DELE, str));
    }

    public C6872() {
        new Random();
        this.f17868 = true;
        this.f17864 = new C19241();
        C5057 c5057 = C5057.ZERO;
        C5057.ofSeconds(1L);
        this.f17865 = new C23636(this);
        this.f17866 = Boolean.getBoolean("org.apache.commons.net.ftp.ipAddressFromPasvResponse");
        m15733();
    }

    @Override // p067l.AbstractC7543
    /* JADX INFO: renamed from: ᩵ */
    public void mo15761() throws IOException {
        super.m38510();
        m15733();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Socket m15746(EnumC14918 enumC14918, String str) {
        return mo15754(enumC14918.m34138(), str);
    }

    /* JADX INFO: renamed from: ܿ */
    public Socket mo15754(String str, String str2) throws IOException {
        Socket socketAccept;
        int i = this.f17869;
        if (i == 0 || i == 2) {
            boolean z = m17452() instanceof Inet6Address;
            long millis = this.f17871.toMillis();
            int iMin = (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
            if (this.f17869 != 0) {
                ArrayList arrayList = this.f50101;
                if (z && m38508(EnumC14918.EPSV, (String) null) == 229) {
                    m15743((String) arrayList.get(0));
                } else if (!z && m38508(EnumC14918.PASV, (String) null) == 227) {
                    m15742((String) arrayList.get(0));
                }
                Socket socketCreateSocket = this.f19792.createSocket();
                if (this.f17861 == 13) {
                    socketCreateSocket = new C10225(socketCreateSocket);
                }
                if (iMin >= 0) {
                    socketCreateSocket.setSoTimeout(iMin);
                }
                socketCreateSocket.connect(new InetSocketAddress(this.f17862, this.f17873), this.f19788);
                long j = this.f17863;
                if (j > 0 && !m15747(j)) {
                    socketCreateSocket.close();
                    return null;
                }
                if (!C13061.m29895(mo28272(str, str2))) {
                    socketCreateSocket.close();
                    return null;
                }
                socketAccept = socketCreateSocket;
                if (this.f17868) {
                }
                return socketAccept;
            }
            ServerSocket serverSocketCreateServerSocket = this.f19793.createServerSocket(0, 1, m17449());
            try {
                if (z) {
                    if (!C13061.m29891(m38507(m17449(), serverSocketCreateServerSocket.getLocalPort()))) {
                        serverSocketCreateServerSocket.close();
                        return null;
                    }
                } else if (!C13061.m29891(m38514(m17449(), serverSocketCreateServerSocket.getLocalPort()))) {
                    serverSocketCreateServerSocket.close();
                    return null;
                }
                long j2 = this.f17863;
                if (j2 <= 0 || m15747(j2)) {
                    if (C13061.m29895(mo28272(str, str2))) {
                        if (iMin >= 0) {
                            serverSocketCreateServerSocket.setSoTimeout(iMin);
                        }
                        socketAccept = serverSocketCreateServerSocket.accept();
                        if (this.f17861 == 13) {
                            socketAccept = new C10225(socketAccept);
                        }
                        if (iMin >= 0) {
                            socketAccept.setSoTimeout(iMin);
                        }
                        serverSocketCreateServerSocket.close();
                        if (this.f17868 || m17445(socketAccept)) {
                            return socketAccept;
                        }
                        InetAddress inetAddress = socketAccept.getInetAddress();
                        String hostAddress = inetAddress != null ? inetAddress.getHostAddress() : null;
                        InetAddress inetAddress2 = this.f19790.getInetAddress();
                        String hostAddress2 = inetAddress2 != null ? inetAddress2.getHostAddress() : null;
                        C23461.m52177(socketAccept);
                        throw new IOException(C20865.m47154("Host attempting data connection ", hostAddress, " is not same as server ", hostAddress2));
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

    /* JADX INFO: renamed from: ۢ */
    public final void m15743(String str) throws C4861 {
        String strTrim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char cCharAt = strTrim.charAt(0);
        char cCharAt2 = strTrim.charAt(1);
        char cCharAt3 = strTrim.charAt(2);
        char cM21911 = C9417.m21911(1, strTrim);
        if (cCharAt != cCharAt2 || cCharAt2 != cCharAt3 || cCharAt3 != cM21911) {
            throw new C4861("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
        try {
            int i = Integer.parseInt(strTrim.substring(3, strTrim.length() - 1));
            this.f17862 = m17452().getHostAddress();
            this.f17873 = i;
        } catch (NumberFormatException unused) {
            throw new C4861("Could not parse extended passive host information.\nServer Reply: ".concat(strTrim));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15737(String str, String str2) {
        return C13061.m29891(m38508(EnumC14918.MFMT, str2 + ' ' + str));
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m15762(String str) {
        return C13061.m29891(m38508(EnumC14918.MKD, str));
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m15742(String str) throws C4861 {
        Matcher matcher = f17858.matcher(str);
        if (!matcher.find()) {
            throw new C4861(C21466.m48631("Could not parse passive host information.\nServer Reply: ", str));
        }
        String hostAddress = "0,0,0,0".equals(matcher.group(1)) ? this.f19790.getInetAddress().getHostAddress() : matcher.group(1).replace(',', '.');
        try {
            int i = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
            if (this.f17866) {
                C23636 c23636 = this.f17865;
                if (c23636 != null) {
                    try {
                        String strM52582 = c23636.m52582(hostAddress);
                        if (!hostAddress.equals(strM52582)) {
                            m17441();
                            hostAddress = strM52582;
                        }
                    } catch (UnknownHostException unused) {
                        throw new C4861(C21466.m48631("Could not parse passive host information.\nServer Reply: ", str));
                    }
                }
            } else {
                Socket socket = this.f19790;
                hostAddress = socket == null ? null : socket.getInetAddress().getHostAddress();
            }
            this.f17862 = hostAddress;
            this.f17873 = i;
        } catch (NumberFormatException unused2) {
            throw new C4861(C21466.m48631("Could not parse passive port information.\nServer Reply: ", str));
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m15744() {
        return C13061.m29891(m38508(EnumC14918.NOOP, (String) null));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15736(String str) {
        return C13061.m29891(m38508(EnumC14918.RMD, str));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m15759(String str, String str2) {
        int iM38508 = m38508(EnumC14918.RNFR, str);
        if (iM38508 < 300 || iM38508 >= 400) {
            return false;
        }
        return C13061.m29891(m38508(EnumC14918.RNTO, str2));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m15757() {
        return C13061.m29891(m38511());
    }

    @Override // p067l.InterfaceC3519
    /* JADX INFO: renamed from: ֫ */
    public final void mo6295(C5531 c5531) {
        this.f17867 = c5531;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C12237[] m15756() throws IOException {
        String property;
        if (this.f17872 == null) {
            C5531 c5531 = this.f17867;
            C19241 c19241 = this.f17864;
            if (c5531 == null || c5531.m12220().isEmpty()) {
                String property2 = System.getProperty("org.apache.commons.net.ftp.systemType");
                if (property2 == null) {
                    if (this.f17859 == null) {
                        if (C13061.m29891(m38508(EnumC14918.SYST, (String) null))) {
                            this.f17859 = ((String) C20013.m45383(this.f50101, 1)).substring(4);
                        } else {
                            String property3 = System.getProperty("org.apache.commons.net.ftp.systemType.default");
                            if (property3 == null) {
                                throw new IOException("Unable to determine system type - response: " + m38509());
                            }
                            this.f17859 = property3;
                        }
                    }
                    property2 = this.f17859;
                    Properties properties = C21625.f68174;
                    if (properties != null && (property = properties.getProperty(property2)) != null) {
                        property2 = property;
                    }
                }
                if (this.f17867 != null) {
                    this.f17872 = c19241.m43826(new C5531(property2, this.f17867));
                } else {
                    this.f17872 = c19241.m43825(property2);
                }
            } else {
                this.f17872 = c19241.m43826(this.f17867);
                this.f17867.getClass();
            }
        }
        InterfaceC8213 interfaceC8213 = this.f17872;
        Socket socketM15746 = m15746(EnumC14918.LIST, (String) null);
        C24306 c24306 = new C24306(interfaceC8213, this.f17867);
        if (socketM15746 != null) {
            try {
                c24306.m53640(socketM15746.getInputStream(), this.f50107);
                C23461.m52177(socketM15746);
                m15757();
            } catch (Throwable th) {
                C23461.m52177(socketM15746);
                throw th;
            }
        }
        return c24306.m53641();
    }

    @Override // p067l.C16929, p067l.AbstractC7543
    /* JADX INFO: renamed from: ۡ */
    public void mo15741() {
        super.mo15741();
        m15733();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15734() {
        this.f17869 = 2;
        this.f17862 = null;
        this.f17873 = -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m15764(String str) {
        return C13061.m29891(m38508(EnumC14918.SITE, str));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m15760() {
        if (!C13061.m29891(m38508(EnumC14918.TYPE, "AEILNTCFRPSBCZ".substring(2, 3)))) {
            return false;
        }
        this.f17860 = 2;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m15748(String str, String str2) {
        m38508(EnumC14918.USER, str);
        if (C13061.m29891(this.f50109)) {
            return true;
        }
        int i = this.f50109;
        if (i < 300 || i >= 400) {
            return false;
        }
        return C13061.m29891(m38508(EnumC14918.PASS, str2));
    }

    /* JADX INFO: renamed from: ۗ */
    public final int m15739() {
        return this.f17869;
    }

    /* JADX INFO: renamed from: ۬ */
    public final C5057 m15751() {
        return this.f17871;
    }

    /* JADX INFO: renamed from: ۫ */
    public final String m15750() {
        return this.f17862;
    }

    /* JADX INFO: renamed from: ۤ */
    public final int m15745() {
        return this.f17873;
    }

    /* JADX INFO: renamed from: ۛ */
    public final long m15740() {
        return this.f17863;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m15738(EnumC14918 enumC14918) {
        String strSubstring;
        String strSubstring2;
        String strName = enumC14918.name();
        if (this.f17870 == null) {
            int iM38508 = m38508(EnumC14918.FEAT, (String) null);
            if (iM38508 == 530) {
                return false;
            }
            boolean zM29891 = C13061.m29891(iM38508);
            this.f17870 = new HashMap();
            if (!zM29891) {
                return false;
            }
            for (String str : this.f50101) {
                if (str.startsWith(" ")) {
                    int iIndexOf = str.indexOf(32, 1);
                    if (iIndexOf > 0) {
                        strSubstring = str.substring(1, iIndexOf);
                        strSubstring2 = str.substring(iIndexOf + 1);
                    } else {
                        strSubstring = str.substring(1);
                        strSubstring2 = "";
                    }
                    ((Set) C15525.computeIfAbsent(this.f17870, strSubstring.toUpperCase(Locale.ENGLISH), new C22966(0))).add(strSubstring2);
                }
            }
        }
        return this.f17870.containsKey(strName.toUpperCase(Locale.ENGLISH));
    }

    /* JADX INFO: renamed from: ܰ */
    private void m15733() {
        this.f17869 = 0;
        this.f17862 = null;
        this.f17873 = -1;
        this.f17860 = 0;
        this.f17861 = 10;
        this.f17863 = 0L;
        this.f17859 = null;
        this.f17872 = null;
        this.f17870 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12237[] m15753() {
        Socket socketM15746 = m15746(EnumC14918.MLSD, (String) null);
        C24306 c24306 = new C24306(C15887.m36015(), this.f17867);
        if (socketM15746 != null) {
            try {
                c24306.m53640(socketM15746.getInputStream(), this.f50107);
            } finally {
                C23461.m52177(socketM15746);
                m15757();
            }
        }
        return c24306.m53641();
    }

    /* JADX INFO: renamed from: ۨ */
    public final boolean m15749() {
        return this.f17868;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m15747(long j) {
        this.f17863 = 0L;
        int iM38508 = m38508(EnumC14918.REST, Long.toString(j));
        return iM38508 >= 300 && iM38508 < 400;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C3147 m15755(String str) throws IOException {
        InputStream inputStream;
        Socket socketMo15754 = mo15754(EnumC14918.RETR.m34138(), str);
        if (socketMo15754 == null) {
            return null;
        }
        if (this.f17860 == 0) {
            inputStream = new C7171(new BufferedInputStream(socketMo15754.getInputStream()));
        } else {
            inputStream = socketMo15754.getInputStream();
        }
        return new C3147(socketMo15754, inputStream);
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩺ */
    public final void m15763() {
        this.f17871 = C5057.ofMillis(60000);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15735(long j) {
        if (j >= 0) {
            this.f17863 = j;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public OutputStream mo15752(String str) throws IOException {
        OutputStream outputStream;
        Socket socketMo15754 = mo15754(EnumC14918.STOR.m34138(), str);
        if (socketMo15754 == null) {
            return null;
        }
        if (this.f17860 == 0) {
            outputStream = new C16558(new BufferedOutputStream(socketMo15754.getOutputStream()));
        } else {
            outputStream = socketMo15754.getOutputStream();
        }
        return new C9853(socketMo15754, outputStream);
    }
}
