package p067l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩷۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C22071 extends C14849 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C4636 f69429;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22071(C4636 c4636, Context context) {
        super(context);
        this.f69429 = c4636;
    }

    @Override // p067l.C14849, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f69429.f10401.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C4636 c4636 = this.f69429;
        accessibilityEvent.setFromIndex(c4636.f10402);
        accessibilityEvent.setToIndex(c4636.f10402);
        accessibilityEvent.setSource(c4636.f10401.f78357);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // p067l.C14849, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f69429.m9782() && super.onTouchEvent(motionEvent);
    }

    @Override // p067l.C14849, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f69429.m9782() && super.onInterceptTouchEvent(motionEvent);
    }
}
