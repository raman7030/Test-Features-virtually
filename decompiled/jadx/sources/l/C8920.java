package l;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.ۡܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q69A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8920 extends C16445 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0452 f27124;

    public C8920(C0452 c0452) {
        this.f27124 = c0452;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // l.C16445
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC12014 abstractC12014;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(C0452.class.getName());
        C0452 c0452 = this.f27124;
        AbstractC12014 abstractC12015 = c0452.f2007;
        if (abstractC12015 != null) {
            z = abstractC12015.mo11916() > 1;
        }
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() != 4096 || (abstractC12014 = c0452.f2007) == null) {
            return;
        }
        accessibilityEvent.setItemCount(abstractC12014.mo11916());
        accessibilityEvent.setFromIndex(c0452.f1989);
        accessibilityEvent.setToIndex(c0452.f1989);
    }

    @Override // l.C16445
    public final void onInitializeAccessibilityNodeInfo(View view, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(view, c14369);
        c14369.m34281((CharSequence) C0452.class.getName());
        C0452 c0452 = this.f27124;
        AbstractC12014 abstractC12014 = c0452.f2007;
        c14369.m34313(abstractC12014 != null && abstractC12014.mo11916() > 1);
        if (c0452.canScrollHorizontally(1)) {
            c14369.m34275(4096);
        }
        if (c0452.canScrollHorizontally(-1)) {
            c14369.m34275(8192);
        }
    }

    @Override // l.C16445
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        C0452 c0452 = this.f27124;
        if (i == 4096) {
            if (!c0452.canScrollHorizontally(1)) {
                return false;
            }
            c0452.m2043(c0452.f1989 + 1);
            return true;
        }
        if (i != 8192 || !c0452.canScrollHorizontally(-1)) {
            return false;
        }
        c0452.m2043(c0452.f1989 - 1);
        return true;
    }
}
