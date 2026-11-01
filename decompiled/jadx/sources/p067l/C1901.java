package p067l;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩸ۙ */
/* JADX INFO: compiled from: 3650 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1901 implements InterfaceC1586 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f71472 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final void m50712(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Name must not be empty");
        }
        try {
            this.f71472.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    @Override // p067l.InterfaceC1586
    /* JADX INFO: renamed from: ֫ */
    public final File mo37674(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f71472.get(strDecode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            String path = canonicalFile.getPath();
            String path2 = file.getPath();
            String strM51943 = C1936.m51943(path);
            String strM51944 = C1936.m51943(path2);
            if (!strM51943.equals(strM51944)) {
                if (!strM51943.startsWith(strM51944 + '/')) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
            }
            return canonicalFile;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
