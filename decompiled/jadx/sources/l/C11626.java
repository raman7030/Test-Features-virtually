package l;

import android.content.pm.ApplicationInfo;
import dalvik.system.DexClassLoader;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A1X2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11626 extends DexClassLoader {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ApplicationInfo f34646;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28517(ApplicationInfo applicationInfo) {
        this.f34646 = applicationInfo;
    }

    @Override // dalvik.system.BaseDexClassLoader
    public final String toString() {
        ApplicationInfo applicationInfo = this.f34646;
        if (applicationInfo == null) {
            return super.toString();
        }
        Locale locale = Locale.ENGLISH;
        return C20087.m46306("dalvik.system.DexClassLoader[DexPathList[[zip file \"", applicationInfo.sourceDir, "\"],nativeLibraryDirectories=[", applicationInfo.nativeLibraryDir, ", /system/lib, /system/product/lib]]]");
    }
}
