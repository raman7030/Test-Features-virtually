package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONParseException;
import bin.p000mt.json.JSONValue;
import bin.p000mt.plus.R;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.umeng.analytics.pro.C0708d;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۨۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C7AH */
/* JADX INFO: loaded from: classes4.dex */
public class C13441 extends AbstractC6843 {

    /* JADX INFO: renamed from: ۖ */
    public final C18016 f37740;

    /* JADX INFO: renamed from: ۘ */
    public final C12100 f37741;

    /* JADX INFO: renamed from: ۡ */
    public final String f37742;

    /* JADX INFO: renamed from: ܺ */
    public final C15451 f37743;

    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC8076 f37744;

    /* JADX INFO: renamed from: ᩵ */
    public final String f37745;

    public C13441(int i, C12100 c12100, JSONObject jSONObject, C13993 c13993, C18016 c18016, C7374 c7374) {
        JSONValue jSONValue;
        super(i);
        this.f37742 = "/mcp";
        C12826.requireNonNull(c12100, "protocolVersions");
        this.f37741 = c12100;
        String str = "MCP";
        if (jSONObject != null && (jSONValue = jSONObject.get("name")) != null && jSONValue.isString()) {
            String strTrim = jSONValue.asString().trim();
            if (!strTrim.isEmpty()) {
                str = strTrim;
            }
        }
        this.f37745 = str;
        this.f37740 = c18016;
        C12826.requireNonNull(c7374, "requestAuthenticator");
        this.f37744 = c7374;
        this.f37743 = new C15451(c12100, jSONObject, c13993);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012a  */
    @Override // p067l.AbstractC6843
    /* JADX INFO: renamed from: ֫ */
    public final C10196 mo15672(C17571 c17571) {
        boolean z;
        EnumC3490 enumC3490;
        EnumC3490 enumC3491;
        String str;
        String strM39990 = c17571.m39990();
        String str2 = this.f37742;
        if (!str2.equals(strM39990)) {
            C10196 c10196M15660 = AbstractC6843.m15660(EnumC3490.NOT_FOUND, "text/plain; charset=UTF-8", "Not Found");
            m30586(c17571, c10196M15660);
            return c10196M15660;
        }
        if (c17571.m39993() == EnumC6173.GET) {
            C10196 c10196M15661 = AbstractC6843.m15660(EnumC3490.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C7050.m16203(R.string.MT_Protector, this.f37745));
            c10196M15661.m23774("Allow", "POST");
            m30586(c17571, c10196M15661);
            return c10196M15661;
        }
        if (c17571.m39993() != EnumC6173.POST) {
            C10196 c10196M15662 = AbstractC6843.m15660(EnumC3490.METHOD_NOT_ALLOWED, "text/plain; charset=UTF-8", C6988.m16053("Only POST ", str2, " is supported"));
            c10196M15662.m23774("Allow", "POST");
            m30586(c17571, c10196M15662);
            return c10196M15662;
        }
        String str3 = (String) ((HashMap) c17571.m39997()).get("accept");
        if (str3 != null && !str3.trim().isEmpty()) {
            HashSet hashSet = new HashSet();
            for (String str4 : str3.split(",")) {
                String lowerCase = str4.split(C0249l.f1196b, 2)[0].trim().toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    hashSet.add(lowerCase);
                }
            }
            if (!hashSet.contains("application/json") && !hashSet.contains("application/*") && !hashSet.contains("*/*")) {
                C10196 c10196M15663 = AbstractC6843.m15660(EnumC3490.NOT_ACCEPTABLE, "text/plain; charset=UTF-8", "Accept must allow application/json");
                m30586(c17571, c10196M15663);
                return c10196M15663;
            }
        }
        String str5 = (String) ((HashMap) c17571.m39997()).get("origin");
        if (str5 != null && !str5.isEmpty()) {
            try {
                C18016 c18016 = this.f37740;
                URI uriCreate = URI.create(str5);
                int i = c18016.f53784;
                if (C0170a.f680s.equals(uriCreate.getScheme()) && uriCreate.getPort() == i) {
                    String host = uriCreate.getHost();
                    z = ("127.0.0.1".equals(host) || "localhost".equalsIgnoreCase(host)) ? true : C18882.m42969().contains(host);
                }
            } catch (Exception unused) {
            }
        }
        if (!z) {
            C10196 c10196M15664 = AbstractC6843.m15660(EnumC3490.FORBIDDEN, "text/plain; charset=UTF-8", "Origin is not allowed");
            m30586(c17571, c10196M15664);
            return c10196M15664;
        }
        C14111 c14111Mo17088 = this.f37744.mo17088(c17571);
        if (!C14111.m32037(c14111Mo17088)) {
            C10196 c10196M32034 = C14111.m32034(c14111Mo17088);
            m30586(c17571, c10196M32034);
            return c10196M32034;
        }
        try {
            try {
                JSONValue jSONValue = JSON.parse(m30587(c17571));
                boolean zIsArray = jSONValue.isArray();
                C15451 c15451 = this.f37743;
                C12100 c12100 = this.f37741;
                if (!zIsArray) {
                    if (!jSONValue.isObject()) {
                        return C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                    }
                    JSONObject jSONObjectAsObject = jSONValue.asObject();
                    if (!"initialize".equals(m30585(jSONObjectAsObject))) {
                        String str6 = (String) ((HashMap) c17571.m39997()).get("mcp-protocol-version");
                        if (!c12100.m27953(str6 != null ? str6 : "2025-03-26")) {
                            return C12653.m29098(EnumC3490.BAD_REQUEST, jSONObjectAsObject.get("id"), -32600, "Invalid MCP-Protocol-Version");
                        }
                    }
                    if (jSONObjectAsObject.get(AbstractC0213e.f995s) == null && !(jSONObjectAsObject.get(C0252o.f1208c) == null && jSONObjectAsObject.get(C0708d.f2599O) == null)) {
                        return m30588(jSONObjectAsObject) ? AbstractC6843.m15660(EnumC3490.ACCEPTED, "text/plain; charset=UTF-8", "") : AbstractC6843.m15660(EnumC3490.BAD_REQUEST, "text/plain; charset=UTF-8", "Invalid JSON-RPC response");
                    }
                    return c15451.m35201(jSONObjectAsObject).m53448();
                }
                JSONArray<JSONValue> jSONArrayAsArray = jSONValue.asArray();
                String str7 = (String) ((HashMap) c17571.m39997()).get("mcp-protocol-version");
                if (str7 == null) {
                    str7 = "2025-03-26";
                }
                if (!c12100.m27953(str7)) {
                    return C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32600, "Invalid MCP-Protocol-Version");
                }
                if (!"2025-03-26".equals(str7)) {
                    return C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32600, "Batch requests are not supported");
                }
                if (jSONArrayAsArray.size() == 0) {
                    return C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
                }
                boolean z2 = false;
                boolean z3 = false;
                for (JSONValue jSONValue2 : jSONArrayAsArray) {
                    if (jSONValue2.isObject()) {
                        JSONObject jSONObjectAsObject2 = jSONValue2.asObject();
                        if (jSONObjectAsObject2.get(AbstractC0213e.f995s) == null && !(jSONObjectAsObject2.get(C0252o.f1208c) == null && jSONObjectAsObject2.get(C0708d.f2599O) == null)) {
                            if (!m30588(jSONValue2.asObject())) {
                                enumC3491 = EnumC3490.BAD_REQUEST;
                                str = "Invalid JSON-RPC response batch";
                                return AbstractC6843.m15660(enumC3491, "text/plain; charset=UTF-8", str);
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
                            if ("initialize".equals(m30585(jSONObjectAsObject3))) {
                                JSONValue jSONValue4 = jSONObjectAsObject3.get("jsonrpc");
                                if (jSONObjectAsObject3.get("id") != null || jSONValue4 == null || !jSONValue4.isString() || !UMCrashManager.CM_VERSION.equals(jSONValue4.asString()) || m30585(jSONObjectAsObject3) == null) {
                                    jSONArrayArray.add(C12653.m29097(jSONObjectAsObject3.get("id"), -32600, "Initialize requests must not be batched"));
                                }
                            } else {
                                JSONValue jSONValueM53447 = c15451.m35201(jSONObjectAsObject3).m53447();
                                if (jSONValueM53447 != null) {
                                    jSONArrayArray.add(jSONValueM53447);
                                }
                            }
                        } else {
                            jSONArrayArray.add(C12653.m29097(JSON.NULL, -32600, "Invalid Request"));
                        }
                    }
                    if (jSONArrayArray.size() != 0) {
                        return AbstractC6843.m15660(EnumC3490.OK, "application/json", jSONArrayArray.toString());
                    }
                    enumC3490 = EnumC3490.ACCEPTED;
                } else {
                    if (z3) {
                        enumC3491 = EnumC3490.BAD_REQUEST;
                        str = "JSON-RPC response batches cannot contain requests or notifications";
                        return AbstractC6843.m15660(enumC3491, "text/plain; charset=UTF-8", str);
                    }
                    enumC3490 = EnumC3490.ACCEPTED;
                }
                return AbstractC6843.m15660(enumC3490, "text/plain; charset=UTF-8", "");
            } catch (JSONParseException unused2) {
                return C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32700, "Parse error");
            }
        } catch (Exception e) {
            if (e instanceof C16900) {
                EnumC3490 enumC3490M38461 = ((C16900) e).m38461();
                EnumC3490 enumC3492 = EnumC3490.PAYLOAD_TOO_LARGE;
                if (enumC3490M38461 == enumC3492) {
                    C10196 c10196M15665 = AbstractC6843.m15660(enumC3492, "text/plain; charset=UTF-8", "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON.");
                    c10196M15665.m23772();
                    return c10196M15665;
                }
            }
            C10196 c10196M29098 = C12653.m29098(EnumC3490.BAD_REQUEST, JSON.NULL, -32600, "Invalid Request");
            c10196M29098.m23772();
            return c10196M29098;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m30588(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get("jsonrpc");
        JSONValue jSONValue2 = jSONObject.get("id");
        JSONValue jSONValue3 = jSONObject.get(C0252o.f1208c);
        JSONValue jSONValue4 = jSONObject.get(C0708d.f2599O);
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

    /* JADX INFO: renamed from: ۧ */
    public static String m30587(C17571 c17571) throws C16900 {
        String str = (String) ((HashMap) c17571.m39997()).get("content-length");
        if (str != null && Long.parseLong(str) > X931RNG.BLOCK128_RESEED_MAX) {
            throw new C16900(EnumC3490.PAYLOAD_TOO_LARGE, "Request body too large");
        }
        if (c17571.m39994()) {
            String strM39995 = c17571.m39995();
            m30589(strM39995);
            return strM39995 == null ? "" : strM39995;
        }
        HashMap map = new HashMap();
        c17571.m39988(map);
        String str2 = (String) map.get("postData");
        String str3 = str2 != null ? str2 : "";
        m30589(str3);
        c17571.m39987(str3);
        return str3;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m30589(String str) throws C16900 {
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
                throw new C16900(EnumC3490.PAYLOAD_TOO_LARGE, "Request body too large");
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30585(JSONObject jSONObject) {
        JSONValue jSONValue = jSONObject.get(AbstractC0213e.f995s);
        if (jSONValue == null || !jSONValue.isString()) {
            return null;
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30586(C17571 c17571, C10196 c10196) {
        boolean zContainsKey;
        String str = (String) ((HashMap) c17571.m39997()).get("content-length");
        if (str != null) {
            zContainsKey = true;
            try {
                if (Long.parseLong(str) <= 0) {
                    zContainsKey = false;
                }
            } catch (NumberFormatException unused) {
            }
        } else {
            zContainsKey = ((HashMap) c17571.m39997()).containsKey("transfer-encoding");
        }
        if (!zContainsKey || c17571.m39994()) {
            return;
        }
        c10196.m23772();
    }
}
