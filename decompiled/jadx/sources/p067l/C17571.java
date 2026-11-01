package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: l.ܺܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C17571 implements InterfaceC4832 {

    /* JADX INFO: renamed from: ֡ */
    public final /* synthetic */ AbstractC6843 f52510;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f52511 = new ArrayList();

    /* JADX INFO: renamed from: ۖ */
    public long f52512;

    /* JADX INFO: renamed from: ۘ */
    public int f52513;

    /* JADX INFO: renamed from: ۚ */
    public String f52514;

    /* JADX INFO: renamed from: ۜ */
    public final OutputStream f52515;

    /* JADX INFO: renamed from: ۡ */
    public String f52516;

    /* JADX INFO: renamed from: ۢ */
    public String f52517;

    /* JADX INFO: renamed from: ۧ */
    public String f52518;

    /* JADX INFO: renamed from: ܳ */
    public final C20255 f52519;

    /* JADX INFO: renamed from: ܺ */
    public String f52520;

    /* JADX INFO: renamed from: ܽ */
    public C16230 f52521;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f52522;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f52523;

    /* JADX INFO: renamed from: ᩴ */
    public int f52524;

    /* JADX INFO: renamed from: ᩵ */
    public final C11538 f52525;

    /* JADX INFO: renamed from: ᩷ */
    public HashMap f52526;

    /* JADX INFO: renamed from: ᩻ */
    public EnumC6173 f52527;

    public C17571(AbstractC6843 abstractC6843, C11538 c11538, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f52510 = abstractC6843;
        this.f52525 = c11538;
        this.f52519 = new C20255(inputStream, 8192);
        this.f52515 = outputStream;
        this.f52520 = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f52522 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39976(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws C16900 {
        String strM15657;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split(" ", -1);
            if (strArrSplit.length != 3 || strArrSplit[0].isEmpty() || strArrSplit[1].isEmpty() || strArrSplit[2].isEmpty()) {
                throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put(AbstractC0213e.f995s, strArrSplit[0]);
            String str = strArrSplit[1];
            int iIndexOf = str.indexOf(63);
            if (iIndexOf >= 0) {
                m39977(str.substring(iIndexOf + 1), map2);
                try {
                    strM15657 = AbstractC6843.m15657(str.substring(0, iIndexOf), false);
                } catch (IllegalArgumentException e) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                }
            } else {
                try {
                    strM15657 = AbstractC6843.m15657(str, false);
                } catch (IllegalArgumentException e2) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            }
            String str2 = strArrSplit[2];
            this.f52517 = str2;
            if (!"HTTP/1.0".equals(str2) && !"HTTP/1.1".equals(this.f52517)) {
                throw new C16900(EnumC3490.UNSUPPORTED_HTTP_VERSION, "HTTP VERSION NOT SUPPORTED: " + this.f52517);
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 <= 0) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String strSubstring = line2.substring(0, iIndexOf2);
                if (!AbstractC6843.f17776.matcher(strSubstring).matches()) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String lowerCase = strSubstring.toLowerCase(Locale.US);
                if ("authorization".equals(lowerCase)) {
                    this.f52511.add(line2.substring(iIndexOf2 + 1));
                }
                String strTrim = line2.substring(iIndexOf2 + 1).trim();
                if ("content-length".equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Multiple Content-Length headers.");
                }
                if (C0172c.f710f.equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Multiple Host headers.");
                }
                map3.put(lowerCase, strTrim);
                line2 = bufferedReader.readLine();
            }
            if ("HTTP/1.1".equals(this.f52517) && !map3.containsKey(C0172c.f710f)) {
                throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Missing Host header.");
            }
            map.put("uri", strM15657);
        } catch (IOException e3) {
            throw new C16900(EnumC3490.INTERNAL_ERROR, C7241.m16586(e3, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")), e3);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39982(HashMap map) throws C16900 {
        String str = (String) map.get("transfer-encoding");
        if (str != null && !str.trim().isEmpty()) {
            throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Transfer-Encoding is not supported.");
        }
        String str2 = (String) map.get("content-length");
        if (str2 == null) {
            return;
        }
        if (str2.isEmpty()) {
            throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
            }
        }
        try {
            Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.", e);
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    private void m39985() throws C16900, IOException {
        String str = (String) this.f52522.get("expect");
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split(",");
        int length = strArrSplit.length;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                z = z2;
                break;
            }
            String strTrim = strArrSplit[i].trim();
            if (!strTrim.isEmpty()) {
                if (!"100-continue".equalsIgnoreCase(strTrim)) {
                    break;
                } else {
                    z2 = true;
                }
            }
            i++;
        }
        if (!z) {
            throw new C16900(EnumC3490.EXPECTATION_FAILED, "EXPECTATION FAILED: Unsupported Expect header.");
        }
        if (!"HTTP/1.1".equals(this.f52517)) {
            throw new C16900(EnumC3490.EXPECTATION_FAILED, "EXPECTATION FAILED: Expect header requires HTTP/1.1.");
        }
        if (this.f52512 > 0) {
            byte[] bytes = C10965.m25286(new StringBuilder(), this.f52517, " 100 Continue\r\n\r\n").getBytes(Charset.forName("US-ASCII"));
            OutputStream outputStream = this.f52515;
            outputStream.write(bytes);
            outputStream.flush();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39978(C19584 c19584, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        byte b;
        try {
            int[] iArrM39979 = m39979(byteBuffer, c19584.m44490().getBytes(Charset.forName("US-ASCII")));
            try {
                if (iArrM39979.length < 2) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i = 1024;
                byte[] bArr = new byte[1024];
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (i3 >= iArrM39979.length - 1) {
                        return;
                    }
                    byteBuffer.position(iArrM39979[i3]);
                    int iRemaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i2, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, iRemaining), Charset.forName(c19584.m44495())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(c19584.m44490())) {
                        throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String strGroup = null;
                    String strTrim = null;
                    String strGroup2 = null;
                    int i6 = 2;
                    for (String line2 = bufferedReader.readLine(); line2 != null && line2.trim().length() > 0; line2 = bufferedReader.readLine()) {
                        Matcher matcher = AbstractC6843.f17777.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = AbstractC6843.f17775.matcher(matcher.group(2));
                            i4 = i4;
                            while (matcher2.find()) {
                                String strGroup3 = matcher2.group(i5);
                                String str = strGroup2;
                                if ("name".equalsIgnoreCase(strGroup3)) {
                                    strGroup = matcher2.group(2);
                                } else {
                                    if ("filename".equalsIgnoreCase(strGroup3)) {
                                        strGroup2 = matcher2.group(2);
                                        if (!strGroup2.isEmpty()) {
                                            if (i4 > 0) {
                                                strGroup = strGroup + String.valueOf(i4);
                                                i4++;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                    i5 = 1;
                                }
                                strGroup2 = str;
                                i5 = 1;
                            }
                        }
                        Matcher matcher3 = AbstractC6843.f17773.matcher(line2);
                        if (matcher3.matches()) {
                            strTrim = matcher3.group(2).trim();
                        }
                        i6++;
                        i5 = 1;
                    }
                    int i7 = i4;
                    int i8 = 0;
                    while (true) {
                        int i9 = i6 - 1;
                        if (i6 <= 0) {
                            break;
                        }
                        do {
                            b = bArr[i8];
                            i8++;
                        } while (b != 10);
                        i6 = i9;
                    }
                    if (i8 >= iRemaining - 4) {
                        throw new C16900(EnumC3490.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = iArrM39979[i3] + i8;
                    i3++;
                    int i11 = iArrM39979[i3] - 4;
                    byteBuffer.position(i10);
                    List arrayList = (List) map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strGroup, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, c19584.m44495()));
                    } else {
                        String strM39975 = m39975(byteBuffer, i10, i11 - i10, strGroup2);
                        if (map2.containsKey(strGroup)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(strGroup + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(strGroup + i12, strM39975);
                        } else {
                            map2.put(strGroup, strM39975);
                        }
                        arrayList.add(strGroup2);
                    }
                    i = 1024;
                    i4 = i7;
                    i2 = 0;
                }
            } catch (C16900 e) {
            } catch (Exception e2) {
                e = e2;
                throw new C16900(EnumC3490.INTERNAL_ERROR, e.toString());
            }
        } catch (C16900 e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39977(String str, Map map) throws C16900 {
        String strTrim;
        String strM15664;
        if (str == null) {
            this.f52516 = "";
            return;
        }
        this.f52516 = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, C0233a.f1084p);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                try {
                    strTrim = AbstractC6843.m15664(strNextToken.substring(0, iIndexOf)).trim();
                    try {
                        strM15664 = AbstractC6843.m15664(strNextToken.substring(iIndexOf + 1));
                    } catch (IllegalArgumentException e) {
                        throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            } else {
                try {
                    strTrim = AbstractC6843.m15664(strNextToken).trim();
                    strM15664 = "";
                } catch (IllegalArgumentException e3) {
                    throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e3);
                }
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strM15664);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39986() {
        AbstractC6843 abstractC6843 = this.f52510;
        C11538 c11538 = this.f52525;
        C20255 c20255 = this.f52519;
        OutputStream outputStream = this.f52515;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f52524 = 0;
                        this.f52513 = 0;
                        this.f52517 = "HTTP/1.1";
                        m39980();
                        c20255.mark(8192);
                        try {
                            int i = c20255.read(bArr, 0, 8192);
                            if (i == -1) {
                                AbstractC6843.m15666(c20255);
                                AbstractC6843.m15666(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.f52513 + i;
                                this.f52513 = i2;
                                int iM39974 = m39974(i2, bArr);
                                this.f52524 = iM39974;
                                if (iM39974 > 0) {
                                    break;
                                }
                                int i3 = this.f52513;
                                i = c20255.read(bArr, i3, 8192 - i3);
                            }
                            int i4 = this.f52524;
                            if (i4 == 0) {
                                throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Header section too large.");
                            }
                            if (i4 < this.f52513) {
                                c20255.reset();
                                c20255.skip(this.f52524);
                            }
                            this.f52526 = new HashMap();
                            HashMap map = this.f52522;
                            if (map == null) {
                                this.f52522 = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f52513)));
                            HashMap map2 = new HashMap();
                            this.f52516 = null;
                            this.f52511.clear();
                            m39976(bufferedReader, map2, this.f52526, this.f52522);
                            m39982(this.f52522);
                            this.f52512 = m39981();
                            EnumC6173 enumC6173M13976 = EnumC6173.m13976((String) map2.get(AbstractC0213e.f995s));
                            this.f52527 = enumC6173M13976;
                            if (enumC6173M13976 == null) {
                                throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get(AbstractC0213e.f995s)) + " unhandled.");
                            }
                            this.f52514 = (String) map2.get("uri");
                            m39985();
                            c20255.m45753();
                            String str = this.f52520;
                            if (str != null) {
                                this.f52522.put("remote-addr", str);
                                this.f52522.put("http-client-ip", str);
                            }
                            this.f52521 = new C16230(this.f52522);
                            String str2 = (String) this.f52522.get("connection");
                            boolean zEquals = "HTTP/1.1".equals(this.f52517);
                            boolean z2 = zEquals && (str2 == null || !str2.matches("(?i).*close.*"));
                            C10196 c10196Mo15672 = abstractC6843.mo15672(this);
                            if (c10196Mo15672 == null) {
                                throw new C16900(EnumC3490.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            if (m39973()) {
                                c10196Mo15672.m23772();
                            }
                            String str3 = (String) this.f52522.get("accept-encoding");
                            this.f52521.m36986(c10196Mo15672);
                            c10196Mo15672.m23777(m39984());
                            c10196Mo15672.m23775(this.f52527);
                            c10196Mo15672.m23776(zEquals);
                            if (zEquals && abstractC6843.mo15673(c10196Mo15672) && m39983(str3)) {
                                z = true;
                            }
                            c10196Mo15672.m23778(z);
                            c10196Mo15672.m23780(z2);
                            c10196Mo15672.m23773(outputStream);
                            if (!z2 || c10196Mo15672.m23781()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            m39980();
                            AbstractC6843.m15666(c10196Mo15672);
                            c11538.m26596();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            AbstractC6843.m15666(c20255);
                            AbstractC6843.m15666(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (C16900 e2) {
                        C10196 c10196M15660 = AbstractC6843.m15660(e2.m38461(), "text/plain", e2.getMessage());
                        c10196M15660.m23777(m39984());
                        c10196M15660.m23772();
                        c10196M15660.m23773(outputStream);
                        AbstractC6843.m15666(outputStream);
                        m39980();
                        AbstractC6843.m15666((Object) null);
                        c11538.m26596();
                    }
                } catch (SocketTimeoutException e3) {
                    throw e3;
                } catch (SSLException e4) {
                    C10196 c10196M15661 = AbstractC6843.m15660(EnumC3490.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e4.getMessage());
                    c10196M15661.m23777(m39984());
                    c10196M15661.m23773(outputStream);
                    AbstractC6843.m15666(outputStream);
                    m39980();
                    AbstractC6843.m15666((Object) null);
                    c11538.m26596();
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (IOException e6) {
                C10196 c10196M15662 = AbstractC6843.m15660(EnumC3490.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage());
                c10196M15662.m23777(m39984());
                c10196M15662.m23773(outputStream);
                AbstractC6843.m15666(outputStream);
                m39980();
                AbstractC6843.m15666((Object) null);
                c11538.m26596();
            }
        } catch (Throwable th) {
            m39980();
            AbstractC6843.m15666((Object) null);
            c11538.m26596();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    private String m39984() {
        return "HTTP/1.0".equals(this.f52517) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39974(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m39979(ByteBuffer byteBuffer, byte[] bArr) {
        int length;
        int length2;
        if (bArr.length == 0 || byteBuffer.limit() < bArr.length + 2) {
            return new int[0];
        }
        ArrayList arrayList = new ArrayList();
        int iLimit = byteBuffer.limit();
        int i = 0;
        while (i <= iLimit - bArr.length) {
            boolean z = i == 2 && byteBuffer.get(0) == 45 && byteBuffer.get(1) == 45;
            boolean z2 = i >= 4 && byteBuffer.get(i + (-4)) == 13 && byteBuffer.get(i + (-3)) == 10 && byteBuffer.get(i + (-2)) == 45 && byteBuffer.get(i + (-1)) == 45;
            if ((z || z2) && (length2 = (length = bArr.length + i) + 1) < iLimit && ((byteBuffer.get(length) == 13 && byteBuffer.get(length2) == 10) || (byteBuffer.get(length) == 45 && byteBuffer.get(length2) == 45))) {
                int i2 = 0;
                while (true) {
                    if (i2 < bArr.length) {
                        if (byteBuffer.get(i + i2) != bArr[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        arrayList.add(Integer.valueOf(i));
                        break;
                    }
                }
            }
            i++;
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Map m39997() {
        return this.f52522;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m39992() {
        return C21562.unmodifiableList(this.f52511);
    }

    /* JADX INFO: renamed from: ܿ */
    public final InputStream m39996() {
        return this.f52519;
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m39994() {
        return this.f52523;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m39995() {
        return this.f52518;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39987(String str) {
        this.f52518 = str;
        this.f52523 = true;
    }

    /* JADX INFO: renamed from: ۖ */
    private void m39980() {
        this.f52518 = null;
        this.f52523 = false;
    }

    /* JADX INFO: renamed from: ܳ */
    public final EnumC6173 m39993() {
        return this.f52527;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ */
    public final HashMap m39989() {
        HashMap map = new HashMap();
        for (String str : this.f52526.keySet()) {
            map.put(str, (String) ((List) this.f52526.get(str)).get(0));
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Map m39999() {
        return this.f52526;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m39998() {
        return this.f52516;
    }

    /* JADX INFO: renamed from: ۡ */
    public final String m39990() {
        return this.f52514;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39988(HashMap map) {
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            long j = this.f52522.containsKey("content-length") ? Long.parseLong((String) this.f52522.get("content-length")) : 0L;
            if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f52525.m26597().m50089(), "rw");
                    byteArrayOutputStream = null;
                    dataOutputStream = randomAccessFile;
                } catch (Exception e) {
                    throw new Error(e);
                }
            } else {
                byteArrayOutputStream = new ByteArrayOutputStream();
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                randomAccessFile = null;
            }
            try {
                byte[] bArr = new byte[512];
                while (j > 0) {
                    int i = this.f52519.read(bArr, 0, (int) Math.min(j, 512L));
                    this.f52513 = i;
                    if (i <= 0) {
                        throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Request body ended before Content-Length.");
                    }
                    j -= (long) i;
                    dataOutputStream.write(bArr, 0, i);
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = C13853.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (EnumC6173.POST.equals(this.f52527)) {
                    C19584 c19584 = new C19584((String) this.f52522.get(AbstractC0213e.f982f));
                    if (c19584.m44494()) {
                        String strM44490 = c19584.m44490();
                        if (strM44490 == null || strM44490.isEmpty()) {
                            throw new C16900(EnumC3490.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        m39978(c19584, map2, this.f52526, map);
                    } else {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2, c19584.m44495()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(c19584.m44491())) {
                            m39977(strTrim, this.f52526);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    }
                } else if (EnumC6173.PUT.equals(this.f52527)) {
                    map.put("content", m39975(map2, 0, map2.limit(), (String) null));
                }
                AbstractC6843.m15666(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                AbstractC6843.m15666(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            AbstractC6843.m15666(randomAccessFile2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private long m39981() {
        String str = (String) this.f52522.get("content-length");
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: ֡ */
    private boolean m39973() {
        return this.f52512 != this.f52519.m45752();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m39983(String str) {
        double d;
        if (str == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : str.split(",")) {
            String[] strArrSplit = str2.split(C0249l.f1196b);
            if (strArrSplit.length != 0) {
                String lowerCase = strArrSplit[0].trim().toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    continue;
                } else {
                    int i = 1;
                    while (true) {
                        if (i >= strArrSplit.length) {
                            d = 1.0d;
                            break;
                        }
                        String strTrim = strArrSplit[i].trim();
                        int iIndexOf = strTrim.indexOf(61);
                        if (iIndexOf >= 0 && "q".equalsIgnoreCase(strTrim.substring(0, iIndexOf).trim())) {
                            try {
                                d = Double.parseDouble(strTrim.substring(iIndexOf + 1).trim());
                                break;
                            } catch (NumberFormatException unused) {
                                d = 0.0d;
                                break;
                            }
                        }
                        i++;
                    }
                    if ("gzip".equals(lowerCase)) {
                        return d > 0.0d;
                    }
                    if ("*".equals(lowerCase)) {
                        z = d > 0.0d;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    private String m39975(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (i2 <= 0) {
            return "";
        }
        try {
            try {
                C22267 c22267M26597 = this.f52525.m26597();
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(c22267M26597.m50089());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C13853.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                    byteBufferDuplicate.position(i).limit(i + i2);
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBufferDuplicate.slice());
                    String strM50089 = c22267M26597.m50089();
                    AbstractC6843.m15666(fileOutputStream);
                    return strM50089;
                } catch (Exception e) {
                    e = e;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    AbstractC6843.m15666(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m39991() {
        return this.f52520;
    }
}
