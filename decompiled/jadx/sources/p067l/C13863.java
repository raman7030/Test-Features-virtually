package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0655am;
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
public final class C13863 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31540(C2632 c2632, C8222 c8222) {
        String str;
        int i;
        String str2 = c2632.f4379;
        String str3 = c2632.f4376;
        String str4 = c2632.f4378;
        JSONObject jSONObjectAdd = m31539(str2, str3, str4).add("type", c8222.f21794).add("arch", c8222.f21802).add(C0655am.f2362w, c8222.f21811).add("machine", c8222.f21797).add("abi", c8222.f21795).add(C0655am.f2363x, c8222.f21809).add("subsystem", c8222.f21798).add("interpreter", c8222.f21796).add("archBits", c8222.f21807).add("hasVirtualAddress", c8222.f21800).add("positionIndependent", c8222.f21793).add("nx", c8222.f21808).add("canary", c8222.f21806).add("baseAddress", m31551(c8222.f21805)).add("entryVirtualAddress", m31551(c8222.f21810)).add("entryFileOffset", m31551(c8222.f21799)).add("initVirtualAddress", m31551(c8222.f21804)).add("finiVirtualAddress", m31551(c8222.f21801));
        C12246 c12246 = c8222.f21803;
        String str5 = "neededLibraries";
        JSONObject jSONObjectAdd2 = JSON.object().add("neededLibraries", c12246.f34223);
        int i2 = c12246.f34226;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("sections", i2);
        int i3 = c12246.f34219;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("segments", i3);
        int i4 = c12246.f34222;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("imports", i4);
        int i5 = c12246.f34225;
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("symbols", i5);
        int i6 = c12246.f34218;
        String str6 = "entries";
        JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("entries", i6);
        int i7 = c12246.f34224;
        JSONObject jSONObjectAdd8 = jSONObjectAdd7.add("initArray", i7);
        int i8 = c12246.f34220;
        JSONObject jSONObjectAdd9 = jSONObjectAdd8.add("finiArray", i8);
        int i9 = c12246.f34221;
        JSONObject jSONObjectAdd10 = jSONObjectAdd.add("counts", jSONObjectAdd9.add("relocations", i9));
        JSONArray jSONArrayArray = JSON.array();
        int i10 = 0;
        while (i10 < 9) {
            String str7 = C16938.f50113[i10];
            C16938.m38519(str7);
            if (str5.equals(str7)) {
                str = str5;
                i = c12246.f34223;
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
                jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", str2).add("editSessionId", str3).add("locator", str4).add("itemKind", str7).add("namePrefix", "").add("demangle", false).add("limit", 100), "mt_apk_native_list_items", "inspect", "Read first page of native ".concat(str7)));
            }
            i10++;
            str5 = str;
            c12246 = c12246;
            str6 = str6;
        }
        return C21370.m48410(jSONObjectAdd10, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31548(C22750 c22750, C22975 c22975, String str) {
        Iterator it;
        String str2;
        String str3;
        boolean z;
        JSONObject jSONObjectAdd;
        String str4 = c22750.f71733;
        boolean z2 = str != null;
        String str5 = c22750.f71732;
        String str6 = c22750.f71730;
        String str7 = c22750.f71736;
        JSONObject jSONObjectM31539 = m31539(str4, str7, c22750.f71737);
        String str8 = c22975.f72257;
        List list = c22975.f72258;
        JSONObject jSONObjectAdd2 = jSONObjectM31539.add("itemKind", str8).add("namePrefix", str6).add("demangle", c22750.f71734).add("filterHint", (("initArray".equals(str5) || "finiArray".equals(str5)) && !str6.isEmpty()) ? C9417.m21913("code", "name_prefix_not_applicable", "message", "This itemKind has no name field, so a non-empty namePrefix filters out every item; retry with namePrefix=\"\" to read the list.") : C9417.m21913("code", "", "message", ""));
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC10234 interfaceC10234 = (InterfaceC10234) it2.next();
            if (interfaceC10234 instanceof C23645) {
                jSONObjectAdd = JSON.object().add("name", ((C23645) interfaceC10234).f75267);
                str2 = str4;
                z = z2;
                str3 = str7;
                it = it2;
            } else {
                it = it2;
                if (interfaceC10234 instanceof C5540) {
                    C5540 c5540 = (C5540) interfaceC10234;
                    str2 = str4;
                    jSONObjectAdd = JSON.object().add("name", c5540.f13358).add("type", c5540.f13359).add("arch", c5540.f13350).add("virtualAddress", m31551(c5540.f13353)).add("fileOffset", m31551(c5540.f13355)).add("size", c5540.f13351).add("virtualSize", c5540.f13352).add("permissions", c5540.f13357).add("flags", c5540.f13356).add(AbstractC0213e.f989m, c5540.f13354).add("segment", c5540.f13360);
                    z = z2;
                    str3 = str7;
                } else {
                    str2 = str4;
                    str3 = str7;
                    z = z2;
                    if (interfaceC10234 instanceof C7552) {
                        C7552 c7552 = (C7552) interfaceC10234;
                        jSONObjectAdd = JSON.object().add("name", c7552.f19823).add("demangledName", c7552.f19819).add("library", c7552.f19818).add("bind", c7552.f19815).add("type", c7552.f19822).add("className", c7552.f19817).add("descriptor", c7552.f19821).add("ordinal", c7552.f19816).add("inSectionHeader", c7552.f19820).add("imported", true);
                    } else if (interfaceC10234 instanceof C13587) {
                        C13587 c13587 = (C13587) interfaceC10234;
                        jSONObjectAdd = JSON.object().add("name", c13587.f38218).add("demangledName", c13587.f38216).add("className", c13587.f38214).add("library", c13587.f38213).add("bind", c13587.f38208).add("type", c13587.f38211).add("imported", c13587.f38215).add("virtualAddress", m31551(c13587.f38210)).add("fileOffset", m31551(c13587.f38209)).add("size", c13587.f38217).add("symbolBits", c13587.f38212);
                    } else if (interfaceC10234 instanceof C3528) {
                        C3528 c3528 = (C3528) interfaceC10234;
                        jSONObjectAdd = JSON.object().add("arrayName", c3528.f7148).add("arrayIndex", c3528.f7146).add("slotVirtualAddress", m31551(c3528.f7151)).add("slotFileOffset", m31551(c3528.f7152)).add("targetVirtualAddress", m31551(c3528.f7147)).add("targetFileOffset", m31551(c3528.f7153)).add("targetInstructionMode", c3528.f7149).add("pointerSize", c3528.f7150);
                    } else {
                        if (!(interfaceC10234 instanceof C21634)) {
                            throw new IllegalArgumentException("Unsupported native item type");
                        }
                        C21634 c21634 = (C21634) interfaceC10234;
                        jSONObjectAdd = JSON.object().add("name", c21634.f68184).add("demangledName", c21634.f68185).add("library", c21634.f68186).add("type", c21634.f68188).add("numericType", c21634.f68189).add("virtualAddress", m31551(c21634.f68182)).add("fileOffset", m31551(c21634.f68181)).add("addend", c21634.f68180).add("additive", c21634.f68183).add("ifunc", c21634.f68187);
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
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("items", jSONArrayArray).add("pagination", m31550(z3, str, list.size(), 500, Long.valueOf(c22975.f72260)));
        JSONArray jSONArrayArray2 = JSON.array();
        if (z3) {
            jSONArrayArray2.add(C11982.m27418(C9417.m21913("workspaceId", str9, "editSessionId", str10).add("nextCursor", str).add("limit", c22750.f71728), "mt_apk_continue", "continue", "Continue native item page"));
        }
        return C21370.m48410(jSONObjectAdd3, jSONArrayArray2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31545(C7327 c7327, C6211 c6211) throws C5276 {
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = m31539(c7327.f19177, c7327.f19176, c7327.f19173).add("addressKind", c7327.f19174).add("address", c7327.f19172);
        boolean z = c6211.f15635;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("found", z);
        m31570(c6211);
        m31566(c6211);
        JSONObject jSONObjectM31543 = z ? m31543(c6211) : m31568();
        C4870 c4870 = c6211.f15631;
        if (!c4870.f11098) {
            JSONObject jSONObjectAdd4 = JSON.object().add("found", false).add("name", "").add("demangledName", "").add("instructionMode", "");
            JSONValue jSONValue = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue).add("startFileOffset", jSONValue).add("offset", jSONValue).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("found", true).add("name", c4870.f11102).add("demangledName", c4870.f11096).add("instructionMode", c4870.f11100).add("startVirtualAddress", m31551(c4870.f11097)).add("startFileOffset", m31551(c4870.f11103)).add("offset", m31551(c4870.f11101)).add("size", c4870.f11099);
        }
        return C21370.m48410(jSONObjectAdd3.add("mapping", jSONObjectM31543.add("enclosingSymbol", jSONObjectAdd)), JSON.array());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31549(C23420 c23420, String str, boolean z, C6211 c6211, String str2, int i, String str3, String str4, C17237 c17237, String str5) throws C5276 {
        JSONObject jSONObjectM31537;
        Iterator it;
        String str6;
        JSONValue jSONValueAdd;
        String str7 = c23420.f74599;
        List list = c23420.f74583;
        String str8 = c23420.f74590;
        long j = c6211.f15637;
        int i2 = c17237.f51295;
        List list2 = c17237.f51290;
        boolean z2 = c17237.f51289;
        boolean z3 = str5 != null;
        String str9 = "";
        JSONObject jSONObjectM21913 = (!z || !("code".equals(str8) || "both".equals(str8)) || !list.contains(AbstractC0213e.f989m) || j < 0 || j >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) ? C9417.m21913("warningCode", "", "warning", "") : C9417.m21913("warningCode", "low_address_instruction_data_reference_noise", "warning", "Low target virtual addresses can be confused with ordinary instruction immediates; code/both instruction data refs may contain false positives. To inspect strings, tables, or pointer slots only, retry with scanKind=data, referenceKinds=[\"data\"], and instructionMode=auto.");
        if (z) {
            String str10 = c17237.f51288;
            if (z2 && z3) {
                throw m31554();
            }
            if (!z2 && !z3) {
                throw m31554();
            }
            if (!list2.isEmpty()) {
                jSONObjectM31537 = m31537(jSONObjectM21913, "refs_found", "This page contains direct references matching scanKind and referenceKinds; continue if pagination.hasMore is true.", str10);
            } else if (z3) {
                jSONObjectM31537 = m31537(jSONObjectM21913, "scan_incomplete", "This page has no refs, but scanning is not complete; continue with mt_apk_continue before concluding no references.", str10);
            } else {
                if (!z2) {
                    throw m31554();
                }
                jSONObjectM31537 = m31537(jSONObjectM21913, "no_refs_found", "This bounded direct-reference scan completed for the current scanKind, referenceKinds, and maxScanBytes, and found no direct references.", str10);
            }
        } else {
            if (!list2.isEmpty() || i2 != 0 || !z2 || z3) {
                throw m31554();
            }
            jSONObjectM31537 = m31537(jSONObjectM21913, "target_not_mapped", "No scan ran because the target has no loaded file-backed mapping; it may be a miss, virtual-only address, or non-loaded file bytes.", "target_not_mapped");
        }
        String str11 = c23420.f74597;
        JSONObject jSONObjectAdd = m31539(str7, str11, c23420.f74581).add("addressKind", c23420.f74592).add("address", c23420.f74588).add("instructionMode", c23420.f74586).add("resolvedInstructionMode", str).add("scanKind", str8);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArrayArray.add((String) it2.next());
        }
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("referenceKinds", jSONArrayArray).add("targetMapped", z).add("targetVirtualAddress", z ? m31551(j) : JSON.NULL).add("targetFileOffset", z ? m31551(c6211.f15632) : JSON.NULL).add("mapping", m31543(c6211)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            C10533 c10533 = (C10533) it3.next();
            String str12 = str9;
            JSONObject jSONObjectAdd3 = JSON.object().add("sourceVirtualAddress", m31551(c10533.f29154)).add("sourceFileOffset", m31551(c10533.f29151)).add("sourceKind", c10533.f29153).add("sourceSize", c10533.f29152);
            C5839 c5839 = c10533.f29150;
            if (c5839 != null) {
                String str13 = c5839.f14319;
                it = it3;
                if (m31559(str13, true)) {
                    String str14 = c5839.f14318;
                    str6 = str12;
                    if (!m31559(str14, false) || str14.equals(str13)) {
                        str14 = str6;
                    }
                    str11 = str11;
                    jSONValueAdd = C9417.m21913("name", str13, "demangledName", str14).add("startVirtualAddress", m31551(c5839.f14320)).add("startFileOffset", m31551(c5839.f14322)).add("offset", m31551(c5839.f14321)).add("size", c5839.f14323);
                }
                jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c10533.f29147).add(TextBundle.TEXT_ENTRY, c10533.f29148).add("referenceKind", c10533.f29149));
                it3 = it;
                str9 = str6;
                str7 = str7;
                str11 = str11;
            } else {
                it = it3;
            }
            str6 = str12;
            jSONValueAdd = JSON.NULL;
            jSONArrayArray2.add(jSONObjectAdd3.add("sourceSymbol", jSONValueAdd).add("bytes", c10533.f29147).add(TextBundle.TEXT_ENTRY, c10533.f29148).add("referenceKind", c10533.f29149));
            it3 = it;
            str9 = str6;
            str7 = str7;
            str11 = str11;
        }
        String str15 = str11;
        String str16 = str7;
        JSONObject jSONObjectAdd4 = jSONObjectAdd2.add("refs", jSONArrayArray2).add("scannedBytes", i2).add("scanComplete", z2).add("scanSummary", jSONObjectM31537).add("pagination", m31550(z3, str5, list2.size(), 200, null));
        JSONArray jSONArrayArray3 = JSON.array();
        if (z3) {
            jSONArrayArray3.add(C11982.m27418(C9417.m21913("workspaceId", str16, "editSessionId", str15).add("nextCursor", str5).add("limit", c23420.f74591), "mt_apk_continue", "continue", "Continue native xref scan"));
        }
        return C21370.m48410(jSONObjectAdd4, jSONArrayArray3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31546(C20068 c20068, String str, long j, C6211 c6211, String str2, int i, String str3, String str4, int i2, int i3, boolean z, List list, C14533 c14533, boolean z2, JSONValue jSONValue, JSONValue jSONValue2, JSONValue jSONValue3) {
        JSONObject jSONObjectAdd;
        String str5 = c20068.f60976;
        String str6 = c20068.f60982;
        String str7 = c20068.f60984;
        JSONObject jSONObjectAdd2 = m31539(str5, str6, str7).add("addressKind", c20068.f60980).add("address", c20068.f60978).add("instructionMode", c20068.f60979);
        boolean z3 = c20068.f60977;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("stopAtSymbolBoundary", z3).add("resolvedInstructionMode", str).add("effectiveAddress", m31551(j)).add("mapping", m31543(c6211));
        if (!c14533.f41461) {
            JSONObject jSONObjectAdd4 = JSON.object().add("requested", c14533.f41469).add("applied", false).add("endReached", false).add("name", "").add("demangledName", "");
            JSONValue jSONValue4 = JSON.NULL;
            jSONObjectAdd = jSONObjectAdd4.add("startVirtualAddress", jSONValue4).add("endVirtualAddressExclusive", jSONValue4).add("offset", jSONValue4).add("size", 0);
        } else {
            jSONObjectAdd = JSON.object().add("requested", true).add("applied", true).add("endReached", c14533.f41465).add("name", c14533.f41466).add("demangledName", c14533.f41463).add("startVirtualAddress", m31551(c14533.f41468)).add("endVirtualAddressExclusive", m31551(c14533.f41467)).add("offset", m31551(c14533.f41464)).add("size", c14533.f41462);
        }
        JSONObject jSONObjectAdd5 = jSONObjectAdd3.add("symbolBoundary", jSONObjectAdd).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4).add("bytesRead", i2).add("bytesConsumed", i3).add("incompleteInstructionAtEnd", z);
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21240 c21240 = (C21240) it.next();
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(C6656.m15140(c21240.f66772));
            sb.append(": ");
            sb.append(c21240.f66773);
            sb.append(' ');
            sb.append(c21240.f66775);
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("disassemblyText", sb.toString()).add("instructionCount", list.size()).add("hasMore", z2).add("nextAddressKind", jSONValue).add("nextAddress", jSONValue2).add("nextInstructionMode", jSONValue3);
        JSONArray jSONArrayArray = JSON.array();
        if (z2) {
            jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", str5).add("editSessionId", str6).add("locator", str7).add("addressKind", jSONValue).add("address", jSONValue2).add("instructionMode", jSONValue3).add("stopAtSymbolBoundary", z3).add("maxBytes", c20068.f60975).add("maxInstructions", c20068.f60983), "mt_apk_native_disassemble", "continue", "Read the next contiguous instruction window"));
        }
        return C21370.m48410(jSONObjectAdd6, jSONArrayArray);
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
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31547(C20739 c20739, String str, long j, C6211 c6211, String str2, int i, String str3, String str4, C18579 c18579) {
        String str5;
        int i2;
        ?? r9;
        ?? r35;
        String str6;
        int i3;
        int i4;
        int i5;
        C22581 c22581M31557;
        ?? r1;
        boolean z;
        C23251 c23251;
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
        String str13 = c20739.f64005;
        String str14 = c20739.f64004;
        String str15 = c20739.f64007;
        List list2 = c18579.f55443;
        C17908 c17908 = c18579.f55448;
        List<C19250> list3 = c18579.f55447;
        List<C9563> list4 = c18579.f55446;
        String str16 = c20739.f64002;
        int i9 = c20739.f64003;
        int i10 = c20739.f64010;
        int i11 = c20739.f64001;
        String str17 = c20739.f64011;
        String str18 = c20739.f64009;
        String str19 = c20739.f64006;
        List list5 = list2;
        boolean zEquals2 = ErrorBundle.SUMMARY_ENTRY.equals(str16);
        C15597 c15597 = c18579.f55440;
        ?? r8 = c15597.f44573;
        int i12 = c15597.f44576;
        int i13 = c15597.f44574;
        int i14 = c15597.f44569;
        int i15 = c15597.f44571;
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
                c22581M31557 = m31557(c20739, (String) r8);
            } else {
                long j5 = c17908.f53495;
                if (j5 <= 0) {
                    c22581M31557 = m31557(c20739, (String) r8);
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
                    long jM31534 = m31534(d);
                    int i16 = i9;
                    double d2 = i12;
                    ?? r312 = "max_blocks_reached";
                    double d3 = i15;
                    long jM31535 = m31534((d2 / d3) * d);
                    double d4 = i14;
                    long jM31536 = m31534(Math.max((d4 / d3) * d, jM31535 * (d4 / d2)));
                    if ("max_analysis_bytes_reached".equals(r8)) {
                        i6 = i11;
                        jMax = Math.max(jM31534, ((long) i6) * 2);
                        i7 = i10;
                        r37 = r312;
                    } else {
                        i6 = i11;
                        if (r312.equals(r8)) {
                            r37 = r312;
                            i7 = i10;
                            jM31536 = Math.max(jM31536, ((long) i7) * 2);
                            jMax = jM31534;
                        } else {
                            i15 = i15;
                            ?? r13 = "max_instructions_reached";
                            i7 = i10;
                            if (r13.equals(r8)) {
                                r36 = r312;
                                i16 = i16;
                                j2 = jM31536;
                                jM31535 = Math.max(jM31535, ((long) i16) * 2);
                                j3 = jM31534;
                                r10 = r13;
                                r38 = r36;
                            } else {
                                r36 = r312;
                                jMax = jM31534;
                                r11 = r13;
                                r39 = r36;
                                j2 = jM31536;
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
                        c22581M31557 = m31556(c20739, j3, j6, jM31535);
                        r9 = r10;
                        r35 = r38;
                    }
                    r11 = "max_instructions_reached";
                    r39 = r37;
                    j2 = jM31536;
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
                    c22581M31557 = m31556(c20739, j3, j7, jM31535);
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
                    if (c22581M31557.f71294 > i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 1:
                    if (c22581M31557.f71295 > i5) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                case 2:
                    if (c22581M31557.f71293 > i4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    break;
                default:
                    z = false;
                    break;
            }
            c23251 = new C23251(c22581M31557.f71293, c22581M31557.f71294, c22581M31557.f71295, z, c22581M31557.f71292);
            r2 = r1;
            r12 = r9;
        } else {
            str5 = str18;
            str16 = str16;
            i12 = i12;
            i2 = i15;
            r12 = "max_instructions_reached";
            c17908 = c17908;
            str19 = str19;
            str6 = str17;
            c23251 = new C23251(c20739.f64001, c20739.f64010, c20739.f64003, false, false);
            r2 = "max_blocks_reached";
            i14 = i14;
        }
        String str20 = str19;
        String str21 = str5;
        int i19 = i12;
        JSONObject jSONObjectAdd = m31539(str20, str21, str6).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", str16).add("detailOmitted", zEquals2).add("resolvedInstructionMode", str).add("effectiveAddress", m31551(j)).add("mapping", m31543(c6211)).add("arch", str2).add("archBits", i).add("instructionSet", str3).add("instructionWidth", str4);
        C17908 c17909 = c17908;
        String str22 = "startVirtualAddress";
        String str23 = "startFileOffset";
        String str24 = str6;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("function", JSON.object().add("startVirtualAddress", m31551(c17909.f53501)).add("startFileOffset", m31551(c17909.f53499)).add("name", c17909.f53500).add("demangledName", c17909.f53498).add("symbolSize", c17909.f53495).add("startSource", c17909.f53497).add("boundarySource", c17909.f53496).add("boundaryEndVirtualAddress", m31551(c17909.f53494)));
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
                C9563 c9563 = (C9563) it2.next();
                jSONArrayArray.add(JSON.object().add("startVirtualAddress", m31551(c9563.f26293)).add("startFileOffset", m31551(c9563.f26294)).add("size", c9563.f26292).add("instructionCount", c9563.f26290).add("terminator", c9563.f26291).add("assemblyText", c9563.f26289));
                it2 = it3;
                c23251 = c23251;
                str20 = str20;
                str21 = str21;
            }
        }
        String str28 = str21;
        C23251 c23252 = c23251;
        String str29 = str20;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("blocks", jSONArrayArray);
        if (zEquals2) {
            jSONArrayArray2 = JSON.array();
            str7 = "terminator";
            str8 = "startFileOffset";
        } else {
            List list6 = c18579.f55445;
            JSONArray jSONArrayArray5 = JSON.array();
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                C3827 c3827 = (C3827) it4.next();
                jSONArrayArray5.add(JSON.object().add("fromVirtualAddress", m31551(c3827.f8199)).add("toVirtualAddress", m31551(c3827.f8201)).add("kind", c3827.f8200));
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
                C12545 c12545 = (C12545) it5.next();
                jSONArrayArray3.add(JSON.object().add("sourceVirtualAddress", m31551(c12545.f35261)).add("flowKind", c12545.f35259).add("targetVirtualAddress", m31551(c12545.f35262)).add("reason", c12545.f35260));
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
            for (C19250 c19250 : list3) {
                JSONObject jSONObjectAdd6 = JSON.object().add("sourceVirtualAddress", m31551(c19250.f57531)).add("flowKind", c19250.f57527);
                if (c19250.f57528) {
                    jSONObjectAdd6.add("targetVirtualAddress", m31551(c19250.f57530));
                }
                jSONObjectAdd6.add("reason", c19250.f57529);
                jSONArrayArray6.add(jSONObjectAdd6);
            }
            jSONArrayArray4 = jSONArrayArray6;
        }
        JSONObject jSONObjectAdd7 = jSONObjectAdd5.add("unresolvedFlows", jSONArrayArray4);
        JSONObject jSONObjectAdd8 = JSON.object().add("controlFlowComplete", c15597.f44575);
        String str33 = c15597.f44573;
        JSONObject jSONObjectAdd9 = jSONObjectAdd7.add("analysisSummary", jSONObjectAdd8.add("completionReason", str33).add("meaning", m31553(str33)).add("bytesAnalyzed", i2).add("instructionsAnalyzed", i19));
        int i20 = i14;
        JSONObject jSONObjectAdd10 = JSON.object().add("blockCount", i20).add("edgeCount", i13).add("externalFlowCount", c15597.f44572).add("unresolvedFlowCount", c15597.f44570).add("terminatorCounts", JSON.object().add("fallthrough", m31533("fallthrough", list4)).add("conditional_jump", m31533("conditional_jump", list4)).add("jump", m31533("jump", list4)).add("indirect_jump", m31533("indirect_jump", list4)).add("return", m31533("return", list4)).add("trap", m31533("trap", list4)).add("invalid", m31533("invalid", list4)).add("budget_boundary", m31533("budget_boundary", list4)));
        String str34 = "return";
        String str35 = "instruction_mode_transition";
        ?? r29 = r12;
        JSONObject jSONObjectAdd11 = JSON.object().add("target_not_executable", m31562("target_not_executable", list3)).add("unaligned_or_overlapping_target", m31562("unaligned_or_overlapping_target", list3)).add("instruction_mode_transition", m31562("instruction_mode_transition", list3)).add(r2, m31562((String) r2, list3)).add("max_analysis_bytes_reached", m31562("max_analysis_bytes_reached", list3)).add(r12, m31562((String) r12, list3)).add("invalid_instruction", m31562("invalid_instruction", list3));
        String str36 = "indirect_target";
        JSONObject jSONObjectAdd12 = jSONObjectAdd10.add("unresolvedReasonCounts", jSONObjectAdd11.add("indirect_target", m31562("indirect_target", list3)));
        JSONArray jSONArrayArray7 = JSON.array();
        if (i20 == 0) {
            r311 = r2;
            str9 = "max_analysis_bytes_reached";
        } else {
            int iM31533 = m31533("conditional_jump", list4);
            int iM31534 = m31533("indirect_jump", list4);
            r310 = r2;
            int iM31535 = m31533("budget_boundary", list4);
            str9 = "max_analysis_bytes_reached";
            if (i20 > 1 && iM31533 == 0 && iM31534 == 0 && i13 == i20 - 1) {
                jSONArrayArray7.add("observed_linear");
            }
            if (iM31533 > 0 || i13 > i20) {
                jSONArrayArray7.add("observed_branchy");
            }
            if (iM31534 > 0 || (i20 >= 16 && iM31535 >= 4)) {
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
        C9563 c9563M31555 = m31555(c18579);
        JSONObject jSONObjectAdd14 = jSONObjectAdd13.add("entryPreview", JSON.object().add("available", c9563M31555 != null).add(str31, c9563M31555 == null ? JSON.NULL : m31551(c9563M31555.f26293)).add("lines", c9563M31555 == null ? JSON.array() : m31535(16, c9563M31555.f26289)));
        ArrayList<C9563> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        m31558(arrayList, hashSet, m31555(c18579));
        Iterator it6 = list4.iterator();
        while (true) {
            i8 = 8;
            if (it6.hasNext()) {
                C9563 c9564 = (C9563) it6.next();
                if (arrayList.size() < 8) {
                    String str37 = c9564.f26291;
                    if ("budget_boundary".equals(str37) || "invalid".equals(str37) || "indirect_jump".equals(str37)) {
                        m31558(arrayList, hashSet, c9564);
                    }
                }
            }
        }
        if (arrayList.size() < 8) {
            int i21 = 0;
            for (C9563 c9565 : list4) {
                if (arrayList.size() < i8) {
                    long j8 = c9565.f26293 + c9565.f26292;
                    while (true) {
                        if (i21 < list5.size()) {
                            list = list5;
                            str11 = str35;
                            str12 = str36;
                            if (((C12545) list.get(i21)).f35261 < c9565.f26293) {
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
                    boolean z3 = i21 < list.size() && ((C12545) list.get(i21)).f35261 < j8;
                    String str38 = str34;
                    if (str38.equals(c9565.f26291) || z3) {
                        m31558(arrayList, hashSet, c9565);
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
            ArrayList<C9563> arrayList2 = new ArrayList(list4);
            C8150.sort(arrayList2, C16866.thenComparingLong(C16866.reversed(C10162.comparingLong(new C9839())), new C16544()));
            for (C9563 c9566 : arrayList2) {
                if (arrayList.size() < 8) {
                    m31558(arrayList, hashSet, c9566);
                }
            }
        }
        JSONArray jSONArrayArray8 = JSON.array();
        for (C9563 c9567 : arrayList) {
            jSONArrayArray8.add(JSON.object().add(str31, m31551(c9567.f26293)).add(str8, m31551(c9567.f26294)).add(str32, c9567.f26292).add(str30, c9567.f26290).add(str7, c9567.f26291).add("previewLines", m31535(4, c9567.f26289)));
        }
        JSONObject jSONObjectAdd15 = jSONObjectAdd14.add("notableBlocks", jSONArrayArray8);
        JSONArray jSONArrayArray9 = JSON.array();
        if (c23252.f73084) {
            jSONArrayArray9.add(C11982.m27418(C9417.m21913("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", str15).add("address", str14).add("instructionMode", str13).add("outputMode", ErrorBundle.SUMMARY_ENTRY).add("maxAnalysisBytes", c23252.f73085).add("maxBlocks", c23252.f73087).add("maxInstructions", c23252.f73086), "mt_apk_native_analyze_control_flow", "retry", c23252.f73083 ? "Retry CFG from the beginning with budgets clamped to public limits in summary mode; the new result replaces this partial graph and may still be incomplete." : "Retry CFG from the beginning with recommended budgets in summary mode; the new result replaces this partial graph."));
        } else if (!c15597.f44575 && j >= 0) {
            String str41 = c15597.f44573;
            Iterator it7 = list3.iterator();
            while (true) {
                if (it7.hasNext()) {
                    C19250 c19251 = (C19250) it7.next();
                    String str42 = c19251.f57529;
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
                            j4 = ((!z2 || "invalid_instruction".equals(str41)) && c19251.f57528) ? c19251.f57530 : c19251.f57531;
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
            jSONArrayArray9.add(C11982.m27418(C9417.m21913("workspaceId", str29, "editSessionId", str28).add("locator", str24).add("addressKind", "virtual").add("address", C6656.m15140(j4)).add("instructionMode", str).add("stopAtSymbolBoundary", false).add("maxBytes", 4096).add("maxInstructions", 200), "mt_apk_native_disassemble", "inspect", "Inspect a local instruction window because no larger CFG retry is available."));
        }
        return C21370.m48410(jSONObjectAdd15, jSONArrayArray9);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31544(C6487 c6487) {
        byte[] bArr = c6487.f16769;
        int length = bArr.length;
        C10009 c10009 = c6487.f16772;
        String str = c10009.f27701;
        String str2 = c10009.f27704;
        String str3 = c10009.f27705;
        JSONObject jSONObjectAdd = m31539(str, str2, str3).add("addressKind", c10009.f27702).add("address", c10009.f27699).add("instructionMode", c10009.f27696);
        String str4 = c6487.f16771;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("resolvedInstructionMode", str4);
        long j = c6487.f16776;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("effectiveAddress", m31551(j)).add("mapping", m31543(c6487.f16770)).add("arch", c6487.f16773).add("archBits", c6487.f16775).add("instructionSet", c6487.f16774).add("instructionWidth", c6487.f16779).add("patchedVirtualAddress", m31551(j));
        long j2 = c6487.f16778;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("patchedFileOffset", m31551(j2)).add("bytesPatched", length).add("expectedHex", c10009.f27706);
        byte[] bArr2 = c6487.f16777;
        JSONObject jSONObjectAdd5 = jSONObjectAdd4.add("assembledHex", C6656.m15143(bArr2)).add("afterHex", C6656.m15143(bArr)).add("paddingMode", c10009.f27698).add("nopBytesInserted", length - bArr2.length);
        JSONArray jSONArrayArray = JSON.array();
        int length2 = bArr.length;
        jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("addressKind", "virtual").add("address", C6656.m15140(j)).add("instructionMode", str4).add("stopAtSymbolBoundary", false).add("maxBytes", Math.min(4096, Math.max(16, length2))).add("maxInstructions", 16), "mt_apk_native_disassemble", "inspect", "Disassemble the patched instruction window"));
        jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j2).add("maxBytes", length2), "mt_apk_read_bytes", "inspect", "Read back the exact patched byte window"));
        return C21370.m48410(jSONObjectAdd5, jSONArrayArray);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31541(C5146 c5146) {
        byte[] bArr = c5146.f12088;
        int length = bArr.length;
        C16713 c16713 = c5146.f12095;
        String str = c16713.f49219;
        String str2 = c16713.f49225;
        String str3 = c16713.f49218;
        JSONObject jSONObjectAdd = m31539(str, str2, str3).add("addressKind", c16713.f49223).add("address", c16713.f49221).add("effectiveAddress", m31551(c5146.f12092)).add("mapping", m31543(c5146.f12093));
        long j = c5146.f12091;
        return C21370.m48410(jSONObjectAdd.add("patchedFileOffset", m31551(j)).add("textEncoding", "utf8").add("expectedTextByteCount", c16713.f49222.length).add("replacementTextByteCount", c16713.f49220.length).add("extraPaddingBytesConsumed", c5146.f12094).add("terminatorPreserved", c5146.f12089).add("bytesPatched", length).add("beforeHex", C6656.m15143(c5146.f12090)).add("afterHex", C6656.m15143(bArr)).add("paddingMode", c16713.f49226), JSON.array().add(C11982.m27418(JSON.object().add("workspaceId", str).add("editSessionId", str2).add("locator", str3).add("byteOffset", (int) j).add("maxBytes", bArr.length), "mt_apk_read_bytes", "inspect", "Read back the exact patched native string byte window")));
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m31570(C6211 c6211) throws C5276 {
        boolean z = c6211.f15635;
        boolean z2 = c6211.f15639;
        boolean z3 = c6211.f15636;
        if (!z) {
            if (z3 || z2) {
                throw m31554();
            }
        } else {
            if (z2 && !z3) {
                throw m31554();
            }
            if (c6211.f15637 >= 0 && c6211.f15632 >= 0) {
                long j = c6211.f15642;
                if (j >= 0) {
                    long j2 = c6211.f15633;
                    if (j2 >= 0 && j <= j2) {
                        return;
                    }
                }
            }
            throw m31571();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31566(C6211 c6211) throws C5276 {
        C4870 c4870 = c6211.f15631;
        boolean z = c4870.f11098;
        long j = c4870.f11099;
        long j2 = c4870.f11101;
        long j3 = c4870.f11097;
        String str = c4870.f11096;
        String str2 = c4870.f11102;
        String str3 = c4870.f11100;
        if (!z) {
            if (!str2.isEmpty() || !str.isEmpty() || !str3.isEmpty() || j3 != 0 || c4870.f11103 != 0 || j2 != 0 || j != 0) {
                throw m31554();
            }
            return;
        }
        if (!c6211.f15635 || str2.isEmpty() || str3.isEmpty() || (!(str3.isEmpty() || "auto".equals(str3) || "arm".equals(str3) || "thumb".equals(str3) || "unknown".equals(str3)) || j3 < 0 || j2 < 0 || j <= 0 || j2 >= j || j3 > C14849.FOREVER_NS - j || j3 + j2 != c6211.f15637 || str.length() > 4096)) {
            throw m31554();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C5276 m31571() {
        return C5276.m11410("NATIVE_INVALID_ELF_MAPPING", "ELF address mapping is invalid.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m31554() {
        return C5276.m11410("NATIVE_ANALYZER_INVALID_RESULT", "Native ELF analysis returned an inconsistent result.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31539(String str, String str2, String str3) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", str3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31537(JSONObject jSONObject, String str, String str2, String str3) {
        return C9417.m21913("reason", str, "meaning", str2).add("completionReason", str3).add("warningCode", jSONObject.getString("warningCode", "")).add("warning", jSONObject.getString("warning", ""));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31542(C5276 c5276) {
        JSONValue jSONValueAdd;
        boolean zM19774 = C8498.m19774(c5276);
        JSONObject jSONObject = c5276.f12412;
        if (!zM19774 && jSONObject.get("patchedFileOffset") == null && jSONObject.get("expectedBytes") == null && jSONObject.get("assembledBytes") == null && jSONObject.get("remainingBytes") == null && jSONObject.get("arch") == null && jSONObject.get("message") == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = (C8498.m19774(c5276) ? C8498.m19763(c5276) : JSON.object().add("workspaceId", m31565(jSONObject, "workspaceId")).add("editSessionId", m31565(jSONObject, "editSessionId")).add("locator", m31565(jSONObject, "locator")).add("addressKind", m31565(jSONObject, "addressKind")).add("address", m31565(jSONObject, "address")).add("instructionMode", m31565(jSONObject, "instructionMode")).add("reason", "").add("addressModeHint", "").add("retryInstructionModes", JSON.array())).add("patchedFileOffset", m31569(jSONObject, "patchedFileOffset")).add("expectedHex", m31569(jSONObject, "expectedHex")).add("actualHex", m31569(jSONObject, "actualHex")).add("expectedBytes", m31552(jSONObject, "expectedBytes")).add("assembledBytes", m31552(jSONObject, "assembledBytes")).add("paddingMode", m31569(jSONObject, "paddingMode")).add("remainingBytes", m31552(jSONObject, "remainingBytes")).add("instructionSet", m31569(jSONObject, "instructionSet")).add("instructionWidth", m31569(jSONObject, "instructionWidth")).add("arch", m31569(jSONObject, "arch")).add("bits", m31552(jSONObject, "bits")).add("message", m31569(jSONObject, "message"));
        }
        boolean zM19775 = C8498.m19774(c5276);
        JSONArray jSONArrayM31536 = c5276.f12407;
        if (!zM19775) {
            jSONArrayM31536 = m31536(jSONArrayM31536);
            if (jSONArrayM31536.size() <= 0) {
                if ("PATCH_EXPECTED_MISMATCH".equals(c5276.f12413)) {
                    String strM31565 = m31565(jSONObject, "workspaceId");
                    String strM31566 = m31565(jSONObject, "editSessionId");
                    String strM31567 = m31565(jSONObject, "locator");
                    JSONValue jSONValue = jSONObject.get("byteOffset");
                    int iAsInt = -1;
                    if (jSONValue != null && jSONValue.isNumber()) {
                        try {
                            iAsInt = jSONValue.asInt();
                        } catch (RuntimeException unused) {
                        }
                    }
                    String strM31568 = m31565(jSONObject, "expectedHex");
                    if (strM31565.isEmpty() || strM31566.isEmpty() || strM31567.isEmpty() || iAsInt < 0 || strM31568.length() < 2) {
                        jSONArrayM31536 = JSON.array();
                    } else {
                        jSONArrayM31536 = JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", strM31565, "editSessionId", strM31566).add("locator", strM31567).add("byteOffset", iAsInt).add("maxBytes", Math.max(1, strM31568.length() / 2)), "mt_apk_read_bytes", "retry", "Read current bytes at the stale native patch window, then retry mt_apk_native_patch_instructions with refreshed expectedHex."));
                    }
                } else {
                    jSONArrayM31536 = JSON.array();
                }
            }
        }
        return C21370.m48412(c5276, jSONValueAdd, jSONArrayM31536);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m31564(C5276 c5276) {
        JSONValue jSONValueAdd;
        String str = c5276.f12413;
        JSONObject jSONObject = c5276.f12412;
        if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_LENGTH_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str) || "NATIVE_STRING_TOO_LARGE".equals(str) || "NATIVE_STRING_RANGE_OUT_OF_ENTRY".equals(str)) {
            JSONObject jSONObjectAdd = JSON.object().add("workspaceId", m31565(jSONObject, "workspaceId")).add("editSessionId", m31565(jSONObject, "editSessionId")).add("locator", m31565(jSONObject, "locator")).add("addressKind", m31565(jSONObject, "addressKind")).add("address", m31565(jSONObject, "address")).add("patchedFileOffset", m31569(jSONObject, "patchedFileOffset")).add("paddingMode", m31569(jSONObject, "paddingMode")).add("expectedText", m31569(jSONObject, "expectedText")).add("actualText", m31569(jSONObject, "actualText")).add("expectedHex", m31569(jSONObject, "expectedHex")).add("actualHex", m31569(jSONObject, "actualHex")).add("expectedTextByteCount", m31552(jSONObject, "expectedTextByteCount")).add("replacementTextByteCount", m31552(jSONObject, "replacementTextByteCount")).add("requiredPaddingBytes", m31552(jSONObject, "requiredPaddingBytes")).add("actualPaddingHex", m31569(jSONObject, "actualPaddingHex"));
            JSONValue jSONValue = jSONObject.get("terminatorRequired");
            if (jSONValue == null || !jSONValue.isBoolean()) {
                jSONValue = JSON.NULL;
            }
            jSONValueAdd = jSONObjectAdd.add("terminatorRequired", jSONValue).add("bytesPatched", m31552(jSONObject, "bytesPatched")).add("limitBytes", m31552(jSONObject, "limitBytes")).add("endByteOffset", m31569(jSONObject, "endByteOffset")).add("entrySize", m31552(jSONObject, "entrySize"));
        } else {
            jSONValueAdd = JSON.NULL;
        }
        JSONArray jSONArrayM31536 = m31536(c5276.f12407);
        if (jSONArrayM31536.size() <= 0) {
            if ("PATCH_EXPECTED_MISMATCH".equals(str) || "NATIVE_STRING_PADDING_MISMATCH".equals(str)) {
                String strM31565 = m31565(jSONObject, "workspaceId");
                String strM31566 = m31565(jSONObject, "editSessionId");
                String strM31567 = m31565(jSONObject, "locator");
                JSONValue jSONValue2 = jSONObject.get("byteOffset");
                int iAsInt = -1;
                if (jSONValue2 != null && jSONValue2.isNumber()) {
                    try {
                        iAsInt = jSONValue2.asInt();
                    } catch (RuntimeException unused) {
                    }
                }
                String strM31568 = m31565(jSONObject, "paddingMode");
                String strM31569 = m31565(jSONObject, "actualHex");
                if (strM31565.isEmpty() || strM31566.isEmpty() || strM31567.isEmpty() || iAsInt < 0 || strM31569.length() < 2 || (strM31569.length() & 1) != 0) {
                    jSONArrayM31536 = JSON.array();
                } else {
                    boolean zEquals = "null_pad".equals(strM31568);
                    jSONArrayM31536 = JSON.array().add(C11982.m27418(C9417.m21913("workspaceId", strM31565, "editSessionId", strM31566).add("locator", strM31567).add("byteOffset", iAsInt).add("maxBytes", zEquals ? 4096 : strM31569.length() / 2), "mt_apk_read_bytes", "retry", zEquals ? "Read up to the native string patch limit and stop at the first NUL, then retry mt_apk_native_patch_string with the bytes before that terminator as refreshed expectedText." : "Read the exact observed patch window, then retry mt_apk_native_patch_string only with refreshed expectedText derived from these bytes; do not include later bytes unless the fixed slot boundary is known independently."));
                }
            } else {
                jSONArrayM31536 = JSON.array();
            }
        }
        return C21370.m48412(c5276, jSONValueAdd, jSONArrayM31536);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m31536(JSONArray jSONArray) {
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

    /* JADX INFO: renamed from: ܽ */
    public static JSONValue m31569(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? JSON.NULL : JSON.value(jSONValue.asString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m31552(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isNumber()) ? JSON.NULL : jSONValue;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31565(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? "" : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31533(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C9563) it.next()).f26291)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31562(String str, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (str.equals(((C19250) it.next()).f57529)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9563 m31555(C18579 c18579) {
        List<C9563> list = c18579.f55446;
        if (list.isEmpty()) {
            return null;
        }
        long j = c18579.f55448.f53501;
        for (C9563 c9563 : list) {
            if (c9563.f26293 == j) {
                return c9563;
            }
        }
        return (C9563) list.get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31558(ArrayList arrayList, HashSet hashSet, C9563 c9563) {
        if (c9563 == null || arrayList.size() >= 8 || !hashSet.add(Long.valueOf(c9563.f26293))) {
            return;
        }
        arrayList.add(c9563);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m31535(int i, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m31553(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C22581 m31557(C20739 c20739, String str) {
        int i = c20739.f64001;
        long j = i;
        long j2 = c20739.f64010;
        long j3 = c20739.f64003;
        if ("max_analysis_bytes_reached".equals(str)) {
            j = ((long) i) * 2;
        } else if ("max_blocks_reached".equals(str)) {
            j2 *= 2;
        } else if ("max_instructions_reached".equals(str)) {
            j3 *= 2;
        }
        return m31556(c20739, j, j2, j3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m31534(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        double d2 = d * 1.25d;
        return d2 >= 9.223372036854776E18d ? C14849.FOREVER_NS : (long) Math.ceil(d2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22581 m31556(C20739 c20739, long j, long j2, long j3) {
        return new C22581((int) Math.min(65536, Math.max(c20739.f64001, j)), (int) Math.min(4096, Math.max(c20739.f64010, j2)), (int) Math.min(10000, Math.max(c20739.f64003, j3)), j > 65536 || j2 > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || j3 > 10000);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31543(C6211 c6211) throws C5276 {
        m31570(c6211);
        if (!c6211.f15635) {
            return m31568();
        }
        return JSON.object().add("sectionName", c6211.f15641).add("virtualAddress", m31551(c6211.f15637)).add("fileOffset", m31551(c6211.f15632)).add("rangeOffset", m31551(c6211.f15642)).add("size", c6211.f15633).add("isLoaded", c6211.f15636).add("isExecutable", c6211.f15639).add("segment", c6211.f15634);
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m31568() {
        JSONObject jSONObjectAdd = JSON.object().add("sectionName", "");
        JSONValue jSONValue = JSON.NULL;
        return jSONObjectAdd.add("virtualAddress", jSONValue).add("fileOffset", jSONValue).add("rangeOffset", jSONValue).add("size", 0).add("isLoaded", false).add("isExecutable", false).add("segment", false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31550(boolean z, String str, int i, int i2, Long l2) {
        return JSON.object().add("hasMore", z).add("nextCursor", str == null ? JSON.NULL : JSON.value(str)).add("returnedCount", i).add("limitMax", i2).add("totalAvailableCount", l2 == null ? JSON.NULL : JSON.value(l2.longValue()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONValue m31551(long j) {
        if (j < 0) {
            return JSON.NULL;
        }
        return JSON.value(C6656.m15140(j));
    }

    /* JADX INFO: renamed from: ܳ */
    public static JSONObject m31567() {
        return C3935.m7765("Result for mt_apk_native_map_address. ELF address mapping. Check found, mapping.isLoaded, and mapping.isExecutable before following an address. enclosingSymbol is best-effort context.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex.")).add("found", C3935.m7775(ClassTransform.BOOLEAN, "For virtual input, whether the address is in a loaded file-backed ELF range; virtual-only runtime bytes can still miss. For file_offset input, whether SO file bytes contain the offset. Check mapping.isLoaded before treating the mapped address as loaded at runtime.")).add("mapping", C3935.m7762(m31574().add("enclosingSymbol", C20175.m45657(JSON.object().add("found", C3935.m7775(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol contains the mapped virtual address.")).add("name", C3935.m7775("string", "Raw ELF symbol name, or empty string when not found.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled symbol name when available and different from name, otherwise empty string.")).add("instructionMode", C3935.m7775("string", "Best-effort mode hint for mt_apk_native_disassemble or mt_apk_native_analyze_control_flow: auto, arm, thumb, unknown, or empty string when not found. unknown is not a valid tool input; try thumb and arm separately.")).add("startVirtualAddress", C3935.m7772("string", "Symbol start virtual address, or null.")).add("startFileOffset", C3935.m7772("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C3935.m7772("string", "Offset from startVirtualAddress to the mapped virtual address, or null.")), "integer", "Symbol size in bytes, or 0 when not found.", "size", "Best-effort non-imported sized ELF symbol that contains mapping.virtualAddress. It may be a function or another symbol type, and does not guarantee exact function boundaries. When mapping.isExecutable=true and startVirtualAddress is not null, copy startVirtualAddress to mt_apk_native_analyze_control_flow.address and choose outputMode=summary for triage or outputMode=full when detail arrays are needed. instructionMode is only a follow-up hint: auto, arm, and thumb can be copied to mt_apk_native_disassemble or mt_apk_native_analyze_control_flow; unknown means try thumb and arm separately, and empty string means no hint is available.")), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable. enclosingSymbol is best-effort and uses only non-imported sized ELF symbols; enclosingSymbol.found=false may mean stripped symbols, missing symbol sizes, or unavailable symbol metadata, not that no function contains the address. enclosingSymbol.instructionMode is a best-effort follow-up hint, not proof of the symbol's real instruction state.")), "Address mapping result."), C3935.m7770(C3935.m7762(JSON.object(), "No tool-specific diagnostics.")), C3935.m7764("mt_apk_native_map_address nextActions is intentionally empty."));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m31563() {
        return C3935.m7765("Result for mt_apk_native_disassemble. An instruction window in disassemblyText with address, mode, boundary, and continuation metadata. Check incompleteInstructionAtEnd before interpreting trailing bytes.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C3935.m7775("string", "Requested instruction mode.")).add("stopAtSymbolBoundary", C3935.m7775(ClassTransform.BOOLEAN, "Whether this window should use the containing best-effort sized ELF symbol end as an upper bound when available.")).add("resolvedInstructionMode", C3935.m7775("string", "Resolved instruction mode.")).add("effectiveAddress", C3935.m7772("string", "Effective virtual address.")).add("mapping", C3935.m7762(m31574(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("symbolBoundary", C20175.m45657(JSON.object().add("requested", C3935.m7775(ClassTransform.BOOLEAN, "Whether stopAtSymbolBoundary was requested.")).add("applied", C3935.m7775(ClassTransform.BOOLEAN, "Whether a non-imported sized ELF symbol end is available as an upper bound for this disassembly view.")).add("endReached", C3935.m7775(ClassTransform.BOOLEAN, "Whether bytesConsumed reaches endVirtualAddressExclusive in this response.")).add("name", C3935.m7775("string", "Raw ELF symbol name when applied, otherwise empty string.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled symbol name when applied and available, otherwise empty string.")).add("startVirtualAddress", C3935.m7772("string", "Symbol start virtual address, or null.")).add("endVirtualAddressExclusive", C3935.m7772("string", "Symbol end address, the first address after this symbol, or null.")).add("offset", C3935.m7772("string", "Offset from startVirtualAddress to data.effectiveAddress, or null.")), "integer", "Symbol size in bytes, or 0 when not applied.", "size", "Best-effort disassembly stop boundary. applied=true means a symbol end address is available as an upper bound for this view; maxBytes or maxInstructions may still stop the response earlier. Disassembly never crosses endVirtualAddressExclusive when applied=true. endReached=true only means this response consumed bytes up to that end address, not that a full function was disassembled.")).add("arch", C3935.m7775("string", "Architecture used for disassembly.")).add("archBits", C3935.m7775("integer", "ELF class/ABI bit width; ARM32 stays 32 even when decoding Thumb instructions.")).add("instructionSet", C3935.m7775("string", "Instruction set used for this disassembly: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C3935.m7775("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("bytesRead", C3935.m7775("integer", "Logical byte window length exposed for this response, capped by maxBytes and the current mapping or applied symbol boundary.")).add("bytesConsumed", C3935.m7775("integer", "Bytes represented by disassemblyText.")).add("incompleteInstructionAtEnd", C3935.m7775(ClassTransform.BOOLEAN, "Whether the byte window ended with leftover bytes that are too short to form one complete instruction. These leftover bytes are not counted in bytesConsumed; retry the same address with a larger maxBytes instead of treating this as invalid code.")).add("disassemblyText", C3935.m7775("string", "Compact instruction text. Each line is \"0x<hex-address>: <hex-bytes> <assembly>\"; addresses include the 0x prefix and can be copied directly with addressKind=virtual, addresses have no leading zero padding. Lines have no indentation and use one space between columns. Machine bytes are contiguous lowercase hex in original byte order, ready to concatenate into expectedHex. The address is the effective virtual address, not the input file offset or original odd Thumb address.")).add("instructionCount", C3935.m7775("integer", "Instruction count represented in disassemblyText.")).add("hasMore", C3935.m7775(ClassTransform.BOOLEAN, "Whether another contiguous window is available.")).add("nextAddressKind", C3935.m7772("string", "Value to pass as addressKind on the next mt_apk_native_disassemble call, or null.")).add("nextAddress", C3935.m7772("string", "Value to pass as address on the next mt_apk_native_disassemble call, or null.")).add("nextInstructionMode", C3935.m7772("string", "Value to pass as instructionMode on the next mt_apk_native_disassemble call, or null.")), "Disassembly result."), C3935.m7770(C3935.m7762(m31538("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_disassemble errors; diagnostics is null for unrelated argument or runtime errors.")), C3935.m7768("When data.hasMore=true, a purpose=continue action calls mt_apk_native_disassemble with complete arguments for the next window; otherwise success has no actions. ARM32 instructionMode errors may return mt_apk_native_disassemble retry actions; copy those arguments directly. Follow each action's tool and purpose, not mt_apk_continue. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C3935.m7763(C12981.m29768(), "mt_apk_native_disassemble", "continue"), C3935.m7763(C12981.m29768(), "mt_apk_native_disassemble", "retry"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m31572() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex; odd ARM32 virtual input keeps the Thumb T-bit here.")).add("instructionMode", C3935.m7775("string", "Requested instruction mode.")).add("outputMode", C3935.m7769("Requested output mode: full or summary.", "full", ErrorBundle.SUMMARY_ENTRY)).add("detailOmitted", C3935.m7775(ClassTransform.BOOLEAN, "true only when outputMode=summary; blocks, edges, externalFlows, and unresolvedFlows remain present as empty arrays while observed counts remain populated.")).add("resolvedInstructionMode", C3935.m7775("string", "Instruction mode used to decode this CFG.")).add("effectiveAddress", C3935.m7775("string", "Mapped virtual address for the request; ARM32 Thumb clears the T-bit.")).add("mapping", C3935.m7762(m31574(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C3935.m7775("string", "Architecture used for CFG decoding.")).add("archBits", C3935.m7775("integer", "ELF class/ABI bit width; ARM32 stays 32 for Thumb CFGs.")).add("instructionSet", C3935.m7775("string", "Instruction set used for this graph: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C3935.m7775("string", "Instruction width category: mixed16_32, fixed32, or variable.")).add("function", C20175.m45657(JSON.object().add("startVirtualAddress", C3935.m7775("string", "Function candidate start virtual address as lowercase 0x hex.")).add("startFileOffset", C3935.m7775("string", "Function candidate start ELF file offset as lowercase 0x hex.")).add("name", C3935.m7775("string", "Raw ELF symbol name, or empty string for requested_address fallback.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled name when available, otherwise empty string.")).add("symbolSize", C3935.m7775("integer", "Sized symbol byte length, or 0 for requested_address fallback.")).add("startSource", C3935.m7769("How the start was selected.", "function_symbol", "executable_symbol", "requested_address")).add("boundarySource", C3935.m7769("How the exclusive end boundary was selected.", "function_symbol", "executable_symbol", "executable_mapping")), "string", "Exclusive function boundary end as lowercase 0x hex.", "boundaryEndVirtualAddress", "Selected function candidate and exclusive analysis boundary. Symbol-based boundaries are best-effort ELF metadata; requested_address falls back to the initial executable mapping.")).add("blocks", C9417.m21913("type", "array", "description", "Basic-block details sorted by virtual address. In outputMode=full, this array contains the observed blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.blockCount for the observed count. assemblyText is compact factual disassembly without machine bytes; each line is 0xaddress: mnemonic operands.").add("items", C20175.m45657(JSON.object().add("startVirtualAddress", C3935.m7775("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C3935.m7775("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C3935.m7775("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C3935.m7775("integer", "Instruction lines in assemblyText.")).add("terminator", C3935.m7769("How this block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")), "string", "One line per instruction in the form 0xaddress: mnemonic operands; no machine bytes.", "assemblyText", "One returned basic block."))).add("edges", C9417.m21913("type", "array", "description", "Confirmed direct edge details. In outputMode=full, both endpoints are block starts present in blocks. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.edgeCount for the observed count. Calls are not CFG edges.").add("items", C3935.m7762(JSON.object().add("fromVirtualAddress", C3935.m7775("string", "Source block start as lowercase 0x hex.")).add("toVirtualAddress", C3935.m7775("string", "Target block start as lowercase 0x hex.")).add("kind", C3935.m7769("Edge kind.", "fallthrough", "branch_true", "branch_false", "jump")), "One direct block edge."))).add("externalFlows", C9417.m21913("type", "array", "description", "Known direct exit details from the selected function. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.externalFlowCount for the observed count. These are expected exits and do not make controlFlowComplete false.").add("items", C3935.m7762(JSON.object().add("sourceVirtualAddress", C3935.m7775("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C3935.m7769("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C3935.m7775("string", "Known external target as lowercase 0x hex.")).add("reason", C3935.m7769("Why this target was not followed.", "outside_function_boundary", "other_function_symbol")), "One known external flow.")));
        JSONObject jSONObjectM7762 = C3935.m7762(JSON.object().add("sourceVirtualAddress", C3935.m7775("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C3935.m7769("Flow kind.", "fallthrough", "branch_true", "branch_false", "jump")).add("targetVirtualAddress", C3935.m7775("string", "Known target address as lowercase 0x hex.")).add("reason", C3935.m7769("Why the target was unresolved.", "target_not_executable", "unaligned_or_overlapping_target", "instruction_mode_transition", "max_blocks_reached", "max_analysis_bytes_reached", "max_instructions_reached", "invalid_instruction")), "Known target that could not become a returned block.");
        return C3935.m7765("Result for mt_apk_native_analyze_control_flow. A bounded function graph or summary. Read analysisSummary for completeness. Shape hints describe only the observed subgraph. Retry results replace the previous graph; never merge them.", C3935.m7762(jSONObjectAdd.add("unresolvedFlows", C9417.m21913("type", "array", "description", "Details for control-flow paths not converted into confirmed block edges. In outputMode=summary, this field remains present as an empty array; use observedGraphSummary.unresolvedFlowCount and observedGraphSummary.unresolvedReasonCounts for observed totals and reason counts. Read analysisSummary.completionReason before retrying or drawing conclusions.").add("items", JSON.object().add("anyOf", JSON.array().add(jSONObjectM7762).add(C3935.m7762(JSON.object().add("sourceVirtualAddress", C3935.m7775("string", "Source instruction address as lowercase 0x hex.")).add("flowKind", C3935.m7766("indirect_jump", "Indirect jump flow.")).add("reason", C3935.m7766("indirect_target", "The target is not statically known.")), "Indirect jump whose target was not statically known.")).add(C3935.m7762(JSON.object().add("sourceVirtualAddress", C3935.m7775("string", "Function candidate start as lowercase 0x hex.")).add("flowKind", C3935.m7766("decode", "Entry decode flow.")).add("reason", C3935.m7766("invalid_instruction", "The entry instruction could not be decoded.")), "Function entry could not be decoded."))))).add("analysisSummary", C20175.m45657(JSON.object().add("controlFlowComplete", C3935.m7775(ClassTransform.BOOLEAN, "Whether all statically resolvable direct flow inside the selected boundary was explored with no unresolved flows.")).add("completionReason", C3935.m7769("Primary completion reason in fixed priority order.", "complete", "max_analysis_bytes_reached", "max_blocks_reached", "max_instructions_reached", "invalid_instruction", "unresolved_indirect_flow", "invalid_control_flow_target")).add("meaning", C3935.m7775("string", "Stable explanation of completionReason and retry semantics.")).add("bytesAnalyzed", C3935.m7775("integer", "Unique successfully decoded instruction bytes.")), "integer", "Unique successfully decoded instructions.", "instructionsAnalyzed", "CFG completeness and budget usage. controlFlowComplete is true only when completionReason=complete and observedGraphSummary.unresolvedFlowCount=0. Read observedGraphSummary for counts in both output modes. Budget retry results replace this graph and must not be merged; a budget reason without a retry action means its limiting budget is already at the public limit.")).add("observedGraphSummary", C3935.m7762(JSON.object().add("blockCount", C3935.m7775("integer", "Observed basic-block count; this can be lower than the consumed candidate budget.")).add("edgeCount", C3935.m7775("integer", "Observed confirmed direct edge count.")).add("externalFlowCount", C3935.m7775("integer", "Observed known external flow count.")).add("unresolvedFlowCount", C3935.m7775("integer", "Observed unresolved flow count.")).add("terminatorCounts", C20175.m45657(JSON.object().add("fallthrough", C3935.m7775("integer", "Observed fallthrough terminator count.")).add("conditional_jump", C3935.m7775("integer", "Observed conditional_jump terminator count.")).add("jump", C3935.m7775("integer", "Observed jump terminator count.")).add("indirect_jump", C3935.m7775("integer", "Observed indirect_jump terminator count.")).add("return", C3935.m7775("integer", "Observed return terminator count.")).add("trap", C3935.m7775("integer", "Observed trap terminator count.")).add("invalid", C3935.m7775("integer", "Observed invalid terminator count.")), "integer", "Observed budget_boundary terminator count.", "budget_boundary", "Observed basic-block terminator counts; all fields are present and 0 means no observed block used that terminator.")).add("unresolvedReasonCounts", C20175.m45657(JSON.object().add("target_not_executable", C3935.m7775("integer", "Observed target_not_executable count.")).add("unaligned_or_overlapping_target", C3935.m7775("integer", "Observed unaligned_or_overlapping_target count.")).add("instruction_mode_transition", C3935.m7775("integer", "Observed instruction_mode_transition count.")).add("max_blocks_reached", C3935.m7775("integer", "Observed max_blocks_reached count.")).add("max_analysis_bytes_reached", C3935.m7775("integer", "Observed max_analysis_bytes_reached count.")).add("max_instructions_reached", C3935.m7775("integer", "Observed max_instructions_reached count.")).add("invalid_instruction", C3935.m7775("integer", "Observed invalid_instruction count.")), "integer", "Observed indirect_target count.", "indirect_target", "Observed unresolved-flow reason counts; all fields are present and 0 means no observed unresolved flow used that reason.")).add("observedShapeHints", C3935.m7771("Conservative observed-only hints. Values may include observed_linear, observed_branchy, and observed_dispatcher_like. Empty array means no hint matched.")), "Observed CFG summary for the subgraph analyzed in this call. Counts remain populated in both output modes. In summary mode, the four detail array fields remain present but empty, so use these counts instead of their lengths. observedShapeHints are conservative hints about the observed subgraph only.")).add("entryPreview", C3935.m7762(JSON.object().add("available", C3935.m7775(ClassTransform.BOOLEAN, "Whether an entry or fallback first block was available.")).add("startVirtualAddress", C3935.m7772("string", "Preview block start address, or null when unavailable.")).add("lines", C3935.m7771("At most 16 original assemblyText lines from the entry or fallback first block.")), "Entry block preview copied from the original assemblyText lines without reparsing addresses or instructions.")).add("notableBlocks", C9417.m21913("type", "array", "description", "At most 8 representative observed blocks selected for summary triage. Preview lines are copied from original assemblyText without reparsing.").add("items", C3935.m7762(JSON.object().add("startVirtualAddress", C3935.m7772("string", "Block start virtual address as lowercase 0x hex.")).add("startFileOffset", C3935.m7772("string", "Block start ELF file offset as lowercase 0x hex.")).add("size", C3935.m7775("integer", "Unique decoded instruction bytes in this block.")).add("instructionCount", C3935.m7775("integer", "Instruction count reported for the full block.")).add("terminator", C3935.m7769("How this observed block path ends.", "fallthrough", "conditional_jump", "jump", "indirect_jump", "return", "trap", "invalid", "budget_boundary")).add("previewLines", C3935.m7771("At most 4 original assemblyText lines from this block.")), "One observed notable block preview."))), "Function-local direct static CFG result. Read analysisSummary before treating this graph as complete; a budget retry replaces this result rather than extending it."), C3935.m7770(C3935.m7762(m31538("Stable reason token: arm32_mode_required or arm32_thumb_address_conflict.", "Fixed hint string: odd virtual address indicates Thumb T-bit, ARM32 file/even address does not identify ARM or Thumb, or empty string when no mode hint is available."), "Instruction mode diagnostics for ARM32 mt_apk_native_analyze_control_flow errors; diagnostics is null for unrelated argument or runtime errors.")), C3935.m7768("Budget or ARM32 mode errors may return mt_apk_native_analyze_control_flow retry actions. A retry result replaces the previous graph and must not be merged. When no larger CFG retry is available, mt_apk_native_disassemble may inspect a local instruction window. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open.", C3935.m7763(C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C3935.m7775("string", "ZIP entry locator for the native ELF.")).add("addressKind", C3935.m7769("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C3935.m7775("string", "Unsigned address string for a function symbol or an address inside the function candidate.")).add("instructionMode", C3935.m7769("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("outputMode", C3935.m7769("Output mode: full populates graph detail arrays; summary keeps the required detail arrays present but empty while observed counts remain populated.", "full", ErrorBundle.SUMMARY_ENTRY)).add("maxAnalysisBytes", C3935.m7775("integer", "Unique successfully decoded instruction-byte budget.")).add("maxBlocks", C3935.m7775("integer", "Candidate basic-block start budget.")), "integer", "Unique successfully decoded instruction budget.", "maxInstructions", "Arguments for mt_apk_native_analyze_control_flow."), "mt_apk_native_analyze_control_flow", "retry"), C3935.m7763(C12981.m29768(), "mt_apk_native_disassemble", "inspect"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۜ */
    public static JSONObject m31560() {
        JSONObject jSONObjectM45657 = C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id that was modified.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed input address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex. ARM32 odd Thumb virtual input keeps bit0 here.")).add("instructionMode", C3935.m7775("string", "Requested instruction mode.")).add("resolvedInstructionMode", C3935.m7775("string", "Resolved instruction mode used for assembly and follow-up disassembly.")).add("effectiveAddress", C3935.m7772("string", "Effective virtual address used for mapping and assembly. Thumb virtual input clears the T-bit here.")).add("mapping", C3935.m7762(m31574(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C3935.m7775("string", "Architecture passed to the assembler.")).add("archBits", C3935.m7775("integer", "ELF class/ABI bit width; ARM32 stays 32 even when patching Thumb instructions.")).add("instructionSet", C3935.m7775("string", "Instruction set used for this patch: thumb, arm, aarch64, x86, or x86_64.")).add("instructionWidth", C3935.m7775("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86.")).add("patchedVirtualAddress", C3935.m7772("string", "Virtual address actually patched. This equals effectiveAddress and never includes the ARM Thumb T-bit.")).add("patchedFileOffset", C3935.m7772("string", "ELF file offset inside the zip_entry bytes that was patched.")).add("bytesPatched", C3935.m7775("integer", "Final equal-length byte count written to the edit session.")).add("expectedHex", C3935.m7775("string", "Expected bytes that were verified before writing, uppercase hex without spaces.")).add("assembledHex", C3935.m7775("string", "Raw bytes produced by the assembler before optional NOP padding, uppercase hex without spaces.")).add("afterHex", C3935.m7775("string", "Final bytes written after optional NOP padding, uppercase hex without spaces.")).add("paddingMode", C3935.m7775("string", "Padding mode used for this patch: none or nop.")), "integer", "Number of NOP padding bytes appended to assembledHex before writing.", "nopBytesInserted", "Native instruction patch result.");
        JSONObject jSONObjectM31538 = m31538("Stable instruction-mode reason token for retryable ARM32 patch errors. Empty string means this is not an instruction-mode retry error; ignore addressModeHint and retryInstructionModes and inspect the other diagnostics fields instead.", "Fixed ARM32 address hint string. Empty string means this is not an instruction-mode retry error.");
        jSONObjectM31538.add("patchedFileOffset", C3935.m7772("string", "Patch ELF file offset for expectedHex mismatch, or null.")).add("expectedHex", C3935.m7772("string", "Expected uppercase hex for a stale guard mismatch, or null.")).add("actualHex", C3935.m7772("string", "Actual uppercase hex read from the current edit session view, or null.")).add("expectedBytes", C3935.m7772("integer", "Patch window byte count for length errors, or null.")).add("assembledBytes", C3935.m7772("integer", "Assembler output byte count for length errors, or null.")).add("paddingMode", C3935.m7772("string", "Requested padding mode for length errors, or null.")).add("remainingBytes", C3935.m7772("integer", "Bytes left to fill when NOP padding is unavailable, or null.")).add("instructionSet", C3935.m7772("string", "Instruction set for NOP padding diagnostics, or null.")).add("instructionWidth", C3935.m7772("string", "Instruction width for NOP padding diagnostics, or null.")).add("arch", C3935.m7772("string", "Assembler architecture for assembly failures, or null.")).add("bits", C3935.m7772("integer", "Assembler bit width for assembly failures, or null.")).add("message", C3935.m7772("string", "Sanitized assembler failure message, or null."));
        return C3935.m7765("Result for mt_apk_native_patch_instructions. Verified instruction replacement. assembledHex contains assembled bytes; afterHex includes any NOP padding. Use nextActions for read-back or error recovery.", jSONObjectM45657, C3935.m7770(C3935.m7762(jSONObjectM31538, "native_patch_instructions diagnostics. diagnostics is null for unrelated argument errors. The instruction-mode fields reason, addressModeHint, and retryInstructionModes apply only to ARM32 retry errors; when reason is empty, ignore those fields and use expectedHex/actualHex, expectedBytes/assembledBytes, remainingBytes, or message to decide the next step.")), C3935.m7768("Successful native instruction patch returns disassemble and read_bytes verification actions. ARM32 instructionMode errors may return native patch retry actions; stale expectedHex errors may return read_bytes recovery. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C3935.m7763(C12981.m29768(), "mt_apk_native_disassemble", "inspect"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "inspect"), C3935.m7763(C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Non-empty edit session id returned by mt_apk_session_create.")).add("locator", C3935.m7775("string", "ZIP entry locator for the native ELF.")).add("addressKind", C3935.m7769("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C3935.m7775("string", "Unsigned target address string copied from the failed request. The effective address must be 4-byte aligned for AArch64/ARM or 2-byte aligned for Thumb after clearing the virtual-address T-bit.")).add("instructionMode", C3935.m7769("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("expectedHex", C3935.m7775("string", "Stale-view guard bytes for the patch window. Copy from mt_apk_read_bytes or mt_apk_native_disassemble for the same editSessionId and locator; do not invent it or use replacement bytes.")).add("replacementAssembly", C3935.m7775("string", "Assembly source text containing instructions and labels only, not a tool command. Assembler directives such as .arm, .bits, .hex, .fill, and .incbin are rejected before assembly.")).add("paddingMode", C3935.m7769("Padding mode: none or nop.", "none", "nop")), "Arguments for mt_apk_native_patch_instructions."), "mt_apk_native_patch_instructions", "retry"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "retry"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static JSONObject m31573() {
        return C3935.m7765("Result for mt_apk_native_patch_string. String patch result. beforeHex and afterHex cover the full byte window including padding or a final NUL. Use nextActions to verify the result.", C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id that was modified.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed input address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex.")).add("effectiveAddress", C3935.m7772("string", "Mapped virtual address used for context, or null when file_offset input is not mapped.")).add("mapping", C3935.m7762(m31574(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("patchedFileOffset", C3935.m7772("string", "Patched SO file offset inside the zip_entry bytes as lowercase 0x hex. Use nextActions[].arguments.byteOffset for decimal mt_apk_read_bytes input.")).add("textEncoding", C3935.m7775("string", "Always utf8; this is not an input option.")).add("expectedTextByteCount", C3935.m7775("integer", "UTF-8 byte count of expectedText.")).add("replacementTextByteCount", C3935.m7775("integer", "UTF-8 byte count of replacementText.")).add("extraPaddingBytesConsumed", C3935.m7775("integer", "Extra padding bytes consumed after expectedText when replacementText is longer; 0 when equal or shorter.")).add("terminatorPreserved", C3935.m7775(ClassTransform.BOOLEAN, "true only for successful null_pad patches; false for none and space_pad.")).add("bytesPatched", C3935.m7775("integer", "Complete patch window byte count, not actual changed byte count.")).add("beforeHex", C3935.m7775("string", "Complete bytes verified before writing, uppercase hex. Includes padding or final NUL when applicable.")).add("afterHex", C3935.m7775("string", "Complete bytes written, uppercase hex. Includes padding or final NUL when applicable.")), "string", "Padding mode used for this patch: none, null_pad, or space_pad.", "paddingMode", "Native UTF-8 string patch result."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string when unavailable.")).add("locator", C3935.m7775("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C3935.m7775("string", "Requested address kind, or empty string when unavailable.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("patchedFileOffset", C3935.m7772("string", "Patched SO file offset as lowercase 0x hex, or null.")).add("paddingMode", C3935.m7772("string", "Requested padding mode, or null.")).add("expectedText", C3935.m7772("string", "Expected UTF-8 text stale guard, or null.")).add("actualText", C3935.m7772("string", "Best-effort readable actual text prefix, or null. The exact bytes are in actualHex.")).add("expectedHex", C3935.m7772("string", "Expected full patch window bytes as uppercase hex, or null.")).add("actualHex", C3935.m7772("string", "Actual current bytes as uppercase hex, or null.")).add("expectedTextByteCount", C3935.m7772("integer", "UTF-8 byte count of expectedText, or null.")).add("replacementTextByteCount", C3935.m7772("integer", "UTF-8 byte count of replacementText, or null.")).add("requiredPaddingBytes", C3935.m7772("integer", "Padding bytes checked after expectedText, or null.")).add("actualPaddingHex", C3935.m7772("string", "Actual padding/terminator bytes as uppercase hex, or null.")).add("terminatorRequired", C3935.m7772(ClassTransform.BOOLEAN, "Whether null_pad required a final NUL terminator, or null.")).add("bytesPatched", C3935.m7772("integer", "Complete patch window byte count, or null.")).add("limitBytes", C3935.m7772("integer", "Maximum supported patch window bytes, or null.")).add("endByteOffset", C3935.m7772("string", "Exclusive end SO file offset as lowercase 0x hex, or null.")).add("entrySize", C3935.m7772("integer", "SO entry size in bytes, or null.")), "native_patch_string diagnostics. diagnostics is null for unrelated argument errors. actualText is only a readable best-effort prefix; use actualHex as the exact stale-guard fact.")), C3935.m7768("Successful native string patch returns one read_bytes verification action. Stale expectedText or padding errors use a 4096-byte recovery window only for null_pad; space_pad and none stay within the exact observed window because their slot boundary is not self-describing. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "inspect"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "retry"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ۢ */
    public static JSONObject m31561() {
        return C3935.m7765("Result for mt_apk_native_xref. Direct static references. Read scanSummary before interpreting empty refs or warnings; pagination.hasMore controls continuation. Results are not a complete caller graph.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK.")).add("locator", C3935.m7775("string", "zip_entry locator.")).add("addressKind", C3935.m7775("string", "Parsed input address kind: virtual or file_offset.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex.")).add("instructionMode", C3935.m7775("string", "Requested instruction mode.")).add("resolvedInstructionMode", C3935.m7775("string", "Resolved instruction mode used for scanning source instructions; data-only scans return auto.")).add("scanKind", C3935.m7775("string", "Scan domain used for this page: code, data, or both.")).add("referenceKinds", C3935.m7771("Reference kinds used for this scan, normalized in fixed order. Values are call, jump, data, and unknown; jump covers branch/jump instructions. In data phases only data refs are emitted.")).add("targetMapped", C3935.m7775(ClassTransform.BOOLEAN, "Whether the target has a loaded file-backed mapping usable for this xref scan. false may mean miss, virtual-only address, or mapping.isLoaded=false.")).add("targetVirtualAddress", C3935.m7772("string", "Mapped target virtual address when targetMapped=true, otherwise null. ARM32 odd virtual input clears bit0 only for an executable mapping; a loaded non-executable odd target stays exact. Executable ARM32 targets may still match odd Thumb function pointers when this value is even.")).add("targetFileOffset", C3935.m7772("string", "Mapped target ELF file offset within the zip_entry bytes when targetMapped=true, otherwise null.")).add("mapping", C3935.m7762(m31574(), "Address mapping details. Address fields are null on miss. isLoaded means this file-backed mapping belongs to a loaded ELF range; virtual-only runtime bytes without file backing may still miss. isExecutable means that loaded mapping is executable.")).add("arch", C3935.m7775("string", "Architecture used for scanning.")).add("archBits", C3935.m7775("integer", "ELF class/ABI bit width; ARM32 stays 32 even when scanning Thumb instructions.")).add("instructionSet", C3935.m7775("string", "Instruction set used for source instructions: thumb, arm, aarch64, x86, or x86_64; data-only scans return an empty string.")).add("instructionWidth", C3935.m7775("string", "Instruction encoding width category: mixed16_32 for Thumb, fixed32 for ARM/AArch64, or variable for x86; data-only scans return an empty string.")).add("refs", C9417.m21913("type", "array", "description", "Best-effort direct static references found on this page after applying data.scanKind and data.referenceKinds. Use data.scanSummary.reason, data.scanSummary.meaning, and data.scanSummary.completionReason to interpret empty refs; read data.scanSummary.warningCode and data.scanSummary.warning before trusting low-address instruction data refs. Do not treat empty refs alone as proof that no matching reference exists.").add("items", C20175.m45657(JSON.object().add("sourceVirtualAddress", C3935.m7772("string", "Source virtual address.")).add("sourceFileOffset", C3935.m7772("string", "Source ELF file offset within the zip_entry bytes; convert this 0x hex string to a decimal byteOffset before calling mt_apk_read_bytes.")).add("sourceKind", C3935.m7775("string", "Source kind: instruction, data_relocation, or data_pointer.")).add("sourceSize", C3935.m7775("integer", "Source byte size represented by bytes: instruction size for sourceKind=instruction, or data slot size for data_relocation/data_pointer.")).add("sourceSymbol", C3935.m7774(C3935.m7762(JSON.object().add("name", C3935.m7775("string", "Raw ELF symbol name.")).add("demangledName", C3935.m7775("string", "Best-effort C++ demangled name when available and different from name, otherwise empty string.")).add("startVirtualAddress", C3935.m7775("string", "Symbol start virtual address as a lowercase 0x hex string.")).add("startFileOffset", C3935.m7772("string", "Symbol start ELF file offset within the zip_entry bytes, or null when unknown.")).add("offset", C3935.m7775("string", "Offset from startVirtualAddress to this ref source address as a lowercase 0x hex string.")).add("size", C3935.m7775("integer", "Symbol size in bytes; this is best-effort metadata, not proof of an exact function boundary.")), "Best-effort non-imported sized ELF symbol containing this ref source address. null means no safe symbol context is available; stripped or malformed symbol metadata can cause null. For sourceKind=instruction, use startVirtualAddress with mt_apk_native_analyze_control_flow, copy xref data.resolvedInstructionMode to preserve ARM32 source mode, and choose outputMode=summary for triage or outputMode=full for detail arrays; use mt_apk_native_disassemble for exact bytes. For data sources, this is owner context for the slot or pointer, not a CFG function entry or caller relationship."))).add("bytes", C3935.m7775("string", "Source bytes as lowercase hex.")).add(TextBundle.TEXT_ENTRY, C3935.m7775("string", "Disassembled instruction text, relocation summary, or data pointer text, truncated to 512 characters.")), "string", "Reference kind: call, jump, data, or unknown. jump covers branch/jump instructions.", "referenceKind", "Native xref item."))).add("scannedBytes", C3935.m7775("integer", "Code/data-pointer bytes scanned on this page; relocation item scanning is not counted here and uses its own per-page budget.")).add("scanComplete", C3935.m7775(ClassTransform.BOOLEAN, "Whether this xref request has no more pages. Prefer data.scanSummary.reason, meaning, and completionReason to interpret empty refs and progress.")).add("scanSummary", C20175.m45657(JSON.object().add("reason", C3935.m7775("string", "Stable reason token: target_not_mapped, refs_found, scan_incomplete, or no_refs_found.")).add("meaning", C3935.m7775("string", "Short explanation of this page and whether to continue.")).add("completionReason", C3935.m7775("string", "Stable page-stop token: target_not_mapped, result_limit_reached, scan_budget_exhausted, relocation_page_budget_exhausted, or scan_space_exhausted.")).add("warningCode", C3935.m7775("string", "Stable warning token, or empty string when no warning applies. low_address_instruction_data_reference_noise means code/both instruction data refs may match ordinary immediates.")), "string", "Short warning text, or empty string when no warning applies.", "warning", "Stable explanation of this native xref page. reason is one of target_not_mapped, refs_found, scan_incomplete, or no_refs_found. completionReason explains why this page stopped: target_not_mapped means no scan ran; result_limit_reached means this page stopped after returning limit refs; scan_budget_exhausted means this page used maxScanBytes and can continue; relocation_page_budget_exhausted means this page used the relocation item page budget and can continue; scan_space_exhausted means the selected direct-reference scan space is exhausted, but it is not proof of a complete caller graph. data.scanSummary.warningCode and data.scanSummary.warning are empty unless this request has a known AI interpretation risk. Read meaning before treating empty refs as no references.")).add("pagination", C3935.m7767("Number of refs returned on this page.", "Maximum limit accepted by mt_apk_continue for later native xref pages.", "Always null for native xref because the tool does not pre-scan the whole SO; null means unknown, not zero. Use hasMore only as the continuation signal; use data.scanSummary to interpret scan meaning.")), "Native xref scan result."), C3935.m7770(C3935.m7762(m31538("Stable reason token: arm32_mode_required or data_scan_requires_auto.", "Fixed hint string: ARM32 file/even address does not identify ARM or Thumb, data scan does not decode instructions, odd target virtual address does not identify source instruction mode, or empty string when no mode hint is available.").add("scanKind", C3935.m7775("string", "Requested scan kind, or empty string when unavailable.")).add("referenceKinds", C3935.m7771("Requested reference kinds, or empty when unavailable.")), "Instruction mode diagnostics for ARM32/data-scan mt_apk_native_xref errors; diagnostics is null for unrelated argument or runtime errors.")), C3935.m7768("Success continuation uses mt_apk_continue when data.pagination.hasMore=true. ARM32 or data-scan instructionMode errors may return mt_apk_native_xref retry actions; copy those arguments directly. A corrupt workspace whose source APK remains accessible may return mt_apk_workspace_open to recreate it.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue"), C3935.m7763(C20175.m45657(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id.")).add("editSessionId", C3935.m7775("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C3935.m7775("string", "ZIP entry locator for the native ELF.")).add("addressKind", C3935.m7769("Address kind: virtual or file_offset.", "virtual", "file_offset")).add("address", C3935.m7775("string", "Unsigned target address string copied from the failed request.")).add("instructionMode", C3935.m7769("Instruction mode: auto, arm, or thumb.", "auto", "arm", "thumb")).add("scanKind", C3935.m7769("Scan domain: code, data, or both.", "code", AbstractC0213e.f989m, "both")).add("referenceKinds", C9417.m21913("type", "array", "description", "Reference kinds to return.").add("items", C3935.m7769("Reference kind.", "call", "jump", AbstractC0213e.f989m, "unknown"))).add("maxScanBytes", C3935.m7775("integer", "Maximum code/data-pointer bytes to consume on this xref page.")), "integer", "Maximum refs to return on this page.", "limit", "Arguments for mt_apk_native_xref."), "mt_apk_native_xref", "retry"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m31538(String str, String str2) {
        return JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id, or empty string when unavailable.")).add("editSessionId", C3935.m7775("string", "Edit session id, or empty string for base APK or unavailable context.")).add("locator", C3935.m7775("string", "zip_entry locator, or empty string when unavailable.")).add("addressKind", C3935.m7775("string", "Requested address kind, or empty string when unavailable.")).add("address", C3935.m7775("string", "Parsed input address as lowercase 0x hex, or empty string when unavailable.")).add("instructionMode", C3935.m7775("string", "Requested instruction mode, or empty string when unavailable.")).add("reason", C3935.m7775("string", str)).add("addressModeHint", C3935.m7775("string", str2)).add("retryInstructionModes", C3935.m7771("Instruction modes corresponding one-to-one with root nextActions retry actions, in the same order. Empty when no retry action is available."));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m31574() {
        return JSON.object().add("sectionName", C3935.m7775("string", "Section or segment name, or empty string on miss.")).add("virtualAddress", C3935.m7772("string", "Mapped virtual address, or null.")).add("fileOffset", C3935.m7772("string", "Mapped ELF file offset within the zip_entry bytes, or null.")).add("rangeOffset", C3935.m7772("string", "Offset inside mapped range, or null.")).add("size", C3935.m7775("integer", "Mapped range size, or 0 on miss.")).add("isLoaded", C3935.m7775(ClassTransform.BOOLEAN, "Whether this file-backed mapping belongs to a loaded ELF range. false means do not treat it as a runtime address; true does not make virtual-only bytes outside file backing mappable.")).add("isExecutable", C3935.m7775(ClassTransform.BOOLEAN, "Whether this loaded mapping is executable; do not disassemble when false.")).add("segment", C3935.m7775(ClassTransform.BOOLEAN, "Whether the mapping came from a segment; this does not mean the address is loaded."));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31559(String str, boolean z) {
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
