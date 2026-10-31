package l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۢ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC9877 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f29892;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f29893;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public View f29894;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f29895;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f29896;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f29897;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f29898;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24971(View view) {
        ViewOnTouchListenerC9877 viewOnTouchListenerC9877 = new ViewOnTouchListenerC9877();
        viewOnTouchListenerC9877.f29897 = 0;
        viewOnTouchListenerC9877.f29894 = view;
        view.setOnTouchListener(viewOnTouchListenerC9877);
        viewOnTouchListenerC9877.f29895 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f29895;
        View view2 = this.f29894;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            view2.setPressed(true);
            this.f29892 = false;
            this.f29898 = false;
            this.f29896 = motionEvent.getX();
            this.f29893 = motionEvent.getY();
            final int i2 = this.f29897 + 1;
            this.f29897 = i2;
            view2.postDelayed(new Runnable() { // from class: l.᩻᩹ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnTouchListenerC9877.m24974(this.f77770, i2);
                }
            }, 150L);
            return true;
        }
        if (action == 1) {
            view2.setPressed(false);
            this.f29897++;
            if (!this.f29892 && !this.f29898) {
                view2.performClick();
            }
        } else if (action != 2) {
            if (action == 3) {
                view2.setPressed(false);
                this.f29897++;
                if (!this.f29892) {
                    view2.performClick();
                }
            }
        } else if (!this.f29892) {
            float f = i;
            if (Math.abs(motionEvent.getX() - this.f29896) >= f || Math.abs(motionEvent.getY() - this.f29893) >= f) {
                this.f29892 = true;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24974(final ViewOnTouchListenerC9877 viewOnTouchListenerC9877, final int i) {
        View view = viewOnTouchListenerC9877.f29894;
        if (i != viewOnTouchListenerC9877.f29897 || viewOnTouchListenerC9877.f29892) {
            return;
        }
        viewOnTouchListenerC9877.f29898 = true;
        view.performClick();
        view.postDelayed(new Runnable() { // from class: l.ۜ᩹ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC9877.m24972(this.f21723, i);
            }
        }, 350L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24972(ViewOnTouchListenerC9877 viewOnTouchListenerC9877, int i) {
        if (i != viewOnTouchListenerC9877.f29897 || viewOnTouchListenerC9877.f29892) {
            return;
        }
        viewOnTouchListenerC9877.f29894.performHapticFeedback(0);
        new RunnableC21166(viewOnTouchListenerC9877, i).run();
    }
}
