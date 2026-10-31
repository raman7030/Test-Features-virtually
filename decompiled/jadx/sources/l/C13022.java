package l;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: renamed from: l.۬ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes3.dex */
public final class C13022 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f38974;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31605() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (f38974 == null) {
                try {
                    f38974 = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
                } catch (Exception e) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
                }
            }
            C22663.m50657(f38974);
        }
    }
}
