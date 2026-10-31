package l;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۫᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C12625 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String f38044;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ServiceConnectionC3453 f38045;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f38046;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final NotificationManager f38047;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f38043 = new Object();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashSet f38042 = new HashSet();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Object f38041 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12625 m30887(Context context) {
        return new C12625(context);
    }

    public C12625(Context context) {
        this.f38046 = context;
        this.f38047 = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30891() {
        this.f38047.cancel(null, 1006);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30889(Notification notification) {
        NotificationManager notificationManager = this.f38047;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            C22503 c22503 = new C22503(this.f38046.getPackageName(), notification);
            synchronized (f38041) {
                if (f38045 == null) {
                    f38045 = new ServiceConnectionC3453(this.f38046.getApplicationContext());
                }
                f38045.m10572(c22503);
            }
            notificationManager.cancel(null, 1006);
            return;
        }
        notificationManager.notify(null, 1006, notification);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30890() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C21798.m49133(this.f38047);
        }
        Context context = this.f38046;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Set m30888(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f38043) {
            if (string != null) {
                if (!string.equals(f38044)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet2 = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet2.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f38042 = hashSet2;
                    f38044 = string;
                }
                hashSet = f38042;
            } else {
                hashSet = f38042;
            }
            throw th;
        }
        return hashSet;
    }
}
