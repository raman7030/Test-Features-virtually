package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
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
public final class C9790 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6657 f29615;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12821 f29616;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f29617;

    public C9790(C17760 c17760, C12821 c12821) {
        this.f29617 = c17760;
        this.f29616 = c12821;
        this.f29615 = new C6657(c17760);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m24824(JSONObject jSONObject) throws C3059 {
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entries", "password", "overwrite");
        String strM15720 = C5556.m15720(jSONObject, "password");
        boolean zM15719 = C5556.m15719(jSONObject, "overwrite");
        C17760 c17760 = this.f29617;
        C7383 c7383M41607 = c17760.m41607();
        String strM41599 = C17760.m41599(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), c7383M41607, MotionUtils.EASING_TYPE_PATH);
        C23900 c23900 = new C23900(strM41599);
        try {
            try {
                ArrayList arrayListM24814 = m24814(C5556.m15711(jSONObject, "entries"), c7383M41607);
                ArrayList arrayList = new ArrayList();
                arrayList.add(strM41599);
                Iterator it = arrayListM24814.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C18256) it.next()).f56774);
                }
                C10000 c10000M41609 = c17760.m41609(arrayList);
                try {
                    c17760.m41607().m19883(strM41599);
                    C5556.m15715(c17760, strM41599, false);
                    C18090 c18090M42167 = C18090.m42167(c17760.m41612(strM41599), false);
                    try {
                        c18090M42167.m42192(strM15720);
                        C14727 c14727M24817 = m24817(c18090M42167, arrayListM24814, strM41599, strM15720, c23900);
                        m24820(c14727M24817, strM41599, zM15719, c23900);
                        m24821(c18090M42167, c14727M24817, strM41599, zM15719, c23900);
                        c18090M42167.close();
                        c10000M41609.close();
                        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, strM41599).add("completedFiles", c23900.f77268).add("createdDirectories", c23900.f77269).add("warnings", c23900.f77270);
                    } catch (Throwable th) {
                        try {
                            c18090M42167.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c10000M41609.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                C3059 c3059M9369 = C3059.m9369("ZIP_IO_ERROR", "The storage backend failed during ZIP extraction", "fatal", null, JSON.object());
                if (c23900.f77273) {
                    c3059M9369.f9609.put("changed", true).put("stateKnown", false);
                }
                c23900.m52656(c3059M9369);
                throw c3059M9369;
            }
        } catch (IOException e) {
            C3059 c3059M24823 = m24823(e);
            c23900.m52656(c3059M24823);
            throw c3059M24823;
        } catch (C3059 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = C3059.m9365("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", "warning", e.f9604, e.f9609);
            }
            c23900.m52656(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m24814(JSONArray jSONArray, C7383 c7383) throws C3059 {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String strM15720 = null;
            try {
                JSONObject jSONObjectM15712 = C5556.m15712("entries", jSONArray.get(i));
                C5556.m15717(jSONObjectM15712, "entryPath", "destinationPath");
                String strM15721 = C5556.m15720(jSONObjectM15712, "entryPath");
                try {
                    strM15720 = C5556.m15720(jSONObjectM15712, "destinationPath");
                    boolean z = true;
                    C5556.m15718(strM15721, "entryPath", true);
                    if (!strM15721.isEmpty() && !strM15721.endsWith("/")) {
                        z = false;
                    }
                    if (z != strM15720.endsWith("/")) {
                        throw C5556.m15713(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "Directory mappings require trailing slashes on both paths");
                    }
                    String strM29843 = C12301.m29843(c7383, strM15720, "destinationPath", false);
                    c7383.m19884(strM29843);
                    if (!z) {
                        c7383.m19882(strM29843);
                    }
                    arrayList.add(new C18256(strM15721, i, strM29843, z));
                } catch (C3059 e) {
                    e = e;
                    str = strM15720;
                    strM15720 = strM15721;
                    JSONArray jSONArrayArray = JSON.array(i);
                    JSONObject jSONObject = e.f9609;
                    jSONObject.put("operationIndexes", jSONArrayArray);
                    if (strM15720 != null) {
                        jSONObject.put("entryPaths", JSON.array(strM15720));
                    }
                    if (str != null) {
                        jSONObject.put("destinationPath", str);
                    }
                    throw e;
                }
            } catch (C3059 e2) {
                e = e2;
                str = null;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14727 m24817(C18090 c18090, ArrayList arrayList, String str, String str2, C23900 c23900) throws C3059 {
        C23734 c23734;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        C23734 c23735 = new C23734(c18090.m42210());
        ArrayList<C3545> arrayList3 = new ArrayList(c18090.m42210());
        C6083.sort(arrayList3, C8200.comparing(new C6639(2)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C18256 c18256 = (C18256) it3.next();
            C5556.m15716();
            c23900.f77271 = new C17550(null, c18256.f56776, c18256.f56774, c18256.f56775, c18256.f56777);
            C3545 entry = c18090.getEntry(c18256.f56776);
            if (!c18256.f56775) {
                c23734 = c23735;
                arrayList2 = arrayList3;
                it = it3;
                if (entry == null) {
                    throw C5556.m15713(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist");
                }
                m24819(entry);
                if (entry.m10808() && str2.isEmpty()) {
                    throw C5556.m15713(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                }
                C17550 c17550 = new C17550(entry, entry.getName(), c18256.f56774, false, c18256.f56777);
                c23900.f77271 = c17550;
                m24818(linkedHashMap, c17550, str);
            } else {
                if (!c18256.f56776.isEmpty() && entry == null && c23735.m4933(c18256.f56776) == null) {
                    throw C5556.m15713(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist");
                }
                if (entry != null) {
                    m24819(entry);
                }
                m24818(linkedHashMap, c23900.f77271, str);
                for (C3545 c3545 : arrayList3) {
                    if (c3545.getName().startsWith(c18256.f56776) && !c3545.getName().equals(c18256.f56776)) {
                        C23734 c23736 = c23735;
                        c23900.f77271 = new C17550(c3545, c3545.getName(), c18256.f56774, c3545.isDirectory(), c18256.f56777);
                        m24819(c3545);
                        String strSubstring = c3545.getName().substring(c18256.f56776.length());
                        boolean zIsDirectory = c3545.isDirectory();
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList4 = arrayList3;
                            if (i > strSubstring.length()) {
                                Iterator it4 = it3;
                                try {
                                    String strM39860 = C16999.m39860(strSubstring, zIsDirectory);
                                    if (zIsDirectory && !strM39860.isEmpty()) {
                                        strM39860 = strM39860 + "/";
                                    }
                                    if (!c3545.isDirectory() || !strM39860.isEmpty()) {
                                        String str3 = c18256.f56774;
                                        C17550 c17551 = new C17550(c3545, c3545.getName(), C12301.m29847("/".equals(str3) ? C16014.m37867(str3, strM39860) : C22870.m50967(str3, "/", strM39860), "destinationPath"), c3545.isDirectory(), c18256.f56777);
                                        c23900.f77271 = c17551;
                                        if (c3545.m10808() && str2.isEmpty()) {
                                            throw C5556.m15713(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                                        }
                                        m24818(linkedHashMap, c17551, str);
                                    }
                                    it3 = it4;
                                    arrayList3 = arrayList4;
                                    c23735 = c23736;
                                    break;
                                } catch (IOException unused) {
                                    throw C5556.m15713(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The ZIP entry has an unsafe extraction path");
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
                                throw C5556.m15713(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The extraction path contains a parent directory segment");
                            }
                            i2 = i + 1;
                            i++;
                            it3 = it2;
                            arrayList3 = arrayList4;
                        }
                    }
                }
                c23734 = c23735;
                arrayList2 = arrayList3;
                it = it3;
            }
            it3 = it;
            arrayList3 = arrayList2;
            c23735 = c23734;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (C17550 c17552 : linkedHashMap.values()) {
            c23900.f77271 = c17552;
            if (c17552.f53646) {
                linkedHashMap2.put(m24813(c17552.f53645), c17552);
            } else {
                arrayList5.add(c17552);
            }
            for (String strM24822 = m24822(c17552.f53645); strM24822 != null; strM24822 = m24822(strM24822)) {
                C17550 c17553 = (C17550) linkedHashMap.get(m24813(strM24822));
                if (c17553 != null && !c17553.f53646) {
                    throw m24816(c17553, c17552, strM24822);
                }
            }
            if (!c17552.f53646) {
                String strM24823 = m24822(c17552.f53645);
                if (strM24823 == null) {
                    throw C5556.m15713(JSON.object(), "FILE_PARENT_NOT_FOUND", "The output has no parent directory");
                }
                C13843.putIfAbsent(linkedHashMap2, m24813(strM24823), new C17550(null, c17552.f53649, strM24823, true, c17552.f53648));
            }
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.values());
        C6083.sort(arrayList6, C8200.comparingInt(new C2028()));
        return new C14727(arrayList6, arrayList5);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24820(C14727 c14727, String str, boolean z, C23900 c23900) throws C3059 {
        C17760 c17760 = this.f29617;
        C7383 c7383M41607 = c17760.m41607();
        c7383M41607.m19883(str);
        for (C17550 c17550 : (ArrayList) c14727.f44977) {
            C5556.m15716();
            c23900.f77271 = c17550;
            c7383M41607.m19884(c17550.f53645);
            this.f29615.m18194(c17550.f53645);
        }
        for (C17550 c17551 : (ArrayList) c14727.f44978) {
            C5556.m15716();
            c23900.f77271 = c17551;
            c7383M41607.m19884(c17551.f53645);
            c7383M41607.m19882(c17551.f53645);
            int i = C16844.f51703[c17760.m41613(c17551.f53645).m30885().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw C5556.m15713(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "A directory cannot be used as an extracted file destination");
                    }
                    throw C3059.m9369("FILE_UNSUPPORTED_TYPE", "Extraction destinations must be regular files or missing paths", "fatal", null, JSON.object());
                }
            } else if (!z) {
                throw C5556.m15713(JSON.object(), "FILE_ALREADY_EXISTS", "An extraction destination exists and overwrite is false");
            }
            if (c17760.m41612(c17551.f53645).mo23558().mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
                throw C3059.m9369("FILE_BACKEND_UNSUPPORTED", "The destination backend cannot safely create temporary extraction files", "fatal", null, JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24821(C18090 c18090, C14727 c14727, String str, boolean z, C23900 c23900) throws C3059 {
        C17760 c17760;
        Iterator it = ((ArrayList) c14727.f44977).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c17760 = this.f29617;
            if (!zHasNext) {
                break;
            }
            C17550 c17550 = (C17550) it.next();
            c23900.f77271 = c17550;
            C5556.m15716();
            c17760.m41607().m19883(str);
            c23900.f77273 = true;
            C23590 c23590M18193 = this.f29615.m18193(c17550.f53645);
            c23900.f77273 = false;
            c23900.f77269 += c23590M18193.f76477;
            c23900.m52655(c23590M18193.f76479);
        }
        for (C17550 c17551 : (ArrayList) c14727.f44978) {
            c23900.f77271 = c17551;
            C5556.m15716();
            C7383 c7383M41607 = c17760.m41607();
            c7383M41607.m19883(str);
            c23900.f77273 = true;
            C0120 c0120M31187 = this.f29616.m31187(c17551.f53645, z, c7383M41607, new C11201(c18090, c17551, str));
            c23900.f77273 = false;
            c23900.f77268++;
            c23900.m52655(c0120M31187.f1123);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m24812(C3545 c3545, C18090 c18090) throws C3059 {
        try {
            return new C21079(c18090.m42202(c3545));
        } catch (IOException e) {
            throw m24823(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24819(C3545 c3545) throws C3059 {
        if ((c3545.m10778() & 61440) == 40960) {
            throw C3059.m9369("ZIP_UNSUPPORTED_ENTRY", "Symbolic link entries cannot be extracted by this tool", "fatal", null, JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24818(LinkedHashMap linkedHashMap, C17550 c17550, String str) throws C3059 {
        if (C16999.m39878(str, c17550.f53645)) {
            throw C5556.m15713(JSON.object(), "ZIP_SOURCE_DESTINATION_CONFLICT", "Extraction cannot replace its source ZIP");
        }
        C17550 c17551 = (C17550) C13843.putIfAbsent(linkedHashMap, m24813(c17550.f53645), c17550);
        if (c17551 != null) {
            throw m24816(c17551, c17550, c17550.f53645);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m24816(C17550 c17550, C17550 c17551, String str) {
        JSONArray jSONArrayArray = JSON.array(c17550.f53648);
        if (c17551.f53648 != c17550.f53648) {
            jSONArrayArray.add(c17551.f53648);
        }
        JSONArray jSONArrayArray2 = JSON.array(c17550.f53649);
        if (!c17551.f53649.equals(c17550.f53649)) {
            jSONArrayArray2.add(c17551.f53649);
        }
        return C5556.m15713(JSON.object().add("entryPaths", jSONArrayArray2).add("operationIndexes", jSONArrayArray).add("destinationPath", str), "ZIP_DESTINATION_CONFLICT", "Multiple ZIP entries require the same destination or a file as a parent directory");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24813(String str) {
        String strM39859 = C16999.m39859(str);
        if (strM39859 == null) {
            return str;
        }
        return "shared-storage:" + strM39859.toLowerCase(Locale.ROOT);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24822(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == 0 ? "/" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m24823(IOException iOException) {
        if ((iOException instanceof InterruptedIOException) || Thread.currentThread().isInterrupted()) {
            return C5556.m15713(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
        if (iOException instanceof C3979) {
            return C5556.m15713(JSON.object(), "ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry");
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented")) {
            return C3059.m9369("ZIP_UNSUPPORTED", "The ZIP uses an unsupported archive, compression, or encryption feature", "fatal", null, JSON.object());
        }
        return C5556.m15713(JSON.object(), "ZIP_READ_FAILED", "The ZIP file or entry could not be read and verified");
    }
}
