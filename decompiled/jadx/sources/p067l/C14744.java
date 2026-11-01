package p067l;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: renamed from: l.۬ۢ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R4WE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14744 {

    /* JADX INFO: renamed from: ֫ */
    @SuppressLint({"StaticFieldLeak"})
    public static Context f42020;

    /* JADX INFO: renamed from: ֫ */
    public static void m33690() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (f42020 == null) {
                try {
                    f42020 = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
                } catch (Exception e) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e);
                }
            }
            C23907.m52983(f42020);
        }
    }
}
