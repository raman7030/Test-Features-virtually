package l;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V659 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17522 implements InterfaceC14762 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9762 f53516;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5882 f53517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3060 f53518;

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public final int getId() {
        return 0;
    }

    @Override // l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        return false;
    }

    public C17522(C9762 c9762) {
        this.f53516 = c9762;
    }

    @Override // l.InterfaceC14762
    public final void initForMenu(Context context, C3060 c3060) {
        C5882 c5882;
        C3060 c3061 = this.f53518;
        if (c3061 != null && (c5882 = this.f53517) != null) {
            c3061.collapseItemActionView(c5882);
        }
        this.f53518 = c3060;
    }

    @Override // l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        if (this.f53517 != null) {
            C3060 c3060 = this.f53518;
            if (c3060 != null) {
                int size = c3060.size();
                for (int i = 0; i < size; i++) {
                    if (this.f53518.getItem(i) == this.f53517) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.f53518, this.f53517);
        }
    }

    @Override // l.InterfaceC14762
    public final boolean expandItemActionView(C3060 c3060, C5882 c5882) {
        C9762 c9762 = this.f53516;
        c9762.ensureCollapseButtonView();
        ViewParent parent = c9762.mCollapseButtonView.getParent();
        if (parent != c9762) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c9762.mCollapseButtonView);
            }
            c9762.addView(c9762.mCollapseButtonView);
        }
        View actionView = c5882.getActionView();
        c9762.mExpandedActionView = actionView;
        this.f53517 = c5882;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != c9762) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(c9762.mExpandedActionView);
            }
            C14699 c14699GenerateDefaultLayoutParams = c9762.generateDefaultLayoutParams();
            c14699GenerateDefaultLayoutParams.f39731 = (c9762.mButtonGravity & UMErrorCode.E_UM_BE_DEFLATE_FAILED) | 8388611;
            c14699GenerateDefaultLayoutParams.f44895 = 2;
            c9762.mExpandedActionView.setLayoutParams(c14699GenerateDefaultLayoutParams);
            c9762.addView(c9762.mExpandedActionView);
        }
        c9762.removeChildrenForExpandedActionView();
        c9762.requestLayout();
        c5882.m16452(true);
        KeyEvent.Callback callback = c9762.mExpandedActionView;
        if (callback instanceof InterfaceC13434) {
            ((InterfaceC13434) callback).mo32460();
        }
        c9762.updateBackInvokedCallbackState();
        return true;
    }

    @Override // l.InterfaceC14762
    public final boolean collapseItemActionView(C3060 c3060, C5882 c5882) {
        C9762 c9762 = this.f53516;
        KeyEvent.Callback callback = c9762.mExpandedActionView;
        if (callback instanceof InterfaceC13434) {
            ((InterfaceC13434) callback).mo32461();
        }
        c9762.removeView(c9762.mExpandedActionView);
        c9762.removeView(c9762.mCollapseButtonView);
        c9762.mExpandedActionView = null;
        c9762.addChildrenForExpandedActionView();
        this.f53517 = null;
        c9762.requestLayout();
        c5882.m16452(false);
        c9762.updateBackInvokedCallbackState();
        return true;
    }
}
