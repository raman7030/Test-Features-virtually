package l;

import android.os.Bundle;

/* JADX INFO: renamed from: l.ܽۧ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 83VO */
/* JADX INFO: loaded from: classes4.dex */
public final class C16592 extends C20721 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18004 f50988;

    public C16592(AbstractC18004 abstractC18004) {
        this.f50988 = abstractC18004;
    }

    @Override // l.C20721
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14369 mo39088(int i) {
        return C14369.m34265(this.f50988.obtainAccessibilityNodeInfo(i));
    }

    @Override // l.C20721
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo39089(int i, int i2, Bundle bundle) {
        return this.f50988.performAction(i, i2, bundle);
    }

    @Override // l.C20721
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14369 mo39090(int i) {
        AbstractC18004 abstractC18004 = this.f50988;
        int i2 = i == 2 ? abstractC18004.mAccessibilityFocusedVirtualViewId : abstractC18004.mKeyboardFocusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo39088(i2);
    }
}
