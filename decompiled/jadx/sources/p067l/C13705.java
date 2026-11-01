package p067l;

import android.content.ComponentName;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۨ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class C13705 {

    /* JADX INFO: renamed from: ֫ */
    public final ComponentName f38668;

    /* JADX INFO: renamed from: ۧ */
    public String f38669;

    /* JADX INFO: renamed from: ܽ */
    public int f38670 = 1;

    /* JADX INFO: renamed from: ֫ */
    public static Bundle m31157(C13705 c13705) {
        c13705.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", c13705.f38668);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", c13705.f38670);
        bundle.putBoolean("shizuku:user-service-arg-daemon", true);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = c13705.f38669;
        C12826.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        return bundle;
    }

    public C13705(ComponentName componentName) {
        this.f38668 = componentName;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31159() {
        this.f38670 = 26101061;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31158() {
        this.f38669 = "cmd";
    }
}
