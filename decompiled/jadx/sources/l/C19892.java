package l;

import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: l.᩶ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C19892 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45746(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C22008.m49530(theme);
        } else if (i >= 23) {
            C21303.m48333(theme);
        }
    }
}
