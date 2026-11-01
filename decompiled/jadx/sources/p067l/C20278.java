package p067l;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONParseException;
import bin.p000mt.plus.Main;
import com.umeng.analytics.pro.C0655am;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ᩴܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I9S8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20278 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f62659 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Iterable f62660;

    /* JADX INFO: renamed from: ܳ */
    public static final List f62661;

    /* JADX INFO: renamed from: ܽ */
    public static final ArrayList f62662;

    /* JADX INFO: renamed from: ܿ */
    public static C7350 f62663;

    /* JADX INFO: renamed from: ᩳ */
    public static final ArrayList f62664;

    /* JADX INFO: renamed from: ᩻ */
    public static final List f62665;

    /* JADX INFO: renamed from: ܳ */
    public static synchronized void m45809() {
        String string;
        synchronized (C20278.class) {
            string = m45796(f62664).toString();
        }
        C7050.f18359.edit().putString("utsd", string).putString("utsd_h", m45796(f62662).toString()).apply();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f62664 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f62662 = arrayList2;
        f62665 = C21562.unmodifiableList(arrayList);
        f62661 = C21562.unmodifiableList(arrayList2);
        f62660 = C10810.m24919(arrayList, arrayList2);
        f62663 = new C7350();
        String string = C7050.f18359.getString("utsd", null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C6196(Uri.parse(jSONObject.getString(C0655am.f2320av)), jSONObject.getString("b"), jSONObject.getString(C0655am.f2278aF)));
                }
            } catch (JSONParseException unused) {
            }
        }
        String string2 = C7050.f18359.getString("utsd_h", null);
        if (string2 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                ArrayList arrayList3 = f62662;
                C12826.requireNonNull(arrayList3);
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    arrayList3.add(new C6196(Uri.parse(jSONObject2.getString(C0655am.f2320av)), jSONObject2.getString("b"), jSONObject2.getString(C0655am.f2278aF)));
                }
            } catch (JSONParseException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m45796(List list) {
        JSONArray jSONArray = new JSONArray();
        synchronized (C20278.class) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6196 c6196 = (C6196) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C0655am.f2320av, c6196.f15594.toString());
                jSONObject.put("b", c6196.f15598);
                jSONObject.put(C0655am.f2278aF, c6196.f15596);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45803(Main main, C3690 c3690) {
        f62663.m4066(main, c3690);
    }

    /* JADX INFO: renamed from: ܿ */
    public static List m45812() {
        return f62665;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static List m45813() {
        return f62661;
    }

    /* JADX INFO: renamed from: ܽ */
    public static Iterable m45810() {
        return f62660;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6196 m45806(String str) {
        for (C6196 c6196 : f62660) {
            if (c6196.f15594.getAuthority().endsWith(".MTDataFilesProvider") && m45805(c6196.f15594).equals(str)) {
                return c6196;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m45805(Uri uri) {
        return C17073.m38720(20, 0, uri.getAuthority());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6196 m45797(String str) {
        synchronized (C20278.class) {
            for (C6196 c6196 : f62660) {
                if (c6196.f15598.equals(str)) {
                    return c6196;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C6196 m45811(String str) {
        synchronized (C20278.class) {
            for (C6196 c6196 : f62664) {
                if (c6196.f15598.equals(str)) {
                    return c6196;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45802(Uri uri) {
        String description;
        if (C1842.m48724(uri)) {
            C7050.m16233().takePersistableUriPermission(uri, 3);
            CRC32 crc32 = new CRC32();
            crc32.update(uri.toString().getBytes(StandardCharsets.UTF_8));
            int i = 0;
            StringBuilder sb = new StringBuilder(String.format("%08X", Long.valueOf(crc32.getValue())));
            sb.insert(4, '-');
            String string = sb.toString();
            if (m45811(string) != null) {
                return;
            }
            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                String strM45805 = m45805(uri);
                try {
                    PackageManager packageManagerM16217 = C7050.m16217();
                    description = packageManagerM16217.getPackageInfo(strM45805, 0).applicationInfo.loadLabel(packageManagerM16217).toString();
                } catch (Exception unused) {
                    description = null;
                }
            } else {
                description = null;
            }
            if (description == null) {
                String string2 = uri.toString();
                if (string2.startsWith("content://com.termux") && string2.endsWith("home")) {
                    description = "Termux Home";
                }
            }
            if (description == null) {
                description = AbstractC4727.m10017(C7050.m16232(), uri).mo10018();
            }
            if (description == null) {
                description = C16253.m37021(uri);
            }
            if (Build.VERSION.SDK_INT >= 24 && description.length() == 9 && description.charAt(4) == '-') {
                Object systemService = C7050.m16232().getSystemService("storage");
                if (systemService instanceof StorageManager) {
                    try {
                        Iterator<StorageVolume> it = ((StorageManager) systemService).getStorageVolumes().iterator();
                        while (it.hasNext()) {
                            StorageVolume storageVolumeM21130 = C9179.m21130(it.next());
                            if (description.equals(storageVolumeM21130.getUuid())) {
                                description = storageVolumeM21130.getDescription(C7050.m16232());
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            synchronized (C20278.class) {
                f62664.add(new C6196(uri, string, description));
                C7480.removeIf(f62662, new C17594(string, i));
            }
            m45809();
            f62663.mo4062(f62665);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45807() {
        m45809();
        f62663.mo4062(f62665);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45801(int i, int i2) {
        synchronized (C20278.class) {
            C8123.m18819(i, i2, f62664);
        }
        C4081.m8188(new RunnableC4855(), C20278.class, 500L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45800(int i) {
        synchronized (C20278.class) {
            ((C6196) f62664.remove(i)).m14042();
        }
        C4081.m8188(new RunnableC4855(), C20278.class, 500L);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m45808(int i) {
        synchronized (C20278.class) {
            f62662.add((C6196) f62664.remove(i));
        }
        C4081.m8188(new RunnableC4855(), C20278.class, 500L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45804(Set set) {
        synchronized (C20278.class) {
            Iterator it = f62660.iterator();
            while (it.hasNext()) {
                C6196 c6196 = (C6196) it.next();
                if (set.contains(c6196.f15598)) {
                    c6196.m14042();
                    it.remove();
                }
            }
        }
        m45809();
        f62663.mo4062(f62665);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ֫ */
    public static C10890 m45798(File file) {
        String[] strArr;
        String strSubstring;
        String strSubstring2;
        String path = file.getPath();
        if (C11567.m26633("/storage/", path)) {
            int iIndexOf = path.indexOf(47, 9);
            if (iIndexOf == 18) {
                strSubstring2 = path.substring(9, 18);
                strSubstring = path.substring(19);
            } else if (iIndexOf == -1) {
                strSubstring2 = path.substring(9);
                strSubstring = "";
            } else {
                strSubstring = null;
                strSubstring2 = null;
            }
            if (strSubstring2 != null && strSubstring2.length() == 9 && strSubstring2.charAt(4) == '-') {
                strArr = new String[]{strSubstring2, strSubstring};
            } else {
                strArr = null;
            }
        } else {
            strArr = null;
        }
        if (strArr == null) {
            return null;
        }
        String str = strArr[0];
        String str2 = strArr[1];
        synchronized (C20278.class) {
            for (C6196 c6196 : f62660) {
                if (c6196.f15598.equals(str)) {
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(c6196.f15594, c6196.m14041(str2, true));
                    if (uriBuildDocumentUriUsingTree.getAuthority().endsWith(".MTDataFilesProvider")) {
                        return new C14912(file, uriBuildDocumentUriUsingTree, c6196);
                    }
                    return new C10890(file, uriBuildDocumentUriUsingTree, c6196);
                }
            }
            return null;
        }
    }
}
