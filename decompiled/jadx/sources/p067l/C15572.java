package p067l;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.ܰܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C15572 {

    /* JADX INFO: renamed from: ֫ */
    public static String f44499;

    /* JADX INFO: renamed from: ֫ */
    public static String m35422(Context context) {
        if (!TextUtils.isEmpty(f44499)) {
            return f44499;
        }
        if (context == null) {
            return "";
        }
        f44499 = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f44499 = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f44499;
    }
}
