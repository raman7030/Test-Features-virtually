package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class RunnableC8610 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public static final SimpleDateFormat f23140;

    /* JADX INFO: renamed from: ᩸ */
    public final C9142 f23141;

    /* JADX INFO: renamed from: ᩹ */
    public final Socket f23142;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        f23140 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C5468.getTimeZone("GMT"));
    }

    public RunnableC8610(Socket socket, C9142 c9142) {
        this.f23142 = socket;
        this.f23141 = c9142;
        C4081.f8987.execute(this);
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
        C9142 c9142 = this.f23141;
        try {
            try {
                try {
                    InputStream inputStream = this.f23142.getInputStream();
                    if (inputStream != null && (i = inputStream.read((bArr = new byte[8192]), 0, 8192)) > 0) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, i)));
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        m20032(bufferedReader, map, map2);
                        String str5 = (String) map.get(AbstractC0213e.f995s);
                        C12826.requireNonNull(str5);
                        String str6 = (String) map.get("uri");
                        C12826.requireNonNull(str6);
                        try {
                            if (!str6.startsWith("/" + c9142.f24748 + "/")) {
                                throw new C3916("404 Not Found");
                            }
                            String strSubstring = str6.substring(c9142.f24748.length() + 2);
                            if (strSubstring.isEmpty()) {
                                throw new C3916("403 Forbidden");
                            }
                            if (!str5.equalsIgnoreCase("get") && !str5.equalsIgnoreCase("head")) {
                                throw new C3916("501 Not Implemented", "Unsupported method: ".concat(str5));
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
                                    if (strSubstring.equals(c9142.f24741)) {
                                        linkedHashMap2.put("Content-Length", "" + (c9142.f24746 - j));
                                        if (z) {
                                            try {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (c9142.f24746 - 1) + "/" + c9142.f24746);
                                                str4 = "206 Partial Content";
                                            } catch (C3916 e) {
                                                e = e;
                                                str2 = str;
                                                r3 = this;
                                                linkedHashMap = null;
                                            }
                                        } else {
                                            str4 = "200 OK";
                                        }
                                        if (str5.equalsIgnoreCase("head")) {
                                            m20033(str4, c9142.f24742, linkedHashMap2, null);
                                        } else {
                                            try {
                                                if (c9142.f24744.incrementAndGet() >= 12) {
                                                    System.out.println("Too many requests");
                                                    throw new C3916("429 Too Many Requests");
                                                }
                                                m20033(str4, c9142.f24742, linkedHashMap2, new InterfaceC24703() { // from class: l.ᩳۚ᩻
                                                    @Override // p067l.InterfaceC24703
                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final void mo36329(OutputStream outputStream) throws IOException {
                                                        this.f57736.f23141.m21088(outputStream, j);
                                                    }
                                                });
                                                c9142.f24744.decrementAndGet();
                                            } catch (Throwable th) {
                                                c9142.f24744.decrementAndGet();
                                                throw th;
                                            }
                                        }
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        try {
                                            sb.append(C11419.m26416(c9142.f24745));
                                            sb.append(strSubstring);
                                            final String string = sb.toString();
                                            InterfaceC19370 interfaceC19370Mo9709 = c9142.f24743.mo9709(string);
                                            if (interfaceC19370Mo9709 == null) {
                                                throw new C3916("404 Not Found");
                                            }
                                            C17278 c17278 = (C17278) interfaceC19370Mo9709;
                                            long size = c17278.getSize();
                                            linkedHashMap2.put("Content-Length", "" + (size - j));
                                            if (z) {
                                                linkedHashMap2.put("Content-Range", "bytes " + j + "-" + (size - 1) + "/" + size);
                                                str3 = "206 Partial Content";
                                            } else {
                                                str3 = "200 OK";
                                            }
                                            if (str5.equalsIgnoreCase("head")) {
                                                m20033(str3, c17278.mo39137(), linkedHashMap2, null);
                                                return;
                                            } else {
                                                m20033(str3, c17278.mo39137(), linkedHashMap2, new InterfaceC24703() { // from class: l.ܿۚ᩻
                                                    @Override // p067l.InterfaceC24703
                                                    /* JADX INFO: renamed from: ֫ */
                                                    public final void mo36329(OutputStream outputStream) throws IOException {
                                                        InputStream inputStreamMo11725 = this.f55737.f23141.f24743.mo11725(j, string);
                                                        try {
                                                            C23461.m52174(inputStreamMo11725, outputStream, 12288);
                                                            inputStreamMo11725.close();
                                                        } catch (Throwable th2) {
                                                            if (inputStreamMo11725 != null) {
                                                                try {
                                                                    inputStreamMo11725.close();
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
                                        } catch (C3916 e2) {
                                            e = e2;
                                            r4 = this;
                                        } catch (Exception e3) {
                                            e = e3;
                                            r4 = this;
                                            final String strM46923 = C20778.m46923(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                            r4.m20033("500 Internal Server Error", str, null, new InterfaceC24703() { // from class: l.ܳۚ᩻
                                                @Override // p067l.InterfaceC24703
                                                /* JADX INFO: renamed from: ֫ */
                                                public final void mo36329(OutputStream outputStream) throws IOException {
                                                    outputStream.write(strM46923.getBytes());
                                                }
                                            });
                                            return;
                                        }
                                    }
                                } catch (C3916 e4) {
                                    e = e4;
                                    r4 = this;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                r4 = this;
                                final String strM46924 = C20778.m46923(e, new StringBuilder("SERVER INTERNAL ERROR: "));
                                r4.m20033("500 Internal Server Error", str, null, new InterfaceC24703() { // from class: l.ܳۚ᩻
                                    @Override // p067l.InterfaceC24703
                                    /* JADX INFO: renamed from: ֫ */
                                    public final void mo36329(OutputStream outputStream) throws IOException {
                                        outputStream.write(strM46924.getBytes());
                                    }
                                });
                                return;
                            }
                        } catch (C3916 e6) {
                            e = e6;
                        } catch (Exception e7) {
                            e = e7;
                        }
                        r4 = this;
                        str2 = str;
                        r2 = r4;
                        linkedHashMap = null;
                        r3 = r2;
                        final String str8 = e.f8500;
                        r3.m20033(e.f8501, str2, linkedHashMap, new InterfaceC24703() { // from class: l.ܳۚ᩻
                            @Override // p067l.InterfaceC24703
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo36329(OutputStream outputStream) throws IOException {
                                outputStream.write(str8.getBytes());
                            }
                        });
                    }
                } catch (C3916 e8) {
                    e = e8;
                    str = "text/plain";
                }
            } catch (C3916 e9) {
                e = e9;
                str2 = "text/plain";
                r2 = this;
            }
        } catch (Exception e10) {
            e = e10;
            str = "text/plain";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20032(BufferedReader bufferedReader, HashMap map, HashMap map2) throws C3916 {
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C3916("400 Bad Request", "BAD REQUEST: Syntax error");
            }
            map.put(AbstractC0213e.f995s, stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new C3916("400 Bad Request", "BAD REQUEST: Missing URI");
            }
            try {
                map.put("uri", C5136.decode(stringTokenizer.nextToken(), C0233a.f1077D));
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
            throw new C3916("500 Internal Server Error", C7241.m16586(e2, new StringBuilder("SERVER INTERNAL ERROR: IOException: ")));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20033(String str, String str2, LinkedHashMap linkedHashMap, InterfaceC24703 interfaceC24703) {
        Socket socket = this.f23142;
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
                    printWriter.print("Date: " + f23140.format(new Date()) + "\r\n");
                }
                if (linkedHashMap != null) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        printWriter.print(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
                    }
                }
                printWriter.print("\r\n");
                printWriter.flush();
                if (interfaceC24703 != null) {
                    interfaceC24703.mo36329(outputStream);
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
