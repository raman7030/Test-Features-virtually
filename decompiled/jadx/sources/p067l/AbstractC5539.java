package p067l;

import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* JADX INFO: renamed from: l.ۗܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35SE */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5539 extends AbstractC14926 implements Animatable {

    /* JADX INFO: renamed from: ۛ */
    public boolean f13348;

    /* JADX INFO: renamed from: ۤ */
    public Animator[] f13349;

    @Override // p067l.AbstractC6880, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        for (Animator animator : this.f13349) {
            if (animator.isStarted()) {
                invalidateSelf();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        for (Animator animator : this.f13349) {
            if (animator.isStarted()) {
                return;
            }
        }
        for (Animator animator2 : this.f13349) {
            animator2.start();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        for (Animator animator : this.f13349) {
            animator.end();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        for (Animator animator : this.f13349) {
            if (animator.isRunning()) {
                return true;
            }
        }
        return false;
    }
}
