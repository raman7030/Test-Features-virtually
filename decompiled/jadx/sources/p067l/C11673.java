package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۢ᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11673 {

    /* JADX INFO: renamed from: ֫ */
    public final C8695 f32567;

    /* JADX INFO: renamed from: ۧ */
    public final C14553 f32568;

    /* JADX INFO: renamed from: ܽ */
    public final C19247 f32569;

    public C11673(C19247 c19247, C14553 c14553) {
        this.f32569 = c19247;
        this.f32568 = c14553;
        this.f32567 = new C8695(c19247);
    }

    /* JADX INFO: renamed from: ֫ */
    public final JSONObject m26839(JSONObject jSONObject) throws C5276 {
        C7649.m17631(jSONObject, MotionUtils.EASING_TYPE_PATH, "entries", "password", "overwrite");
        String strM17634 = C7649.m17634(jSONObject, "password");
        boolean zM17633 = C7649.m17633(jSONObject, "overwrite");
        C19247 c19247 = this.f32569;
        C9385 c9385M43852 = c19247.m43852();
        String strM43844 = C19247.m43844(C7649.m17634(jSONObject, MotionUtils.EASING_TYPE_PATH), c9385M43852, MotionUtils.EASING_TYPE_PATH);
        C25083 c25083 = new C25083(strM43844);
        try {
            try {
                ArrayList arrayListM26829 = m26829(C7649.m17625(jSONObject, "entries"), c9385M43852);
                ArrayList arrayList = new ArrayList();
                arrayList.add(strM43844);
                Iterator it = arrayListM26829.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C19719) it.next()).f59991);
                }
                C11872 c11872M43854 = c19247.m43854(arrayList);
                try {
                    c19247.m43852().m21856(strM43844);
                    C7649.m17629(c19247, strM43844, false);
                    C19561 c19561M44426 = C19561.m44426(c19247.m43857(strM43844), false);
                    try {
                        c19561M44426.m44451(strM17634);
                        C16365 c16365M26832 = m26832(c19561M44426, arrayListM26829, strM43844, strM17634, c25083);
                        m26835(c16365M26832, strM43844, zM17633, c25083);
                        m26836(c19561M44426, c16365M26832, strM43844, zM17633, c25083);
                        c19561M44426.close();
                        c11872M43854.close();
                        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM43844).add("completedFiles", c25083.f80019).add("createdDirectories", c25083.f80020).add("warnings", c25083.f80021);
                    } catch (Throwable th) {
                        try {
                            c19561M44426.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c11872M43854.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                C5276 c5276M11411 = C5276.m11411("ZIP_IO_ERROR", "The storage backend failed during ZIP extraction", "fatal", null, JSON.object());
                if (c25083.f80024) {
                    c5276M11411.f12412.put("changed", true).put("stateKnown", false);
                }
                c25083.m55065(c5276M11411);
                throw c5276M11411;
            }
        } catch (IOException e) {
            C5276 c5276M26838 = m26838(e);
            c25083.m55065(c5276M26838);
            throw c5276M26838;
        } catch (C5276 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f12413)) {
                e = C5276.m11407("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", "warning", e.f12407, e.f12412);
            }
            c25083.m55065(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m26829(JSONArray jSONArray, C9385 c9385) throws C5276 {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String strM17634 = null;
            try {
                JSONObject jSONObjectM17626 = C7649.m17626("entries", jSONArray.get(i));
                C7649.m17631(jSONObjectM17626, "entryPath", "destinationPath");
                String strM17635 = C7649.m17634(jSONObjectM17626, "entryPath");
                try {
                    strM17634 = C7649.m17634(jSONObjectM17626, "destinationPath");
                    boolean z = true;
                    C7649.m17632(strM17635, "entryPath", true);
                    if (!strM17635.isEmpty() && !strM17635.endsWith("/")) {
                        z = false;
                    }
                    if (z != strM17634.endsWith("/")) {
                        throw C7649.m17627(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "Directory mappings require trailing slashes on both paths");
                    }
                    String strM31903 = C14059.m31903(c9385, strM17634, "destinationPath", false);
                    c9385.m21857(strM31903);
                    if (!z) {
                        c9385.m21855(strM31903);
                    }
                    arrayList.add(new C19719(strM17635, i, strM31903, z));
                } catch (C5276 e) {
                    e = e;
                    str = strM17634;
                    strM17634 = strM17635;
                    JSONArray jSONArrayArray = JSON.array(i);
                    JSONObject jSONObject = e.f12412;
                    jSONObject.put("operationIndexes", jSONArrayArray);
                    if (strM17634 != null) {
                        jSONObject.put("entryPaths", JSON.array(strM17634));
                    }
                    if (str != null) {
                        jSONObject.put("destinationPath", str);
                    }
                    throw e;
                }
            } catch (C5276 e2) {
                e = e2;
                str = null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16365 m26832(C19561 c19561, ArrayList arrayList, String str, String str2, C25083 c25083) throws C5276 {
        C24925 c24925;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        C24925 c24926 = new C24925(c19561.m44469());
        ArrayList<C5738> arrayList3 = new ArrayList(c19561.m44469());
        C8150.sort(arrayList3, C10162.comparing(new C8678(2)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C19719 c19719 = (C19719) it3.next();
            C7649.m17630();
            c25083.f80022 = new C19048(null, c19719.f59993, c19719.f59991, c19719.f59992, c19719.f59994);
            C5738 entry = c19561.getEntry(c19719.f59993);
            if (!c19719.f59992) {
                c24925 = c24926;
                arrayList2 = arrayList3;
                it = it3;
                if (entry == null) {
                    throw C7649.m17627(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist");
                }
                m26834(entry);
                if (entry.m12789() && str2.isEmpty()) {
                    throw C7649.m17627(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                }
                C19048 c19048 = new C19048(entry, entry.getName(), c19719.f59991, false, c19719.f59994);
                c25083.f80022 = c19048;
                m26833(linkedHashMap, c19048, str);
            } else {
                if (!c19719.f59993.isEmpty() && entry == null && c24926.m7176(c19719.f59993) == null) {
                    throw C7649.m17627(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist");
                }
                if (entry != null) {
                    m26834(entry);
                }
                m26833(linkedHashMap, c25083.f80022, str);
                for (C5738 c5738 : arrayList3) {
                    if (c5738.getName().startsWith(c19719.f59993) && !c5738.getName().equals(c19719.f59993)) {
                        C24925 c24927 = c24926;
                        c25083.f80022 = new C19048(c5738, c5738.getName(), c19719.f59991, c5738.isDirectory(), c19719.f59994);
                        m26834(c5738);
                        String strSubstring = c5738.getName().substring(c19719.f59993.length());
                        boolean zIsDirectory = c5738.isDirectory();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = arrayList3;
                            if (i > strSubstring.length()) {
                                Iterator it4 = it3;
                                try {
                                    String strM42103 = C18524.m42103(strSubstring, zIsDirectory);
                                    if (zIsDirectory && !strM42103.isEmpty()) {
                                        strM42103 = strM42103 + "/";
                                    }
                                    if (!c5738.isDirectory() || !strM42103.isEmpty()) {
                                        String str3 = c19719.f59991;
                                        C19048 c19049 = new C19048(c5738, c5738.getName(), C14059.m31907("/".equals(str3) ? C17588.m40053(str3, strM42103) : C24104.m53357(str3, "/", strM42103), "destinationPath"), c5738.isDirectory(), c19719.f59994);
                                        c25083.f80022 = c19049;
                                        if (c5738.m12789() && str2.isEmpty()) {
                                            throw C7649.m17627(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                                        }
                                        m26833(linkedHashMap, c19049, str);
                                    }
                                    it3 = it4;
                                    arrayList3 = arrayList4;
                                    c24926 = c24927;
                                    break;
                                } catch (IOException unused) {
                                    throw C7649.m17627(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The ZIP entry has an unsafe extraction path");
                                }
                            }
                            if (i < strSubstring.length()) {
                                it2 = it3;
                                if (strSubstring.charAt(i) == '/' || strSubstring.charAt(i) == '\\') {
                                }
                                i++;
                                it3 = it2;
                                arrayList3 = arrayList4;
                            } else {
                                it2 = it3;
                            }
                            if (i - i2 == 2 && strSubstring.charAt(i2) == '.' && strSubstring.charAt(i2 + 1) == '.') {
                                throw C7649.m17627(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The extraction path contains a parent directory segment");
                            }
                            i2 = i + 1;
                            i++;
                            it3 = it2;
                            arrayList3 = arrayList4;
                        }
                    }
                }
                c24925 = c24926;
                arrayList2 = arrayList3;
                it = it3;
            }
            it3 = it;
            arrayList3 = arrayList2;
            c24926 = c24925;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (C19048 c190410 : linkedHashMap.values()) {
            c25083.f80022 = c190410;
            if (c190410.f56836) {
                linkedHashMap2.put(m26828(c190410.f56835), c190410);
            } else {
                arrayList5.add(c190410);
            }
            for (String strM26837 = m26837(c190410.f56835); strM26837 != null; strM26837 = m26837(strM26837)) {
                C19048 c190411 = (C19048) linkedHashMap.get(m26828(strM26837));
                if (c190411 != null && !c190411.f56836) {
                    throw m26831(c190411, c190410, strM26837);
                }
            }
            if (!c190410.f56836) {
                String strM26838 = m26837(c190410.f56835);
                if (strM26838 == null) {
                    throw C7649.m17627(JSON.object(), "FILE_PARENT_NOT_FOUND", "The output has no parent directory");
                }
                C15525.putIfAbsent(linkedHashMap2, m26828(strM26838), new C19048(null, c190410.f56839, strM26838, true, c190410.f56838));
            }
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.values());
        C8150.sort(arrayList6, C10162.comparingInt(new C4296()));
        return new C16365(arrayList6, arrayList5);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26835(C16365 c16365, String str, boolean z, C25083 c25083) throws C5276 {
        C19247 c19247 = this.f32569;
        C9385 c9385M43852 = c19247.m43852();
        c9385M43852.m21856(str);
        for (C19048 c19048 : (ArrayList) c16365.f48090) {
            C7649.m17630();
            c25083.f80022 = c19048;
            c9385M43852.m21857(c19048.f56835);
            this.f32567.m20142(c19048.f56835);
        }
        for (C19048 c19049 : (ArrayList) c16365.f48091) {
            C7649.m17630();
            c25083.f80022 = c19049;
            c9385M43852.m21857(c19049.f56835);
            c9385M43852.m21855(c19049.f56835);
            int i = C18377.f54883[c19247.m43858(c19049.f56835).m32962().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw C7649.m17627(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "A directory cannot be used as an extracted file destination");
                    }
                    throw C5276.m11411("FILE_UNSUPPORTED_TYPE", "Extraction destinations must be regular files or missing paths", "fatal", null, JSON.object());
                }
            } else if (!z) {
                throw C7649.m17627(JSON.object(), "FILE_ALREADY_EXISTS", "An extraction destination exists and overwrite is false");
            }
            if (c19247.m43857(c19049.f56835).mo25509().mo10729(EnumC15032.CREATE_FILE_EXCLUSIVE) == EnumC6986.UNSUPPORTED) {
                throw C5276.m11411("FILE_BACKEND_UNSUPPORTED", "The destination backend cannot safely create temporary extraction files", "fatal", null, JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m26836(C19561 c19561, C16365 c16365, String str, boolean z, C25083 c25083) throws C5276 {
        C19247 c19247;
        Iterator it = ((ArrayList) c16365.f48090).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c19247 = this.f32569;
            if (!zHasNext) {
                break;
            }
            C19048 c19048 = (C19048) it.next();
            c25083.f80022 = c19048;
            C7649.m17630();
            c19247.m43852().m21856(str);
            c25083.f80024 = true;
            C24788 c24788M20141 = this.f32567.m20141(c19048.f56835);
            c25083.f80024 = false;
            c25083.f80020 += c24788M20141.f79222;
            c25083.m55064(c24788M20141.f79224);
        }
        for (C19048 c19049 : (ArrayList) c16365.f48091) {
            c25083.f80022 = c19049;
            C7649.m17630();
            C9385 c9385M43852 = c19247.m43852();
            c9385M43852.m21856(str);
            c25083.f80024 = true;
            C2482 c2482M33273 = this.f32568.m33273(c19049.f56835, z, c9385M43852, new C13014(c19561, c19049, str));
            c25083.f80024 = false;
            c25083.f80019++;
            c25083.m55064(c2482M33273.f3899);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static InputStream m26827(C5738 c5738, C19561 c19561) throws C5276 {
        try {
            return new C22402(c19561.m44461(c5738));
        } catch (IOException e) {
            throw m26838(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26834(C5738 c5738) throws C5276 {
        if ((c5738.m12759() & 61440) == 40960) {
            throw C5276.m11411("ZIP_UNSUPPORTED_ENTRY", "Symbolic link entries cannot be extracted by this tool", "fatal", null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26833(LinkedHashMap linkedHashMap, C19048 c19048, String str) throws C5276 {
        if (C18524.m42121(str, c19048.f56835)) {
            throw C7649.m17627(JSON.object(), "ZIP_SOURCE_DESTINATION_CONFLICT", "Extraction cannot replace its source ZIP");
        }
        C19048 c19049 = (C19048) C15525.putIfAbsent(linkedHashMap, m26828(c19048.f56835), c19048);
        if (c19049 != null) {
            throw m26831(c19049, c19048, c19048.f56835);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m26831(C19048 c19048, C19048 c19049, String str) {
        JSONArray jSONArrayArray = JSON.array(c19048.f56838);
        if (c19049.f56838 != c19048.f56838) {
            jSONArrayArray.add(c19049.f56838);
        }
        JSONArray jSONArrayArray2 = JSON.array(c19048.f56839);
        if (!c19049.f56839.equals(c19048.f56839)) {
            jSONArrayArray2.add(c19049.f56839);
        }
        return C7649.m17627(JSON.object().add("entryPaths", jSONArrayArray2).add("operationIndexes", jSONArrayArray).add("destinationPath", str), "ZIP_DESTINATION_CONFLICT", "Multiple ZIP entries require the same destination or a file as a parent directory");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26828(String str) {
        String strM42102 = C18524.m42102(str);
        if (strM42102 == null) {
            return str;
        }
        return "shared-storage:" + strM42102.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26837(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m26838(IOException iOException) {
        if ((iOException instanceof InterruptedIOException) || Thread.currentThread().isInterrupted()) {
            return C7649.m17627(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
        if (iOException instanceof C6150) {
            return C7649.m17627(JSON.object(), "ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry");
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented")) {
            return C5276.m11411("ZIP_UNSUPPORTED", "The ZIP uses an unsupported archive, compression, or encryption feature", "fatal", null, JSON.object());
        }
        return C7649.m17627(JSON.object(), "ZIP_READ_FAILED", "The ZIP file or entry could not be read and verified");
    }
}
