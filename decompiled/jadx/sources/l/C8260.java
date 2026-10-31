package l;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsProvider;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.webkit.MimeTypeMap;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.۠ܶܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N9SR */
/* JADX INFO: loaded from: classes3.dex */
public class C8260 extends DocumentsProvider {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f25418 = {"root_id", "mime_types", "flags", "icon", "title", ErrorBundle.SUMMARY_ENTRY, "document_id"};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f25419 = {"document_id", "mime_type", "_display_name", "last_modified", "flags", "_size", "mt_extras"};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public File f25420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f25421;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public File f25422;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public File f25423;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public File f25424;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        this.f25421 = context.getPackageName();
        File parentFile = context.getFilesDir().getParentFile();
        this.f25422 = parentFile;
        String path = parentFile.getPath();
        if (path.startsWith("/data/user/")) {
            this.f25420 = new File(C20087.m46305(11, path, new StringBuilder("/data/user_de/")));
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            this.f25423 = externalFilesDir.getParentFile();
        }
        this.f25424 = context.getObbDir();
    }

    @Override // android.provider.DocumentsProvider
    public final String createDocument(String str, String str2, String str3) throws FileNotFoundException {
        StringBuilder sb;
        File fileM21860 = m21860(str, true);
        if (fileM21860 != null) {
            File file = new File(fileM21860, str3);
            int i = 2;
            while (file.exists()) {
                StringBuilder sbM19190 = C7166.m19190(str3, " (");
                sbM19190.append(i);
                sbM19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
                file = new File(fileM21860, sbM19190.toString());
                i++;
            }
            try {
                if ("vnd.android.document/directory".equals(str2) ? file.mkdir() : file.createNewFile()) {
                    if (str.endsWith("/")) {
                        sb = new StringBuilder();
                        sb.append(str);
                    } else {
                        sb = new StringBuilder();
                        sb.append(str);
                        sb.append("/");
                    }
                    sb.append(file.getName());
                    return sb.toString();
                }
            } catch (IOException unused) {
            }
        }
        throw new FileNotFoundException(C19462.m44858("Failed to create document in ", str, " with name ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final void deleteDocument(String str) throws FileNotFoundException {
        File fileM21860 = m21860(str, true);
        if (fileM21860 == null || !m21862(fileM21860)) {
            throw new FileNotFoundException("Failed to delete document ".concat(str));
        }
    }

    @Override // android.provider.DocumentsProvider
    public final String getDocumentType(String str) throws FileNotFoundException {
        File fileM21860 = m21860(str, true);
        return fileM21860 == null ? "vnd.android.document/directory" : m21863(fileM21860);
    }

    @Override // android.provider.DocumentsProvider
    public final String moveDocument(String str, String str2, String str3) throws FileNotFoundException {
        File fileM21860 = m21860(str, true);
        File fileM21861 = m21860(str3, true);
        if (fileM21860 != null && fileM21861 != null) {
            File file = new File(fileM21861, fileM21860.getName());
            if (!file.exists() && fileM21860.renameTo(file)) {
                StringBuilder sbM15339 = str3.endsWith("/") ? C5368.m15339(str3) : C7166.m19190(str3, "/");
                sbM15339.append(file.getName());
                return sbM15339.toString();
            }
        }
        throw new FileNotFoundException(C19462.m44858("Filed to move document ", str, " to ", str3));
    }

    @Override // android.provider.DocumentsProvider
    public final String renameDocument(String str, String str2) throws FileNotFoundException {
        File fileM21860 = m21860(str, true);
        if (fileM21860 == null || !fileM21860.renameTo(new File(fileM21860.getParentFile(), str2))) {
            throw new FileNotFoundException(C19462.m44858("Failed to rename document ", str, " to ", str2));
        }
        return str.substring(0, str.lastIndexOf(47, str.length() - 2)) + "/" + str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private File m21860(String str, boolean z) throws FileNotFoundException {
        String strSubstring;
        if (str.startsWith(this.f25421)) {
            String strSubstring2 = str.substring(this.f25421.length());
            if (strSubstring2.startsWith("/")) {
                strSubstring2 = strSubstring2.substring(1);
            }
            File file = null;
            if (strSubstring2.isEmpty()) {
                return null;
            }
            int iIndexOf = strSubstring2.indexOf(47);
            if (iIndexOf == -1) {
                strSubstring = "";
            } else {
                String strSubstring3 = strSubstring2.substring(0, iIndexOf);
                strSubstring = strSubstring2.substring(iIndexOf + 1);
                strSubstring2 = strSubstring3;
            }
            if (strSubstring2.equalsIgnoreCase(e.m)) {
                file = new File(this.f25422, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("android_data") && this.f25423 != null) {
                file = new File(this.f25423, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("android_obb") && this.f25424 != null) {
                file = new File(this.f25424, strSubstring);
            } else if (strSubstring2.equalsIgnoreCase("user_de_data") && this.f25420 != null) {
                file = new File(this.f25420, strSubstring);
            }
            if (file == null) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
            if (!z) {
                return file;
            }
            try {
                Os.lstat(file.getPath());
                return file;
            } catch (Exception unused) {
                throw new FileNotFoundException(str.concat(" not found"));
            }
        }
        throw new FileNotFoundException(str.concat(" not found"));
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryRoots(String[] strArr) {
        ApplicationInfo applicationInfo = getContext().getApplicationInfo();
        String string = applicationInfo.loadLabel(getContext().getPackageManager()).toString();
        if (strArr == null) {
            strArr = f25418;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        rowBuilderNewRow.add("root_id", this.f25421);
        rowBuilderNewRow.add("document_id", this.f25421);
        rowBuilderNewRow.add(ErrorBundle.SUMMARY_ENTRY, this.f25421);
        rowBuilderNewRow.add("flags", 17);
        rowBuilderNewRow.add("title", string);
        rowBuilderNewRow.add("mime_types", "*/*");
        rowBuilderNewRow.add("icon", Integer.valueOf(applicationInfo.icon));
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryDocument(String str, String[] strArr) throws FileNotFoundException {
        if (strArr == null) {
            strArr = f25419;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        m21861(matrixCursor, str, null);
        return matrixCursor;
    }

    @Override // android.provider.DocumentsProvider
    public final Cursor queryChildDocuments(String str, String[] strArr, String str2) throws FileNotFoundException {
        if (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (strArr == null) {
            strArr = f25419;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        File fileM21860 = m21860(str, true);
        if (fileM21860 == null) {
            m21861(matrixCursor, str.concat("/data"), this.f25422);
            File file = this.f25423;
            if (file != null && file.exists()) {
                m21861(matrixCursor, str.concat("/android_data"), this.f25423);
            }
            File file2 = this.f25424;
            if (file2 != null && file2.exists()) {
                m21861(matrixCursor, str.concat("/android_obb"), this.f25424);
            }
            File file3 = this.f25420;
            if (file3 != null && file3.exists()) {
                m21861(matrixCursor, str.concat("/user_de_data"), this.f25420);
                return matrixCursor;
            }
        } else {
            File[] fileArrListFiles = fileM21860.listFiles();
            if (fileArrListFiles == null) {
                throw new FileNotFoundException("Failed to list directory ".concat(str));
            }
            for (File file4 : fileArrListFiles) {
                StringBuilder sbM19190 = C7166.m19190(str, "/");
                sbM19190.append(file4.getName());
                m21861(matrixCursor, sbM19190.toString(), file4);
            }
        }
        return matrixCursor;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    @Override // android.provider.DocumentsProvider
    public final ParcelFileDescriptor openDocument(String str, String str2, CancellationSignal cancellationSignal) throws FileNotFoundException {
        int i;
        byte b = 0;
        File fileM21860 = m21860(str, false);
        if (fileM21860 == null) {
            throw new FileNotFoundException(str.concat(" not found"));
        }
        str2.getClass();
        switch (str2.hashCode()) {
            case 114:
                if (!str2.equals("r")) {
                    b = -1;
                }
                break;
            case 119:
                if (!str2.equals("w")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3653:
                if (!str2.equals("rw")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3786:
                if (!str2.equals("wa")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3805:
                if (!str2.equals("wt")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 113359:
                if (!str2.equals("rwt")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                i = 268435456;
                break;
            case 1:
            case 4:
                i = 738197504;
                break;
            case 2:
                i = 939524096;
                break;
            case 3:
                i = 704643072;
                break;
            case 5:
                i = 1006632960;
                break;
            default:
                throw new IllegalArgumentException("Invalid mode: ".concat(str2));
        }
        return ParcelFileDescriptor.open(fileM21860, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21862(File file) {
        if (file.isDirectory()) {
            try {
                if ((Os.lstat(file.getPath()).st_mode & 61440) != 40960) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            if (!m21862(file2)) {
                                return false;
                            }
                        }
                    }
                }
            } catch (ErrnoException unused) {
            }
        }
        return file.delete();
    }

    @Override // android.provider.DocumentsProvider
    public final void removeDocument(String str, String str2) throws FileNotFoundException {
        deleteDocument(str);
    }

    @Override // android.provider.DocumentsProvider
    public final boolean isChildDocument(String str, String str2) {
        return str2.startsWith(str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m21863(File file) {
        if (file.isDirectory()) {
            return "vnd.android.document/directory";
        }
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[Catch: Exception -> 0x00dd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:10:0x001d, B:12:0x0031, B:14:0x003b, B:47:0x00d2, B:21:0x0052, B:23:0x005a, B:25:0x0060, B:26:0x0065, B:27:0x0074, B:29:0x007c, B:31:0x0082, B:32:0x0086, B:33:0x008c, B:36:0x0098, B:37:0x00a3, B:39:0x00ab, B:41:0x00b1, B:42:0x00b5, B:43:0x00bb, B:46:0x00c7, B:13:0x0037), top: B:52:0x001d, inners: #1, #2 }] */
    @Override // android.provider.DocumentsProvider, android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundleCall = super.call(str, str2, bundle);
        if (bundleCall != null) {
            return bundleCall;
        }
        if (!str.startsWith("mt:")) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        try {
            List<String> pathSegments = ((Uri) bundle.getParcelable("uri")).getPathSegments();
            String str3 = pathSegments.size() >= 4 ? pathSegments.get(3) : pathSegments.get(1);
            int iHashCode = str.hashCode();
            if (iHashCode != -1645162251) {
                if (iHashCode != 214442514) {
                    if (iHashCode == 1713485102 && str.equals("mt:setLastModified")) {
                        File fileM21860 = m21860(str3, true);
                        if (fileM21860 == null) {
                            bundle2.putBoolean(o.c, false);
                        } else {
                            bundle2.putBoolean(o.c, fileM21860.setLastModified(bundle.getLong("time")));
                        }
                    } else {
                        bundle2.putBoolean(o.c, false);
                        bundle2.putString("message", "Unsupported method: ".concat(str));
                    }
                } else if (str.equals("mt:createSymlink")) {
                    File fileM21861 = m21860(str3, false);
                    if (fileM21861 == null) {
                        bundle2.putBoolean(o.c, false);
                    } else {
                        try {
                            Os.symlink(bundle.getString(MotionUtils.EASING_TYPE_PATH), fileM21861.getPath());
                            bundle2.putBoolean(o.c, true);
                        } catch (ErrnoException e) {
                            bundle2.putBoolean(o.c, false);
                            bundle2.putString("message", e.getMessage());
                        }
                    }
                } else {
                    bundle2.putBoolean(o.c, false);
                    bundle2.putString("message", "Unsupported method: ".concat(str));
                }
            } else if (str.equals("mt:setPermissions")) {
                File fileM21862 = m21860(str3, true);
                if (fileM21862 == null) {
                    bundle2.putBoolean(o.c, false);
                } else {
                    try {
                        Os.chmod(fileM21862.getPath(), bundle.getInt("permissions"));
                        bundle2.putBoolean(o.c, true);
                    } catch (ErrnoException e2) {
                        bundle2.putBoolean(o.c, false);
                        bundle2.putString("message", e2.getMessage());
                    }
                }
            } else {
                bundle2.putBoolean(o.c, false);
                bundle2.putString("message", "Unsupported method: ".concat(str));
            }
        } catch (Exception e3) {
            bundle2.putBoolean(o.c, false);
            bundle2.putString("message", e3.toString());
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21861(MatrixCursor matrixCursor, String str, File file) throws FileNotFoundException {
        int i;
        String name;
        boolean z = false;
        if (file == null) {
            file = m21860(str, true);
        }
        if (file == null) {
            MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
            rowBuilderNewRow.add("document_id", this.f25421);
            rowBuilderNewRow.add("_display_name", this.f25421);
            rowBuilderNewRow.add("_size", 0L);
            rowBuilderNewRow.add("mime_type", "vnd.android.document/directory");
            rowBuilderNewRow.add("last_modified", 0);
            rowBuilderNewRow.add("flags", 0);
            return;
        }
        if (file.isDirectory()) {
            if (file.canWrite()) {
                i = 8;
            } else {
                i = 0;
            }
        } else if (file.canWrite()) {
            i = 2;
        } else {
            i = 0;
        }
        if (file.getParentFile().canWrite()) {
            i |= 68;
        }
        String path = file.getPath();
        if (path.equals(this.f25422.getPath())) {
            name = e.m;
        } else {
            File file2 = this.f25423;
            if (file2 == null || !path.equals(file2.getPath())) {
                File file3 = this.f25424;
                if (file3 == null || !path.equals(file3.getPath())) {
                    File file4 = this.f25420;
                    if (file4 == null || !path.equals(file4.getPath())) {
                        name = file.getName();
                        z = true;
                    } else {
                        name = "user_de_data";
                    }
                } else {
                    name = "android_obb";
                }
            } else {
                name = "android_data";
            }
        }
        MatrixCursor.RowBuilder rowBuilderNewRow2 = matrixCursor.newRow();
        rowBuilderNewRow2.add("document_id", str);
        rowBuilderNewRow2.add("_display_name", name);
        rowBuilderNewRow2.add("_size", Long.valueOf(file.length()));
        rowBuilderNewRow2.add("mime_type", m21863(file));
        rowBuilderNewRow2.add("last_modified", Long.valueOf(file.lastModified()));
        rowBuilderNewRow2.add("flags", Integer.valueOf(i));
        rowBuilderNewRow2.add("mt_path", file.getAbsolutePath());
        if (z) {
            try {
                StringBuilder sb = new StringBuilder();
                StructStat structStatLstat = Os.lstat(path);
                sb.append(structStatLstat.st_mode);
                sb.append("|");
                sb.append(structStatLstat.st_uid);
                sb.append("|");
                sb.append(structStatLstat.st_gid);
                if ((structStatLstat.st_mode & 61440) == 40960) {
                    sb.append("|");
                    sb.append(Os.readlink(path));
                }
                rowBuilderNewRow2.add("mt_extras", sb.toString());
            } catch (Exception unused) {
            }
        }
    }
}
