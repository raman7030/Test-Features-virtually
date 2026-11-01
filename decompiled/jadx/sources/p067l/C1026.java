package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: l.ۘۙ */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026 {
    /* JADX INFO: renamed from: ֫ */
    public static Drawable m13235(Context context, int i) {
        return context.getDrawable(i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static File m13237(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* JADX INFO: renamed from: ֫ */
    public static File m13236(Context context) {
        return context.getCodeCacheDir();
    }
}
