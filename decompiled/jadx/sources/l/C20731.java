package l;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: l.᩷۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1OQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20731 extends C13132 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2386 f66748;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20731(C2386 c2386, Context context) {
        super(context);
        this.f66748 = c2386;
    }

    @Override // l.C13132, android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        this.f66748.f7610.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        C2386 c2386 = this.f66748;
        accessibilityEvent.setFromIndex(c2386.f7611);
        accessibilityEvent.setToIndex(c2386.f7611);
        accessibilityEvent.setSource(c2386.f7610.f75611);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // l.C13132, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f66748.m7721() && super.onTouchEvent(motionEvent);
    }

    @Override // l.C13132, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f66748.m7721() && super.onInterceptTouchEvent(motionEvent);
    }
}
