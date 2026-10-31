package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۙ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4511 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C0277 m13272(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        return new C0277(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C21445 m13276(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "itemKind", "namePrefix", "demangle", "limit");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13258(jSONObject, "itemKind");
        if (C15330.m36360(strM132510)) {
            String strM132511 = m13258(jSONObject, "namePrefix");
            JSONValue jSONValue = jSONObject.get("demangle");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m13269("demangle");
            }
            if (!jSONValue.isBoolean()) {
                throw m13263("demangle", jSONValue);
            }
            return new C21445(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, strM132511, jSONValue.asBoolean(), m13255(jSONObject, "limit", 1, 500), 0, -1, 0L, 0L);
        }
        throw C3059.m9364("Invalid itemKind", "itemKind", JSON.value(strM132510), m13256(C15330.f46987), JSON.object().add("itemKind", "sections"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C5217 m13274(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        return new C5217(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18623 m13264(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "stopAtSymbolBoundary", "maxBytes", "maxInstructions");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        String strM132511 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        JSONValue jSONValue = jSONObject.get("stopAtSymbolBoundary");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269("stopAtSymbolBoundary");
        }
        if (!jSONValue.isBoolean()) {
            throw m13263("stopAtSymbolBoundary", jSONValue);
        }
        return new C18623(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680, strM132511, jSONValue.asBoolean(), m13255(jSONObject, "maxBytes", 1, 4096), m13255(jSONObject, "maxInstructions", 1, 200));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19329 m13270(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "outputMode", "maxAnalysisBytes", "maxBlocks", "maxInstructions");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        return new C19329(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680, m13259(jSONObject, "instructionMode", "auto", "arm", "thumb"), m13259(jSONObject, "outputMode", "full", ErrorBundle.SUMMARY_ENTRY), m13255(jSONObject, "maxAnalysisBytes", 16, 65536), m13255(jSONObject, "maxBlocks", 1, 4096), m13255(jSONObject, "maxInstructions", 1, 10000));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8039 m13273(JSONObject jSONObject) throws C3059 {
        String[] strArr;
        char cCharAt;
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "expectedHex", "replacementAssembly", "paddingMode");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        if (strM13259.isEmpty()) {
            throw C3059.m9364("editSessionId must not be empty for native patch", "editSessionId", JSON.value(strM13259), (JSONArray) null, (JSONObject) null);
        }
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        String strM132511 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM132512 = m13258(jSONObject, "expectedHex");
        if (strM132512.isEmpty() || (strM132512.length() & 1) != 0) {
            throw m13263("expectedHex", JSON.value(strM132512));
        }
        int length = strM132512.length() / 2;
        if (length > 256) {
            throw C3059.m9365("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "fatal", JSON.array(), JSON.object().add("expectedBytes", length));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(strM132512.charAt(i2), 16);
            int iDigit2 = Character.digit(strM132512.charAt(i2 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw m13263("expectedHex", JSON.value(strM132512));
            }
            bArr[i] = (byte) (iDigit2 | (iDigit << 4));
        }
        String strM132513 = m13258(jSONObject, "replacementAssembly");
        if (strM132513.trim().isEmpty()) {
            throw m13263("replacementAssembly", JSON.value(strM132513));
        }
        if (strM132513.length() > 4096) {
            throw C3059.m9364("Invalid replacementAssembly", "replacementAssembly", JSON.value(strM132513), JSON.array("1..4096"), (JSONObject) null);
        }
        String[] strArrSplit = strM132513.replace(",,", "\n").split("[;\\r\\n]", -1);
        int length2 = strArrSplit.length;
        int i3 = 0;
        while (i3 < length2) {
            String str = strArrSplit[i3];
            int i4 = 0;
            while (true) {
                strArr = strArrSplit;
                if (i4 >= str.length() || !((cCharAt = str.charAt(i4)) == ' ' || cCharAt == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ',' || cCharAt == ';' || cCharAt == ':' || cCharAt == '[' || cCharAt == ']' || cCharAt == '(' || cCharAt == ')' || cCharAt == '{' || cCharAt == '}')) {
                    break;
                }
                i4++;
                strArrSplit = strArr;
            }
            String strSubstring = str.substring(i4);
            int iIndexOf = strSubstring.indexOf(58);
            int i5 = length2;
            if (iIndexOf >= 0) {
                String strTrim = strSubstring.substring(iIndexOf + 1).trim();
                if (strTrim.startsWith(".")) {
                    throw C3059.m9364("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM132513), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
                }
                if (strSubstring.indexOf(32) < 0) {
                    strSubstring = strTrim;
                }
            }
            if (strSubstring.startsWith(".")) {
                throw C3059.m9364("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM132513), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
            }
            i3++;
            strArrSplit = strArr;
            length2 = i5;
        }
        return new C8039(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680, strM132511, bArr, m13260(bArr), strM132513, m13259(jSONObject, "paddingMode", "none", "nop"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15093 m13271(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "expectedText", "replacementText", "paddingMode");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        if (strM13259.isEmpty()) {
            throw C3059.m9364("editSessionId must not be empty for native string patch", "editSessionId", JSON.value(strM13259), (JSONArray) null, (JSONObject) null);
        }
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        String strM132511 = m13258(jSONObject, "expectedText");
        if (strM132511.isEmpty()) {
            throw m13263("expectedText", JSON.value(strM132511));
        }
        String strM132512 = m13258(jSONObject, "replacementText");
        return new C15093(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680, strM132511, m13266(jSONObject, "expectedText", strM132511), m13266(jSONObject, "replacementText", strM132512), m13259(jSONObject, "paddingMode", "none", "null_pad", "space_pad"));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C22150 m13267(JSONObject jSONObject) throws C3059 {
        m13265(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "scanKind", "referenceKinds", "maxScanBytes", "limit");
        String strM13258 = m13258(jSONObject, "workspaceId");
        String strM13259 = m13258(jSONObject, "editSessionId");
        C20034 c20034M13268 = m13268(jSONObject);
        String strM132510 = m13259(jSONObject, "addressKind", "virtual", "file_offset");
        C0983 c0983M13275 = m13275(jSONObject);
        String strM132511 = m13259(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM132512 = m13258(jSONObject, "scanKind");
        try {
            C3863.m11620(strM132512);
            JSONValue jSONValue = jSONObject.get("referenceKinds");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m13269("referenceKinds");
            }
            if (!jSONValue.isArray()) {
                throw m13261(jSONValue);
            }
            ArrayList arrayList = new ArrayList(jSONValue.asArray().size());
            for (JSONValue jSONValue2 : jSONValue.asArray()) {
                if (!jSONValue2.isString()) {
                    throw m13261(jSONValue2);
                }
                arrayList.add(jSONValue2.asString());
            }
            try {
                List listM7423 = C2241.m7423(C2241.m7421(arrayList));
                C22150 c22150 = new C22150(strM13258, strM13259, c20034M13268.f64903, c20034M13268.f64902, strM132510, c0983M13275.f3681, c0983M13275.f3680, strM132511, strM132512, listM7423, m13255(jSONObject, "maxScanBytes", 16, 4194304), m13255(jSONObject, "limit", 1, 200), 0, 0, 0L, 0, 0L, 0L, 0L, null, 0, null);
                List list = c22150.f71861;
                try {
                    String str = c22150.f71868;
                    C3863.m11619(C2241.m7421(list), str);
                    if (!e.m.equals(str) || "auto".equals(strM132511)) {
                        return c22150;
                    }
                    throw C6450.m17822(c22150);
                } catch (IllegalArgumentException unused) {
                    JSONArray jSONArrayArray = JSON.array();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArrayArray.add((String) it.next());
                    }
                    throw m13261(jSONArrayArray);
                }
            } catch (IllegalArgumentException unused2) {
                throw m13261(jSONValue);
            }
        } catch (IllegalArgumentException unused3) {
            throw C3059.m9364("Invalid scanKind", "scanKind", JSON.value(strM132512), m13256("code", e.m, "both"), JSON.object().add("scanKind", "both"));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13265(JSONObject jSONObject, String... strArr) throws C3059 {
        Iterator it = jSONObject.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                JSONObject.Member member = (JSONObject.Member) it.next();
                String name = member.getName();
                int length = strArr.length;
                while (true) {
                    if (i < length) {
                        if (strArr[i].equals(name)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        throw C3059.m9364("Invalid native tool argument", name, member.getValue(), (JSONArray) null, (JSONObject) null);
                    }
                }
            } else {
                int length2 = strArr.length;
                while (i < length2) {
                    String str = strArr[i];
                    if (jSONObject.get(str) == null) {
                        throw m13269(str);
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13258(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269(str);
        }
        if (!jSONValue.isString()) {
            throw m13263(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C20034 m13268(JSONObject jSONObject) throws C3059 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269("locator");
        }
        if (!jSONValue.isString()) {
            throw m13263("locator", jSONValue);
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.startsWith("zip_entry:") || strAsString.length() == 10) {
            throw C3059.m9364("native tools accept only zip_entry locators", "locator", jSONValue, JSON.array("zip_entry:<entryName>"), JSON.object().add("locator", "zip_entry:lib/arm64-v8a/libexample.so"));
        }
        return new C20034(strAsString, strAsString.substring(10));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13259(JSONObject jSONObject, String str, String... strArr) throws C3059 {
        String strM13258 = m13258(jSONObject, str);
        for (String str2 : strArr) {
            if (str2.equals(strM13258)) {
                return strM13258;
            }
        }
        throw C3059.m9364("Invalid ".concat(str), str, JSON.value(strM13258), m13256(strArr), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13255(JSONObject jSONObject, String str, int i, int i2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m13269(str);
        }
        if (!jSONValue.isNumber()) {
            throw m13263(str, jSONValue);
        }
        try {
            int iM3253 = C0899.m3253(jSONValue);
            if (iM3253 >= i && iM3253 <= i2) {
                return iM3253;
            }
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(iM3253), JSON.array(String.valueOf(i) + ".." + i2), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw m13263(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C0983 m13275(JSONObject jSONObject) throws C3059 {
        long jM43885;
        String strM13258 = m13258(jSONObject, "address");
        String strTrim = strM13258.trim();
        if (strTrim.isEmpty() || strTrim.charAt(0) == '-' || strTrim.charAt(0) == '+') {
            throw m13262(strM13258);
        }
        try {
            if (strTrim.startsWith("0x") || strTrim.startsWith("0X")) {
                String strSubstring = strTrim.substring(2);
                if (strSubstring.isEmpty()) {
                    throw new NumberFormatException("empty hex");
                }
                jM43885 = C19033.m43885(strSubstring);
                if (jM43885 < 0) {
                    throw new NumberFormatException("address overflow");
                }
            } else {
                jM43885 = Long.parseLong(strTrim, 10);
            }
            return new C0983(jM43885, m13257(jM43885));
        } catch (NumberFormatException unused) {
            throw m13262(strM13258);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13257(long j) {
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13260(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i).toUpperCase(Locale.ROOT));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m13266(JSONObject jSONObject, String str, String str2) throws C3059 {
        if (str2.indexOf(0) >= 0) {
            throw m13263(str, jSONObject.get(str));
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str2));
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (CharacterCodingException unused) {
            throw m13263(str, jSONObject.get(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m13256(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13262(String str) {
        return C3059.m9364("Invalid address", "address", JSON.value(str), JSON.array("0..9223372036854775807", "0x0..0x7fffffffffffffff"), JSON.object().add("address", "0x1000"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13263(String str, JSONValue jSONValue) {
        return C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m13261(JSONValue jSONValue) {
        return C3059.m9364("Invalid referenceKinds", "referenceKinds", jSONValue, m13256(C2241.f7309), JSON.object().add("referenceKinds", JSON.array("call", "jump", e.m, "unknown")));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m13269(String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }
}
