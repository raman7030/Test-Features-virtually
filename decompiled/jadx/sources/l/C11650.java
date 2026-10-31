package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.json.JSONValue;
import bin.mt.plus.R;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۨۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes4.dex */
public class C11650 extends AbstractC4708 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C16464 f34741;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C10239 f34742;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f34743;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13765 f34744;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6005 f34745;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f34746;

    public C11650(int i, C10239 c10239, JSONObject jSONObject, C12231 c12231, C16464 c16464, C5267 c5267) {
        JSONValue jSONValue;
        super(i);
        this.f34743 = "/mcp";
        C11003.requireNonNull(c10239, "protocolVersions");
        this.f34742 = c10239;
        String str = "MCP";
        if (jSONObject != null && (jSONValue = jSONObject.get("name")) != null && jSONValue.isString()) {
            String strTrim = jSONValue.asString().trim();
            if (!strTrim.isEmpty()) {
                str = strTrim;
            }
        }
        this.f34746 = str;
        this.f34741 = c16464;
        C11003.requireNonNull(c5267, "requestAuthenticator");
        this.f34745 = c5267;
        this.f34744 = new C13765(c10239, jSONObject, c12231);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    @Override // l.AbstractC4708
    /* JADX INFO: renamed from: ֫ */
    public final C8236 mo13796(C15996 c15996) {
        boolean z;
        EnumC1180 enumC1180;
        EnumC1180 enumC1181;
        String str;
        String strM37804 = c15996.m37804();
        String str2 = this.f34743;
        if (!str2.equals(strM37804)) {
            C8236 c8236M13784 = AbstractC4708.m13784(EnumC1180.NOT_FOUND, "text/plain; charset=UTF-8", "Not Found");
            m28538(c15996, c8236M13784);
            return c8236M13784;
        }
        if (c15996.m37807() == EnumC4003.GET) {
            C8236 c8236M13785 = AbstractC4708.m13784(EnumC1180.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C4925.m14306(R.string.MT_Protector, this.f34746));
            c8236M13785.m21805("Allow", "POST");
            m28538(c15996, c8236M13785);
            return c8236M13785;
        }
        if (c15996.m37807() != EnumC4003.POST) {
            C8236 c8236M13786 = AbstractC4708.m13784(EnumC1180.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C4860.m14172("Only POST ", str2, " is supported"));
            c8236M13786.m21805("Allow", "POST");
            m28538(c15996, c8236M13786);
            return c8236M13786;
        }
        String str3 = (String) ((HashMap) c15996.m37811()).get("accept");
        if (str3 != null && !str3.trim().isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str4 : str3.split(",")) {
                String lowerCase = str4.split(l.b, 2)[0].trim().toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
            if (!hashSet.contains("application/json") && !hashSet.contains("application/*") && !hashSet.contains("*/*")) {
                C8236 c8236M13787 = AbstractC4708.m13784(EnumC1180.NOT_ACCEPTABLE, "text/plain; charset=UTF-8", "Accept must allow application/json");
                m28538(c15996, c8236M13787);
                return c8236M13787;
            }
        }
        String str5 = (String) ((HashMap) c15996.m37811()).get("origin");
        if (str5 != null && !str5.isEmpty()) {
            try {
                C16464 c16464 = this.f34741;
                URI uriCreate = URI.create(str5);
                int i = c16464.f50606;
                if (a.s.equals(uriCreate.getScheme()) && uriCreate.getPort() == i) {
                    String host = uriCreate.getHost();
                    z = ("127.0.0.1".equals(host) || "localhost".equalsIgnoreCase(host)) ? true : C17375.m40717().contains(host);
                }
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C8236 c8236M13788 = AbstractC4708.m13784(EnumC1180.FORBIDDEN, "text/plain; charset=UTF-8", "Origin is not allowed");
            m28538(c15996, c8236M13788);
            return c8236M13788;
        }
        C12355 c12355Mo15185 = this.f34745.mo15185(c15996);
        if (!C12355.m29976(c12355Mo15185)) {
            C8236 c8236M29973 = C12355.m29973(c12355Mo15185);
            m28538(c15996, c8236M29973);
            return c8236M29973;
        }
        try {
            try {
                JSONValue jSONValue = JSON.parse(m28539(c15996));
                boolean zIsArray = jSONValue.isArray();
                C13765 c13765 = this.f34744;
                C10239 c10239 = this.f34742;
                if (!zIsArray) {
                    if (!jSONValue.isObject()) {
                        return C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                    }
                    JSONObject jSONObjectAsObject = jSONValue.asObject();
                    if (!"initialize".equals(m28537(jSONObjectAsObject))) {
                        String str6 = (String) ((HashMap) c15996.m37811()).get("mcp-protocol-version");
                        if (!c10239.m25931(str6 != null ? str6 : "2025-03-26")) {
                            return C10821.m27053(EnumC1180.BAD_REQUEST, jSONObjectAsObject.get("id"), -32600, "Invalid MCP-Protocol-Version");
                        }
                    }
                    if (jSONObjectAsObject.get(e.s) == null && !(jSONObjectAsObject.get(o.c) == null && jSONObjectAsObject.get(d.O) == null)) {
                        return m28540(jSONObjectAsObject) ? AbstractC4708.m13784(EnumC1180.ACCEPTED, "text/plain; charset=UTF-8", "") : AbstractC4708.m13784(EnumC1180.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid JSON-RPC response");
                    }
                    return c13765.m33086(jSONObjectAsObject).m51057();
                }
                JSONArray<JSONValue> jSONArrayAsArray = jSONValue.asArray();
                String str7 = (String) ((HashMap) c15996.m37811()).get("mcp-protocol-version");
                if (str7 == null) {
                    str7 = "2025-03-26";
                }
                if (!c10239.m25931(str7)) {
                    return C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32600, "Invalid MCP-Protocol-Version");
                }
                if (!"2025-03-26".equals(str7)) {
                    return C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32600, "Batch requests are not supported");
                }
                if (jSONArrayAsArray.size() == 0) {
                    return C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                }
                boolean z2 = false;
                boolean z3 = false;
                for (JSONValue jSONValue2 : jSONArrayAsArray) {
                    if (jSONValue2.isObject()) {
                        JSONObject jSONObjectAsObject2 = jSONValue2.asObject();
                        if (jSONObjectAsObject2.get(e.s) == null && !(jSONObjectAsObject2.get(o.c) == null && jSONObjectAsObject2.get(d.O) == null)) {
                            if (!m28540(jSONValue2.asObject())) {
                                enumC1181 = EnumC1180.BAD_REQUEST;
                                str = "Invalid JSON-RPC response batch";
                                return AbstractC4708.m13784(enumC1181, "text/plain; charset=UTF-8", str);
                            }
                            z2 = true;
                        }
                    }
                    z3 = true;
                }
                if (!z2) {
                    JSONArray jSONArrayArray = JSON.array();
                    for (JSONValue jSONValue3 : jSONArrayAsArray) {
                        if (jSONValue3.isObject()) {
                            JSONObject jSONObjectAsObject3 = jSONValue3.asObject();
                            if ("initialize".equals(m28537(jSONObjectAsObject3))) {
                                JSONValue jSONValue4 = jSONObjectAsObject3.get("jsonrpc");
                                if (jSONObjectAsObject3.get("id") != null || jSONValue4 == null || !jSONValue4.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue4.asString()) || m28537(jSONObjectAsObject3) == null) {
                                    jSONArrayArray.add(C10821.m27052(jSONObjectAsObject3.get("id"), -32600, "Initialize requests must not be batched"));
                                }
                            } else {
                                JSONValue jSONValueM51056 = c13765.m33086(jSONObjectAsObject3).m51056();
                                if (jSONValueM51056 != null) {
                                    jSONArrayArray.add(jSONValueM51056);
                                }
                            }
                        } else {
                            jSONArrayArray.add(C10821.m27052(JSON.NULL, -32600, "Invalid Request"));
                        }
                    }
                    if (jSONArrayArray.size() != 0) {
                        return AbstractC4708.m13784(EnumC1180.OK, "application/json", jSONArrayArray.toString());
                    }
                    enumC1180 = EnumC1180.ACCEPTED;
                } else {
                    if (z3) {
                        enumC1181 = EnumC1180.BAD_REQUEST;
                        str = "JSON-RPC response batches cannot contain requests or notifications";
                        return AbstractC4708.m13784(enumC1181, "text/plain; charset=UTF-8", str);
                    }
                    enumC1180 = EnumC1180.ACCEPTED;
                }
                return AbstractC4708.m13784(enumC1180, "text/plain; charset=UTF-8", "");
            } catch (JSONParseException unused2) {
                return C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32700, "Parse error");
            }
        } catch (Exception e) {
            if (e instanceof C15290) {
                EnumC1180 enumC1180M36300 = ((C15290) e).m36300();
                EnumC1180 enumC1182 = EnumC1180.PAYLOAD_TOO_LARGE;
                if (enumC1180M36300 == enumC1182) {
                    C8236 c8236M13789 = AbstractC4708.m13784(enumC1182, "text/plain; charset=UTF-8", "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON.");
                    c8236M13789.m21803();
                    return c8236M13789;
                }
            }
            C8236 c8236M27053 = C10821.m27053(EnumC1180.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
            c8236M27053.m21803();
            return c8236M27053;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m28540(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("jsonrpc");
        JSONValue jSONValue2 = jSONObject.get("id");
        JSONValue jSONValue3 = jSONObject.get(o.c);
        JSONValue jSONValue4 = jSONObject.get(d.O);
        boolean z = jSONValue2 != null && (jSONValue2.isString() || jSONValue2.isNumber() || jSONValue2.isNull());
        boolean z2 = (jSONValue3 == null) != (jSONValue4 == null);
        if (jSONValue != null && jSONValue.isString() && UMCrashManager.CM_VERSION.equals(jSONValue.asString()) && z && z2) {
            if (jSONValue4 == null) {
                return true;
            }
            if (jSONValue4.isObject()) {
                JSONValue jSONValue5 = jSONValue4.asObject().get("code");
                JSONValue jSONValue6 = jSONValue4.asObject().get("message");
                if (jSONValue5 != null && jSONValue5.isNumber() && jSONValue6 != null && jSONValue6.isString()) {
                    try {
                        jSONValue5.asLong();
                        return true;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28539(C15996 c15996) throws C15290 {
        String str = (String) ((HashMap) c15996.m37811()).get("content-length");
        if (str != null && Long.parseLong(str) > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C15290(EnumC1180.PAYLOAD_TOO_LARGE, "Request body too large");
        }
        if (c15996.m37808()) {
            String strM37809 = c15996.m37809();
            m28541(strM37809);
            return strM37809 == null ? "" : strM37809;
        }
        HashMap map = new HashMap();
        c15996.m37802(map);
        String str2 = (String) map.get("postData");
        String str3 = str2 != null ? str2 : "";
        m28541(str3);
        c15996.m37801(str3);
        return str3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m28541(String str) throws C15290 {
        int i;
        if (str == null) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                i3++;
            } else if (cCharAt < 2048) {
                i3 += 2;
            } else if (Character.isHighSurrogate(cCharAt) && (i = i2 + 1) < str.length() && Character.isLowSurrogate(str.charAt(i))) {
                i3 += 4;
                i2 = i;
            } else {
                i3 += 3;
            }
            if (i3 > 8388608) {
                throw new C15290(EnumC1180.PAYLOAD_TOO_LARGE, "Request body too large");
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28537(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get(e.s);
        if (jSONValue == null || !jSONValue.isString()) {
            return null;
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28538(C15996 c15996, C8236 c8236) {
        boolean zContainsKey;
        String str = (String) ((HashMap) c15996.m37811()).get("content-length");
        if (str != null) {
            zContainsKey = true;
            try {
                if (Long.parseLong(str) <= 0) {
                    zContainsKey = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            zContainsKey = ((HashMap) c15996.m37811()).containsKey("transfer-encoding");
        }
        if (!zContainsKey || c15996.m37808()) {
            return;
        }
        c8236.m21803();
    }
}
