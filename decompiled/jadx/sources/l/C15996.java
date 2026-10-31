package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
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
public final class C15996 implements InterfaceC2592 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4708 f49347;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f49348 = new ArrayList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f49349;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f49350;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f49351;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final OutputStream f49352;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f49353;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f49354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f49355;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18820 f49356;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f49357;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14585 f49358;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f49359;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f49360;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f49361;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9648 f49362;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public HashMap f49363;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC4003 f49364;

    public C15996(AbstractC4708 abstractC4708, C9648 c9648, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.f49347 = abstractC4708;
        this.f49362 = c9648;
        this.f49356 = new C18820(inputStream, 8192);
        this.f49352 = outputStream;
        this.f49357 = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.f49359 = new HashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37790(BufferedReader bufferedReader, HashMap map, HashMap map2, HashMap map3) throws C15290 {
        String strM13781;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            String[] strArrSplit = line.split(" ", -1);
            if (strArrSplit.length != 3 || strArrSplit[0].isEmpty() || strArrSplit[1].isEmpty() || strArrSplit[2].isEmpty()) {
                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            map.put(e.s, strArrSplit[0]);
            String str = strArrSplit[1];
            int iIndexOf = str.indexOf(63);
            if (iIndexOf >= 0) {
                m37791(str.substring(iIndexOf + 1), map2);
                try {
                    strM13781 = AbstractC4708.m13781(str.substring(0, iIndexOf), false);
                } catch (IllegalArgumentException e) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                }
            } else {
                try {
                    strM13781 = AbstractC4708.m13781(str, false);
                } catch (IllegalArgumentException e2) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            }
            String str2 = strArrSplit[2];
            this.f49354 = str2;
            if (!"HTTP/1.0".equals(str2) && !"HTTP/1.1".equals(this.f49354)) {
                throw new C15290(EnumC1180.UNSUPPORTED_HTTP_VERSION, "HTTP VERSION NOT SUPPORTED: " + this.f49354);
            }
            String line2 = bufferedReader.readLine();
            while (line2 != null && !line2.trim().isEmpty()) {
                int iIndexOf2 = line2.indexOf(58);
                if (iIndexOf2 <= 0) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String strSubstring = line2.substring(0, iIndexOf2);
                if (!AbstractC4708.f14946.matcher(strSubstring).matches()) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid header name.");
                }
                String lowerCase = strSubstring.toLowerCase(Locale.US);
                if ("authorization".equals(lowerCase)) {
                    this.f49348.add(line2.substring(iIndexOf2 + 1));
                }
                String strTrim = line2.substring(iIndexOf2 + 1).trim();
                if ("content-length".equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Multiple Content-Length headers.");
                }
                if (c.f.equals(lowerCase) && map3.containsKey(lowerCase)) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Multiple Host headers.");
                }
                map3.put(lowerCase, strTrim);
                line2 = bufferedReader.readLine();
            }
            if ("HTTP/1.1".equals(this.f49354) && !map3.containsKey(c.f)) {
                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Missing Host header.");
            }
            map.put("uri", strM13781);
        } catch (IOException e3) {
            throw new C15290(EnumC1180.INTERNAL_ERROR, C5127.m14678(e3, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")), e3);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37796(HashMap map) throws C15290 {
        String str = (String) map.get("transfer-encoding");
        if (str != null && !str.trim().isEmpty()) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Transfer-Encoding is not supported.");
        }
        String str2 = (String) map.get("content-length");
        if (str2 == null) {
            return;
        }
        if (str2.isEmpty()) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
        }
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.");
            }
        }
        try {
            Long.parseLong(str2);
        } catch (NumberFormatException e) {
            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Invalid Content-Length.", e);
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m37799() throws C15290, IOException {
        String str = (String) this.f49359.get("expect");
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
            throw new C15290(EnumC1180.EXPECTATION_FAILED, "EXPECTATION FAILED: Unsupported Expect header.");
        }
        if (!"HTTP/1.1".equals(this.f49354)) {
            throw new C15290(EnumC1180.EXPECTATION_FAILED, "EXPECTATION FAILED: Expect header requires HTTP/1.1.");
        }
        if (this.f49349 > 0) {
            byte[] bytes = C9045.m23341(new StringBuilder(), this.f49354, " 100 Continue\r\n\r\n").getBytes(Charset.forName("US-ASCII"));
            OutputStream outputStream = this.f49352;
            outputStream.write(bytes);
            outputStream.flush();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37792(C18114 c18114, ByteBuffer byteBuffer, HashMap map, HashMap map2) throws Throwable {
        byte b;
        try {
            int[] iArrM37793 = m37793(byteBuffer, c18114.m42231().getBytes(Charset.forName("US-ASCII")));
            try {
                if (iArrM37793.length < 2) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i = 1024;
                byte[] bArr = new byte[1024];
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = 1;
                    if (i3 >= iArrM37793.length - 1) {
                        return;
                    }
                    byteBuffer.position(iArrM37793[i3]);
                    int iRemaining = byteBuffer.remaining() < i ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i2, iRemaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i2, iRemaining), Charset.forName(c18114.m42236())), iRemaining);
                    String line = bufferedReader.readLine();
                    if (line == null || !line.contains(c18114.m42231())) {
                        throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                    }
                    String strGroup = null;
                    String strTrim = null;
                    String strGroup2 = null;
                    int i6 = 2;
                    for (String line2 = bufferedReader.readLine(); line2 != null && line2.trim().length() > 0; line2 = bufferedReader.readLine()) {
                        Matcher matcher = AbstractC4708.f14947.matcher(line2);
                        if (matcher.matches()) {
                            Matcher matcher2 = AbstractC4708.f14945.matcher(matcher.group(2));
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
                        Matcher matcher3 = AbstractC4708.f14943.matcher(line2);
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
                        throw new C15290(EnumC1180.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = iArrM37793[i3] + i8;
                    i3++;
                    int i11 = iArrM37793[i3] - 4;
                    byteBuffer.position(i10);
                    List arrayList = (List) map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strGroup, arrayList);
                    }
                    if (strTrim == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        arrayList.add(new String(bArr2, c18114.m42236()));
                    } else {
                        String strM37789 = m37789(byteBuffer, i10, i11 - i10, strGroup2);
                        if (map2.containsKey(strGroup)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(strGroup + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(strGroup + i12, strM37789);
                        } else {
                            map2.put(strGroup, strM37789);
                        }
                        arrayList.add(strGroup2);
                    }
                    i = 1024;
                    i4 = i7;
                    i2 = 0;
                }
            } catch (C15290 e) {
            } catch (Exception e2) {
                e = e2;
                throw new C15290(EnumC1180.INTERNAL_ERROR, e.toString());
            }
        } catch (C15290 e3) {
            throw e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37791(String str, Map map) throws C15290 {
        String strTrim;
        String strM13788;
        if (str == null) {
            this.f49353 = "";
            return;
        }
        this.f49353 = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, a.p);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                try {
                    strTrim = AbstractC4708.m13788(strNextToken.substring(0, iIndexOf)).trim();
                    try {
                        strM13788 = AbstractC4708.m13788(strNextToken.substring(iIndexOf + 1));
                    } catch (IllegalArgumentException e) {
                        throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e);
                    }
                } catch (IllegalArgumentException e2) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e2);
                }
            } else {
                try {
                    strTrim = AbstractC4708.m13788(strNextToken).trim();
                    strM13788 = "";
                } catch (IllegalArgumentException e3) {
                    throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Malformed percent-encoding.", e3);
                }
            }
            List arrayList = (List) map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strM13788);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37800() {
        AbstractC4708 abstractC4708 = this.f49347;
        C9648 c9648 = this.f49362;
        C18820 c18820 = this.f49356;
        OutputStream outputStream = this.f49352;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z = false;
                        this.f49361 = 0;
                        this.f49350 = 0;
                        this.f49354 = "HTTP/1.1";
                        m37794();
                        c18820.mark(8192);
                        try {
                            int i = c18820.read(bArr, 0, 8192);
                            if (i == -1) {
                                AbstractC4708.m13790(c18820);
                                AbstractC4708.m13790(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (i > 0) {
                                int i2 = this.f49350 + i;
                                this.f49350 = i2;
                                int iM37788 = m37788(i2, bArr);
                                this.f49361 = iM37788;
                                if (iM37788 > 0) {
                                    break;
                                }
                                int i3 = this.f49350;
                                i = c18820.read(bArr, i3, 8192 - i3);
                            }
                            int i4 = this.f49361;
                            if (i4 == 0) {
                                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Header section too large.");
                            }
                            if (i4 < this.f49350) {
                                c18820.reset();
                                c18820.skip(this.f49361);
                            }
                            this.f49363 = new HashMap();
                            HashMap map = this.f49359;
                            if (map == null) {
                                this.f49359 = new HashMap();
                            } else {
                                map.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f49350)));
                            HashMap map2 = new HashMap();
                            this.f49353 = null;
                            this.f49348.clear();
                            m37790(bufferedReader, map2, this.f49363, this.f49359);
                            m37796(this.f49359);
                            this.f49349 = m37795();
                            EnumC4003 enumC4003M12056 = EnumC4003.m12056((String) map2.get(e.s));
                            this.f49364 = enumC4003M12056;
                            if (enumC4003M12056 == null) {
                                throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) map2.get(e.s)) + " unhandled.");
                            }
                            this.f49351 = (String) map2.get("uri");
                            m37799();
                            c18820.m43484();
                            String str = this.f49357;
                            if (str != null) {
                                this.f49359.put("remote-addr", str);
                                this.f49359.put("http-client-ip", str);
                            }
                            this.f49358 = new C14585(this.f49359);
                            String str2 = (String) this.f49359.get("connection");
                            boolean zEquals = "HTTP/1.1".equals(this.f49354);
                            boolean z2 = zEquals && (str2 == null || !str2.matches("(?i).*close.*"));
                            C8236 c8236Mo13796 = abstractC4708.mo13796(this);
                            if (c8236Mo13796 == null) {
                                throw new C15290(EnumC1180.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                            }
                            if (m37787()) {
                                c8236Mo13796.m21803();
                            }
                            String str3 = (String) this.f49359.get("accept-encoding");
                            this.f49358.m34835(c8236Mo13796);
                            c8236Mo13796.m21808(m37798());
                            c8236Mo13796.m21806(this.f49364);
                            c8236Mo13796.m21807(zEquals);
                            if (zEquals && abstractC4708.mo13797(c8236Mo13796) && m37797(str3)) {
                                z = true;
                            }
                            c8236Mo13796.m21809(z);
                            c8236Mo13796.m21811(z2);
                            c8236Mo13796.m21804(outputStream);
                            if (!z2 || c8236Mo13796.m21812()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            m37794();
                            AbstractC4708.m13790(c8236Mo13796);
                            c9648.m24582();
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused) {
                            AbstractC4708.m13790(c18820);
                            AbstractC4708.m13790(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (C15290 e2) {
                        C8236 c8236M13784 = AbstractC4708.m13784(e2.m36300(), "text/plain", e2.getMessage());
                        c8236M13784.m21808(m37798());
                        c8236M13784.m21803();
                        c8236M13784.m21804(outputStream);
                        AbstractC4708.m13790(outputStream);
                        m37794();
                        AbstractC4708.m13790((Object) null);
                        c9648.m24582();
                    }
                } catch (SocketTimeoutException e3) {
                    throw e3;
                } catch (SSLException e4) {
                    C8236 c8236M13785 = AbstractC4708.m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e4.getMessage());
                    c8236M13785.m21808(m37798());
                    c8236M13785.m21804(outputStream);
                    AbstractC4708.m13790(outputStream);
                    m37794();
                    AbstractC4708.m13790((Object) null);
                    c9648.m24582();
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (IOException e6) {
                C8236 c8236M13786 = AbstractC4708.m13784(EnumC1180.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e6.getMessage());
                c8236M13786.m21808(m37798());
                c8236M13786.m21804(outputStream);
                AbstractC4708.m13790(outputStream);
                m37794();
                AbstractC4708.m13790((Object) null);
                c9648.m24582();
            }
        } catch (Throwable th) {
            m37794();
            AbstractC4708.m13790((Object) null);
            c9648.m24582();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private String m37798() {
        return "HTTP/1.0".equals(this.f49354) ? "HTTP/1.0" : "HTTP/1.1";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37788(int i, byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m37793(ByteBuffer byteBuffer, byte[] bArr) {
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

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m37811() {
        return this.f49359;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m37806() {
        return C20195.unmodifiableList(this.f49348);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InputStream m37810() {
        return this.f49356;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m37808() {
        return this.f49360;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m37809() {
        return this.f49355;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37801(String str) {
        this.f49355 = str;
        this.f49360 = true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m37794() {
        this.f49355 = null;
        this.f49360 = false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC4003 m37807() {
        return this.f49364;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap m37803() {
        HashMap map = new HashMap();
        for (String str : this.f49363.keySet()) {
            map.put(str, (String) ((List) this.f49363.get(str)).get(0));
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Map m37813() {
        return this.f49363;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m37812() {
        return this.f49353;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m37804() {
        return this.f49351;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37802(HashMap map) {
        RandomAccessFile randomAccessFile;
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutput dataOutputStream;
        ByteBuffer map2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            long j = this.f49359.containsKey("content-length") ? Long.parseLong((String) this.f49359.get("content-length")) : 0L;
            if (j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
                try {
                    randomAccessFile = new RandomAccessFile(this.f49362.m24583().m47759(), "rw");
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
                    int i = this.f49356.read(bArr, 0, (int) Math.min(j, 512L));
                    this.f49350 = i;
                    if (i <= 0) {
                        throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Request body ended before Content-Length.");
                    }
                    j -= (long) i;
                    dataOutputStream.write(bArr, 0, i);
                }
                if (byteArrayOutputStream != null) {
                    map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                } else {
                    map2 = C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()).map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
                    randomAccessFile.seek(0L);
                }
                if (EnumC4003.POST.equals(this.f49364)) {
                    C18114 c18114 = new C18114((String) this.f49359.get(e.f));
                    if (c18114.m42235()) {
                        String strM42231 = c18114.m42231();
                        if (strM42231 == null || strM42231.isEmpty()) {
                            throw new C15290(EnumC1180.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                        m37792(c18114, map2, this.f49363, map);
                    } else {
                        byte[] bArr2 = new byte[map2.remaining()];
                        map2.get(bArr2);
                        String strTrim = new String(bArr2, c18114.m42236()).trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(c18114.m42232())) {
                            m37791(strTrim, this.f49363);
                        } else if (strTrim.length() != 0) {
                            map.put("postData", strTrim);
                        }
                    }
                } else if (EnumC4003.PUT.equals(this.f49364)) {
                    map.put("content", m37789(map2, 0, map2.limit(), (String) null));
                }
                AbstractC4708.m13790(randomAccessFile);
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                AbstractC4708.m13790(randomAccessFile2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            AbstractC4708.m13790(randomAccessFile2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private long m37795() {
        String str = (String) this.f49359.get("content-length");
        if (str == null) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    private boolean m37787() {
        return this.f49349 != this.f49356.m43483();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m37797(String str) {
        double d;
        if (str == null) {
            return false;
        }
        boolean z = false;
        for (String str2 : str.split(",")) {
            String[] strArrSplit = str2.split(l.b);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m37789(ByteBuffer byteBuffer, int i, int i2, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (i2 <= 0) {
            return "";
        }
        try {
            try {
                C20937 c20937M24583 = this.f49362.m24583();
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                fileOutputStream = new FileOutputStream(c20937M24583.m47759());
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                    byteBufferDuplicate.position(i).limit(i + i2);
                    fileChannelConvertMaybeLegacyFileChannelFromLibrary.write(byteBufferDuplicate.slice());
                    String strM47759 = c20937M24583.m47759();
                    AbstractC4708.m13790(fileOutputStream);
                    return strM47759;
                } catch (Exception e) {
                    e = e;
                    throw new Error(e);
                } catch (Throwable th) {
                    th = th;
                    AbstractC4708.m13790(fileOutputStream);
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

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m37805() {
        return this.f49357;
    }
}
