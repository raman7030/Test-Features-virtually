package l;

import bin.mt.json.JSON;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C0859 implements InterfaceC10280 {
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3773 m3169(C14852 c14852, C21909 c21909, C18590 c18590, String str) throws Throwable {
        ?? M36520;
        AbstractC15440 abstractC15440M36526;
        C11667 c11667M25191;
        String str2;
        AbstractC15440 abstractC15440M36520;
        String str3 = c14852.f45311;
        String str4 = c18590.f57660;
        String string = c21909.f70152;
        boolean z = c21909.f70153;
        boolean z2 = c21909.f70155;
        boolean z3 = false;
        if (string.startsWith("/")) {
            abstractC15440M36526 = C16999.m39866(string, new String[0]);
        } else {
            AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
            try {
                boolean zIsEmpty = string.isEmpty();
                M36520 = zIsEmpty;
                if (zIsEmpty) {
                    StringBuilder sb = new StringBuilder();
                    String strM36517 = C16999.m39866(str3, new String[0]).m36517();
                    StringBuilder sb2 = new StringBuilder(strM36517.length());
                    for (int i = 0; i < strM36517.length(); i++) {
                        char cCharAt = strM36517.charAt(i);
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
                    M36520 = str5;
                }
                abstractC15440M36526 = abstractC15440M39866.m36526(string);
            } catch (Exception e) {
                throw m3153((AbstractC15440) null, "OUTPUT_PATH_RESOLVE_FAILED", m3149(e));
            }
        }
        AbstractC15440 abstractC15440 = abstractC15440M36526;
        m3167(abstractC15440);
        if (abstractC15440.equals(C16999.m39866(str3, new String[0]))) {
            throw m3153(abstractC15440, "OUTPUT_PATH_IS_SOURCE_APK", "outputName must not resolve to the source APK.");
        }
        if (!abstractC15440.m36514().mo27924()) {
            throw m3153(abstractC15440, "OUTPUT_DIRECTORY_UNWRITABLE", "Output directory is not writable.");
        }
        if (abstractC15440.mo23120() && !z) {
            throw C3059.m9365("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC15440.mo23554()));
        }
        ?? r4 = 1;
        if (z2) {
            try {
                c11667M25191 = C10025.m25191(C19911.m45806(), true);
                if (c11667M25191.m28557() instanceof C22435) {
                    try {
                        c11667M25191.m28557().mo32190();
                    } catch (Exception e2) {
                        if (e2 instanceof C21730) {
                            C21730 c21730 = (C21730) e2;
                            str2 = "The MCP service cannot use the current signing key: " + c21730.m49057() + ". Log in to MT account " + c21730.m49058() + ", or choose another signing key in MT MCP Settings, then retry.";
                        } else {
                            str2 = "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry.";
                        }
                        throw m3168(abstractC15440, "APK_SIGN_ACCOUNT_REQUIRED", str2);
                    }
                } else if (c11667M25191.m28557().mo32195()) {
                    throw m3168(abstractC15440, "APK_SIGN_KEY_LOCKED", "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry.");
                }
            } catch (Exception e3) {
                throw m3168(abstractC15440, "APK_SIGN_KEY_MISSING", m3149(e3));
            }
        } else {
            c11667M25191 = null;
        }
        C11667 c11667 = c11667M25191;
        C19205 c19205M3166 = m3166(c14852, c18590);
        try {
            try {
                M36520 = abstractC15440.m36520(".mcp_unsigned");
                if (!z2) {
                    try {
                        if (ApplicationC20075.f65008.getBoolean("kasb", true)) {
                            z3 = true;
                        }
                    } catch (C3059 e4) {
                        e = e4;
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        throw m3153(abstractC15440, "APK_BUILD_FAILED", m3149(e));
                    } catch (Throwable th) {
                        th = th;
                        r4 = 0;
                        if (M36520 != 0) {
                            M36520.mo23552();
                        }
                        if (r4 != 0) {
                            r4.mo23552();
                        }
                        C15972.m37753();
                        throw th;
                    }
                }
                m3157(c14852, c18590, c19205M3166, (AbstractC15440) M36520, z3);
                if (z2) {
                    abstractC15440M36520 = abstractC15440.m36520(".mcp_signed");
                    try {
                        m3159((AbstractC15440) M36520, abstractC15440M36520, abstractC15440, c11667);
                        m3160(abstractC15440M36520, abstractC15440, z);
                    } catch (C3059 e6) {
                        throw e6;
                    } catch (Exception e7) {
                        e = e7;
                        throw m3153(abstractC15440, "APK_BUILD_FAILED", m3149(e));
                    }
                } else {
                    m3160(M36520, abstractC15440, z);
                    abstractC15440M36520 = null;
                }
                AbstractC15440 abstractC15441 = abstractC15440M36520;
                try {
                    C3773 c3773M3154 = m3154(c14852, c18590, c19205M3166, abstractC15440, c11667, c21909.f70155);
                    if (M36520.mo23120()) {
                        M36520.mo23552();
                    }
                    if (abstractC15441 != null && abstractC15441.mo23120()) {
                        abstractC15441.mo23552();
                    }
                    C15972.m37753();
                    return c3773M3154;
                } catch (C3059 e8) {
                    throw e8;
                } catch (Exception e9) {
                    e = e9;
                    throw m3153(abstractC15440, "APK_BUILD_FAILED", m3149(e));
                } catch (Throwable th2) {
                    th = th2;
                    r4 = abstractC15441;
                    if (M36520 != 0 && M36520.mo23120()) {
                        M36520.mo23552();
                    }
                    if (r4 != 0 && r4.mo23120()) {
                        r4.mo23552();
                    }
                    C15972.m37753();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (C3059 e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            M36520 = 0;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3160(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, boolean z) throws C3059, IOException {
        m3167(abstractC15441);
        if (z) {
            abstractC15440.m36501(abstractC15441, false, true, null);
            return;
        }
        try {
            abstractC15440.mo23558().mo8670(abstractC15441);
        } catch (C22497 e) {
            if (e.m50458() == EnumC21792.ALREADY_EXISTS) {
                throw C3059.m9365("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC15441.mo23554()));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3167(AbstractC15440 abstractC15440) throws C3059 {
        EnumC3447 enumC3447;
        C7383 c7383M48690 = C22233.m49903().m48690();
        c7383M48690.m19884(abstractC15440.mo23554());
        c7383M48690.m19882(abstractC15440.mo23554());
        c7383M48690.m19884(abstractC15440.m36514().mo23554());
        C17760 c17760 = new C17760(C22233.m49903(), C22233.m49904());
        c17760.m41610(abstractC15440, new C18499(this, abstractC15440));
        EnumC3447 enumC3447M30885 = c17760.m41613(abstractC15440.m36511()).m30885();
        EnumC3447 enumC3448 = EnumC3447.MISSING;
        if (enumC3447M30885 == enumC3448 || enumC3447M30885 == (enumC3447 = EnumC3447.REGULAR)) {
            throw m3165(abstractC15440, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent must be an existing directory.");
        }
        EnumC3447 enumC3449 = EnumC3447.DIRECTORY;
        if (enumC3447M30885 != enumC3449) {
            throw m3153(abstractC15440, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent could not be verified as a directory.");
        }
        EnumC3447 enumC3447M30886 = c17760.m41613(abstractC15440.mo23554()).m30885();
        if (enumC3447M30886 == enumC3449) {
            throw m3165(abstractC15440, "OUTPUT_PATH_NOT_FILE", "Output path refers to a directory.");
        }
        if (enumC3447M30886 != enumC3448 && enumC3447M30886 != enumC3447) {
            throw m3153(abstractC15440, "OUTPUT_PATH_NOT_FILE", "Output must be a regular file or a missing file.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3059 m3152(C0859 c0859, AbstractC15440 abstractC15440, String str, String str2, String str3) {
        if (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) {
            return m3165(abstractC15440, str, str2);
        }
        return m3153(abstractC15440, str, str2);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3157(C14852 c14852, C18590 c18590, C19205 c19205, AbstractC15440 abstractC15440, boolean z) throws Throwable {
        Throwable th;
        C18090 c18090;
        Throwable th2;
        HashMap map;
        boolean z2;
        long length;
        HashMap map2 = c19205.f60457;
        HashMap map3 = new HashMap();
        ArrayList<C15766> arrayList = c18590.f57663;
        for (C15766 c15766 : arrayList) {
            if (c15766.f48604) {
                map3.put(c15766.f48603, c15766);
            }
        }
        HashSet hashSet = new HashSet(c18590.f57662);
        try {
            C18090 c18091 = new C18090(c14852.m35253());
            try {
                try {
                    C8918 c8918 = new C8918(abstractC15440);
                    try {
                        C15313 c15313M3155 = m3155(c18091, map3);
                        if (z) {
                            try {
                                if (c18091.m42201()) {
                                    c8918.m23016(c18091);
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                c18590 = c18091;
                                try {
                                    c8918.close();
                                    throw th2;
                                } catch (Throwable th4) {
                                    th2.addSuppressed(th4);
                                    throw th2;
                                }
                            }
                        }
                        c8918.m23025();
                        for (C3545 c3545 : c18091.m42210()) {
                            if (!hashSet.contains(c3545.getName())) {
                                byte[] bArr = (byte[]) map2.get(c3545.getName());
                                C15766 c15767 = (C15766) map3.get(c3545.getName());
                                if (bArr == null && c15767 == null) {
                                    m3161(c18091, c8918, c3545, c15313M3155);
                                } else {
                                    String name = c3545.getName();
                                    int iM10767 = c3545.m10767();
                                    try {
                                        if (c15313M3155.f46967) {
                                            map = map3;
                                            z2 = name.toLowerCase().startsWith("lib/");
                                            if (z2) {
                                                iM10767 = 0;
                                            }
                                            c8918.m23018(iM10767);
                                            if (bArr != null) {
                                                length = bArr.length;
                                            } else {
                                                length = c15767.f48605;
                                            }
                                            C3545 c3546 = new C3545(c3545.getName());
                                            HashSet hashSet2 = hashSet;
                                            c18090 = c18091;
                                            c3546.setTime(c3545.getTime());
                                            c3546.m10771(c3545.m10801());
                                            c3546.m10805(c3545.getSize());
                                            c3546.m10805(length);
                                            c8918.m23013(c3546);
                                            if (bArr != null) {
                                                c8918.write(bArr);
                                            } else {
                                                m3156(c8918, c15767);
                                            }
                                            c18091 = c18090;
                                            hashSet = hashSet2;
                                            map3 = map;
                                        } else {
                                            map = map3;
                                        }
                                        c3546.setTime(c3545.getTime());
                                        c3546.m10771(c3545.m10801());
                                        c3546.m10805(c3545.getSize());
                                        c3546.m10805(length);
                                        c8918.m23013(c3546);
                                        if (bArr != null) {
                                            c8918.write(bArr);
                                        } else {
                                            m3156(c8918, c15767);
                                        }
                                        c18091 = c18090;
                                        hashSet = hashSet2;
                                        map3 = map;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        c18590 = c18090;
                                        c8918.close();
                                        throw th2;
                                    }
                                    if (!c15313M3155.f46966 || !name.toLowerCase().endsWith(".dex")) {
                                    }
                                    if (z2) {
                                        iM10767 = 0;
                                    }
                                    c8918.m23018(iM10767);
                                    if (bArr != null) {
                                        length = bArr.length;
                                    } else {
                                        length = c15767.f48605;
                                    }
                                    C3545 c3547 = new C3545(c3545.getName());
                                    HashSet hashSet3 = hashSet;
                                    c18090 = c18091;
                                }
                            }
                        }
                        c18090 = c18091;
                        for (String str : c19205.f60459) {
                            c8918.m23018(C21665.m48934(str, c15313M3155));
                            c8918.m23013(new C3545(str));
                            c8918.write((byte[]) map2.get(str));
                        }
                        for (C15766 c15768 : arrayList) {
                            boolean z3 = c15768.f48604;
                            String str2 = c15768.f48603;
                            if (!z3) {
                                c8918.m23018(C21665.m48934(str2, c15313M3155));
                                long j = c15768.f48605;
                                C3545 c3548 = new C3545(str2);
                                c3548.m10805(j);
                                c8918.m23013(c3548);
                                m3156(c8918, c15768);
                            }
                        }
                        c8918.close();
                        c18090.close();
                    } catch (Throwable th6) {
                        th = th6;
                        c18090 = c18091;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    th = th;
                    try {
                        c18590.close();
                        throw th;
                    } catch (Throwable th8) {
                        th.addSuppressed(th8);
                        throw th;
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                c18590 = c18091;
                th = th;
                c18590.close();
                throw th;
            }
        } catch (IOException e) {
            throw m3153(abstractC15440, "APK_WRITE_FAILED", m3149(e));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15313 m3155(C18090 c18090, HashMap map) throws IOException {
        C15766 c15766 = (C15766) map.get("AndroidManifest.xml");
        if (c15766 != null) {
            byte[] bArr = c15766.f48602;
            if (bArr != null) {
                C15313 c15313 = new C15313();
                c15313.m36338(bArr);
                return c15313;
            }
            AbstractC15440 abstractC15440 = c15766.f48606;
            if (abstractC15440 != null) {
                long j = c15766.f48605;
                if (j >= 0) {
                    try {
                        if (j > 5242880) {
                            return new C15313();
                        }
                        byte[] bArrM3164 = m3164(abstractC15440);
                        if (bArrM3164 == null) {
                            return new C15313();
                        }
                        C15313 c15314 = new C15313();
                        c15314.m36338(bArrM3164);
                        return c15314;
                    } catch (IOException e) {
                        throw new IOException("Failed to inspect changed APK manifest content.", e);
                    } catch (RuntimeException e2) {
                        if (!m3162(e2)) {
                            throw e2;
                        }
                        throw new IOException("Failed to inspect changed APK manifest content.", e2);
                    }
                }
            }
            throw new IOException("Changed manifest data source is missing.");
        }
        C15313 c15315 = new C15313();
        c15315.m36337(c18090);
        return c15315;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3164(AbstractC15440 abstractC15440) throws IOException {
        InputStream inputStreamMo27926 = abstractC15440.mo27926();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                do {
                    int i2 = inputStreamMo27926.read(bArr, 0, Math.min(65536, 5242881 - i));
                    if (i2 < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        inputStreamMo27926.close();
                        return byteArray;
                    }
                    if (i2 == 0) {
                        int i3 = inputStreamMo27926.read();
                        if (i3 < 0) {
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStreamMo27926.close();
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
                inputStreamMo27926.close();
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
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3161(C18090 c18090, C8918 c8918, C3545 c3545, C15313 c15313) throws IOException {
        if (C21665.m48937(c3545, c15313)) {
            C21665.m48936(c18090, c8918, c3545, c15313, null);
            return;
        }
        if ((c3545.m10796() & 8) == 0) {
            c8918.m23014(c3545, c18090);
            return;
        }
        c8918.m23018(c3545.m10767());
        C3545 c3546 = new C3545(c3545.getName());
        c3546.setTime(c3545.getTime());
        c3546.m10771(c3545.m10801());
        c3546.m10805(c3545.getSize());
        c8918.m23013(c3546);
        InputStream inputStreamM42189 = c18090.m42189(c3545);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamM42189.read(bArr);
                if (i != -1) {
                    c8918.write(bArr, 0, i);
                } else {
                    inputStreamM42189.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                inputStreamM42189.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3156(C8918 c8918, C15766 c15766) throws IOException {
        byte[] bArr = c15766.f48602;
        long j = c15766.f48605;
        if (bArr != null) {
            if (j != bArr.length) {
                throw new IOException("Changed entry size does not match its byte array.");
            }
            c8918.write(bArr);
            return;
        }
        AbstractC15440 abstractC15440 = c15766.f48606;
        if (abstractC15440 == null) {
            throw new IOException("Changed entry data source is missing.");
        }
        try {
            InputStream inputStreamMo27926 = abstractC15440.mo27926();
            try {
                byte[] bArr2 = new byte[65536];
                long jM3148 = 0;
                while (true) {
                    int i = inputStreamMo27926.read(bArr2);
                    if (i < 0) {
                        break;
                    }
                    if (i == 0) {
                        int i2 = inputStreamMo27926.read();
                        if (i2 < 0) {
                            break;
                        }
                        c8918.write(i2);
                        jM3148 = m3148(1, jM3148);
                    } else {
                        c8918.write(bArr2, 0, i);
                        jM3148 = m3148(i, jM3148);
                    }
                }
                if (jM3148 != j) {
                    throw new IOException("Changed entry size changed after the build snapshot.");
                }
                inputStreamMo27926.close();
                return;
            } catch (Throwable th) {
                if (inputStreamMo27926 != null) {
                    try {
                        inputStreamMo27926.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            throw new IOException("Failed to stream changed APK entry content.", e);
        } catch (RuntimeException e2) {
            if (!m3162(e2)) {
                throw e2;
            }
            throw new IOException("Failed to stream changed APK entry content.", e2);
        }
        throw new IOException("Failed to stream changed APK entry content.", e);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15060 m3170(C14852 c14852, C18590 c18590) throws C3059 {
        ArrayList arrayList = c18590.f57664;
        byte[] bArr = new byte[65536];
        for (C15766 c15766 : c18590.f57663) {
            AbstractC15440 abstractC15440 = c15766.f48606;
            if (abstractC15440 != null) {
                try {
                    InputStream inputStreamMo27926 = abstractC15440.mo27926();
                    long jM3148 = 0;
                    while (true) {
                        try {
                            int i = inputStreamMo27926.read(bArr);
                            if (i < 0) {
                                break;
                            }
                            if (i == 0) {
                                if (inputStreamMo27926.read() < 0) {
                                    break;
                                }
                                jM3148 = m3148(1, jM3148);
                            } else {
                                jM3148 = m3148(i, jM3148);
                            }
                        } catch (Throwable th) {
                            if (inputStreamMo27926 == null) {
                                throw th;
                            }
                            try {
                                inputStreamMo27926.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (jM3148 != c15766.f48605) {
                        throw new IOException("Changed entry size changed after the build snapshot.");
                    }
                    inputStreamMo27926.close();
                } catch (IOException unused) {
                    throw m3153((AbstractC15440) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                } catch (RuntimeException e) {
                    if (!m3162(e)) {
                        throw e;
                    }
                    throw m3153((AbstractC15440) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                }
                throw m3153((AbstractC15440) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
            }
        }
        C19205 c19205M3166 = m3166(c14852, c18590);
        String str = c14852.f45300;
        String str2 = c18590.f57660;
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(new ArrayList(3), "edit_session_prepare", "entry_overlay_encode", "dex_merge");
        return new C15060(str, str2, true, 0, 0, arrayList2, "passed", new ArrayList(c19205M3166.f60458), arrayList.size() + c18590.f57666.size(), arrayList.size(), new ArrayList(c18590.f57659), new ArrayList(c18590.f57665), new ArrayList(c18590.f57662));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3148(int i, long j) throws IOException {
        long j2 = i;
        if (j <= 9007199254740991L - j2) {
            return j + j2;
        }
        throw new IOException("Changed entry exceeds the supported size range.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3162(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19205 m3166(C14852 c14852, C18590 c18590) throws C3059 {
        C0153 c0153;
        LinkedHashSet linkedHashSet;
        int i;
        String str;
        C0153 c0154;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet2;
        String str2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C0153 c0155;
        c14852 = c14852;
        C18590 c18591 = c18590;
        Iterator it = c18591.f57663.iterator();
        while (it.hasNext()) {
            if (C18373.m42804(((C15766) it.next()).f48603) > 0) {
                throw C3059.m9368("DEX_ENTRY_RESERVED", "Standard dex entries can only be changed through dex class edits.");
            }
        }
        Iterator it2 = c18591.f57662.iterator();
        while (it2.hasNext()) {
            if (C18373.m42804((String) it2.next()) > 0) {
                throw C3059.m9368("DEX_ENTRY_RESERVED", "Standard dex entries cannot be deleted as ZIP entries.");
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (String str3 : m3150(c14852.f45307)) {
            int iM42804 = C18373.m42804(str3);
            if (iM42804 > 0) {
                linkedHashMap2.put(str3, C0153.m1252(iM42804, str3));
            }
        }
        for (C2362 c2362 : c18591.f57666) {
            m3151(linkedHashMap2, c2362.f7551).f1312.put(c2362.f7550, c2362);
        }
        for (C8712 c8712 : c18591.f57664) {
            m3151(linkedHashMap2, c8712.f26517).f1310.add(c8712.f26516);
        }
        C22027 c22027 = new C22027();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = m3150(c18591.f57661).iterator();
        while (true) {
            String str4 = "DEX_POOL_OVERFLOW";
            if (it3.hasNext()) {
                C0153 c0153M3151 = m3151(linkedHashMap2, (String) it3.next());
                try {
                    m3158(c14852, c18591, c22027, c0153M3151);
                } catch (C3059 e) {
                    if (!"DEX_POOL_OVERFLOW".equals(e.f9610)) {
                        throw e;
                    }
                    c0153M3151.f1306 = true;
                    arrayList2.add(c0153M3151);
                }
            } else {
                Iterator it4 = arrayList2.iterator();
                String str5 = c18591;
                while (true) {
                    String str6 = "DEX_BUILD_FAILED";
                    if (!it4.hasNext()) {
                        HashMap map = new HashMap();
                        ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        for (C0153 c0156 : linkedHashMap2.values()) {
                            boolean z = c0156.f1309;
                            String str7 = c0156.f1308;
                            if (z) {
                                byte[] bArr = c0156.f1307;
                                if (bArr == null) {
                                    throw C3059.m9368("DEX_BUILD_FAILED", "Dex merge plan was not materialized: " + str7);
                                }
                                map.put(str7, bArr);
                                arrayList3.add(str7);
                                if (!c0156.f1305) {
                                    arrayList4.add(str7);
                                }
                            }
                        }
                        C6083.sort(arrayList3, C18373.m42805());
                        C6083.sort(arrayList4, C18373.m42805());
                        return new C19205(map, arrayList3, arrayList4);
                    }
                    C0153 c0157 = (C0153) it4.next();
                    LinkedHashMap linkedHashMap3 = c0157.f1312;
                    LinkedHashSet linkedHashSet3 = c0157.f1310;
                    String str8 = c0157.f1308;
                    ArrayList arrayList5 = new ArrayList(linkedHashMap3.values());
                    if (arrayList5.isEmpty()) {
                        throw C3059.m9363(str4, "Dex method or field pool overflow.");
                    }
                    try {
                        try {
                            C19357 c19357 = new C19357(C7897.m21184(c0157.f1304));
                            Iterator it5 = arrayList5.iterator();
                            while (it5.hasNext()) {
                                c19357.m44606((InterfaceC8566) ((C2362) it5.next()).f7549);
                            }
                            try {
                                if (c19357.m48536()) {
                                    throw C3059.m9363(str4, "Dex method or field pool overflow.");
                                }
                                C21473 c21473 = new C21473();
                                c19357.m48534(c21473);
                                C10612 c10612M26632 = C10612.m26632(str8 + "#relocation-group", c21473.m48624());
                                if (!c10612M26632.m26635(65536)) {
                                    throw C3059.m9363(str4, "Dex method or field pool overflow.");
                                }
                                Iterator it6 = linkedHashMap2.values().iterator();
                                String str9 = str4;
                                C0153 c0153M1251 = null;
                                int i7 = Integer.MAX_VALUE;
                                Iterator it7 = it4;
                                int i8 = Integer.MAX_VALUE;
                                while (it6.hasNext()) {
                                    it6 = it6;
                                    C0153 c0158 = (C0153) it6.next();
                                    if (c0158 == c0157 || c0158.f1306) {
                                        c22027 = c22027;
                                        i = i8;
                                        str = str6;
                                        c0154 = c0157;
                                        arrayList = arrayList5;
                                        linkedHashMap = linkedHashMap3;
                                        linkedHashSet2 = linkedHashSet3;
                                        str2 = str8;
                                        i8 = i;
                                        c22027 = c22027;
                                        str6 = str;
                                        linkedHashSet3 = linkedHashSet2;
                                        str8 = str2;
                                        linkedHashMap3 = linkedHashMap;
                                        arrayList5 = arrayList;
                                        linkedHashMap2 = linkedHashMap2;
                                        c0157 = c0154;
                                    } else {
                                        C10612 c10612M26633 = c0158.f1311;
                                        if (c10612M26633 == null) {
                                            if (c0158.f1305 && c0158.f1312.isEmpty() && c0158.f1310.isEmpty()) {
                                                try {
                                                    String str10 = c0158.f1308;
                                                    try {
                                                        c10612M26633 = C10612.m26633(c14852.m35250(str10), str10);
                                                        c0158.f1311 = c10612M26633;
                                                        c0158.f1304 = c10612M26633.f31872;
                                                        c22027 = c22027;
                                                    } catch (IOException e2) {
                                                        try {
                                                            throw m3153(c14852.m35250(str10), "DEX_COUNTS_UNAVAILABLE", m3149(e2));
                                                        } catch (C3059 unused) {
                                                        }
                                                    }
                                                } catch (C3059 unused2) {
                                                }
                                            }
                                            c10612M26633 = null;
                                        } else {
                                            c22027 = c22027;
                                        }
                                        if (c10612M26633 != null) {
                                            int i9 = c10612M26633.f31874;
                                            int i10 = c10612M26633.f31878;
                                            str = str6;
                                            int i11 = c10612M26633.f31876;
                                            linkedHashSet2 = linkedHashSet3;
                                            int i12 = c10612M26633.f31873;
                                            int i13 = c10612M26633.f31877;
                                            str2 = str8;
                                            int i14 = c10612M26633.f31875;
                                            linkedHashMap = linkedHashMap3;
                                            arrayList = arrayList5;
                                            if (c0157.f1304 > c0158.f1304 || !c10612M26633.m26635(43690)) {
                                                linkedHashMap2 = linkedHashMap2;
                                                i = i8;
                                                c0154 = c0157;
                                                i8 = i;
                                                c22027 = c22027;
                                                str6 = str;
                                                linkedHashSet3 = linkedHashSet2;
                                                str8 = str2;
                                                linkedHashMap3 = linkedHashMap;
                                                arrayList5 = arrayList;
                                                linkedHashMap2 = linkedHashMap2;
                                                c0157 = c0154;
                                            } else {
                                                int i15 = c10612M26632.f31878;
                                                int i16 = c10612M26632.f31874;
                                                int i17 = c10612M26632.f31876;
                                                linkedHashMap2 = linkedHashMap2;
                                                int i18 = c10612M26632.f31873;
                                                c0154 = c0157;
                                                int i19 = c10612M26632.f31877;
                                                int i20 = c10612M26632.f31875;
                                                int i21 = i15 + i10;
                                                int i22 = i8;
                                                if (i21 > 65536 || (i2 = i9 + i16) > 65536 || (i3 = i14 + i20) > 65536 || (i4 = i13 + i19) > 65536 || (i5 = i12 + i18) > 65536 || (i6 = i11 + i17) > 65536) {
                                                    i = i22;
                                                    i8 = i;
                                                    c22027 = c22027;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c0157 = c0154;
                                                } else {
                                                    int iMin = Math.min(Math.min(Math.min(Math.min(Math.min(65536 - i21, 65536 - i2), 65536 - i3), 65536 - i4), 65536 - i5), 65536 - i6);
                                                    i8 = (((((((((WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - (i10 + c10612M26632.f31878)) - i2) + 65536) - i3) + 65536) - i4) + 65536) - i5) + 65536) - i6;
                                                    if (c0153M1251 == null || iMin < i7 || (iMin == i7 && i8 < i22)) {
                                                        c0155 = c0158;
                                                    } else {
                                                        if (iMin == i7 && i8 == i22) {
                                                            c0155 = c0158;
                                                            if (c0155.f1313 < c0153M1251.f1313) {
                                                            }
                                                            c22027 = c22027;
                                                            str6 = str;
                                                            linkedHashSet3 = linkedHashSet2;
                                                            str8 = str2;
                                                            linkedHashMap3 = linkedHashMap;
                                                            arrayList5 = arrayList;
                                                            linkedHashMap2 = linkedHashMap2;
                                                            c0157 = c0154;
                                                        }
                                                        i8 = i22;
                                                        c22027 = c22027;
                                                        str6 = str;
                                                        linkedHashSet3 = linkedHashSet2;
                                                        str8 = str2;
                                                        linkedHashMap3 = linkedHashMap;
                                                        arrayList5 = arrayList;
                                                        linkedHashMap2 = linkedHashMap2;
                                                        c0157 = c0154;
                                                    }
                                                    i7 = iMin;
                                                    c0153M1251 = c0155;
                                                    c22027 = c22027;
                                                    str6 = str;
                                                    linkedHashSet3 = linkedHashSet2;
                                                    str8 = str2;
                                                    linkedHashMap3 = linkedHashMap;
                                                    arrayList5 = arrayList;
                                                    linkedHashMap2 = linkedHashMap2;
                                                    c0157 = c0154;
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            str = str6;
                                            c0154 = c0157;
                                            arrayList = arrayList5;
                                            linkedHashMap = linkedHashMap3;
                                            linkedHashSet2 = linkedHashSet3;
                                            str2 = str8;
                                            i8 = i;
                                            c22027 = c22027;
                                            str6 = str;
                                            linkedHashSet3 = linkedHashSet2;
                                            str8 = str2;
                                            linkedHashMap3 = linkedHashMap;
                                            arrayList5 = arrayList;
                                            linkedHashMap2 = linkedHashMap2;
                                            c0157 = c0154;
                                        }
                                    }
                                }
                                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                                C22027 c22028 = c22027;
                                String str11 = str6;
                                C0153 c0159 = c0157;
                                ArrayList<C2362> arrayList6 = arrayList5;
                                AbstractMap abstractMap = linkedHashMap3;
                                LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                String str12 = str8;
                                if (c0153M1251 == null) {
                                    c0153 = c0159;
                                    int i23 = c0153.f1304;
                                    Iterator it8 = linkedHashMap4.values().iterator();
                                    int iMax = 1;
                                    while (it8.hasNext()) {
                                        iMax = Math.max(iMax, ((C0153) it8.next()).f1313 + 1);
                                    }
                                    if (iMax <= 0) {
                                        throw new IllegalArgumentException("Invalid dex index");
                                    }
                                    String strM42645 = iMax == 1 ? "classes.dex" : C18307.m42645(iMax, "classes", ".dex");
                                    c0153M1251 = C0153.m1251(iMax, i23, strM42645);
                                    linkedHashMap2 = linkedHashMap4;
                                    linkedHashMap2.put(strM42645, c0153M1251);
                                } else {
                                    linkedHashMap2 = linkedHashMap4;
                                    c0153 = c0159;
                                }
                                for (C2362 c2363 : arrayList6) {
                                    String str13 = c2363.f7550;
                                    AbstractMap abstractMap2 = abstractMap;
                                    abstractMap2.remove(str13);
                                    String str14 = str12;
                                    try {
                                        Iterator it9 = ((AbstractC18605) c14852.m35252(str14).mo27438()).iterator();
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                linkedHashSet = linkedHashSet4;
                                                break;
                                            }
                                            if (str13.equals(((InterfaceC8566) it9.next()).getType())) {
                                                linkedHashSet = linkedHashSet4;
                                                linkedHashSet.add(str13);
                                                break;
                                            }
                                        }
                                        c0153M1251.f1312.put(str13, new C2362(str13, c0153M1251.f1308, c2363.f7549, c2363.f7552));
                                        abstractMap = abstractMap2;
                                        str12 = str14;
                                        linkedHashSet4 = linkedHashSet;
                                    } catch (Exception e3) {
                                        throw m3153(c14852.m35250(str14), str11, m3149(e3));
                                    } catch (OutOfMemoryError unused3) {
                                        throw C18081.m42152();
                                    }
                                }
                                c0153.f1309 = (abstractMap.isEmpty() && linkedHashSet4.isEmpty()) ? false : true;
                                c0153.f1307 = null;
                                c0153.f1311 = null;
                                c0153M1251.f1309 = true;
                                c0153M1251.f1307 = null;
                                c0153M1251.f1311 = null;
                                c0153.f1306 = false;
                                if (c0153.f1309) {
                                    m3158(c14852, c18590, c22028, c0153);
                                }
                                m3158(c14852, c18590, c22028, c0153M1251);
                                str5 = c18590;
                                c22027 = c22028;
                                c14852 = c14852;
                                it4 = it7;
                                str4 = str9;
                            } catch (Exception e4) {
                                e = e4;
                                throw m3153((AbstractC15440) null, str5, m3149(e));
                            }
                        } catch (Exception e5) {
                            e = e5;
                            str5 = "DEX_BUILD_FAILED";
                        }
                    } catch (OutOfMemoryError unused4) {
                        throw C18081.m42152();
                    } catch (C3059 e6) {
                        throw e6;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0153 m3151(LinkedHashMap linkedHashMap, String str) throws C3059 {
        C0153 c0153 = (C0153) linkedHashMap.get(str);
        if (c0153 != null) {
            return c0153;
        }
        throw C3059.m9368("DEX_BUILD_FAILED", "Dex entry is unavailable: " + str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3158(C14852 c14852, C18590 c18590, C22027 c22027, C0153 c0153) throws C3059 {
        String strM22046;
        AbstractC15440 abstractC15440 = c18590.f57667;
        String str = c0153.f1308;
        if (c0153.f1305) {
            try {
                C8420 c8420 = c14852.f45294;
                AbstractC15440 abstractC15440M35250 = c14852.m35250(str);
                c8420.getClass();
                strM22046 = C8420.m22046(abstractC15440M35250);
            } catch (IOException e) {
                throw m3153(c14852.m35250(str), "DEX_BUILD_FAILED", m3149(e));
            }
        } else {
            strM22046 = "<mcp-new-dex>";
        }
        C21322 c21322M49560 = C22027.m49560(str, strM22046, new ArrayList(c0153.f1312.values()), new ArrayList(c0153.f1310));
        try {
            try {
                byte[] bArrM49563 = C22027.m49563(abstractC15440, c21322M49560);
                if (bArrM49563 == null) {
                    bArrM49563 = m3163(c14852, c0153);
                    try {
                        C22027.m49562(abstractC15440, c21322M49560, bArrM49563);
                    } catch (IOException unused) {
                    }
                }
                c0153.f1307 = bArrM49563;
                C10612 c10612M26632 = C10612.m26632(str, bArrM49563);
                c0153.f1311 = c10612M26632;
                c0153.f1304 = c10612M26632.f31872;
                c0153.f1309 = true;
            } catch (OutOfMemoryError unused2) {
                throw C18081.m42152();
            }
        } catch (IOException e2) {
            throw m3153((AbstractC15440) null, "DEX_BUILD_FAILED", m3149(e2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3163(C14852 c14852, C0153 c0153) throws C3059 {
        C19357 c19357;
        String str = c0153.f1308;
        boolean z = c0153.f1305;
        LinkedHashMap linkedHashMap = c0153.f1312;
        try {
            if (z) {
                C12918 c12918M35252 = c14852.m35252(str);
                c0153.f1304 = c12918M35252.mo27437().f24463;
                c19357 = new C19357(c12918M35252.mo27437());
                for (InterfaceC8566 interfaceC8566 : (AbstractC18605) c12918M35252.mo27438()) {
                    String type = interfaceC8566.getType();
                    if (!c0153.f1310.contains(type) && !linkedHashMap.containsKey(type)) {
                        c19357.m44606(interfaceC8566);
                    }
                }
            } else {
                c19357 = new C19357(C7897.m21184(c0153.f1304));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                c19357.m44606((InterfaceC8566) ((C2362) it.next()).f7549);
            }
            if (c19357.m48536()) {
                throw C3059.m9363("DEX_POOL_OVERFLOW", "Dex method or field pool overflow.");
            }
            C21473 c21473 = new C21473();
            c19357.m48534(c21473);
            return c21473.m48624();
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m3153(z ? c14852.m35250(str) : null, "DEX_BUILD_FAILED", m3149(e2));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m3150(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        C6083.sort(arrayList2, C18373.m42805());
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3159(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441, AbstractC15440 abstractC15442, C11667 c11667) throws C3059 {
        try {
            C6022.m16847(abstractC15440, abstractC15441, c11667, new C5093());
        } catch (Exception e) {
            throw m3153(abstractC15442, "APK_SIGN_FAILED", m3149(e));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3773 m3154(C14852 c14852, C18590 c18590, C19205 c19205, AbstractC15440 abstractC15440, C11667 c11667, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = c18590.f57664;
        if (z) {
            EnumC8139 enumC8139M28555 = c11667.m28555();
            ArrayList arrayList3 = new ArrayList();
            if (enumC8139M28555.f25125) {
                arrayList3.add("V1");
            }
            if (enumC8139M28555.f25126) {
                arrayList3.add("V2");
            }
            if (enumC8139M28555.f25124) {
                arrayList3.add("V3");
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        String str = c14852.f45300;
        String str2 = c18590.f57660;
        abstractC15440.mo23554();
        String strMo23554 = abstractC15440.mo23554();
        String strMo23555 = abstractC15440.mo23554();
        String name = abstractC15440.getName();
        long jMo23127 = abstractC15440.mo23127();
        C8315 c8315M49048 = C21721.m49048(abstractC15440);
        if (z) {
            Collections.addAll(new ArrayList(6), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "apk_sign", "publish");
        } else {
            Collections.addAll(new ArrayList(5), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "publish");
        }
        return new C3773(str, str2, strMo23554, strMo23555, name, jMo23127, z, arrayList, c8315M49048, new ArrayList(c19205.f60458), arrayList2.size() + c18590.f57666.size(), arrayList2.size(), new ArrayList(c18590.f57659), new ArrayList(c18590.f57665), new ArrayList(c18590.f57662));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m3165(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9365(str, str2, "warning", JSON.array(), JSON.object().add("outputPath", abstractC15440.mo23554()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m3153(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9369(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", abstractC15440 == null ? JSON.NULL : JSON.value(abstractC15440.mo23554())));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m3168(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9365(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", JSON.value(abstractC15440.mo23554())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3149(Exception exc) {
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }
}
