package p067l;

import android.util.Base64;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p041p.C0184a;
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
public final class C20186 {
    /* JADX INFO: renamed from: ֫ */
    public static C4763 m45667(String str, int i, String str2, String str3) throws C5276 {
        C4763 c4763M45688;
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str, 11);
            if (bArrDecode.length <= 2) {
                throw m45669((String) null);
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, bArrDecode.length - 2);
            C14677 c14677 = new C14677(bArrCopyOf);
            if (m45679(c14677) != 3) {
                throw m45669((String) null);
            }
            int iM45679 = m45679(c14677);
            byte[] bArrM45675 = m45675(iM45679, str2, str3, i, bArrCopyOf, bArrCopyOf.length);
            if (bArrDecode[bArrDecode.length - 2] != bArrM45675[0] || bArrDecode[bArrDecode.length - 1] != bArrM45675[1]) {
                throw m45669((String) null);
            }
            int iM45685 = m45685(c14677);
            int iM45686 = m45685(c14677);
            if (iM45685 < 1 || iM45686 < 1 || iM45685 > iM45686) {
                throw m45669((String) null);
            }
            if (iM45679 == 4) {
                c4763M45688 = m45686(c14677);
            } else if (iM45679 == 12) {
                c4763M45688 = m45668(c14677);
            } else if (iM45679 == 6) {
                c4763M45688 = m45684(c14677);
            } else if (iM45679 == 14) {
                c4763M45688 = m45693(c14677);
            } else if (iM45679 == 8) {
                c4763M45688 = m45692(c14677);
            } else if (iM45679 == 9) {
                c4763M45688 = m45677(c14677);
            } else if (iM45679 == 10) {
                c4763M45688 = m45691(c14677);
            } else if (iM45679 == 13) {
                c4763M45688 = m45678(c14677);
            } else if (iM45679 == 15) {
                c4763M45688 = m45690(c14677);
            } else {
                if (iM45679 != 16) {
                    throw m45669((String) null);
                }
                c4763M45688 = m45688(c14677);
            }
            if (c14677.available() != 0) {
                throw m45669((String) null);
            }
            c4763M45688.f10788.add("recommendedLimit", iM45685).add("limitMax", iM45686);
            return new C4763(m45664(iM45679), c4763M45688.f10788, c4763M45688.f10789, iM45685, iM45686);
        } catch (C5276 unused) {
            throw m45669(str);
        } catch (Exception unused2) {
            throw m45669(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45682(String str) {
        return C16111.m36665(C16111.m36668().digest(str.getBytes(StandardCharsets.UTF_8)));
    }

    /* JADX INFO: renamed from: ܽ */
    public static C4763 m45686(C14677 c14677) throws C5276 {
        String str;
        int iM45679 = m45679(c14677);
        if (iM45679 == 1) {
            str = "zip_entries";
        } else if (iM45679 == 2) {
            str = "dex_classes";
        } else {
            if (iM45679 != 3) {
                throw m45669((String) null);
            }
            str = "resource_table";
        }
        JSONObject jSONObjectAdd = JSON.object().add("view", str);
        JSONObject jSONObjectObject = JSON.object();
        jSONObjectAdd.add("prefix", m45680(c14677));
        jSONObjectObject.add("offset", m45685(c14677));
        return new C4763(jSONObjectAdd, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4763 m45668(C14677 c14677) {
        return new C4763(JSON.object().add("prefix", m45680(c14677)), JSON.object().add("offset", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ܳ */
    public static C4763 m45684(C14677 c14677) {
        return new C4763(JSON.object().add("locator", m45680(c14677)), JSON.object().add("memberOffset", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C4763 m45693(C14677 c14677) throws C5276 {
        String str;
        int iM45679 = m45679(c14677);
        String strM45666 = m45666(c14677, iM45679);
        int iM456710 = m45679(c14677);
        if (iM456710 == 1) {
            str = TextBundle.TEXT_ENTRY;
        } else {
            if (iM456710 != 2) {
                throw m45669((String) null);
            }
            str = "hex";
        }
        if (iM456710 == 2 && iM45679 != 1) {
            throw m45669((String) null);
        }
        JSONObject jSONObjectM21913 = C9417.m21913("target", strM45666, "format", str);
        JSONObject jSONObjectObject = JSON.object();
        if (iM456710 == 2) {
            jSONObjectObject.add("hexOffset", m45685(c14677));
        } else if (iM45679 == 6) {
            jSONObjectM21913.add("variant", m45680(c14677)).add("maxValueChars", m45685(c14677)).add("maxValueXmlChars", m45685(c14677)).add("maxItemsPerValue", m45685(c14677)).add("resolveDepth", m45685(c14677));
            jSONObjectObject.add("valueOffset", m45685(c14677));
        } else {
            jSONObjectM21913.add("maxChars", m45685(c14677));
            jSONObjectObject.add("lineOffset", m45685(c14677)).add("lineCharOffset", m45685(c14677));
        }
        return new C4763(jSONObjectM21913, jSONObjectObject);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C4763 m45692(C14677 c14677) throws C5276 {
        String str;
        String str2;
        String strM45680;
        String strM45681;
        String str3;
        String str4;
        JSONObject jSONObjectAdd = JSON.object().add("query", m45680(c14677));
        int iM45679 = m45679(c14677);
        if (iM45679 == 1) {
            str = "literal";
        } else {
            if (iM45679 != 2) {
                throw m45669((String) null);
            }
            str = "regex";
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("queryType", str).add("caseSensitive", m45683(c14677));
        int iM456710 = m45679(c14677);
        if (iM456710 == 1) {
            str2 = "contains";
        } else {
            if (iM456710 != 2) {
                throw m45669((String) null);
            }
            str2 = "exact";
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("matchMode", str2);
        int iM45685 = m45685(c14677);
        if ((iM45685 & (-8192)) != 0 || iM45685 == 0) {
            throw m45669((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        m45670(iM45685, 1, jSONArrayArray, "zip_entries");
        m45670(iM45685, 2, jSONArrayArray, "axml");
        m45670(iM45685, 4, jSONArrayArray, "resource_table_id");
        m45670(iM45685, 8, jSONArrayArray, "resource_table_name");
        m45670(iM45685, 16, jSONArrayArray, "resource_table_value");
        m45670(iM45685, 1024, jSONArrayArray, "resource_table_file_path");
        m45670(iM45685, 32, jSONArrayArray, "dex_class");
        m45670(iM45685, 64, jSONArrayArray, "dex_field");
        m45670(iM45685, 128, jSONArrayArray, "dex_method");
        m45670(iM45685, 256, jSONArrayArray, "dex_string");
        String str5 = "smali";
        m45670(iM45685, 512, jSONArrayArray, "smali");
        m45670(iM45685, 2048, jSONArrayArray, "native_symbol");
        m45670(iM45685, 4096, jSONArrayArray, "native_string");
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("scopes", jSONArrayArray).add("includeSnippet", m45683(c14677)).add("snippetMaxChars", m45685(c14677)).add("explicitScopes", m45683(c14677)).add("includeMatchOffsets", m45683(c14677));
        int iM456711 = m45679(c14677);
        if (iM456711 == 0) {
            strM45680 = null;
        } else {
            if (iM456711 != 1) {
                throw m45669((String) null);
            }
            strM45680 = m45680(c14677);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("zipEntryPrefix", strM45680);
        int iM456712 = m45679(c14677);
        if (iM456712 == 0) {
            strM45681 = null;
        } else {
            if (iM456712 != 1) {
                throw m45669((String) null);
            }
            strM45681 = m45680(c14677);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("resourcePrefix", strM45681);
        int iM456713 = m45679(c14677);
        if (iM456713 == 0) {
            str3 = "none";
        } else if (iM456713 == 1) {
            str3 = "prefix";
        } else {
            if (iM456713 != 2) {
                throw m45669((String) null);
            }
            str3 = "descriptorExact";
        }
        jSONObjectAdd6.add("classPrefixMode", str3);
        jSONObjectAdd6.add("classPrefix", iM456713 == 0 ? null : m45680(c14677));
        int iM456714 = m45679(c14677);
        if (iM456714 == 1) {
            str4 = Name.LABEL;
        } else {
            if (iM456714 != 2) {
                throw m45669((String) null);
            }
            str4 = "member";
        }
        jSONObjectAdd6.add("dexStringResultMode", str4);
        JSONObject jSONObjectAdd7 = JSON.object().add("scopeIndex", m45685(c14677)).add("entryIndex", m45685(c14677)).add("classIndex", m45685(c14677)).add("memberIndex", m45685(c14677) - 1).add("classCharOffset", m45685(c14677));
        if (c14677.available() > 0) {
            int iM456715 = m45679(c14677);
            if (iM456715 == 1) {
                str5 = "overview";
            } else if (iM456715 == 2) {
                str5 = "files";
            } else if (iM456715 == 3) {
                str5 = "resource_table_names";
            } else if (iM456715 == 4) {
                str5 = "resource_table_values";
            } else if (iM456715 == 5) {
                str5 = "resource_table_file_paths";
            } else if (iM456715 == 6) {
                str5 = "dex_names";
            } else if (iM456715 == 7) {
                str5 = "dex_strings";
            } else if (iM456715 == 8) {
                str5 = "dex_string_members";
            } else if (iM456715 != 9) {
                if (iM456715 == 10) {
                    str5 = "native_symbols";
                } else {
                    if (iM456715 != 11) {
                        throw m45669((String) null);
                    }
                    str5 = "native_strings";
                }
            }
            jSONObjectAdd6.add("target", str5);
        }
        if (c14677.available() > 0) {
            if (!"native_strings".equals(jSONObjectAdd6.getString("target", null))) {
                throw m45669((String) null);
            }
            jSONObjectAdd7.add("nativeStringTotalCount", m45685(c14677)).add("nativeStringScanOffset", m45683(c14677) ? m45676(c14677) : -1L);
        }
        return new C4763(jSONObjectAdd6, jSONObjectAdd7);
    }

    /* JADX INFO: renamed from: ۘ */
    public static C4763 m45677(C14677 c14677) throws C5276 {
        return new C4763(JSON.object().add("targetLocator", m45666(c14677, 4)).add("methodResolution", m45681(m45679(c14677))), JSON.object().add("classIndex", m45685(c14677)).add("memberIndex", m45685(c14677)).add("instructionIndex", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ᩴ */
    public static C4763 m45691(C14677 c14677) throws C5276 {
        int iM45679 = m45679(c14677);
        if (iM45679 != 4 && iM45679 != 5 && iM45679 != 3) {
            throw m45669((String) null);
        }
        return new C4763(JSON.object().add("targetLocator", m45666(c14677, iM45679)).add("methodResolution", m45681(m45679(c14677))), JSON.object().add("classIndex", m45685(c14677)).add("memberIndex", m45685(c14677)).add("instructionIndex", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ۜ */
    public static C4763 m45678(C14677 c14677) throws C5276 {
        String str;
        String strM45666 = m45666(c14677, 6);
        int iM45685 = m45685(c14677);
        if (iM45685 <= 0 || iM45685 > 3) {
            throw m45669((String) null);
        }
        JSONArray jSONArrayArray = JSON.array();
        for (int i = 0; i < iM45685; i++) {
            int iM45679 = m45679(c14677);
            if (iM45679 == 1) {
                str = "dex";
            } else if (iM45679 == 2) {
                str = "axml";
            } else {
                if (iM45679 != 3) {
                    throw m45669((String) null);
                }
                str = "resource_table";
            }
            jSONArrayArray.add(str);
        }
        return new C4763(JSON.object().add("targetLocator", strM45666).add("scopes", jSONArrayArray), JSON.object().add("scopeIndex", m45685(c14677)).add("entryIndex", m45685(c14677)).add("classIndex", m45685(c14677)).add("memberIndex", m45685(c14677)).add("instructionIndex", m45685(c14677)).add("innerIndex", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C4763 m45690(C14677 c14677) throws C5276 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m45680(c14677));
        int iM45679 = m45679(c14677);
        if (iM45679 < 1 || iM45679 > 9) {
            throw m45669((String) null);
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("itemKind", C16938.f50113[iM45679 - 1]).add("namePrefix", m45680(c14677)).add("demangle", m45683(c14677));
        long jM45676 = m45676(c14677);
        long jM45677 = m45676(c14677);
        if (jM45677 > 4294967295L) {
            throw m45669((String) null);
        }
        jSONObjectAdd2.add("entrySize", jM45676).add("entryCrc", jM45677).add("totalCount", m45685(c14677));
        return new C4763(jSONObjectAdd2, JSON.object().add("offset", m45685(c14677)));
    }

    /* JADX INFO: renamed from: ܿ */
    public static C4763 m45688(C14677 c14677) throws C5276 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m45680(c14677)).add("addressKind", m45680(c14677)).add("address", m45676(c14677)).add("instructionMode", m45680(c14677));
        String strM45680 = m45680(c14677);
        C6040.m13556(strM45680);
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("scanKind", strM45680).add("resolvedInstructionMode", m45680(c14677)).add("targetVirtualAddress", m45676(c14677)).add("arch", m45680(c14677)).add("bits", m45685(c14677));
        int iM45685 = m45685(c14677);
        C4498.m9506(iM45685);
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("referenceKindMask", iM45685).add("maxScanBytes", m45685(c14677));
        long jM45676 = m45676(c14677);
        long jM45677 = m45676(c14677);
        if (jM45677 > 4294967295L) {
            throw m45669((String) null);
        }
        try {
            C6040.m13555(jSONObjectAdd3.getInt("referenceKindMask", -1), jSONObjectAdd3.getString("scanKind", ""));
            jSONObjectAdd3.add("entrySize", jM45676).add("entryCrc", jM45677);
            return new C4763(jSONObjectAdd3, JSON.object().add("phaseIndex", m45685(c14677)).add("rangeIndex", m45685(c14677)).add("byteOffsetInRange", m45676(c14677)).add("relocationIndex", m45685(c14677)));
        } catch (RuntimeException unused) {
            throw m45669((String) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45672(C11996 c11996, int i, String str) {
        String strM34096 = C14884.m34096(str);
        if (i == 1 || i == 2) {
            m45674(c11996, strM34096);
            return;
        }
        if (i == 3) {
            m45674(c11996, strM34096);
            return;
        }
        if (i == 4) {
            C6104 c6104M45687 = m45687(strM34096);
            m45674(c11996, c6104M45687.f15351);
            m45674(c11996, c6104M45687.f15352);
            return;
        }
        if (i == 5) {
            C6104 c6104M45688 = m45687(strM34096);
            m45674(c11996, c6104M45688.f15351);
            m45674(c11996, c6104M45688.f15352);
        } else {
            if (i != 6) {
                throw new IllegalArgumentException("Unsupported read target");
            }
            if (strM34096 == null || strM34096.length() != 10 || !strM34096.regionMatches(true, 0, "0x", 0, 2)) {
                throw new IllegalArgumentException("Invalid resource key");
            }
            long j = Long.parseLong(strM34096.substring(2), 16);
            if (j >= 0 && j <= 4294967295L) {
                c11996.writeInt((int) j);
                return;
            }
            throw new IllegalArgumentException("Invalid resource key");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45666(C14677 c14677, int i) throws C5276 {
        String str;
        if (i != 1 && i != 2) {
            if (i == 3) {
                return C14884.m34021("dex_class", (String) null, m45680(c14677), (String) null, (String) null, (String) null);
            }
            if (i == 4) {
                return C14884.m34021("dex_method", (String) null, m45680(c14677), m45680(c14677), (String) null, (String) null);
            }
            if (i == 5) {
                return C14884.m34021("dex_field", (String) null, m45680(c14677), (String) null, m45680(c14677), (String) null);
            }
            if (i != 6) {
                throw m45669((String) null);
            }
            if (c14677.available() < 4) {
                throw m45669((String) null);
            }
            return C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, String.format(Locale.ROOT, "0x%08x", Integer.valueOf(c14677.readInt())));
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
                throw m45669((String) null);
            }
            str = "resource";
        }
        return C14884.m34021(str, m45680(c14677), (String) null, (String) null, (String) null, (String) null);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6104 m45687(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing smali target");
        }
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw new IllegalArgumentException("Invalid smali target");
        }
        return new C6104(str.substring(0, iIndexOf), str.substring(iIndexOf + 2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45675(int i, String str, String str2, int i2, byte[] bArr, int i3) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            byte[] bytes = str.getBytes(charset);
            byte[] bytes2 = str2.getBytes(charset);
            C11996 c11996 = new C11996(bytes.length + 8 + bytes2.length + i3);
            c11996.writeByte(i);
            m45671(c11996, bytes.length);
            c11996.write(bytes, 0, bytes.length);
            m45671(c11996, bytes2.length);
            c11996.write(bytes2, 0, bytes2.length);
            m45671(c11996, i2);
            c11996.write(bArr, 0, i3);
            MessageDigest messageDigestM36668 = C16111.m36668();
            messageDigestM36668.update(c11996.m27458(), 0, c11996.size());
            byte[] bArrDigest = messageDigestM36668.digest();
            return new byte[]{bArrDigest[0], bArrDigest[1]};
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45671(C11996 c11996, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative varint");
        }
        while ((i & C0184a.f879g) != 0) {
            c11996.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        c11996.writeByte(i);
    }

    /* JADX INFO: renamed from: ܺ */
    public static int m45685(C14677 c14677) throws C5276 {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            int iM45679 = m45679(c14677);
            if (i3 == 4 && (iM45679 & 248) != 0) {
                throw m45669((String) null);
            }
            i |= (iM45679 & 127) << i2;
            if ((iM45679 & 128) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45673(C11996 c11996, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative varlong");
        }
        while (((-128) & j) != 0) {
            c11996.writeByte((int) ((127 & j) | 128));
            j >>>= 7;
        }
        c11996.writeByte((int) j);
    }

    /* JADX INFO: renamed from: ۖ */
    public static long m45676(C14677 c14677) throws C5276 {
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            int iM45679 = m45679(c14677);
            j |= ((long) (iM45679 & 127)) << i;
            if ((iM45679 & 128) == 0) {
                return j;
            }
            i += 7;
        }
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45674(C11996 c11996, String str) {
        if (str == null) {
            throw new IllegalArgumentException("Missing string");
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        m45671(c11996, bytes.length);
        c11996.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: renamed from: ۢ */
    public static String m45680(C14677 c14677) throws C5276 {
        int iM45685 = m45685(c14677);
        if (c14677.available() >= iM45685) {
            byte[] bArr = new byte[iM45685];
            c14677.m33576(iM45685, bArr);
            return new String(bArr, StandardCharsets.UTF_8);
        }
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m45683(C14677 c14677) throws C5276 {
        int iM45679 = m45679(c14677);
        if (iM45679 == 0) {
            return false;
        }
        if (iM45679 == 1) {
            return true;
        }
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ۡ */
    public static int m45679(C14677 c14677) throws C5276 {
        if (c14677.available() <= 0) {
            throw m45669((String) null);
        }
        return c14677.readByte() & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45670(int i, int i2, JSONArray jSONArray, String str) {
        if ((i & i2) != 0) {
            jSONArray.add(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45665(String str, String str2, String str3, int i, JSONObject jSONObject, JSONObject jSONObject2) {
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
        C11996 c11996 = new C11996(128);
        c11996.writeByte(3);
        c11996.writeByte(i2);
        m45671(c11996, jSONObject.getInt("recommendedLimit", -1));
        m45671(c11996, jSONObject.getInt("limitMax", -1));
        if (i2 == 4) {
            String string = jSONObject.getString("view", null);
            if ("zip_entries".equals(string)) {
                i13 = 1;
            } else if ("dex_classes".equals(string)) {
                i13 = 2;
            } else {
                if (!"resource_table".equals(string)) {
                    throw new IllegalArgumentException(C21466.m48631("Unsupported list view: ", string));
                }
                i13 = 3;
            }
            c11996.writeByte(i13);
            m45674(c11996, jSONObject.getString("prefix", ""));
            m45671(c11996, jSONObject2.getInt("offset", -1));
        } else if (i2 == 12) {
            m45674(c11996, jSONObject.getString("prefix", ""));
            m45671(c11996, jSONObject2.getInt("offset", -1));
        } else {
            if (i2 != 6) {
                if (i2 == 14) {
                    String string2 = jSONObject.getString("target", null);
                    int iM45689 = m45689(C14884.m34064(string2));
                    String string3 = jSONObject.getString("format", TextBundle.TEXT_ENTRY);
                    if (TextBundle.TEXT_ENTRY.equals(string3)) {
                        i12 = 1;
                    } else {
                        if (!"hex".equals(string3)) {
                            throw new IllegalArgumentException(C21466.m48631("Unsupported read format: ", string3));
                        }
                        i12 = 2;
                    }
                    if (i12 == 2 && iM45689 != 1) {
                        throw new IllegalArgumentException("Byte read cursors are valid only for zip_entry targets");
                    }
                    c11996.writeByte(iM45689);
                    m45672(c11996, iM45689, string2);
                    c11996.writeByte(i12);
                    if (i12 == 2) {
                        m45671(c11996, jSONObject2.getInt("hexOffset", -1));
                    } else if (iM45689 == 6) {
                        m45674(c11996, jSONObject.getString("variant", null));
                        m45671(c11996, jSONObject.getInt("maxValueChars", -1));
                        m45671(c11996, jSONObject.getInt("maxValueXmlChars", 32768));
                        m45671(c11996, jSONObject.getInt("maxItemsPerValue", -1));
                        m45671(c11996, jSONObject.getInt("resolveDepth", -1));
                        m45671(c11996, jSONObject2.getInt("valueOffset", -1));
                    } else {
                        m45671(c11996, jSONObject.getInt("maxChars", -1));
                        m45671(c11996, jSONObject2.getInt("lineOffset", -1));
                        m45671(c11996, jSONObject2.getInt("lineCharOffset", -1));
                    }
                } else if (i2 == 8) {
                    m45674(c11996, jSONObject.getString("query", null));
                    String string4 = jSONObject.getString("queryType", null);
                    if ("literal".equals(string4)) {
                        i6 = 1;
                    } else {
                        if (!"regex".equals(string4)) {
                            throw new IllegalArgumentException(C21466.m48631("Unsupported queryType: ", string4));
                        }
                        i6 = 2;
                    }
                    c11996.writeByte(i6);
                    c11996.writeByte(jSONObject.getBoolean("caseSensitive", false) ? 1 : 0);
                    String string5 = jSONObject.getString("matchMode", null);
                    if ("contains".equals(string5)) {
                        i7 = 1;
                    } else {
                        if (!"exact".equals(string5)) {
                            throw new IllegalArgumentException(C21466.m48631("Unsupported matchMode: ", string5));
                        }
                        i7 = 2;
                    }
                    c11996.writeByte(i7);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("scopes");
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int i16 = i2;
                        if (i14 >= jSONArray2.size()) {
                            m45671(c11996, i15);
                            c11996.writeByte(jSONObject.getBoolean("includeSnippet", false) ? 1 : 0);
                            m45671(c11996, jSONObject.getInt("snippetMaxChars", -1));
                            c11996.writeByte(jSONObject.getBoolean("explicitScopes", false) ? 1 : 0);
                            c11996.writeByte(jSONObject.getBoolean("includeMatchOffsets", false) ? 1 : 0);
                            String string6 = jSONObject.getString("zipEntryPrefix", null);
                            if (string6 == null) {
                                c11996.writeByte(0);
                            } else {
                                c11996.writeByte(1);
                                m45674(c11996, string6);
                            }
                            String string7 = jSONObject.getString("resourcePrefix", null);
                            if (string7 == null) {
                                c11996.writeByte(0);
                            } else {
                                c11996.writeByte(1);
                                m45674(c11996, string7);
                            }
                            String string8 = jSONObject.getString("classPrefixMode", null);
                            if ("none".equals(string8)) {
                                i8 = 0;
                            } else if ("prefix".equals(string8)) {
                                i8 = 1;
                            } else {
                                if (!"descriptorExact".equals(string8)) {
                                    throw new IllegalArgumentException(C21466.m48631("Unsupported classPrefixMode: ", string8));
                                }
                                i8 = 2;
                            }
                            c11996.writeByte(i8);
                            if (i8 != 0) {
                                str4 = null;
                                m45674(c11996, jSONObject.getString("classPrefix", null));
                            } else {
                                str4 = null;
                            }
                            String string9 = jSONObject.getString("dexStringResultMode", str4);
                            if (Name.LABEL.equals(string9)) {
                                i9 = 1;
                            } else {
                                if (!"member".equals(string9)) {
                                    throw new IllegalArgumentException(C21466.m48631("Unsupported dex string result mode: ", string9));
                                }
                                i9 = 2;
                            }
                            c11996.writeByte(i9);
                            m45671(c11996, jSONObject2.getInt("scopeIndex", -1));
                            m45671(c11996, jSONObject2.getInt("entryIndex", -1));
                            m45671(c11996, jSONObject2.getInt("classIndex", -1));
                            m45671(c11996, jSONObject2.getInt("memberIndex", -2) + 1);
                            m45671(c11996, jSONObject2.getInt("classCharOffset", -1));
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
                                c11996.writeByte(i10);
                            }
                            int i17 = jSONObject2.getInt("nativeStringTotalCount", -1);
                            if (i17 >= 0) {
                                if (!"native_strings".equals(string10)) {
                                    throw new IllegalArgumentException("Native string scan state requires native_strings target");
                                }
                                m45671(c11996, i17);
                                long j = jSONObject2.getLong("nativeStringScanOffset", -1L);
                                c11996.writeByte(j >= 0 ? 1 : 0);
                                if (j >= 0) {
                                    m45673(c11996, j);
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
                                        throw new IllegalArgumentException(C21466.m48631("Unsupported scope: ", strAsString));
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
                        int iM456810 = m45689(C14884.m34064(string11));
                        if (iM456810 != 4 && iM456810 != 5 && iM456810 != 3) {
                            throw new IllegalArgumentException("Xref cursors are valid only for dex targets");
                        }
                        c11996.writeByte(iM456810);
                        m45672(c11996, iM456810, string11);
                        String string12 = jSONObject.getString("methodResolution", null);
                        if ("exact".equals(string12)) {
                            i5 = 1;
                        } else if ("slot".equals(string12)) {
                            i5 = 2;
                        } else if ("dispatch".equals(string12)) {
                            i5 = 3;
                        } else {
                            if (!"not_applicable".equals(string12)) {
                                throw new IllegalArgumentException(C21466.m48631("Unsupported xref methodResolution: ", string12));
                            }
                            i5 = 4;
                        }
                        c11996.writeByte(i5);
                        m45671(c11996, jSONObject2.getInt("classIndex", -1));
                        m45671(c11996, jSONObject2.getInt("memberIndex", -1));
                        m45671(c11996, jSONObject2.getInt("instructionIndex", -1));
                    } else if (i3 == 13) {
                        String string13 = jSONObject.getString("targetLocator", null);
                        int iM456811 = m45689(C14884.m34064(string13));
                        if (iM456811 != 6) {
                            throw new IllegalArgumentException("Resource xref cursors are valid only for resource targets");
                        }
                        m45672(c11996, iM456811, string13);
                        JSONArray jSONArray3 = jSONObject.getJSONArray("scopes");
                        m45671(c11996, jSONArray3.size());
                        for (int i18 = 0; i18 < jSONArray3.size(); i18++) {
                            String strAsString2 = jSONArray3.get(i18).asString();
                            if ("dex".equals(strAsString2)) {
                                i4 = 1;
                            } else if ("axml".equals(strAsString2)) {
                                i4 = 2;
                            } else {
                                if (!"resource_table".equals(strAsString2)) {
                                    throw new IllegalArgumentException(C21466.m48631("Unsupported resource xref scope: ", strAsString2));
                                }
                                i4 = 3;
                            }
                            c11996.writeByte(i4);
                        }
                        m45671(c11996, jSONObject2.getInt("scopeIndex", -1));
                        m45671(c11996, jSONObject2.getInt("entryIndex", -1));
                        m45671(c11996, jSONObject2.getInt("classIndex", -1));
                        m45671(c11996, jSONObject2.getInt("memberIndex", -1));
                        m45671(c11996, jSONObject2.getInt("instructionIndex", -1));
                        m45671(c11996, jSONObject2.getInt("innerIndex", -1));
                    } else {
                        if (i3 == 15) {
                            m45674(c11996, jSONObject.getString("locator", null));
                            String string14 = jSONObject.getString("itemKind", null);
                            for (int i19 = 0; i19 < 9; i19++) {
                                if (C16938.f50113[i19].equals(string14)) {
                                    c11996.writeByte(i19 + 1);
                                    m45674(c11996, jSONObject.getString("namePrefix", null));
                                    c11996.writeByte(jSONObject.getBoolean("demangle", false) ? 1 : 0);
                                    m45673(c11996, jSONObject.getLong("entrySize", -1L));
                                    long j2 = jSONObject.getLong("entryCrc", -1L);
                                    if (j2 < 0 || j2 > 4294967295L) {
                                        throw new IllegalArgumentException("Invalid native entry CRC");
                                    }
                                    m45673(c11996, j2);
                                    m45671(c11996, jSONObject.getInt("totalCount", -1));
                                    m45671(c11996, jSONObject2.getInt("offset", -1));
                                }
                            }
                            throw new IllegalArgumentException(C21466.m48631("Unsupported native itemKind: ", string14));
                        }
                        if (i3 != 16) {
                            throw new IllegalArgumentException("Unsupported cursor type: ".concat(str));
                        }
                        m45674(c11996, jSONObject.getString("locator", ""));
                        m45674(c11996, jSONObject.getString("addressKind", ""));
                        m45673(c11996, jSONObject.getLong("address", -1L));
                        m45674(c11996, jSONObject.getString("instructionMode", ""));
                        String string15 = jSONObject.getString("scanKind", "");
                        C6040.m13556(string15);
                        m45674(c11996, string15);
                        m45674(c11996, jSONObject.getString("resolvedInstructionMode", ""));
                        m45673(c11996, jSONObject.getLong("targetVirtualAddress", -1L));
                        m45674(c11996, jSONObject.getString("arch", ""));
                        m45671(c11996, jSONObject.getInt("bits", -1));
                        int i20 = jSONObject.getInt("referenceKindMask", -1);
                        C4498.m9506(i20);
                        m45671(c11996, i20);
                        m45671(c11996, jSONObject.getInt("maxScanBytes", -1));
                        long j3 = jSONObject.getLong("entrySize", -1L);
                        long j4 = jSONObject.getLong("entryCrc", -1L);
                        if (j4 < 0 || j4 > 4294967295L) {
                            throw new IllegalArgumentException("Invalid native entry CRC");
                        }
                        m45673(c11996, j3);
                        m45673(c11996, j4);
                        m45671(c11996, jSONObject2.getInt("phaseIndex", -1));
                        m45671(c11996, jSONObject2.getInt("rangeIndex", -1));
                        m45673(c11996, jSONObject2.getLong("byteOffsetInRange", -1L));
                        m45671(c11996, jSONObject2.getInt("relocationIndex", -1));
                    }
                }
                c11996.write(m45675(i3, str2, str3, i, c11996.m27458(), c11996.size()), 0, 2);
                return Base64.encodeToString(c11996.m27458(), 0, c11996.size(), 11);
            }
            m45674(c11996, jSONObject.getString("locator", null));
            m45671(c11996, jSONObject2.getInt("memberOffset", -1));
        }
        i3 = i2;
        c11996.write(m45675(i3, str2, str3, i, c11996.m27458(), c11996.size()), 0, 2);
        return Base64.encodeToString(c11996.m27458(), 0, c11996.size(), 11);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m45689(String str) {
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
        throw new IllegalArgumentException(C21466.m48631("Unsupported target kind: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45664(int i) throws C5276 {
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
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45681(int i) throws C5276 {
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
        throw m45669((String) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m45669(String str) {
        return C5276.m11406("Invalid cursor", "nextCursor", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }
}
