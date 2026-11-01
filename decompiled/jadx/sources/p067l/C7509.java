package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;

/* JADX INFO: renamed from: l.ۚܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7AC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7509 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f19724;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f19725;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f19726;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Search when the APK target is unknown. First call: target=overview, queryType=literal, caseSensitive=false, matchMode=contains, prefix=\"\", includeMatchOffsets=false, limit=50, snippetMaxChars=240; pass editSessionId=\"\" for the base APK. overview covers ZIP paths, decoded AXML, resource ids/names/values, dex names, and dex strings when available. Read notSearchedTargets and filterHint before treating zero hits as absence; select smali, native_symbols, native_strings, or resource_table_file_paths explicitly when needed. For native targets, prefix filters the SO entry path, not symbol names. Copy data.hits[i].locator for follow-up calls. Native parameters come from data.hits[i].hit.nativeLocation; follow its field descriptions to map values to tool arguments. Use mt_apk_native_list_items for symbol details, and mt_apk_read_bytes or mt_apk_native_xref for strings; snippet is context, not an address source. If xrefAddressKind and xrefAddress are present, use them for xref; strings use scanKind=data, referenceKinds=[\"data\"], instructionMode=auto, while functions use both and [\"call\",\"jump\",\"data\"]. ARM32 errors may provide thumb/arm retry actions. Imports may lack an xref address; inspect same-name relocations or non-imported symbols. Relocation references concern the slot, not a complete caller graph. Continue with mt_apk_continue when pagination.hasMore=true; totalAvailableCount=null means unknown. Narrow query or prefix to reduce scan work; limit only controls page size.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Search APK";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_search";
    }

    public C7509(C21180 c21180) {
        this.f19726 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f19724;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to search the edited session; pass an empty string to search the base workspace.\"\n  },\n  \"target\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"overview\",\n      \"files\",\n      \"resource_table_names\",\n      \"resource_table_values\",\n      \"resource_table_file_paths\",\n      \"dex_names\",\n      \"dex_strings\",\n      \"dex_string_members\",\n      \"smali\",\n      \"native_symbols\",\n      \"native_strings\"\n    ],\n    \"description\": \"Search target. Use overview when the target is unknown; it searches ZIP entry paths, decoded AXML, resource ids/names/decoded values, dex names, and dex strings when available, but not smali, native_symbols, native_strings, or the dedicated resource_table_file_paths target. Use files for ZIP entry paths and decoded AXML text, resource_table_names for resource ids/names, resource_table_values for decoded resource values, resource_table_file_paths only when specifically looking for resource values that point to APK ZIP entry paths, dex_names for class/field/method names, dex_strings for dex string values/literals grouped by class, dex_string_members for dex string values/literals grouped by field or method, smali for disassembled class text, native_symbols for raw and C++ demangled ELF import/symbol/relocation names plus raw entry names in lib/**/*.so, and native_strings for printable strings reported from ELF files.\"\n  },\n  \"query\": {\n    \"type\": \"string\",\n    \"description\": \"Text or regex pattern to search. queryType selects literal vs regex; caseSensitive and matchMode control matching.\"\n  },\n  \"queryType\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"literal\",\n      \"regex\"\n    ],\n    \"description\": \"Controls how query is interpreted.\"\n  },\n  \"caseSensitive\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether query matching is case-sensitive. Applies to literal and regex query matching only; prefix filtering is always literal and case-sensitive.\"\n  },\n  \"matchMode\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"contains\",\n      \"exact\"\n    ],\n    \"description\": \"Controls whether query can match a substring or must match an entire searchable value. Use contains by default. exact is invalid when target=smali.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Required candidate prefix filter; pass \\\"\\\" for no filter. overview requires \\\"\\\". For files, this is an APK ZIP entry path prefix like res/layout/. For native_symbols and native_strings, this is the SO ZIP entry path prefix such as lib/arm64-v8a/; it is not a symbol or string text prefix. For resource_table_* targets, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive. For dex_names, dex_strings, dex_string_members, and smali, this is a dex class owner prefix; pass a Java package, slash prefix, L-prefix, or full descriptor.\"\n  },\n  \"includeMatchOffsets\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, include hit.matchOffsets and matchedStrings[].matchOffsets. Offsets are zero-based UTF-16 positions in the original searched candidate, with end exclusive. Each text preview has a textStartOffset; subtract it from start/end to locate the match within the preview. Long matches may extend beyond the preview. Name candidates may use decoded or normalized aliases, so offsets are not byte offsets or edit ranges. Use data.hits[i].hit.nativeLocation.name as the raw native namePrefix source. Pass false normally, or true to inspect exact match spans.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum hits on this first page. Recommended value is 50; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  },\n  \"snippetMaxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum snippet length per hit. Recommended value is 240; maximum 1000 is enforced at runtime. Use 0 to disable snippets. For native hits, snippet is readable context only; data.hits[i].hit.nativeLocation remains available for follow-up parameters even when snippets are disabled or suppressed.\"\n  }\n}\n");
        this.f19724 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f19725;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM23761 = C10191.m23761();
        this.f19725 = jSONObjectM23761;
        return jSONObjectM23761;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C10191.m23753(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C21591 c21591M34048 = C14884.m34048(jSONObject);
            return m17403(C14884.m34030(c21591M34048, this.f19726.m47849(c21591M34048.f68079)), new C17502(), (String) null);
        } finally {
            int i = C10798.f29931;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m17404(C4763 c4763, JSONObject jSONObject, C17502 c17502) {
        return m17403(C14884.m34086(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c4763, jSONObject), c17502, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ֫ */
    private C14663 m17403(C24729 c24729, C17502 c17502, String str) throws Exception {
        String str2 = c24729.f78293;
        C21180 c21180 = this.f19726;
        InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
        try {
            C14663 c14663 = (C14663) c21180.m47822(str2, c24729.f78289, str, new C9469(this, c24729, c17502));
            c21180.m47844(str2);
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

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: ֫ */
    public static p067l.C14663 m17402(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m17401(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value("0x" + Long.toHexString(j));
    }
}
