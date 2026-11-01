package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.AttributeSet;
import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۖۙ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: R8VJ */
/* JADX INFO: loaded from: classes3.dex */
public class C4566 extends AbstractC5907 {
    public C4566(Context context) {
        super(context);
        m9024((InterfaceC9544) new C9417());
    }

    public C4566(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9024((InterfaceC9544) new C9417());
    }

    public C4566(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9024((InterfaceC9544) new C9417());
    }

    public C4566(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m9024((InterfaceC9544) new C9417());
    }

    /* JADX INFO: renamed from: ۢ֫ */
    public static /* synthetic */ String m9640() {
        PackageManager packageManagerM16217 = C7050.m16217();
        try {
            ComponentName componentNameM9638 = m9638(packageManagerM16217);
            if (componentNameM9638 != null) {
                return m9639(packageManagerM16217, componentNameM9638);
            }
        } catch (Exception unused) {
            ApplicationC21448.f67649.edit().remove("dsai").apply();
        }
        try {
            return m9639(packageManagerM16217, m9641(packageManagerM16217));
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m9639(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 0);
        String string = activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String string2 = activityInfo.loadLabel(packageManager).toString();
        if (string.contains(string2)) {
            StringBuilder sbM21133 = C9179.m21133(string, " (");
            sbM21133.append(componentName.getPackageName());
            sbM21133.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sbM21133.toString();
        }
        return string + " - " + string2 + " (" + componentName.getPackageName() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // p067l.AbstractC5907
    /* JADX INFO: renamed from: ֫ */
    public final void mo8363(AbstractActivityC5549 abstractActivityC5549) {
        C6001.m13504(abstractActivityC5549, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ComponentName m9638(PackageManager packageManager) {
        String string = ApplicationC21448.f67649.getString("dsai", null);
        if (string != null && !string.isEmpty()) {
            String[] strArrSplit = string.split("/", 2);
            if (strArrSplit.length == 2) {
                try {
                    ComponentName componentName = new ComponentName(strArrSplit[0], strArrSplit[1]);
                    if (packageManager != null) {
                        packageManager.getActivityInfo(componentName, 0);
                    }
                    return componentName;
                } catch (Exception unused) {
                    ApplicationC21448.f67649.edit().remove("dsai").apply();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static ComponentName m9641(PackageManager packageManager) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(C17853.f53284.m38684("a.apk").m38667(), "application/vnd.android.package-archive");
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo.packageName.equals("android")) {
                return null;
            }
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p067l.C4360
    /* JADX INFO: renamed from: ۬ */
    public final void mo9048() {
        super.mo9048();
    }
}
