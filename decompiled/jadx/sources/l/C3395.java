package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.p.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.cb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4VX */
/* JADX INFO: loaded from: classes2.dex */
public final class C3395 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10355(int i) {
        return Character.isWhitespace(i) || i == 65279;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m10356(int i) {
        if (i < 65 || i > 90) {
            return ((i < 97 || i > 122) && (i & a.g) != 0) ? Character.toLowerCase(Character.toUpperCase(i)) : i;
        }
        return i + 32;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m10359(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m10352(String str, C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        for (String str2 : m10354(str)) {
            JSONValue jSONValue = c3059.f9609.get(str2);
            str2.getClass();
            boolean zAsBoolean = true;
            boolean zAsBoolean2 = false;
            byte b = -1;
            switch (str2.hashCode()) {
                case -1621907296:
                    if (str2.equals("safeToRetry")) {
                        b = 0;
                    }
                    break;
                case -1492123349:
                    if (str2.equals("failedEditIndex")) {
                        b = 1;
                    }
                    break;
                case -1422939762:
                    if (str2.equals("actual")) {
                        b = 2;
                    }
                    break;
                case -1356028430:
                    if (str2.equals("deletedDirectories")) {
                        b = 3;
                    }
                    break;
                case -732012665:
                    if (str2.equals("totalBytes")) {
                        b = 4;
                    }
                    break;
                case -316096034:
                    if (str2.equals("deletedFiles")) {
                        b = 5;
                    }
                    break;
                case -246218446:
                    if (str2.equals("stateKnown")) {
                        b = 6;
                    }
                    break;
                case -31933575:
                    if (str2.equals("expectedReplacements")) {
                        b = 7;
                    }
                    break;
                case 102976443:
                    if (str2.equals("limit")) {
                        b = 8;
                    }
                    break;
                case 355023498:
                    if (str2.equals("finalLine")) {
                        b = 9;
                    }
                    break;
                case 368036795:
                    if (str2.equals("byteOffset")) {
                        b = 10;
                    }
                    break;
                case 498091095:
                    if (str2.equals("warnings")) {
                        b = 11;
                    }
                    break;
                case 505289462:
                    if (str2.equals("endByteOffset")) {
                        b = 12;
                    }
                    break;
                case 596577671:
                    if (str2.equals("failedPatchIndex")) {
                        b = cb.k;
                    }
                    break;
                case 738943668:
                    if (str2.equals("changed")) {
                        b = cb.f77931l;
                    }
                    break;
                case 1043220472:
                    if (str2.equals("conflictingEditIndex")) {
                        b = 15;
                    }
                    break;
                case 1319996751:
                    if (str2.equals("actualReplacements")) {
                        b = 16;
                    }
                    break;
                case 1623003244:
                    if (str2.equals("finalColumn")) {
                        b = 17;
                    }
                    break;
                case 1882824794:
                    if (str2.equals("conflictingPatchIndex")) {
                        b = 18;
                    }
                    break;
                case 1892700099:
                    if (str2.equals("createdDirectories")) {
                        b = 19;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 14:
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        zAsBoolean2 = jSONValue.asBoolean();
                    }
                    jSONObjectObject.add(str2, zAsBoolean2);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    if (jSONValue == null || !jSONValue.isNumber()) {
                        jSONValue = JSON.NULL;
                    }
                    jSONObjectObject.add(str2, jSONValue);
                    break;
                case 6:
                    if (jSONValue != null && jSONValue.isBoolean()) {
                        zAsBoolean = jSONValue.asBoolean();
                    }
                    jSONObjectObject.add(str2, zAsBoolean);
                    break;
                case 11:
                    JSONArray jSONArrayArray = JSON.array();
                    if (jSONValue != null && jSONValue.isArray()) {
                        for (JSONValue jSONValue2 : jSONValue.asArray()) {
                            if (jSONValue2.isString()) {
                                jSONArrayArray.add(jSONValue2.asString());
                            }
                        }
                    }
                    jSONObjectObject.add(str2, jSONArrayArray);
                    break;
                default:
                    jSONObjectObject.add(str2, C0899.m3250(jSONValue));
                    break;
            }
        }
        return C19993.m46097(c3059, jSONObjectObject, c3059.f9604);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m10362(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            if (iLastIndexOf == 0) {
                iLastIndexOf = 2;
            }
            int iM46093 = C19993.m46093(iLastIndexOf, str);
            int length = iM46093 >= 0 ? iM46093 : str.length();
            while (true) {
                int i = length - 1;
                if (i <= iLastIndexOf) {
                    length = i;
                    break;
                }
                if (str.charAt(i) != '0') {
                    break;
                }
                length = i;
            }
            if (iM46093 < 0) {
                return str.substring(0, length);
            }
            if (iM46093 != length) {
                return str.substring(0, length) + str.substring(iM46093);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m10358(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m10357(String str) {
        String str2;
        String str3;
        String str4;
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectObject = JSON.object();
        for (String str5 : m10354(str)) {
            str5.getClass();
            byte b = -1;
            switch (str5.hashCode()) {
                case -1621907296:
                    if (str5.equals("safeToRetry")) {
                        b = 0;
                    }
                    break;
                case -1492123349:
                    if (str5.equals("failedEditIndex")) {
                        b = 1;
                    }
                    break;
                case -1422939762:
                    if (str5.equals("actual")) {
                        b = 2;
                    }
                    break;
                case -1356028430:
                    if (str5.equals("deletedDirectories")) {
                        b = 3;
                    }
                    break;
                case -1170699495:
                    if (str5.equals("actualTargetVersion")) {
                        b = 4;
                    }
                    break;
                case -732012665:
                    if (str5.equals("totalBytes")) {
                        b = 5;
                    }
                    break;
                case -316096034:
                    if (str5.equals("deletedFiles")) {
                        b = 6;
                    }
                    break;
                case -291790413:
                    if (str5.equals("deepestCreatedPath")) {
                        b = 7;
                    }
                    break;
                case -246218446:
                    if (str5.equals("stateKnown")) {
                        b = 8;
                    }
                    break;
                case -201390188:
                    if (str5.equals("failureStage")) {
                        b = 9;
                    }
                    break;
                case -130866641:
                    if (str5.equals("expectedTargetVersion")) {
                        b = 10;
                    }
                    break;
                case -31933575:
                    if (str5.equals("expectedReplacements")) {
                        b = 11;
                    }
                    break;
                case 3433509:
                    if (str5.equals(MotionUtils.EASING_TYPE_PATH)) {
                        b = 12;
                    }
                    break;
                case 91781034:
                    if (str5.equals("operationMode")) {
                        b = cb.k;
                    }
                    break;
                case 102976443:
                    if (str5.equals("limit")) {
                        b = cb.f77931l;
                    }
                    break;
                case 355023498:
                    if (str5.equals("finalLine")) {
                        b = 15;
                    }
                    break;
                case 368036795:
                    if (str5.equals("byteOffset")) {
                        b = 16;
                    }
                    break;
                case 486480214:
                    if (str5.equals("targetPath")) {
                        b = 17;
                    }
                    break;
                case 498091095:
                    if (str5.equals("warnings")) {
                        b = 18;
                    }
                    break;
                case 505289462:
                    if (str5.equals("endByteOffset")) {
                        b = 19;
                    }
                    break;
                case 528834221:
                    if (str5.equals("actualHex")) {
                        b = 20;
                    }
                    break;
                case 565052930:
                    if (str5.equals("failedPath")) {
                        b = 21;
                    }
                    break;
                case 596577671:
                    if (str5.equals("failedPatchIndex")) {
                        b = 22;
                    }
                    break;
                case 738943668:
                    if (str5.equals("changed")) {
                        b = 23;
                    }
                    break;
                case 1043220472:
                    if (str5.equals("conflictingEditIndex")) {
                        b = 24;
                    }
                    break;
                case 1319996751:
                    if (str5.equals("actualReplacements")) {
                        b = 25;
                    }
                    break;
                case 1529329987:
                    if (str5.equals("expectedHex")) {
                        b = 26;
                    }
                    break;
                case 1623003244:
                    if (str5.equals("finalColumn")) {
                        b = 27;
                    }
                    break;
                case 1882824794:
                    if (str5.equals("conflictingPatchIndex")) {
                        b = ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB;
                    }
                    break;
                case 1892700099:
                    if (str5.equals("createdDirectories")) {
                        b = 29;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    str2 = "Whether retrying the same requested mutation is safe.";
                    jSONObjectAdd = C1648.m5545(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 1:
                    str3 = "Zero-based index in the input edits array of the rejected text edit, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 2:
                    str3 = "Actual content or item count, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 3:
                    str3 = "Directories confirmed deleted before a failure, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 4:
                    str4 = "Current targetVersion for a version mismatch during reading or writing, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 5:
                    str3 = "Current file size for a range failure, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 6:
                    str3 = "Files or recognized links confirmed deleted before a failure, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 7:
                    str4 = "Deepest path confirmed created before a failure, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 8:
                    str2 = "Whether the target final state is known.";
                    jSONObjectAdd = C1648.m5545(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 9:
                    str4 = "Stable mutation stage that failed, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 10:
                    str4 = "Requested targetVersion for a version mismatch during reading or writing, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 11:
                    str3 = "Requested selected replacement count when the count check fails; otherwise null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 12:
                    str4 = "Normalized absolute path involved in the failure.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 13:
                    str4 = "atomic, best_effort, or non_atomic when a mutation guarantee was selected.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 14:
                    str3 = "Applicable content or item limit, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 15:
                    str3 = "Zero-based logical line at end of file for a text position error; null when unavailable.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 16:
                    str3 = "Rejected byte offset, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 17:
                    str4 = "Normalized absolute second path for a two-path operation.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 18:
                    jSONObjectAdd = C7416.m19939("type", "array", "description", "Non-fatal cleanup, metadata, or notification degradation.").add("items", C1648.m5545("string", "One warning message."));
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 19:
                    str3 = "Exclusive rejected byte end, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 20:
                    str4 = "Current patch bytes in uppercase hex, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 21:
                    str4 = "Exact path whose mutation failed, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 22:
                    str3 = "Zero-based index in the input patches array of the rejected byte patch, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 23:
                    str2 = "Whether the target may already have changed.";
                    jSONObjectAdd = C1648.m5545(ClassTransform.BOOLEAN, str2);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 24:
                    str3 = "Zero-based index in the input edits array of the conflicting text edit, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 25:
                    str3 = "Observed selected replacement count when the count check fails; otherwise null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 26:
                    str4 = "Expected patch bytes in uppercase hex, or null.";
                    jSONObjectAdd = C1648.m5542("string", str4);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 27:
                    str3 = "Zero-based Unicode code-point column at end of file on finalLine. Reading at (finalLine, finalColumn) returns an empty page; null when unavailable.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 28:
                    str3 = "Zero-based index in the input patches array of the conflicting byte patch, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                case 29:
                    str3 = "Directory levels confirmed created before a failure, or null.";
                    jSONObjectAdd = C1648.m5542("integer", str3);
                    jSONObjectObject.add(str5, jSONObjectAdd);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown diagnostic field: ".concat(str5));
            }
        }
        return C1648.m5540(C1648.m5532(jSONObjectObject, "Local file failure context for this tool; unavailable values are null."));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m10354(String str) {
        ArrayList arrayList;
        List listUnmodifiableList;
        ArrayList arrayList2;
        int iM23073 = 0;
        Object[] objArr = {MotionUtils.EASING_TYPE_PATH};
        ArrayList arrayList3 = new ArrayList(1);
        Object obj = objArr[0];
        C11003.requireNonNull(obj);
        arrayList3.add(obj);
        ArrayList arrayList4 = new ArrayList(C20195.unmodifiableList(arrayList3));
        byte b = -1;
        switch (str.hashCode()) {
            case -2123511115:
                if (str.equals("mt_file_create_directory")) {
                    b = 0;
                }
                break;
            case -1827097805:
                if (str.equals("mt_file_search")) {
                    b = 1;
                }
                break;
            case -1174937436:
                if (str.equals("mt_file_delete_directory")) {
                    b = 2;
                }
                break;
            case -1070178551:
                if (str.equals("mt_file_patch_bytes")) {
                    b = 3;
                }
                break;
            case -299333417:
                if (str.equals("mt_file_edit_text")) {
                    b = 4;
                }
                break;
            case -207074976:
                if (str.equals("mt_file_write_bytes")) {
                    b = 5;
                }
                break;
            case 250516771:
                if (str.equals("mt_file_replace_text")) {
                    b = 6;
                }
                break;
            case 386458560:
                if (str.equals("mt_file_copy")) {
                    b = 7;
                }
                break;
            case 386721001:
                if (str.equals("mt_file_list")) {
                    b = 8;
                }
                break;
            case 386756636:
                if (str.equals("mt_file_move")) {
                    b = 9;
                }
                break;
            case 386939551:
                if (str.equals("mt_file_stat")) {
                    b = 10;
                }
                break;
            case 453244107:
                if (str.equals("mt_file_read_text")) {
                    b = 11;
                }
                break;
            case 462356615:
                if (str.equals("mt_file_append_text")) {
                    b = 12;
                }
                break;
            case 769908445:
                if (str.equals("mt_file_truncate_bytes")) {
                    b = cb.k;
                }
                break;
            case 1149633677:
                if (str.equals("mt_file_read_bytes")) {
                    b = cb.f77931l;
                }
                break;
            case 1432121425:
                if (str.equals("mt_file_append_bytes")) {
                    b = 15;
                }
                break;
            case 1809273529:
                if (str.equals("mt_file_search_text")) {
                    b = 16;
                }
                break;
            case 2038747958:
                if (str.equals("mt_file_delete")) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                Object[] objArr2 = {"changed", "operationMode", "stateKnown", "warnings", "createdDirectories", "deepestCreatedPath", "failedPath", "failureStage", "safeToRetry"};
                arrayList = new ArrayList(9);
                while (iM23073 < 9) {
                    Object obj2 = objArr2[iM23073];
                    iM23073 = C8954.m23073(obj2, arrayList, obj2, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 1:
            case 8:
            case 10:
            case 16:
                listUnmodifiableList = Collections.EMPTY_LIST;
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 2:
                Object[] objArr3 = {"changed", "operationMode", "stateKnown", "warnings", "deletedFiles", "deletedDirectories", "failedPath", "failureStage", "safeToRetry"};
                arrayList = new ArrayList(9);
                while (iM23073 < 9) {
                    Object obj3 = objArr3[iM23073];
                    iM23073 = C8954.m23073(obj3, arrayList, obj3, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 3:
                String[] strArr = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedPatchIndex", "conflictingPatchIndex", "byteOffset", "endByteOffset", "totalBytes", "limit", "actual", "expectedHex", "actualHex"};
                arrayList2 = new ArrayList(16);
                while (iM23073 < 16) {
                    String str2 = strArr[iM23073];
                    C11003.requireNonNull(str2);
                    arrayList2.add(str2);
                    iM23073++;
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList2);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 4:
                String[] strArr2 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "failedEditIndex", "conflictingEditIndex", "limit", "actual"};
                arrayList2 = new ArrayList(11);
                while (iM23073 < 11) {
                    String str3 = strArr2[iM23073];
                    C11003.requireNonNull(str3);
                    arrayList2.add(str3);
                    iM23073++;
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList2);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 5:
                Object[] objArr4 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList = new ArrayList(9);
                while (iM23073 < 9) {
                    Object obj4 = objArr4[iM23073];
                    iM23073 = C8954.m23073(obj4, arrayList, obj4, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 6:
                Object[] objArr5 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "expectedReplacements", "actualReplacements", "limit", "actual"};
                arrayList = new ArrayList(10);
                while (iM23073 < 10) {
                    Object obj5 = objArr5[iM23073];
                    iM23073 = C8954.m23073(obj5, arrayList, obj5, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 7:
                Object[] objArr6 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(5);
                while (iM23073 < 5) {
                    Object obj6 = objArr6[iM23073];
                    iM23073 = C8954.m23073(obj6, arrayList, obj6, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 9:
                Object[] objArr7 = {"targetPath", "changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(5);
                while (iM23073 < 5) {
                    Object obj7 = objArr7[iM23073];
                    iM23073 = C8954.m23073(obj7, arrayList, obj7, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 11:
                Object[] objArr8 = {"expectedTargetVersion", "actualTargetVersion", "finalLine", "finalColumn"};
                arrayList = new ArrayList(4);
                while (iM23073 < 4) {
                    Object obj8 = objArr8[iM23073];
                    iM23073 = C8954.m23073(obj8, arrayList, obj8, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 12:
            case 13:
            case 15:
                Object[] objArr9 = {"changed", "operationMode", "stateKnown", "warnings", "expectedTargetVersion", "actualTargetVersion", "limit", "actual"};
                arrayList = new ArrayList(8);
                while (iM23073 < 8) {
                    Object obj9 = objArr9[iM23073];
                    iM23073 = C8954.m23073(obj9, arrayList, obj9, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 14:
                Object[] objArr10 = {"expectedTargetVersion", "actualTargetVersion", "byteOffset", "totalBytes"};
                arrayList = new ArrayList(4);
                while (iM23073 < 4) {
                    Object obj10 = objArr10[iM23073];
                    iM23073 = C8954.m23073(obj10, arrayList, obj10, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            case 17:
                Object[] objArr11 = {"changed", "operationMode", "stateKnown", "warnings"};
                arrayList = new ArrayList(4);
                while (iM23073 < 4) {
                    Object obj11 = objArr11[iM23073];
                    iM23073 = C8954.m23073(obj11, arrayList, obj11, iM23073, 1);
                }
                listUnmodifiableList = C20195.unmodifiableList(arrayList);
                arrayList4.addAll(listUnmodifiableList);
                return arrayList4;
            default:
                throw new IllegalArgumentException("Unknown file tool: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m10353(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m10360(String str) {
        byte[] bArr = new byte[str.length() + 1];
        System.arraycopy(str.getBytes(C8208.f25221), 0, bArr, 0, str.length());
        return bArr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m10361(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }
}
