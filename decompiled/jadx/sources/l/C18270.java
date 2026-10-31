package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩳ᩶, reason: contains not printable characters */
/* JADX INFO: compiled from: W5IC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18270 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m42600(ActivityC1252 activityC1252) {
        Intent parentActivityIntent = activityC1252.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM42602 = m42602((Context) activityC1252, activityC1252.getComponentName());
            if (strM42602 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activityC1252, strM42602);
            try {
                if (m42602((Context) activityC1252, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m42601(ActivityC1252 activityC1252, ComponentName componentName) {
        String strM42602 = m42602((Context) activityC1252, componentName);
        if (strM42602 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM42602);
        if (m42602((Context) activityC1252, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42602(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else {
            i = i2 >= 24 ? 787072 : 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}
