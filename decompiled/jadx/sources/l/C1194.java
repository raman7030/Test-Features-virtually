package l;

import android.text.TextUtils;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: l.֨ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1194 implements InterfaceC5428 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4324 = 15000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4325 = 30000;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f4326;

    public C1194(String str) {
        this.f4326 = str;
    }

    @Override // l.InterfaceC5428
    public final void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f4324 = (int) j;
        this.f4325 = (int) j2;
    }

    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 mo4042(String str, String str2) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str3;
        C9145.m23520("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C16014.m37867(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(a.p);
            }
            str = C16014.m37867(str, str2);
        }
        int length = str2.length();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                m4040(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        str3 = "请求失败 code:" + httpURLConnection.getResponseCode();
                    } else {
                        str3 = responseMessage;
                    }
                    C8250 c8250 = new C8250(httpURLConnection, "", httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), str3);
                    m4041(httpURLConnection);
                    return c8250;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                C8250 c8251 = new C8250(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), "");
                                m4039(byteArrayOutputStream2);
                                m4039(inputStream);
                                m4041(httpURLConnection);
                                return c8251;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        m4039(byteArrayOutputStream);
                        m4039(inputStream);
                        m4041(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 mo4044(String str, Map map) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        C9145.m23520("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(C12789.encode((String) entry.getKey(), a.D));
            sb.append(com.alipay.sdk.m.p.a.h);
            sb.append(C12789.encode((String) entry.getValue(), a.D));
        }
        String string = sb.toString();
        int length = string.length();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                m4040(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), a.D);
                outputStreamWriter.write(string);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr);
                                if (i != -1) {
                                    byteArrayOutputStream2.write(bArr, 0, i);
                                } else {
                                    C8250 c8250 = new C8250(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, length, httpURLConnection.getResponseCode(), "");
                                    m4039(byteArrayOutputStream2);
                                    m4039(inputStream);
                                    m4041(httpURLConnection);
                                    return c8250;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            m4039(byteArrayOutputStream);
                            m4039(inputStream);
                            m4041(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    C8250 c8251 = new C8250(httpURLConnection, "", 0, length, httpURLConnection.getResponseCode(), responseMessage);
                    m4041(httpURLConnection);
                    return c8251;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0113 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:26:0x0110, B:28:0x0113, B:36:0x01af), top: B:69:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0193  */
    /* JADX WARN: Code duplicated, block: B:36:0x01af A[Catch: all -> 0x0191, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:26:0x0110, B:28:0x0113, B:36:0x01af), top: B:69:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x01c3 A[Catch: all -> 0x0206, LOOP:0: B:40:0x01bc->B:42:0x01c3, LOOP_END, TryCatch #3 {all -> 0x0206, blocks: (B:39:0x01ba, B:40:0x01bc, B:42:0x01c3, B:43:0x01c8, B:50:0x01e8), top: B:75:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01d2 A[Catch: all -> 0x0209, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0209, blocks: (B:33:0x0195, B:48:0x01d2), top: B:77:0x0195 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c8 A[EDGE_INSN: B:87:0x01c8->B:43:0x01c8 BREAK  A[LOOP:0: B:40:0x01bc->B:42:0x01c3], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0113, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x01d2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // l.InterfaceC5428
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4722 mo4043(String str, HashMap map, HashMap map2) throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? inputStream;
        ?? r13;
        DataOutputStream dataOutputStream;
        Object obj;
        int i;
        int responseCode;
        String string;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int i2;
        if (map2.size() <= 0) {
            return mo4044(str, (Map) map);
        }
        Iterator it = map2.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str2 = (String) entry.getKey();
        byte[] bArr2 = (byte[]) entry.getValue();
        C9145.m23520("DefaultHttpServiceImpl", "文件上传");
        String string2 = UUID.randomUUID().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string2);
                m4040(httpURLConnection);
                httpURLConnection.connect();
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    if (map.size() <= 0) {
                        obj = null;
                        r13 = 0;
                        r13 = 0;
                        if (bArr2 != null) {
                            if (bArr2.length > 0) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("--");
                                stringBuffer.append(string2);
                                stringBuffer.append("\r\n");
                                stringBuffer.append("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n");
                                StringBuilder sb = new StringBuilder();
                                sb.append("Content-Type: application/octet-stream; charset=UTF-8");
                                sb.append("\r\n");
                                stringBuffer.append(sb.toString());
                                stringBuffer.append("\r\n");
                                dataOutputStream.write(stringBuffer.toString().getBytes());
                                dataOutputStream.write(bArr2, 0, bArr2.length);
                                dataOutputStream.write("\r\n".getBytes());
                                byte[] bytes = ("--" + string2 + "--\r\n").getBytes();
                                dataOutputStream.write(bytes);
                                int length = bytes.length;
                                dataOutputStream.flush();
                                i = length;
                            } else {
                                i = 0;
                            }
                            responseCode = httpURLConnection.getResponseCode();
                            C9145.m23518("DefaultHttpServiceImpl", responseCode + "");
                            if (responseCode == 200) {
                                inputStream = httpURLConnection.getInputStream();
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                bArr = new byte[1024];
                                while (true) {
                                    i2 = inputStream.read(bArr);
                                    if (i2 != -1) {
                                        break;
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                                string = byteArrayOutputStream.toString();
                                inputStream = inputStream;
                            } else {
                                string = httpURLConnection.getResponseCode() + "";
                                inputStream = 0;
                                byteArrayOutputStream = null;
                            }
                            C8250 c8250 = new C8250(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            m4039(dataOutputStream);
                            m4039((Closeable) inputStream);
                            m4039(byteArrayOutputStream);
                            m4041(httpURLConnection);
                            return c8250;
                        }
                        i = 0;
                        responseCode = httpURLConnection.getResponseCode();
                        C9145.m23518("DefaultHttpServiceImpl", responseCode + "");
                        if (responseCode == 200) {
                            inputStream = httpURLConnection.getInputStream();
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            bArr = new byte[1024];
                            while (true) {
                                i2 = inputStream.read(bArr);
                                if (i2 != -1) {
                                    break;
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                            }
                            string = byteArrayOutputStream.toString();
                            inputStream = inputStream;
                        } else {
                            string = httpURLConnection.getResponseCode() + "";
                            inputStream = 0;
                            byteArrayOutputStream = null;
                        }
                        C8250 c8251 = new C8250(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                        m4039(dataOutputStream);
                        m4039((Closeable) inputStream);
                        m4039(byteArrayOutputStream);
                        m4041(httpURLConnection);
                        return c8251;
                    }
                    try {
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            try {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                String strEncode = C12789.encode((String) it2.next(), a.D);
                                String strEncode2 = C12789.encode((String) map.get(strEncode), a.D);
                                stringBuffer2.append("--");
                                stringBuffer2.append(string2);
                                stringBuffer2.append("\r\n");
                                stringBuffer2.append("Content-Disposition: form-data; name=\"");
                                stringBuffer2.append(strEncode);
                                stringBuffer2.append("\"");
                                stringBuffer2.append("\r\n");
                                stringBuffer2.append("\r\n");
                                stringBuffer2.append(strEncode2);
                                stringBuffer2.append("\r\n");
                                String string3 = stringBuffer2.toString();
                                C9145.m23518("DefaultHttpServiceImpl", strEncode + "=" + string3 + "##");
                                dataOutputStream.write(string3.getBytes());
                            } catch (Throwable th) {
                                th = th;
                                obj = null;
                                inputStream = obj;
                                r13 = inputStream;
                                m4039(dataOutputStream);
                                m4039((Closeable) inputStream);
                                m4039((Closeable) r13);
                                m4041(httpURLConnection);
                                throw th;
                            }
                        }
                        obj = null;
                        r13 = 0;
                        r13 = 0;
                        if (bArr2 != null) {
                            try {
                                if (bArr2.length > 0) {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("--");
                                    stringBuffer3.append(string2);
                                    stringBuffer3.append("\r\n");
                                    stringBuffer3.append("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n");
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Content-Type: application/octet-stream; charset=UTF-8");
                                    sb2.append("\r\n");
                                    stringBuffer3.append(sb2.toString());
                                    stringBuffer3.append("\r\n");
                                    dataOutputStream.write(stringBuffer3.toString().getBytes());
                                    dataOutputStream.write(bArr2, 0, bArr2.length);
                                    dataOutputStream.write("\r\n".getBytes());
                                    byte[] bytes2 = ("--" + string2 + "--\r\n").getBytes();
                                    dataOutputStream.write(bytes2);
                                    int length2 = bytes2.length;
                                    dataOutputStream.flush();
                                    i = length2;
                                } else {
                                    i = 0;
                                }
                                try {
                                    responseCode = httpURLConnection.getResponseCode();
                                    C9145.m23518("DefaultHttpServiceImpl", responseCode + "");
                                    if (responseCode == 200) {
                                        inputStream = httpURLConnection.getInputStream();
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                bArr = new byte[1024];
                                                while (true) {
                                                    i2 = inputStream.read(bArr);
                                                    if (i2 != -1) {
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr, 0, i2);
                                                }
                                                string = byteArrayOutputStream.toString();
                                                inputStream = inputStream;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r13 = byteArrayOutputStream;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } else {
                                        string = httpURLConnection.getResponseCode() + "";
                                        inputStream = 0;
                                        byteArrayOutputStream = null;
                                    }
                                    C8250 c8252 = new C8250(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                                    m4039(dataOutputStream);
                                    m4039((Closeable) inputStream);
                                    m4039(byteArrayOutputStream);
                                    m4041(httpURLConnection);
                                    return c8252;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream = r13;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStream = obj;
                                r13 = inputStream;
                            }
                        } else {
                            i = 0;
                            responseCode = httpURLConnection.getResponseCode();
                            C9145.m23518("DefaultHttpServiceImpl", responseCode + "");
                            if (responseCode == 200) {
                                inputStream = httpURLConnection.getInputStream();
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                bArr = new byte[1024];
                                while (true) {
                                    i2 = inputStream.read(bArr);
                                    if (i2 != -1) {
                                        break;
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i2);
                                }
                                string = byteArrayOutputStream.toString();
                                inputStream = inputStream;
                            } else {
                                string = httpURLConnection.getResponseCode() + "";
                                inputStream = 0;
                                byteArrayOutputStream = null;
                            }
                            C8250 c8253 = new C8250(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            m4039(dataOutputStream);
                            m4039((Closeable) inputStream);
                            m4039(byteArrayOutputStream);
                            m4041(httpURLConnection);
                            return c8253;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        inputStream = 0;
                        r13 = inputStream;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    r13 = 0;
                }
            } catch (Throwable th8) {
                th = th8;
                dataOutputStream = null;
                inputStream = 0;
            }
        } catch (Throwable th9) {
            th = th9;
            httpURLConnection = null;
            inputStream = 0;
            r13 = 0;
            dataOutputStream = null;
        }
        m4039(dataOutputStream);
        m4039((Closeable) inputStream);
        m4039((Closeable) r13);
        m4041(httpURLConnection);
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4040(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("User-Agent", this.f4326);
        httpURLConnection.setConnectTimeout(this.f4324);
        httpURLConnection.setReadTimeout(this.f4325);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", a.D);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4039(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m4041(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }
}
