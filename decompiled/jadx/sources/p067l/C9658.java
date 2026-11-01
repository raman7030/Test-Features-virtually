package p067l;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.۟᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1WB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9658 extends Animation {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final WeakHashMap f26590;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final boolean f26591;

    /* JADX INFO: renamed from: ֫֫ */
    public float f26592;

    /* JADX INFO: renamed from: ۗ */
    public boolean f26593;

    /* JADX INFO: renamed from: ۛ */
    public float f26595;

    /* JADX INFO: renamed from: ۤ */
    public float f26597;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f26598;

    /* JADX INFO: renamed from: ۨ */
    public float f26599;

    /* JADX INFO: renamed from: ۫ */
    public float f26600;

    /* JADX INFO: renamed from: ۬ */
    public float f26601;

    /* JADX INFO: renamed from: ܽ֫ */
    public final WeakReference f26603;

    /* JADX INFO: renamed from: ۙ */
    public final Camera f26594 = new Camera();

    /* JADX INFO: renamed from: ᩹ */
    public float f26606 = 1.0f;

    /* JADX INFO: renamed from: ᩺ */
    public float f26607 = 1.0f;

    /* JADX INFO: renamed from: ܰ */
    public float f26602 = 1.0f;

    /* JADX INFO: renamed from: ᩶ */
    public final RectF f26604 = new RectF();

    /* JADX INFO: renamed from: ᩸ */
    public final RectF f26605 = new RectF();

    /* JADX INFO: renamed from: ۟ */
    public final Matrix f26596 = new Matrix();

    static {
        f26591 = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f26590 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9658 m22474(View view) {
        WeakHashMap weakHashMap = f26590;
        C9658 c9658 = (C9658) weakHashMap.get(view);
        if (c9658 != null && c9658 == view.getAnimation()) {
            return c9658;
        }
        C9658 c9659 = new C9658(view);
        weakHashMap.put(view, c9659);
        return c9659;
    }

    public C9658(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f26603 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m22479() {
        return this.f26606;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22480(float f) {
        if (this.f26606 != f) {
            this.f26606 = f;
            View view = (View) this.f26603.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m22494() {
        return this.f26601;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22489(float f) {
        if (this.f26593 && this.f26601 == f) {
            return;
        }
        m22473();
        this.f26593 = true;
        this.f26601 = f;
        m22477();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final float m22498() {
        return this.f26600;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22495(float f) {
        if (this.f26593 && this.f26600 == f) {
            return;
        }
        m22473();
        this.f26593 = true;
        this.f26600 = f;
        m22477();
    }

    /* JADX INFO: renamed from: ܿ */
    public final float m22496() {
        return this.f26599;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m22499(float f) {
        if (this.f26599 != f) {
            m22473();
            this.f26599 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final float m22490() {
        return this.f26597;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m22497(float f) {
        if (this.f26597 != f) {
            m22473();
            this.f26597 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final float m22483() {
        return this.f26595;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m22491(float f) {
        if (this.f26595 != f) {
            m22473();
            this.f26595 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final float m22501() {
        return this.f26607;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m22503(float f) {
        if (this.f26607 != f) {
            m22473();
            this.f26607 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public final float m22487() {
        return this.f26602;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m22484(float f) {
        if (this.f26602 != f) {
            m22473();
            this.f26602 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final int m22485() {
        View view = (View) this.f26603.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    /* JADX INFO: renamed from: ܺ */
    public final int m22492() {
        View view = (View) this.f26603.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    /* JADX INFO: renamed from: ۖ */
    public final float m22481() {
        return this.f26592;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m22502(float f) {
        if (this.f26592 != f) {
            m22473();
            this.f26592 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final float m22482() {
        return this.f26598;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m22488(float f) {
        if (this.f26598 != f) {
            m22473();
            this.f26598 = f;
            m22477();
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public final float m22500() {
        View view = (View) this.f26603.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getLeft() + this.f26592;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m22486(float f) {
        View view = (View) this.f26603.get();
        if (view != null) {
            m22502(f - view.getLeft());
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final float m22478() {
        View view = (View) this.f26603.get();
        if (view == null) {
            return 0.0f;
        }
        return view.getTop() + this.f26598;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m22493(float f) {
        View view = (View) this.f26603.get();
        if (view != null) {
            m22488(f - view.getTop());
        }
    }

    /* JADX INFO: renamed from: ֨ */
    private void m22473() {
        View view = (View) this.f26603.get();
        if (view != null) {
            m22476(view, this.f26604);
        }
    }

    /* JADX INFO: renamed from: ۚ */
    private void m22477() {
        View view = (View) this.f26603.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f26605;
        m22476(view, rectF);
        rectF.union(this.f26604);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22476(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f26596;
        matrix.reset();
        m22475(view, matrix);
        matrix.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f = rectF.right;
        float f2 = rectF.left;
        if (f < f2) {
            rectF.right = f2;
            rectF.left = f;
        }
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        if (f3 < f4) {
            rectF.top = f3;
            rectF.bottom = f4;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22475(View view, Matrix matrix) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z = this.f26593;
        float f = z ? this.f26601 : width / 2.0f;
        float f2 = z ? this.f26600 : height / 2.0f;
        float f3 = this.f26597;
        float f4 = this.f26595;
        float f5 = this.f26599;
        if (f3 != 0.0f || f4 != 0.0f || f5 != 0.0f) {
            Camera camera = this.f26594;
            camera.save();
            camera.rotateX(f3);
            camera.rotateY(f4);
            camera.rotateZ(-f5);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f, -f2);
            matrix.postTranslate(f, f2);
        }
        float f6 = this.f26607;
        float f7 = this.f26602;
        if (f6 != 1.0f || f7 != 1.0f) {
            matrix.postScale(f6, f7);
            matrix.postTranslate(((f6 * width) - width) * (-(f / width)), ((f7 * height) - height) * (-(f2 / height)));
        }
        matrix.postTranslate(this.f26592, this.f26598);
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = (View) this.f26603.get();
        if (view != null) {
            transformation.setAlpha(this.f26606);
            m22475(view, transformation.getMatrix());
        }
    }
}
