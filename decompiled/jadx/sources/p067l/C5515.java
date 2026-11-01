package p067l;

import android.app.Dialog;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

/* JADX INFO: renamed from: l.ۗܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5515 {
    /* JADX INFO: renamed from: ֫ */
    public static void m12161(Window window) {
        if (window == null) {
            return;
        }
        window.setFlags(1024, 1024);
        int i = Build.VERSION.SDK_INT;
        window.getDecorView().setSystemUiVisibility(1280);
        window.addFlags(Integer.MIN_VALUE);
        if (i >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12160(Dialog dialog, Handler handler) {
        if (dialog.getContext() == null || handler == null) {
            return;
        }
        Toast.makeText(dialog.getContext(), "网页加载异常，请自行下载并安装QQ后，再重新登录。", 0).show();
        handler.postDelayed(new RunnableC2832(dialog), 100L);
    }
}
