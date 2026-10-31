package l;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۜۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9TK */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6567 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f20262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7127 f20263;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Socket f20264;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f20262 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
    }

    public RunnableC6567(Socket socket, C7127 c7127) {
        this.f20264 = socket;
        this.f20263 = c7127;
        C1802.f6208.execute(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l.ۜۚ᩻] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ۜۚ᩻] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        ?? r2;
        LinkedHashMap linkedHashMap;
        ?? r3;
        byte[] bArr;
        int i;
        final long j;
        boolean z;
        String str3;
        String str4;
        ?? r4 = "text/plain";
        C7127 c7127 = this.f20263;
        try {
            try {
                try {
                    InputStream inputStream = this.f20264.getInputStream();
                    if (inputStream != null && (i = inputStream.read((bArr = new byte[8192]), 0, 8192)) > 0) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, i)));
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        m18082(bufferedReader, map, map2);
                        String str5 = (String) map.get(e.s);
                        C11003.requireNonNull(str5);
                        String str6 = (String) map.get("uri");
                        C11003.requireNonNull(str6);
                        try {
                            if (!str6.startsWith("/" + c7127.f21869 + "/")) {
                                throw new C1628("404 Not Found");
                            }
                            String strSubstring = str6.substring(c7127.f21869.length() + 2);
                            if (strSubstring.isEmpty()) {
                                throw new C1628("403 Forbidden");
                            }
                            if (!str5.equalsIgnoreCase("get") && !str5.equalsIgnoreCase("head")) {
                                throw new C1628("501 Not Implemented", "Unsupported method: ".concat(str5));
                            }
                            String str7 = (String) map2.get("range");
                            if (str7 == null || !str7.startsWith("bytes=")) {
                                j = 0;
                                z = false;
                            } else {
                                String strSubstring2 = str7.substring(6);
                                int iIndexOf = strSubstring2.indexOf(45);
                                if (iIndexOf > 0) {
                                    strSubstring2 = strSubstring2.substring(0, iIndexOf);
                                }
                                try {
                                    j = Long.parseLong(strSubstring2);
                                    z = true;
                                } catch (NumberFormatException unused) {
                                    j = 0;
                                    z = false;
                                }
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("Accept-Ranges", "bytes");
                            str = "text/plain";
                            try {
                                try {
                                    if (strSubstring.equals(c7127.f21862)) {
                                        linkedHashMap2.put("Content-Length", "" + (c7127.f21867 - j));
                                        if (z) {
                                            try {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (c7127.f21867 - 1) + "/" + c7127.f21867);
                                                str4 = "206 Partial Content";
                                            } catch (C1628 e) {
                                                e = e;
                                                str2 = str;
                                                r3 = this;
                                                linkedHashMap = null;
                                            }
                                        } else {
                                            str4 = "200 OK";
                                        }
                                        if (str5.equalsIgnoreCase("head")) {
                                            m18083(str4, c7127.f21863, linkedHashMap2, null);
                                        } else {
                                            try {
                                                if (c7127.f21865.incrementAndGet() >= 12) {
                                                    System.out.println("Too many requests");
                                                    throw new C1628("429 Too Many Requests");
                                                }
                                                m18083(str4, c7127.f21863, linkedHashMap2, new InterfaceC23500() { // from class: l.ᩳۚ᩻
                                                    @Override // l.InterfaceC23500
                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final void mo34196(OutputStream outputStream) throws IOException {
                                                        this.f54538.f20263.m19145(outputStream, j);
                                                    }
                                                });
                                                c7127.f21865.decrementAndGet();
                                            } catch (Throwable th) {
                                                c7127.f21865.decrementAndGet();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(C9523.m24406(c7127.f21866));
                                            sb.append(strSubstring);
                                            final String string = sb.toString();
                                            InterfaceC17889 interfaceC17889Mo7638 = c7127.f21864.mo7638(string);
                                            if (interfaceC17889Mo7638 == null) {
                                                throw new C1628("404 Not Found");
                                            }
                                            C15688 c15688 = (C15688) interfaceC17889Mo7638;
                                            long size = c15688.getSize();
                                            linkedHashMap2.put("Content-Length", "" + (size - j));
                                            if (z) {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (size - 1) + "/" + size);
                                                str3 = "206 Partial Content";
                                            } else {
                                                str3 = "200 OK";
                                            }
                                            if (str5.equalsIgnoreCase("head")) {
                                                m18083(str3, c15688.mo36971(), linkedHashMap2, null);
                                                return;
                                            } else {
                                                m18083(str3, c15688.mo36971(), linkedHashMap2, new InterfaceC23500() { // from class: l.ܿۚ᩻
                                                    @Override // l.InterfaceC23500
                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final void mo34196(OutputStream outputStream) throws IOException {
                                                        InputStream inputStreamMo9681 = this.f52554.f20263.f21864.mo9681(j, string);
                                                        try {
                                                            C22194.m49847(inputStreamMo9681, outputStream, 12288);
                                                            inputStreamMo9681.close();
                                                        } catch (Throwable th2) {
                                                            if (inputStreamMo9681 != null) {
                                                                try {
                                                                    inputStreamMo9681.close();
                                                                } catch (Throwable th3) {
                                                                    th2.addSuppressed(th3);
                                                                }
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } catch (C1628 e2) {
                                            e = e2;
                                            r4 = this;
                                        } catch (Exception e3) {
                                            e = e3;
                                            r4 = this;
                                            final String strM44629 = C19370.m44629(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                            r4.m18083("500 Internal Server Error", str, null, new InterfaceC23500() { // from class: l.ܳۚ᩻
                                                @Override // l.InterfaceC23500
                                                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                                                public final void mo34196(OutputStream outputStream) throws IOException {
                                                    outputStream.write(strM44629.getBytes());
                                                }
                                            });
                                            return;
                                        }
                                    }
                                } catch (C1628 e4) {
                                    e = e4;
                                    r4 = this;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                r4 = this;
                                final String strM446210 = C19370.m44629(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                r4.m18083("500 Internal Server Error", str, null, new InterfaceC23500() { // from class: l.ܳۚ᩻
                                    @Override // l.InterfaceC23500
                                    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                                    public final void mo34196(OutputStream outputStream) throws IOException {
                                        outputStream.write(strM446210.getBytes());
                                    }
                                });
                                return;
                            }
                        } catch (C1628 e6) {
                            e = e6;
                        } catch (Exception e7) {
                            e = e7;
                        }
                        r4 = this;
                        str2 = str;
                        r2 = r4;
                        linkedHashMap = null;
                        r3 = r2;
                        final String str8 = e.f5720;
                        r3.m18083(e.f5721, str2, linkedHashMap, new InterfaceC23500() { // from class: l.ܳۚ᩻
                            @Override // l.InterfaceC23500
                            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                            public final void mo34196(OutputStream outputStream) throws IOException {
                                outputStream.write(str8.getBytes());
                            }
                        });
                    }
                } catch (C1628 e8) {
                    e = e8;
                    str = "text/plain";
                }
            } catch (C1628 e9) {
                e = e9;
                str2 = "text/plain";
                r2 = this;
            }
        } catch (Exception e10) {
            e = e10;
            str = "text/plain";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18082(BufferedReader bufferedReader, HashMap map, HashMap map2) throws C1628 {
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C1628("400 Bad Request", "BAD REQUEST: Syntax error");
            }
            map.put(e.s, stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C1628("400 Bad Request", "BAD REQUEST: Missing URI");
            }
            try {
                map.put("uri", C2912.decode(stringTokenizer.nextToken(), a.D));
                if (stringTokenizer.hasMoreTokens()) {
                    String line2 = bufferedReader.readLine();
                    while (line2 != null && line2.trim().length() > 0) {
                        int iIndexOf = line2.indexOf(58);
                        if (iIndexOf >= 0) {
                            map2.put(line2.substring(0, iIndexOf).trim().toLowerCase(), line2.substring(iIndexOf + 1).trim());
                        }
                        line2 = bufferedReader.readLine();
                    }
                }
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new C1628("500 Internal Server Error", C5127.m14678(e2, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18083(String str, String str2, LinkedHashMap linkedHashMap, InterfaceC23500 interfaceC23500) {
        Socket socket = this.f20264;
        try {
            try {
                if (str == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.print("HTTP/1.0 " + str + " \r\n");
                if (str2 != null) {
                    printWriter.print("Content-Type: " + str2 + "\r\n");
                }
                if (linkedHashMap == null || !linkedHashMap.containsKey("Date")) {
                    printWriter.print("Date: " + f20262.format(new Date()) + "\r\n");
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        printWriter.print(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                if (interfaceC23500 != null) {
                    interfaceC23500.mo34196(outputStream);
                }
                outputStream.flush();
                outputStream.close();
            } catch (Throwable unused) {
            }
        } catch (IOException unused2) {
            socket.close();
        }
    }
}
