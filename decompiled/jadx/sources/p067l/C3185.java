package p067l;

import bin.p000mt.json.JSON;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.֨ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R77X */
/* JADX INFO: loaded from: classes2.dex */
public final class C3185 implements InterfaceC12139 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r11v15, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [l.֨ۗ᩻] */
    /* JADX WARN: Type inference failed for: r4v10, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ֫ */
    public final C5954 m5483(C16484 c16484, C23191 c23191, C20036 c20036, String str) throws Throwable {
        ?? M38678;
        AbstractC17043 abstractC17043M38684;
        C13457 c13457M27208;
        String str2;
        AbstractC17043 abstractC17043M38678;
        String str3 = c16484.f48427;
        String str4 = c20036.f60883;
        String string = c23191.f72866;
        boolean z = c23191.f72867;
        boolean z2 = c23191.f72869;
        boolean z3 = false;
        if (string.startsWith("/")) {
            abstractC17043M38684 = C18524.m42109(string, new String[0]);
        } else {
            AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
            try {
                boolean zIsEmpty = string.isEmpty();
                M38678 = zIsEmpty;
                if (zIsEmpty) {
                    StringBuilder sb = new StringBuilder();
                    String strM38675 = C18524.m42109(str3, new String[0]).m38675();
                    StringBuilder sb2 = new StringBuilder(strM38675.length());
                    for (int i = 0; i < strM38675.length(); i++) {
                        char cCharAt = strM38675.charAt(i);
                        if (cCharAt == ':' || cCharAt == '/' || cCharAt == '\\' || cCharAt == 0) {
                            cCharAt = '_';
                        }
                        sb2.append(cCharAt);
                    }
                    sb.append(sb2.toString());
                    String str5 = "_mcp_";
                    sb.append("_mcp_");
                    sb.append(str4);
                    sb.append(z2 ? "_sign.apk" : "_unsigned.apk");
                    string = sb.toString();
                    M38678 = str5;
                }
                abstractC17043M38684 = abstractC17043M42109.m38684(string);
            } catch (Exception e) {
                throw m5467((AbstractC17043) null, "OUTPUT_PATH_RESOLVE_FAILED", m5463(e));
            }
        }
        AbstractC17043 abstractC17043 = abstractC17043M38684;
        m5481(abstractC17043);
        if (abstractC17043.equals(C18524.m42109(str3, new String[0]))) {
            throw m5467(abstractC17043, "OUTPUT_PATH_IS_SOURCE_APK", "outputName must not resolve to the source APK.");
        }
        if (!abstractC17043.m38672().mo29985()) {
            throw m5467(abstractC17043, "OUTPUT_DIRECTORY_UNWRITABLE", "Output directory is not writable.");
        }
        if (abstractC17043.mo25094() && !z) {
            throw C5276.m11407("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC17043.mo25505()));
        }
        ?? r4 = 1;
        if (z2) {
            try {
                c13457M27208 = C11896.m27208(C21292.m48118(), true);
                if (c13457M27208.m30605() instanceof C23691) {
                    try {
                        c13457M27208.m30605().mo34289();
                    } catch (Exception e2) {
                        if (e2 instanceof C23021) {
                            C23021 c23021 = (C23021) e2;
                            str2 = "The MCP service cannot use the current signing key: " + c23021.m51406() + ". Log in to MT account " + c23021.m51407() + ", or choose another signing key in MT MCP Settings, then retry.";
                        } else {
                            str2 = "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry.";
                        }
                        throw m5482(abstractC17043, "APK_SIGN_ACCOUNT_REQUIRED", str2);
                    }
                } else if (c13457M27208.m30605().mo34294()) {
                    throw m5482(abstractC17043, "APK_SIGN_KEY_LOCKED", "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry.");
                }
            } catch (Exception e3) {
                throw m5482(abstractC17043, "APK_SIGN_KEY_MISSING", m5463(e3));
            }
        } else {
            c13457M27208 = null;
        }
        C13457 c13457 = c13457M27208;
        C20621 c20621M5480 = m5480(c16484, c20036);
        try {
            try {
                M38678 = abstractC17043.m38678(".mcp_unsigned");
                if (!z2) {
                    try {
                        if (ApplicationC21448.f67649.getBoolean("kasb", true)) {
                            z3 = true;
                        }
                    } catch (C5276 e4) {
                        e = e4;
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        throw m5467(abstractC17043, "APK_BUILD_FAILED", m5463(e));
                    } catch (Throwable th) {
                        th = th;
                        r4 = 0;
                        if (M38678 != 0) {
                            M38678.mo25503();
                        }
                        if (r4 != 0) {
                            r4.mo25503();
                        }
                        C17548.m39937();
                        throw th;
                    }
                }
                m5471(c16484, c20036, c20621M5480, (AbstractC17043) M38678, z3);
                if (z2) {
                    abstractC17043M38678 = abstractC17043.m38678(".mcp_signed");
                    try {
                        m5473((AbstractC17043) M38678, abstractC17043M38678, abstractC17043, c13457);
                        m5474(abstractC17043M38678, abstractC17043, z);
                    } catch (C5276 e6) {
                        throw e6;
                    } catch (Exception e7) {
                        e = e7;
                        throw m5467(abstractC17043, "APK_BUILD_FAILED", m5463(e));
                    }
                } else {
                    m5474(M38678, abstractC17043, z);
                    abstractC17043M38678 = null;
                }
                AbstractC17043 abstractC17044 = abstractC17043M38678;
                try {
                    C5954 c5954M5468 = m5468(c16484, c20036, c20621M5480, abstractC17043, c13457, c23191.f72869);
                    if (M38678.mo25094()) {
                        M38678.mo25503();
                    }
                    if (abstractC17044 != null && abstractC17044.mo25094()) {
                        abstractC17044.mo25503();
                    }
                    C17548.m39937();
                    return c5954M5468;
                } catch (C5276 e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                    throw m5467(abstractC17043, "APK_BUILD_FAILED", m5463(e));
                } catch (Throwable th2) {
                    th = th2;
                    r4 = abstractC17044;
                    if (M38678 != 0 && M38678.mo25094()) {
                        M38678.mo25503();
                    }
                    if (r4 != 0 && r4.mo25094()) {
                        r4.mo25503();
                    }
                    C17548.m39937();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (C5276 e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            M38678 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5474(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, boolean z) throws C5276, IOException {
        m5481(abstractC17044);
        if (z) {
            abstractC17043.m38659(abstractC17044, false, true, null);
            return;
        }
        try {
            abstractC17043.mo25509().mo10730(abstractC17044);
        } catch (C23750 e) {
            if (e.m52799() == EnumC23080.ALREADY_EXISTS) {
                throw C5276.m11407("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC17044.mo25505()));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m5481(AbstractC17043 abstractC17043) throws C5276 {
        EnumC5645 enumC5645;
        C9385 c9385M51035 = C23499.m52231().m51035();
        c9385M51035.m21857(abstractC17043.mo25505());
        c9385M51035.m21855(abstractC17043.mo25505());
        c9385M51035.m21857(abstractC17043.m38672().mo25505());
        C19247 c19247 = new C19247(C23499.m52231(), C23499.m52232());
        c19247.m43855(abstractC17043, new C19950(this, abstractC17043));
        EnumC5645 enumC5645M32962 = c19247.m43858(abstractC17043.m38669()).m32962();
        EnumC5645 enumC5646 = EnumC5645.MISSING;
        if (enumC5645M32962 == enumC5646 || enumC5645M32962 == (enumC5645 = EnumC5645.REGULAR)) {
            throw m5479(abstractC17043, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent must be an existing directory.");
        }
        EnumC5645 enumC5647 = EnumC5645.DIRECTORY;
        if (enumC5645M32962 != enumC5647) {
            throw m5467(abstractC17043, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent could not be verified as a directory.");
        }
        EnumC5645 enumC5645M32963 = c19247.m43858(abstractC17043.mo25505()).m32962();
        if (enumC5645M32963 == enumC5647) {
            throw m5479(abstractC17043, "OUTPUT_PATH_NOT_FILE", "Output path refers to a directory.");
        }
        if (enumC5645M32963 != enumC5646 && enumC5645M32963 != enumC5645) {
            throw m5467(abstractC17043, "OUTPUT_PATH_NOT_FILE", "Output must be a regular file or a missing file.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C5276 m5466(C3185 c3185, AbstractC17043 abstractC17043, String str, String str2, String str3) {
        if (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) {
            return m5479(abstractC17043, str, str2);
        }
        return m5467(abstractC17043, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[PHI: r16
      0x00bf: PHI (r16v1 java.util.HashMap) = (r16v3 java.util.HashMap), (r16v4 java.util.HashMap) binds: [B:39:0x00bd, B:33:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x004e, blocks: (B:13:0x0044, B:15:0x004a, B:28:0x008e, B:32:0x009e, B:38:0x00b3, B:46:0x00ca), top: B:108:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:11:0x003e, B:19:0x0054, B:20:0x005f, B:22:0x0065, B:25:0x0076, B:30:0x0092, B:36:0x00af, B:44:0x00c5, B:49:0x00cf, B:48:0x00cd), top: B:105:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f8 A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:51:0x00db, B:53:0x00f8, B:54:0x00fc, B:56:0x0106, B:57:0x010e, B:59:0x0114, B:60:0x0133, B:61:0x0137, B:63:0x013d, B:67:0x014a), top: B:103:0x00db }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ᩴۜۜ] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX INFO: renamed from: ֫ */
    public static void m5471(C16484 c16484, C20036 c20036, C20621 c20621, AbstractC17043 abstractC17043, boolean z) throws Throwable {
        Throwable th;
        C19561 c19561;
        Throwable th2;
        HashMap map;
        boolean z2;
        long length;
        HashMap map2 = c20621.f63688;
        HashMap map3 = new HashMap();
        ArrayList<C17352> arrayList = c20036.f60886;
        for (C17352 c17352 : arrayList) {
            if (c17352.f51743) {
                map3.put(c17352.f51742, c17352);
            }
        }
        HashSet hashSet = new HashSet(c20036.f60885);
        try {
            C19561 c19562 = new C19561(c16484.m37409());
            try {
                try {
                    C10844 c10844 = new C10844(abstractC17043);
                    try {
                        C16922 c16922M5469 = m5469(c19562, map3);
                        if (z) {
                            try {
                                if (c19562.m44460()) {
                                    c10844.m24990(c19562);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c20036 = c19562;
                                try {
                                    c10844.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        }
                        c10844.m24999();
                        for (C5738 c5738 : c19562.m44469()) {
                            if (!hashSet.contains(c5738.getName())) {
                                byte[] bArr = (byte[]) map2.get(c5738.getName());
                                C17352 c17353 = (C17352) map3.get(c5738.getName());
                                if (bArr == null && c17353 == null) {
                                    m5475(c19562, c10844, c5738, c16922M5469);
                                } else {
                                    String name = c5738.getName();
                                    int iM12748 = c5738.m12748();
                                    try {
                                        if (c16922M5469.f50093) {
                                            map = map3;
                                            z2 = name.toLowerCase().startsWith("lib/");
                                            if (z2) {
                                                iM12748 = 0;
                                            }
                                            c10844.m24992(iM12748);
                                            if (bArr != null) {
                                                length = bArr.length;
                                            } else {
                                                length = c17353.f51744;
                                            }
                                            C5738 c5739 = new C5738(c5738.getName());
                                            HashSet hashSet2 = hashSet;
                                            c19561 = c19562;
                                            c5739.setTime(c5738.getTime());
                                            c5739.m12752(c5738.m12782());
                                            c5739.m12786(c5738.getSize());
                                            c5739.m12786(length);
                                            c10844.m24987(c5739);
                                            if (bArr != null) {
                                                c10844.write(bArr);
                                            } else {
                                                m5470(c10844, c17353);
                                            }
                                            c19562 = c19561;
                                            hashSet = hashSet2;
                                            map3 = map;
                                        } else {
                                            map = map3;
                                        }
                                        c5739.setTime(c5738.getTime());
                                        c5739.m12752(c5738.m12782());
                                        c5739.m12786(c5738.getSize());
                                        c5739.m12786(length);
                                        c10844.m24987(c5739);
                                        if (bArr != null) {
                                            c10844.write(bArr);
                                        } else {
                                            m5470(c10844, c17353);
                                        }
                                        c19562 = c19561;
                                        hashSet = hashSet2;
                                        map3 = map;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        c20036 = c19561;
                                        c10844.close();
                                        throw th2;
                                    }
                                    if (!c16922M5469.f50092 || !name.toLowerCase().endsWith(".dex")) {
                                    }
                                    if (z2) {
                                        iM12748 = 0;
                                    }
                                    c10844.m24992(iM12748);
                                    if (bArr != null) {
                                        length = bArr.length;
                                    } else {
                                        length = c17353.f51744;
                                    }
                                    C5738 c57310 = new C5738(c5738.getName());
                                    HashSet hashSet3 = hashSet;
                                    c19561 = c19562;
                                }
                            }
                        }
                        c19561 = c19562;
                        for (String str : c20621.f63690) {
                            c10844.m24992(C22959.m51283(str, c16922M5469));
                            c10844.m24987(new C5738(str));
                            c10844.write((byte[]) map2.get(str));
                        }
                        for (C17352 c17354 : arrayList) {
                            boolean z3 = c17354.f51743;
                            String str2 = c17354.f51742;
                            if (!z3) {
                                c10844.m24992(C22959.m51283(str2, c16922M5469));
                                long j = c17354.f51744;
                                C5738 c57311 = new C5738(str2);
                                c57311.m12786(j);
                                c10844.m24987(c57311);
                                m5470(c10844, c17354);
                            }
                        }
                        c10844.close();
                        c19561.close();
                    } catch (Throwable th6) {
                        th = th6;
                        c19561 = c19562;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = th;
                    try {
                        c20036.close();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c20036 = c19562;
                th = th;
                c20036.close();
                throw th;
            }
        } catch (IOException e) {
            throw m5467(abstractC17043, "APK_WRITE_FAILED", m5463(e));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16922 m5469(C19561 c19561, HashMap map) throws IOException {
        C17352 c17352 = (C17352) map.get("AndroidManifest.xml");
        if (c17352 != null) {
            byte[] bArr = c17352.f51741;
            if (bArr != null) {
                C16922 c16922 = new C16922();
                c16922.m38500(bArr);
                return c16922;
            }
            AbstractC17043 abstractC17043 = c17352.f51745;
            if (abstractC17043 != null) {
                long j = c17352.f51744;
                if (j >= 0) {
                    try {
                        if (j > 5242880) {
                            return new C16922();
                        }
                        byte[] bArrM5478 = m5478(abstractC17043);
                        if (bArrM5478 == null) {
                            return new C16922();
                        }
                        C16922 c16923 = new C16922();
                        c16923.m38500(bArrM5478);
                        return c16923;
                    } catch (IOException e) {
                        throw new IOException("Failed to inspect changed APK manifest content.", e);
                    } catch (RuntimeException e2) {
                        if (!m5476(e2)) {
                            throw e2;
                        }
                        throw new IOException("Failed to inspect changed APK manifest content.", e2);
                    }
                }
            }
            throw new IOException("Changed manifest data source is missing.");
        }
        C16922 c16924 = new C16922();
        c16924.m38499(c19561);
        return c16924;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m5478(AbstractC17043 abstractC17043) throws IOException {
        InputStream inputStreamMo29987 = abstractC17043.mo29987();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                do {
                    int i2 = inputStreamMo29987.read(bArr, 0, Math.min(65536, 5242881 - i));
                    if (i2 < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamMo29987.close();
                        return byteArray;
                    }
                    if (i2 == 0) {
                        int i3 = inputStreamMo29987.read();
                        if (i3 < 0) {
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStreamMo29987.close();
                            return byteArray2;
                        }
                        byteArrayOutputStream.write(i3);
                        i++;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                        i += i2;
                    }
                } while (i <= 5242880);
                byteArrayOutputStream.close();
                inputStreamMo29987.close();
                return null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5475(C19561 c19561, C10844 c10844, C5738 c5738, C16922 c16922) throws IOException {
        if (C22959.m51286(c5738, c16922)) {
            C22959.m51285(c19561, c10844, c5738, c16922, null);
            return;
        }
        if ((c5738.m12777() & 8) == 0) {
            c10844.m24988(c5738, c19561);
            return;
        }
        c10844.m24992(c5738.m12748());
        C5738 c5739 = new C5738(c5738.getName());
        c5739.setTime(c5738.getTime());
        c5739.m12752(c5738.m12782());
        c5739.m12786(c5738.getSize());
        c10844.m24987(c5739);
        InputStream inputStreamM44448 = c19561.m44448(c5738);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM44448.read(bArr);
                if (i != -1) {
                    c10844.write(bArr, 0, i);
                } else {
                    inputStreamM44448.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamM44448.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5470(C10844 c10844, C17352 c17352) throws IOException {
        byte[] bArr = c17352.f51741;
        long j = c17352.f51744;
        if (bArr != null) {
            if (j != bArr.length) {
                throw new IOException("Changed entry size does not match its byte array.");
            }
            c10844.write(bArr);
            return;
        }
        AbstractC17043 abstractC17043 = c17352.f51745;
        if (abstractC17043 == null) {
            throw new IOException("Changed entry data source is missing.");
        }
        try {
            InputStream inputStreamMo29987 = abstractC17043.mo29987();
            try {
                byte[] bArr2 = new byte[65536];
                long jM5462 = 0;
                while (true) {
                    int i = inputStreamMo29987.read(bArr2);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = inputStreamMo29987.read();
                        if (i2 < 0) {
                            break;
                        }
                        c10844.write(i2);
                        jM5462 = m5462(1, jM5462);
                    } else {
                        c10844.write(bArr2, 0, i);
                        jM5462 = m5462(i, jM5462);
                    }
                }
                if (jM5462 != j) {
                    throw new IOException("Changed entry size changed after the build snapshot.");
                }
                inputStreamMo29987.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo29987 != null) {
                    try {
                        inputStreamMo29987.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IOException("Failed to stream changed APK entry content.", e);
        } catch (RuntimeException e2) {
            if (!m5476(e2)) {
                throw e2;
            }
            throw new IOException("Failed to stream changed APK entry content.", e2);
        }
        throw new IOException("Failed to stream changed APK entry content.", e);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16681 m5484(C16484 c16484, C20036 c20036) throws C5276 {
        ArrayList arrayList = c20036.f60887;
        byte[] bArr = new byte[65536];
        for (C17352 c17352 : c20036.f60886) {
            AbstractC17043 abstractC17043 = c17352.f51745;
            if (abstractC17043 != null) {
                try {
                    InputStream inputStreamMo29987 = abstractC17043.mo29987();
                    long jM5462 = 0;
                    while (true) {
                        try {
                            int i = inputStreamMo29987.read(bArr);
                            if (i < 0) {
                                break;
                            }
                            if (i == 0) {
                                if (inputStreamMo29987.read() < 0) {
                                    break;
                                }
                                jM5462 = m5462(1, jM5462);
                            } else {
                                jM5462 = m5462(i, jM5462);
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo29987 == null) {
                                throw th;
                            }
                            try {
                                inputStreamMo29987.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (jM5462 != c17352.f51744) {
                        throw new IOException("Changed entry size changed after the build snapshot.");
                    }
                    inputStreamMo29987.close();
                } catch (IOException unused) {
                    throw m5467((AbstractC17043) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                } catch (RuntimeException e) {
                    if (!m5476(e)) {
                        throw e;
                    }
                    throw m5467((AbstractC17043) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                }
                throw m5467((AbstractC17043) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
            }
        }
        C20621 c20621M5480 = m5480(c16484, c20036);
        String str = c16484.f48416;
        String str2 = c20036.f60883;
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(new ArrayList(3), "edit_session_prepare", "entry_overlay_encode", "dex_merge");
        return new C16681(str, str2, true, 0, 0, arrayList2, "passed", new ArrayList(c20621M5480.f63689), arrayList.size() + c20036.f60889.size(), arrayList.size(), new ArrayList(c20036.f60882), new ArrayList(c20036.f60888), new ArrayList(c20036.f60885));
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m5462(int i, long j) throws IOException {
        long j2 = i;
        if (j <= 9007199254740991L - j2) {
            return j + j2;
        }
        throw new IOException("Changed entry exceeds the supported size range.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m5476(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ */
    public static C20621 m5480(C16484 c16484, C20036 c20036) throws C5276 {
        C2514 c2514;
        LinkedHashSet linkedHashSet;
        int i;
        String str;
        C2514 c2515;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet2;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2514 c2516;
        c16484 = c16484;
        C20036 c20037 = c20036;
        Iterator it = c20037.f60886.iterator();
        while (it.hasNext()) {
            if (C19831.m45076(((C17352) it.next()).f51742) > 0) {
                throw C5276.m11410("DEX_ENTRY_RESERVED", "Standard dex entries can only be changed through dex class edits.");
            }
        }
        Iterator it2 = c20037.f60885.iterator();
        while (it2.hasNext()) {
            if (C19831.m45076((String) it2.next()) > 0) {
                throw C5276.m11410("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str3 : m5464(c16484.f48423)) {
            int iM45076 = C19831.m45076(str3);
            if (iM45076 > 0) {
                linkedHashMap2.put(str3, C2514.m3660(iM45076, str3));
            }
        }
        for (C4613 c4613 : c20037.f60889) {
            m5465(linkedHashMap2, c4613.f10342).f4087.put(c4613.f10341, c4613);
        }
        for (C10648 c10648 : c20037.f60887) {
            m5465(linkedHashMap2, c10648.f29442).f4085.add(c10648.f29441);
        }
        C23303 c23303 = new C23303();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = m5464(c20037.f60884).iterator();
        while (true) {
            String str4 = "DEX_POOL_OVERFLOW";
            if (it3.hasNext()) {
                C2514 c2514M5465 = m5465(linkedHashMap2, (String) it3.next());
                try {
                    m5472(c16484, c20037, c23303, c2514M5465);
                } catch (C5276 e) {
                    if (!"DEX_POOL_OVERFLOW".equals(e.f12413)) {
                        throw e;
                    }
                    c2514M5465.f4081 = true;
                    arrayList2.add(c2514M5465);
                }
            } else {
                Iterator it4 = arrayList2.iterator();
                String str5 = c20037;
                while (true) {
                    String str6 = "DEX_BUILD_FAILED";
                    if (!it4.hasNext()) {
                        HashMap map = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (C2514 c2517 : linkedHashMap2.values()) {
                            boolean z = c2517.f4084;
                            String str7 = c2517.f4083;
                            if (z) {
                                byte[] bArr = c2517.f4082;
                                if (bArr == null) {
                                    throw C5276.m11410("DEX_BUILD_FAILED", "Dex merge plan was not materialized: " + str7);
                                }
                                map.put(str7, bArr);
                                arrayList3.add(str7);
                                if (!c2517.f4080) {
                                    arrayList4.add(str7);
                                }
                            }
                        }
                        C8150.sort(arrayList3, C19831.m45077());
                        C8150.sort(arrayList4, C19831.m45077());
                        return new C20621(map, arrayList3, arrayList4);
                    }
                    C2514 c2518 = (C2514) it4.next();
                    LinkedHashMap linkedHashMap3 = c2518.f4087;
                    LinkedHashSet linkedHashSet3 = c2518.f4085;
                    String str8 = c2518.f4083;
                    ArrayList arrayList5 = new ArrayList(linkedHashMap3.values());
                    if (arrayList5.isEmpty()) {
                        throw C5276.m11405(str4, "Dex method or field pool overflow.");
                    }
                    try {
                        try {
                            C20765 c20765 = new C20765(C9873.m23150(c2518.f4079));
                            Iterator it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                c20765.m46900((InterfaceC10509) ((C4613) it5.next()).f10340);
                            }
                            try {
                                if (c20765.m50872()) {
                                    throw C5276.m11405(str4, "Dex method or field pool overflow.");
                                }
                                C22776 c22776 = new C22776();
                                c20765.m50870(c22776);
                                C12455 c12455M28672 = C12455.m28672(str8 + "#relocation-group", c22776.m50961());
                                if (!c12455M28672.m28675(65536)) {
                                    throw C5276.m11405(str4, "Dex method or field pool overflow.");
                                }
                                Iterator it6 = linkedHashMap2.values().iterator();
                                String str9 = str4;
                                C2514 c2514M3659 = null;
                                int i7 = Integer.MAX_VALUE;
                                Iterator it7 = it4;
                                int i8 = Integer.MAX_VALUE;
                                while (it6.hasNext()) {
                                    it6 = it6;
                                    C2514 c2519 = (C2514) it6.next();
                                    if (c2519 == c2518 || c2519.f4081) {
                                        c23303 = c23303;
                                        i = i8;
                                        str = str6;
                                        c2515 = c2518;
                                        arrayList = arrayList5;
                                        linkedHashMap = linkedHashMap3;
                                        linkedHashSet2 = linkedHashSet3;
                                        str2 = str8;
                                        i8 = i;
                                        c23303 = c23303;
                                        str6 = str;
                                        linkedHashSet3 = linkedHashSet2;
                                        str8 = str2;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList5 = arrayList;
                                        linkedHashMap2 = linkedHashMap2;
                                        c2518 = c2515;
                                    } else {
                                        C12455 c12455M28673 = c2519.f4086;
                                        if (c12455M28673 == null) {
                                            if (c2519.f4080 && c2519.f4087.isEmpty() && c2519.f4085.isEmpty()) {
                                                try {
                                                    String str10 = c2519.f4083;
                                                    try {
                                                        c12455M28673 = C12455.m28673(c16484.m37406(str10), str10);
                                                        c2519.f4086 = c12455M28673;
                                                        c2519.f4079 = c12455M28673.f34844;
                                                        c23303 = c23303;
                                                    } catch (IOException e2) {
                                                        try {
                                                            throw m5467(c16484.m37406(str10), "DEX_COUNTS_UNAVAILABLE", m5463(e2));
                                                        } catch (C5276 unused) {
                                                        }
                                                    }
                                                } catch (C5276 unused2) {
                                                }
                                            }
                                            c12455M28673 = null;
                                        } else {
                                            c23303 = c23303;
                                        }
                                        if (c12455M28673 != null) {
                                            int i9 = c12455M28673.f34846;
                                            int i10 = c12455M28673.f34850;
                                            str = str6;
                                            int i11 = c12455M28673.f34848;
                                            linkedHashSet2 = linkedHashSet3;
                                            int i12 = c12455M28673.f34845;
                                            int i13 = c12455M28673.f34849;
                                            str2 = str8;
                                            int i14 = c12455M28673.f34847;
                                            linkedHashMap = linkedHashMap3;
                                            arrayList = arrayList5;
                                            if (c2518.f4079 > c2519.f4079 || !c12455M28673.m28675(43690)) {
                                                linkedHashMap2 = linkedHashMap2;
                                                i = i8;
                                                c2515 = c2518;
                                                i8 = i;
                                                c23303 = c23303;
                                                str6 = str;
                                                linkedHashSet3 = linkedHashSet2;
                                                str8 = str2;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList5 = arrayList;
                                                linkedHashMap2 = linkedHashMap2;
                                                c2518 = c2515;
                                            } else {
                                                int i15 = c12455M28672.f34850;
                                                int i16 = c12455M28672.f34846;
                                                int i17 = c12455M28672.f34848;
                                                linkedHashMap2 = linkedHashMap2;
                                                int i18 = c12455M28672.f34845;
                                                c2515 = c2518;
                                                int i19 = c12455M28672.f34849;
                                                int i20 = c12455M28672.f34847;
                                                int i21 = i15 + i10;
                                                int i22 = i8;
                                                if (i21 > 65536 || (i2 = i9 + i16) > 65536 || (i3 = i14 + i20) > 65536 || (i4 = i13 + i19) > 65536 || (i5 = i12 + i18) > 65536 || (i6 = i11 + i17) > 65536) {
                                                    i = i22;
                                                    i8 = i;
                                                    c23303 = c23303;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c2518 = c2515;
                                                } else {
                                                    int iMin = Math.min(Math.min(Math.min(Math.min(Math.min(65536 - i21, 65536 - i2), 65536 - i3), 65536 - i4), 65536 - i5), 65536 - i6);
                                                    i8 = (((((((((WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - (i10 + c12455M28672.f34850)) - i2) + 65536) - i3) + 65536) - i4) + 65536) - i5) + 65536) - i6;
                                                    if (c2514M3659 == null || iMin < i7 || (iMin == i7 && i8 < i22)) {
                                                        c2516 = c2519;
                                                    } else {
                                                        if (iMin == i7 && i8 == i22) {
                                                            c2516 = c2519;
                                                            if (c2516.f4088 < c2514M3659.f4088) {
                                                            }
                                                            c23303 = c23303;
                                                            str6 = str;
                                                            linkedHashSet3 = linkedHashSet2;
                                                            str8 = str2;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList5 = arrayList;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            c2518 = c2515;
                                                        }
                                                        i8 = i22;
                                                        c23303 = c23303;
                                                        str6 = str;
                                                        linkedHashSet3 = linkedHashSet2;
                                                        str8 = str2;
                                                        linkedHashMap3 = linkedHashMap;
                                                        arrayList5 = arrayList;
                                                        linkedHashMap2 = linkedHashMap2;
                                                        c2518 = c2515;
                                                    }
                                                    i7 = iMin;
                                                    c2514M3659 = c2516;
                                                    c23303 = c23303;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c2518 = c2515;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            str = str6;
                                            c2515 = c2518;
                                            arrayList = arrayList5;
                                            linkedHashMap = linkedHashMap3;
                                            linkedHashSet2 = linkedHashSet3;
                                            str2 = str8;
                                            i8 = i;
                                            c23303 = c23303;
                                            str6 = str;
                                            linkedHashSet3 = linkedHashSet2;
                                            str8 = str2;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList5 = arrayList;
                                            linkedHashMap2 = linkedHashMap2;
                                            c2518 = c2515;
                                        }
                                    }
                                }
                                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                C23303 c23304 = c23303;
                                String str11 = str6;
                                C2514 c25110 = c2518;
                                ArrayList<C4613> arrayList6 = arrayList5;
                                AbstractMap abstractMap = linkedHashMap3;
                                LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                String str12 = str8;
                                if (c2514M3659 == null) {
                                    c2514 = c25110;
                                    int i23 = c2514.f4079;
                                    Iterator it8 = linkedHashMap4.values().iterator();
                                    int iMax = 1;
                                    while (it8.hasNext()) {
                                        iMax = Math.max(iMax, ((C2514) it8.next()).f4088 + 1);
                                    }
                                    if (iMax <= 0) {
                                        throw new IllegalArgumentException("Invalid dex index");
                                    }
                                    String strM44906 = iMax == 1 ? "classes.dex" : C19768.m44906(iMax, "classes", ".dex");
                                    c2514M3659 = C2514.m3659(iMax, i23, strM44906);
                                    linkedHashMap2 = linkedHashMap4;
                                    linkedHashMap2.put(strM44906, c2514M3659);
                                } else {
                                    linkedHashMap2 = linkedHashMap4;
                                    c2514 = c25110;
                                }
                                for (C4613 c4614 : arrayList6) {
                                    String str13 = c4614.f10341;
                                    AbstractMap abstractMap2 = abstractMap;
                                    abstractMap2.remove(str13);
                                    String str14 = str12;
                                    try {
                                        Iterator it9 = ((AbstractC20050) c16484.m37408(str14).mo29500()).iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                linkedHashSet = linkedHashSet4;
                                                break;
                                            }
                                            if (str13.equals(((InterfaceC10509) it9.next()).getType())) {
                                                linkedHashSet = linkedHashSet4;
                                                linkedHashSet.add(str13);
                                                break;
                                            }
                                        }
                                        c2514M3659.f4087.put(str13, new C4613(str13, c2514M3659.f4083, c4614.f10340, c4614.f10343));
                                        abstractMap = abstractMap2;
                                        str12 = str14;
                                        linkedHashSet4 = linkedHashSet;
                                    } catch (Exception e3) {
                                        throw m5467(c16484.m37406(str14), str11, m5463(e3));
                                    } catch (OutOfMemoryError unused3) {
                                        throw C19553.m44411();
                                    }
                                }
                                c2514.f4084 = (abstractMap.isEmpty() && linkedHashSet4.isEmpty()) ? false : true;
                                c2514.f4082 = null;
                                c2514.f4086 = null;
                                c2514M3659.f4084 = true;
                                c2514M3659.f4082 = null;
                                c2514M3659.f4086 = null;
                                c2514.f4081 = false;
                                if (c2514.f4084) {
                                    m5472(c16484, c20036, c23304, c2514);
                                }
                                m5472(c16484, c20036, c23304, c2514M3659);
                                str5 = c20036;
                                c23303 = c23304;
                                c16484 = c16484;
                                it4 = it7;
                                str4 = str9;
                            } catch (Exception e4) {
                                e = e4;
                                throw m5467((AbstractC17043) null, str5, m5463(e));
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str5 = "DEX_BUILD_FAILED";
                        }
                    } catch (OutOfMemoryError unused4) {
                        throw C19553.m44411();
                    } catch (C5276 e6) {
                        throw e6;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2514 m5465(LinkedHashMap linkedHashMap, String str) throws C5276 {
        C2514 c2514 = (C2514) linkedHashMap.get(str);
        if (c2514 != null) {
            return c2514;
        }
        throw C5276.m11410("DEX_BUILD_FAILED", "Dex entry is unavailable: " + str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5472(C16484 c16484, C20036 c20036, C23303 c23303, C2514 c2514) throws C5276 {
        String strM24016;
        AbstractC17043 abstractC17043 = c20036.f60890;
        String str = c2514.f4083;
        if (c2514.f4080) {
            try {
                C10371 c10371 = c16484.f48410;
                AbstractC17043 abstractC17043M37406 = c16484.m37406(str);
                c10371.getClass();
                strM24016 = C10371.m24016(abstractC17043M37406);
            } catch (IOException e) {
                throw m5467(c16484.m37406(str), "DEX_BUILD_FAILED", m5463(e));
            }
        } else {
            strM24016 = "<mcp-new-dex>";
        }
        C22633 c22633M51896 = C23303.m51896(str, strM24016, new ArrayList(c2514.f4087.values()), new ArrayList(c2514.f4085));
        try {
            try {
                byte[] bArrM51899 = C23303.m51899(abstractC17043, c22633M51896);
                if (bArrM51899 == null) {
                    bArrM51899 = m5477(c16484, c2514);
                    try {
                        C23303.m51898(abstractC17043, c22633M51896, bArrM51899);
                    } catch (IOException unused) {
                    }
                }
                c2514.f4082 = bArrM51899;
                C12455 c12455M28672 = C12455.m28672(str, bArrM51899);
                c2514.f4086 = c12455M28672;
                c2514.f4079 = c12455M28672.f34844;
                c2514.f4084 = true;
            } catch (OutOfMemoryError unused2) {
                throw C19553.m44411();
            }
        } catch (IOException e2) {
            throw m5467((AbstractC17043) null, "DEX_BUILD_FAILED", m5463(e2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m5477(C16484 c16484, C2514 c2514) throws C5276 {
        C20765 c20765;
        String str = c2514.f4083;
        boolean z = c2514.f4080;
        LinkedHashMap linkedHashMap = c2514.f4087;
        try {
            if (z) {
                C14645 c14645M37408 = c16484.m37408(str);
                c2514.f4079 = c14645M37408.mo29499().f27379;
                c20765 = new C20765(c14645M37408.mo29499());
                for (InterfaceC10509 interfaceC10509 : (AbstractC20050) c14645M37408.mo29500()) {
                    String type = interfaceC10509.getType();
                    if (!c2514.f4085.contains(type) && !linkedHashMap.containsKey(type)) {
                        c20765.m46900(interfaceC10509);
                    }
                }
            } else {
                c20765 = new C20765(C9873.m23150(c2514.f4079));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c20765.m46900((InterfaceC10509) ((C4613) it.next()).f10340);
            }
            if (c20765.m50872()) {
                throw C5276.m11405("DEX_POOL_OVERFLOW", "Dex method or field pool overflow.");
            }
            C22776 c22776 = new C22776();
            c20765.m50870(c22776);
            return c22776.m50961();
        } catch (C5276 e) {
            throw e;
        } catch (Exception e2) {
            throw m5467(z ? c16484.m37406(str) : null, "DEX_BUILD_FAILED", m5463(e2));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m5464(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        C8150.sort(arrayList2, C19831.m45077());
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5473(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044, AbstractC17043 abstractC17045, C13457 c13457) throws C5276 {
        try {
            C8092.m18775(abstractC17043, abstractC17044, c13457, new C7209());
        } catch (Exception e) {
            throw m5467(abstractC17045, "APK_SIGN_FAILED", m5463(e));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5954 m5468(C16484 c16484, C20036 c20036, C20621 c20621, AbstractC17043 abstractC17043, C13457 c13457, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = c20036.f60887;
        if (z) {
            EnumC10104 enumC10104M30603 = c13457.m30603();
            ArrayList arrayList3 = new ArrayList();
            if (enumC10104M30603.f28038) {
                arrayList3.add("V1");
            }
            if (enumC10104M30603.f28039) {
                arrayList3.add("V2");
            }
            if (enumC10104M30603.f28037) {
                arrayList3.add("V3");
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        String str = c16484.f48416;
        String str2 = c20036.f60883;
        abstractC17043.mo25505();
        String strMo25505 = abstractC17043.mo25505();
        String strMo25506 = abstractC17043.mo25505();
        String name = abstractC17043.getName();
        long jMo25101 = abstractC17043.mo25101();
        C10271 c10271M51397 = C23012.m51397(abstractC17043);
        if (z) {
            Collections.addAll(new ArrayList(6), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "apk_sign", "publish");
        } else {
            Collections.addAll(new ArrayList(5), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "publish");
        }
        return new C5954(str, str2, strMo25505, strMo25506, name, jMo25101, z, arrayList, c10271M51397, new ArrayList(c20621.f63689), arrayList2.size() + c20036.f60889.size(), arrayList2.size(), new ArrayList(c20036.f60882), new ArrayList(c20036.f60888), new ArrayList(c20036.f60885));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m5479(AbstractC17043 abstractC17043, String str, String str2) {
        return C5276.m11407(str, str2, "warning", JSON.array(), JSON.object().add("outputPath", abstractC17043.mo25505()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m5467(AbstractC17043 abstractC17043, String str, String str2) {
        return C5276.m11411(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", abstractC17043 == null ? JSON.NULL : JSON.value(abstractC17043.mo25505())));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5276 m5482(AbstractC17043 abstractC17043, String str, String str2) {
        return C5276.m11407(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", JSON.value(abstractC17043.mo25505())));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5463(Exception exc) {
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }
}
