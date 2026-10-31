package l;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۗ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B74J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3108 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f9720 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f9719 = new HashMap();

    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21453 m9475(C23713 c23713, Uri uri, InterfaceC15097 interfaceC15097, C15663 c15663) {
        C4519 c4519M9473;
        String str;
        C16197 c16197M52285 = c23713.m52285();
        if (c16197M52285 == null) {
            return C21453.m48601();
        }
        String strM47724 = C20892.m47724(uri, interfaceC15097);
        synchronized (f9720) {
            C15101 c15101 = (C15101) C13843.computeIfAbsent(f9719, strM47724, new C8047());
            C21453 c21453 = new C21453(c15101, 0);
            c15101.f46186++;
            if (c15663 != null) {
                C2259.m7462(c15663.f48221, c21453);
            }
            while (c15101.f46182 && !c21453.f69071) {
                try {
                    f9720.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    c21453.m48602();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP validation");
                }
            }
            if (c21453.f69071) {
                return C21453.m48601();
            }
            if (c23713.m52286().equals(c15101.f46184) && (str = c15101.f46181) != null) {
                C21453.m48598(c21453, str, c15101.f46183, c15101.f46185);
                return c21453;
            }
            c15101.f46182 = true;
            C4519 c4519 = null;
            try {
                c4519M9473 = m9473(c16197M52285, strM47724, uri, interfaceC15097, c15101);
            } catch (IOException | RuntimeException unused2) {
                c4519M9473 = null;
            }
            synchronized (f9720) {
                if (c4519M9473 == null) {
                    c4519 = c4519M9473;
                } else if (c4519M9473.f14361 != null) {
                    while (c15101.f46179 > 0) {
                        try {
                            f9720.wait();
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            c15101.f46182 = false;
                            c21453.m48602();
                            f9720.notifyAll();
                            throw new InterruptedIOException("Interrupted while waiting to replace HTTP cache generation");
                        }
                    }
                    try {
                        c16197M52285.m38150(c4519M9473.f14361);
                        c4519 = c4519M9473;
                    } catch (RuntimeException unused4) {
                    }
                } else {
                    c4519 = c4519M9473;
                }
                c15101.f46182 = false;
                if (c4519 == null) {
                    c21453.m48602();
                    c23713.m52287();
                    f9720.notifyAll();
                    return C21453.m48601();
                }
                c15101.f46184 = c23713.m52286();
                c15101.f46181 = c4519.f14359;
                c15101.f46183 = c4519.f14360;
                c15101.f46185 = c4519.f14362;
                if (!c21453.f69071) {
                    C21453.m48598(c21453, c4519.f14359, c4519.f14360, c4519.f14362);
                }
                f9720.notifyAll();
                if (c21453.f69071) {
                    c21453 = C21453.m48601();
                }
                return c21453;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0171 A[PHI: r14
      0x0171: PHI (r14v7 long) = (r14v5 long), (r14v2 long), (r14v2 long) binds: [B:105:0x015c, B:101:0x0143, B:102:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4519 m9473(C16197 c16197, String str, Uri uri, InterfaceC15097 interfaceC15097, C15101 c15101) throws IOException {
        C20042 c20042M46234;
        boolean z;
        String str2;
        boolean zEquals;
        boolean zEquals2;
        boolean zEquals3;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C7026 c7026Mo38139 = c16197.mo38139(str);
        C22158 c22158 = new C22158();
        c22158.f71909 = -1L;
        c22158.f71906 = c7026Mo38139.m18997("custom_mt.video.etag");
        c22158.f71910 = c7026Mo38139.m18997("custom_mt.video.last_modified");
        c22158.f71909 = c7026Mo38139.m18993(-1L, "custom_mt.video.length");
        c22158.f71908 = c7026Mo38139.m18993(0L, "custom_mt.video.generation");
        c22158.f71907 = c7026Mo38139.m18997("custom_mt.video.final_uri_digest");
        try {
            c20042M46234 = m9474(interfaceC15097, uri, c22158, true, false, c15101);
        } catch (C23770 e) {
            if (e.f76941 == 304) {
                c20042M46234 = C20042.m46234(e);
            } else {
                try {
                    c20042M46234 = m9474(interfaceC15097, uri, c22158, true, true, c15101);
                } catch (C23770 e2) {
                    if (e2.f76941 == 304) {
                        c20042M46234 = C20042.m46234(e2);
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (c20042M46234.f64940 && (!c22158.m49775() || (((str3 = c20042M46234.f64936) != null && (str8 = c22158.f71906) != null && !str3.equals(str8)) || (((str4 = c20042M46234.f64939) != null && (str7 = c22158.f71910) != null && !str4.equals(str7)) || ((str5 = c20042M46234.f64937) != null && (str6 = c22158.f71907) != null && !str5.equals(str6)))))) {
            c20042M46234 = m9474(interfaceC15097, uri, null, false, false, c15101);
        }
        boolean z2 = c20042M46234.f64940;
        String str9 = c20042M46234.f64936;
        if (str9 == null) {
            str9 = z2 ? c22158.f71906 : null;
        }
        String str10 = c20042M46234.f64939;
        if (str10 == null) {
            str10 = z2 ? c22158.f71910 : null;
        }
        long j = c20042M46234.f64941;
        if (j == -1) {
            j = z2 ? c22158.f71909 : -1L;
        }
        String str11 = c20042M46234.f64937;
        if (str11 == null) {
            str11 = z2 ? c22158.f71907 : null;
        }
        long jMax = c22158.f71908;
        if (jMax <= 0 && str9 == null && str10 == null && j == -1) {
            throw new IOException("HTTP validation returned incomplete metadata");
        }
        if (c22158.m49775()) {
            String str12 = c22158.f71906;
            if (str12 == null) {
                zEquals = str9 == null;
            } else {
                zEquals = str12.equals(str9);
            }
            if (zEquals) {
                String str13 = c22158.f71910;
                if (str13 == null) {
                    zEquals2 = str10 == null;
                } else {
                    zEquals2 = str13.equals(str10);
                }
                if (zEquals2 && c22158.f71909 == j) {
                    String str14 = c22158.f71907;
                    if (str14 == null) {
                        zEquals3 = str11 == null;
                    } else {
                        zEquals3 = str14.equals(str11);
                    }
                    if (zEquals3) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z || (str9 == null && str10 == null)) {
            jMax = Math.max(System.currentTimeMillis(), c22158.f71908 + 1);
            long j2 = c22158.f71908;
            if (j2 > 0) {
                str2 = str + ":g" + j2;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str15 = str2;
        C23959 c23959 = new C23959();
        if (str9 == null) {
            c23959.m52789("custom_mt.video.etag");
        } else {
            c23959.m52790("custom_mt.video.etag", str9);
        }
        if (str10 == null) {
            c23959.m52789("custom_mt.video.last_modified");
        } else {
            c23959.m52790("custom_mt.video.last_modified", str10);
        }
        c23959.m52788(j, "custom_mt.video.length");
        c23959.m52788(jMax, "custom_mt.video.generation");
        if (str11 == null) {
            c23959.m52789("custom_mt.video.final_uri_digest");
        } else {
            c23959.m52790("custom_mt.video.final_uri_digest", str11);
        }
        c16197.mo38142(str, c23959);
        return new C4519(str + ":g" + jMax, j, c20042M46234.f64938, str15);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20042 m9474(InterfaceC15097 interfaceC15097, Uri uri, C22158 c22158, boolean z, boolean z2, C15101 c15101) {
        long jM3456;
        Boolean bool;
        InterfaceC21449 interfaceC21449Mo6247 = interfaceC15097.mo6247();
        C4515 c4515 = new C4515();
        c4515.m13281(uri);
        if (z2) {
            c4515.m13286(0L);
            c4515.m13280(1L);
        } else {
            c4515.m13285(3);
        }
        if (z && c22158 != null) {
            HashMap map = new HashMap();
            String str = c22158.f71906;
            if (str != null) {
                map.put("If-None-Match", str);
            }
            String str2 = c22158.f71910;
            if (str2 != null) {
                map.put("If-Modified-Since", str2);
            }
            c4515.m13283(map);
        }
        try {
            m9476(c15101, interfaceC21449Mo6247);
            long jMo1620 = interfaceC21449Mo6247.mo1620(c4515.m13278());
            Map mapMo5936 = interfaceC21449Mo6247.mo5936();
            Uri uriMo1621 = interfaceC21449Mo6247.mo1621();
            int iMo19698 = interfaceC21449Mo6247 instanceof InterfaceC20949 ? ((InterfaceC20949) interfaceC21449Mo6247).mo19698() : -1;
            if (z2) {
                if (iMo19698 == 206) {
                    jM3456 = C0991.m3456(m9478("Content-Range", mapMo5936));
                    if (jM3456 == -1) {
                        throw new IOException("Invalid HTTP range probe response");
                    }
                    bool = Boolean.TRUE;
                } else if (iMo19698 == 200) {
                    String strM9478 = m9478("Content-Length", mapMo5936);
                    if (strM9478 != null) {
                        try {
                            jM3456 = Long.parseLong(strM9478);
                            if (jM3456 < 0) {
                                if (jMo1620 < 0) {
                                    jMo1620 = -1;
                                }
                                jM3456 = jMo1620;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (jMo1620 < 0) {
                            jMo1620 = -1;
                        }
                        jM3456 = jMo1620;
                    }
                    bool = Boolean.FALSE;
                } else {
                    throw new IOException("Unexpected HTTP range probe status: " + iMo19698);
                }
            } else {
                if (iMo19698 < 200 || iMo19698 >= 300) {
                    throw new IOException("Unexpected HTTP validation status: " + iMo19698);
                }
                String strM9479 = m9478("Content-Length", mapMo5936);
                if (strM9479 != null) {
                    try {
                        jM3456 = Long.parseLong(strM9479);
                        if (jM3456 < 0) {
                            if (jMo1620 < 0) {
                                jMo1620 = -1;
                            }
                            jM3456 = jMo1620;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                } else {
                    if (jMo1620 < 0) {
                        jMo1620 = -1;
                    }
                    jM3456 = jMo1620;
                }
                bool = null;
            }
            long j = jM3456;
            Boolean bool2 = bool;
            String strM94710 = m9478("ETag", mapMo5936);
            String strM94711 = m9478("Last-Modified", mapMo5936);
            if (uriMo1621 == null) {
                uriMo1621 = uri;
            }
            C20042 c20042 = new C20042(false, strM94710, strM94711, j, m9477(uriMo1621), bool2);
            try {
                interfaceC21449Mo6247.close();
                return c20042;
            } finally {
                m9479(c15101, interfaceC21449Mo6247);
            }
        } catch (Throwable th) {
            try {
                interfaceC21449Mo6247.close();
                throw th;
            } finally {
                m9479(c15101, interfaceC21449Mo6247);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9476(C15101 c15101, InterfaceC21449 interfaceC21449) {
        synchronized (f9720) {
            if (!c15101.f46182 || c15101.f46186 + c15101.f46179 == 0) {
                throw new InterruptedIOException("HTTP validation was canceled");
            }
            c15101.f46187 = interfaceC21449;
            c15101.f46180 = Thread.currentThread();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9479(C15101 c15101, InterfaceC21449 interfaceC21449) {
        synchronized (f9720) {
            if (c15101.f46187 == interfaceC21449) {
                c15101.f46187 = null;
                c15101.f46180 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m9478(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m9477(Uri uri) {
        MessageDigest messageDigestM34534 = C14460.m34534();
        messageDigestM34534.update(uri.buildUpon().fragment(null).build().toString().getBytes(StandardCharsets.UTF_8));
        return C14460.m34531(messageDigestM34534.digest());
    }
}
