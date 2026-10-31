package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.am;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫֫ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1761 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12095 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29477(C0277 c0277, C6159 c6159) {
        String str;
        int i;
        String str2 = c0277.f1601;
        String str3 = c0277.f1598;
        String str4 = c0277.f1600;
        JSONObject jSONObjectAdd = m29476(str2, str3, str4).add("type", c6159.f18935).add("arch", c6159.f18943).add(am.w, c6159.f18952).add("machine", c6159.f18938).add("abi", c6159.f18936).add(am.x, c6159.f18950).add("subsystem", c6159.f18939).add("interpreter", c6159.f18937).add("archBits", c6159.f18948).add("hasVirtualAddress", c6159.f18941).add("positionIndependent", c6159.f18934).add("nx", c6159.f18949).add("canary", c6159.f18947).add("baseAddress", m29488(c6159.f18946)).add("entryVirtualAddress", m29488(c6159.f18951)).add("entryFileOffset", m29488(c6159.f18940)).add("initVirtualAddress", m29488(c6159.f18945)).add("finiVirtualAddress", m29488(c6159.f18942));
        C10393 c10393 = c6159.f18944;
        String str5 = "neededLibraries";
        JSONObject jSONObjectAdd2 = JSON.object().add("neededLibraries", c10393.f31258);
        int i2 = c10393.f31261;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("sections", i2);
        int i3 = c10393.f31254;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("segments", i3);
        int i4 = c10393.f31257;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("imports", i4);
        int i5 = c10393.f31260;
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("symbols", i5);
        int i6 = c10393.f31253;
        String str6 = "entries";
        JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("entries", i6);
        int i7 = c10393.f31259;
        JSONObject jSONObjectAdd8 = jSONObjectAdd7.add("initArray", i7);
        int i8 = c10393.f31255;
        JSONObject jSONObjectAdd9 = jSONObjectAdd8.add("finiArray", i8);
        int i9 = c10393.f31256;
        JSONObject jSONObjectAdd10 = jSONObjectAdd.add("counts", jSONObjectAdd9.add("relocations", i9));
        JSONArray jSONArrayArray = JSON.array();
        int i10 = 0;
        while (i10 < 9) {
            String str7 = C15330.f46987[i10];
            C15330.m36361(str7);
            if (str5.equals(str7)) {
                str = str5;
                i = c10393.f31258;
            } else {
                str = str5;
                if ("sections".equals(str7)) {
                    i = i2;
                } else if ("segments".equals(str7)) {
                    i = i3;
                } else if ("imports".equals(str7)) {
                    i = i4;
                } else if ("symbols".equals(str7)) {
                    i = i5;
                } else if (str6.equals(str7)) {
                    i = i6;
                } else if ("initArray".equals(str7)) {
                    i = i7;
                } else {
                    i = "finiArray".equals(str7) ? i8 : i9;
                }
            }
            if (i > 0) {
                jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", str2).add("editSessionId", str3).add("locator", str4).add("itemKind", str7).add("namePrefix", "").add("demangle", false).add("limit", 100), "mt_apk_native_list_items", "inspect", "Read first page of native ".concat(str7)));
            }
            i10++;
            str5 = str;
            c10393 = c10393;
            str6 = str6;
        }
        return C19993.m46095(jSONObjectAdd10, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29485(C21445 c21445, C21682 c21682, String str) {
        Iterator it;
        String str2;
        String str3;
        boolean z;
        JSONObject jSONObjectAdd;
        String str4 = c21445.f69035;
        boolean z2 = str != null;
        String str5 = c21445.f69034;
        String str6 = c21445.f69032;
        String str7 = c21445.f69038;
        JSONObject jSONObjectM29476 = m29476(str4, str7, c21445.f69039);
        String str8 = c21682.f69552;
        List list = c21682.f69553;
        JSONObject jSONObjectAdd2 = jSONObjectM29476.add("itemKind", str8).add("namePrefix", str6).add("demangle", c21445.f69036).add("filterHint", (("initArray".equals(str5) || "finiArray".equals(str5)) && !str6.isEmpty()) ? C7416.m19939("code", "name_prefix_not_applicable", "message", "This itemKind has no name field, so a non-empty namePrefix filters out every item; retry with namePrefix=\"\" to read the list.") : C7416.m19939("code", "", "message", ""));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC8276 interfaceC8276 = (InterfaceC8276) it2.next();
            if (interfaceC8276 instanceof C22387) {
                jSONObjectAdd = JSON.object().add("name", ((C22387) interfaceC8276).f72541);
                str2 = str4;
                z = z2;
                str3 = str7;
                it = it2;
            } else {
                it = it2;
                if (interfaceC8276 instanceof C3337) {
                    C3337 c3337 = (C3337) interfaceC8276;
                    str2 = str4;
                    jSONObjectAdd = JSON.object().add("name", c3337.f10548).add("type", c3337.f10549).add("arch", c3337.f10540).add("virtualAddress", m29488(c3337.f10543)).add("fileOffset", m29488(c3337.f10545)).add("size", c3337.f10541).add("virtualSize", c3337.f10542).add("permissions", c3337.f10547).add("flags", c3337.f10546).add(e.m, c3337.f10544).add("segment", c3337.f10550);
                    z = z2;
                    str3 = str7;
                } else {
                    str2 = str4;
                    str3 = str7;
                    z = z2;
                    if (interfaceC8276 instanceof C5454) {
                        C5454 c5454 = (C5454) interfaceC8276;
                        jSONObjectAdd = JSON.object().add("name", c5454.f16982).add("demangledName", c5454.f16978).add("library", c5454.f16977).add("bind", c5454.f16974).add("type", c5454.f16981).add("className", c5454.f16976).add("descriptor", c5454.f16980).add("ordinal", c5454.f16975).add("inSectionHeader", c5454.f16979).add("imported", true);
                    } else if (interfaceC8276 instanceof C11804) {
                        C11804 c11804 = (C11804) interfaceC8276;
                        jSONObjectAdd = JSON.object().add("name", c11804.f35216).add("demangledName", c11804.f35214).add("className", c11804.f35212).add("library", c11804.f35211).add("bind", c11804.f35206).add("type", c11804.f35209).add("imported", c11804.f35213).add("virtualAddress", m29488(c11804.f35208)).add("fileOffset", m29488(c11804.f35207)).add("size", c11804.f35215).add("symbolBits", c11804.f35210);
                    } else if (interfaceC8276 instanceof C1220) {
                        C1220 c1220 = (C1220) interfaceC8276;
                        jSONObjectAdd = JSON.object().add("arrayName", c1220.f4378).add("arrayIndex", c1220.f4376).add("slotVirtualAddress", m29488(c1220.f4381)).add("slotFileOffset", m29488(c1220.f4382)).add("targetVirtualAddress", m29488(c1220.f4377)).add("targetFileOffset", m29488(c1220.f4383)).add("targetInstructionMode", c1220.f4379).add("pointerSize", c1220.f4380);
                    } else {
                        if (!(interfaceC8276 instanceof C20271)) {
                            throw new IllegalArgumentException("Unsupported native item type");
                        }
                        C20271 c20271 = (C20271) interfaceC8276;
                        jSONObjectAdd = JSON.object().add("name", c20271.f65509).add("demangledName", c20271.f65510).add("library", c20271.f65511).add("type", c20271.f65513).add("numericType", c20271.f65514).add("virtualAddress", m29488(c20271.f65507)).add("fileOffset", m29488(c20271.f65506)).add("addend", c20271.f65505).add("additive", c20271.f65508).add("ifunc", c20271.f65512);
                    }
                }
            }
            jSONArrayArray.add(jSONObjectAdd);
            it2 = it;
            str4 = str2;
            str7 = str3;
            z2 = z;
        }
        String str9 = str4;
        boolean z3 = z2;
        String str10 = str7;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("items", jSONArrayArray).add("pagination", m29487(z3, str, list.size(), 500, Long.valueOf(c21682.f69555)));
        JSONArray jSONArrayArray2 = JSON.array();
        if (z3) {
            jSONArrayArray2.add(C10115.m25398(C7416.m19939("workspaceId", str9, "editSessionId", str10).add("nextCursor", str).add("limit", c21445.f69030), "mt_apk_continue", "continue", "Continue native item page"));
        }
        return C19993.m46095(jSONObjectAdd3, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29482(C5217 c5217, C4043 c4043) throws C3059 {
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = m29476(c5217.f16337, c5217.f16336, c5217.f16333).add("addressKind", c5217.f16334).add("address", c5217.f16332);
        boolean z = c4043.f12820;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("found", z);
        m29507(c4043);
        m29503(c4043);
        JSONObject jSONObjectM29480 = z ? m29480(c4043) : m29505();
        C2632 c2632 = c4043.f12816;
        if (!c2632.f8303) {
            JSONObject jSONObjectAdd4 = JSON.object().add("found", false).add("name", "").add("demangledName", "").add("instructionMode", "");
            JSONValue jSONValue = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue).add("startFileOffset", jSONValue).add("offset", jSONValue).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("found", true).add("name", c2632.f8307).add("demangledName", c2632.f8301).add("instructionMode", c2632.f8305).add("startVirtualAddress", m29488(c2632.f8302)).add("startFileOffset", m29488(c2632.f8308)).add("offset", m29488(c2632.f8306)).add("size", c2632.f8304);
        }
        return C19993.m46095(jSONObjectAdd3.add("mapping", jSONObjectM29480.add("enclosingSymbol", jSONObjectAdd)), JSON.array());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29486(C22150 c22150, String str, boolean z, C4043 c4043, String str2, int i, String str3, String str4, C15645 c15645, String str5) throws C3059 {
        JSONObject jSONObjectM29474;
        Iterator it;
        String str6;
        JSONValue jSONValueAdd;
        String str7 = c22150.f71877;
        List list = c22150.f71861;
        String str8 = c22150.f71868;
        long j = c4043.f12822;
        int i2 = c15645.f48155;
        List list2 = c15645.f48150;
        boolean z2 = c15645.f48149;
        boolean z3 = str5 != null;
        String str9 = "";
        JSONObject jSONObjectM19939 = (!z || !("code".equals(str8) || "both".equals(str8)) || !list.contains(e.m) || j < 0 || j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) ? C7416.m19939("warningCode", "", "warning", "") : C7416.m19939("warningCode", "low_address_instruction_data_reference_noise", "warning", "Low target virtual addresses can be confused with ordinary instruction immediates; code/both instruction data refs may contain false positives. To inspect strings, tables, or pointer slots only, retry with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto.");
        if (z) {
            String str10 = c15645.f48148;
            if (z2 && z3) {
                throw m29491();
            }
            if (!z2 && !z3) {
                throw m29491();
            }
            if (!list2.isEmpty()) {
                jSONObjectM29474 = m29474(jSONObjectM19939, "refs_found", "This page contains direct references matching scanKind and referenceKinds; continue if pagination.hasMore is true.", str10);
            } else if (z3) {
                jSONObjectM29474 = m29474(jSONObjectM19939, "scan_incomplete", "This page has no refs, but scanning is not complete; continue with mt_apk_continue before concluding no references.", str10);
            } else {
                if (!z2) {
                    throw m29491();
                }
                jSONObjectM29474 = m29474(jSONObjectM19939, "no_refs_found", "This bounded direct-reference scan completed for the current scanKind, referenceKinds, and maxScanBytes, and found no direct references.", str10);
            }
        } else {
            if (!list2.isEmpty() || i2 != 0 || !z2 || z3) {
                throw m29491();
            }
            jSONObjectM29474 = m29474(jSONObjectM19939, "target_not_mapped", "No scan ran because the target has no loaded file-backed mapping; it may be a miss, virtual-only address, or non-loaded file bytes.", "target_not_mapped");
        }
        String str11 = c22150.f71875;
        JSONObject jSONObjectAdd = m29476(str7, str11, c22150.f71859).add("addressKind", c22150.f71870).add("address", c22150.f71866).add("instructionMode", c22150.f71864).add("resolvedInstructionMode", str).add("scanKind", str8);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArrayArray.add((String) it2.next());
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("referenceKinds", jSONArrayArray).add("targetMapped", z).add("targetVirtualAddress", z ? m29488(j) : JSON.NULL).add("targetFileOffset", z ? m29488(c4043.f12817) : JSON.NULL).add("mapping", m29480(c4043)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C8591 c8591 = (C8591) it3.next();
            String str12 = str9;
            JSONObject jSONObjectAdd3 = JSON.object().add("sourceVirtualAddress", m29488(c8591.f26237)).add("sourceFileOffset", m29488(c8591.f26234)).add("sourceKind", c8591.f26236).add("sourceSize", c8591.f26235);
            C3652 c3652 = c8591.f26233;
            if (c3652 != null) {
                String str13 = c3652.f11513;
                it = it3;
                if (m29496(str13, true)) {
                    String str14 = c3652.f11512;
                    str6 = str12;
                    if (!m29496(str14, false) || str14.equals(str13)) {
                        str14 = str6;
                    }
                    str11 = str11;
                    jSONValueAdd = C7416.m19939("name", str13, "demangledName", str14).add("startVirtualAddress", m29488(c3652.f11514)).add("startFileOffset", m29488(c3652.f11516)).add("offset", m29488(c3652.f11515)).add("size", c3652.f11517);
                }
                jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c8591.f26230).add(TextBundle.TEXT_ENTRY, c8591.f26231).add("referenceKind", c8591.f26232));
                it3 = it;
                str9 = str6;
                str7 = str7;
                str11 = str11;
            } else {
                it = it3;
            }
            str6 = str12;
            jSONValueAdd = JSON.NULL;
            jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c8591.f26230).add(TextBundle.TEXT_ENTRY, c8591.f26231).add("referenceKind", c8591.f26232));
            it3 = it;
            str9 = str6;
            str7 = str7;
            str11 = str11;
        }
        String str15 = str11;
        String str16 = str7;
        JSONObject jSONObjectAdd4 = jSONObjectAdd2.add("refs", jSONArrayArray2).add("scannedBytes", i2).add("scanComplete", z2).add("scanSummary", jSONObjectM29474).add("pagination", m29487(z3, str5, list2.size(), 200, null));
        JSONArray jSONArrayArray3 = JSON.array();
        if (z3) {
            jSONArrayArray3.add(C10115.m25398(C7416.m19939("workspaceId", str16, "editSessionId", str15).add("nextCursor", str5).add("limit", c22150.f71869), "mt_apk_continue", "continue", "Continue native xref scan"));
        }
        return C19993.m46095(jSONObjectAdd4, jSONArrayArray3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29483(C18623 c18623, String str, long j, C4043 c4043, String str2, int i, String str3, String str4, int i2, int i3, boolean z, List list, C12800 c12800, boolean z2, JSONValue jSONValue, JSONValue jSONValue2, JSONValue jSONValue3) {
        JSONObject jSONObjectAdd;
        String str5 = c18623.f57753;
        String str6 = c18623.f57759;
        String str7 = c18623.f57761;
        JSONObject jSONObjectAdd2 = m29476(str5, str6, str7).add("addressKind", c18623.f57757).add("address", c18623.f57755).add("instructionMode", c18623.f57756);
        boolean z3 = c18623.f57754;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("stopAtSymbolBoundary", z3).add("resolvedInstructionMode", str).add("effectiveAddress", m29488(j)).add("mapping", m29480(c4043));
        if (!c12800.f38419) {
            JSONObject jSONObjectAdd4 = JSON.object().add("requested", c12800.f38427).add("applied", false).add("endReached", false).add("name", "").add("demangledName", "");
            JSONValue jSONValue4 = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue4).add("endVirtualAddressExclusive", jSONValue4).add("offset", jSONValue4).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("requested", true).add("applied", true).add("endReached", c12800.f38423).add("name", c12800.f38424).add("demangledName", c12800.f38421).add("startVirtualAddress", m29488(c12800.f38426)).add("endVirtualAddressExclusive", m29488(c12800.f38425)).add("offset", m29488(c12800.f38422)).add("size", c12800.f38420);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd3.add("symbolBoundary", jSONObjectAdd).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4).add("bytesRead", i2).add("bytesConsumed", i3).add("incompleteInstructionAtEnd", z);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19857 c19857 = (C19857) it.next();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(C4511.m13257(c19857.f64135));
            sb.append(": ");
            sb.append(c19857.f64136);
            sb.append(' ');
            sb.append(c19857.f64138);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("disassemblyText", sb.toString()).add("instructionCount", list.size()).add("hasMore", z2).add("nextAddressKind", jSONValue).add("nextAddress", jSONValue2).add("nextInstructionMode", jSONValue3);
        JSONArray jSONArrayArray = JSON.array();
        if (z2) {
            jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", str5).add("editSessionId", str6).add("locator", str7).add("addressKind", jSONValue).add("address", jSONValue2).add("instructionMode", jSONValue3).add("stopAtSymbolBoundary", z3).add("maxBytes", c18623.f57752).add("maxInstructions", c18623.f57760), "mt_apk_native_disassemble", "continue", "Read the next contiguous instruction window"));
        }
        return C19993.m46095(jSONObjectAdd6, jSONArrayArray);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:213:0x0811 A[LOOP:5: B:192:0x07be->B:213:0x0811, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x0831  */
    /* JADX WARN: Code duplicated, block: B:252:0x0816 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r29v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12 */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r35v14 */
    /* JADX WARN: Type inference failed for: r35v15 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r36v3 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5 */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r36v7 */
    /* JADX WARN: Type inference failed for: r36v8 */
    /* JADX WARN: Type inference failed for: r3v49, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v51, types: [bin.mt.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29484(C19329 c19329, String str, long j, C4043 c4043, String str2, int i, String str3, String str4, C17057 c17057) {
        String str5;
        int i2;
        ?? r9;
        ?? r35;
        String str6;
        int i3;
        int i4;
        int i5;
        C21268 c21268M29494;
        ?? r1;
        boolean z;
        C21973 c21973;
        int i6;
        ?? r36;
        int i7;
        long jMax;
        long j2;
        long j3;
        ?? r37;
        ?? r38;
        ?? r10;
        ?? r39;
        ?? r11;
        ?? r12;
        ?? r2;
        JSONArray jSONArrayArray;
        String str7;
        String str8;
        JSONArray jSONArrayArray2;
        JSONArray jSONArrayArray3;
        JSONArray jSONArrayArray4;
        ?? r310;
        String str9;
        ?? r311;
        int i8;
        long j4;
        Iterator it;
        String str10;
        boolean zEquals;
        boolean z2;
        String str11;
        List list;
        String str12;
        String str13 = c19329.f60773;
        String str14 = c19329.f60772;
        String str15 = c19329.f60775;
        List list2 = c17057.f52261;
        C16351 c16351 = c17057.f52266;
        List<C17763> list3 = c17057.f52265;
        List<C7570> list4 = c17057.f52264;
        String str16 = c19329.f60770;
        int i9 = c19329.f60771;
        int i10 = c19329.f60778;
        int i11 = c19329.f60769;
        String str17 = c19329.f60779;
        String str18 = c19329.f60777;
        String str19 = c19329.f60774;
        List list5 = list2;
        boolean zEquals2 = ErrorBundle.SUMMARY_ENTRY.equals(str16);
        C13919 c13919 = c17057.f52258;
        ?? r8 = c13919.f41492;
        int i12 = c13919.f41495;
        int i13 = c13919.f41493;
        int i14 = c13919.f41488;
        int i15 = c13919.f41490;
        if ("max_analysis_bytes_reached".equals(r8) || "max_blocks_reached".equals(r8) || "max_instructions_reached".equals(r8)) {
            if (i15 < 16 || i12 < 1 || i14 < 1) {
                str5 = str18;
                i2 = i15;
                r9 = "max_instructions_reached";
                r35 = "max_blocks_reached";
                str6 = str17;
                i3 = i10;
                i4 = i11;
                i5 = i9;
                c21268M29494 = m29494(c19329, (String) r8);
            } else {
                long j5 = c16351.f50322;
                if (j5 <= 0) {
                    c21268M29494 = m29494(c19329, (String) r8);
                    i2 = i15;
                    r9 = "max_instructions_reached";
                    r35 = "max_blocks_reached";
                    str5 = str18;
                    str6 = str17;
                    i3 = i10;
                    i4 = i11;
                    i5 = i9;
                } else {
                    double d = j5;
                    long jM29471 = m29471(d);
                    int i16 = i9;
                    double d2 = i12;
                    ?? r312 = "max_blocks_reached";
                    double d3 = i15;
                    long jM29472 = m29471((d2 / d3) * d);
                    double d4 = i14;
                    long jM29473 = m29471(Math.max((d4 / d3) * d, jM29472 * (d4 / d2)));
                    if ("max_analysis_bytes_reached".equals(r8)) {
                        i6 = i11;
                        jMax = Math.max(jM29471, ((long) i6) * 2);
                        i7 = i10;
                        r37 = r312;
                    } else {
                        i6 = i11;
                        if (r312.equals(r8)) {
                            r37 = r312;
                            i7 = i10;
                            jM29473 = Math.max(jM29473, ((long) i7) * 2);
                            jMax = jM29471;
                        } else {
                            i15 = i15;
                            ?? r13 = "max_instructions_reached";
                            i7 = i10;
                            if (r13.equals(r8)) {
                                r36 = r312;
                                i16 = i16;
                                j2 = jM29473;
                                jM29472 = Math.max(jM29472, ((long) i16) * 2);
                                j3 = jM29471;
                                r10 = r13;
                                r38 = r36;
                            } else {
                                r36 = r312;
                                jMax = jM29471;
                                r11 = r13;
                                r39 = r36;
                                j2 = jM29473;
                                j3 = jMax;
                                r10 = r11;
                                r38 = r39;
                            }
                        }
                        int i17 = i16;
                        i4 = i6;
                        long j6 = j2;
                        str5 = str18;
                        i2 = i15;
                        str6 = str17;
                        i3 = i7;
                        i5 = i17;
                        c21268M29494 = m29493(c19329, j3, j6, jM29472);
                        r9 = r10;
                        r35 = r38;
                    }
                    r11 = "max_instructions_reached";
                    r39 = r37;
                    j2 = jM29473;
                    j3 = jMax;
                    r10 = r11;
                    r38 = r39;
                    int i18 = i16;
                    i4 = i6;
                    long j7 = j2;
                    str5 = str18;
                    i2 = i15;
                    str6 = str17;
                    i3 = i7;
                    i5 = i18;
                    c21268M29494 = m29493(c19329, j3, j7, jM29472);
                    r9 = r10;
                    r35 = r38;
                }
            }
            r8.getClass();
            byte b = -1;
            switch (r8.hashCode()) {
                case -632178732:
                    ?? r3 = r35;
                    boolean zEquals3 = r8.equals(r3);
                    r1 = r3;
                    if (zEquals3) {
                        b = 0;
                        r1 = r3;
                    }
                    break;
                case 1722263731:
                    if (r8.equals(r9)) {
                        b = 1;
                    }
                    r1 = r35;
                    break;
                case 2113101462:
                    if (r8.equals("max_analysis_bytes_reached")) {
                        b = 2;
                    }
                    r1 = r35;
                    break;
                default:
                    r1 = r35;
                    break;
            }
            switch (b) {
                case 0:
                    if (c21268M29494.f68611 > i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 1:
                    if (c21268M29494.f68612 > i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    if (c21268M29494.f68610 > i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            c21973 = new C21973(c21268M29494.f68610, c21268M29494.f68611, c21268M29494.f68612, z, c21268M29494.f68609);
            r2 = r1;
            r12 = r9;
        } else {
            str5 = str18;
            str16 = str16;
            i12 = i12;
            i2 = i15;
            r12 = "max_instructions_reached";
            c16351 = c16351;
            str19 = str19;
            str6 = str17;
            c21973 = new C21973(c19329.f60769, c19329.f60778, c19329.f60771, false, false);
            r2 = "max_blocks_reached";
            i14 = i14;
        }
        String str20 = str19;
        String str21 = str5;
        int i19 = i12;
        JSONObject jSONObjectAdd = m29476(str20, str21, str6).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", str16).add("detailOmitted", zEquals2).add("resolvedInstructionMode", str).add("effectiveAddress", m29488(j)).add("mapping", m29480(c4043)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        C16351 c16352 = c16351;
        String str22 = "startVirtualAddress";
        String str23 = "startFileOffset";
        String str24 = str6;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("function", JSON.object().add("startVirtualAddress", m29488(c16352.f50328)).add("startFileOffset", m29488(c16352.f50326)).add("name", c16352.f50327).add("demangledName", c16352.f50325).add("symbolSize", c16352.f50322).add("startSource", c16352.f50324).add("boundarySource", c16352.f50323).add("boundaryEndVirtualAddress", m29488(c16352.f50321)));
        String str25 = "terminator";
        String str26 = "instructionCount";
        String str27 = "size";
        if (zEquals2) {
            jSONArrayArray = JSON.array();
        } else {
            jSONArrayArray = JSON.array();
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                C7570 c7570 = (C7570) it2.next();
                jSONArrayArray.add(JSON.object().add("startVirtualAddress", m29488(c7570.f23381)).add("startFileOffset", m29488(c7570.f23382)).add("size", c7570.f23380).add("instructionCount", c7570.f23378).add("terminator", c7570.f23379).add("assemblyText", c7570.f23377));
                it2 = it3;
                c21973 = c21973;
                str20 = str20;
                str21 = str21;
            }
        }
        String str28 = str21;
        C21973 c21974 = c21973;
        String str29 = str20;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("blocks", jSONArrayArray);
        if (zEquals2) {
            jSONArrayArray2 = JSON.array();
            str7 = "terminator";
            str8 = "startFileOffset";
        } else {
            List list6 = c17057.f52263;
            JSONArray jSONArrayArray5 = JSON.array();
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                C1535 c1535 = (C1535) it4.next();
                jSONArrayArray5.add(JSON.object().add("fromVirtualAddress", m29488(c1535.f5417)).add("toVirtualAddress", m29488(c1535.f5419)).add("kind", c1535.f5418));
                it4 = it4;
                str23 = str23;
                str25 = str25;
            }
            str7 = str25;
            str8 = str23;
            jSONArrayArray2 = jSONArrayArray5;
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("edges", jSONArrayArray2);
        if (zEquals2) {
            jSONArrayArray3 = JSON.array();
        } else {
            jSONArrayArray3 = JSON.array();
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                C10708 c10708 = (C10708) it5.next();
                jSONArrayArray3.add(JSON.object().add("sourceVirtualAddress", m29488(c10708.f32286)).add("flowKind", c10708.f32284).add("targetVirtualAddress", m29488(c10708.f32287)).add("reason", c10708.f32285));
                it5 = it5;
                str27 = str27;
                str26 = str26;
                str22 = str22;
            }
        }
        String str30 = str26;
        String str31 = str22;
        String str32 = str27;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("externalFlows", jSONArrayArray3);
        if (zEquals2) {
            jSONArrayArray4 = JSON.array();
        } else {
            JSONArray jSONArrayArray6 = JSON.array();
            for (C17763 c17763 : list3) {
                JSONObject jSONObjectAdd6 = JSON.object().add("sourceVirtualAddress", m29488(c17763.f54337)).add("flowKind", c17763.f54333);
                if (c17763.f54334) {
                    jSONObjectAdd6.add("targetVirtualAddress", m29488(c17763.f54336));
                }
                jSONObjectAdd6.add("reason", c17763.f54335);
                jSONArrayArray6.add(jSONObjectAdd6);
            }
            jSONArrayArray4 = jSONArrayArray6;
        }
        JSONObject jSONObjectAdd7 = jSONObjectAdd5.add("unresolvedFlows", jSONArrayArray4);
        JSONObject jSONObjectAdd8 = JSON.object().add("controlFlowComplete", c13919.f41494);
        String str33 = c13919.f41492;
        JSONObject jSONObjectAdd9 = jSONObjectAdd7.add("analysisSummary", jSONObjectAdd8.add("completionReason", str33).add("meaning", m29490(str33)).add("bytesAnalyzed", i2).add("instructionsAnalyzed", i19));
        int i20 = i14;
        JSONObject jSONObjectAdd10 = JSON.object().add("blockCount", i20).add("edgeCount", i13).add("externalFlowCount", c13919.f41491).add("unresolvedFlowCount", c13919.f41489).add("terminatorCounts", JSON.object().add("fallthrough", m29470("fallthrough", list4)).add("conditional_jump", m29470("conditional_jump", list4)).add("jump", m29470("jump", list4)).add("indirect_jump", m29470("indirect_jump", list4)).add("return", m29470("return", list4)).add("trap", m29470("trap", list4)).add("invalid", m29470("invalid", list4)).add("budget_boundary", m29470("budget_boundary", list4)));
        String str34 = "return";
        String str35 = "instruction_mode_transition";
        ?? r29 = r12;
        JSONObject jSONObjectAdd11 = JSON.object().add("target_not_executable", m29499("target_not_executable", list3)).add("unaligned_or_overlapping_target", m29499("unaligned_or_overlapping_target", list3)).add("instruction_mode_transition", m29499("instruction_mode_transition", list3)).add(r2, m29499((String) r2, list3)).add("max_analysis_bytes_reached", m29499("max_analysis_bytes_reached", list3)).add(r12, m29499((String) r12, list3)).add("invalid_instruction", m29499("invalid_instruction", list3));
        String str36 = "indirect_target";
        JSONObject jSONObjectAdd12 = jSONObjectAdd10.add("unresolvedReasonCounts", jSONObjectAdd11.add("indirect_target", m29499("indirect_target", list3)));
        JSONArray jSONArrayArray7 = JSON.array();
        if (i20 == 0) {
            r311 = r2;
            str9 = "max_analysis_bytes_reached";
        } else {
            int iM29470 = m29470("conditional_jump", list4);
            int iM29471 = m29470("indirect_jump", list4);
            r310 = r2;
            int iM29472 = m29470("budget_boundary", list4);
            str9 = "max_analysis_bytes_reached";
            if (i20 > 1 && iM29470 == 0 && iM29471 == 0 && i13 == i20 - 1) {
                jSONArrayArray7.add("observed_linear");
            }
            if (iM29470 > 0 || i13 > i20) {
                jSONArrayArray7.add("observed_branchy");
            }
            if (iM29471 > 0 || (i20 >= 16 && iM29472 >= 4)) {
                r311 = r310;
                r311 = r310;
                jSONArrayArray7.add("observed_dispatcher_like");
                r311 = r310;
            }
        }
        r311 = r310;
        r311 = r310;
        r311 = r310;
        JSONObject jSONObjectAdd13 = jSONObjectAdd9.add("observedGraphSummary", jSONObjectAdd12.add("observedShapeHints", jSONArrayArray7));
        C7570 c7570M29492 = m29492(c17057);
        JSONObject jSONObjectAdd14 = jSONObjectAdd13.add("entryPreview", JSON.object().add("available", c7570M29492 != null).add(str31, c7570M29492 == null ? JSON.NULL : m29488(c7570M29492.f23381)).add("lines", c7570M29492 == null ? JSON.array() : m29472(16, c7570M29492.f23377)));
        ArrayList<C7570> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        m29495(arrayList, hashSet, m29492(c17057));
        Iterator it6 = list4.iterator();
        while (true) {
            i8 = 8;
            if (it6.hasNext()) {
                C7570 c7571 = (C7570) it6.next();
                if (arrayList.size() < 8) {
                    String str37 = c7571.f23379;
                    if ("budget_boundary".equals(str37) || "invalid".equals(str37) || "indirect_jump".equals(str37)) {
                        m29495(arrayList, hashSet, c7571);
                    }
                }
            }
        }
        if (arrayList.size() < 8) {
            int i21 = 0;
            for (C7570 c7572 : list4) {
                if (arrayList.size() < i8) {
                    long j8 = c7572.f23381 + c7572.f23380;
                    while (true) {
                        if (i21 < list5.size()) {
                            list = list5;
                            str11 = str35;
                            str12 = str36;
                            if (((C10708) list.get(i21)).f32286 < c7572.f23381) {
                                i21++;
                                str35 = str11;
                                str36 = str12;
                                list5 = list;
                            }
                        } else {
                            str11 = str35;
                            list = list5;
                            str12 = str36;
                        }
                    }
                    boolean z3 = i21 < list.size() && ((C10708) list.get(i21)).f32286 < j8;
                    String str38 = str34;
                    if (str38.equals(c7572.f23379) || z3) {
                        m29495(arrayList, hashSet, c7572);
                    }
                    str35 = str11;
                    str34 = str38;
                    str36 = str12;
                    list5 = list;
                    i8 = 8;
                }
            }
        }
        String str39 = str35;
        String str40 = str36;
        if (arrayList.size() < 8) {
            ArrayList<C7570> arrayList2 = new ArrayList(list4);
            C6083.sort(arrayList2, C15254.thenComparingLong(C15254.reversed(C8200.comparingLong(new C7861())), new C14916()));
            for (C7570 c7573 : arrayList2) {
                if (arrayList.size() < 8) {
                    m29495(arrayList, hashSet, c7573);
                }
            }
        }
        JSONArray jSONArrayArray8 = JSON.array();
        for (C7570 c7574 : arrayList) {
            jSONArrayArray8.add(JSON.object().add(str31, m29488(c7574.f23381)).add(str8, m29488(c7574.f23382)).add(str32, c7574.f23380).add(str30, c7574.f23378).add(str7, c7574.f23379).add("previewLines", m29472(4, c7574.f23377)));
        }
        JSONObject jSONObjectAdd15 = jSONObjectAdd14.add("notableBlocks", jSONArrayArray8);
        JSONArray jSONArrayArray9 = JSON.array();
        if (c21974.f70373) {
            jSONArrayArray9.add(C10115.m25398(C7416.m19939("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", ErrorBundle.SUMMARY_ENTRY).add("maxAnalysisBytes", c21974.f70374).add("maxBlocks", c21974.f70376).add("maxInstructions", c21974.f70375), "mt_apk_native_analyze_control_flow", "retry", c21974.f70372 ? "Retry CFG from the beginning with budgets clamped to public limits in summary mode; the new result replaces this partial graph and may still be incomplete." : "Retry CFG from the beginning with recommended budgets in summary mode; the new result replaces this partial graph."));
        } else if (!c13919.f41494 && j >= 0) {
            String str41 = c13919.f41492;
            Iterator it7 = list3.iterator();
            while (true) {
                if (it7.hasNext()) {
                    C17763 c17764 = (C17763) it7.next();
                    String str42 = c17764.f54335;
                    if (str41.equals(str42)) {
                        it = it7;
                    } else {
                        it = it7;
                        if ("unresolved_indirect_flow".equals(str41)) {
                            zEquals = str40.equals(str42);
                            str10 = str39;
                        } else {
                            if ("invalid_control_flow_target".equals(str41)) {
                                if (!"target_not_executable".equals(str42)) {
                                    str10 = str39;
                                    if ("unaligned_or_overlapping_target".equals(str42) || str10.equals(str42)) {
                                    }
                                }
                                zEquals = true;
                            } else {
                                str10 = str39;
                            }
                            zEquals = false;
                        }
                        if (zEquals) {
                            if (!str9.equals(str41) || r311.equals(str41) || r29.equals(str41)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            j4 = ((!z2 || "invalid_instruction".equals(str41)) && c17764.f54334) ? c17764.f54336 : c17764.f54337;
                        } else {
                            str39 = str10;
                            it7 = it;
                        }
                    }
                    str10 = str39;
                    zEquals = true;
                    if (zEquals) {
                        str39 = str10;
                        it7 = it;
                    } else {
                        if (str9.equals(str41)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                        }
                    }
                } else {
                    j4 = j;
                }
            }
            jSONArrayArray9.add(C10115.m25398(C7416.m19939("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", "virtual").add("address", C4511.m13257(j4)).add("instructionMode", str).add("stopAtSymbolBoundary", false).add("maxBytes", 4096).add("maxInstructions", 200), "mt_apk_native_disassemble", "inspect", "Inspect a local instruction window because no larger CFG retry is available."));
        }
        return C19993.m46095(jSONObjectAdd15, jSONArrayArray9);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29481(C4334 c4334) {
        byte[] bArr = c4334.f13955;
        int length = bArr.length;
        C8039 c8039 = c4334.f13958;
        String str = c8039.f24787;
        String str2 = c8039.f24790;
        String str3 = c8039.f24791;
        JSONObject jSONObjectAdd = m29476(str, str2, str3).add("addressKind", c8039.f24788).add("address", c8039.f24785).add("instructionMode", c8039.f24782);
        String str4 = c4334.f13957;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("resolvedInstructionMode", str4);
        long j = c4334.f13962;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("effectiveAddress", m29488(j)).add("mapping", m29480(c4334.f13956)).add("arch", c4334.f13959).add("archBits", c4334.f13961).add("instructionSet", c4334.f13960).add("instructionWidth", c4334.f13965).add("patchedVirtualAddress", m29488(j));
        long j2 = c4334.f13964;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patchedFileOffset", m29488(j2)).add("bytesPatched", length).add("expectedHex", c8039.f24792);
        byte[] bArr2 = c4334.f13963;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("assembledHex", C4511.m13260(bArr2)).add("afterHex", C4511.m13260(bArr)).add("paddingMode", c8039.f24784).add("nopBytesInserted", length - bArr2.length);
        JSONArray jSONArrayArray = JSON.array();
        int length2 = bArr.length;
        jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("addressKind", "virtual").add("address", C4511.m13257(j)).add("instructionMode", str4).add("stopAtSymbolBoundary", false).add("maxBytes", Math.min(4096, Math.max(16, length2))).add("maxInstructions", 16), "mt_apk_native_disassemble", "inspect", "Disassemble the patched instruction window"));
        jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j2).add("maxBytes", length2), "mt_apk_read_bytes", "inspect", "Read back the exact patched byte window"));
        return C19993.m46095(jSONObjectAdd5, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29478(C2923 c2923) {
        byte[] bArr = c2923.f9289;
        int length = bArr.length;
        C15093 c15093 = c2923.f9296;
        String str = c15093.f46099;
        String str2 = c15093.f46105;
        String str3 = c15093.f46098;
        JSONObject jSONObjectAdd = m29476(str, str2, str3).add("addressKind", c15093.f46103).add("address", c15093.f46101).add("effectiveAddress", m29488(c2923.f9293)).add("mapping", m29480(c2923.f9294));
        long j = c2923.f9292;
        return C19993.m46095(jSONObjectAdd.add("patchedFileOffset", m29488(j)).add("textEncoding", "utf8").add("expectedTextByteCount", c15093.f46102.length).add("replacementTextByteCount", c15093.f46100.length).add("extraPaddingBytesConsumed", c2923.f9295).add("terminatorPreserved", c2923.f9290).add("bytesPatched", length).add("beforeHex", C4511.m13260(c2923.f9291)).add("afterHex", C4511.m13260(bArr)).add("paddingMode", c15093.f46106), JSON.array().add(C10115.m25398(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j).add("maxBytes", bArr.length), "mt_apk_read_bytes", "inspect", "Read back the exact patched native string byte window")));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m29507(C4043 c4043) throws C3059 {
        boolean z = c4043.f12820;
        boolean z2 = c4043.f12824;
        boolean z3 = c4043.f12821;
        if (!z) {
            if (z3 || z2) {
                throw m29491();
            }
        } else {
            if (z2 && !z3) {
                throw m29491();
            }
            if (c4043.f12822 >= 0 && c4043.f12817 >= 0) {
                long j = c4043.f12827;
                if (j >= 0) {
                    long j2 = c4043.f12818;
                    if (j2 >= 0 && j <= j2) {
                        return;
                    }
                }
            }
            throw m29508();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29503(C4043 c4043) throws C3059 {
        C2632 c2632 = c4043.f12816;
        boolean z = c2632.f8303;
        long j = c2632.f8304;
        long j2 = c2632.f8306;
        long j3 = c2632.f8302;
        String str = c2632.f8301;
        String str2 = c2632.f8307;
        String str3 = c2632.f8305;
        if (!z) {
            if (!str2.isEmpty() || !str.isEmpty() || !str3.isEmpty() || j3 != 0 || c2632.f8308 != 0 || j2 != 0 || j != 0) {
                throw m29491();
            }
            return;
        }
        if (!c4043.f12820 || str2.isEmpty() || str3.isEmpty() || (!(str3.isEmpty() || "auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3) || "unknown".equals(str3)) || j3 < 0 || j2 < 0 || j <= 0 || j2 >= j || j3 > C13132.FOREVER_NS - j || j3 + j2 != c4043.f12822 || str.length() > 4096)) {
            throw m29491();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C3059 m29508() {
        return C3059.m9368("NATIVE_INVALID_ELF_MAPPING", "ELF address mapping is invalid.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m29491() {
        return C3059.m9368("NATIVE_ANALYZER_INVALID_RESULT", "Native ELF analysis returned an inconsistent result.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29476(String str, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", str3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29474(JSONObject jSONObject, String str, String str2, String str3) {
        return C7416.m19939("reason", str, "meaning", str2).add("completionReason", str3).add("warningCode", jSONObject.getString("warningCode", "")).add("warning", jSONObject.getString("warning", ""));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29479(C3059 c3059) {
        JSONValue jSONValueAdd;
        boolean zM17827 = C6450.m17827(c3059);
        JSONObject jSONObject = c3059.f9609;
        if (!zM17827 && jSONObject.get("patchedFileOffset") == null && jSONObject.get("expectedBytes") == null && jSONObject.get("assembledBytes") == null && jSONObject.get("remainingBytes") == null && jSONObject.get("arch") == null && jSONObject.get("message") == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = (C6450.m17827(c3059) ? C6450.m17816(c3059) : JSON.object().add("workspaceId", m29502(jSONObject, "workspaceId")).add("editSessionId", m29502(jSONObject, "editSessionId")).add("locator", m29502(jSONObject, "locator")).add("addressKind", m29502(jSONObject, "addressKind")).add("address", m29502(jSONObject, "address")).add("instructionMode", m29502(jSONObject, "instructionMode")).add("reason", "").add("addressModeHint", "").add("retryInstructionModes", JSON.array())).add("patchedFileOffset", m29506(jSONObject, "patchedFileOffset")).add("expectedHex", m29506(jSONObject, "expectedHex")).add("actualHex", m29506(jSONObject, "actualHex")).add("expectedBytes", m29489(jSONObject, "expectedBytes")).add("assembledBytes", m29489(jSONObject, "assembledBytes")).add("paddingMode", m29506(jSONObject, "paddingMode")).add("remainingBytes", m29489(jSONObject, "remainingBytes")).add("instructionSet", m29506(jSONObject, "instructionSet")).add("instructionWidth", m29506(jSONObject, "instructionWidth")).add("arch", m29506(jSONObject, "arch")).add("bits", m29489(jSONObject, "bits")).add("message", m29506(jSONObject, "message"));
        }
        boolean zM17828 = C6450.m17827(c3059);
        JSONArray jSONArrayM29473 = c3059.f9604;
        if (!zM17828) {
            jSONArrayM29473 = m29473(jSONArrayM29473);
            if (jSONArrayM29473.size() <= 0) {
                if ("PATCH_EXPECTED_MISMATCH".equals(c3059.f9610)) {
                    String strM29502 = m29502(jSONObject, "workspaceId");
                    String strM29503 = m29502(jSONObject, "editSessionId");
                    String strM29504 = m29502(jSONObject, "locator");
                    JSONValue jSONValue = jSONObject.get("byteOffset");
                    int iAsInt = -1;
                    if (jSONValue != null && jSONValue.isNumber()) {
                        try {
                            iAsInt = jSONValue.asInt();
                        } catch (RuntimeException unused) {
                        }
                    }
                    String strM29505 = m29502(jSONObject, "expectedHex");
                    if (strM29502.isEmpty() || strM29503.isEmpty() || strM29504.isEmpty() || iAsInt < 0 || strM29505.length() < 2) {
                        jSONArrayM29473 = JSON.array();
                    } else {
                        jSONArrayM29473 = JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", strM29502, "editSessionId", strM29503).add("locator", strM29504).add("byteOffset", iAsInt).add("maxBytes", Math.max(1, strM29505.length() / 2)), "mt_apk_read_bytes", "retry", "Read current bytes at the stale native patch window, then retry mt_apk_native_patch_instructions with refreshed expectedHex."));
                    }
                } else {
                    jSONArrayM29473 = JSON.array();
                }
            }
        }
        return C19993.m46097(c3059, jSONValueAdd, jSONArrayM29473);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29501(C3059 c3059) {
        JSONValue jSONValueAdd;
        String str = c3059.f9610;
        JSONObject jSONObject = c3059.f9609;
        if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_LENGTH_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str) || "NATIVE_STRING_TOO_LARGE".equals(str) || "NATIVE_STRING_RANGE_OUT_OF_ENTRY".equals(str)) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", m29502(jSONObject, "workspaceId")).add("editSessionId", m29502(jSONObject, "editSessionId")).add("locator", m29502(jSONObject, "locator")).add("addressKind", m29502(jSONObject, "addressKind")).add("address", m29502(jSONObject, "address")).add("patchedFileOffset", m29506(jSONObject, "patchedFileOffset")).add("paddingMode", m29506(jSONObject, "paddingMode")).add("expectedText", m29506(jSONObject, "expectedText")).add("actualText", m29506(jSONObject, "actualText")).add("expectedHex", m29506(jSONObject, "expectedHex")).add("actualHex", m29506(jSONObject, "actualHex")).add("expectedTextByteCount", m29489(jSONObject, "expectedTextByteCount")).add("replacementTextByteCount", m29489(jSONObject, "replacementTextByteCount")).add("requiredPaddingBytes", m29489(jSONObject, "requiredPaddingBytes")).add("actualPaddingHex", m29506(jSONObject, "actualPaddingHex"));
            JSONValue jSONValue = jSONObject.get("terminatorRequired");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                jSONValue = JSON.NULL;
            }
            jSONValueAdd = jSONObjectAdd.add("terminatorRequired", jSONValue).add("bytesPatched", m29489(jSONObject, "bytesPatched")).add("limitBytes", m29489(jSONObject, "limitBytes")).add("endByteOffset", m29506(jSONObject, "endByteOffset")).add("entrySize", m29489(jSONObject, "entrySize"));
        } else {
            jSONValueAdd = JSON.NULL;
        }
        JSONArray jSONArrayM29473 = m29473(c3059.f9604);
        if (jSONArrayM29473.size() <= 0) {
            if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str)) {
                String strM29502 = m29502(jSONObject, "workspaceId");
                String strM29503 = m29502(jSONObject, "editSessionId");
                String strM29504 = m29502(jSONObject, "locator");
                JSONValue jSONValue2 = jSONObject.get("byteOffset");
                int iAsInt = -1;
                if (jSONValue2 != null && jSONValue2.isNumber()) {
                    try {
                        iAsInt = jSONValue2.asInt();
                    } catch (RuntimeException unused) {
                    }
                }
                String strM29505 = m29502(jSONObject, "paddingMode");
                String strM29506 = m29502(jSONObject, "actualHex");
                if (strM29502.isEmpty() || strM29503.isEmpty() || strM29504.isEmpty() || iAsInt < 0 || strM29506.length() < 2 || (strM29506.length() & 1) != 0) {
                    jSONArrayM29473 = JSON.array();
                } else {
                    boolean zEquals = "null_pad".equals(strM29505);
                    jSONArrayM29473 = JSON.array().add(C10115.m25398(C7416.m19939("workspaceId", strM29502, "editSessionId", strM29503).add("locator", strM29504).add("byteOffset", iAsInt).add("maxBytes", zEquals ? 4096 : strM29506.length() / 2), "mt_apk_read_bytes", "retry", zEquals ? "Read up to the native string patch limit and stop at the first NUL, then retry mt_apk_native_patch_string with the bytes before that terminator as refreshed expectedText." : "Read the exact observed patch window, then retry mt_apk_native_patch_string only with refreshed expectedText derived from these bytes; do not include later bytes unless the fixed slot boundary is known independently."));
                }
            } else {
                jSONArrayM29473 = JSON.array();
            }
        }
        return C19993.m46097(c3059, jSONValueAdd, jSONArrayM29473);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m29473(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
            if ("mt_apk_workspace_open".equals(jSONObjectAsObject.getString("tool", null))) {
                jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONValue m29506(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? JSON.NULL : JSON.value(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m29489(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m29502(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m29470(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C7570) it.next()).f23379)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29499(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C17763) it.next()).f54335)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7570 m29492(C17057 c17057) {
        List<C7570> list = c17057.f52264;
        if (list.isEmpty()) {
            return null;
        }
        long j = c17057.f52266.f50328;
        for (C7570 c7570 : list) {
            if (c7570.f23381 == j) {
                return c7570;
            }
        }
        return (C7570) list.get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29495(ArrayList arrayList, HashSet hashSet, C7570 c7570) {
        if (c7570 == null || arrayList.size() >= 8 || !hashSet.add(Long.valueOf(c7570.f23381))) {
            return;
        }
        arrayList.add(c7570);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m29472(int i, String str) {
        JSONArray jSONArrayArray = JSON.array();
        if (!str.isEmpty() && i > 0) {
            int i2 = 0;
            while (jSONArrayArray.size() < i && i2 < str.length()) {
                int iIndexOf = str.indexOf(10, i2);
                if (iIndexOf < 0) {
                    jSONArrayArray.add(str.substring(i2));
                    return jSONArrayArray;
                }
                jSONArrayArray.add(str.substring(i2, iIndexOf));
                i2 = iIndexOf + 1;
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29490(String str) {
        if ("complete".equals(str)) {
            return "All statically resolvable direct control flow within the selected function boundary was explored.";
        }
        if ("max_analysis_bytes_reached".equals(str)) {
            return "Reachable work remains, but maxAnalysisBytes prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public byte-budget limit has been reached.";
        }
        if ("max_blocks_reached".equals(str)) {
            return "Reachable block targets remain, but maxBlocks prevented scheduling another candidate. Use the CFG retry action to replace this partial graph when present; no retry action means the public block-budget limit has been reached.";
        }
        if ("max_instructions_reached".equals(str)) {
            return "Reachable work remains, but maxInstructions prevented decoding another instruction. Use the CFG retry action to replace this partial graph when present; no retry action means the public instruction-budget limit has been reached.";
        }
        if ("invalid_instruction".equals(str)) {
            return "At least one reachable path stopped because an instruction could not be decoded.";
        }
        if ("unresolved_indirect_flow".equals(str)) {
            return "At least one reachable indirect jump target could not be resolved statically.";
        }
        if ("invalid_control_flow_target".equals(str)) {
            return "At least one reachable target was non-executable, overlapping, misaligned, or required a different instruction mode.";
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21268 m29494(C19329 c19329, String str) {
        int i = c19329.f60769;
        long j = i;
        long j2 = c19329.f60778;
        long j3 = c19329.f60771;
        if ("max_analysis_bytes_reached".equals(str)) {
            j = ((long) i) * 2;
        } else if ("max_blocks_reached".equals(str)) {
            j2 *= 2;
        } else if ("max_instructions_reached".equals(str)) {
            j3 *= 2;
        }
        return m29493(c19329, j, j2, j3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m29471(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        double d2 = d * 1.25d;
        return d2 >= 9.223372036854776E18d ? C13132.FOREVER_NS : (long) Math.ceil(d2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21268 m29493(C19329 c19329, long j, long j2, long j3) {
        return new C21268((int) Math.min(65536, Math.max(c19329.f60769, j)), (int) Math.min(4096, Math.max(c19329.f60778, j2)), (int) Math.min(10000, Math.max(c19329.f60771, j3)), j > 65536 || j2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || j3 > 10000);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29480(C4043 c4043) throws C3059 {
        m29507(c4043);
        if (!c4043.f12820) {
            return m29505();
        }
        return JSON.object().add("sectionName", c4043.f12826).add("virtualAddress", m29488(c4043.f12822)).add("fileOffset", m29488(c4043.f12817)).add("rangeOffset", m29488(c4043.f12827)).add("size", c4043.f12818).add("isLoaded", c4043.f12821).add("isExecutable", c4043.f12824).add("segment", c4043.f12819);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29505() {
        JSONObject jSONObjectAdd = JSON.object().add("sectionName", "");
        JSONValue jSONValue = JSON.NULL;
        return jSONObjectAdd.add("virtualAddress", jSONValue).add("fileOffset", jSONValue).add("rangeOffset", jSONValue).add("size", 0).add("isLoaded", false).add("isExecutable", false).add("segment", false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29487(boolean z, String str, int i, int i2, Long l2) {
        return JSON.object().add("hasMore", z).add("nextCursor", str == null ? JSON.NULL : JSON.value(str)).add("returnedCount", i).add("limitMax", i2).add("totalAvailableCount", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONValue m29488(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value(C4511.m13257(j));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29504() {
        return C1648.m5535("Result for mt_apk_native_map_address. ELF address mapping. Check found, mapping.isLoaded, and mapping.isExecutable before following an address. enclosingSymbol is best-effort context.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex.")).add("found", C1648.m5545(ClassTransform.BOOLEAN, "For virtual input, whether the address is in a loaded file-backed ELF range; virtual-only runtime bytes can still miss. For file_offset input, whether SO file bytes contain the offset. Check mapping.isLoaded before treating the mapped address as loaded at runtime.")).add("mapping", C1648.m5532(m29511().add("enclosingSymbol", C18736.m43390(JSON.object().add("found", C1648.m5545(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol contains the mapped virtual address.")).add("name", C1648.m5545("string", "Raw ELF symbol name, or empty string when not found.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled symbol name when available and different from name, otherwise empty string.")).add("instructionMode", C1648.m5545("string", "Best-effort mode hint for mt_apk_native_disassemble or mt_apk_native_analyze_control_flow: auto, arm, thumb, unknown, or empty string when not found. unknown is not a valid tool input; try thumb and arm separately.")).add("startVirtualAddress", C1648.m5542("string", "Symbol start virtual address, or null.")).add("startFileOffset", C1648.m5542("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C1648.m5542("string", "Offset from startVirtualAddress to the mapped virtual address, or null.")), "integer", "Symbol size in bytes, or 0 when not found.", "size", "Best-effort non-imported sized ELF symbol that contains mapping.virtualAddress. It may be a function or another symbol type, and does not guarantee exact function boundaries. When mapping.isExecutable=true and startVirtualAddress is not null, copy startVirtualAddress to mt_apk_native_analyze_control_flow.address and choose outputMode=summary for triage or outputMode=full when detail arrays are needed. instructionMode is only a follow-up hint: auto, arm, and thumb can be copied to mt_apk_native_disassemble or mt_apk_native_analyze_control_flow; unknown means try thumb and arm separately, and empty string means no hint is available.")), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable. enclosingSymbol is best-effort and uses only non-imported sized ELF symbols; enclosingSymbol.found=false may mean stripped symbols, missing symbol sizes, or unavailable symbol metadata, not that no function contains the address. enclosingSymbol.instructionMode is a best-effort follow-up hint, not proof of the symbol's real instruction state.")), "Address mapping result."), C1648.m5540(C1648.m5532(JSON.object(), "No tool-specific diagnostics.")), C1648.m5534("mt_apk_native_map_address nextActions is intentionally empty."));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29500() {
        return C1648.m5535("Result for mt_apk_native_disassemble. An instruction window in disassemblyText with address, mode, boundary, and continuation metadata. Check incompleteInstructionAtEnd before interpreting trailing bytes.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C1648.m5545("string", "Requested instruction mode.")).add("stopAtSymbolBoundary", C1648.m5545(ClassTransform.BOOLEAN, "Whether this window should use the containing best-effort sized ELF symbol end as an upper bound when available.")).add("resolvedInstructionMode", C1648.m5545("string", "Resolved instruction mode.")).add("effectiveAddress", C1648.m5542("string", "Effective virtual address.")).add("mapping", C1648.m5532(m29511(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("symbolBoundary", C18736.m43390(JSON.object().add("requested", C1648.m5545(ClassTransform.BOOLEAN, "Whether stopAtSymbolBoundary was requested.")).add("applied", C1648.m5545(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol end is available as an upper bound for this disassembly view.")).add("endReached", C1648.m5545(ClassTransform.BOOLEAN, "Whether bytesConsumed reaches endVirtualAddressExclusive in this response.")).add("name", C1648.m5545("string", "Raw ELF symbol name when applied, otherwise empty string.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled symbol name when applied and available, otherwise empty string.")).add("startVirtualAddress", C1648.m5542("string", "Symbol start virtual address, or null.")).add("endVirtualAddressExclusive", C1648.m5542("string", "Symbol end address, the first address after this symbol, or null.")).add("offset", C1648.m5542("string", "Offset from startVirtualAddress to data.effectiveAddress, or null.")), "integer", "Symbol size in bytes, or 0 when not applied.", "size", "Best-effort disassembly stop boundary. applied=true means a symbol end address is available as an upper bound for this view; maxBytes or maxInstructions may still stop the response earlier. Disassembly never crosses endVirtualAddressExclusive when applied=true. endReached=true only means this response consumed bytes up to that end address, not that a full function was disassembled.")).add("arch", C1648.m5545("string", "Architecture used for disassembly.")).add("archBits", C1648.m5545("integer", "ELF class/ABI bit width; ARM32 stays 32 even when decoding Thumb instructions.")).add("instructionSet", C1648.m5545("string", "Instruction set used for this disassembly: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C1648.m5545("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("bytesRead", C1648.m5545("integer", "Logical byte window length exposed for this response, capped by maxBytes and the current mapping or applied symbol boundary.")).add("bytesConsumed", C1648.m5545("integer", "Bytes represented by disassemblyText.")).add("incompleteInstructionAtEnd", C1648.m5545(ClassTransform.BOOLEAN, "Whether the byte window ended with leftover bytes that are too short to form one complete instruction. These leftover bytes are not counted in bytesConsumed; retry the same address with a larger maxBytes instead of treating this as invalid code.")).add("disassemblyText", C1648.m5545("string", "Compact instruction text. Each line is \"0x<hex-address>: <hex-bytes> <assembly>\"; addresses include the 0x prefix and can be copied directly with addressKind=virtual, addresses have no leading zero padding. Lines have no indentation and use one space between columns. Machine bytes are contiguous lowercase hex in original byte order, ready to concatenate into expectedHex. The address is the effective virtual address, not the input file offset or original odd Thumb address.")).add("instructionCount", C1648.m5545("integer", "Instruction count represented in disassemblyText.")).add("hasMore", C1648.m5545(ClassTransform.BOOLEAN, "Whether another contiguous window is available.")).add("nextAddressKind", C1648.m5542("string", "Value to pass as addressKind on the next mt_apk_native_disassemble call, or null.")).add("nextAddress", C1648.m5542("string", "Value to pass as address on the next mt_apk_native_disassemble call, or null.")).add("nextInstructionMode", C1648.m5542("string", "Value to pass as instructionMode on the next mt_apk_native_disassemble call, or null.")), "Disassembly result."), C1648.m5540(C1648.m5532(m29475("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_disassemble errors; diagnostics is null for unrelated argument or runtime errors.")), C1648.m5538("When data.hasMore=true, a purpose=continue action calls mt_apk_native_disassemble with complete arguments for the next window; otherwise success has no actions. ARM32 instructionMode errors may return mt_apk_native_disassemble retry actions; copy those arguments directly. Follow each action's tool and purpose, not mt_apk_continue. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C1648.m5533(C11166.m27706(), "mt_apk_native_disassemble", "continue"), C1648.m5533(C11166.m27706(), "mt_apk_native_disassemble", "retry"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29509() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex; odd ARM32 virtual input keeps the Thumb T-bit here.")).add("instructionMode", C1648.m5545("string", "Requested instruction mode.")).add("outputMode", C1648.m5539("Requested output mode: full or summary.", "full", ErrorBundle.SUMMARY_ENTRY)).add("detailOmitted", C1648.m5545(ClassTransform.BOOLEAN, "true only when outputMode=summary; blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while observed counts remain populated.")).add("resolvedInstructionMode", C1648.m5545("string", "Instruction mode used to decode this CFG.")).add("effectiveAddress", C1648.m5545("string", "Mapped virtual address for the request; ARM32 Thumb clears the T-bit.")).add("mapping", C1648.m5532(m29511(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C1648.m5545("string", "Architecture used for CFG decoding.")).add("archBits", C1648.m5545("integer", "ELF class/ABI bit width; ARM32 stays 32 for Thumb CFGs.")).add("instructionSet", C1648.m5545("string", "Instruction set used for this graph: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C1648.m5545("string", "Instruction width category: mixed16_32, fixed32, or variable.")).add("function", C18736.m43390(JSON.object().add("startVirtualAddress", C1648.m5545("string", "Function candidate start virtual address as lowercase 0x hex.")).add("startFileOffset", C1648.m5545("string", "Function candidate start ELF file offset as lowercase 0x hex.")).add("name", C1648.m5545("string", "Raw ELF symbol name, or empty string for requested_address fallback.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled name when available, otherwise empty string.")).add("symbolSize", C1648.m5545("integer", "Sized symbol byte length, or 0 for requested_address fallback.")).add("startSource", C1648.m5539("How the start was selected.", "function_symbol", "executable_symbol", "requested_address")).add("boundarySource", C1648.m5539("How the exclusive end boundary was selected.", "function_symbol", "executable_symbol", "executable_mapping")), "string", "Exclusive function boundary end as lowercase 0x hex.", "boundaryEndVirtualAddress", "Selected function candidate and exclusive analysis boundary. Symbol-based boundaries are best-effort ELF metadata; requested_address falls back to the initial executable mapping.")).add("blocks", C7416.m19939("type", "array", "description", "Basic-block details sorted by virtual address. In outputMode=full, this array contains the observed blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.blockCount for the observed count. assemblyText is compact factual disassembly without machine bytes; each line is 0xaddress: mnemonic operands.").add("items", C18736.m43390(JSON.object().add("startVirtualAddress", C1648.m5545("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C1648.m5545("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C1648.m5545("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C1648.m5545("integer", "Instruction lines in assemblyText.")).add("terminator", C1648.m5539("How this block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")), "string", "One line per instruction in the form 0xaddress: mnemonic operands; no machine bytes.", "assemblyText", "One returned basic block."))).add("edges", C7416.m19939("type", "array", "description", "Confirmed direct edge details. In outputMode=full, both endpoints are block starts present in blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.edgeCount for the observed count. Calls are not CFG edges.").add("items", C1648.m5532(JSON.object().add("fromVirtualAddress", C1648.m5545("string", "Source block start as lowercase 0x hex.")).add("toVirtualAddress", C1648.m5545("string", "Target block start as lowercase 0x hex.")).add("kind", C1648.m5539("Edge kind.", "fallthrough", "branch_true", "branch_false", "jump")), "One direct block edge."))).add("externalFlows", C7416.m19939("type", "array", "description", "Known direct exit details from the selected function. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.externalFlowCount for the observed count. These are expected exits and do not make controlFlowComplete false.").add("items", C1648.m5532(JSON.object().add("sourceVirtualAddress", C1648.m5545("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C1648.m5539("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C1648.m5545("string", "Known external target as lowercase 0x hex.")).add("reason", C1648.m5539("Why this target was not followed.", "outside_function_boundary", "other_function_symbol")), "One known external flow.")));
        JSONObject jSONObjectM5532 = C1648.m5532(JSON.object().add("sourceVirtualAddress", C1648.m5545("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C1648.m5539("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C1648.m5545("string", "Known target address as lowercase 0x hex.")).add("reason", C1648.m5539("Why the target was unresolved.", "target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction")), "Known target that could not become a returned block.");
        return C1648.m5535("Result for mt_apk_native_analyze_control_flow. A bounded function graph or summary. Read analysisSummary for completeness. Shape hints describe only the observed subgraph. Retry results replace the previous graph; never merge them.", C1648.m5532(jSONObjectAdd.add("unresolvedFlows", C7416.m19939("type", "array", "description", "Details for control-flow paths not converted into confirmed block edges. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.unresolvedFlowCount and observedGraphSummary.unresolvedReasonCounts for observed totals and reason counts. Read analysisSummary.completionReason before retrying or drawing conclusions.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM5532).add(C1648.m5532(JSON.object().add("sourceVirtualAddress", C1648.m5545("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C1648.m5536("indirect_jump", "Indirect jump flow.")).add("reason", C1648.m5536("indirect_target", "The target is not statically known.")), "Indirect jump whose target was not statically known.")).add(C1648.m5532(JSON.object().add("sourceVirtualAddress", C1648.m5545("string", "Function candidate start as lowercase 0x hex.")).add("flowKind", C1648.m5536("decode", "Entry decode flow.")).add("reason", C1648.m5536("invalid_instruction", "The entry instruction could not be decoded.")), "Function entry could not be decoded."))))).add("analysisSummary", C18736.m43390(JSON.object().add("controlFlowComplete", C1648.m5545(ClassTransform.BOOLEAN, "Whether all statically resolvable direct flow inside the selected boundary was explored with no unresolved flows.")).add("completionReason", C1648.m5539("Primary completion reason in fixed priority order.", "complete", "max_analysis_bytes_reached", "max_blocks_reached", "max_instructions_reached", "invalid_instruction", "unresolved_indirect_flow", "invalid_control_flow_target")).add("meaning", C1648.m5545("string", "Stable explanation of completionReason and retry semantics.")).add("bytesAnalyzed", C1648.m5545("integer", "Unique successfully decoded instruction bytes.")), "integer", "Unique successfully decoded instructions.", "instructionsAnalyzed", "CFG completeness and budget usage. controlFlowComplete is true only when completionReason=complete and observedGraphSummary.unresolvedFlowCount=0. Read observedGraphSummary for counts in both output modes. Budget retry results replace this graph and must not be merged; a budget reason without a retry action means its limiting budget is already at the public limit.")).add("observedGraphSummary", C1648.m5532(JSON.object().add("blockCount", C1648.m5545("integer", "Observed basic-block count; this can be lower than the consumed candidate budget.")).add("edgeCount", C1648.m5545("integer", "Observed confirmed direct edge count.")).add("externalFlowCount", C1648.m5545("integer", "Observed known external flow count.")).add("unresolvedFlowCount", C1648.m5545("integer", "Observed unresolved flow count.")).add("terminatorCounts", C18736.m43390(JSON.object().add("fallthrough", C1648.m5545("integer", "Observed fallthrough terminator count.")).add("conditional_jump", C1648.m5545("integer", "Observed conditional_jump terminator count.")).add("jump", C1648.m5545("integer", "Observed jump terminator count.")).add("indirect_jump", C1648.m5545("integer", "Observed indirect_jump terminator count.")).add("return", C1648.m5545("integer", "Observed return terminator count.")).add("trap", C1648.m5545("integer", "Observed trap terminator count.")).add("invalid", C1648.m5545("integer", "Observed invalid terminator count.")), "integer", "Observed budget_boundary terminator count.", "budget_boundary", "Observed basic-block terminator counts; all fields are present and 0 means no observed block used that terminator.")).add("unresolvedReasonCounts", C18736.m43390(JSON.object().add("target_not_executable", C1648.m5545("integer", "Observed target_not_executable count.")).add("unaligned_or_overlapping_target", C1648.m5545("integer", "Observed unaligned_or_overlapping_target count.")).add("instruction_mode_transition", C1648.m5545("integer", "Observed instruction_mode_transition count.")).add("max_blocks_reached", C1648.m5545("integer", "Observed max_blocks_reached count.")).add("max_analysis_bytes_reached", C1648.m5545("integer", "Observed max_analysis_bytes_reached count.")).add("max_instructions_reached", C1648.m5545("integer", "Observed max_instructions_reached count.")).add("invalid_instruction", C1648.m5545("integer", "Observed invalid_instruction count.")), "integer", "Observed indirect_target count.", "indirect_target", "Observed unresolved-flow reason counts; all fields are present and 0 means no observed unresolved flow used that reason.")).add("observedShapeHints", C1648.m5541("Conservative observed-only hints. Values may include observed_linear, observed_branchy, and observed_dispatcher_like. Empty array means no hint matched.")), "Observed CFG summary for the subgraph analyzed in this call. Counts remain populated in both output modes. In summary mode, the four detail array fields remain present but empty, so use these counts instead of their lengths. observedShapeHints are conservative hints about the observed subgraph only.")).add("entryPreview", C1648.m5532(JSON.object().add("available", C1648.m5545(ClassTransform.BOOLEAN, "Whether an entry or fallback first block was available.")).add("startVirtualAddress", C1648.m5542("string", "Preview block start address, or null when unavailable.")).add("lines", C1648.m5541("At most 16 original assemblyText lines from the entry or fallback first block.")), "Entry block preview copied from the original assemblyText lines without reparsing addresses or instructions.")).add("notableBlocks", C7416.m19939("type", "array", "description", "At most 8 representative observed blocks selected for summary triage. Preview lines are copied from original assemblyText without reparsing.").add("items", C1648.m5532(JSON.object().add("startVirtualAddress", C1648.m5542("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C1648.m5542("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C1648.m5545("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C1648.m5545("integer", "Instruction count reported for the full block.")).add("terminator", C1648.m5539("How this observed block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")).add("previewLines", C1648.m5541("At most 4 original assemblyText lines from this block.")), "One observed notable block preview."))), "Function-local direct static CFG result. Read analysisSummary before treating this graph as complete; a budget retry replaces this result rather than extending it."), C1648.m5540(C1648.m5532(m29475("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_analyze_control_flow errors; diagnostics is null for unrelated argument or runtime errors.")), C1648.m5538("Budget or ARM32 mode errors may return mt_apk_native_analyze_control_flow retry actions. A retry result replaces the previous graph and must not be merged. When no larger CFG retry is available, mt_apk_native_disassemble may inspect a local instruction window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open.", C1648.m5533(C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C1648.m5545("string", "ZIP entry locator for the native ELF.")).add("addressKind", C1648.m5539("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C1648.m5545("string", "Unsigned address string for a function symbol or an address inside the function candidate.")).add("instructionMode", C1648.m5539("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("outputMode", C1648.m5539("Output mode: full populates graph detail arrays; summary keeps the required detail arrays present but empty while observed counts remain populated.", "full", ErrorBundle.SUMMARY_ENTRY)).add("maxAnalysisBytes", C1648.m5545("integer", "Unique successfully decoded instruction-byte budget.")).add("maxBlocks", C1648.m5545("integer", "Candidate basic-block start budget.")), "integer", "Unique successfully decoded instruction budget.", "maxInstructions", "Arguments for mt_apk_native_analyze_control_flow."), "mt_apk_native_analyze_control_flow", "retry"), C1648.m5533(C11166.m27706(), "mt_apk_native_disassemble", "inspect"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29497() {
        JSONObject jSONObjectM43390 = C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id that was modified.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed input address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex. ARM32 odd Thumb virtual input keeps bit0 here.")).add("instructionMode", C1648.m5545("string", "Requested instruction mode.")).add("resolvedInstructionMode", C1648.m5545("string", "Resolved instruction mode used for assembly and follow-up disassembly.")).add("effectiveAddress", C1648.m5542("string", "Effective virtual address used for mapping and assembly. Thumb virtual input clears the T-bit here.")).add("mapping", C1648.m5532(m29511(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C1648.m5545("string", "Architecture passed to the assembler.")).add("archBits", C1648.m5545("integer", "ELF class/ABI bit width; ARM32 stays 32 even when patching Thumb instructions.")).add("instructionSet", C1648.m5545("string", "Instruction set used for this patch: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C1648.m5545("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("patchedVirtualAddress", C1648.m5542("string", "Virtual address actually patched. This equals effectiveAddress and never includes the ARM Thumb T-bit.")).add("patchedFileOffset", C1648.m5542("string", "ELF file offset inside the zip_entry bytes that was patched.")).add("bytesPatched", C1648.m5545("integer", "Final equal-length byte count written to the edit session.")).add("expectedHex", C1648.m5545("string", "Expected bytes that were verified before writing, uppercase hex without spaces.")).add("assembledHex", C1648.m5545("string", "Raw bytes produced by the assembler before optional NOP padding, uppercase hex without spaces.")).add("afterHex", C1648.m5545("string", "Final bytes written after optional NOP padding, uppercase hex without spaces.")).add("paddingMode", C1648.m5545("string", "Padding mode used for this patch: none or nop.")), "integer", "Number of NOP padding bytes appended to assembledHex before writing.", "nopBytesInserted", "Native instruction patch result.");
        JSONObject jSONObjectM29475 = m29475("Stable instruction-mode reason token for retryable ARM32 patch errors. Empty string means this is not an instruction-mode retry error; ignore addressModeHint and retryInstructionModes and inspect the other diagnostics fields instead.", "Fixed ARM32 address hint string. Empty string means this is not an instruction-mode retry error.");
        jSONObjectM29475.add("patchedFileOffset", C1648.m5542("string", "Patch ELF file offset for expectedHex mismatch, or null.")).add("expectedHex", C1648.m5542("string", "Expected uppercase hex for a stale guard mismatch, or null.")).add("actualHex", C1648.m5542("string", "Actual uppercase hex read from the current edit session view, or null.")).add("expectedBytes", C1648.m5542("integer", "Patch window byte count for length errors, or null.")).add("assembledBytes", C1648.m5542("integer", "Assembler output byte count for length errors, or null.")).add("paddingMode", C1648.m5542("string", "Requested padding mode for length errors, or null.")).add("remainingBytes", C1648.m5542("integer", "Bytes left to fill when NOP padding is unavailable, or null.")).add("instructionSet", C1648.m5542("string", "Instruction set for NOP padding diagnostics, or null.")).add("instructionWidth", C1648.m5542("string", "Instruction width for NOP padding diagnostics, or null.")).add("arch", C1648.m5542("string", "Assembler architecture for assembly failures, or null.")).add("bits", C1648.m5542("integer", "Assembler bit width for assembly failures, or null.")).add("message", C1648.m5542("string", "Sanitized assembler failure message, or null."));
        return C1648.m5535("Result for mt_apk_native_patch_instructions. Verified instruction replacement. assembledHex contains assembled bytes; afterHex includes any NOP padding. Use nextActions for read-back or error recovery.", jSONObjectM43390, C1648.m5540(C1648.m5532(jSONObjectM29475, "native_patch_instructions diagnostics. diagnostics is null for unrelated argument errors. The instruction-mode fields reason, addressModeHint, and retryInstructionModes apply only to ARM32 retry errors; when reason is empty, ignore those fields and use expectedHex/actualHex, expectedBytes/assembledBytes, remainingBytes, or message to decide the next step.")), C1648.m5538("Successful native instruction patch returns disassemble and read_bytes verification actions. ARM32 instructionMode errors may return native patch retry actions; stale expectedHex errors may return read_bytes recovery. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C1648.m5533(C11166.m27706(), "mt_apk_native_disassemble", "inspect"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "inspect"), C1648.m5533(C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Non-empty edit session id returned by mt_apk_session_create.")).add("locator", C1648.m5545("string", "ZIP entry locator for the native ELF.")).add("addressKind", C1648.m5539("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C1648.m5545("string", "Unsigned target address string copied from the failed request. The effective address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit.")).add("instructionMode", C1648.m5539("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("expectedHex", C1648.m5545("string", "Stale-view guard bytes for the patch window. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it or use replacement bytes.")).add("replacementAssembly", C1648.m5545("string", "Assembly source text containing instructions and labels only, not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly.")).add("paddingMode", C1648.m5539("Padding mode: none or nop.", "none", "nop")), "Arguments for mt_apk_native_patch_instructions."), "mt_apk_native_patch_instructions", "retry"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "retry"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static JSONObject m29510() {
        return C1648.m5535("Result for mt_apk_native_patch_string. String patch result. beforeHex and afterHex cover the full byte window including padding or a final NUL. Use nextActions to verify the result.", C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id that was modified.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed input address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex.")).add("effectiveAddress", C1648.m5542("string", "Mapped virtual address used for context, or null when file_offset input is not mapped.")).add("mapping", C1648.m5532(m29511(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("patchedFileOffset", C1648.m5542("string", "Patched SO file offset inside the zip_entry bytes as lowercase 0x hex. Use nextActions[].arguments.byteOffset for decimal mt_apk_read_bytes input.")).add("textEncoding", C1648.m5545("string", "Always utf8; this is not an input option.")).add("expectedTextByteCount", C1648.m5545("integer", "UTF-8 byte count of expectedText.")).add("replacementTextByteCount", C1648.m5545("integer", "UTF-8 byte count of replacementText.")).add("extraPaddingBytesConsumed", C1648.m5545("integer", "Extra padding bytes consumed after expectedText when replacementText is longer; 0 when equal or shorter.")).add("terminatorPreserved", C1648.m5545(ClassTransform.BOOLEAN, "true only for successful null_pad patches; false for none and space_pad.")).add("bytesPatched", C1648.m5545("integer", "Complete patch window byte count, not actual changed byte count.")).add("beforeHex", C1648.m5545("string", "Complete bytes verified before writing, uppercase hex. Includes padding or final NUL when applicable.")).add("afterHex", C1648.m5545("string", "Complete bytes written, uppercase hex. Includes padding or final NUL when applicable.")), "string", "Padding mode used for this patch: none, null_pad, or space_pad.", "paddingMode", "Native UTF-8 string patch result."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string when unavailable.")).add("locator", C1648.m5545("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C1648.m5545("string", "Requested address kind, or empty string when unavailable.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("patchedFileOffset", C1648.m5542("string", "Patched SO file offset as lowercase 0x hex, or null.")).add("paddingMode", C1648.m5542("string", "Requested padding mode, or null.")).add("expectedText", C1648.m5542("string", "Expected UTF-8 text stale guard, or null.")).add("actualText", C1648.m5542("string", "Best-effort readable actual text prefix, or null. The exact bytes are in actualHex.")).add("expectedHex", C1648.m5542("string", "Expected full patch window bytes as uppercase hex, or null.")).add("actualHex", C1648.m5542("string", "Actual current bytes as uppercase hex, or null.")).add("expectedTextByteCount", C1648.m5542("integer", "UTF-8 byte count of expectedText, or null.")).add("replacementTextByteCount", C1648.m5542("integer", "UTF-8 byte count of replacementText, or null.")).add("requiredPaddingBytes", C1648.m5542("integer", "Padding bytes checked after expectedText, or null.")).add("actualPaddingHex", C1648.m5542("string", "Actual padding/terminator bytes as uppercase hex, or null.")).add("terminatorRequired", C1648.m5542(ClassTransform.BOOLEAN, "Whether null_pad required a final NUL terminator, or null.")).add("bytesPatched", C1648.m5542("integer", "Complete patch window byte count, or null.")).add("limitBytes", C1648.m5542("integer", "Maximum supported patch window bytes, or null.")).add("endByteOffset", C1648.m5542("string", "Exclusive end SO file offset as lowercase 0x hex, or null.")).add("entrySize", C1648.m5542("integer", "SO entry size in bytes, or null.")), "native_patch_string diagnostics. diagnostics is null for unrelated argument errors. actualText is only a readable best-effort prefix; use actualHex as the exact stale-guard fact.")), C1648.m5538("Successful native string patch returns one read_bytes verification action. Stale expectedText or padding errors use a 4096-byte recovery window only for null_pad; space_pad and none stay within the exact observed window because their slot boundary is not self-describing. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "inspect"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "retry"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static JSONObject m29498() {
        return C1648.m5535("Result for mt_apk_native_xref. Direct static references. Read scanSummary before interpreting empty refs or warnings; pagination.hasMore controls continuation. Results are not a complete caller graph.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("addressKind", C1648.m5545("string", "Parsed input address kind: virtual or file_offset.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C1648.m5545("string", "Requested instruction mode.")).add("resolvedInstructionMode", C1648.m5545("string", "Resolved instruction mode used for scanning source instructions; data-only scans return auto.")).add("scanKind", C1648.m5545("string", "Scan domain used for this page: code, data, or both.")).add("referenceKinds", C1648.m5541("Reference kinds used for this scan, normalized in fixed order. Values are call, jump, data, and unknown; jump covers branch/jump instructions. In data phases only data refs are emitted.")).add("targetMapped", C1648.m5545(ClassTransform.BOOLEAN, "Whether the target has a loaded file-backed mapping usable for this xref scan. false may mean miss, virtual-only address, or mapping.isLoaded=false.")).add("targetVirtualAddress", C1648.m5542("string", "Mapped target virtual address when targetMapped=true, otherwise null. ARM32 odd virtual input clears bit0 only for an executable mapping; a loaded non-executable odd target stays exact. Executable ARM32 targets may still match odd Thumb function pointers when this value is even.")).add("targetFileOffset", C1648.m5542("string", "Mapped target ELF file offset within the zip_entry bytes when targetMapped=true, otherwise null.")).add("mapping", C1648.m5532(m29511(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C1648.m5545("string", "Architecture used for scanning.")).add("archBits", C1648.m5545("integer", "ELF class/ABI bit width; ARM32 stays 32 even when scanning Thumb instructions.")).add("instructionSet", C1648.m5545("string", "Instruction set used for source instructions: thumb, arm, aarch64, x86, or x86_64; data-only scans return an empty string.")).add("instructionWidth", C1648.m5545("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86; data-only scans return an empty string.")).add("refs", C7416.m19939("type", "array", "description", "Best-effort direct static references found on this page after applying data.scanKind and data.referenceKinds. Use data.scanSummary.reason, data.scanSummary.meaning, and data.scanSummary.completionReason to interpret empty refs; read data.scanSummary.warningCode and data.scanSummary.warning before trusting low-address instruction data refs. Do not treat empty refs alone as proof that no matching reference exists.").add("items", C18736.m43390(JSON.object().add("sourceVirtualAddress", C1648.m5542("string", "Source virtual address.")).add("sourceFileOffset", C1648.m5542("string", "Source ELF file offset within the zip_entry bytes; convert this 0x hex string to a decimal byteOffset before calling mt_apk_read_bytes.")).add("sourceKind", C1648.m5545("string", "Source kind: instruction, data_relocation, or data_pointer.")).add("sourceSize", C1648.m5545("integer", "Source byte size represented by bytes: instruction size for sourceKind=instruction, or data slot size for data_relocation/data_pointer.")).add("sourceSymbol", C1648.m5544(C1648.m5532(JSON.object().add("name", C1648.m5545("string", "Raw ELF symbol name.")).add("demangledName", C1648.m5545("string", "Best-effort C++ demangled name when available and different from name, otherwise empty string.")).add("startVirtualAddress", C1648.m5545("string", "Symbol start virtual address as a lowercase 0x hex string.")).add("startFileOffset", C1648.m5542("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C1648.m5545("string", "Offset from startVirtualAddress to this ref source address as a lowercase 0x hex string.")).add("size", C1648.m5545("integer", "Symbol size in bytes; this is best-effort metadata, not proof of an exact function boundary.")), "Best-effort non-imported sized ELF symbol containing this ref source address. null means no safe symbol context is available; stripped or malformed symbol metadata can cause null. For sourceKind=instruction, use startVirtualAddress with mt_apk_native_analyze_control_flow, copy xref data.resolvedInstructionMode to preserve ARM32 source mode, and choose outputMode=summary for triage or outputMode=full for detail arrays; use mt_apk_native_disassemble for exact bytes. For data sources, this is owner context for the slot or pointer, not a CFG function entry or caller relationship."))).add("bytes", C1648.m5545("string", "Source bytes as lowercase hex.")).add(TextBundle.TEXT_ENTRY, C1648.m5545("string", "Disassembled instruction text, relocation summary, or data pointer text, truncated to 512 characters.")), "string", "Reference kind: call, jump, data, or unknown. jump covers branch/jump instructions.", "referenceKind", "Native xref item."))).add("scannedBytes", C1648.m5545("integer", "Code/data-pointer bytes scanned on this page; relocation item scanning is not counted here and uses its own per-page budget.")).add("scanComplete", C1648.m5545(ClassTransform.BOOLEAN, "Whether this xref request has no more pages. Prefer data.scanSummary.reason, meaning, and completionReason to interpret empty refs and progress.")).add("scanSummary", C18736.m43390(JSON.object().add("reason", C1648.m5545("string", "Stable reason token: target_not_mapped, refs_found, scan_incomplete, or no_refs_found.")).add("meaning", C1648.m5545("string", "Short explanation of this page and whether to continue.")).add("completionReason", C1648.m5545("string", "Stable page-stop token: target_not_mapped, result_limit_reached, scan_budget_exhausted, relocation_page_budget_exhausted, or scan_space_exhausted.")).add("warningCode", C1648.m5545("string", "Stable warning token, or empty string when no warning applies. low_address_instruction_data_reference_noise means code/both instruction data refs may match ordinary immediates.")), "string", "Short warning text, or empty string when no warning applies.", "warning", "Stable explanation of this native xref page. reason is one of target_not_mapped, refs_found, scan_incomplete, or no_refs_found. completionReason explains why this page stopped: target_not_mapped means no scan ran; result_limit_reached means this page stopped after returning limit refs; scan_budget_exhausted means this page used maxScanBytes and can continue; relocation_page_budget_exhausted means this page used the relocation item page budget and can continue; scan_space_exhausted means the selected direct-reference scan space is exhausted, but it is not proof of a complete caller graph. data.scanSummary.warningCode and data.scanSummary.warning are empty unless this request has a known AI interpretation risk. Read meaning before treating empty refs as no references.")).add("pagination", C1648.m5537("Number of refs returned on this page.", "Maximum limit accepted by mt_apk_continue for later native xref pages.", "Always null for native xref because the tool does not pre-scan the whole SO; null means unknown, not zero. Use hasMore only as the continuation signal; use data.scanSummary to interpret scan meaning.")), "Native xref scan result."), C1648.m5540(C1648.m5532(m29475("Stable reason token: arm32_mode_required or data_scan_requires_auto.", "Fixed hint string: ARM32 file/even address does not identify ARM or Thumb, data scan does not decode instructions, odd target virtual address does not identify source instruction mode, or empty string when no mode hint is available.").add("scanKind", C1648.m5545("string", "Requested scan kind, or empty string when unavailable.")).add("referenceKinds", C1648.m5541("Requested reference kinds, or empty when unavailable.")), "Instruction mode diagnostics for ARM32/data-scan mt_apk_native_xref errors; diagnostics is null for unrelated argument or runtime errors.")), C1648.m5538("Success continuation uses mt_apk_continue when data.pagination.hasMore=true. ARM32 or data-scan instructionMode errors may return mt_apk_native_xref retry actions; copy those arguments directly. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C1648.m5545("string", "ZIP entry locator for the native ELF.")).add("addressKind", C1648.m5539("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C1648.m5545("string", "Unsigned target address string copied from the failed request.")).add("instructionMode", C1648.m5539("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("scanKind", C1648.m5539("Scan domain: code, data, or both.", "code", e.m, "both")).add("referenceKinds", C7416.m19939("type", "array", "description", "Reference kinds to return.").add("items", C1648.m5539("Reference kind.", "call", "jump", e.m, "unknown"))).add("maxScanBytes", C1648.m5545("integer", "Maximum code/data-pointer bytes to consume on this xref page.")), "integer", "Maximum refs to return on this page.", "limit", "Arguments for mt_apk_native_xref."), "mt_apk_native_xref", "retry"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m29475(String str, String str2) {
        return JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK or unavailable context.")).add("locator", C1648.m5545("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C1648.m5545("string", "Requested address kind, or empty string when unavailable.")).add("address", C1648.m5545("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("instructionMode", C1648.m5545("string", "Requested instruction mode, or empty string when unavailable.")).add("reason", C1648.m5545("string", str)).add("addressModeHint", C1648.m5545("string", str2)).add("retryInstructionModes", C1648.m5541("Instruction modes corresponding one-to-one with root nextActions retry actions, in the same order. Empty when no retry action is available."));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m29511() {
        return JSON.object().add("sectionName", C1648.m5545("string", "Section or segment name, or empty string on miss.")).add("virtualAddress", C1648.m5542("string", "Mapped virtual address, or null.")).add("fileOffset", C1648.m5542("string", "Mapped ELF file offset within the zip_entry bytes, or null.")).add("rangeOffset", C1648.m5542("string", "Offset inside mapped range, or null.")).add("size", C1648.m5545("integer", "Mapped range size, or 0 on miss.")).add("isLoaded", C1648.m5545(ClassTransform.BOOLEAN, "Whether this file-backed mapping belongs to a loaded ELF range. false means do not treat it as a runtime address; true does not make virtual-only bytes outside file backing mappable.")).add("isExecutable", C1648.m5545(ClassTransform.BOOLEAN, "Whether this loaded mapping is executable; do not disassemble when false.")).add("segment", C1648.m5545(ClassTransform.BOOLEAN, "Whether the mapping came from a segment; this does not mean the address is loaded."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m29496(String str, boolean z) {
        if (str == null) {
            return false;
        }
        if ((z && str.isEmpty()) || str.length() > 1024) {
            return false;
        }
        try {
            CharsetEncoder charsetEncoderNewEncoder = StandardCharsets.UTF_8.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str)).remaining() <= 1024;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }
}
