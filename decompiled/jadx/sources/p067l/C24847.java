package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P75X */
/* JADX INFO: loaded from: classes.dex */
public final class C24847 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C23506 f79369;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f79370;

    /* JADX INFO: renamed from: ܽ */
    public final C15372 f79371;

    /* JADX INFO: renamed from: ܿ */
    public final C21180 f79372;

    /* JADX INFO: renamed from: ᩳ */
    public JSONObject f79373;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "List the first page of one ELF detail list. Start with mt_apk_native_inspect and copy a nextActions call; for later pages use mt_apk_continue with the returned action arguments. mt_apk_native_inspect.counts is unfiltered. This tool returns items and pagination.totalAvailableCount after applying namePrefix; zero means no items match that filter, not necessarily that the ELF has no items of this kind. Use namePrefix=\"\" and limit=100 initially. For initArray/finiArray, disassemble targetVirtualAddress when available, otherwise targetFileOffset, using targetInstructionMode and stopAtSymbolBoundary=true. If neither target address exists, inspect the slot bytes with mt_apk_read_bytes: convert slotFileOffset to decimal byteOffset and use maxBytes=pointerSize. A missing library name is returned as an empty string. See input fields for item kinds and filtering rules.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "List Native ELF Items";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_native_list_items";
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54572(C24847 c24847, boolean z, C22750 c22750, JSONValue jSONValue, int i, C9338 c9338) throws C5276 {
        String strM45665;
        String str = c22750.f71736;
        long j = c9338.f25446;
        long j2 = c9338.f25447;
        if (!z || !str.isEmpty() || (c22750.f71731 == j2 && c22750.f71727 == j)) {
            String str2 = c9338.f25443;
            try {
                try {
                    C23506 c23506 = c24847.f79369;
                    String str3 = c22750.f71732;
                    String str4 = c22750.f71730;
                    boolean z2 = c22750.f71734;
                    int i2 = c22750.f71729;
                    int i3 = c22750.f71728;
                    int i4 = c22750.f71738;
                    c23506.getClass();
                    C22975 c22975M40099 = C17609.m40099(str2, str3, str4, z2, i2, i3, i4);
                    try {
                        m54575(c22750, c22975M40099, z, jSONValue);
                        long size = ((long) c22975M40099.f72261) + ((long) c22975M40099.f72258.size());
                        int i5 = c22975M40099.f72260;
                        if (size >= i5) {
                            strM45665 = null;
                        } else {
                            String str5 = c22750.f71733;
                            JSONObject jSONObjectAdd = JSON.object().add("locator", c22750.f71737).add("itemKind", c22750.f71732).add("namePrefix", c22750.f71730).add("demangle", c22750.f71734);
                            if (!str.isEmpty()) {
                                j2 = 0;
                            }
                            JSONObject jSONObjectAdd2 = jSONObjectAdd.add("entrySize", j2);
                            if (!str.isEmpty()) {
                                j = 0;
                            }
                            strM45665 = C20186.m45665("native_items", str5, str, i, jSONObjectAdd2.add("entryCrc", j).add("totalCount", i5).add("recommendedLimit", c22750.f71728).add("limitMax", 500), JSON.object().add("offset", (int) size));
                        }
                        return C13863.m31548(c22750, c22975M40099, strM45665);
                    } catch (IllegalArgumentException unused) {
                        if (z) {
                            throw m54573(jSONValue);
                        }
                        throw m54577();
                    }
                } catch (IllegalArgumentException unused2) {
                }
            } catch (RuntimeException unused3) {
                throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        } else {
            throw m54573(jSONValue);
        }
    }

    public C24847(C21180 c21180) {
        C23506 c23506 = new C23506();
        C15372 c15372 = new C15372();
        this.f79372 = c21180;
        this.f79369 = c23506;
        this.f79371 = c15372;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f79370;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session view; pass an empty string to read the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  },\n  \"itemKind\": {\n    \"type\": \"string\",\n    \"enum\": [\"neededLibraries\", \"sections\", \"segments\", \"imports\", \"symbols\", \"entries\", \"initArray\", \"finiArray\", \"relocations\"],\n    \"description\": \"ELF list to read. Prefer copying this from the mt_apk_native_inspect result's nextActions. For manual calls, use one of neededLibraries, sections, segments, imports, symbols, entries, initArray, finiArray, or relocations; if mt_apk_native_inspect reported count 0 for that itemKind, this returns an empty page. entries means all loader-recognized entry point records with stable entryN names, including program, init, fini, and preinit entries when present. initArray and finiArray separately read .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.\"\n  },\n  \"namePrefix\": {\n    \"type\": \"string\",\n    \"description\": \"Case-sensitive literal prefix for the returned item name only. Pass an empty string for no filter. entries uses stable generated entryN names; other named item kinds keep their raw ELF names. It does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter; the so file is selected only by locator. initArray/finiArray items have no name, so non-empty namePrefix matches no items.\"\n  },\n  \"demangle\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, add demangledName for imports, symbols, and relocations when C++ Itanium demangling succeeds. namePrefix still matches only name. This has no effect for entries, initArray, or finiArray. Pass false by default; use true when readable C++ symbols help interpretation.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size. Pass 100 by default; valid range is 1..500.\"\n  }\n}\n");
        this.f79370 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f79373;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_native_list_items. One filtered ELF detail page. Read filterHint before interpreting an empty page; use nextActions to continue.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("itemKind", C3935.m7775("string", "ELF item kind returned on this page.")).add("namePrefix", C3935.m7775("string", "Case-sensitive literal prefix for the returned item name only. Empty string means no filter; it does not match demangledName, contains, regex, or other fields, and it is not an APK ZIP entry path filter. entries uses generated entryN names; initArray/finiArray items have no name, so non-empty namePrefix matches no items.")).add("demangle", C3935.m7775(ClassTransform.BOOLEAN, "Whether imports, symbols, and relocations include best-effort C++ demangledName values. This flag does not affect pagination, counts, or namePrefix filtering, and has no effect for entries, initArray, or finiArray.")).add("filterHint", C20175.m45657(JSON.object().add("code", C3935.m7775("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=name_prefix_not_applicable means itemKind has no name field and non-empty namePrefix filtered out every item. Empty code/message means no hint applies.")).add("items", C9417.m21913("type", "array", "description", "ELF items for data.itemKind. neededLibraries items use {name}; sections and segments use the section shape; imports use the import shape; symbols and entries use the symbol shape. entries contain all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present, and use stable generated entryN names. initArray and finiArray use the .init_array/.fini_array pointer-slot shape, may describe the same lifecycle target with slot metadata, and have no name field. imports, symbols, and relocations may include demangledName and library=\"\" when ELF metadata does not identify a source shared library; entries always use an empty demangledName and library. relocations use the relocation shape.").add("items", JSON.object().add("anyOf", JSON.array().add(C20175.m45657(JSON.object(), "string", "Needed library name.", "name", "Needed shared library item.")).add(C20175.m45657(JSON.object().add("name", C3935.m7775("string", "Name.")).add("type", C3935.m7775("string", "Type.")).add("arch", C3935.m7775("string", "Architecture.")).add("virtualAddress", C3935.m7772("string", "Virtual address, or null.")).add("fileOffset", C3935.m7772("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C3935.m7775("integer", "File size.")).add("virtualSize", C3935.m7775("integer", "Virtual size.")).add("permissions", C3935.m7775("integer", "Permission bitset.")).add("flags", C3935.m7775("integer", "Flag bitset.")).add(AbstractC0213e.f989m, C3935.m7775(ClassTransform.BOOLEAN, "Whether this range is data.")), ClassTransform.BOOLEAN, "Whether this item is a segment.", "segment", "ELF section or segment item.")).add(C20175.m45657(JSON.object().add("name", C3935.m7775("string", "Import name.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled import name when requested and different from name, otherwise empty string.")).add("library", C3935.m7775("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C3935.m7775("string", "Binding.")).add("type", C3935.m7775("string", "Type.")).add("className", C3935.m7775("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java class name.")).add("descriptor", C3935.m7775("string", "ELF/analyzer descriptor metadata when present. Ordinary Android ELF SO imports usually leave this empty; do not treat it as a Dex/Java method descriptor.")).add("ordinal", C3935.m7775("integer", "Ordinal.")).add("inSectionHeader", C3935.m7775(ClassTransform.BOOLEAN, "Whether the import is in a section header.")), ClassTransform.BOOLEAN, "Always true for the imports itemKind because this list represents ELF imports; do not use it to infer the provider library.", "imported", "ELF import item.")).add(C20175.m45657(JSON.object().add("name", C3935.m7775("string", "Raw ELF symbol name, or a stable generated entryN name for an entries item.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled symbol name when requested and different from name; always empty for entries.")).add("className", C3935.m7775("string", "ELF/analyzer class metadata when present. Ordinary Android ELF SO symbols usually leave this empty; do not treat it as a Dex/Java class name.")).add("library", C3935.m7775("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("bind", C3935.m7775("string", "Binding.")).add("type", C3935.m7775("string", "Type.")).add("imported", C3935.m7775(ClassTransform.BOOLEAN, "Whether this item is imported.")).add("virtualAddress", C3935.m7772("string", "Virtual address, or null.")).add("fileOffset", C3935.m7772("string", "ELF file offset within the zip_entry bytes, or null.")).add("size", C3935.m7775("integer", "Symbol size.")), "integer", "Symbol bit width reported by ELF metadata.", "symbolBits", "ELF symbol or entry item.")).add(C20175.m45657(JSON.object().add("arrayName", C3935.m7775("string", ".init_array or .fini_array.")).add("arrayIndex", C3935.m7775("integer", "0-based item offset within the current itemKind view.")).add("slotVirtualAddress", C3935.m7772("string", "Array slot virtual address, or null.")).add("slotFileOffset", C3935.m7772("string", "Array slot ELF file offset within the zip_entry bytes, or null. Convert this 0x hex string to decimal before passing it as mt_apk_read_bytes.byteOffset.")).add("targetVirtualAddress", C3935.m7772("string", "Target function virtual address, or null. Prefer this for mt_apk_native_disassemble with addressKind=virtual when non-null.")).add("targetFileOffset", C3935.m7772("string", "Target function ELF file offset within the zip_entry bytes, or null. Use this for mt_apk_native_disassemble with addressKind=file_offset only when targetVirtualAddress is null.")).add("targetInstructionMode", C3935.m7775("string", "Instruction mode to pass to mt_apk_native_disassemble with targetVirtualAddress or targetFileOffset: auto, arm, or thumb.")), "integer", "Pointer slot size in bytes: 4 for ELF32, 8 for ELF64.", "pointerSize", "ELF init/fini array pointer slot item.")).add(C20175.m45657(JSON.object().add("name", C3935.m7775("string", "Relocation name.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled relocation name when requested and different from name, otherwise empty string.")).add("library", C3935.m7775("string", "Source shared library name when ELF metadata identifies one, otherwise empty string.")).add("type", C3935.m7775("integer", "Relocation type.")).add("numericType", C3935.m7775("integer", "Numeric relocation type.")).add("virtualAddress", C3935.m7772("string", "Virtual address, or null.")).add("fileOffset", C3935.m7772("string", "ELF file offset within the zip_entry bytes, or null.")).add("addend", C3935.m7775("integer", "Relocation addend.")).add("additive", C3935.m7775(ClassTransform.BOOLEAN, "Whether the relocation is additive.")), ClassTransform.BOOLEAN, "Whether the relocation is IFUNC.", "ifunc", "ELF relocation item."))))).add("pagination", C3935.m7767("Number of filtered items returned on this page.", "Maximum limit accepted by mt_apk_continue for later native item pages.", "Total item count after applying data.namePrefix, or null when unknown.")), "One native ELF item list page. data.itemKind determines the item shape."), C3935.m7770(C3935.m7762(JSON.object(), "No tool-specific diagnostics.")), C3935.m7768("nextActions contains mt_apk_continue only when data.pagination.hasMore=true; otherwise it is empty.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue")));
        this.f79373 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws Throwable {
        C22750 c22750M15159;
        C21180 c21180 = this.f79372;
        try {
            c22750M15159 = C6656.m15159(jSONObject);
            try {
                C14663 c14663M54574 = m54574(c22750M15159, false, jSONObject.get("nextCursor"));
                c21180.m47844(c22750M15159.f71733);
                int i = C10798.f29931;
                return c14663M54574;
            } catch (Throwable th) {
                th = th;
                if (c22750M15159 != null) {
                    c21180.m47844(c22750M15159.f71733);
                }
                int i2 = C10798.f29931;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c22750M15159 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
    /* JADX INFO: renamed from: ֫ */
    public final C14663 m54578(C4763 c4763, JSONObject jSONObject) {
        JSONObject jSONObject2 = c4763.f10788;
        C21180 c21180 = this.f79372;
        String string = jSONObject.getString("workspaceId", "");
        String string2 = jSONObject.getString("editSessionId", "");
        try {
            int iM54576 = m54576(c4763, jSONObject);
            String string3 = jSONObject2.getString("locator", "");
            String string4 = jSONObject2.getString("itemKind", "");
            JSONValue jSONValue = jSONObject.get("nextCursor");
            JSONValue jSONValue2 = jSONObject2.get("namePrefix");
            if (jSONValue2 == null || !jSONValue2.isString()) {
                throw m54573(jSONValue);
            }
            String strAsString = jSONValue2.asString();
            JSONValue jSONValue3 = jSONObject.get("nextCursor");
            JSONValue jSONValue4 = jSONObject2.get("demangle");
            if (jSONValue4 == null || !jSONValue4.isBoolean()) {
                throw m54573(jSONValue3);
            }
            boolean zAsBoolean = jSONValue4.asBoolean();
            if (!string3.startsWith("zip_entry:") || string3.length() == 10 || !C16938.m38518(string4)) {
                throw m54573(jSONObject.get("nextCursor"));
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
                                    C14663 c14663M54574 = m54574(new C22750(string, string2, string3, string3.substring(10), string4, strAsString, zAsBoolean, iM54576, c4763.f10789.getInt("offset", -1), i, j, j2), true, jSONObject.get("nextCursor"));
                                    if (!string.isEmpty()) {
                                        c21180.m47844(string);
                                    }
                                    int i2 = C10798.f29931;
                                    return c14663M54574;
                                }
                                throw m54573(jSONValue7);
                            } catch (RuntimeException unused) {
                                throw m54573(jSONValue7);
                            }
                        }
                        throw m54573(jSONValue6);
                    } catch (RuntimeException unused2) {
                        throw m54573(jSONValue6);
                    }
                }
                throw m54573(jSONValue5);
            } catch (RuntimeException unused3) {
                throw m54573(jSONValue5);
            }
            if (!string.isEmpty()) {
                c21180.m47844(string);
            }
            int i3 = C10798.f29931;
            throw th;
        } catch (Throwable th) {
            if (!string.isEmpty()) {
                c21180.m47844(string);
            }
            int i4 = C10798.f29931;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14663 m54574(final C22750 c22750, final boolean z, final JSONValue jSONValue) throws Exception {
        if (c22750.f71729 < 0) {
            if (z) {
                throw m54573(jSONValue);
            }
            throw m54577();
        }
        C21180 c21180 = this.f79372;
        InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
        try {
            C14663 c14663 = new C14663((JSONObject) c21180.m47824(c22750.f71733, new InterfaceC17825() { // from class: l.ܿۧۜ
                @Override // p067l.InterfaceC17825
                /* JADX INFO: renamed from: ֫ */
                public final JSONObject mo3479(C16484 c16484, C17384 c17384) {
                    return C24847.m54571(this.f56186, c22750, z, jSONValue, c16484, c17384);
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
    public static /* synthetic */ JSONObject m54571(final C24847 c24847, final C22750 c22750, final boolean z, final JSONValue jSONValue, C16484 c16484, C17384 c17384) throws C5276 {
        String str = c22750.f71736;
        final int iM39595 = c17384.m39595(c16484, str);
        if (z) {
            C20186.m45667(jSONValue.asString(), iM39595, c22750.f71733, str);
        }
        C15372 c15372 = c24847.f79371;
        String str2 = c22750.f71735;
        InterfaceC24090 interfaceC24090 = new InterfaceC24090() { // from class: l.ܳۧۜ
            @Override // p067l.InterfaceC24090
            /* JADX INFO: renamed from: ֫ */
            public final Object mo16462(C9338 c9338) {
                return C24847.m54572(this.f47462, z, c22750, jSONValue, iM39595, c9338);
            }
        };
        c15372.getClass();
        return (JSONObject) C15372.m35036(c16484, c17384, str, str2, interfaceC24090);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54575(C22750 c22750, C22975 c22975, boolean z, JSONValue jSONValue) throws C5276 {
        String str;
        int i;
        String str2 = c22750.f71732;
        int i2 = c22750.f71728;
        String str3 = c22975.f72257;
        int i3 = c22975.f72261;
        int i4 = c22975.f72260;
        List<InterfaceC10234> list = c22975.f72258;
        if (!str2.equals(str3) || i3 != c22750.f71729 || c22975.f72259 != i2 || i4 < 0 || list.size() > i2 || i3 < 0) {
            throw C13863.m31554();
        }
        if (i3 > i4) {
            if (z) {
                throw m54573(jSONValue);
            }
            throw m54577();
        }
        int i5 = c22750.f71738;
        if (i5 >= 0 && i4 != i5) {
            throw C13863.m31554();
        }
        long size = ((long) i3) + ((long) list.size());
        long j = i4;
        if (size > j) {
            throw C13863.m31554();
        }
        if (size < j && list.size() < i2) {
            throw C13863.m31554();
        }
        for (InterfaceC10234 interfaceC10234 : list) {
            if (interfaceC10234 instanceof C7552) {
                str = ((C7552) interfaceC10234).f19819;
            } else if (interfaceC10234 instanceof C13587) {
                str = ((C13587) interfaceC10234).f38216;
            } else {
                str = interfaceC10234 instanceof C21634 ? ((C21634) interfaceC10234).f68185 : null;
            }
            if (str != null && str.length() > 4096) {
                throw C13863.m31554();
            }
            if (interfaceC10234 instanceof C3528) {
                C3528 c3528 = (C3528) interfaceC10234;
                if (c3528.f7146 < 0 || ((i = c3528.f7150) != 4 && i != 8)) {
                    throw C13863.m31554();
                }
                String str4 = c3528.f7149;
                if (!"auto".equals(str4) && !"arm".equals(str4) && !"thumb".equals(str4)) {
                    throw C13863.m31554();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m54576(C4763 c4763, JSONObject jSONObject) throws C5276 {
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

    /* JADX INFO: renamed from: ᩻ */
    public static C5276 m54577() {
        return C5276.m11406("Invalid offset", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m54573(JSONValue jSONValue) {
        return C5276.m11406("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.NULL, JSON.array());
    }
}
