package p067l;

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

/* JADX INFO: renamed from: l.۫᩶ */
/* JADX INFO: compiled from: G3SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C1468 {

    /* JADX INFO: renamed from: ᩳ */
    public static String f41070;

    /* JADX INFO: renamed from: ᩻ */
    public static ServiceConnectionC1013 f41071;

    /* JADX INFO: renamed from: ֫ */
    public final Context f41072;

    /* JADX INFO: renamed from: ۧ */
    public final NotificationManager f41073;

    /* JADX INFO: renamed from: ܿ */
    public static final Object f41069 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static HashSet f41068 = new HashSet();

    /* JADX INFO: renamed from: ܳ */
    public static final Object f41067 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static C1468 m32964(Context context) {
        return new C1468(context);
    }

    public C1468(Context context) {
        this.f41072 = context;
        this.f41073 = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32968() {
        this.f41073.cancel(null, 1006);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32966(Notification notification) {
        NotificationManager notificationManager = this.f41073;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            C1958 c1958 = new C1958(this.f41072.getPackageName(), notification);
            synchronized (f41067) {
                if (f41071 == null) {
                    f41071 = new ServiceConnectionC1013(this.f41072.getApplicationContext());
                }
                f41071.m12580(c1958);
            }
            notificationManager.cancel(null, 1006);
            return;
        }
        notificationManager.notify(null, 1006, notification);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32967() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1923.m51483(this.f41073);
        }
        Context context = this.f41072;
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

    /* JADX INFO: renamed from: ۧ */
    public static Set m32965(Context context) {
        HashSet hashSet;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f41069) {
            if (string != null) {
                if (!string.equals(f41070)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet2 = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet2.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f41068 = hashSet2;
                    f41070 = string;
                }
                hashSet = f41068;
            } else {
                hashSet = f41068;
            }
            throw th;
        }
        return hashSet;
    }
}
