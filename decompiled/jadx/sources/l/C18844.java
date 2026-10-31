package l;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.DocumentsContract;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.Main;
import com.umeng.analytics.pro.am;
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
public final class C18844 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59431 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Iterable f59432;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f59433;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f59434;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C5242 f59435;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f59436;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final List f59437;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized void m43543() {
        String string;
        synchronized (C18844.class) {
            string = m43530(f59436).toString();
        }
        C4925.f15527.edit().putString("utsd", string).putString("utsd_h", m43530(f59434).toString()).apply();
    }

    static {
        ArrayList arrayList = new ArrayList();
        f59436 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f59434 = arrayList2;
        f59437 = C20195.unmodifiableList(arrayList);
        f59433 = C20195.unmodifiableList(arrayList2);
        f59432 = C8882.m22948(arrayList, arrayList2);
        f59435 = new C5242();
        String string = C4925.f15527.getString("utsd", null);
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C4027(Uri.parse(jSONObject.getString(am.av)), jSONObject.getString("b"), jSONObject.getString(am.aF)));
                }
            } catch (JSONParseException unused) {
            }
        }
        String string2 = C4925.f15527.getString("utsd_h", null);
        if (string2 != null) {
            try {
                JSONArray jSONArray2 = new JSONArray(string2);
                ArrayList arrayList3 = f59434;
                C11003.requireNonNull(arrayList3);
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    arrayList3.add(new C4027(Uri.parse(jSONObject2.getString(am.av)), jSONObject2.getString("b"), jSONObject2.getString(am.aF)));
                }
            } catch (JSONParseException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m43530(List list) {
        JSONArray jSONArray = new JSONArray();
        synchronized (C18844.class) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4027 c4027 = (C4027) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(am.av, c4027.f12779.toString());
                jSONObject.put("b", c4027.f12783);
                jSONObject.put(am.aF, c4027.f12781);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43537(Main main, C1390 c1390) {
        f59435.m1668(main, c1390);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m43546() {
        return f59437;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static List m43547() {
        return f59433;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Iterable m43544() {
        return f59432;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C4027 m43540(String str) {
        for (C4027 c4027 : f59432) {
            if (c4027.f12779.getAuthority().endsWith(".MTDataFilesProvider") && m43539(c4027.f12779).equals(str)) {
                return c4027;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43539(Uri uri) {
        return C15472.m36561(20, 0, uri.getAuthority());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4027 m43531(String str) {
        synchronized (C18844.class) {
            for (C4027 c4027 : f59432) {
                if (c4027.f12783.equals(str)) {
                    return c4027;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4027 m43545(String str) {
        synchronized (C18844.class) {
            for (C4027 c4027 : f59436) {
                if (c4027.f12783.equals(str)) {
                    return c4027;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43536(Uri uri) {
        String description;
        if (C20159.m46407(uri)) {
            C4925.m14336().takePersistableUriPermission(uri, 3);
            CRC32 crc32 = new CRC32();
            crc32.update(uri.toString().getBytes(StandardCharsets.UTF_8));
            int i = 0;
            StringBuilder sb = new StringBuilder(String.format("%08X", Long.valueOf(crc32.getValue())));
            sb.insert(4, '-');
            String string = sb.toString();
            if (m43545(string) != null) {
                return;
            }
            if (uri.getAuthority().endsWith(".MTDataFilesProvider")) {
                String strM43539 = m43539(uri);
                try {
                    PackageManager packageManagerM14320 = C4925.m14320();
                    description = packageManagerM14320.getPackageInfo(strM43539, 0).applicationInfo.loadLabel(packageManagerM14320).toString();
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
                description = AbstractC2482.m7969(C4925.m14335(), uri).mo7970();
            }
            if (description == null) {
                description = C14609.m34870(uri);
            }
            if (Build.VERSION.SDK_INT >= 24 && description.length() == 9 && description.charAt(4) == '-') {
                Object systemService = C4925.m14335().getSystemService("storage");
                if (systemService instanceof StorageManager) {
                    try {
                        Iterator<StorageVolume> it = ((StorageManager) systemService).getStorageVolumes().iterator();
                        while (it.hasNext()) {
                            StorageVolume storageVolumeM19187 = C7166.m19187(it.next());
                            if (description.equals(storageVolumeM19187.getUuid())) {
                                description = storageVolumeM19187.getDescription(C4925.m14335());
                                break;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            synchronized (C18844.class) {
                f59436.add(new C4027(uri, string, description));
                C5378.removeIf(f59434, new C16020(string, i));
            }
            m43543();
            f59435.mo1664(f59437);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43541() {
        m43543();
        f59435.mo1664(f59437);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43535(int i, int i2) {
        synchronized (C18844.class) {
            C6055.m16890(i, i2, f59436);
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43534(int i) {
        synchronized (C18844.class) {
            ((C4027) f59436.remove(i)).m12122();
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43542(int i) {
        synchronized (C18844.class) {
            f59434.add((C4027) f59436.remove(i));
        }
        C1802.m5991(new RunnableC2616(), C18844.class, 500L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43538(Set set) {
        synchronized (C18844.class) {
            Iterator it = f59432.iterator();
            while (it.hasNext()) {
                C4027 c4027 = (C4027) it.next();
                if (set.contains(c4027.f12783)) {
                    c4027.m12122();
                    it.remove();
                }
            }
        }
        m43543();
        f59435.mo1664(f59437);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8966 m43532(File file) {
        String[] strArr;
        String strSubstring;
        String strSubstring2;
        String path = file.getPath();
        if (C9679.m24619("/storage/", path)) {
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
        synchronized (C18844.class) {
            for (C4027 c4027 : f59432) {
                if (c4027.f12783.equals(str)) {
                    Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(c4027.f12779, c4027.m12121(str2, true));
                    if (uriBuildDocumentUriUsingTree.getAuthority().endsWith(".MTDataFilesProvider")) {
                        return new C13198(file, uriBuildDocumentUriUsingTree, c4027);
                    }
                    return new C8966(file, uriBuildDocumentUriUsingTree, c4027);
                }
            }
            return null;
        }
    }
}
