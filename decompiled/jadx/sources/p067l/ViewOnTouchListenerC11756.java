package p067l;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۢ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC11756 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f32849;

    /* JADX INFO: renamed from: ۙ */
    public float f32850;

    /* JADX INFO: renamed from: ۫ */
    public View f32851;

    /* JADX INFO: renamed from: ۬ */
    public int f32852;

    /* JADX INFO: renamed from: ᩶ */
    public float f32853;

    /* JADX INFO: renamed from: ᩸ */
    public int f32854;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f32855;

    /* JADX INFO: renamed from: ֫ */
    public static void m26986(View view) {
        ViewOnTouchListenerC11756 viewOnTouchListenerC11756 = new ViewOnTouchListenerC11756();
        viewOnTouchListenerC11756.f32854 = 0;
        viewOnTouchListenerC11756.f32851 = view;
        view.setOnTouchListener(viewOnTouchListenerC11756);
        viewOnTouchListenerC11756.f32852 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f32852;
        View view2 = this.f32851;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            view2.setPressed(true);
            this.f32849 = false;
            this.f32855 = false;
            this.f32853 = motionEvent.getX();
            this.f32850 = motionEvent.getY();
            final int i2 = this.f32854 + 1;
            this.f32854 = i2;
            view2.postDelayed(new Runnable() { // from class: l.᩻᩹ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    ViewOnTouchListenerC11756.m26989(this.f80521, i2);
                }
            }, 150L);
            return true;
        }
        if (action == 1) {
            view2.setPressed(false);
            this.f32854++;
            if (!this.f32849 && !this.f32855) {
                view2.performClick();
            }
        } else if (action != 2) {
            if (action == 3) {
                view2.setPressed(false);
                this.f32854++;
                if (!this.f32849) {
                    view2.performClick();
                }
            }
        } else if (!this.f32849) {
            float f = i;
            if (Math.abs(motionEvent.getX() - this.f32853) >= f || Math.abs(motionEvent.getY() - this.f32850) >= f) {
                this.f32849 = true;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m26989(final ViewOnTouchListenerC11756 viewOnTouchListenerC11756, final int i) {
        View view = viewOnTouchListenerC11756.f32851;
        if (i != viewOnTouchListenerC11756.f32854 || viewOnTouchListenerC11756.f32849) {
            return;
        }
        viewOnTouchListenerC11756.f32855 = true;
        view.performClick();
        view.postDelayed(new Runnable() { // from class: l.ۜ᩹ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnTouchListenerC11756.m26987(this.f24604, i);
            }
        }, 350L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m26987(ViewOnTouchListenerC11756 viewOnTouchListenerC11756, int i) {
        if (i != viewOnTouchListenerC11756.f32854 || viewOnTouchListenerC11756.f32849) {
            return;
        }
        viewOnTouchListenerC11756.f32851.performHapticFeedback(0);
        new RunnableC22485(viewOnTouchListenerC11756, i).run();
    }
}
