package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P75X */
/* JADX INFO: loaded from: classes.dex */
public final class C23652 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f76623;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f76624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f76625;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f76626;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f76627;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "List the first page of one ELF detail list. Start with mt_apk_native_inspect and copy a nextActions call; for later pages use mt_apk_continue with the returned action arguments. mt_apk_native_inspect.counts is unfiltered. This tool returns items and pagination.totalAvailableCount after applying namePrefix; zero means no items match that filter, not necessarily that the ELF has no items of this kind. Use namePrefix=\"\" and limit=100 initially. For initArray/finiArray, disassemble targetVirtualAddress when available, otherwise targetFileOffset, using targetInstructionMode and stopAtSymbolBoundary=true. If neither target address exists, inspect the slot bytes with mt_apk_read_bytes: convert slotFileOffset to decimal byteOffset and use maxBytes=pointerSize. A missing library name is returned as an empty string. See input fields for item kinds and filtering rules.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "List Native ELF Items";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_list_items";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52169(C23652 c23652, boolean z, C21445 c21445, JSONValue jSONValue, int i, C7333 c7333) throws C3059 {
        String strM43398;
        String str = c21445.f69038;
        long j = c7333.f22533;
        long j2 = c7333.f22534;
        if (!z || !str.isEmpty() || (c21445.f69033 == j2 && c21445.f69029 == j)) {
            String str2 = c7333.f22530;
            try {
                try {
                    C22241 c22241 = c23652.f76623;
                    String str3 = c21445.f69034;
                    String str4 = c21445.f69032;
                    boolean z2 = c21445.f69036;
                    int i2 = c21445.f69031;
                    int i3 = c21445.f69030;
                    int i4 = c21445.f69040;
                    c22241.getClass();
                    C21682 c21682M37912 = C16036.m37912(str2, str3, str4, z2, i2, i3, i4);
                    try {
                        m52172(c21445, c21682M37912, z, jSONValue);
                        long size = ((long) c21682M37912.f69556) + ((long) c21682M37912.f69553.size());
                        int i5 = c21682M37912.f69555;
                        if (size >= i5) {
                            strM43398 = null;
                        } else {
                            String str5 = c21445.f69035;
                            JSONObject jSONObjectAdd = JSON.object().add("locator", c21445.f69039).add("itemKind", c21445.f69034).add("namePrefix", c21445.f69032).add("demangle", c21445.f69036);
                            if (!str.isEmpty()) {
                                j2 = 0;
                            }
                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                            if (!str.isEmpty()) {
                                j = 0;
                            }
                            strM43398 = C18747.m43398("native_items", str5, str, i, jSONObjectAdd2.add("entryCrc", j).add("totalCount", i5).add("recommendedLimit", c21445.f69030).add("limitMax", 500), JSON.object().add("offset", (int) size));
                        }
                        return C12095.m29485(c21445, c21682M37912, strM43398);
                    } catch (IllegalArgumentException unused) {
                        if (z) {
                            throw m52170(jSONValue);
                        }
                        throw m52174();
                    }
                } catch (IllegalArgumentException unused2) {
                }
            } catch (RuntimeException unused3) {
                throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            throw m52170(jSONValue);
        }
    }

    public C23652(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f76626 = c19793;
        this.f76623 = c22241;
        this.f76625 = c13682;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f76624;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session view; pass an empty string to read the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"itemKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"neededLibraries\", \"sections\", \"segments\", \"imports\", \"symbols\", \"entries\", \"initArray\", \"finiArray\", \"relocations\"],\n    \"description\": \"ELF list to read. Prefer copying this from the mt_apk_native_inspect result's nextActions. For manual calls, use one of neededLibraries, sections, segments, imports, symbols, entries, initArray, finiArray, or relocations; if mt_apk_native_inspect reported count 0 for that itemKind, this returns an empty page. entries means all loader-recognized entry point records with stable entryN names, including program, init, fini, and preinit entries when present. initArray and finiArray separately read .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.\"\n  },\n  \"namePrefix\": {\n    \"type\": \"string\",\n    \"description\": \"Case-sensitive literal prefix for the returned item name only. Pass an empty string for no filter. entries uses stable generated entryN names; other named item kinds keep their raw ELF names. It does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter; the so file is selected only by locator. initArray/finiArray items have no name, so non-empty namePrefix matches no items.\"\n  },\n  \"demangle\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, add demangledName for imports, symbols, and relocations when C++ Itanium demangling succeeds. namePrefix still matches only name. This has no effect for entries, initArray, or finiArray. Pass false by default; use true when readable C++ symbols help interpretation.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size. Pass 100 by default; valid range is 1..500.\"\n  }\n}\n");
        this.f76624 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f76627;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_native_list_items. One filtered ELF detail page. Read filterHint before interpreting an empty page; use nextActions to continue.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("itemKind", C1648.m5545("string", "ELF item kind returned on this page.")).add("namePrefix", C1648.m5545("string", "Case-sensitive literal prefix for the returned item name only. Empty string means no filter; it does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter. entries uses generated entryN names; initArray/finiArray items have no name, so non-empty namePrefix matches no items.")).add("demangle", C1648.m5545(ClassTransform.BOOLEAN, "Whether imports, symbols, and relocations include best-effort C++ demangledName values. This flag does not affect pagination, counts, or namePrefix filtering, and has no effect for entries, initArray, or finiArray.")).add("filterHint", C18736.m43390(JSON.object().add("code", C1648.m5545("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=name_prefix_not_applicable means itemKind has no name field and non-empty namePrefix filtered out every item. Empty code/message means no hint applies.")).add("items", C7416.m19939("type", "array", "description", "ELF items for data.itemKind. neededLibraries items use {name}; sections and segments use the section shape; imports use the import shape; symbols and entries use the symbol shape. entries contain all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present, and use stable generated entryN names. initArray and finiArray use the .init_array/.fini_array pointer-slot shape, may describe the same lifecycle target with slot metadata, and have no name field. imports, symbols, and relocations may include demangledName and library=\"\" when ELF metadata does not identify a source shared library; entries always use an empty demangledName and library. relocations use the relocation shape.").add("items", JSON.object().add("anyOf", JSON.array().add(C18736.m43390(JSON.object(), "string", "Needed library name.", "name", "Needed shared library item.")).add(C18736.m43390(JSON.object().add("name", C1648.m5545("string", "Name.")).add("type", C1648.m5545("string", "Type.")).add("arch", C1648.m5545("string", "Architecture.")).add("virtualAddress", C1648.m5542("string", "Virtual address, or null.")).add("fileOffset", C1648.m5542("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C1648.m5545("integer", "File size.")).add("virtualSize", C1648.m5545("integer", "Virtual size.")).add("permissions", C1648.m5545("integer", "Permission bitset.")).add("flags", C1648.m5545("integer", "Flag bitset.")).add(e.m, C1648.m5545(ClassTransform.BOOLEAN, "Whether this range is data.")), ClassTransform.BOOLEAN, "Whether this item is a segment.", "segment", "ELF section or segment item.")).add(C18736.m43390(JSON.object().add("name", C1648.m5545("string", "Import name.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled import name when requested and different from name, otherwise empty string.")).add("library", C1648.m5545("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C1648.m5545("string", "Binding.")).add("type", C1648.m5545("string", "Type.")).add("className", C1648.m5545("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java class name.")).add("descriptor", C1648.m5545("string", "ELF/analyzer descriptor metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java method descriptor.")).add("ordinal", C1648.m5545("integer", "Ordinal.")).add("inSectionHeader", C1648.m5545(ClassTransform.BOOLEAN, "Whether the import is in a section header.")), ClassTransform.BOOLEAN, "Always true for the imports itemKind because this list represents ELF imports; do not use it to infer the provider library.", "imported", "ELF import item.")).add(C18736.m43390(JSON.object().add("name", C1648.m5545("string", "Raw ELF symbol name, or a stable generated entryN name for an entries item.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled symbol name when requested and different from name; always empty for entries.")).add("className", C1648.m5545("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO symbols usually leave this empty; do not treat it as a Dex/Java class name.")).add("library", C1648.m5545("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C1648.m5545("string", "Binding.")).add("type", C1648.m5545("string", "Type.")).add("imported", C1648.m5545(ClassTransform.BOOLEAN, "Whether this item is imported.")).add("virtualAddress", C1648.m5542("string", "Virtual address, or null.")).add("fileOffset", C1648.m5542("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C1648.m5545("integer", "Symbol size.")), "integer", "Symbol bit width reported by ELF metadata.", "symbolBits", "ELF symbol or entry item.")).add(C18736.m43390(JSON.object().add("arrayName", C1648.m5545("string", ".init_array or .fini_array.")).add("arrayIndex", C1648.m5545("integer", "0-based item offset within the current itemKind view.")).add("slotVirtualAddress", C1648.m5542("string", "Array slot virtual address, or null.")).add("slotFileOffset", C1648.m5542("string", "Array slot ELF file offset within the zip_entry bytes, or null. Convert this 0x hex string to decimal before passing it as mt_apk_read_bytes.byteOffset.")).add("targetVirtualAddress", C1648.m5542("string", "Target function virtual address, or null. Prefer this for mt_apk_native_disassemble with addressKind=virtual when non-null.")).add("targetFileOffset", C1648.m5542("string", "Target function ELF file offset within the zip_entry bytes, or null. Use this for mt_apk_native_disassemble with addressKind=file_offset only when targetVirtualAddress is null.")).add("targetInstructionMode", C1648.m5545("string", "Instruction mode to pass to mt_apk_native_disassemble with targetVirtualAddress or targetFileOffset: auto, arm, or thumb.")), "integer", "Pointer slot size in bytes: 4 for ELF32, 8 for ELF64.", "pointerSize", "ELF init/fini array pointer slot item.")).add(C18736.m43390(JSON.object().add("name", C1648.m5545("string", "Relocation name.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled relocation name when requested and different from name, otherwise empty string.")).add("library", C1648.m5545("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("type", C1648.m5545("integer", "Relocation type.")).add("numericType", C1648.m5545("integer", "Numeric relocation type.")).add("virtualAddress", C1648.m5542("string", "Virtual address, or null.")).add("fileOffset", C1648.m5542("string", "ELF file offset within the zip_entry bytes, or null.")).add("addend", C1648.m5545("integer", "Relocation addend.")).add("additive", C1648.m5545(ClassTransform.BOOLEAN, "Whether the relocation is additive.")), ClassTransform.BOOLEAN, "Whether the relocation is IFUNC.", "ifunc", "ELF relocation item."))))).add("pagination", C1648.m5537("Number of filtered items returned on this page.", "Maximum limit accepted by mt_apk_continue for later native item pages.", "Total item count after applying data.namePrefix, or null when unknown.")), "One native ELF item list page. data.itemKind determines the item shape."), C1648.m5540(C1648.m5532(JSON.object(), "No tool-specific diagnostics.")), C1648.m5538("nextActions contains mt_apk_continue only when data.pagination.hasMore=true; otherwise it is empty.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue")));
        this.f76627 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws Throwable {
        C21445 c21445M13276;
        C19793 c19793 = this.f76626;
        try {
            c21445M13276 = C4511.m13276(jSONObject);
            try {
                C12936 c12936M52171 = m52171(c21445M13276, false, jSONObject.get("nextCursor"));
                c19793.m45533(c21445M13276.f69035);
                int i = C8869.f27007;
                return c12936M52171;
            } catch (Throwable th) {
                th = th;
                if (c21445M13276 != null) {
                    c19793.m45533(c21445M13276.f69035);
                }
                int i2 = C8869.f27007;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c21445M13276 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m52175(C2519 c2519, JSONObject jSONObject) {
        JSONObject jSONObject2 = c2519.f7996;
        C19793 c19793 = this.f76626;
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM52173 = m52173(c2519, jSONObject);
            String string3 = jSONObject2.getString("locator", "");
            String string4 = jSONObject2.getString("itemKind", "");
            JSONValue jSONValue = jSONObject.get("nextCursor");
            JSONValue jSONValue2 = jSONObject2.get("namePrefix");
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw m52170(jSONValue);
            }
            String strAsString = jSONValue2.asString();
            JSONValue jSONValue3 = jSONObject.get("nextCursor");
            JSONValue jSONValue4 = jSONObject2.get("demangle");
            if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                throw m52170(jSONValue3);
            }
            boolean zAsBoolean = jSONValue4.asBoolean();
            if (!string3.startsWith("zip_entry:") || string3.length() == 10 || !C15330.m36360(string4)) {
                throw m52170(jSONObject.get("nextCursor"));
            }
            JSONValue jSONValue5 = jSONObject.get("nextCursor");
            try {
                long j = jSONObject2.getLong("entrySize", -1L);
                if (j >= 0) {
                    JSONValue jSONValue6 = jSONObject.get("nextCursor");
                    try {
                        long j2 = jSONObject2.getLong("entryCrc", -1L);
                        if (j2 >= 0) {
                            JSONValue jSONValue7 = jSONObject.get("nextCursor");
                            try {
                                int i = jSONObject2.getInt("totalCount", -1);
                                if (i >= 0) {
                                    C12936 c12936M52171 = m52171(new C21445(string, string2, string3, string3.substring(10), string4, strAsString, zAsBoolean, iM52173, c2519.f7997.getInt("offset", -1), i, j, j2), true, jSONObject.get("nextCursor"));
                                    if (!string.isEmpty()) {
                                        c19793.m45533(string);
                                    }
                                    int i2 = C8869.f27007;
                                    return c12936M52171;
                                }
                                throw m52170(jSONValue7);
                            } catch (RuntimeException unused) {
                                throw m52170(jSONValue7);
                            }
                        }
                        throw m52170(jSONValue6);
                    } catch (RuntimeException unused2) {
                        throw m52170(jSONValue6);
                    }
                }
                throw m52170(jSONValue5);
            } catch (RuntimeException unused3) {
                throw m52170(jSONValue5);
            }
            if (!string.isEmpty()) {
                c19793.m45533(string);
            }
            int i3 = C8869.f27007;
            throw th;
        } catch (Throwable th) {
            if (!string.isEmpty()) {
                c19793.m45533(string);
            }
            int i4 = C8869.f27007;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12936 m52171(final C21445 c21445, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c21445.f69031 < 0) {
            if (z) {
                throw m52170(jSONValue);
            }
            throw m52174();
        }
        C19793 c19793 = this.f76626;
        InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
        try {
            C12936 c12936 = new C12936((JSONObject) c19793.m45513(c21445.f69035, new InterfaceC16263() { // from class: l.ܿۧۜ
                @Override // l.InterfaceC16263
                /* JADX INFO: renamed from: ֫ */
                public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                    return C23652.m52168(this.f53005, c21445, z, jSONValue, c14852, c15799);
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
    public static /* synthetic */ JSONObject m52168(final C23652 c23652, final C21445 c21445, final boolean z, final JSONValue jSONValue, C14852 c14852, C15799 c15799) throws C3059 {
        String str = c21445.f69038;
        final int iM37424 = c15799.m37424(c14852, str);
        if (z) {
            C18747.m43400(jSONValue.asString(), iM37424, c21445.f69035, str);
        }
        C13682 c13682 = c23652.f76625;
        String str2 = c21445.f69037;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ܳۧۜ
            @Override // l.InterfaceC22855
            /* JADX INFO: renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C23652.m52169(this.f44361, z, c21445, jSONValue, iM37424, c7333);
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52172(C21445 c21445, C21682 c21682, boolean z, JSONValue jSONValue) throws C3059 {
        String str;
        int i;
        String str2 = c21445.f69034;
        int i2 = c21445.f69030;
        String str3 = c21682.f69552;
        int i3 = c21682.f69556;
        int i4 = c21682.f69555;
        List<InterfaceC8276> list = c21682.f69553;
        if (!str2.equals(str3) || i3 != c21445.f69031 || c21682.f69554 != i2 || i4 < 0 || list.size() > i2 || i3 < 0) {
            throw C12095.m29491();
        }
        if (i3 > i4) {
            if (z) {
                throw m52170(jSONValue);
            }
            throw m52174();
        }
        int i5 = c21445.f69040;
        if (i5 >= 0 && i4 != i5) {
            throw C12095.m29491();
        }
        long size = ((long) i3) + ((long) list.size());
        long j = i4;
        if (size > j) {
            throw C12095.m29491();
        }
        if (size < j && list.size() < i2) {
            throw C12095.m29491();
        }
        for (InterfaceC8276 interfaceC8276 : list) {
            if (interfaceC8276 instanceof C5454) {
                str = ((C5454) interfaceC8276).f16978;
            } else if (interfaceC8276 instanceof C11804) {
                str = ((C11804) interfaceC8276).f35214;
            } else {
                str = interfaceC8276 instanceof C20271 ? ((C20271) interfaceC8276).f65510 : null;
            }
            if (str != null && str.length() > 4096) {
                throw C12095.m29491();
            }
            if (interfaceC8276 instanceof C1220) {
                C1220 c1220 = (C1220) interfaceC8276;
                if (c1220.f4376 < 0 || ((i = c1220.f4380) != 4 && i != 8)) {
                    throw C12095.m29491();
                }
                String str4 = c1220.f4379;
                if (!"auto".equals(str4) && !"arm".equals(str4) && !"thumb".equals(str4)) {
                    throw C12095.m29491();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m52173(C2519 c2519, JSONObject jSONObject) throws C3059 {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C3059 m52174() {
        return C3059.m9364("Invalid offset", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m52170(JSONValue jSONValue) {
        return C3059.m9364("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, JSON.array());
    }
}
