package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;

/* JADX INFO: renamed from: l.ܶۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M75X */
/* JADX INFO: loaded from: classes4.dex */
public final class C16799 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f49519;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f49520;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f49521;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f49522;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f49523;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Find best-effort direct static references to an ELF address; this is not a complete caller graph or data-flow proof. file_offset is inside the SO entry, not the APK. For functions start with scanKind=both and referenceKinds=[\"call\",\"jump\",\"data\"]; for strings, vtables, JNI tables, or function pointers use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto. Recommended maxScanBytes=1048576 and limit=50. ARM32 code/both scans require an explicit arm or thumb source mode; follow retry actions if needed. Executable ARM32 targets also match Thumb function pointers. Read scanSummary.meaning, completionReason, and warning before interpreting refs, especially empty results. targetMapped=false means no usable loaded file-backed target mapping; loaded data targets can still have references. Continue with mt_apk_continue when pagination.hasMore=true, including empty pages; totalAvailableCount=null means unknown. To change the target or scan settings, start a new call. For instruction refs, inspect sourceSymbol.startVirtualAddress with mt_apk_native_analyze_control_flow when available, otherwise sourceVirtualAddress, and copy resolvedInstructionMode; choose outputMode=summary for triage or full for details. For data refs, sourceSymbol identifies the slot owner, not a caller. Use mt_apk_native_disassemble for exact instruction bytes.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Find Native Xrefs";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_xref";
    }

    public C16799(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f49522 = c21180;
        this.f49519 = c23506;
        this.f49521 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f49520;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to scan the edited session view; pass an empty string to scan the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the SO zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned target address string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807. ARM32 odd virtual targets are mapped exactly first; bit0 is cleared only for an executable mapping, while loaded non-executable odd targets stay exact.\"\n  },\n  \"instructionMode\": {\n    \"type\": \"string\",\n    \"enum\": [\"auto\", \"arm\", \"thumb\"],\n    \"description\": \"Instruction mode. Use exactly auto, arm, or thumb. scanKind=data requires auto and ignores instruction decoding; non-ARM code/both requires auto; ARM32 code/both requires explicit thumb or arm. Odd ARM32 target virtual addresses do not choose the source scan mode.\"\n  },\n  \"scanKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"code\", \"data\", \"both\"],\n    \"description\": \"Scan domain. Use code for instruction references, data for relocation slots and aligned data pointers, or both for code first then data. For data use referenceKinds=[\\\"data\\\"]; for both include data in referenceKinds.\"\n  },\n  \"referenceKinds\": {\n    \"type\": \"array\",\n    \"description\": \"Reference kinds to return. Use [\\\"call\\\",\\\"jump\\\",\\\"data\\\"] with scanKind=both for symbol/function targets, [\\\"call\\\",\\\"jump\\\"] with scanKind=code for only call and branch/jump references, and [\\\"data\\\"] with scanKind=data for native strings, vtables, JNI tables, or function pointer arrays. Valid strings are call, jump, data, and unknown; jump covers branch/jump instructions.\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\"call\", \"jump\", \"data\", \"unknown\"]\n    }\n  },\n  \"maxScanBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum code/data-pointer bytes to consume on this xref page. Recommended first call: 1048576. This field is required; valid range is 16..4194304. Relocation scanning uses a separate fixed per-page item budget. Continue keeps the original scan budget.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs to return on this page. Recommended first call: 50. This field is required; valid range is 1..200. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f49520 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f49523;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31561 = C13863.m31561();
        this.f49523 = jSONObjectM31561;
        return jSONObjectM31561;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        C23420 c23420M15150;
        C21180 c21180 = this.f49522;
        try {
            c23420M15150 = C6656.m15150(jSONObject);
            try {
                C14663 c14663M38075 = m38075(c23420M15150, false, jSONObject.get("nextCursor"));
                c21180.m47844(c23420M15150.f74599);
                int i = C10798.f29931;
                return c14663M38075;
            } catch (Throwable th) {
                th = th;
                if (c23420M15150 != null) {
                    c21180.m47844(c23420M15150.f74599);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c23420M15150 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: ֫ */
    public final C14663 m38079(C4763 c4763, JSONObject jSONObject) throws Throwable {
        C21180 c21180 = this.f49522;
        C21180 c21181 = "address";
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM38077 = m38077(c4763, jSONObject);
            JSONObject jSONObject2 = c4763.f10789;
            JSONObject jSONObject3 = c4763.f10788;
            String strM38078 = m38078(c4763, "locator", jSONObject.get("nextCursor"));
            try {
                if (!strM38078.startsWith("zip_entry:") || strM38078.length() == 10) {
                    throw m38074(jSONObject.get("nextCursor"));
                }
                try {
                    String strSubstring = strM38078.substring(10);
                    String strM38079 = m38078(c4763, "addressKind", jSONObject.get("nextCursor"));
                    long jM38071 = m38071(jSONObject3, jSONObject.get("nextCursor"), "address");
                    String strM15140 = C6656.m15140(m38071(jSONObject3, jSONObject.get("nextCursor"), "address"));
                    try {
                        try {
                            String strM380710 = m38078(c4763, "instructionMode", jSONObject.get("nextCursor"));
                            String strM380711 = m38078(c4763, "scanKind", jSONObject.get("nextCursor"));
                            JSONValue jSONValue = jSONObject.get("nextCursor");
                            try {
                                C23420 c23420 = new C23420(string, string2, strM38078, strSubstring, strM38079, jM38071, strM15140, strM380710, strM380711, C4498.m9505(m38070(c4763, "referenceKindMask", jSONValue)), m38070(c4763, "maxScanBytes", jSONObject.get("nextCursor")), iM38077, jSONObject2.getInt("phaseIndex", -1), jSONObject2.getInt("rangeIndex", -1), m38071(jSONObject2, jSONObject.get("nextCursor"), "byteOffsetInRange"), jSONObject2.getInt("relocationIndex", -1), m38071(jSONObject3, jSONObject.get("nextCursor"), "entrySize"), m38071(jSONObject3, jSONObject.get("nextCursor"), "entryCrc"), m38071(jSONObject3, jSONObject.get("nextCursor"), "targetVirtualAddress"), m38078(c4763, "resolvedInstructionMode", jSONObject.get("nextCursor")), m38070(c4763, "bits", jSONObject.get("nextCursor")), m38078(c4763, "arch", jSONObject.get("nextCursor")));
                                m38076(c23420, jSONObject.get("nextCursor"));
                                C14663 c14663M38075 = m38075(c23420, true, jSONObject.get("nextCursor"));
                                if (!string.isEmpty()) {
                                    c21180.m47844(string);
                                }
                                int i = C10798.f29931;
                                return c14663M38075;
                            } catch (RuntimeException unused) {
                                try {
                                    throw m38074(jSONValue);
                                } catch (RuntimeException unused2) {
                                    throw m38074(jSONObject.get("nextCursor"));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            c21181 = c21180;
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
            c21181 = c21180;
        }
        if (!string.isEmpty()) {
            c21181.m47844(string);
        }
        int i2 = C10798.f29931;
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    private C14663 m38075(final C23420 c23420, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c23420.f74595 < 0 || c23420.f74596 < 0 || c23420.f74589 < 0 || c23420.f74579 < 0) {
            if (z) {
                throw m38074(jSONValue);
            }
            throw m38074((JSONValue) null);
        }
        C21180 c21180 = this.f49522;
        InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
        try {
            C14663 c14663 = new C14663((JSONObject) c21180.m47824(c23420.f74599, new InterfaceC17825() { // from class: l.֨ۧۜ
                @Override // p067l.InterfaceC17825
                /* JADX INFO: renamed from: ֫ */
                public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                    return C16799.m38072(this.f6703, c23420, z, jSONValue, c16484, c17384);
                }
            }));
            interfaceC21173M47846.close();
            return c14663;
        } catch (Throwable th) {
            try {
                interfaceC21173M47846.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m38072(final C16799 c16799, final C23420 c23420, final boolean z, final JSONValue jSONValue, C16484 c16484, C17384 c17384) throws C5276 {
        String str = c23420.f74597;
        final int iM39595 = c17384.m39595(c16484, str);
        if (z) {
            C20186.m45667(jSONValue.asString(), iM39595, c23420.f74599, str);
        }
        C15372 c15372 = c16799.f49521;
        String str2 = c23420.f74587;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.۠ۧۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C16799.m38073(this.f28012, z, c23420, jSONValue, iM39595, c9338);
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m38073(C16799 c16799, boolean z, C23420 c23420, JSONValue jSONValue, int i, C9338 c9338) throws C5276 {
        String strM45665;
        String str = c23420.f74597;
        long j = c9338.f25446;
        long j2 = c9338.f25447;
        if (!z || !str.isEmpty() || (c23420.f74584 == j2 && c23420.f74600 == j)) {
            C20825 c20825M17131 = C7413.m17131(c16799.f49519, c9338, c23420, z, jSONValue);
            C6211 c6211 = c20825M17131.f65431;
            C17237 c17237 = c20825M17131.f65436;
            if (c17237.f51289) {
                strM45665 = null;
            } else {
                String str2 = c23420.f74599;
                JSONObject jSONObjectAdd = JSON.object().add("locator", c23420.f74581).add("addressKind", c23420.f74592).add("address", c23420.f74580).add("instructionMode", c23420.f74586).add("scanKind", c23420.f74590).add("referenceKindMask", c23420.f74578).add("resolvedInstructionMode", c20825M17131.f65429).add("targetVirtualAddress", c6211.f15637).add("arch", c20825M17131.f65428).add("bits", c20825M17131.f65432).add("maxScanBytes", c23420.f74582);
                if (!str.isEmpty()) {
                    j2 = 0;
                }
                JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                if (!str.isEmpty()) {
                    j = 0;
                }
                strM45665 = C20186.m45665("native_xref", str2, str, i, jSONObjectAdd2.add("entryCrc", j).add("recommendedLimit", c23420.f74591).add("limitMax", 200), JSON.object().add("phaseIndex", c17237.f51294).add("rangeIndex", c17237.f51293).add("byteOffsetInRange", c17237.f51292).add("relocationIndex", c17237.f51291));
            }
            return C13863.m31549(c23420, c20825M17131.f65429, c20825M17131.f65435, c6211, c20825M17131.f65428, c20825M17131.f65430, c20825M17131.f65434, c20825M17131.f65433, c17237, strM45665);
        }
        throw m38074(jSONValue);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38076(C23420 c23420, JSONValue jSONValue) throws C5276 {
        int i;
        int i2;
        String str = c23420.f74592;
        String str2 = c23420.f74590;
        if (!"virtual".equals(str) && !"file_offset".equals(str)) {
            throw m38074(jSONValue);
        }
        String str3 = c23420.f74586;
        if ("auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3)) {
            String str4 = c23420.f74585;
            if (("auto".equals(str4) || "arm".equals(str4) || "thumb".equals(str4)) && c23420.f74598 >= 0 && c23420.f74593 > 0 && !c23420.f74594.isEmpty() && (("code".equals(str2) || AbstractC0213e.f989m.equals(str2) || "both".equals(str2)) && (i = c23420.f74578) != 0 && (i2 = c23420.f74582) >= 16 && i2 <= 4194304 && c23420.f74595 >= 0 && c23420.f74596 >= 0 && c23420.f74589 >= 0 && c23420.f74579 >= 0)) {
                try {
                    C6040.m13555(i, str2);
                    return;
                } catch (IllegalArgumentException unused) {
                    throw m38074(jSONValue);
                }
            }
        }
        throw m38074(jSONValue);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m38078(C4763 c4763, String str, JSONValue jSONValue) throws C5276 {
        JSONValue jSONValue2 = c4763.f10788.get(str);
        if (jSONValue2 == null || !jSONValue2.isString()) {
            throw m38074(jSONValue);
        }
        return jSONValue2.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m38071(JSONObject jSONObject, JSONValue jSONValue, String str) throws C5276 {
        try {
            long j = jSONObject.getLong(str, -1L);
            if (j >= 0) {
                return j;
            }
            throw m38074(jSONValue);
        } catch (RuntimeException unused) {
            throw m38074(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m38070(C4763 c4763, String str, JSONValue jSONValue) throws C5276 {
        try {
            int i = c4763.f10788.getInt(str, -1);
            if (i >= 0) {
                return i;
            }
            throw m38074(jSONValue);
        } catch (RuntimeException unused) {
            throw m38074(jSONValue);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m38077(C4763 c4763, JSONObject jSONObject) throws C5276 {
        int i = c4763.f10787;
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null || !jSONValue.isNumber()) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
        try {
            int iM5572 = C3223.m5572(jSONValue);
            if (iM5572 >= 1 && iM5572 <= i) {
                return iM5572;
            }
            throw C5276.m11406("Invalid limit", "limit", JSON.value(iM5572), JSON.array("1.." + i), (JSONObject) null);
        } catch (RuntimeException unused) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array("1.." + i), (JSONObject) null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m38074(JSONValue jSONValue) {
        return C5276.m11406("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONValue jSONValueM19775;
        if (C8498.m19774(c5276)) {
            jSONValueM19775 = C8498.m19775(c5276);
        } else {
            jSONValueM19775 = JSON.NULL;
        }
        return C21370.m48412(c5276, jSONValueM19775, c5276.f12407);
    }
}
