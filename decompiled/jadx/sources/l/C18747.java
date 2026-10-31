package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.p.a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.ᩴۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 879H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18747 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2519 m43400(String str, int i, String str2, String str3) throws C3059 {
        C2519 c2519M43421;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            if (bArrDecode.length <= 2) {
                throw m43402((String) null);
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, bArrDecode.length - 2);
            C12951 c12951 = new C12951(bArrCopyOf);
            if (m43412(c12951) != 3) {
                throw m43402((String) null);
            }
            int iM43412 = m43412(c12951);
            byte[] bArrM43408 = m43408(iM43412, str2, str3, i, bArrCopyOf, bArrCopyOf.length);
            if (bArrDecode[bArrDecode.length - 2] != bArrM43408[0] || bArrDecode[bArrDecode.length - 1] != bArrM43408[1]) {
                throw m43402((String) null);
            }
            int iM43418 = m43418(c12951);
            int iM43419 = m43418(c12951);
            if (iM43418 < 1 || iM43419 < 1 || iM43418 > iM43419) {
                throw m43402((String) null);
            }
            if (iM43412 == 4) {
                c2519M43421 = m43419(c12951);
            } else if (iM43412 == 12) {
                c2519M43421 = m43401(c12951);
            } else if (iM43412 == 6) {
                c2519M43421 = m43417(c12951);
            } else if (iM43412 == 14) {
                c2519M43421 = m43426(c12951);
            } else if (iM43412 == 8) {
                c2519M43421 = m43425(c12951);
            } else if (iM43412 == 9) {
                c2519M43421 = m43410(c12951);
            } else if (iM43412 == 10) {
                c2519M43421 = m43424(c12951);
            } else if (iM43412 == 13) {
                c2519M43421 = m43411(c12951);
            } else if (iM43412 == 15) {
                c2519M43421 = m43423(c12951);
            } else {
                if (iM43412 != 16) {
                    throw m43402((String) null);
                }
                c2519M43421 = m43421(c12951);
            }
            if (c12951.available() != 0) {
                throw m43402((String) null);
            }
            c2519M43421.f7996.add("recommendedLimit", iM43418).add("limitMax", iM43419);
            return new C2519(m43397(iM43412), c2519M43421.f7996, c2519M43421.f7997, iM43418, iM43419);
        } catch (C3059 unused) {
            throw m43402(str);
        } catch (Exception unused2) {
            throw m43402(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43415(String str) {
        return C14460.m34531(C14460.m34534().digest(str.getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C2519 m43419(C12951 c12951) throws C3059 {
        String str;
        int iM43412 = m43412(c12951);
        if (iM43412 == 1) {
            str = "zip_entries";
        } else if (iM43412 == 2) {
            str = "dex_classes";
        } else {
            if (iM43412 != 3) {
                throw m43402((String) null);
            }
            str = "resource_table";
        }
        JSONObject jSONObjectAdd = JSON.object().add("view", str);
        JSONObject jSONObjectObject = JSON.object();
        jSONObjectAdd.add("prefix", m43413(c12951));
        jSONObjectObject.add("offset", m43418(c12951));
        return new C2519(jSONObjectAdd, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2519 m43401(C12951 c12951) {
        return new C2519(JSON.object().add("prefix", m43413(c12951)), JSON.object().add("offset", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C2519 m43417(C12951 c12951) {
        return new C2519(JSON.object().add("locator", m43413(c12951)), JSON.object().add("memberOffset", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C2519 m43426(C12951 c12951) throws C3059 {
        String str;
        int iM43412 = m43412(c12951);
        String strM43399 = m43399(c12951, iM43412);
        int iM43413 = m43412(c12951);
        if (iM43413 == 1) {
            str = TextBundle.TEXT_ENTRY;
        } else {
            if (iM43413 != 2) {
                throw m43402((String) null);
            }
            str = "hex";
        }
        if (iM43413 == 2 && iM43412 != 1) {
            throw m43402((String) null);
        }
        JSONObject jSONObjectM19939 = C7416.m19939("target", strM43399, "format", str);
        JSONObject jSONObjectObject = JSON.object();
        if (iM43413 == 2) {
            jSONObjectObject.add("hexOffset", m43418(c12951));
        } else if (iM43412 == 6) {
            jSONObjectM19939.add("variant", m43413(c12951)).add("maxValueChars", m43418(c12951)).add("maxValueXmlChars", m43418(c12951)).add("maxItemsPerValue", m43418(c12951)).add("resolveDepth", m43418(c12951));
            jSONObjectObject.add("valueOffset", m43418(c12951));
        } else {
            jSONObjectM19939.add("maxChars", m43418(c12951));
            jSONObjectObject.add("lineOffset", m43418(c12951)).add("lineCharOffset", m43418(c12951));
        }
        return new C2519(jSONObjectM19939, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C2519 m43425(C12951 c12951) throws C3059 {
        String str;
        String str2;
        String strM43413;
        String strM43414;
        String str3;
        String str4;
        JSONObject jSONObjectAdd = JSON.object().add("query", m43413(c12951));
        int iM43412 = m43412(c12951);
        if (iM43412 == 1) {
            str = "literal";
        } else {
            if (iM43412 != 2) {
                throw m43402((String) null);
            }
            str = "regex";
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("queryType", str).add("caseSensitive", m43416(c12951));
        int iM43413 = m43412(c12951);
        if (iM43413 == 1) {
            str2 = "contains";
        } else {
            if (iM43413 != 2) {
                throw m43402((String) null);
            }
            str2 = "exact";
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("matchMode", str2);
        int iM43418 = m43418(c12951);
        if ((iM43418 & (-8192)) != 0 || iM43418 == 0) {
            throw m43402((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        m43403(iM43418, 1, jSONArrayArray, "zip_entries");
        m43403(iM43418, 2, jSONArrayArray, "axml");
        m43403(iM43418, 4, jSONArrayArray, "resource_table_id");
        m43403(iM43418, 8, jSONArrayArray, "resource_table_name");
        m43403(iM43418, 16, jSONArrayArray, "resource_table_value");
        m43403(iM43418, 1024, jSONArrayArray, "resource_table_file_path");
        m43403(iM43418, 32, jSONArrayArray, "dex_class");
        m43403(iM43418, 64, jSONArrayArray, "dex_field");
        m43403(iM43418, 128, jSONArrayArray, "dex_method");
        m43403(iM43418, 256, jSONArrayArray, "dex_string");
        String str5 = "smali";
        m43403(iM43418, 512, jSONArrayArray, "smali");
        m43403(iM43418, 2048, jSONArrayArray, "native_symbol");
        m43403(iM43418, 4096, jSONArrayArray, "native_string");
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("scopes", jSONArrayArray).add("includeSnippet", m43416(c12951)).add("snippetMaxChars", m43418(c12951)).add("explicitScopes", m43416(c12951)).add("includeMatchOffsets", m43416(c12951));
        int iM43414 = m43412(c12951);
        if (iM43414 == 0) {
            strM43413 = null;
        } else {
            if (iM43414 != 1) {
                throw m43402((String) null);
            }
            strM43413 = m43413(c12951);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("zipEntryPrefix", strM43413);
        int iM43415 = m43412(c12951);
        if (iM43415 == 0) {
            strM43414 = null;
        } else {
            if (iM43415 != 1) {
                throw m43402((String) null);
            }
            strM43414 = m43413(c12951);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("resourcePrefix", strM43414);
        int iM43416 = m43412(c12951);
        if (iM43416 == 0) {
            str3 = "none";
        } else if (iM43416 == 1) {
            str3 = "prefix";
        } else {
            if (iM43416 != 2) {
                throw m43402((String) null);
            }
            str3 = "descriptorExact";
        }
        jSONObjectAdd6.add("classPrefixMode", str3);
        jSONObjectAdd6.add("classPrefix", iM43416 == 0 ? null : m43413(c12951));
        int iM43417 = m43412(c12951);
        if (iM43417 == 1) {
            str4 = Name.LABEL;
        } else {
            if (iM43417 != 2) {
                throw m43402((String) null);
            }
            str4 = "member";
        }
        jSONObjectAdd6.add("dexStringResultMode", str4);
        JSONObject jSONObjectAdd7 = JSON.object().add("scopeIndex", m43418(c12951)).add("entryIndex", m43418(c12951)).add("classIndex", m43418(c12951)).add("memberIndex", m43418(c12951) - 1).add("classCharOffset", m43418(c12951));
        if (c12951.available() > 0) {
            int iM43419 = m43412(c12951);
            if (iM43419 == 1) {
                str5 = "overview";
            } else if (iM43419 == 2) {
                str5 = "files";
            } else if (iM43419 == 3) {
                str5 = "resource_table_names";
            } else if (iM43419 == 4) {
                str5 = "resource_table_values";
            } else if (iM43419 == 5) {
                str5 = "resource_table_file_paths";
            } else if (iM43419 == 6) {
                str5 = "dex_names";
            } else if (iM43419 == 7) {
                str5 = "dex_strings";
            } else if (iM43419 == 8) {
                str5 = "dex_string_members";
            } else if (iM43419 != 9) {
                if (iM43419 == 10) {
                    str5 = "native_symbols";
                } else {
                    if (iM43419 != 11) {
                        throw m43402((String) null);
                    }
                    str5 = "native_strings";
                }
            }
            jSONObjectAdd6.add("target", str5);
        }
        if (c12951.available() > 0) {
            if (!"native_strings".equals(jSONObjectAdd6.getString("target", null))) {
                throw m43402((String) null);
            }
            jSONObjectAdd7.add("nativeStringTotalCount", m43418(c12951)).add("nativeStringScanOffset", m43416(c12951) ? m43409(c12951) : -1L);
        }
        return new C2519(jSONObjectAdd6, jSONObjectAdd7);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C2519 m43410(C12951 c12951) throws C3059 {
        return new C2519(JSON.object().add("targetLocator", m43399(c12951, 4)).add("methodResolution", m43414(m43412(c12951))), JSON.object().add("classIndex", m43418(c12951)).add("memberIndex", m43418(c12951)).add("instructionIndex", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C2519 m43424(C12951 c12951) throws C3059 {
        int iM43412 = m43412(c12951);
        if (iM43412 != 4 && iM43412 != 5 && iM43412 != 3) {
            throw m43402((String) null);
        }
        return new C2519(JSON.object().add("targetLocator", m43399(c12951, iM43412)).add("methodResolution", m43414(m43412(c12951))), JSON.object().add("classIndex", m43418(c12951)).add("memberIndex", m43418(c12951)).add("instructionIndex", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C2519 m43411(C12951 c12951) throws C3059 {
        String str;
        String strM43399 = m43399(c12951, 6);
        int iM43418 = m43418(c12951);
        if (iM43418 <= 0 || iM43418 > 3) {
            throw m43402((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        for (int i = 0; i < iM43418; i++) {
            int iM43412 = m43412(c12951);
            if (iM43412 == 1) {
                str = "dex";
            } else if (iM43412 == 2) {
                str = "axml";
            } else {
                if (iM43412 != 3) {
                    throw m43402((String) null);
                }
                str = "resource_table";
            }
            jSONArrayArray.add(str);
        }
        return new C2519(JSON.object().add("targetLocator", strM43399).add("scopes", jSONArrayArray), JSON.object().add("scopeIndex", m43418(c12951)).add("entryIndex", m43418(c12951)).add("classIndex", m43418(c12951)).add("memberIndex", m43418(c12951)).add("instructionIndex", m43418(c12951)).add("innerIndex", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C2519 m43423(C12951 c12951) throws C3059 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m43413(c12951));
        int iM43412 = m43412(c12951);
        if (iM43412 < 1 || iM43412 > 9) {
            throw m43402((String) null);
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("itemKind", C15330.f46987[iM43412 - 1]).add("namePrefix", m43413(c12951)).add("demangle", m43416(c12951));
        long jM43409 = m43409(c12951);
        long jM434010 = m43409(c12951);
        if (jM434010 > 4294967295L) {
            throw m43402((String) null);
        }
        jSONObjectAdd2.add("entrySize", jM43409).add("entryCrc", jM434010).add("totalCount", m43418(c12951));
        return new C2519(jSONObjectAdd2, JSON.object().add("offset", m43418(c12951)));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C2519 m43421(C12951 c12951) throws C3059 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m43413(c12951)).add("addressKind", m43413(c12951)).add("address", m43409(c12951)).add("instructionMode", m43413(c12951));
        String strM43413 = m43413(c12951);
        C3863.m11620(strM43413);
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanKind", strM43413).add("resolvedInstructionMode", m43413(c12951)).add("targetVirtualAddress", m43409(c12951)).add("arch", m43413(c12951)).add("bits", m43418(c12951));
        int iM43418 = m43418(c12951);
        C2241.m7424(iM43418);
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("referenceKindMask", iM43418).add("maxScanBytes", m43418(c12951));
        long jM43409 = m43409(c12951);
        long jM434010 = m43409(c12951);
        if (jM434010 > 4294967295L) {
            throw m43402((String) null);
        }
        try {
            C3863.m11619(jSONObjectAdd3.getInt("referenceKindMask", -1), jSONObjectAdd3.getString("scanKind", ""));
            jSONObjectAdd3.add("entrySize", jM43409).add("entryCrc", jM434010);
            return new C2519(jSONObjectAdd3, JSON.object().add("phaseIndex", m43418(c12951)).add("rangeIndex", m43418(c12951)).add("byteOffsetInRange", m43409(c12951)).add("relocationIndex", m43418(c12951)));
        } catch (RuntimeException unused) {
            throw m43402((String) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43405(C10130 c10130, int i, String str) {
        String strM32000 = C13169.m32000(str);
        if (i == 1 || i == 2) {
            m43407(c10130, strM32000);
            return;
        }
        if (i == 3) {
            m43407(c10130, strM32000);
            return;
        }
        if (i == 4) {
            C3930 c3930M43420 = m43420(strM32000);
            m43407(c10130, c3930M43420.f12543);
            m43407(c10130, c3930M43420.f12544);
            return;
        }
        if (i == 5) {
            C3930 c3930M43421 = m43420(strM32000);
            m43407(c10130, c3930M43421.f12543);
            m43407(c10130, c3930M43421.f12544);
        } else {
            if (i != 6) {
                throw new IllegalArgumentException("Unsupported read target");
            }
            if (strM32000 == null || strM32000.length() != 10 || !strM32000.regionMatches(true, 0, "0x", 0, 2)) {
                throw new IllegalArgumentException("Invalid resource key");
            }
            long j = Long.parseLong(strM32000.substring(2), 16);
            if (j >= 0 && j <= 4294967295L) {
                c10130.writeInt((int) j);
                return;
            }
            throw new IllegalArgumentException("Invalid resource key");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43399(C12951 c12951, int i) throws C3059 {
        String str;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C13169.m31925("dex_class", (String) null, m43413(c12951), (String) null, (String) null, (String) null);
            }
            if (i == 4) {
                return C13169.m31925("dex_method", (String) null, m43413(c12951), m43413(c12951), (String) null, (String) null);
            }
            if (i == 5) {
                return C13169.m31925("dex_field", (String) null, m43413(c12951), (String) null, m43413(c12951), (String) null);
            }
            if (i != 6) {
                throw m43402((String) null);
            }
            if (c12951.available() < 4) {
                throw m43402((String) null);
            }
            return C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, String.format(Locale.ROOT, "0x%08x", Integer.valueOf(c12951.readInt())));
        }
        if (i == 1) {
            str = "zip_entry";
        } else if (i == 2) {
            str = "axml";
        } else if (i == 3) {
            str = "dex_class";
        } else if (i == 4) {
            str = "dex_method";
        } else if (i == 5) {
            str = "dex_field";
        } else {
            if (i != 6) {
                throw m43402((String) null);
            }
            str = "resource";
        }
        return C13169.m31925(str, m43413(c12951), (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3930 m43420(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing smali target");
        }
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw new IllegalArgumentException("Invalid smali target");
        }
        return new C3930(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m43408(int i, String str, String str2, int i2, byte[] bArr, int i3) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = str2.getBytes(charset);
            C10130 c10130 = new C10130(bytes.length + 8 + bytes2.length + i3);
            c10130.writeByte(i);
            m43404(c10130, bytes.length);
            c10130.write(bytes, 0, bytes.length);
            m43404(c10130, bytes2.length);
            c10130.write(bytes2, 0, bytes2.length);
            m43404(c10130, i2);
            c10130.write(bArr, 0, i3);
            MessageDigest messageDigestM34534 = C14460.m34534();
            messageDigestM34534.update(c10130.m25438(), 0, c10130.size());
            byte[] bArrDigest = messageDigestM34534.digest();
            return new byte[]{bArrDigest[0], bArrDigest[1]};
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43404(C10130 c10130, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative varint");
        }
        while ((i & a.g) != 0) {
            c10130.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        c10130.writeByte(i);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int m43418(C12951 c12951) throws C3059 {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int iM43412 = m43412(c12951);
            if (i3 == 4 && (iM43412 & 248) != 0) {
                throw m43402((String) null);
            }
            i |= (iM43412 & 127) << i2;
            if ((iM43412 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43406(C10130 c10130, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative varlong");
        }
        while (((-128) & j) != 0) {
            c10130.writeByte((int) ((127 & j) | 128));
            j >>>= 7;
        }
        c10130.writeByte((int) j);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m43409(C12951 c12951) throws C3059 {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            int iM43412 = m43412(c12951);
            j |= ((long) (iM43412 & 127)) << i;
            if ((iM43412 & 128) == 0) {
                return j;
            }
            i += 7;
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43407(C10130 c10130, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing string");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        m43404(c10130, bytes.length);
        c10130.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String m43413(C12951 c12951) throws C3059 {
        int iM43418 = m43418(c12951);
        if (c12951.available() >= iM43418) {
            byte[] bArr = new byte[iM43418];
            c12951.m31489(iM43418, bArr);
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43416(C12951 c12951) throws C3059 {
        int iM43412 = m43412(c12951);
        if (iM43412 == 0) {
            return false;
        }
        if (iM43412 == 1) {
            return true;
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int m43412(C12951 c12951) throws C3059 {
        if (c12951.available() <= 0) {
            throw m43402((String) null);
        }
        return c12951.readByte() & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43403(int i, int i2, JSONArray jSONArray, String str) {
        if ((i & i2) != 0) {
            jSONArray.add(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43398(String str, String str2, String str3, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String str4;
        int i9;
        int i10;
        JSONArray jSONArray;
        int i11;
        int i12;
        int i13;
        if ("list".equals(str)) {
            i2 = 4;
        } else if ("available_apks".equals(str)) {
            i2 = 12;
        } else if ("outline_class".equals(str)) {
            i2 = 6;
        } else if ("read".equals(str)) {
            i2 = 14;
        } else if ("search".equals(str)) {
            i2 = 8;
        } else if ("xref".equals(str)) {
            i2 = 10;
        } else if ("resource_xref".equals(str)) {
            i2 = 13;
        } else if ("native_items".equals(str)) {
            i2 = 15;
        } else {
            if (!"native_xref".equals(str)) {
                throw new IllegalArgumentException("Unsupported cursor type: ".concat(str));
            }
            i2 = 16;
        }
        C10130 c10130 = new C10130(128);
        c10130.writeByte(3);
        c10130.writeByte(i2);
        m43404(c10130, jSONObject.getInt("recommendedLimit", -1));
        m43404(c10130, jSONObject.getInt("limitMax", -1));
        if (i2 == 4) {
            String string = jSONObject.getString("view", null);
            if ("zip_entries".equals(string)) {
                i13 = 1;
            } else if ("dex_classes".equals(string)) {
                i13 = 2;
            } else {
                if (!"resource_table".equals(string)) {
                    throw new IllegalArgumentException(C20094.m46315("Unsupported list view: ", string));
                }
                i13 = 3;
            }
            c10130.writeByte(i13);
            m43407(c10130, jSONObject.getString("prefix", ""));
            m43404(c10130, jSONObject2.getInt("offset", -1));
        } else if (i2 == 12) {
            m43407(c10130, jSONObject.getString("prefix", ""));
            m43404(c10130, jSONObject2.getInt("offset", -1));
        } else {
            if (i2 != 6) {
                if (i2 == 14) {
                    String string2 = jSONObject.getString("target", null);
                    int iM43422 = m43422(C13169.m31968(string2));
                    String string3 = jSONObject.getString("format", TextBundle.TEXT_ENTRY);
                    if (TextBundle.TEXT_ENTRY.equals(string3)) {
                        i12 = 1;
                    } else {
                        if (!"hex".equals(string3)) {
                            throw new IllegalArgumentException(C20094.m46315("Unsupported read format: ", string3));
                        }
                        i12 = 2;
                    }
                    if (i12 == 2 && iM43422 != 1) {
                        throw new IllegalArgumentException("Byte read cursors are valid only for zip_entry targets");
                    }
                    c10130.writeByte(iM43422);
                    m43405(c10130, iM43422, string2);
                    c10130.writeByte(i12);
                    if (i12 == 2) {
                        m43404(c10130, jSONObject2.getInt("hexOffset", -1));
                    } else if (iM43422 == 6) {
                        m43407(c10130, jSONObject.getString("variant", null));
                        m43404(c10130, jSONObject.getInt("maxValueChars", -1));
                        m43404(c10130, jSONObject.getInt("maxValueXmlChars", 32768));
                        m43404(c10130, jSONObject.getInt("maxItemsPerValue", -1));
                        m43404(c10130, jSONObject.getInt("resolveDepth", -1));
                        m43404(c10130, jSONObject2.getInt("valueOffset", -1));
                    } else {
                        m43404(c10130, jSONObject.getInt("maxChars", -1));
                        m43404(c10130, jSONObject2.getInt("lineOffset", -1));
                        m43404(c10130, jSONObject2.getInt("lineCharOffset", -1));
                    }
                } else if (i2 == 8) {
                    m43407(c10130, jSONObject.getString("query", null));
                    String string4 = jSONObject.getString("queryType", null);
                    if ("literal".equals(string4)) {
                        i6 = 1;
                    } else {
                        if (!"regex".equals(string4)) {
                            throw new IllegalArgumentException(C20094.m46315("Unsupported queryType: ", string4));
                        }
                        i6 = 2;
                    }
                    c10130.writeByte(i6);
                    c10130.writeByte(jSONObject.getBoolean("caseSensitive", false) ? 1 : 0);
                    String string5 = jSONObject.getString("matchMode", null);
                    if ("contains".equals(string5)) {
                        i7 = 1;
                    } else {
                        if (!"exact".equals(string5)) {
                            throw new IllegalArgumentException(C20094.m46315("Unsupported matchMode: ", string5));
                        }
                        i7 = 2;
                    }
                    c10130.writeByte(i7);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("scopes");
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int i16 = i2;
                        if (i14 >= jSONArray2.size()) {
                            m43404(c10130, i15);
                            c10130.writeByte(jSONObject.getBoolean("includeSnippet", false) ? 1 : 0);
                            m43404(c10130, jSONObject.getInt("snippetMaxChars", -1));
                            c10130.writeByte(jSONObject.getBoolean("explicitScopes", false) ? 1 : 0);
                            c10130.writeByte(jSONObject.getBoolean("includeMatchOffsets", false) ? 1 : 0);
                            String string6 = jSONObject.getString("zipEntryPrefix", null);
                            if (string6 == null) {
                                c10130.writeByte(0);
                            } else {
                                c10130.writeByte(1);
                                m43407(c10130, string6);
                            }
                            String string7 = jSONObject.getString("resourcePrefix", null);
                            if (string7 == null) {
                                c10130.writeByte(0);
                            } else {
                                c10130.writeByte(1);
                                m43407(c10130, string7);
                            }
                            String string8 = jSONObject.getString("classPrefixMode", null);
                            if ("none".equals(string8)) {
                                i8 = 0;
                            } else if ("prefix".equals(string8)) {
                                i8 = 1;
                            } else {
                                if (!"descriptorExact".equals(string8)) {
                                    throw new IllegalArgumentException(C20094.m46315("Unsupported classPrefixMode: ", string8));
                                }
                                i8 = 2;
                            }
                            c10130.writeByte(i8);
                            if (i8 != 0) {
                                str4 = null;
                                m43407(c10130, jSONObject.getString("classPrefix", null));
                            } else {
                                str4 = null;
                            }
                            String string9 = jSONObject.getString("dexStringResultMode", str4);
                            if (Name.LABEL.equals(string9)) {
                                i9 = 1;
                            } else {
                                if (!"member".equals(string9)) {
                                    throw new IllegalArgumentException(C20094.m46315("Unsupported dex string result mode: ", string9));
                                }
                                i9 = 2;
                            }
                            c10130.writeByte(i9);
                            m43404(c10130, jSONObject2.getInt("scopeIndex", -1));
                            m43404(c10130, jSONObject2.getInt("entryIndex", -1));
                            m43404(c10130, jSONObject2.getInt("classIndex", -1));
                            m43404(c10130, jSONObject2.getInt("memberIndex", -2) + 1);
                            m43404(c10130, jSONObject2.getInt("classCharOffset", -1));
                            String string10 = jSONObject.getString("target", null);
                            if (string10 != null && !string10.isEmpty()) {
                                if ("overview".equals(string10)) {
                                    i10 = 1;
                                } else if ("files".equals(string10)) {
                                    i10 = 2;
                                } else if ("resource_table_names".equals(string10)) {
                                    i10 = 3;
                                } else if ("resource_table_values".equals(string10)) {
                                    i10 = 4;
                                } else if ("resource_table_file_paths".equals(string10)) {
                                    i10 = 5;
                                } else if ("dex_names".equals(string10)) {
                                    i10 = 6;
                                } else if ("dex_strings".equals(string10)) {
                                    i10 = 7;
                                } else if ("dex_string_members".equals(string10)) {
                                    i10 = 8;
                                } else if ("smali".equals(string10)) {
                                    i10 = 9;
                                } else if ("native_symbols".equals(string10)) {
                                    i10 = 10;
                                } else {
                                    if (!"native_strings".equals(string10)) {
                                        throw new IllegalArgumentException("Unsupported search target: ".concat(string10));
                                    }
                                    i10 = 11;
                                }
                                c10130.writeByte(i10);
                            }
                            int i17 = jSONObject2.getInt("nativeStringTotalCount", -1);
                            if (i17 >= 0) {
                                if (!"native_strings".equals(string10)) {
                                    throw new IllegalArgumentException("Native string scan state requires native_strings target");
                                }
                                m43404(c10130, i17);
                                long j = jSONObject2.getLong("nativeStringScanOffset", -1L);
                                c10130.writeByte(j >= 0 ? 1 : 0);
                                if (j >= 0) {
                                    m43406(c10130, j);
                                }
                            }
                            i3 = i16;
                            break;
                        }
                        String strAsString = jSONArray2.get(i14).asString();
                        if ("zip_entries".equals(strAsString)) {
                            i11 = 1;
                        } else {
                            if ("axml".equals(strAsString)) {
                                i11 = 2;
                            } else {
                                jSONArray = jSONArray2;
                                if ("resource_table_id".equals(strAsString)) {
                                    i11 = 4;
                                } else if ("resource_table_name".equals(strAsString)) {
                                    i11 = 8;
                                } else if ("resource_table_value".equals(strAsString)) {
                                    i11 = 16;
                                } else if ("resource_table_file_path".equals(strAsString)) {
                                    i11 = 1024;
                                } else if ("dex_class".equals(strAsString)) {
                                    i11 = 32;
                                } else if ("dex_field".equals(strAsString)) {
                                    i11 = 64;
                                } else if ("dex_method".equals(strAsString)) {
                                    i11 = 128;
                                } else if ("dex_string".equals(strAsString)) {
                                    i11 = 256;
                                } else if ("smali".equals(strAsString)) {
                                    i11 = 512;
                                } else if ("native_symbol".equals(strAsString)) {
                                    i11 = 2048;
                                } else {
                                    if (!"native_string".equals(strAsString)) {
                                        throw new IllegalArgumentException(C20094.m46315("Unsupported scope: ", strAsString));
                                    }
                                    i11 = 4096;
                                }
                            }
                            i15 |= i11;
                            i14++;
                            jSONArray2 = jSONArray;
                            i2 = i16;
                        }
                        jSONArray = jSONArray2;
                        i15 |= i11;
                        i14++;
                        jSONArray2 = jSONArray;
                        i2 = i16;
                    }
                } else {
                    i3 = i2;
                    if (i3 == 10) {
                        String string11 = jSONObject.getString("targetLocator", null);
                        int iM43423 = m43422(C13169.m31968(string11));
                        if (iM43423 != 4 && iM43423 != 5 && iM43423 != 3) {
                            throw new IllegalArgumentException("Xref cursors are valid only for dex targets");
                        }
                        c10130.writeByte(iM43423);
                        m43405(c10130, iM43423, string11);
                        String string12 = jSONObject.getString("methodResolution", null);
                        if ("exact".equals(string12)) {
                            i5 = 1;
                        } else if ("slot".equals(string12)) {
                            i5 = 2;
                        } else if ("dispatch".equals(string12)) {
                            i5 = 3;
                        } else {
                            if (!"not_applicable".equals(string12)) {
                                throw new IllegalArgumentException(C20094.m46315("Unsupported xref methodResolution: ", string12));
                            }
                            i5 = 4;
                        }
                        c10130.writeByte(i5);
                        m43404(c10130, jSONObject2.getInt("classIndex", -1));
                        m43404(c10130, jSONObject2.getInt("memberIndex", -1));
                        m43404(c10130, jSONObject2.getInt("instructionIndex", -1));
                    } else if (i3 == 13) {
                        String string13 = jSONObject.getString("targetLocator", null);
                        int iM43424 = m43422(C13169.m31968(string13));
                        if (iM43424 != 6) {
                            throw new IllegalArgumentException("Resource xref cursors are valid only for resource targets");
                        }
                        m43405(c10130, iM43424, string13);
                        JSONArray jSONArray3 = jSONObject.getJSONArray("scopes");
                        m43404(c10130, jSONArray3.size());
                        for (int i18 = 0; i18 < jSONArray3.size(); i18++) {
                            String strAsString2 = jSONArray3.get(i18).asString();
                            if ("dex".equals(strAsString2)) {
                                i4 = 1;
                            } else if ("axml".equals(strAsString2)) {
                                i4 = 2;
                            } else {
                                if (!"resource_table".equals(strAsString2)) {
                                    throw new IllegalArgumentException(C20094.m46315("Unsupported resource xref scope: ", strAsString2));
                                }
                                i4 = 3;
                            }
                            c10130.writeByte(i4);
                        }
                        m43404(c10130, jSONObject2.getInt("scopeIndex", -1));
                        m43404(c10130, jSONObject2.getInt("entryIndex", -1));
                        m43404(c10130, jSONObject2.getInt("classIndex", -1));
                        m43404(c10130, jSONObject2.getInt("memberIndex", -1));
                        m43404(c10130, jSONObject2.getInt("instructionIndex", -1));
                        m43404(c10130, jSONObject2.getInt("innerIndex", -1));
                    } else {
                        if (i3 == 15) {
                            m43407(c10130, jSONObject.getString("locator", null));
                            String string14 = jSONObject.getString("itemKind", null);
                            for (int i19 = 0; i19 < 9; i19++) {
                                if (C15330.f46987[i19].equals(string14)) {
                                    c10130.writeByte(i19 + 1);
                                    m43407(c10130, jSONObject.getString("namePrefix", null));
                                    c10130.writeByte(jSONObject.getBoolean("demangle", false) ? 1 : 0);
                                    m43406(c10130, jSONObject.getLong("entrySize", -1L));
                                    long j2 = jSONObject.getLong("entryCrc", -1L);
                                    if (j2 < 0 || j2 > 4294967295L) {
                                        throw new IllegalArgumentException("Invalid native entry CRC");
                                    }
                                    m43406(c10130, j2);
                                    m43404(c10130, jSONObject.getInt("totalCount", -1));
                                    m43404(c10130, jSONObject2.getInt("offset", -1));
                                }
                            }
                            throw new IllegalArgumentException(C20094.m46315("Unsupported native itemKind: ", string14));
                        }
                        if (i3 != 16) {
                            throw new IllegalArgumentException("Unsupported cursor type: ".concat(str));
                        }
                        m43407(c10130, jSONObject.getString("locator", ""));
                        m43407(c10130, jSONObject.getString("addressKind", ""));
                        m43406(c10130, jSONObject.getLong("address", -1L));
                        m43407(c10130, jSONObject.getString("instructionMode", ""));
                        String string15 = jSONObject.getString("scanKind", "");
                        C3863.m11620(string15);
                        m43407(c10130, string15);
                        m43407(c10130, jSONObject.getString("resolvedInstructionMode", ""));
                        m43406(c10130, jSONObject.getLong("targetVirtualAddress", -1L));
                        m43407(c10130, jSONObject.getString("arch", ""));
                        m43404(c10130, jSONObject.getInt("bits", -1));
                        int i20 = jSONObject.getInt("referenceKindMask", -1);
                        C2241.m7424(i20);
                        m43404(c10130, i20);
                        m43404(c10130, jSONObject.getInt("maxScanBytes", -1));
                        long j3 = jSONObject.getLong("entrySize", -1L);
                        long j4 = jSONObject.getLong("entryCrc", -1L);
                        if (j4 < 0 || j4 > 4294967295L) {
                            throw new IllegalArgumentException("Invalid native entry CRC");
                        }
                        m43406(c10130, j3);
                        m43406(c10130, j4);
                        m43404(c10130, jSONObject2.getInt("phaseIndex", -1));
                        m43404(c10130, jSONObject2.getInt("rangeIndex", -1));
                        m43406(c10130, jSONObject2.getLong("byteOffsetInRange", -1L));
                        m43404(c10130, jSONObject2.getInt("relocationIndex", -1));
                    }
                }
                c10130.write(m43408(i3, str2, str3, i, c10130.m25438(), c10130.size()), 0, 2);
                return Base64.encodeToString(c10130.m25438(), 0, c10130.size(), 11);
            }
            m43407(c10130, jSONObject.getString("locator", null));
            m43404(c10130, jSONObject2.getInt("memberOffset", -1));
        }
        i3 = i2;
        c10130.write(m43408(i3, str2, str3, i, c10130.m25438(), c10130.size()), 0, 2);
        return Base64.encodeToString(c10130.m25438(), 0, c10130.size(), 11);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m43422(String str) {
        if ("zip_entry".equals(str)) {
            return 1;
        }
        if ("axml".equals(str)) {
            return 2;
        }
        if ("dex_class".equals(str)) {
            return 3;
        }
        if ("dex_method".equals(str)) {
            return 4;
        }
        if ("dex_field".equals(str)) {
            return 5;
        }
        if ("resource".equals(str)) {
            return 6;
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported target kind: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43397(int i) throws C3059 {
        if (i == 4) {
            return "list";
        }
        if (i == 12) {
            return "available_apks";
        }
        if (i == 6) {
            return "outline_class";
        }
        if (i == 14) {
            return "read";
        }
        if (i == 8) {
            return "search";
        }
        if (i == 9 || i == 10) {
            return "xref";
        }
        if (i == 13) {
            return "resource_xref";
        }
        if (i == 15) {
            return "native_items";
        }
        if (i == 16) {
            return "native_xref";
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43414(int i) throws C3059 {
        if (i == 1) {
            return "exact";
        }
        if (i == 2) {
            return "slot";
        }
        if (i == 3) {
            return "dispatch";
        }
        if (i == 4) {
            return "not_applicable";
        }
        throw m43402((String) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m43402(String str) {
        return C3059.m9364("Invalid cursor", "nextCursor", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }
}
