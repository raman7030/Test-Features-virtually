package p067l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܽۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18137 extends C1870 {

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC19479 f54165;

    public C18137(AbstractC19479 abstractC19479) {
        this.f54165 = abstractC19479;
    }

    @Override // p067l.C1870
    /* JADX INFO: renamed from: ֫ */
    public final C1555 mo41315(int i) {
        return C1555.m36398(this.f54165.obtainAccessibilityNodeInfo(i));
    }

    @Override // p067l.C1870
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo41316(int i, int i2, Bundle bundle) {
        return this.f54165.performAction(i, i2, bundle);
    }

    @Override // p067l.C1870
    /* JADX INFO: renamed from: ۧ */
    public final C1555 mo41317(int i) {
        AbstractC19479 abstractC19479 = this.f54165;
        int i2 = i == 2 ? abstractC19479.mAccessibilityFocusedVirtualViewId : abstractC19479.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo41315(i2);
    }
}
