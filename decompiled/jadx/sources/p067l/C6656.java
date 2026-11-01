package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
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
public final class C6656 {
    /* JADX INFO: renamed from: ܽ */
    public static C2632 m15155(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        return new C2632(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C22750 m15159(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "itemKind", "namePrefix", "demangle", "limit");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15141(jSONObject, "itemKind");
        if (C16938.m38518(strM15143)) {
            String strM15144 = m15141(jSONObject, "namePrefix");
            JSONValue jSONValue = jSONObject.get("demangle");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m15152("demangle");
            }
            if (!jSONValue.isBoolean()) {
                throw m15146("demangle", jSONValue);
            }
            return new C22750(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, strM15144, jSONValue.asBoolean(), m15138(jSONObject, "limit", 1, 500), 0, -1, 0L, 0L);
        }
        throw C5276.m11406("Invalid itemKind", "itemKind", JSON.value(strM15143), m15139(C16938.f50113), JSON.object().add("itemKind", "sections"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C7327 m15157(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        return new C7327(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20068 m15147(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "stopAtSymbolBoundary", "maxBytes", "maxInstructions");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        String strM15144 = m15142(jSONObject, "instructionMode", "auto", "arm", "thumb");
        JSONValue jSONValue = jSONObject.get("stopAtSymbolBoundary");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m15152("stopAtSymbolBoundary");
        }
        if (!jSONValue.isBoolean()) {
            throw m15146("stopAtSymbolBoundary", jSONValue);
        }
        return new C20068(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455, strM15144, jSONValue.asBoolean(), m15138(jSONObject, "maxBytes", 1, 4096), m15138(jSONObject, "maxInstructions", 1, 200));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C20739 m15153(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "outputMode", "maxAnalysisBytes", "maxBlocks", "maxInstructions");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        return new C20739(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455, m15142(jSONObject, "instructionMode", "auto", "arm", "thumb"), m15142(jSONObject, "outputMode", "full", ErrorBundle.SUMMARY_ENTRY), m15138(jSONObject, "maxAnalysisBytes", 16, 65536), m15138(jSONObject, "maxBlocks", 1, 4096), m15138(jSONObject, "maxInstructions", 1, 10000));
    }

    /* JADX INFO: renamed from: ܿ */
    public static C10009 m15156(JSONObject jSONObject) throws C5276 {
        String[] strArr;
        char cCharAt;
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "expectedHex", "replacementAssembly", "paddingMode");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        if (strM15142.isEmpty()) {
            throw C5276.m11406("editSessionId must not be empty for native patch", "editSessionId", JSON.value(strM15142), (JSONArray) null, (JSONObject) null);
        }
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        String strM15144 = m15142(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM15145 = m15141(jSONObject, "expectedHex");
        if (strM15145.isEmpty() || (strM15145.length() & 1) != 0) {
            throw m15146("expectedHex", JSON.value(strM15145));
        }
        int length = strM15145.length() / 2;
        if (length > 256) {
            throw C5276.m11407("NATIVE_PATCH_TOO_LARGE", "Native instruction patch window is too large.", "fatal", JSON.array(), JSON.object().add("expectedBytes", length));
        }
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(strM15145.charAt(i2), 16);
            int iDigit2 = Character.digit(strM15145.charAt(i2 + 1), 16);
            if (iDigit < 0 || iDigit2 < 0) {
                throw m15146("expectedHex", JSON.value(strM15145));
            }
            bArr[i] = (byte) (iDigit2 | (iDigit << 4));
        }
        String strM15146 = m15141(jSONObject, "replacementAssembly");
        if (strM15146.trim().isEmpty()) {
            throw m15146("replacementAssembly", JSON.value(strM15146));
        }
        if (strM15146.length() > 4096) {
            throw C5276.m11406("Invalid replacementAssembly", "replacementAssembly", JSON.value(strM15146), JSON.array("1..4096"), (JSONObject) null);
        }
        String[] strArrSplit = strM15146.replace(",,", "\n").split("[;\\r\\n]", -1);
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
                    throw C5276.m11406("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM15146), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
                }
                if (strSubstring.indexOf(32) < 0) {
                    strSubstring = strTrim;
                }
            }
            if (strSubstring.startsWith(".")) {
                throw C5276.m11406("replacementAssembly must contain instruction statements only", "replacementAssembly", JSON.value(strM15146), JSON.array("assembly instructions without assembler directives"), (JSONObject) null);
            }
            i3++;
            strArrSplit = strArr;
            length2 = i5;
        }
        return new C10009(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455, strM15144, bArr, m15143(bArr), strM15146, m15142(jSONObject, "paddingMode", "none", "nop"));
    }

    /* JADX INFO: renamed from: ܳ */
    public static C16713 m15154(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "expectedText", "replacementText", "paddingMode");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        if (strM15142.isEmpty()) {
            throw C5276.m11406("editSessionId must not be empty for native string patch", "editSessionId", JSON.value(strM15142), (JSONArray) null, (JSONObject) null);
        }
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        String strM15144 = m15141(jSONObject, "expectedText");
        if (strM15144.isEmpty()) {
            throw m15146("expectedText", JSON.value(strM15144));
        }
        String strM15145 = m15141(jSONObject, "replacementText");
        return new C16713(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455, strM15144, m15149(jSONObject, "expectedText", strM15144), m15149(jSONObject, "replacementText", strM15145), m15142(jSONObject, "paddingMode", "none", "null_pad", "space_pad"));
    }

    /* JADX INFO: renamed from: ۜ */
    public static C23420 m15150(JSONObject jSONObject) throws C5276 {
        m15148(jSONObject, "workspaceId", "editSessionId", "locator", "addressKind", "address", "instructionMode", "scanKind", "referenceKinds", "maxScanBytes", "limit");
        String strM15141 = m15141(jSONObject, "workspaceId");
        String strM15142 = m15141(jSONObject, "editSessionId");
        C21409 c21409M15151 = m15151(jSONObject);
        String strM15143 = m15142(jSONObject, "addressKind", "virtual", "file_offset");
        C3303 c3303M15158 = m15158(jSONObject);
        String strM15144 = m15142(jSONObject, "instructionMode", "auto", "arm", "thumb");
        String strM15145 = m15141(jSONObject, "scanKind");
        try {
            C6040.m13556(strM15145);
            JSONValue jSONValue = jSONObject.get("referenceKinds");
            if (jSONValue == null || jSONValue.isNull()) {
                throw m15152("referenceKinds");
            }
            if (!jSONValue.isArray()) {
                throw m15144(jSONValue);
            }
            ArrayList arrayList = new ArrayList(jSONValue.asArray().size());
            for (JSONValue jSONValue2 : jSONValue.asArray()) {
                if (!jSONValue2.isString()) {
                    throw m15144(jSONValue2);
                }
                arrayList.add(jSONValue2.asString());
            }
            try {
                List listM9505 = C4498.m9505(C4498.m9503(arrayList));
                C23420 c23420 = new C23420(strM15141, strM15142, c21409M15151.f67545, c21409M15151.f67544, strM15143, c3303M15158.f6456, c3303M15158.f6455, strM15144, strM15145, listM9505, m15138(jSONObject, "maxScanBytes", 16, 4194304), m15138(jSONObject, "limit", 1, 200), 0, 0, 0L, 0, 0L, 0L, 0L, null, 0, null);
                List list = c23420.f74583;
                try {
                    String str = c23420.f74590;
                    C6040.m13555(C4498.m9503(list), str);
                    if (!AbstractC0213e.f989m.equals(str) || "auto".equals(strM15144)) {
                        return c23420;
                    }
                    throw C8498.m19769(c23420);
                } catch (IllegalArgumentException unused) {
                    JSONArray jSONArrayArray = JSON.array();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        jSONArrayArray.add((String) it.next());
                    }
                    throw m15144(jSONArrayArray);
                }
            } catch (IllegalArgumentException unused2) {
                throw m15144(jSONValue);
            }
        } catch (IllegalArgumentException unused3) {
            throw C5276.m11406("Invalid scanKind", "scanKind", JSON.value(strM15145), m15139("code", AbstractC0213e.f989m, "both"), JSON.object().add("scanKind", "both"));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15148(JSONObject jSONObject, String... strArr) throws C5276 {
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
                        throw C5276.m11406("Invalid native tool argument", name, member.getValue(), (JSONArray) null, (JSONObject) null);
                    }
                }
            } else {
                int length2 = strArr.length;
                while (i < length2) {
                    String str = strArr[i];
                    if (jSONObject.get(str) == null) {
                        throw m15152(str);
                    }
                    i++;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15141(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m15152(str);
        }
        if (!jSONValue.isString()) {
            throw m15146(str, jSONValue);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ۢ */
    public static C21409 m15151(JSONObject jSONObject) throws C5276 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m15152("locator");
        }
        if (!jSONValue.isString()) {
            throw m15146("locator", jSONValue);
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.startsWith("zip_entry:") || strAsString.length() == 10) {
            throw C5276.m11406("native tools accept only zip_entry locators", "locator", jSONValue, JSON.array("zip_entry:<entryName>"), JSON.object().add("locator", "zip_entry:lib/arm64-v8a/libexample.so"));
        }
        return new C21409(strAsString, strAsString.substring(10));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15142(JSONObject jSONObject, String str, String... strArr) throws C5276 {
        String strM15141 = m15141(jSONObject, str);
        for (String str2 : strArr) {
            if (str2.equals(strM15141)) {
                return strM15141;
            }
        }
        throw C5276.m11406("Invalid ".concat(str), str, JSON.value(strM15141), m15139(strArr), (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m15138(JSONObject jSONObject, String str, int i, int i2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m15152(str);
        }
        if (!jSONValue.isNumber()) {
            throw m15146(str, jSONValue);
        }
        try {
            int iM5572 = C3223.m5572(jSONValue);
            if (iM5572 >= i && iM5572 <= i2) {
                return iM5572;
            }
            throw C5276.m11406("Invalid ".concat(str), str, JSON.value(iM5572), JSON.array(String.valueOf(i) + ".." + i2), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw m15146(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C3303 m15158(JSONObject jSONObject) throws C5276 {
        long jM46153;
        String strM15141 = m15141(jSONObject, "address");
        String strTrim = strM15141.trim();
        if (strTrim.isEmpty() || strTrim.charAt(0) == '-' || strTrim.charAt(0) == '+') {
            throw m15145(strM15141);
        }
        try {
            if (strTrim.startsWith("0x") || strTrim.startsWith("0X")) {
                String strSubstring = strTrim.substring(2);
                if (strSubstring.isEmpty()) {
                    throw new NumberFormatException("empty hex");
                }
                jM46153 = C20458.m46153(strSubstring);
                if (jM46153 < 0) {
                    throw new NumberFormatException("address overflow");
                }
            } else {
                jM46153 = Long.parseLong(strTrim, 10);
            }
            return new C3303(jM46153, m15140(jM46153));
        } catch (NumberFormatException unused) {
            throw m15145(strM15141);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15140(long j) {
        return "0x" + Long.toHexString(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15143(byte[] bArr) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m15149(JSONObject jSONObject, String str, String str2) throws C5276 {
        if (str2.indexOf(0) >= 0) {
            throw m15146(str, jSONObject.get(str));
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str2));
            byte[] bArr = new byte[byteBufferEncode.remaining()];
            byteBufferEncode.get(bArr);
            return bArr;
        } catch (CharacterCodingException unused) {
            throw m15146(str, jSONObject.get(str));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m15139(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m15145(String str) {
        return C5276.m11406("Invalid address", "address", JSON.value(str), JSON.array("0..9223372036854775807", "0x0..0x7fffffffffffffff"), JSON.object().add("address", "0x1000"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m15146(String str, JSONValue jSONValue) {
        return C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m15144(JSONValue jSONValue) {
        return C5276.m11406("Invalid referenceKinds", "referenceKinds", jSONValue, m15139(C4498.f10097), JSON.object().add("referenceKinds", JSON.array("call", "jump", AbstractC0213e.f989m, "unknown")));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m15152(String str) {
        return C5276.m11406(C21466.m48631("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }
}
