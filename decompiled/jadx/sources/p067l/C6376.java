package p067l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ۘ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51E */
/* JADX INFO: loaded from: classes2.dex */
public final class C6376 {

    /* JADX INFO: renamed from: ֫ */
    public final String f16498;

    /* JADX INFO: renamed from: ۧ */
    public String f16499;

    /* JADX INFO: renamed from: ܽ */
    public final File f16500;

    /* JADX INFO: renamed from: ᩳ */
    public final String f16501;

    public C6376(File file, String str) {
        File absoluteFile = file.getAbsoluteFile();
        this.f16500 = absoluteFile;
        this.f16501 = str;
        this.f16499 = null;
        this.f16498 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public C6376(File file, String str, String str2) {
        File absoluteFile = file.getAbsoluteFile();
        this.f16500 = absoluteFile;
        this.f16501 = str;
        this.f16499 = TextUtils.isEmpty(str2) ? null : str2;
        this.f16498 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6376.class == obj.getClass()) {
            C6376 c6376 = (C6376) obj;
            String str = c6376.f16501;
            File file = c6376.f16500;
            File file2 = this.f16500;
            if (file2 == null ? file != null : !file2.equals(file)) {
                return false;
            }
            String str2 = this.f16501;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f16499;
            String str4 = c6376.f16499;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        File file = this.f16500;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f16501;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16499;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
