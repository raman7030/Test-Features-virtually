package l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* JADX INFO: renamed from: l.۟ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes3.dex */
public final class C7549 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f23326;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File f23327;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f23328;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final File f23329;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f23330;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f23331;

    public C7549(int i, String str, String str2, File file) {
        this.f23330 = i;
        this.f23328 = str;
        this.f23326 = str2;
        this.f23329 = file;
        this.f23327 = new File(file, "bash");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20275() {
        File file = this.f23327;
        return file.exists() && file.canExecute();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final File m20276() {
        boolean z = C2094.f6977;
        File file = this.f23329;
        if (z) {
            AbstractC15440 abstractC15440M39864 = C16999.m39864(C2094.f6976);
            if (abstractC15440M39864.mo23120()) {
                if (!abstractC15440M39864.m36533() || !C11003.equals(abstractC15440M39864.m36519(), file.getAbsolutePath())) {
                    abstractC15440M39864.mo23552();
                } else {
                    return C2094.f6976;
                }
            }
            try {
                Os.symlink(file.getAbsolutePath(), C2094.f6976.getAbsolutePath());
                return C2094.f6976;
            } catch (ErrnoException unused) {
            }
        }
        return file;
    }
}
