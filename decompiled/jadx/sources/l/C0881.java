package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: J4M5 */
/* JADX INFO: loaded from: classes2.dex */
public class C0881 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Drawable m3234(Context context, int i) {
        return C3704.m11288(context, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m3233(Context context, int i) {
        return C4369.m13095(context.getResources(), i, context.getTheme());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3228(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C18521.m43038(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m3229(Context context, String str) {
        if (str == null) {
            throw new NullPointerException("permission must be non-null");
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return C12625.m30887(context).m30890() ? 0 : -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Executor m3231(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0175.m1312(context);
        }
        return C8870.m22907(new Handler(context.getMainLooper()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3232(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            C19227.m44367(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m3230(Context context, Class cls) {
        String strM43040;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C18521.m43039(context, cls);
        }
        if (i >= 23) {
            strM43040 = C18521.m43040(context, cls);
        } else {
            strM43040 = (String) C5115.f16029.get(cls);
        }
        if (strM43040 != null) {
            return context.getSystemService(strM43040);
        }
        return null;
    }
}
