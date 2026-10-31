package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;

/* JADX INFO: renamed from: l.ܰܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13893 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f41418;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33303(Context context) {
        if (!TextUtils.isEmpty(f41418)) {
            return f41418;
        }
        if (context == null) {
            return "";
        }
        f41418 = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f41418 = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f41418;
    }
}
