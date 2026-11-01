package p067l;

import android.system.ErrnoException;
import android.system.Os;
import java.io.File;

/* JADX INFO: renamed from: l.۟ܶۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19BY */
/* JADX INFO: loaded from: classes3.dex */
public final class C9543 {

    /* JADX INFO: renamed from: ֫ */
    public final String f26238;

    /* JADX INFO: renamed from: ۧ */
    public final File f26239;

    /* JADX INFO: renamed from: ܳ */
    public final String f26240;

    /* JADX INFO: renamed from: ܽ */
    public final File f26241;

    /* JADX INFO: renamed from: ܿ */
    public final int f26242;

    /* JADX INFO: renamed from: ᩳ */
    public String f26243;

    public C9543(int i, String str, String str2, File file) {
        this.f26242 = i;
        this.f26240 = str;
        this.f26238 = str2;
        this.f26241 = file;
        this.f26239 = new File(file, "bash");
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22251() {
        File file = this.f26239;
        return file.exists() && file.canExecute();
    }

    /* JADX INFO: renamed from: ۧ */
    public final File m22252() {
        boolean z = C4359.f9761;
        File file = this.f26241;
        if (z) {
            AbstractC17043 abstractC17043M42107 = C18524.m42107(C4359.f9760);
            if (abstractC17043M42107.mo25094()) {
                if (!abstractC17043M42107.m38691() || !C12826.equals(abstractC17043M42107.m38677(), file.getAbsolutePath())) {
                    abstractC17043M42107.mo25503();
                } else {
                    return C4359.f9760;
                }
            }
            try {
                Os.symlink(file.getAbsolutePath(), C4359.f9760.getAbsolutePath());
                return C4359.f9760;
            } catch (ErrnoException unused) {
            }
        }
        return file;
    }
}
