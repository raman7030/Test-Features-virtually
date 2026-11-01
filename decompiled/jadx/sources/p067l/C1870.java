package p067l;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: l.᩷۟ */
/* JADX INFO: compiled from: K4SO */
/* JADX INFO: loaded from: classes4.dex */
public class C1870 {

    /* JADX INFO: renamed from: ֫ */
    public final AccessibilityNodeProvider f69409;

    /* JADX INFO: renamed from: ֫ */
    public C1555 mo41315(int i) {
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo41316(int i, int i2, Bundle bundle) {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public C1555 mo41317(int i) {
        return null;
    }

    public C1870() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f69409 = new C1170(this);
        } else {
            this.f69409 = new C2010(this);
        }
    }

    public C1870(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f69409 = accessibilityNodeProvider;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m49654() {
        return this.f69409;
    }
}
