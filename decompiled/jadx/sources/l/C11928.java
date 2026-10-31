package l;

import android.content.ComponentName;
import android.os.Bundle;

/* JADX INFO: renamed from: l.ۨ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11928 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentName f35659;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f35660;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f35661 = 1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m29104(C11928 c11928) {
        c11928.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("shizuku:user-service-arg-component", c11928.f35659);
        bundle.putBoolean("shizuku:user-service-arg-debuggable", false);
        bundle.putInt("shizuku:user-service-arg-version-code", c11928.f35661);
        bundle.putBoolean("shizuku:user-service-arg-daemon", true);
        bundle.putBoolean("shizuku:user-service-arg-use-32-bit-app-process", false);
        String str = c11928.f35660;
        C11003.requireNonNull(str, "process name suffix must not be null");
        bundle.putString("shizuku:user-service-arg-process-name", str);
        return bundle;
    }

    public C11928(ComponentName componentName) {
        this.f35659 = componentName;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29106() {
        this.f35661 = 26101061;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29105() {
        this.f35660 = "cmd";
    }
}
