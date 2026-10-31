package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SpinnerAdapter;

/* JADX INFO: renamed from: l.᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5WL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21467 extends C9287 implements InterfaceC4533 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public ListAdapter f69088;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f69089;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f69090;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final Rect f69091;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3122 f69092;

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫ */
    public final void mo1653(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.f28156;
        boolean zIsShowing = popupWindow.isShowing();
        m48615();
        m23842();
        show();
        C12499 c12499 = this.f28147;
        c12499.setChoiceMode(1);
        c12499.setTextDirection(i);
        c12499.setTextAlignment(i2);
        C3122 c3122 = this.f69092;
        int selectedItemPosition = c3122.getSelectedItemPosition();
        C12499 c124910 = this.f28147;
        if (popupWindow.isShowing() && c124910 != null) {
            c124910.m30670(false);
            c124910.setSelection(selectedItemPosition);
            if (c124910.getChoiceMode() != 0) {
                c124910.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c3122.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC8061 viewTreeObserverOnGlobalLayoutListenerC8061 = new ViewTreeObserverOnGlobalLayoutListenerC8061(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC8061);
        m23834(new C15115(this, viewTreeObserverOnGlobalLayoutListenerC8061));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21467(C3122 c3122, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69092 = c3122;
        this.f69091 = new Rect();
        m23831(c3122);
        m23835();
        m23832(new C1005(this));
    }

    @Override // l.C9287, l.InterfaceC4533
    /* JADX INFO: renamed from: ֫ */
    public final void mo1654(ListAdapter listAdapter) {
        super.mo1654(listAdapter);
        this.f69088 = listAdapter;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ۧ */
    public final CharSequence mo1656() {
        return this.f69090;
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ֫ */
    public final void mo1655(CharSequence charSequence) {
        this.f69090 = charSequence;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m48615() {
        int i;
        C3122 c3122 = this.f69092;
        Rect rect = c3122.f9749;
        PopupWindow popupWindow = this.f28156;
        Drawable background = popupWindow.getBackground();
        if (background != null) {
            background.getPadding(rect);
            int i2 = C22461.f72738;
            if (c3122.getLayoutDirection() == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = c3122.getPaddingLeft();
        int paddingRight = c3122.getPaddingRight();
        int width = c3122.getWidth();
        int i3 = c3122.f9754;
        if (i3 == -2) {
            int iM9499 = c3122.m9499((SpinnerAdapter) this.f69088, popupWindow.getBackground());
            int i4 = (c3122.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM9499 > i4) {
                iM9499 = i4;
            }
            m23846(Math.max(iM9499, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            m23846((width - paddingLeft) - paddingRight);
        } else {
            m23846(i3);
        }
        int i5 = C22461.f72738;
        m23829(c3122.getLayoutDirection() == 1 ? (((width - paddingRight) - m23847()) - this.f69089) + i : paddingLeft + this.f69089 + i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48614(View view) {
        return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f69091);
    }

    @Override // l.InterfaceC4533
    /* JADX INFO: renamed from: ܽ */
    public final void mo1659(int i) {
        this.f69089 = i;
    }
}
