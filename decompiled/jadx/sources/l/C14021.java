package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܰ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14021 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1393 f42400 = new C12611();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12821 f42401;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f42402;

    public C14021(C17760 c17760, C12821 c12821) {
        this.f42402 = c17760;
        this.f42401 = c12821;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m33634(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, "outputPath", "sources", "overwrite", "level", "password");
        String strM15720 = C5556.m15720(jSONObject, "outputPath");
        boolean zM15719 = C5556.m15719(jSONObject, "overwrite");
        int iM15710 = C5556.m15710(jSONObject, "level", 0, 9);
        int i = iM15710 == 0 ? 0 : 8;
        String strM15721 = C5556.m15720(jSONObject, "password");
        C17760 c17760 = this.f42402;
        C7383 c7383M41607 = c17760.m41607();
        String strM41605 = C17760.m41605(strM15720, c7383M41607, "outputPath");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM15711 = C5556.m15711(jSONObject, "sources");
        for (int i2 = 0; i2 < jSONArrayM15711.size(); i2++) {
            try {
                JSONObject jSONObjectM15712 = C5556.m15712("sources", jSONArrayM15711.get(i2));
                C5556.m15717(jSONObjectM15712, "sourcePath", "entryPath");
                arrayList.add(m33632(jSONObjectM15712, c7383M41607));
            } catch (C3059 e) {
                e.f9609.put(MotionUtils.EASING_TYPE_PATH, strM41605).put("operationIndexes", JSON.array(i2));
                throw e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(strM41605);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C11906) it.next()).f35584);
        }
        try {
            C10000 c10000M41609 = c17760.m41609(arrayList2);
            try {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList3.add(C21784.m49116(m33628((C11906) arrayList.get(i3), strM41605, c7383M41607, i3), false));
                }
                JSONObject jSONObjectM33627 = m33627(strM41605, zM15719, c7383M41607, m33631(Collections.EMPTY_LIST, arrayList3), null, strM15721, i, iM15710);
                c10000M41609.close();
                return jSONObjectM33627;
            } catch (Throwable th) {
                try {
                    c10000M41609.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (C3059 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = C5556.m15713(e.f9609, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
            }
            e.f9609.put(MotionUtils.EASING_TYPE_PATH, strM41605);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m33635(JSONObject jSONObject) throws Throwable {
        String str;
        String str2;
        Throwable th;
        String str3 = "overwrite";
        String str4 = "entryPath";
        String str5 = MotionUtils.EASING_TYPE_PATH;
        String str6 = "operations";
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "operations", "password");
        String strM15720 = C5556.m15720(jSONObject, "password");
        C17760 c17760 = this.f42402;
        C7383 c7383M41607 = c17760.m41607();
        String strM41605 = C17760.m41605(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), c7383M41607, MotionUtils.EASING_TYPE_PATH);
        c7383M41607.m19883(strM41605);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM41605);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayM15711 = C5556.m15711(jSONObject, "operations");
        int i = 0;
        while (true) {
            String str7 = strM15720;
            C17760 c17761 = c17760;
            if (i < jSONArrayM15711.size()) {
                try {
                    JSONObject jSONObjectM15712 = C5556.m15712(str6, jSONArrayM15711.get(i));
                    JSONArray jSONArray = jSONArrayM15711;
                    String strM15721 = C5556.m15720(jSONObjectM15712, "type");
                    String str8 = str6;
                    String strM15722 = C5556.m15720(jSONObjectM15712, str4);
                    str = str5;
                    try {
                        C5556.m15718(strM15722, str4, strM15721.equals("add"));
                        if (strM15721.equals("add")) {
                            C5556.m15717(jSONObjectM15712, "type", "sourcePath", str4, str3);
                            C11906 c11906M33632 = m33632(jSONObjectM15712, c7383M41607);
                            arrayList2.add(new C10495(strM15721, strM15722, "", C5556.m15719(jSONObjectM15712, str3), c11906M33632));
                            arrayList.add(c11906M33632.f35584);
                        } else {
                            if (strM15721.equals("delete")) {
                                boolean zEndsWith = strM15722.endsWith("/");
                                C5556.m15717(jSONObjectM15712, zEndsWith ? new String[]{"type", str4, "recursive"} : new String[]{"type", str4});
                                arrayList2.add(new C10495(strM15721, strM15722, "", zEndsWith && C5556.m15719(jSONObjectM15712, "recursive"), null));
                            } else {
                                if (!strM15721.equals("rename")) {
                                    throw C5556.m15714(JSON.value(strM15721), "type", "Expected add, delete, or rename");
                                }
                                boolean zEndsWith2 = strM15722.endsWith("/");
                                C5556.m15717(jSONObjectM15712, zEndsWith2 ? new String[]{"type", str4, "newEntryPath", "mergeDirectories"} : new String[]{"type", str4, "newEntryPath"});
                                String strM15723 = C5556.m15720(jSONObjectM15712, "newEntryPath");
                                C5556.m15718(strM15723, "newEntryPath", false);
                                if (zEndsWith2 != strM15723.endsWith("/")) {
                                    throw C5556.m15714(JSON.value(strM15723), "newEntryPath", "Renaming must preserve the entry type");
                                }
                                arrayList2.add(new C10495(strM15721, strM15722, strM15723, zEndsWith2 && C5556.m15719(jSONObjectM15712, "mergeDirectories"), null));
                            }
                            i++;
                            jSONArrayM15711 = jSONArray;
                            strM15720 = str7;
                            c17760 = c17761;
                            str6 = str8;
                            str5 = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        i++;
                        jSONArrayM15711 = jSONArray;
                        strM15720 = str7;
                        c17760 = c17761;
                        str6 = str8;
                        str5 = str;
                        str3 = str3;
                        str4 = str4;
                    } catch (C3059 e) {
                        e = e;
                        e.f9609.put(str, strM41605).put("operationIndexes", JSON.array(i));
                        throw e;
                    }
                } catch (C3059 e2) {
                    e = e2;
                    str = str5;
                }
            } else {
                try {
                    C10000 c10000M41609 = c17761.m41609(arrayList);
                    int i2 = 0;
                    try {
                        try {
                            try {
                                C5556.m15715(c17761, strM41605, false);
                                C18090 c18090M42167 = C18090.m42167(c17761.m41612(strM41605), false);
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < arrayList2.size()) {
                                        C10495 c10495 = (C10495) arrayList2.get(i2);
                                        String str9 = c10495.f31481;
                                        String str10 = c10495.f31478;
                                        boolean z = c10495.f31482;
                                        ArrayList arrayList4 = arrayList2;
                                        int iHashCode = str9.hashCode();
                                        str = str5;
                                        if (iHashCode != -1335458389) {
                                            if (iHashCode != -934594754) {
                                                if (iHashCode == 96417) {
                                                    try {
                                                        if (str9.equals("add")) {
                                                            arrayList3.add(C21784.m49116(m33628(c10495.f31479, strM41605, c7383M41607, i2), z));
                                                            i2++;
                                                            arrayList2 = arrayList4;
                                                            str5 = str;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            c18090M42167.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            if (!str9.equals("rename")) {
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            arrayList3.add(C21784.m49114(str10, c10495.f31480, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        } else {
                                            if (!str9.equals("delete")) {
                                                throw new AssertionError(c10495.f31481);
                                            }
                                            arrayList3.add(C21784.m49115(str10, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        }
                                    }
                                    JSONObject jSONObjectM33627 = m33627(strM41605, true, c7383M41607, m33631(c18090M42167.m42210(), arrayList3), c18090M42167, str7, 8, -1);
                                    c18090M42167.close();
                                    c10000M41609.close();
                                    return jSONObjectM33627;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str = str5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    c10000M41609.close();
                                    throw th;
                                } catch (Throwable th7) {
                                    th.addSuppressed(th7);
                                    throw th;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            str = str5;
                            th = th;
                            c10000M41609.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = str;
                        throw C3059.m9369("ZIP_IO_ERROR", C5127.m14678(e, new StringBuilder("ZIP I/O failed: ")), "fatal", null, JSON.object().add(str2, strM41605));
                    } catch (C3059 e4) {
                        e = e4;
                        if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                            e = C5556.m15713(e.f9609, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
                        }
                        e.f9609.put(str, strM41605);
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    str2 = str5;
                } catch (C3059 e6) {
                    e = e6;
                    str = str5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private JSONObject m33627(String str, boolean z, C7383 c7383, C4850 c4850, C18090 c18090, String str2, int i, int i2) throws C3059 {
        if (c18090 != null && !c4850.f15322) {
            C5556.m15716();
            C17760 c17760 = this.f42402;
            C7383 c7383M41607 = c17760.m41607();
            c7383M41607.m19883(str);
            c7383M41607.m19884(str);
            c7383M41607.m19882(str);
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("size", C5556.m15715(c17760, str, false).m30884()).add("changed", false).add("warnings", JSON.array());
        }
        C0120 c0120M31187 = this.f42401.m31187(str, z, c7383, new C3439(this, c18090, c4850, i, i2, str2, str));
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, c0120M31187.f1121).add("size", c0120M31187.f1124).add("changed", c0120M31187.f1120).add("warnings", c0120M31187.f1123);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11906 m33632(JSONObject jSONObject, C7383 c7383) throws C3059 {
        String strM15720 = C5556.m15720(jSONObject, "sourcePath");
        String strM15721 = C5556.m15720(jSONObject, "entryPath");
        boolean z = true;
        C5556.m15718(strM15721, "entryPath", true);
        boolean zEndsWith = strM15720.endsWith("/");
        if (!strM15721.isEmpty() && !strM15721.endsWith("/")) {
            z = false;
        }
        if (zEndsWith != z) {
            throw C5556.m15714(JSON.value(strM15721), "entryPath", "Source and ZIP destination must declare the same file or directory type");
        }
        return new C11906(C17760.m41599(strM15720, c7383, "sourcePath"), strM15721, zEndsWith);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private LinkedHashMap m33628(C11906 c11906, String str, C7383 c7383, int i) throws C3059 {
        C11906 c11907;
        C17760 c17760;
        C17760 c17761 = this.f42402;
        try {
            if (C16999.m39878(c11906.f35584, str) || (c11906.f35582 && C12301.m29846(str, c11906.f35584))) {
                throw C5556.m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(c11906);
            while (!arrayDeque.isEmpty()) {
                C5556.m15716();
                c11907 = (C11906) arrayDeque.removeFirst();
                try {
                    String str2 = c11907.f35584;
                    boolean z = c11907.f35582;
                    String str3 = c11907.f35583;
                    c7383.m19883(str2);
                    C12619 c12619M15715 = C5556.m15715(c17761, str2, z);
                    AbstractC15440 abstractC15440M41612 = c17761.m41612(str2);
                    if (z) {
                        c17760 = c17761;
                        try {
                            List<C12619> listMo8668 = abstractC15440M41612.mo23558().mo8668(c12619M15715);
                            if (!listMo8668.isEmpty() || str3.isEmpty()) {
                                c11906 = c11907;
                            } else {
                                c11906 = c11907;
                                try {
                                    linkedHashMap.put(str3, new C6261(abstractC15440M41612, true, c12619M15715.m30883()));
                                } catch (C3059 e) {
                                    e = e;
                                    c11907 = c11906;
                                    e.f9609.put("sourcePath", c11907.f35584).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c11907.f35583));
                                    throw e;
                                }
                            }
                            for (C12619 c12619 : listMo8668) {
                                AbstractC15440 abstractC15440M30882 = c12619.m30882();
                                boolean z2 = c12619.m30885() == EnumC3447.DIRECTORY;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(abstractC15440M30882.getName());
                                sb.append(z2 ? "/" : "");
                                String string = sb.toString();
                                C5556.m15718(string, "entryPath", false);
                                arrayDeque.addLast(new C11906(abstractC15440M30882.mo23554(), string, z2));
                            }
                        } catch (C22497 e2) {
                            c11906 = c11907;
                            throw C17760.m41604(e2);
                        }
                    } else {
                        try {
                            if (C16999.m39878(str2, str)) {
                                throw C5556.m15713(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
                            }
                            linkedHashMap.put(str3, new C6261(abstractC15440M41612, false, c12619M15715.m30883()));
                            c11906 = c11907;
                            c17760 = c17761;
                        } catch (C3059 e3) {
                            e = e3;
                            e.f9609.put("sourcePath", c11907.f35584).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c11907.f35583));
                            throw e;
                        }
                    }
                    c17761 = c17760;
                } catch (C3059 e4) {
                    e = e4;
                    c11906 = c11907;
                }
            }
            return linkedHashMap;
        } catch (C3059 e5) {
            e = e5;
            c11907 = c11906;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4850 m33631(Collection collection, ArrayList arrayList) throws C3059 {
        try {
            return C4850.m14119(collection, arrayList);
        } catch (C22489 e) {
            JSONArray jSONArrayArray = JSON.array();
            Iterator it = e.f72812.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add(((Integer) it.next()).intValue());
            }
            JSONArray jSONArrayArray2 = JSON.array();
            Iterator it2 = e.f72814.iterator();
            while (it2.hasNext()) {
                jSONArrayArray2.add((String) it2.next());
            }
            throw C5556.m15713(JSON.object().add("operationIndexes", jSONArrayArray).add("entryPaths", jSONArrayArray2), e.f72813, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m33630(int i, IOException iOException, String str) {
        return C3059.m9369("ZIP_SOURCE_READ_FAILED", C5127.m14678(iOException, new StringBuilder("Failed to read ZIP source content: ")), "fatal", null, JSON.object().add("operationIndexes", JSON.array(i)).add("entryPaths", JSON.array(str)));
    }
}
