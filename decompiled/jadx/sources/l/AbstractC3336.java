package l;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: l.ۗܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35SE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3336 extends AbstractC13213 implements Animatable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f10538;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Animator[] f10539;

    @Override // l.AbstractC4747, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        for (Animator animator : this.f10539) {
            if (animator.isStarted()) {
                invalidateSelf();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        for (Animator animator : this.f10539) {
            if (animator.isStarted()) {
                return;
            }
        }
        for (Animator animator2 : this.f10539) {
            animator2.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.f10539) {
            animator.end();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        for (Animator animator : this.f10539) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }
}
