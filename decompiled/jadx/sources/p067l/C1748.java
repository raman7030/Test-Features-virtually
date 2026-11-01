package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ᩳ᩶ */
/* JADX INFO: compiled from: W5IC */
/* JADX INFO: loaded from: classes4.dex */
public final class C1748 {
    /* JADX INFO: renamed from: ֫ */
    public static Intent m44859(ActivityC0904 activityC0904) {
        Intent parentActivityIntent = activityC0904.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM44861 = m44861((Context) activityC0904, activityC0904.getComponentName());
            if (strM44861 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activityC0904, strM44861);
            try {
                if (m44861((Context) activityC0904, componentName) == null) {
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

    /* JADX INFO: renamed from: ֫ */
    public static Intent m44860(ActivityC0904 activityC0904, ComponentName componentName) {
        String strM44861 = m44861((Context) activityC0904, componentName);
        if (strM44861 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM44861);
        if (m44861((Context) activityC0904, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m44861(Context context, ComponentName componentName) {
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
