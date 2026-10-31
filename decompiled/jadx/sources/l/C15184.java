package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;

/* JADX INFO: renamed from: l.ܶۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M75X */
/* JADX INFO: loaded from: classes4.dex */
public final class C15184 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f46394;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f46395;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f46396;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f46397;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f46398;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Find best-effort direct static references to an ELF address; this is not a complete caller graph or data-flow proof. file_offset is inside the SO entry, not the APK. For functions start with scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]; for strings, vtables, JNI tables, or function pointers use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto. Recommended maxScanBytes=1048576 and limit=50. ARM32 code/both scans require an explicit arm or thumb source mode; follow retry actions if needed. Executable ARM32 targets also match Thumb function pointers. Read scanSummary.meaning, completionReason, and warning before interpreting refs, especially empty results. targetMapped=false means no usable loaded file-backed target mapping; loaded data targets can still have references. Continue with mt_apk_continue when pagination.hasMore=true, including empty pages; totalAvailableCount=null means unknown. To change the target or scan settings, start a new call. For instruction refs, inspect sourceSymbol.startVirtualAddress with mt_apk_native_analyze_control_flow when available, otherwise sourceVirtualAddress, and copy resolvedInstructionMode; choose outputMode=summary for triage or full for details. For data refs, sourceSymbol identifies the slot owner, not a caller. Use mt_apk_native_disassemble for exact instruction bytes.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Find Native Xrefs";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_xref";
    }

    public C15184(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f46397 = c19793;
        this.f46394 = c22241;
        this.f46396 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f46395;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to scan the edited session view; pass an empty string to scan the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the SO zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned target address string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. ARM32 odd virtual targets are mapped exactly first; bit0 is cleared only for an executable mapping, while loaded non-executable odd targets stay exact.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. scanKind=data requires auto and ignores instruction decoding; non-ARM code/both requires auto; ARM32 code/both requires explicit thumb or arm. Odd ARM32 target virtual addresses do not choose the source scan mode.\"\n  },\n  \"scanKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"code\", \"data\", \"both\"],\n    \"description\": \"Scan domain. Use code for instruction references, data for relocation slots and aligned data pointers, or both for code first then data. For data use referenceKinds=[\\\"data\\\"]; for both include data in referenceKinds.\"\n  },\n  \"referenceKinds\": {\n    \"type\": \"array\",\n    \"description\": \"Reference kinds to return. Use [\\\"call\\\",\\\"jump\\\",\\\"data\\\"] with scanKind=both for symbol/function targets, [\\\"call\\\",\\\"jump\\\"] with scanKind=code for only call and branch/jump references, and [\\\"data\\\"] with scanKind=data for native strings, vtables, JNI tables, or function pointer arrays. Valid strings are call, jump, data, and unknown; jump covers branch/jump instructions.\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\"call\", \"jump\", \"data\", \"unknown\"]\n    }\n  },\n  \"maxScanBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code/data-pointer bytes to consume on this xref page. Recommended first call: 1048576. This field is required; valid range is 16..4194304. Relocation scanning uses a separate fixed per-page item budget. Continue keeps the original scan budget.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs to return on this page. Recommended first call: 50. This field is required; valid range is 1..200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f46395 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f46398;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29498 = C12095.m29498();
        this.f46398 = jSONObjectM29498;
        return jSONObjectM29498;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        C22150 c22150M13267;
        C19793 c19793 = this.f46397;
        try {
            c22150M13267 = C4511.m13267(jSONObject);
            try {
                C12936 c12936M35915 = m35915(c22150M13267, false, jSONObject.get("nextCursor"));
                c19793.m45533(c22150M13267.f71877);
                int i = C8869.f27007;
                return c12936M35915;
            } catch (Throwable th) {
                th = th;
                if (c22150M13267 != null) {
                    c19793.m45533(c22150M13267.f71877);
                }
                int i2 = C8869.f27007;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c22150M13267 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m35919(C2519 c2519, JSONObject jSONObject) throws Throwable {
        C19793 c19793 = this.f46397;
        C19793 c19794 = "address";
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM35917 = m35917(c2519, jSONObject);
            JSONObject jSONObject2 = c2519.f7997;
            JSONObject jSONObject3 = c2519.f7996;
            String strM35918 = m35918(c2519, "locator", jSONObject.get("nextCursor"));
            try {
                if (!strM35918.startsWith("zip_entry:") || strM35918.length() == 10) {
                    throw m35914(jSONObject.get("nextCursor"));
                }
                try {
                    String strSubstring = strM35918.substring(10);
                    String strM35919 = m35918(c2519, "addressKind", jSONObject.get("nextCursor"));
                    long jM35911 = m35911(jSONObject3, jSONObject.get("nextCursor"), "address");
                    String strM13257 = C4511.m13257(m35911(jSONObject3, jSONObject.get("nextCursor"), "address"));
                    try {
                        try {
                            String strM359110 = m35918(c2519, "instructionMode", jSONObject.get("nextCursor"));
                            String strM359111 = m35918(c2519, "scanKind", jSONObject.get("nextCursor"));
                            JSONValue jSONValue = jSONObject.get("nextCursor");
                            try {
                                C22150 c22150 = new C22150(string, string2, strM35918, strSubstring, strM35919, jM35911, strM13257, strM359110, strM359111, C2241.m7423(m35910(c2519, "referenceKindMask", jSONValue)), m35910(c2519, "maxScanBytes", jSONObject.get("nextCursor")), iM35917, jSONObject2.getInt("phaseIndex", -1), jSONObject2.getInt("rangeIndex", -1), m35911(jSONObject2, jSONObject.get("nextCursor"), "byteOffsetInRange"), jSONObject2.getInt("relocationIndex", -1), m35911(jSONObject3, jSONObject.get("nextCursor"), "entrySize"), m35911(jSONObject3, jSONObject.get("nextCursor"), "entryCrc"), m35911(jSONObject3, jSONObject.get("nextCursor"), "targetVirtualAddress"), m35918(c2519, "resolvedInstructionMode", jSONObject.get("nextCursor")), m35910(c2519, "bits", jSONObject.get("nextCursor")), m35918(c2519, "arch", jSONObject.get("nextCursor")));
                                m35916(c22150, jSONObject.get("nextCursor"));
                                C12936 c12936M35915 = m35915(c22150, true, jSONObject.get("nextCursor"));
                                if (!string.isEmpty()) {
                                    c19793.m45533(string);
                                }
                                int i = C8869.f27007;
                                return c12936M35915;
                            } catch (RuntimeException unused) {
                                try {
                                    throw m35914(jSONValue);
                                } catch (RuntimeException unused2) {
                                    throw m35914(jSONObject.get("nextCursor"));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            c19794 = c19793;
                        }
                    } catch (RuntimeException unused3) {
                    }
                } catch (RuntimeException unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            c19794 = c19793;
        }
        if (!string.isEmpty()) {
            c19794.m45533(string);
        }
        int i2 = C8869.f27007;
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12936 m35915(final C22150 c22150, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c22150.f71873 < 0 || c22150.f71874 < 0 || c22150.f71867 < 0 || c22150.f71857 < 0) {
            if (z) {
                throw m35914(jSONValue);
            }
            throw m35914((JSONValue) null);
        }
        C19793 c19793 = this.f46397;
        InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
        try {
            C12936 c12936 = new C12936((JSONObject) c19793.m45513(c22150.f71877, new InterfaceC16263() { // from class: l.֨ۧۜ
                @Override // l.InterfaceC16263
                /* JADX INFO: renamed from: ֫ */
                public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                    return C15184.m35912(this.f3932, c22150, z, jSONValue, c14852, c15799);
                }
            }));
            interfaceC19785M45535.close();
            return c12936;
        } catch (Throwable th) {
            try {
                interfaceC19785M45535.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m35912(final C15184 c15184, final C22150 c22150, final boolean z, final JSONValue jSONValue, C14852 c14852, C15799 c15799) throws C3059 {
        String str = c22150.f71875;
        final int iM37424 = c15799.m37424(c14852, str);
        if (z) {
            C18747.m43400(jSONValue.asString(), iM37424, c22150.f71877, str);
        }
        C13682 c13682 = c15184.f46396;
        String str2 = c22150.f71865;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.۠ۧۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C15184.m35913(this.f25099, z, c22150, jSONValue, iM37424, c7333);
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m35913(C15184 c15184, boolean z, C22150 c22150, JSONValue jSONValue, int i, C7333 c7333) throws C3059 {
        String strM43398;
        String str = c22150.f71875;
        long j = c7333.f22533;
        long j2 = c7333.f22534;
        if (!z || !str.isEmpty() || (c22150.f71862 == j2 && c22150.f71878 == j)) {
            C19420 c19420M15227 = C5308.m15227(c15184.f46394, c7333, c22150, z, jSONValue);
            C4043 c4043 = c19420M15227.f62818;
            C15645 c15645 = c19420M15227.f62823;
            if (c15645.f48149) {
                strM43398 = null;
            } else {
                String str2 = c22150.f71877;
                JSONObject jSONObjectAdd = JSON.object().add("locator", c22150.f71859).add("addressKind", c22150.f71870).add("address", c22150.f71858).add("instructionMode", c22150.f71864).add("scanKind", c22150.f71868).add("referenceKindMask", c22150.f71856).add("resolvedInstructionMode", c19420M15227.f62816).add("targetVirtualAddress", c4043.f12822).add("arch", c19420M15227.f62815).add("bits", c19420M15227.f62819).add("maxScanBytes", c22150.f71860);
                if (!str.isEmpty()) {
                    j2 = 0;
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                if (!str.isEmpty()) {
                    j = 0;
                }
                strM43398 = C18747.m43398("native_xref", str2, str, i, jSONObjectAdd2.add("entryCrc", j).add("recommendedLimit", c22150.f71869).add("limitMax", 200), JSON.object().add("phaseIndex", c15645.f48154).add("rangeIndex", c15645.f48153).add("byteOffsetInRange", c15645.f48152).add("relocationIndex", c15645.f48151));
            }
            return C12095.m29486(c22150, c19420M15227.f62816, c19420M15227.f62822, c4043, c19420M15227.f62815, c19420M15227.f62817, c19420M15227.f62821, c19420M15227.f62820, c15645, strM43398);
        }
        throw m35914(jSONValue);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35916(C22150 c22150, JSONValue jSONValue) throws C3059 {
        int i;
        int i2;
        String str = c22150.f71870;
        String str2 = c22150.f71868;
        if (!"virtual".equals(str) && !"file_offset".equals(str)) {
            throw m35914(jSONValue);
        }
        String str3 = c22150.f71864;
        if ("auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3)) {
            String str4 = c22150.f71863;
            if (("auto".equals(str4) || "arm".equals(str4) || "thumb".equals(str4)) && c22150.f71876 >= 0 && c22150.f71871 > 0 && !c22150.f71872.isEmpty() && (("code".equals(str2) || e.m.equals(str2) || "both".equals(str2)) && (i = c22150.f71856) != 0 && (i2 = c22150.f71860) >= 16 && i2 <= 4194304 && c22150.f71873 >= 0 && c22150.f71874 >= 0 && c22150.f71867 >= 0 && c22150.f71857 >= 0)) {
                try {
                    C3863.m11619(i, str2);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw m35914(jSONValue);
                }
            }
        }
        throw m35914(jSONValue);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35918(C2519 c2519, String str, JSONValue jSONValue) throws C3059 {
        JSONValue jSONValue2 = c2519.f7996.get(str);
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m35914(jSONValue);
        }
        return jSONValue2.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m35911(JSONObject jSONObject, JSONValue jSONValue, String str) throws C3059 {
        try {
            long j = jSONObject.getLong(str, -1L);
            if (j >= 0) {
                return j;
            }
            throw m35914(jSONValue);
        } catch (RuntimeException unused) {
            throw m35914(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35910(C2519 c2519, String str, JSONValue jSONValue) throws C3059 {
        try {
            int i = c2519.f7996.getInt(str, -1);
            if (i >= 0) {
                return i;
            }
            throw m35914(jSONValue);
        } catch (RuntimeException unused) {
            throw m35914(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m35917(C2519 c2519, JSONObject jSONObject) throws C3059 {
        int i = c2519.f7995;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM3253 = C0899.m3253(jSONValue);
            if (iM3253 >= 1 && iM3253 <= i) {
                return iM3253;
            }
            throw C3059.m9364("Invalid limit", "limit", JSON.value(iM3253), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m35914(JSONValue jSONValue) {
        return C3059.m9364("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONValue jSONValueM17828;
        if (C6450.m17827(c3059)) {
            jSONValueM17828 = C6450.m17828(c3059);
        } else {
            jSONValueM17828 = JSON.NULL;
        }
        return C19993.m46097(c3059, jSONValueM17828, c3059.f9604);
    }
}
