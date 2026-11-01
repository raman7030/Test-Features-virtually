package p067l;

import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.۬۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14717 extends AbstractC17043 implements InterfaceC23140 {

    /* JADX INFO: renamed from: ۟ */
    public static String f41953 = "";

    /* JADX INFO: renamed from: ۗ */
    public C8878 f41958;

    /* JADX INFO: renamed from: ۛ */
    public final C19607 f41959;

    /* JADX INFO: renamed from: ۤ */
    public final String f41960;

    /* JADX INFO: renamed from: ۨ */
    public final String f41961;

    /* JADX INFO: renamed from: ۫ */
    public final C6671 f41962;

    /* JADX INFO: renamed from: ۬ */
    public final File f41963;

    /* JADX INFO: renamed from: ᩺ */
    public static final C21424 f41957 = new C21424();

    /* JADX INFO: renamed from: ۧ֫ */
    public static final C7350 f41954 = new C7350();

    /* JADX INFO: renamed from: ֫֫ */
    public static final C10748 f41952 = C10748.m24756(2000);

    /* JADX INFO: renamed from: ܽ֫ */
    public static String f41956 = "";

    /* JADX INFO: renamed from: ܰ */
    public static final HashMap f41955 = new HashMap();

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo29980() {
        return false;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final C14717 mo33651() {
        return this;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo29994() {
        return true;
    }

    static {
        if (C18524.m42126()) {
            return;
        }
        if (C18524.m42129() || C12902.m29570()) {
            String string = C16253.m37019(C18524.m42129() ? "primary:\u200bAndroid" : "primary:Android/", false).toString();
            C13045.m29865(string, "toString(...)");
            List<UriPermission> persistedUriPermissions = C7050.m16232().getContentResolver().getPersistedUriPermissions();
            C13045.m29865(persistedUriPermissions, "getPersistedUriPermissions(...)");
            for (UriPermission uriPermission : persistedUriPermissions) {
                if (uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                    Uri uri = uriPermission.getUri();
                    String string2 = uri.toString();
                    C13045.m29865(string2, "toString(...)");
                    if (string2.startsWith(string)) {
                        String str = uri.getPathSegments().get(1);
                        C13045.m29865(str, "get(...)");
                        String strSubstring = str.substring(8);
                        C13045.m29865(strSubstring, "substring(...)");
                        f41955.put(strSubstring, uri);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo29982(String str) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorMo29982;
        C13045.m29867(str, "mode");
        try {
            return this.f41959.mo29982(str);
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 == null || (parcelFileDescriptorMo29982 = c8878M33647.mo29982(str)) == null) {
                throw new IOException("Permission denied: ".concat(mo25505()));
            }
            return parcelFileDescriptorMo29982;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo25502(AbstractC17043 abstractC17043) {
        C8878 c8878M33647;
        C13045.m29867(abstractC17043, "tar");
        try {
            return this.f41959.mo25502(abstractC17043 instanceof C14717 ? ((C14717) abstractC17043).f41959 : abstractC17043);
        } catch (C18936 unused) {
            C8878 c8878M33648 = m33647();
            if (c8878M33648 == null) {
                return false;
            }
            if ((abstractC17043 instanceof C14717) && (c8878M33647 = ((C14717) abstractC17043).m33647()) != null) {
                abstractC17043 = c8878M33647;
            }
            return c8878M33648.mo25502(abstractC17043);
        }
    }

    public C14717(File file, String str, String str2, C19607 c19607, C6671 c6671) {
        C13045.m29867(file, "file");
        C13045.m29867(str, "relativePath");
        C13045.m29867(str2, "treePrimaryPath");
        this.f41963 = file;
        this.f41960 = str;
        this.f41961 = str2;
        this.f41959 = c19607;
        this.f41962 = c6671;
    }

    /* JADX INFO: renamed from: ۗۧ */
    public final String m33650() {
        return this.f41961;
    }

    /* JADX INFO: renamed from: ۨۧ */
    private final C8878 m33647() {
        C8878 c8878 = this.f41958;
        if (c8878 != null) {
            return c8878;
        }
        String str = this.f41961;
        if (!C21424.m48554(str)) {
            return null;
        }
        C8878 c8879 = new C8878(this.f41963, new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str)).appendPath("document").appendPath("primary:" + this.f41960).build());
        this.f41958 = c8879;
        return c8879;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo20484() {
        return C23770.m52834().mo4996();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo20489() {
        return C23770.m52834().mo4996();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14717(File file, String str, String str2) {
        this(file, str, str2, new C19607(file, C23770.m52834().mo4997() ? new File(C20865.m47154("/data/media/", C17853.f53287.getName(), "/", str)) : file, str, str2), null);
        C13045.m29867(str, "relativePath");
        C13045.m29867(str2, "treePrimaryPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14717(File file, String str, String str2, C6671 c6671) {
        this(file, str, str2, new C19607(file, C23770.m52834().mo4997() ? new File(C20865.m47154("/data/media/", C17853.f53287.getName(), "/", str)) : file, str, str2), c6671);
        C13045.m29867(file, "file");
        C13045.m29867(str, "relativePath");
        C13045.m29867(str2, "treePrimaryPath");
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17043 mo25510() {
        File absoluteFile = this.f41963.getAbsoluteFile();
        C13045.m29865(absoluteFile, "getAbsoluteFile(...)");
        return new C14717(absoluteFile, this.f41960, this.f41961, this.f41962);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo25495() {
        String absolutePath = this.f41963.getAbsolutePath();
        C13045.m29865(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // p067l.InterfaceC23140
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 mo29974() {
        C19607 c19607 = this.f41959;
        if (c19607 instanceof C18265) {
            return this;
        }
        return new C14717(this.f41963, this.f41960, this.f41961, c19607.mo29974(), this.f41962);
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo25496() {
        try {
            f41957.getClass();
            return this.f41959.mo25496();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25496();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo25497() {
        try {
            f41957.getClass();
            return this.f41959.mo25497();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25497();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    public final String getName() {
        String name = this.f41963.getName();
        C13045.m29865(name, "getName(...)");
        return name;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo25505() {
        String path = this.f41963.getPath();
        C13045.m29865(path, "getPath(...)");
        return path;
    }

    @Override // p067l.AbstractC17043
    public final String getParent() {
        return this.f41963.getParent();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo25503() {
        try {
            f41957.getClass();
            return this.f41959.mo25503();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25503();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo29990() {
        try {
            f41957.getClass();
            return this.f41959.mo29990();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25503();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo25094() {
        try {
            f41957.getClass();
            return this.f41959.mo25094();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25094();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo25093() {
        C6671 c6671 = this.f41962;
        if (c6671 != null) {
            return !c6671.m15186();
        }
        try {
            f41957.getClass();
            return this.f41959.mo25093();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25093();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo25087() {
        C6671 c6671 = this.f41962;
        if (c6671 != null) {
            return c6671.m15186();
        }
        try {
            f41957.getClass();
            return this.f41959.mo25087();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25087();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo29972() {
        if (this.f41962 != null) {
            return true;
        }
        try {
            return this.f41959.mo29972();
        } catch (C18936 unused) {
            return m33647() != null;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo25101() {
        C6671 c6671 = this.f41962;
        if (c6671 != null) {
            return c6671.m15185();
        }
        try {
            return this.f41959.mo25101();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25101();
            }
            return -1L;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo25091() {
        C6671 c6671 = this.f41962;
        if (c6671 != null) {
            return c6671.m15184();
        }
        try {
            return this.f41959.mo25091();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25091();
            }
            return 0L;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20486(long j) {
        if (j < 0) {
            return false;
        }
        try {
            f41957.getClass();
            return this.f41959.mo20486(j);
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            return c8878M33647 != null ? c8878M33647.mo20486(j) : false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo29973() {
        try {
            f41957.getClass();
            this.f41959.mo29973();
            return true;
        } catch (C18936 unused) {
            return m33647() != null;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo29997() {
        try {
            f41957.getClass();
            return this.f41959.mo29997();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo29997();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo29985() {
        try {
            return this.f41959.mo29985();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo29985();
            }
            return false;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC22410 mo29976(InterfaceC8998 interfaceC8998) {
        try {
            return this.f41959.mo29976(interfaceC8998);
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            return c8878M33647 != null ? c8878M33647.mo29976(interfaceC8998) : super.mo29976(interfaceC8998);
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۧ */
    public final List mo25500(boolean z) {
        ArrayList arrayList;
        File file = this.f41963;
        String str = this.f41960;
        try {
            List listMo25500 = this.f41959.mo25500(z);
            if (Build.VERSION.SDK_INT >= 34 && C23770.m52834().mo4998() && (C5235.m11297(str, "Android/data") || C5235.m11297(str, "Android/obb"))) {
                for (String str2 : C3318.m5795((Set) C7480.stream(listMo25500).map(new C13443(new C16728())).collect(C24205.toSet()), str)) {
                    String str3 = str + "/" + str2;
                    listMo25500.add(new C14717(new File(file, str2), str3, str3));
                }
            }
            C13045.m29861(listMo25500);
            return listMo25500;
        } catch (C18936 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C5235.m11297(str, "Android/data")) {
                    ArrayList arrayListM46862 = i == 33 ? C20754.m46862(this) : C7342.m17025(this);
                    if (mo25505().equals(f41953)) {
                        C21424.m48553(str);
                    }
                    return arrayListM46862;
                }
                if (C5235.m11297(str, "Android/obb")) {
                    ArrayList arrayListM46866 = i == 33 ? C20754.m46866(this) : C7342.m17029(this);
                    if (mo25505().equals(f41953)) {
                        C21424.m48553(str);
                    }
                    return arrayListM46866;
                }
            }
            C8878 c8878M33647 = m33647();
            String str4 = this.f41961;
            if (c8878M33647 == null) {
                if (mo25505().equals(f41953)) {
                    C21424.m48553(str4);
                }
                return new ArrayList();
            }
            List listMo25501 = c8878M33647.mo25500(z);
            ArrayList arrayList2 = new ArrayList(C4187.m8472((Iterable) listMo25501));
            for (AbstractC17043 abstractC17043 : (ArrayList) listMo25501) {
                String name = abstractC17043.getName();
                C14717 c14717 = new C14717(new File(file, name), C24104.m53357(str, "/", name), str4);
                c14717.f41958 = (C8878) abstractC17043;
                arrayList2.add(c14717);
            }
            C13045.m29867(arrayList2, "<this>");
            boolean z2 = arrayList2 instanceof Collection;
            if (z2) {
                ArrayList arrayList3 = arrayList2;
                int size = arrayList3.size();
                if (size != 0) {
                    if (size != 1) {
                        return new ArrayList(arrayList3);
                    }
                    return C4187.m8475(arrayList2 instanceof List ? arrayList2.get(0) : arrayList3.iterator().next());
                }
            } else {
                if (z2) {
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    C13045.m29867(arrayList2, "<this>");
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                int size2 = arrayList.size();
                if (size2 != 0) {
                    return size2 != 1 ? arrayList : C4187.m8475(arrayList.get(0));
                }
            }
            return C10893.f30179;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo29992() {
        String str = this.f41960;
        try {
            List listMo29992 = this.f41959.mo29992();
            if (Build.VERSION.SDK_INT >= 34 && C23770.m52834().mo4998() && (C5235.m11297(str, "Android/data") || C5235.m11297(str, "Android/obb"))) {
                List listM5795 = C3318.m5795(new HashSet(listMo29992), str);
                C13045.m29861(listM5795);
                listMo29992.addAll(listM5795);
            }
            C13045.m29861(listMo29992);
            return listMo29992;
        } catch (C18936 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C5235.m11297(str, "Android/data")) {
                    if (mo25505().equals(f41953)) {
                        C21424.m48553(str);
                    }
                    if (i == 33) {
                        return C20754.m46860();
                    }
                    return C7342.m17023();
                }
                if (C5235.m11297(str, "Android/obb")) {
                    if (mo25505().equals(f41953)) {
                        C21424.m48553(str);
                    }
                    if (i == 33) {
                        return C20754.m46864();
                    }
                    return C7342.m17027();
                }
            }
            C8878 c8878M33647 = m33647();
            if (c8878M33647 == null) {
                if (mo25505().equals(f41953)) {
                    C21424.m48553(this.f41961);
                }
                return new ArrayList();
            }
            List listMo29993 = c8878M33647.mo29992();
            C13045.m29861(listMo29993);
            return listMo29993;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo29987() throws IOException {
        InputStream inputStreamMo29987;
        try {
            f41957.getClass();
            return this.f41959.mo29987();
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 == null || (inputStreamMo29987 = c8878M33647.mo29987()) == null) {
                throw new IOException("Permission denied: ".concat(mo25505()));
            }
            return inputStreamMo29987;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo25506(boolean z) throws IOException {
        OutputStream outputStreamMo25506;
        try {
            return this.f41959.mo25506(z);
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 == null || (outputStreamMo25506 = c8878M33647.mo25506(z)) == null) {
                throw new IOException("Permission denied: ".concat(mo25505()));
            }
            return outputStreamMo25506;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo29983() throws IOException {
        try {
            FileChannel fileChannelMo29983 = this.f41959.mo29983();
            C13045.m29861(fileChannelMo29983);
            return fileChannelMo29983;
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 == null) {
                throw new IOException("Permission denied: ".concat(mo25505()));
            }
            c8878M33647.mo29983();
            throw null;
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC4502 mo25508(String str) throws IOException {
        try {
            return this.f41959.mo25508(str);
        } catch (C18936 unused) {
            C8878 c8878M33647 = m33647();
            if (c8878M33647 != null) {
                return c8878M33647.mo25508(str);
            }
            throw new IOException("Permission denied: ".concat(mo25505()));
        }
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩵֫ */
    public final boolean mo33653() {
        return (C23770.m52834().mo4996() || m33647() == null) ? false : true;
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ܽ֫ */
    public final Uri mo33652() {
        if (!mo33653()) {
            throw new UnsupportedOperationException();
        }
        C8878 c8878M33647 = m33647();
        C13045.m29861(c8878M33647);
        Uri uriMo33652 = c8878M33647.mo33652();
        C13045.m29865(uriMo33652, "getContentUri(...)");
        return uriMo33652;
    }

    /* JADX INFO: renamed from: ᩶ۧ */
    public final C13102 m33654() {
        if (C23770.m52834().mo4996()) {
            return this.f41959;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC17043 m33640(C14717 c14717) {
        C13102 c13102M33654 = c14717.m33654();
        return c13102M33654 != null ? c13102M33654 : c14717.m33647();
    }

    @Override // p067l.AbstractC17043
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC12351 mo25509() {
        AbstractC17043 abstractC17043M33654 = m33654();
        if (abstractC17043M33654 == null) {
            abstractC17043M33654 = m33647();
        }
        if (abstractC17043M33654 == null) {
            return super.mo25509();
        }
        return new C22765(this, abstractC17043M33654);
    }
}
