package p067l;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* JADX INFO: renamed from: l.ᩴܳ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C1775 extends C1777 {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ LayoutInflaterFactory2C1110 f62582;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775(LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110, C1473 c1473) {
        super(c1473, null);
        this.f62582 = layoutInflaterFactory2C1110;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f62582.m17355(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f62582;
                layoutInflaterFactory2C1110.m17353(layoutInflaterFactory2C1110.m17359(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C22622.m50680(getContext(), i));
    }
}
