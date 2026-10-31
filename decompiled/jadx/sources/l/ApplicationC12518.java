package l;

import android.app.Application;
import android.os.Build;

/* JADX INFO: renamed from: l.۫ܺ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 59KE */
/* JADX INFO: loaded from: classes3.dex */
public class ApplicationC12518 extends Application {
    /* JADX INFO: renamed from: ۜۤܳ, reason: not valid java name and contains not printable characters */
    public static native void m30701(int i);

    static {
        System.loadLibrary("mtprotect");
        if (Build.VERSION.SDK_INT >= 28) {
            C11989.m29294("Landroid/", "Lcom/android/");
        }
    }
}
