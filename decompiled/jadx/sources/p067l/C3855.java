package p067l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: l.֫ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: LAIU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3855 {

    /* JADX INFO: renamed from: ֫ */
    public ComponentName f8298;

    /* JADX INFO: renamed from: ۧ */
    public ComponentName f8299;

    /* JADX INFO: renamed from: ܽ */
    public ComponentName f8300;

    /* JADX INFO: renamed from: ᩳ */
    public int f8301;

    public C3855(Context context) {
        ComponentName componentName = new ComponentName(context, "bin.mt.plus.MainLightIcon");
        this.f8299 = componentName;
        ComponentName componentName2 = new ComponentName(context, "bin.mt.plus.MainDarkIcon");
        this.f8298 = componentName2;
        this.f8300 = new ComponentName(context, "bin.mt.plus.MainNoBgIcon");
        PackageManager packageManagerM16217 = C7050.m16217();
        int componentEnabledSetting = packageManagerM16217.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
            this.f8301 = 0;
        } else if (packageManagerM16217.getComponentEnabledSetting(componentName2) == 1) {
            this.f8301 = 1;
        } else {
            this.f8301 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final ComponentName m7574() {
        int i = this.f8301;
        if (i == 0) {
            return this.f8299;
        }
        if (i == 1) {
            return this.f8298;
        }
        if (i == 2) {
            return this.f8300;
        }
        throw new RuntimeException();
    }
}
