package p067l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿᩴ */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1711 implements InterfaceC1574 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C1326 f56707;

    /* JADX INFO: renamed from: ᩸ */
    public C1134 f56708;

    /* JADX INFO: renamed from: ᩹ */
    public C0994 f56709;

    @Override // p067l.InterfaceC1574
    public final boolean flagActionItems() {
        return false;
    }

    @Override // p067l.InterfaceC1574
    public final int getId() {
        return 0;
    }

    @Override // p067l.InterfaceC1574
    public final void onCloseMenu(C0994 c0994, boolean z) {
    }

    @Override // p067l.InterfaceC1574
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // p067l.InterfaceC1574
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // p067l.InterfaceC1574
    public final boolean onSubMenuSelected(SubMenuC1819 subMenuC1819) {
        return false;
    }

    public C1711(C1326 c1326) {
        this.f56707 = c1326;
    }

    @Override // p067l.InterfaceC1574
    public final void initForMenu(Context context, C0994 c0994) {
        C1134 c1134;
        C0994 c0995 = this.f56709;
        if (c0995 != null && (c1134 = this.f56708) != null) {
            c0995.collapseItemActionView(c1134);
        }
        this.f56709 = c0994;
    }

    @Override // p067l.InterfaceC1574
    public final void updateMenuView(boolean z) {
        if (this.f56708 != null) {
            C0994 c0994 = this.f56709;
            if (c0994 != null) {
                int size = c0994.size();
                for (int i = 0; i < size; i++) {
                    if (this.f56709.getItem(i) == this.f56708) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f56709, this.f56708);
        }
    }

    @Override // p067l.InterfaceC1574
    public final boolean expandItemActionView(C0994 c0994, C1134 c1134) {
        C1326 c1326 = this.f56707;
        c1326.ensureCollapseButtonView();
        ViewParent parent = c1326.mCollapseButtonView.getParent();
        if (parent != c1326) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c1326.mCollapseButtonView);
            }
            c1326.addView(c1326.mCollapseButtonView);
        }
        View actionView = c1134.getActionView();
        c1326.mExpandedActionView = actionView;
        this.f56708 = c1134;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != c1326) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(c1326.mExpandedActionView);
            }
            C1571 c1571GenerateDefaultLayoutParams = c1326.generateDefaultLayoutParams();
            c1571GenerateDefaultLayoutParams.f42796 = (c1326.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c1571GenerateDefaultLayoutParams.f48009 = 2;
            c1326.mExpandedActionView.setLayoutParams(c1571GenerateDefaultLayoutParams);
            c1326.addView(c1326.mExpandedActionView);
        }
        c1326.removeChildrenForExpandedActionView();
        c1326.requestLayout();
        c1134.m18378(true);
        KeyEvent.Callback callback = c1326.mExpandedActionView;
        if (callback instanceof InterfaceC1508) {
            ((InterfaceC1508) callback).mo34562();
        }
        c1326.updateBackInvokedCallbackState();
        return true;
    }

    @Override // p067l.InterfaceC1574
    public final boolean collapseItemActionView(C0994 c0994, C1134 c1134) {
        C1326 c1326 = this.f56707;
        KeyEvent.Callback callback = c1326.mExpandedActionView;
        if (callback instanceof InterfaceC1508) {
            ((InterfaceC1508) callback).mo34563();
        }
        c1326.removeView(c1326.mExpandedActionView);
        c1326.removeView(c1326.mCollapseButtonView);
        c1326.mExpandedActionView = null;
        c1326.addChildrenForExpandedActionView();
        this.f56708 = null;
        c1326.requestLayout();
        c1134.m18378(false);
        c1326.updateBackInvokedCallbackState();
        return true;
    }
}
