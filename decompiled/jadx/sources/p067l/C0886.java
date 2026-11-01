package p067l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ۙ */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes2.dex */
public class C0886 {
    /* JADX INFO: renamed from: ܽ */
    public static Drawable m5548(Context context, int i) {
        return C1026.m13235(context, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public static ColorStateList m5547(Context context, int i) {
        return C1059.m14959(context.getResources(), i, context.getTheme());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m5542(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1761.m45316(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m5543(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C1468.m32964(context).m32967() ? 0 : -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Executor m5545(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0851.m3720(context);
        }
        return C1282.m24878(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5546(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1796.m46661(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m5544(Context context, Class cls) {
        String strM45318;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C1761.m45317(context, cls);
        }
        if (i >= 23) {
            strM45318 = C1761.m45318(context, cls);
        } else {
            strM45318 = (String) C1096.f18863.get(cls);
        }
        if (strM45318 != null) {
            return context.getSystemService(strM45318);
        }
        return null;
    }
}
