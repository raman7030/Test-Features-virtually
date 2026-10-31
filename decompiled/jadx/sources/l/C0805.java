package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T761 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0805 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f2937;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f2938;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f2939;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f2940;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f2941;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo3036() {
        return "Map an ELF virtual address to a file offset, or the reverse, inside a zip_entry shared object. file_offset refers to SO bytes, not APK container offsets. Check data.found and data.mapping.isLoaded before treating an address as loaded; only disassemble when data.mapping.isExecutable=true. data.mapping.enclosingSymbol provides best-effort symbol context and follow-up hints for mt_apk_native_analyze_control_flow. A miss returns data.found=false rather than an error. See mapping fields for symbol and instruction-mode limitations.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String mo3037() {
        return "Map Native Address";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String mo3040() {
        return "mt_apk_native_map_address";
    }

    public C0805(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f2940 = c19793;
        this.f2937 = c22241;
        this.f2939 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f2938;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to map the edited session view; pass an empty string to map the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  }\n}\n");
        this.f2938 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f2941;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM29504 = C12095.m29504();
        this.f2941 = jSONObjectM29504;
        return jSONObjectM29504;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        final C5217 c5217M13274;
        C19793 c19793 = this.f2940;
        try {
            c5217M13274 = C4511.m13274(jSONObject);
            try {
                String str = c5217M13274.f16337;
                InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
                try {
                    C12936 c12936 = new C12936((JSONObject) c19793.m45513(str, new InterfaceC16263() { // from class: l.֡֫ۜ
                        @Override // l.InterfaceC16263
                        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                            return C0805.m3032(this.f1063, c5217M13274, c14852, c15799);
                        }
                    }));
                    interfaceC19785M45535.close();
                    c19793.m45533(str);
                    int i = C8869.f27007;
                    return c12936;
                } catch (Throwable th) {
                    try {
                        interfaceC19785M45535.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (c5217M13274 != null) {
                    c19793.m45533(c5217M13274.f16337);
                }
                int i2 = C8869.f27007;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c5217M13274 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m3032(final C0805 c0805, final C5217 c5217, C14852 c14852, C15799 c15799) {
        C13682 c13682 = c0805.f2939;
        String str = c5217.f16336;
        String str2 = c5217.f16335;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ۚ֫ۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final Object mo14558(C7333 c7333) {
                return C0805.m3031(this.f15850, c5217, c7333);
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m3031(C0805 c0805, C5217 c5217, C7333 c7333) throws C3059 {
        String str = c7333.f22530;
        try {
            C22241 c22241 = c0805.f2937;
            long j = c5217.f16331;
            boolean zEquals = "virtual".equals(c5217.f16334);
            c22241.getClass();
            return C12095.m29482(c5217, C16036.m37906(str, j, zEquals, true));
        } catch (RuntimeException unused) {
            throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, JSON.array());
    }
}
