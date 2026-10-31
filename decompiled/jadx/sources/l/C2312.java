package l;

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
public class C2312 extends AbstractC3723 {
    public C2312(Context context) {
        super(context);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C7416());
    }

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m7570() {
        PackageManager packageManagerM14320 = C4925.m14320();
        try {
            ComponentName componentNameM7568 = m7568(packageManagerM14320);
            if (componentNameM7568 != null) {
                return m7569(packageManagerM14320, componentNameM7568);
            }
        } catch (Exception unused) {
            ApplicationC20075.f65008.edit().remove("dsai").apply();
        }
        try {
            return m7569(packageManagerM14320, m7571(packageManagerM14320));
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7569(PackageManager packageManager, ComponentName componentName) throws PackageManager.NameNotFoundException {
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 0);
        String string = activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String string2 = activityInfo.loadLabel(packageManager).toString();
        if (string.contains(string2)) {
            StringBuilder sbM19190 = C7166.m19190(string, " (");
            sbM19190.append(componentName.getPackageName());
            sbM19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return sbM19190.toString();
        }
        return string + " - " + string2 + " (" + componentName.getPackageName() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC3723
    /* JADX INFO: renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        C3822.m11568(abstractActivityC3346, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentName m7568(PackageManager packageManager) {
        String string = ApplicationC20075.f65008.getString("dsai", null);
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
                    ApplicationC20075.f65008.edit().remove("dsai").apply();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ComponentName m7571(PackageManager packageManager) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(C16293.f50117.m36526("a.apk").m36509(), "application/vnd.android.package-archive");
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

    @Override // l.C2095
    /* JADX INFO: renamed from: ۬ */
    public final void mo6922() {
        super.mo6922();
    }
}
