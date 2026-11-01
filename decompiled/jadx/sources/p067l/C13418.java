package p067l;

import android.content.pm.ApplicationInfo;
import dalvik.system.DexClassLoader;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13418 extends DexClassLoader {

    /* JADX INFO: renamed from: ֫ */
    public ApplicationInfo f37643;

    /* JADX INFO: renamed from: ֫ */
    public final void m30563(ApplicationInfo applicationInfo) {
        this.f37643 = applicationInfo;
    }

    @Override // dalvik.system.BaseDexClassLoader
    public final String toString() {
        ApplicationInfo applicationInfo = this.f37643;
        if (applicationInfo == null) {
            return super.toString();
        }
        Locale locale = Locale.ENGLISH;
        return C21459.m48622("dalvik.system.DexClassLoader[DexPathList[[zip file \"", applicationInfo.sourceDir, "\"],nativeLibraryDirectories=[", applicationInfo.nativeLibraryDir, ", /system/lib, /system/product/lib]]]");
    }
}
