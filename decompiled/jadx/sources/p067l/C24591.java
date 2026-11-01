package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.umeng.analytics.pro.C0655am;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A768 */
/* JADX INFO: loaded from: classes.dex */
public final class C24591 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f77873;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f77874;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f77875;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f77876;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f77877;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Start here for an overview of a zip_entry ELF in the base APK or edited session view. Returns summary metadata and complete unfiltered item counts, not detail lists. Copy a nextActions call to mt_apk_native_list_items for details. Use mt_apk_native_map_address for address conversion, mt_apk_native_disassemble for instruction text, and mt_apk_read_bytes for raw entry bytes.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Inspect Native ELF";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_inspect";
    }

    public C24591(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f77876 = c21180;
        this.f77873 = c23506;
        this.f77875 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f77874;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session view; pass an empty string to inspect the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  }\n}\n");
        this.f77874 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f77877;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("type", C3935.m7775("string", "ELF binary type.")).add("arch", C3935.m7775("string", "ELF architecture.")).add(C0655am.f2362w, C3935.m7775("string", "ELF CPU name.")).add("machine", C3935.m7775("string", "ELF machine name.")).add("abi", C3935.m7775("string", "ELF ABI.")).add(C0655am.f2363x, C3935.m7775("string", "Target OS.")).add("subsystem", C3935.m7775("string", "Subsystem.")).add("interpreter", C3935.m7775("string", "ELF interpreter path from metadata, or empty string.")).add("archBits", C3935.m7775("integer", "ELF class/ABI bit width. ARM32 ELF reports 32 even when Thumb instructions use 16-bit mode.")).add("hasVirtualAddress", C3935.m7775(ClassTransform.BOOLEAN, "Whether virtual addresses are present.")).add("positionIndependent", C3935.m7775(ClassTransform.BOOLEAN, "Whether the ELF is position independent.")).add("nx", C3935.m7775(ClassTransform.BOOLEAN, "Whether NX is enabled.")).add("canary", C3935.m7775(ClassTransform.BOOLEAN, "Whether a stack canary was detected.")).add("baseAddress", C3935.m7772("string", "ELF base address, or null.")).add("entryVirtualAddress", C3935.m7772("string", "Entry virtual address, or null.")).add("entryFileOffset", C3935.m7772("string", "Entry ELF file offset within the zip_entry bytes, or null.")).add("initVirtualAddress", C3935.m7772("string", "Init virtual address, or null.")).add("finiVirtualAddress", C3935.m7772("string", "Fini virtual address, or null."));
        JSONObject jSONObjectObject = JSON.object();
        String[] strArr = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};
        for (int i = 0; i < 9; i++) {
            String str = strArr[i];
            jSONObjectObject.add(str, C3935.m7775("integer", "Complete " + str + " count."));
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_native_inspect. ELF summary metadata and unfiltered counts. Use nextActions for detail lists.", C3935.m7762(jSONObjectAdd.add("counts", C3935.m7762(jSONObjectObject, "Complete ELF detail counts. Use mt_apk_native_list_items to read exactly one itemKind list; entries counts all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present. initArray and finiArray separately count .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.")), "ELF summary metadata for a ZIP entry. Detail lists are available only through mt_apk_native_list_items."), C3935.m7770(C3935.m7762(JSON.object(), "No tool-specific diagnostics.")), C3935.m7768("First-page native detail reads. Copy one action's arguments to mt_apk_native_list_items; each action already selects an itemKind with count > 0.", C3935.m7763(C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C3935.m7775("string", "ZIP entry locator for the native ELF.")).add("itemKind", C3935.m7769("ELF list to read; copy unchanged.", "neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations")).add("namePrefix", C3935.m7775("string", "Case-sensitive prefix of the raw item name; empty means no filter.")).add("demangle", C3935.m7775(ClassTransform.BOOLEAN, "Whether to include readable C++ names; filtering still uses raw names.")), "integer", "First page size; suggested value is 100 and maximum is 500.", "limit", "Arguments for mt_apk_native_list_items."), "mt_apk_native_list_items", "inspect")));
        this.f77877 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        final C2632 c2632M15155;
        C21180 c21180 = this.f77876;
        try {
            c2632M15155 = C6656.m15155(jSONObject);
            try {
                String str = c2632M15155.f4379;
                InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
                try {
                    C14663 c14663 = new C14663((JSONObject) c21180.m47824(str, new InterfaceC17825() { // from class: l.ܿ֫ۜ
                        @Override // p067l.InterfaceC17825
                        /* JADX INFO: renamed from: ֫ */
                        public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                            return C24591.m54231(this.f55389, c2632M15155, c16484, c17384);
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
                if (c2632M15155 != null) {
                    c21180.m47844(c2632M15155.f4379);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c2632M15155 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ JSONObject m54231(final C24591 c24591, final C2632 c2632, C16484 c16484, C17384 c17384) {
        C15372 c15372 = c24591.f77875;
        String str = c2632.f4376;
        String str2 = c2632.f4377;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ܳ֫ۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C24591.m54230(this.f45968, c2632, c9338);
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54230(C24591 c24591, C2632 c2632, C9338 c9338) throws C5276 {
        String str = c9338.f25443;
        try {
            c24591.f77873.getClass();
            return C13863.m31540(c2632, C17609.m40095(str));
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
