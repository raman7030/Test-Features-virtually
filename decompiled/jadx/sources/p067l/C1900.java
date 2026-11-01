package p067l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.᩸ۘ */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1900 extends TouchDelegate {

    /* JADX INFO: renamed from: ֫ */
    public final Rect f71408;

    /* JADX INFO: renamed from: ۧ */
    public boolean f71409;

    /* JADX INFO: renamed from: ܳ */
    public final Rect f71410;

    /* JADX INFO: renamed from: ܽ */
    public final View f71411;

    /* JADX INFO: renamed from: ܿ */
    public final Rect f71412;

    /* JADX INFO: renamed from: ᩳ */
    public final int f71413;

    public C1900(View view, Rect rect, Rect rect2) {
        super(rect, view);
        this.f71413 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f71410 = new Rect();
        this.f71412 = new Rect();
        this.f71408 = new Rect();
        m50686(rect, rect2);
        this.f71411 = view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50686(Rect rect, Rect rect2) {
        this.f71410.set(rect);
        Rect rect3 = this.f71412;
        rect3.set(rect);
        int i = this.f71413;
        rect3.inset(-i, -i);
        this.f71408.set(rect2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.f71409;
                if (z2 && !this.f71412.contains(x, y)) {
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                z2 = this.f71409;
                this.f71409 = false;
            }
            z3 = z2;
            z2 = z3;
            z = true;
        } else if (this.f71410.contains(x, y)) {
            this.f71409 = true;
            z2 = z3;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        Rect rect = this.f71408;
        View view = this.f71411;
        if (z && !rect.contains(x, y)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
