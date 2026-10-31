package l;

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
public final class C12993 extends AbstractC15440 implements InterfaceC21855 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static String f38907 = "";

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6849 f38912;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C18138 f38913;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f38914;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f38915;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C4527 f38916;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final File f38917;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C20050 f38911 = new C20050();

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C5242 f38908 = new C5242();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C8817 f38906 = C8817.m22786(2000);

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static String f38910 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final HashMap f38909 = new HashMap();

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo27919() {
        return false;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12993 mo31566() {
        return this;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ */
    public final boolean mo27933() {
        return true;
    }

    static {
        if (C16999.m39883()) {
            return;
        }
        if (C16999.m39886() || C11083.m27508()) {
            String string = C14609.m34868(C16999.m39886() ? "primary:\u200bAndroid" : "primary:Android/", false).toString();
            C11233.m27803(string, "toString(...)");
            List<UriPermission> persistedUriPermissions = C4925.m14335().getContentResolver().getPersistedUriPermissions();
            C11233.m27803(persistedUriPermissions, "getPersistedUriPermissions(...)");
            for (UriPermission uriPermission : persistedUriPermissions) {
                if (uriPermission.isReadPermission() && uriPermission.isWritePermission()) {
                    Uri uri = uriPermission.getUri();
                    String string2 = uri.toString();
                    C11233.m27803(string2, "toString(...)");
                    if (string2.startsWith(string)) {
                        String str = uri.getPathSegments().get(1);
                        C11233.m27803(str, "get(...)");
                        String strSubstring = str.substring(8);
                        C11233.m27803(strSubstring, "substring(...)");
                        f38909.put(strSubstring, uri);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜ */
    public final ParcelFileDescriptor mo27921(String str) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorMo27921;
        C11233.m27805(str, "mode");
        try {
            return this.f38913.mo27921(str);
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 == null || (parcelFileDescriptorMo27921 = c6849M31562.mo27921(str)) == null) {
                throw new IOException("Permission denied: ".concat(mo23554()));
            }
            return parcelFileDescriptorMo27921;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23551(AbstractC15440 abstractC15440) {
        C6849 c6849M31562;
        C11233.m27805(abstractC15440, "tar");
        try {
            return this.f38913.mo23551(abstractC15440 instanceof C12993 ? ((C12993) abstractC15440).f38913 : abstractC15440);
        } catch (C17432 unused) {
            C6849 c6849M31563 = m31562();
            if (c6849M31563 == null) {
                return false;
            }
            if ((abstractC15440 instanceof C12993) && (c6849M31562 = ((C12993) abstractC15440).m31562()) != null) {
                abstractC15440 = c6849M31562;
            }
            return c6849M31563.mo23551(abstractC15440);
        }
    }

    public C12993(File file, String str, String str2, C18138 c18138, C4527 c4527) {
        C11233.m27805(file, "file");
        C11233.m27805(str, "relativePath");
        C11233.m27805(str2, "treePrimaryPath");
        this.f38917 = file;
        this.f38914 = str;
        this.f38915 = str2;
        this.f38913 = c18138;
        this.f38916 = c4527;
    }

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public final String m31565() {
        return this.f38915;
    }

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    private final C6849 m31562() {
        C6849 c6849 = this.f38912;
        if (c6849 != null) {
            return c6849;
        }
        String str = this.f38915;
        if (!C20050.m46238(str)) {
            return null;
        }
        C6849 c68410 = new C6849(this.f38917, new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath("primary:".concat(str)).appendPath("document").appendPath("primary:" + this.f38914).build());
        this.f38912 = c68410;
        return c68410;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo18535() {
        return C22518.m50492().mo2656();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܶ */
    public final boolean mo18540() {
        return C22518.m50492().mo2656();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12993(File file, String str, String str2) {
        this(file, str, str2, new C18138(file, C22518.m50492().mo2657() ? new File(C19462.m44858("/data/media/", C16293.f50120.getName(), "/", str)) : file, str, str2), null);
        C11233.m27805(str, "relativePath");
        C11233.m27805(str2, "treePrimaryPath");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12993(File file, String str, String str2, C4527 c4527) {
        this(file, str, str2, new C18138(file, C22518.m50492().mo2657() ? new File(C19462.m44858("/data/media/", C16293.f50120.getName(), "/", str)) : file, str, str2), c4527);
        C11233.m27805(file, "file");
        C11233.m27805(str, "relativePath");
        C11233.m27805(str2, "treePrimaryPath");
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC15440 mo23559() {
        File absoluteFile = this.f38917.getAbsoluteFile();
        C11233.m27803(absoluteFile, "getAbsoluteFile(...)");
        return new C12993(absoluteFile, this.f38914, this.f38915, this.f38916);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo23544() {
        String absolutePath = this.f38917.getAbsolutePath();
        C11233.m27803(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // l.InterfaceC21855
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15440 mo27913() {
        C18138 c18138 = this.f38913;
        if (c18138 instanceof C16726) {
            return this;
        }
        return new C12993(this.f38917, this.f38914, this.f38915, c18138.mo27913(), this.f38916);
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo23545() {
        try {
            f38911.getClass();
            return this.f38913.mo23545();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23545();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo23546() {
        try {
            f38911.getClass();
            return this.f38913.mo23546();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23546();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    public final String getName() {
        String name = this.f38917.getName();
        C11233.m27803(name, "getName(...)");
        return name;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܺ֫ */
    public final String mo23554() {
        String path = this.f38917.getPath();
        C11233.m27803(path, "getPath(...)");
        return path;
    }

    @Override // l.AbstractC15440
    public final String getParent() {
        return this.f38917.getParent();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۬ */
    public final boolean mo23552() {
        try {
            f38911.getClass();
            return this.f38913.mo23552();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23552();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo27929() {
        try {
            f38911.getClass();
            return this.f38913.mo27929();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23552();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo23120() {
        try {
            f38911.getClass();
            return this.f38913.mo23120();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23120();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠֫ */
    public final boolean mo23119() {
        C4527 c4527 = this.f38916;
        if (c4527 != null) {
            return !c4527.m13303();
        }
        try {
            f38911.getClass();
            return this.f38913.mo23119();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23119();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨֫ */
    public final boolean mo23113() {
        C4527 c4527 = this.f38916;
        if (c4527 != null) {
            return c4527.m13303();
        }
        try {
            f38911.getClass();
            return this.f38913.mo23113();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23113();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֡֫ */
    public final boolean mo27911() {
        if (this.f38916 != null) {
            return true;
        }
        try {
            return this.f38913.mo27911();
        } catch (C17432 unused) {
            return m31562() != null;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩺֫ */
    public final long mo23127() {
        C4527 c4527 = this.f38916;
        if (c4527 != null) {
            return c4527.m13302();
        }
        try {
            return this.f38913.mo23127();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23127();
            }
            return -1L;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۛ֫ */
    public final long mo23117() {
        C4527 c4527 = this.f38916;
        if (c4527 != null) {
            return c4527.m13301();
        }
        try {
            return this.f38913.mo23117();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23117();
            }
            return 0L;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18537(long j) {
        if (j < 0) {
            return false;
        }
        try {
            f38911.getClass();
            return this.f38913.mo18537(j);
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            return c6849M31562 != null ? c6849M31562.mo18537(j) : false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֨ۧ */
    public final boolean mo27912() {
        try {
            f38911.getClass();
            this.f38913.mo27912();
            return true;
        } catch (C17432 unused) {
            return m31562() != null;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo27936() {
        try {
            f38911.getClass();
            return this.f38913.mo27936();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo27936();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo27924() {
        try {
            return this.f38913.mo27924();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo27924();
            }
            return false;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21087 mo27915(InterfaceC6975 interfaceC6975) {
        try {
            return this.f38913.mo27915(interfaceC6975);
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            return c6849M31562 != null ? c6849M31562.mo27915(interfaceC6975) : super.mo27915(interfaceC6975);
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۧ */
    public final List mo23549(boolean z) {
        ArrayList arrayList;
        File file = this.f38917;
        String str = this.f38914;
        try {
            List listMo23549 = this.f38913.mo23549(z);
            if (Build.VERSION.SDK_INT >= 34 && C22518.m50492().mo2658() && (C3016.m9239(str, "Android/data") || C3016.m9239(str, "Android/obb"))) {
                for (String str2 : C0999.m3492((Set) C5378.stream(listMo23549).map(new C11653(new C15109())).collect(C22976.toSet()), str)) {
                    String str3 = str + "/" + str2;
                    listMo23549.add(new C12993(new File(file, str2), str3, str3));
                }
            }
            C11233.m27799(listMo23549);
            return listMo23549;
        } catch (C17432 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C3016.m9239(str, "Android/data")) {
                    ArrayList arrayListM44568 = i == 33 ? C19345.m44568(this) : C5233.m15115(this);
                    if (mo23554().equals(f38907)) {
                        C20050.m46237(str);
                    }
                    return arrayListM44568;
                }
                if (C3016.m9239(str, "Android/obb")) {
                    ArrayList arrayListM44572 = i == 33 ? C19345.m44572(this) : C5233.m15119(this);
                    if (mo23554().equals(f38907)) {
                        C20050.m46237(str);
                    }
                    return arrayListM44572;
                }
            }
            C6849 c6849M31562 = m31562();
            String str4 = this.f38915;
            if (c6849M31562 == null) {
                if (mo23554().equals(f38907)) {
                    C20050.m46237(str4);
                }
                return new ArrayList();
            }
            List listMo235410 = c6849M31562.mo23549(z);
            ArrayList arrayList2 = new ArrayList(C1913.m6270((Iterable) listMo235410));
            for (AbstractC15440 abstractC15440 : (ArrayList) listMo235410) {
                String name = abstractC15440.getName();
                C12993 c12993 = new C12993(new File(file, name), C22870.m50967(str, "/", name), str4);
                c12993.f38912 = (C6849) abstractC15440;
                arrayList2.add(c12993);
            }
            C11233.m27805(arrayList2, "<this>");
            boolean z2 = arrayList2 instanceof Collection;
            if (z2) {
                ArrayList arrayList3 = arrayList2;
                int size = arrayList3.size();
                if (size != 0) {
                    if (size != 1) {
                        return new ArrayList(arrayList3);
                    }
                    return C1913.m6273(arrayList2 instanceof List ? arrayList2.get(0) : arrayList3.iterator().next());
                }
            } else {
                if (z2) {
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    C11233.m27805(arrayList2, "<this>");
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                }
                int size2 = arrayList.size();
                if (size2 != 0) {
                    return size2 != 1 ? arrayList : C1913.m6273(arrayList.get(0));
                }
            }
            return C8969.f27244;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܰ֫ */
    public final List mo27931() {
        String str = this.f38914;
        try {
            List listMo27931 = this.f38913.mo27931();
            if (Build.VERSION.SDK_INT >= 34 && C22518.m50492().mo2658() && (C3016.m9239(str, "Android/data") || C3016.m9239(str, "Android/obb"))) {
                List listM3492 = C0999.m3492(new HashSet(listMo27931), str);
                C11233.m27799(listM3492);
                listMo27931.addAll(listM3492);
            }
            C11233.m27799(listMo27931);
            return listMo27931;
        } catch (C17432 unused) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                if (C3016.m9239(str, "Android/data")) {
                    if (mo23554().equals(f38907)) {
                        C20050.m46237(str);
                    }
                    if (i == 33) {
                        return C19345.m44566();
                    }
                    return C5233.m15113();
                }
                if (C3016.m9239(str, "Android/obb")) {
                    if (mo23554().equals(f38907)) {
                        C20050.m46237(str);
                    }
                    if (i == 33) {
                        return C19345.m44570();
                    }
                    return C5233.m15117();
                }
            }
            C6849 c6849M31562 = m31562();
            if (c6849M31562 == null) {
                if (mo23554().equals(f38907)) {
                    C20050.m46237(this.f38915);
                }
                return new ArrayList();
            }
            List listMo27932 = c6849M31562.mo27931();
            C11233.m27799(listMo27932);
            return listMo27932;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۢۧ */
    public final InputStream mo27926() throws IOException {
        InputStream inputStreamMo27926;
        try {
            f38911.getClass();
            return this.f38913.mo27926();
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 == null || (inputStreamMo27926 = c6849M31562.mo27926()) == null) {
                throw new IOException("Permission denied: ".concat(mo23554()));
            }
            return inputStreamMo27926;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ */
    public final OutputStream mo23555(boolean z) throws IOException {
        OutputStream outputStreamMo23555;
        try {
            return this.f38913.mo23555(z);
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 == null || (outputStreamMo23555 = c6849M31562.mo23555(z)) == null) {
                throw new IOException("Permission denied: ".concat(mo23554()));
            }
            return outputStreamMo23555;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ۜۧ */
    public final FileChannel mo27922() throws IOException {
        try {
            FileChannel fileChannelMo27922 = this.f38913.mo27922();
            C11233.m27799(fileChannelMo27922);
            return fileChannelMo27922;
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 == null) {
                throw new IOException("Permission denied: ".concat(mo23554()));
            }
            c6849M31562.mo27922();
            throw null;
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC2245 mo23557(String str) throws IOException {
        try {
            return this.f38913.mo23557(str);
        } catch (C17432 unused) {
            C6849 c6849M31562 = m31562();
            if (c6849M31562 != null) {
                return c6849M31562.mo23557(str);
            }
            throw new IOException("Permission denied: ".concat(mo23554()));
        }
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final boolean mo31568() {
        return (C22518.m50492().mo2656() || m31562() == null) ? false : true;
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Uri mo31567() {
        if (!mo31568()) {
            throw new UnsupportedOperationException();
        }
        C6849 c6849M31562 = m31562();
        C11233.m27799(c6849M31562);
        Uri uriMo31567 = c6849M31562.mo31567();
        C11233.m27803(uriMo31567, "getContentUri(...)");
        return uriMo31567;
    }

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final C11293 m31569() {
        if (C22518.m50492().mo2656()) {
            return this.f38913;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 m31555(C12993 c12993) {
        C11293 c11293M31569 = c12993.m31569();
        return c11293M31569 != null ? c11293M31569 : c12993.m31562();
    }

    @Override // l.AbstractC15440
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC10503 mo23558() {
        AbstractC15440 abstractC15440M31569 = m31569();
        if (abstractC15440M31569 == null) {
            abstractC15440M31569 = m31562();
        }
        if (abstractC15440M31569 == null) {
            return super.mo23558();
        }
        return new C21461(this, abstractC15440M31569);
    }
}
