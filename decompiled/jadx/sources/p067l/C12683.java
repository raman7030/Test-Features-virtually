package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: l.ۧ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12683 extends C8541 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4636 f35583;

    @Override // p067l.AbstractC18873
    public final boolean requestChildRectangleOnScreen(C14849 c14849, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12683(C4636 c4636, Context context) {
        super(context);
        this.f35583 = c4636;
    }

    @Override // p067l.AbstractC18873
    public final boolean performAccessibilityAction(C4792 c4792, C22897 c22897, int i, Bundle bundle) {
        this.f35583.f10401.getClass();
        return super.performAccessibilityAction(c4792, c22897, i, bundle);
    }

    @Override // p067l.AbstractC18873
    public final void onInitializeAccessibilityNodeInfo(C4792 c4792, C22897 c22897, C1555 c1555) {
        super.onInitializeAccessibilityNodeInfo(c4792, c22897, c1555);
        this.f35583.f10401.getClass();
    }

    @Override // p067l.AbstractC18873
    public final void onInitializeAccessibilityNodeInfoForItem(C4792 c4792, C22897 c22897, View view, C1555 c1555) {
        C4636 c4636 = this.f35583.f10401.f78357;
        c1555.m36419(C1730.m44124(c4636.m9785() == 1 ? c4636.f10397.getPosition(view) : 0, 1, c4636.m9785() == 0 ? c4636.f10397.getPosition(view) : 0, 1, false, false));
    }

    @Override // p067l.C8541
    public final void calculateExtraLayoutSpace(C22897 c22897, int[] iArr) {
        int height;
        int paddingBottom;
        C4636 c4636 = this.f35583;
        int iM9783 = c4636.m9783();
        if (iM9783 != -1) {
            C14849 c14849 = c4636.f10398;
            if (c4636.m9785() == 0) {
                height = c14849.getWidth() - c14849.getPaddingLeft();
                paddingBottom = c14849.getPaddingRight();
            } else {
                height = c14849.getHeight() - c14849.getPaddingTop();
                paddingBottom = c14849.getPaddingBottom();
            }
            int i = (height - paddingBottom) * iM9783;
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        super.calculateExtraLayoutSpace(c22897, iArr);
    }
}
