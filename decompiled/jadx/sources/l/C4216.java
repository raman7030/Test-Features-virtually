package l;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ۘ᩸ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L51E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4216 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f13685;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f13686;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f13687;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f13688;

    public C4216(File file, String str) {
        File absoluteFile = file.getAbsoluteFile();
        this.f13687 = absoluteFile;
        this.f13688 = str;
        this.f13686 = null;
        this.f13685 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public C4216(File file, String str, String str2) {
        File absoluteFile = file.getAbsoluteFile();
        this.f13687 = absoluteFile;
        this.f13688 = str;
        this.f13686 = TextUtils.isEmpty(str2) ? null : str2;
        this.f13685 = absoluteFile.getPath().toLowerCase() + '/';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4216.class == obj.getClass()) {
            C4216 c4216 = (C4216) obj;
            String str = c4216.f13688;
            File file = c4216.f13687;
            File file2 = this.f13687;
            if (file2 == null ? file != null : !file2.equals(file)) {
                return false;
            }
            String str2 = this.f13688;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.f13686;
            String str4 = c4216.f13686;
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
        File file = this.f13687;
        int iHashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f13688;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13686;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
