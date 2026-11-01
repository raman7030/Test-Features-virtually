package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
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
public final class C15694 {

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC3693 f45483 = new C14354();

    /* JADX INFO: renamed from: ֫ */
    public final C14553 f45484;

    /* JADX INFO: renamed from: ۧ */
    public final C19247 f45485;

    public C15694(C19247 c19247, C14553 c14553) {
        this.f45485 = c19247;
        this.f45484 = c14553;
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m35754(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, "outputPath", "sources", "overwrite", "level", "password");
        String strM17634 = C7649.m17634(jSONObject, "outputPath");
        boolean zM17633 = C7649.m17633(jSONObject, "overwrite");
        int iM17624 = C7649.m17624(jSONObject, "level", 0, 9);
        int i = iM17624 == 0 ? 0 : 8;
        String strM17635 = C7649.m17634(jSONObject, "password");
        C19247 c19247 = this.f45485;
        C9385 c9385M43852 = c19247.m43852();
        String strM43850 = C19247.m43850(strM17634, c9385M43852, "outputPath");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM17625 = C7649.m17625(jSONObject, "sources");
        for (int i2 = 0; i2 < jSONArrayM17625.size(); i2++) {
            try {
                JSONObject jSONObjectM17626 = C7649.m17626("sources", jSONArrayM17625.get(i2));
                C7649.m17631(jSONObjectM17626, "sourcePath", "entryPath");
                arrayList.add(m35752(jSONObjectM17626, c9385M43852));
            } catch (C5276 e) {
                e.f12412.put(MotionUtils.EASING_TYPE_PATH, strM43850).put("operationIndexes", JSON.array(i2));
                throw e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(strM43850);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C13684) it.next()).f38594);
        }
        try {
            C11872 c11872M43854 = c19247.m43854(arrayList2);
            try {
                ArrayList arrayList3 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    arrayList3.add(C23072.m51466(m35748((C13684) arrayList.get(i3), strM43850, c9385M43852, i3), false));
                }
                JSONObject jSONObjectM35747 = m35747(strM43850, zM17633, c9385M43852, m35751(Collections.EMPTY_LIST, arrayList3), null, strM17635, i, iM17624);
                c11872M43854.close();
                return jSONObjectM35747;
            } catch (Throwable th) {
                try {
                    c11872M43854.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (C5276 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f12413)) {
                e = C7649.m17627(e.f12412, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
            }
            e.f12412.put(MotionUtils.EASING_TYPE_PATH, strM43850);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final JSONObject m35755(JSONObject jSONObject) throws Throwable {
        String str;
        String str2;
        Throwable th;
        String str3 = "overwrite";
        String str4 = "entryPath";
        String str5 = MotionUtils.EASING_TYPE_PATH;
        String str6 = "operations";
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "operations", "password");
        String strM17634 = C7649.m17634(jSONObject, "password");
        C19247 c19247 = this.f45485;
        C9385 c9385M43852 = c19247.m43852();
        String strM43850 = C19247.m43850(C7649.m17634(jSONObject, MotionUtils.EASING_TYPE_PATH), c9385M43852, MotionUtils.EASING_TYPE_PATH);
        c9385M43852.m21856(strM43850);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strM43850);
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayM17625 = C7649.m17625(jSONObject, "operations");
        int i = 0;
        while (true) {
            String str7 = strM17634;
            C19247 c19248 = c19247;
            if (i < jSONArrayM17625.size()) {
                try {
                    JSONObject jSONObjectM17626 = C7649.m17626(str6, jSONArrayM17625.get(i));
                    JSONArray jSONArray = jSONArrayM17625;
                    String strM17635 = C7649.m17634(jSONObjectM17626, "type");
                    String str8 = str6;
                    String strM17636 = C7649.m17634(jSONObjectM17626, str4);
                    str = str5;
                    try {
                        C7649.m17632(strM17636, str4, strM17635.equals("add"));
                        if (strM17635.equals("add")) {
                            C7649.m17631(jSONObjectM17626, "type", "sourcePath", str4, str3);
                            C13684 c13684M35752 = m35752(jSONObjectM17626, c9385M43852);
                            arrayList2.add(new C12343(strM17635, strM17636, "", C7649.m17633(jSONObjectM17626, str3), c13684M35752));
                            arrayList.add(c13684M35752.f38594);
                        } else {
                            if (strM17635.equals("delete")) {
                                boolean zEndsWith = strM17636.endsWith("/");
                                C7649.m17631(jSONObjectM17626, zEndsWith ? new String[]{"type", str4, "recursive"} : new String[]{"type", str4});
                                arrayList2.add(new C12343(strM17635, strM17636, "", zEndsWith && C7649.m17633(jSONObjectM17626, "recursive"), null));
                            } else {
                                if (!strM17635.equals("rename")) {
                                    throw C7649.m17628(JSON.value(strM17635), "type", "Expected add, delete, or rename");
                                }
                                boolean zEndsWith2 = strM17636.endsWith("/");
                                C7649.m17631(jSONObjectM17626, zEndsWith2 ? new String[]{"type", str4, "newEntryPath", "mergeDirectories"} : new String[]{"type", str4, "newEntryPath"});
                                String strM17637 = C7649.m17634(jSONObjectM17626, "newEntryPath");
                                C7649.m17632(strM17637, "newEntryPath", false);
                                if (zEndsWith2 != strM17637.endsWith("/")) {
                                    throw C7649.m17628(JSON.value(strM17637), "newEntryPath", "Renaming must preserve the entry type");
                                }
                                arrayList2.add(new C12343(strM17635, strM17636, strM17637, zEndsWith2 && C7649.m17633(jSONObjectM17626, "mergeDirectories"), null));
                            }
                            i++;
                            jSONArrayM17625 = jSONArray;
                            strM17634 = str7;
                            c19247 = c19248;
                            str6 = str8;
                            str5 = str;
                            str3 = str3;
                            str4 = str4;
                        }
                        i++;
                        jSONArrayM17625 = jSONArray;
                        strM17634 = str7;
                        c19247 = c19248;
                        str6 = str8;
                        str5 = str;
                        str3 = str3;
                        str4 = str4;
                    } catch (C5276 e) {
                        e = e;
                        e.f12412.put(str, strM43850).put("operationIndexes", JSON.array(i));
                        throw e;
                    }
                } catch (C5276 e2) {
                    e = e2;
                    str = str5;
                }
            } else {
                try {
                    C11872 c11872M43854 = c19248.m43854(arrayList);
                    int i2 = 0;
                    try {
                        try {
                            try {
                                C7649.m17629(c19248, strM43850, false);
                                C19561 c19561M44426 = C19561.m44426(c19248.m43857(strM43850), false);
                                try {
                                    ArrayList arrayList3 = new ArrayList();
                                    while (i2 < arrayList2.size()) {
                                        C12343 c12343 = (C12343) arrayList2.get(i2);
                                        String str9 = c12343.f34444;
                                        String str10 = c12343.f34441;
                                        boolean z = c12343.f34445;
                                        ArrayList arrayList4 = arrayList2;
                                        int iHashCode = str9.hashCode();
                                        str = str5;
                                        if (iHashCode != -1335458389) {
                                            if (iHashCode != -934594754) {
                                                if (iHashCode == 96417) {
                                                    try {
                                                        if (str9.equals("add")) {
                                                            arrayList3.add(C23072.m51466(m35748(c12343.f34442, strM43850, c9385M43852, i2), z));
                                                            i2++;
                                                            arrayList2 = arrayList4;
                                                            str5 = str;
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        Throwable th3 = th;
                                                        try {
                                                            c19561M44426.close();
                                                            throw th3;
                                                        } catch (Throwable th4) {
                                                            th3.addSuppressed(th4);
                                                            throw th3;
                                                        }
                                                    }
                                                }
                                                throw new AssertionError(c12343.f34444);
                                            }
                                            if (!str9.equals("rename")) {
                                                throw new AssertionError(c12343.f34444);
                                            }
                                            arrayList3.add(C23072.m51464(str10, c12343.f34443, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        } else {
                                            if (!str9.equals("delete")) {
                                                throw new AssertionError(c12343.f34444);
                                            }
                                            arrayList3.add(C23072.m51465(str10, z));
                                            i2++;
                                            arrayList2 = arrayList4;
                                            str5 = str;
                                        }
                                    }
                                    JSONObject jSONObjectM35747 = m35747(strM43850, true, c9385M43852, m35751(c19561M44426.m44469(), arrayList3), c19561M44426, str7, 8, -1);
                                    c19561M44426.close();
                                    c11872M43854.close();
                                    return jSONObjectM35747;
                                } catch (Throwable th5) {
                                    th = th5;
                                    str = str5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                try {
                                    c11872M43854.close();
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
                            c11872M43854.close();
                            throw th;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        str2 = str;
                        throw C5276.m11411("ZIP_IO_ERROR", C7241.m16586(e, new StringBuilder("ZIP I/O failed: ")), "fatal", null, JSON.object().add(str2, strM43850));
                    } catch (C5276 e4) {
                        e = e4;
                        if ("FILE_OPERATION_INTERRUPTED".equals(e.f12413)) {
                            e = C7649.m17627(e.f12412, "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
                        }
                        e.f12412.put(str, strM43850);
                        throw e;
                    }
                } catch (IOException e5) {
                    e = e5;
                    str2 = str5;
                } catch (C5276 e6) {
                    e = e6;
                    str = str5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private JSONObject m35747(String str, boolean z, C9385 c9385, C6978 c6978, C19561 c19561, String str2, int i, int i2) throws C5276 {
        if (c19561 != null && !c6978.f18154) {
            C7649.m17630();
            C19247 c19247 = this.f45485;
            C9385 c9385M43852 = c19247.m43852();
            c9385M43852.m21856(str);
            c9385M43852.m21857(str);
            c9385M43852.m21855(str);
            return JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("size", C7649.m17629(c19247, str, false).m32961()).add("changed", false).add("warnings", JSON.array());
        }
        C2482 c2482M33273 = this.f45484.m33273(str, z, c9385, new C5637(this, c19561, c6978, i, i2, str2, str));
        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, c2482M33273.f3897).add("size", c2482M33273.f3900).add("changed", c2482M33273.f3896).add("warnings", c2482M33273.f3899);
    }

    /* JADX INFO: renamed from: ֫ */
    private C13684 m35752(JSONObject jSONObject, C9385 c9385) throws C5276 {
        String strM17634 = C7649.m17634(jSONObject, "sourcePath");
        String strM17635 = C7649.m17634(jSONObject, "entryPath");
        boolean z = true;
        C7649.m17632(strM17635, "entryPath", true);
        boolean zEndsWith = strM17634.endsWith("/");
        if (!strM17635.isEmpty() && !strM17635.endsWith("/")) {
            z = false;
        }
        if (zEndsWith != z) {
            throw C7649.m17628(JSON.value(strM17635), "entryPath", "Source and ZIP destination must declare the same file or directory type");
        }
        return new C13684(C19247.m43844(strM17634, c9385, "sourcePath"), strM17635, zEndsWith);
    }

    /* JADX INFO: renamed from: ֫ */
    private LinkedHashMap m35748(C13684 c13684, String str, C9385 c9385, int i) throws C5276 {
        C13684 c13685;
        C19247 c19247;
        C19247 c19248 = this.f45485;
        try {
            if (C18524.m42121(c13684.f38594, str) || (c13684.f38592 && C14059.m31906(str, c13684.f38594))) {
                throw C7649.m17627(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(c13684);
            while (!arrayDeque.isEmpty()) {
                C7649.m17630();
                c13685 = (C13684) arrayDeque.removeFirst();
                try {
                    String str2 = c13685.f38594;
                    boolean z = c13685.f38592;
                    String str3 = c13685.f38593;
                    c9385.m21856(str2);
                    C14362 c14362M17629 = C7649.m17629(c19248, str2, z);
                    AbstractC17043 abstractC17043M43857 = c19248.m43857(str2);
                    if (z) {
                        c19247 = c19248;
                        try {
                            List<C14362> listMo10728 = abstractC17043M43857.mo25509().mo10728(c14362M17629);
                            if (!listMo10728.isEmpty() || str3.isEmpty()) {
                                c13684 = c13685;
                            } else {
                                c13684 = c13685;
                                try {
                                    linkedHashMap.put(str3, new C8319(abstractC17043M43857, true, c14362M17629.m32960()));
                                } catch (C5276 e) {
                                    e = e;
                                    c13685 = c13684;
                                    e.f12412.put("sourcePath", c13685.f38594).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c13685.f38593));
                                    throw e;
                                }
                            }
                            for (C14362 c14362 : listMo10728) {
                                AbstractC17043 abstractC17043M32959 = c14362.m32959();
                                boolean z2 = c14362.m32962() == EnumC5645.DIRECTORY;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                sb.append(abstractC17043M32959.getName());
                                sb.append(z2 ? "/" : "");
                                String string = sb.toString();
                                C7649.m17632(string, "entryPath", false);
                                arrayDeque.addLast(new C13684(abstractC17043M32959.mo25505(), string, z2));
                            }
                        } catch (C23750 e2) {
                            c13684 = c13685;
                            throw C19247.m43849(e2);
                        }
                    } else {
                        try {
                            if (C18524.m42121(str2, str)) {
                                throw C7649.m17627(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str), "ZIP_SOURCE_IS_OUTPUT", "The ZIP output cannot be included in its own sources");
                            }
                            linkedHashMap.put(str3, new C8319(abstractC17043M43857, false, c14362M17629.m32960()));
                            c13684 = c13685;
                            c19247 = c19248;
                        } catch (C5276 e3) {
                            e = e3;
                            e.f12412.put("sourcePath", c13685.f38594).put("operationIndexes", JSON.array(i)).put("entryPaths", JSON.array(c13685.f38593));
                            throw e;
                        }
                    }
                    c19248 = c19247;
                } catch (C5276 e4) {
                    e = e4;
                    c13684 = c13685;
                }
            }
            return linkedHashMap;
        } catch (C5276 e5) {
            e = e5;
            c13685 = c13684;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6978 m35751(Collection collection, ArrayList arrayList) throws C5276 {
        try {
            return C6978.m15999(collection, arrayList);
        } catch (C23742 e) {
            JSONArray jSONArrayArray = JSON.array();
            Iterator it = e.f75538.iterator();
            while (it.hasNext()) {
                jSONArrayArray.add(((Integer) it.next()).intValue());
            }
            JSONArray jSONArrayArray2 = JSON.array();
            Iterator it2 = e.f75540.iterator();
            while (it2.hasNext()) {
                jSONArrayArray2.add((String) it2.next());
            }
            throw C7649.m17627(JSON.object().add("operationIndexes", jSONArrayArray).add("entryPaths", jSONArrayArray2), e.f75539, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m35750(int i, IOException iOException, String str) {
        return C5276.m11411("ZIP_SOURCE_READ_FAILED", C7241.m16586(iOException, new StringBuilder("Failed to read ZIP source content: ")), "fatal", null, JSON.object().add("operationIndexes", JSON.array(i)).add("entryPaths", JSON.array(str)));
    }
}
