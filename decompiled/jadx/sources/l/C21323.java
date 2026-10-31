package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N5JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21323 extends TouchDelegate {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Rect f68714;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f68715;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Rect f68716;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View f68717;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Rect f68718;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f68719;

    public C21323(View view, Rect rect, Rect rect2) {
        super(rect, view);
        this.f68719 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f68716 = new Rect();
        this.f68718 = new Rect();
        this.f68714 = new Rect();
        m48351(rect, rect2);
        this.f68717 = view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48351(Rect rect, Rect rect2) {
        this.f68716.set(rect);
        Rect rect3 = this.f68718;
        rect3.set(rect);
        int i = this.f68719;
        rect3.inset(-i, -i);
        this.f68714.set(rect2);
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
                z2 = this.f68715;
                if (z2 && !this.f68718.contains(x, y)) {
                    z = false;
                }
            } else if (action != 3) {
                z = true;
                z2 = false;
            } else {
                z2 = this.f68715;
                this.f68715 = false;
            }
            z3 = z2;
            z2 = z3;
            z = true;
        } else if (this.f68716.contains(x, y)) {
            this.f68715 = true;
            z2 = z3;
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        Rect rect = this.f68714;
        View view = this.f68717;
        if (z && !rect.contains(x, y)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
