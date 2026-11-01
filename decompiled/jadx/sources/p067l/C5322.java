package p067l;

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
public final class C5322 {

    /* JADX INFO: renamed from: ۧ */
    public static final Object f12523 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f12522 = new HashMap();

    /* JADX WARN: Code duplicated, block: B:52:0x00b8  */
    /* JADX INFO: renamed from: ֫ */
    public static C22757 m11518(C24905 c24905, Uri uri, InterfaceC16716 interfaceC16716, C17254 c17254) {
        C6663 c6663M11516;
        String str;
        C17762 c17762M54688 = c24905.m54688();
        if (c17762M54688 == null) {
            return C22757.m50938();
        }
        String strM50054 = C22224.m50054(uri, interfaceC16716);
        synchronized (f12523) {
            C16720 c16720 = (C16720) C15525.computeIfAbsent(f12522, strM50054, new C10016());
            C22757 c22757 = new C22757(c16720, 0);
            c16720.f49306++;
            if (c17254 != null) {
                C4515.m9544(c17254.f51360, c22757);
            }
            while (c16720.f49302 && !c22757.f71769) {
                try {
                    f12523.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    c22757.m50939();
                    throw new InterruptedIOException("Interrupted while waiting for HTTP validation");
                }
            }
            if (c22757.f71769) {
                return C22757.m50938();
            }
            if (c24905.m54689().equals(c16720.f49304) && (str = c16720.f49301) != null) {
                C22757.m50935(c22757, str, c16720.f49303, c16720.f49305);
                return c22757;
            }
            c16720.f49302 = true;
            C6663 c6663 = null;
            try {
                c6663M11516 = m11516(c17762M54688, strM50054, uri, interfaceC16716, c16720);
            } catch (IOException | RuntimeException unused2) {
                c6663M11516 = null;
            }
            synchronized (f12523) {
                if (c6663M11516 == null) {
                    c6663 = c6663M11516;
                } else if (c6663M11516.f17188 != null) {
                    while (c16720.f49299 > 0) {
                        try {
                            f12523.wait();
                        } catch (InterruptedException unused3) {
                            Thread.currentThread().interrupt();
                            c16720.f49302 = false;
                            c22757.m50939();
                            f12523.notifyAll();
                            throw new InterruptedIOException("Interrupted while waiting to replace HTTP cache generation");
                        }
                    }
                    try {
                        c17762M54688.m40362(c6663M11516.f17188);
                        c6663 = c6663M11516;
                    } catch (RuntimeException unused4) {
                    }
                } else {
                    c6663 = c6663M11516;
                }
                c16720.f49302 = false;
                if (c6663 == null) {
                    c22757.m50939();
                    c24905.m54690();
                    f12523.notifyAll();
                    return C22757.m50938();
                }
                c16720.f49304 = c24905.m54689();
                c16720.f49301 = c6663.f17186;
                c16720.f49303 = c6663.f17187;
                c16720.f49305 = c6663.f17189;
                if (!c22757.f71769) {
                    C22757.m50935(c22757, c6663.f17186, c6663.f17187, c6663.f17189);
                }
                f12523.notifyAll();
                if (c22757.f71769) {
                    c22757 = C22757.m50938();
                }
                return c22757;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0171 A[PHI: r14
      0x0171: PHI (r14v7 long) = (r14v5 long), (r14v2 long), (r14v2 long) binds: [B:105:0x015c, B:101:0x0143, B:102:0x0145] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    /* JADX INFO: renamed from: ֫ */
    public static C6663 m11516(C17762 c17762, String str, Uri uri, InterfaceC16716 interfaceC16716, C16720 c16720) throws IOException {
        C21416 c21416M48550;
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
        C9046 c9046Mo40351 = c17762.mo40351(str);
        C23427 c23427 = new C23427();
        c23427.f74631 = -1L;
        c23427.f74628 = c9046Mo40351.m20954("custom_mt.video.etag");
        c23427.f74632 = c9046Mo40351.m20954("custom_mt.video.last_modified");
        c23427.f74631 = c9046Mo40351.m20950(-1L, "custom_mt.video.length");
        c23427.f74630 = c9046Mo40351.m20950(0L, "custom_mt.video.generation");
        c23427.f74629 = c9046Mo40351.m20954("custom_mt.video.final_uri_digest");
        try {
            c21416M48550 = m11517(interfaceC16716, uri, c23427, true, false, c16720);
        } catch (C24959 e) {
            if (e.f79694 == 304) {
                c21416M48550 = C21416.m48550(e);
            } else {
                try {
                    c21416M48550 = m11517(interfaceC16716, uri, c23427, true, true, c16720);
                } catch (C24959 e2) {
                    if (e2.f79694 == 304) {
                        c21416M48550 = C21416.m48550(e2);
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (c21416M48550.f67582 && (!c23427.m52113() || (((str3 = c21416M48550.f67578) != null && (str8 = c23427.f74628) != null && !str3.equals(str8)) || (((str4 = c21416M48550.f67581) != null && (str7 = c23427.f74632) != null && !str4.equals(str7)) || ((str5 = c21416M48550.f67579) != null && (str6 = c23427.f74629) != null && !str5.equals(str6)))))) {
            c21416M48550 = m11517(interfaceC16716, uri, null, false, false, c16720);
        }
        boolean z2 = c21416M48550.f67582;
        String str9 = c21416M48550.f67578;
        if (str9 == null) {
            str9 = z2 ? c23427.f74628 : null;
        }
        String str10 = c21416M48550.f67581;
        if (str10 == null) {
            str10 = z2 ? c23427.f74632 : null;
        }
        long j = c21416M48550.f67583;
        if (j == -1) {
            j = z2 ? c23427.f74631 : -1L;
        }
        String str11 = c21416M48550.f67579;
        if (str11 == null) {
            str11 = z2 ? c23427.f74629 : null;
        }
        long jMax = c23427.f74630;
        if (jMax <= 0 && str9 == null && str10 == null && j == -1) {
            throw new IOException("HTTP validation returned incomplete metadata");
        }
        if (c23427.m52113()) {
            String str12 = c23427.f74628;
            if (str12 == null) {
                zEquals = str9 == null;
            } else {
                zEquals = str12.equals(str9);
            }
            if (zEquals) {
                String str13 = c23427.f74632;
                if (str13 == null) {
                    zEquals2 = str10 == null;
                } else {
                    zEquals2 = str13.equals(str10);
                }
                if (zEquals2 && c23427.f74631 == j) {
                    String str14 = c23427.f74629;
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
            jMax = Math.max(System.currentTimeMillis(), c23427.f74630 + 1);
            long j2 = c23427.f74630;
            if (j2 > 0) {
                str2 = str + ":g" + j2;
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        String str15 = str2;
        C25139 c25139 = new C25139();
        if (str9 == null) {
            c25139.m55195("custom_mt.video.etag");
        } else {
            c25139.m55196("custom_mt.video.etag", str9);
        }
        if (str10 == null) {
            c25139.m55195("custom_mt.video.last_modified");
        } else {
            c25139.m55196("custom_mt.video.last_modified", str10);
        }
        c25139.m55194(j, "custom_mt.video.length");
        c25139.m55194(jMax, "custom_mt.video.generation");
        if (str11 == null) {
            c25139.m55195("custom_mt.video.final_uri_digest");
        } else {
            c25139.m55196("custom_mt.video.final_uri_digest", str11);
        }
        c17762.mo40354(str, c25139);
        return new C6663(str + ":g" + jMax, j, c21416M48550.f67580, str15);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX INFO: renamed from: ֫ */
    public static C21416 m11517(InterfaceC16716 interfaceC16716, Uri uri, C23427 c23427, boolean z, boolean z2, C16720 c16720) {
        long jM5759;
        Boolean bool;
        InterfaceC22753 interfaceC22753Mo8449 = interfaceC16716.mo8449();
        C6659 c6659 = new C6659();
        c6659.m15164(uri);
        if (z2) {
            c6659.m15169(0L);
            c6659.m15163(1L);
        } else {
            c6659.m15168(3);
        }
        if (z && c23427 != null) {
            HashMap map = new HashMap();
            String str = c23427.f74628;
            if (str != null) {
                map.put("If-None-Match", str);
            }
            String str2 = c23427.f74632;
            if (str2 != null) {
                map.put("If-Modified-Since", str2);
            }
            c6659.m15166(map);
        }
        try {
            m11519(c16720, interfaceC22753Mo8449);
            long jMo4020 = interfaceC22753Mo8449.mo4020(c6659.m15161());
            Map mapMo8131 = interfaceC22753Mo8449.mo8131();
            Uri uriMo4021 = interfaceC22753Mo8449.mo4021();
            int iMo21671 = interfaceC22753Mo8449 instanceof InterfaceC22278 ? ((InterfaceC22278) interfaceC22753Mo8449).mo21671() : -1;
            if (z2) {
                if (iMo21671 == 206) {
                    jM5759 = C3310.m5759(m11521("Content-Range", mapMo8131));
                    if (jM5759 == -1) {
                        throw new IOException("Invalid HTTP range probe response");
                    }
                    bool = Boolean.TRUE;
                } else if (iMo21671 == 200) {
                    String strM11521 = m11521("Content-Length", mapMo8131);
                    if (strM11521 != null) {
                        try {
                            jM5759 = Long.parseLong(strM11521);
                            if (jM5759 < 0) {
                                if (jMo4020 < 0) {
                                    jMo4020 = -1;
                                }
                                jM5759 = jMo4020;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (jMo4020 < 0) {
                            jMo4020 = -1;
                        }
                        jM5759 = jMo4020;
                    }
                    bool = Boolean.FALSE;
                } else {
                    throw new IOException("Unexpected HTTP range probe status: " + iMo21671);
                }
            } else {
                if (iMo21671 < 200 || iMo21671 >= 300) {
                    throw new IOException("Unexpected HTTP validation status: " + iMo21671);
                }
                String strM11522 = m11521("Content-Length", mapMo8131);
                if (strM11522 != null) {
                    try {
                        jM5759 = Long.parseLong(strM11522);
                        if (jM5759 < 0) {
                            if (jMo4020 < 0) {
                                jMo4020 = -1;
                            }
                            jM5759 = jMo4020;
                        }
                    } catch (NumberFormatException unused2) {
                    }
                } else {
                    if (jMo4020 < 0) {
                        jMo4020 = -1;
                    }
                    jM5759 = jMo4020;
                }
                bool = null;
            }
            long j = jM5759;
            Boolean bool2 = bool;
            String strM11523 = m11521("ETag", mapMo8131);
            String strM11524 = m11521("Last-Modified", mapMo8131);
            if (uriMo4021 == null) {
                uriMo4021 = uri;
            }
            C21416 c21416 = new C21416(false, strM11523, strM11524, j, m11520(uriMo4021), bool2);
            try {
                interfaceC22753Mo8449.close();
                return c21416;
            } finally {
                m11522(c16720, interfaceC22753Mo8449);
            }
        } catch (Throwable th) {
            try {
                interfaceC22753Mo8449.close();
                throw th;
            } finally {
                m11522(c16720, interfaceC22753Mo8449);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11519(C16720 c16720, InterfaceC22753 interfaceC22753) {
        synchronized (f12523) {
            if (!c16720.f49302 || c16720.f49306 + c16720.f49299 == 0) {
                throw new InterruptedIOException("HTTP validation was canceled");
            }
            c16720.f49307 = interfaceC22753;
            c16720.f49300 = Thread.currentThread();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m11522(C16720 c16720, InterfaceC22753 interfaceC22753) {
        synchronized (f12523) {
            if (c16720.f49307 == interfaceC22753) {
                c16720.f49307 = null;
                c16720.f49300 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m11521(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && ((String) entry.getKey()).equalsIgnoreCase(str) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m11520(Uri uri) {
        MessageDigest messageDigestM36668 = C16111.m36668();
        messageDigestM36668.update(uri.buildUpon().fragment(null).build().toString().getBytes(StandardCharsets.UTF_8));
        return C16111.m36665(messageDigestM36668.digest());
    }
}
