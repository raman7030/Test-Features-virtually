package l;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: l.ܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C16690 extends C1080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18102 f51223;

    public C16690(C18102 c18102) {
        this.f51223 = c18102;
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f51223.f56354;
        layoutInflaterFactory2C5402.f16840.setVisibility(8);
        PopupWindow popupWindow = layoutInflaterFactory2C5402.f16820;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C5402.f16840.getParent() instanceof View) {
            C17648.m41339((View) layoutInflaterFactory2C5402.f16840.getParent());
        }
        layoutInflaterFactory2C5402.f16840.m50518();
        layoutInflaterFactory2C5402.f16834.m36602((InterfaceC21882) null);
        layoutInflaterFactory2C5402.f16834 = null;
        C17648.m41339(layoutInflaterFactory2C5402.f16848);
    }
}
