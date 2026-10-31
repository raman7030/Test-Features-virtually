package l;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C18808 extends C18850 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f59355;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18808(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402, C12729 c12729) {
        super(c12729, null);
        this.f59355 = layoutInflaterFactory2C5402;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f59355.m15444(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f59355;
                layoutInflaterFactory2C5402.m15442(layoutInflaterFactory2C5402.m15448(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C21311.m48345(getContext(), i));
    }
}
