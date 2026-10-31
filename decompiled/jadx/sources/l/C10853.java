package l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ۧ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10853 extends C6495 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2386 f32607;

    @Override // l.AbstractC17366
    public final boolean requestChildRectangleOnScreen(C13132 c13132, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10853(C2386 c2386, Context context) {
        super(context);
        this.f32607 = c2386;
    }

    @Override // l.AbstractC17366
    public final boolean performAccessibilityAction(C2550 c2550, C21600 c21600, int i, Bundle bundle) {
        this.f32607.f7610.getClass();
        return super.performAccessibilityAction(c2550, c21600, i, bundle);
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfo(C2550 c2550, C21600 c21600, C14369 c14369) {
        super.onInitializeAccessibilityNodeInfo(c2550, c21600, c14369);
        this.f32607.f7610.getClass();
    }

    @Override // l.AbstractC17366
    public final void onInitializeAccessibilityNodeInfoForItem(C2550 c2550, C21600 c21600, View view, C14369 c14369) {
        C2386 c2386 = this.f32607.f7610.f75611;
        c14369.m34286(C17898.m41877(c2386.m7724() == 1 ? c2386.f7606.getPosition(view) : 0, 1, c2386.m7724() == 0 ? c2386.f7606.getPosition(view) : 0, 1, false, false));
    }

    @Override // l.C6495
    public final void calculateExtraLayoutSpace(C21600 c21600, int[] iArr) {
        int height;
        int paddingBottom;
        C2386 c2386 = this.f32607;
        int iM7722 = c2386.m7722();
        if (iM7722 != -1) {
            C13132 c13132 = c2386.f7607;
            if (c2386.m7724() == 0) {
                height = c13132.getWidth() - c13132.getPaddingLeft();
                paddingBottom = c13132.getPaddingRight();
            } else {
                height = c13132.getHeight() - c13132.getPaddingTop();
                paddingBottom = c13132.getPaddingBottom();
            }
            int i = (height - paddingBottom) * iM7722;
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        super.calculateExtraLayoutSpace(c21600, iArr);
    }
}
