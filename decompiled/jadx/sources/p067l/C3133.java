package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.֨֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T761 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3133 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f5708;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f5709;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f5710;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f5711;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f5712;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Map an ELF virtual address to a file offset, or the reverse, inside a zip_entry shared object. file_offset refers to SO bytes, not APK container offsets. Check data.found and data.mapping.isLoaded before treating an address as loaded; only disassemble when data.mapping.isExecutable=true. data.mapping.enclosingSymbol provides best-effort symbol context and follow-up hints for mt_apk_native_analyze_control_flow. A miss returns data.found=false rather than an error. See mapping fields for symbol and instruction-mode limitations.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Map Native Address";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_map_address";
    }

    public C3133(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f5711 = c21180;
        this.f5708 = c23506;
        this.f5710 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f5709;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to map the edited session view; pass an empty string to map the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"addressKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"virtual\", \"file_offset\"],\n    \"description\": \"Address kind. Use virtual for ELF virtual addresses or file_offset for ELF file offsets within the zip_entry bytes.\"\n  },\n  \"address\": {\n    \"type\": \"string\",\n    \"description\": \"Unsigned virtual address or ELF file offset string. Accepts decimal or 0x/0X hexadecimal in the non-negative signed 64-bit range 0..9223372036854775807.\"\n  }\n}\n");
        this.f5709 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f5712;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM31567 = C13863.m31567();
        this.f5712 = jSONObjectM31567;
        return jSONObjectM31567;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        final C7327 c7327M15157;
        C21180 c21180 = this.f5711;
        try {
            c7327M15157 = C6656.m15157(jSONObject);
            try {
                String str = c7327M15157.f19177;
                InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
                try {
                    C14663 c14663 = new C14663((JSONObject) c21180.m47824(str, new InterfaceC17825() { // from class: l.֡֫ۜ
                        @Override // p067l.InterfaceC17825
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                            return C3133.m5345(this.f3837, c7327M15157, c16484, c17384);
                        }
                    }));
                    interfaceC21173M47846.close();
                    c21180.m47844(str);
                    int i = C10798.f29931;
                    return c14663;
                } catch (Throwable th) {
                    try {
                        interfaceC21173M47846.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (c7327M15157 != null) {
                    c21180.m47844(c7327M15157.f19177);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c7327M15157 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m5345(final C3133 c3133, final C7327 c7327, C16484 c16484, C17384 c17384) {
        C15372 c15372 = c3133.f5710;
        String str = c7327.f19176;
        String str2 = c7327.f19175;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ۚ֫ۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C3133.m5344(this.f18682, c7327, c9338);
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m5344(C3133 c3133, C7327 c7327, C9338 c9338) throws C5276 {
        String str = c9338.f25443;
        try {
            C23506 c23506 = c3133.f5708;
            long j = c7327.f19171;
            boolean zEquals = "virtual".equals(c7327.f19174);
            c23506.getClass();
            return C13863.m31545(c7327, C17609.m40093(str, j, zEquals, true));
        } catch (RuntimeException unused) {
            throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.NULL, JSON.array());
    }
}
