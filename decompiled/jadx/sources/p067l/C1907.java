package p067l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.᩸ۡ */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class C1907 extends C1303 implements InterfaceC1067 {

    /* JADX INFO: renamed from: ֡֫ */
    public ListAdapter f71786;

    /* JADX INFO: renamed from: ֨֫ */
    public int f71787;

    /* JADX INFO: renamed from: ۚ֫ */
    public CharSequence f71788;

    /* JADX INFO: renamed from: ۠֫ */
    public final Rect f71789;

    /* JADX INFO: renamed from: ܶ֫ */
    public final /* synthetic */ C0997 f71790;

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4051(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f31105;
        boolean zIsShowing = popupWindow.isShowing();
        m50952();
        m25851();
        show();
        C1462 c1462 = this.f31096;
        c1462.setChoiceMode(1);
        c1462.setTextDirection(i);
        c1462.setTextAlignment(i2);
        C0997 c0997 = this.f71790;
        int selectedItemPosition = c0997.getSelectedItemPosition();
        C1462 c1463 = this.f31096;
        if (popupWindow.isShowing() && c1463 != null) {
            c1463.m32745(false);
            c1463.setSelection(selectedItemPosition);
            if (c1463.getChoiceMode() != 0) {
                c1463.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c0997.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1242 viewTreeObserverOnGlobalLayoutListenerC1242 = new ViewTreeObserverOnGlobalLayoutListenerC1242(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1242);
        m25843(new C1592(this, viewTreeObserverOnGlobalLayoutListenerC1242));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1907(C0997 c0997, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71790 = c0997;
        this.f71789 = new Rect();
        m25840(c0997);
        m25844();
        m25841(new C0892(this));
    }

    @Override // p067l.C1303, p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4052(ListAdapter listAdapter) {
        super.mo4052(listAdapter);
        this.f71786 = listAdapter;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ۧ */
    public final CharSequence mo4054() {
        return this.f71788;
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ֫ */
    public final void mo4053(CharSequence charSequence) {
        this.f71788 = charSequence;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m50952() {
        int i;
        C0997 c0997 = this.f71790;
        Rect rect = c0997.f12552;
        PopupWindow popupWindow = this.f31105;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            background.getPadding(rect);
            int i2 = C1956.f75466;
            if (c0997.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c0997.getPaddingLeft();
        int paddingRight = c0997.getPaddingRight();
        int width = c0997.getWidth();
        int i3 = c0997.f12557;
        if (i3 == -2) {
            int iM11542 = c0997.m11542((SpinnerAdapter) this.f71786, popupWindow.getBackground());
            int i4 = (c0997.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM11542 > i4) {
                iM11542 = i4;
            }
            m25855(Math.max(iM11542, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m25855((width - paddingLeft) - paddingRight);
        } else {
            m25855(i3);
        }
        int i5 = C1956.f75466;
        m25838(c0997.getLayoutDirection() == 1 ? (((width - paddingRight) - m25856()) - this.f71787) + i : paddingLeft + this.f71787 + i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50951(View view) {
        return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f71789);
    }

    @Override // p067l.InterfaceC1067
    /* JADX INFO: renamed from: ܽ */
    public final void mo4057(int i) {
        this.f71787 = i;
    }
}
