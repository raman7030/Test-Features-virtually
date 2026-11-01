package p067l;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class C3503 implements InterfaceC7527 {

    /* JADX INFO: renamed from: ֫ */
    public int f7093 = 15000;

    /* JADX INFO: renamed from: ۧ */
    public int f7094 = 30000;

    /* JADX INFO: renamed from: ܽ */
    public final String f7095;

    public C3503(String str) {
        this.f7095 = str;
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: a */
    public final void mo6284a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f7093 = (int) j;
        this.f7094 = (int) j2;
    }

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6285(String str, String str2) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String str3;
        C11060.m25471("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = C17588.m40053(str, "?");
            } else if (iIndexOf != str.length() - 1) {
                str = str.concat(C0233a.f1084p);
            }
            str = C17588.m40053(str, str2);
        }
        int length = str2.length();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                m6282(httpURLConnection);
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
                    C10209 c10209 = new C10209(httpURLConnection, "", httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), str3);
                    m6283(httpURLConnection);
                    return c10209;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                C10209 c102010 = new C10209(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), length, httpURLConnection.getResponseCode(), "");
                                m6281(byteArrayOutputStream2);
                                m6281(inputStream);
                                m6283(httpURLConnection);
                                return c102010;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        m6281(byteArrayOutputStream);
                        m6281(inputStream);
                        m6283(httpURLConnection);
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

    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6287(String str, Map map) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        C11060.m25471("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(C14523.encode((String) entry.getKey(), C0233a.f1077D));
            sb.append(C0184a.f880h);
            sb.append(C14523.encode((String) entry.getValue(), C0233a.f1077D));
        }
        String string = sb.toString();
        int length = string.length();
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                m6282(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), C0233a.f1077D);
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
                                    C10209 c10209 = new C10209(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, length, httpURLConnection.getResponseCode(), "");
                                    m6281(byteArrayOutputStream2);
                                    m6281(inputStream);
                                    m6283(httpURLConnection);
                                    return c10209;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            m6281(byteArrayOutputStream);
                            m6281(inputStream);
                            m6283(httpURLConnection);
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
                    C10209 c102010 = new C10209(httpURLConnection, "", 0, length, httpURLConnection.getResponseCode(), responseMessage);
                    m6283(httpURLConnection);
                    return c102010;
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
    @Override // p067l.InterfaceC7527
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6856 mo6286(String str, HashMap map, HashMap map2) throws Throwable {
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
            return mo6287(str, (Map) map);
        }
        Iterator it = map2.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        String str2 = (String) entry.getKey();
        byte[] bArr2 = (byte[]) entry.getValue();
        C11060.m25471("DefaultHttpServiceImpl", "文件上传");
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
                m6282(httpURLConnection);
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
                            C11060.m25469("DefaultHttpServiceImpl", responseCode + "");
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
                            C10209 c10209 = new C10209(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            m6281(dataOutputStream);
                            m6281((Closeable) inputStream);
                            m6281(byteArrayOutputStream);
                            m6283(httpURLConnection);
                            return c10209;
                        }
                        i = 0;
                        responseCode = httpURLConnection.getResponseCode();
                        C11060.m25469("DefaultHttpServiceImpl", responseCode + "");
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
                        C10209 c102010 = new C10209(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                        m6281(dataOutputStream);
                        m6281((Closeable) inputStream);
                        m6281(byteArrayOutputStream);
                        m6283(httpURLConnection);
                        return c102010;
                    }
                    try {
                        Iterator it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            try {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                String strEncode = C14523.encode((String) it2.next(), C0233a.f1077D);
                                String strEncode2 = C14523.encode((String) map.get(strEncode), C0233a.f1077D);
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
                                C11060.m25469("DefaultHttpServiceImpl", strEncode + "=" + string3 + "##");
                                dataOutputStream.write(string3.getBytes());
                            } catch (Throwable th) {
                                th = th;
                                obj = null;
                                inputStream = obj;
                                r13 = inputStream;
                                m6281(dataOutputStream);
                                m6281((Closeable) inputStream);
                                m6281((Closeable) r13);
                                m6283(httpURLConnection);
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
                                    C11060.m25469("DefaultHttpServiceImpl", responseCode + "");
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
                                    C10209 c102011 = new C10209(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                                    m6281(dataOutputStream);
                                    m6281((Closeable) inputStream);
                                    m6281(byteArrayOutputStream);
                                    m6283(httpURLConnection);
                                    return c102011;
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
                            C11060.m25469("DefaultHttpServiceImpl", responseCode + "");
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
                            C10209 c102012 = new C10209(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            m6281(dataOutputStream);
                            m6281((Closeable) inputStream);
                            m6281(byteArrayOutputStream);
                            m6283(httpURLConnection);
                            return c102012;
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
        m6281(dataOutputStream);
        m6281((Closeable) inputStream);
        m6281((Closeable) r13);
        m6283(httpURLConnection);
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m6282(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("User-Agent", this.f7095);
        httpURLConnection.setConnectTimeout(this.f7093);
        httpURLConnection.setReadTimeout(this.f7094);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", C0233a.f1077D);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6281(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m6283(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }
}
