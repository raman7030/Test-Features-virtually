package l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5164 extends AbstractC12924 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public ValueAnimator f16132;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f16133;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC15746 f16134;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f16135;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f16136;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f16137;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C8692 f16138;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final OverScroller f16139;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f16140;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final Matrix f16141;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f16142;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f16143;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Paint f16144;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC3047 f16145;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f16146;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Matrix f16147;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f16148;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f16149;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f16150;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Bundle f16151;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f16152;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C13794 f16153;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final RectF f16154;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public float f16155;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f16156;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Paint f16157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20478 f16158;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f16159;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Handler f16160;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public double f16161;

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ܺۛۜ] */
    public C5164(ActivityC16012 activityC16012) {
        super(activityC16012, null);
        this.f16153 = new C13794(getResources().getDisplayMetrics().density);
        this.f16133 = new SparseArray();
        this.f16144 = new Paint(3);
        Paint paint = new Paint(1);
        this.f16157 = paint;
        this.f16141 = new Matrix();
        this.f16147 = new Matrix();
        this.f16154 = new RectF();
        this.f16160 = new Handler(Looper.getMainLooper());
        this.f16134 = new Runnable() { // from class: l.ܺۛۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f48572.m14767();
            }
        };
        this.f16156 = -1;
        this.f16159 = -16777216;
        this.f16155 = 1.0f;
        this.f16139 = new OverScroller(activityC16012);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        setFocusable(true);
        setClickable(true);
        setImportantForAccessibility(1);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activityC16012, new C2342(this));
        this.f16149 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f16137 = new GestureDetector(activityC16012, new C18570(this));
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14782(int i) {
        C8692 c8692 = this.f16138;
        return c8692 != null && c8692.m22472(i) < this.f16161 + ((double) (((float) getHeight()) / this.f16155)) && this.f16138.m22472(i) + this.f16138.m22473(i) > this.f16161;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14780(InterfaceC3047 interfaceC3047) {
        this.f16145 = interfaceC3047;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo14785() {
        return this.f16156;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo14788(int i) {
        this.f16159 = i;
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo14789() {
        if (!this.f16139.isFinished()) {
            return true;
        }
        ValueAnimator valueAnimator = this.f16132;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo14791() {
        return this.f16142;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14781(C20478 c20478, int i) {
        if (c20478.m46921() <= 0 || i < 0 || i >= c20478.m46921()) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo14790();
        this.f16158 = c20478;
        C8692 c8692 = new C8692(c20478.m46921());
        this.f16138 = c8692;
        c8692.m22468(getWidth(), getResources().getDisplayMetrics().density, getHeight());
        this.f16156 = i;
        this.f16135 = true;
        this.f16161 = this.f16138.m22472(i);
        c20478.m46934(this.f16156);
        m14771(this.f16156);
        m14767();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19276 m14747(float f) {
        C8692 c8692 = this.f16138;
        if (c8692 == null || this.f16156 < 0) {
            return null;
        }
        double d = this.f16161 + ((double) (f / this.f16155));
        int iM22466 = c8692.m22466(d);
        return new C19276(iM22466, (d - this.f16138.m22472(iM22466)) / Math.max(1.0d, this.f16138.m22473(iM22466)), f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14754(C19276 c19276) {
        if (this.f16135) {
            this.f16161 = Math.min(0.0d, (this.f16138.m22473(this.f16156) - ((double) (getHeight() / this.f16155))) / 2.0d) + this.f16138.m22472(this.f16156);
        } else if (c19276 != null) {
            int i = c19276.f60651;
            this.f16161 = ((c19276.f60650 * this.f16138.m22473(i)) + this.f16138.m22472(i)) - ((double) (c19276.f60652 / this.f16155));
        }
        m14759();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f16138 == null) {
            return;
        }
        C19276 c19276 = (i3 <= 0 || i4 <= 0) ? new C19276(this.f16156, 0.0d, 0.0f) : m14747(i4 / 2.0f);
        mo14778();
        if (i3 > 0) {
            float f2 = i3;
            f = ((f2 / 2.0f) - this.f16150) / (f2 * this.f16155);
        } else {
            f = 0.5f;
        }
        this.f16138.m22468(i, getResources().getDisplayMetrics().density, i2);
        float f3 = i;
        this.f16150 = (f3 / 2.0f) - ((f * f3) * this.f16155);
        m14754(new C19276(c19276.f60651, c19276.f60650, i4 > 0 ? i2 / 2.0f : 0.0f));
        m14777();
        m14767();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14783(int i, long j, InterfaceC3212 interfaceC3212) {
        int i2;
        C15537 c15537 = (C15537) interfaceC3212;
        C15205 c15205 = c15537.f47871;
        if (c15205.f46658 <= 0 || c15205.f46659 <= 0 || (i2 = c15205.f46663) < 1 || i2 > 8) {
            c15537.m36629();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C0224 c0224 = (C0224) this.f16133.get(i);
        if (!m14755(c0224, j)) {
            c15537.m36629();
            return false;
        }
        C19276 c19276M14747 = m14747(0.0f);
        boolean z = this.f16161 == m14762();
        boolean z2 = this.f16161 == m14774();
        InterfaceC3212 interfaceC3213 = c0224.f1480;
        float[] fArr = c0224.f1478;
        c0224.f1480 = interfaceC3212;
        c0224.f1477 = false;
        C8692 c8692 = this.f16138;
        C15205 c15206 = c15537.f47871;
        int iM45756 = C19893.m45756(c15206.f46658, c15206.f46659, c15206.f46663);
        C15205 c15207 = c15537.f47871;
        c8692.m22469(i, iM45756, C19893.m45754(c15207.f46658, c15207.f46659, c15207.f46663));
        C15205 c15208 = c15537.f47871;
        C19893.m45751(c15208.f46658, c15208.f46659, c15208.f46663, fArr);
        c0224.f1483.setValues(fArr);
        if (interfaceC3213 != null && interfaceC3213 != interfaceC3212) {
            ((C15537) interfaceC3213).m36629();
        }
        m14754(c19276M14747);
        if (!this.f16135 && this.f16151 == null) {
            if (z) {
                this.f16161 = m14762();
            } else if (z2) {
                this.f16161 = m14774();
            }
        }
        m14777();
        Handler handler = this.f16160;
        RunnableC15746 runnableC15746 = this.f16134;
        handler.removeCallbacks(runnableC15746);
        handler.post(runnableC15746);
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m14755(C0224 c0224, long j) {
        return this.f16158 != null && c0224 != null && c0224.f1484 == j && ((long) c0224.f1482) + 1 == c0224.f1481;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m14771(int i) {
        if (i < 0 || i >= this.f16138.m22465()) {
            return;
        }
        SparseArray sparseArray = this.f16133;
        if (sparseArray.get(i) != null) {
            return;
        }
        this.f16158.getClass();
        long j = this.f16140 + 1;
        this.f16140 = j;
        C0224 c0224 = new C0224(((long) i) + 1, i, j);
        sparseArray.put(i, c0224);
        this.f16158.m46927(i, c0224.f1484);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14749(C0224 c0224) {
        this.f16158.m46923(c0224.f1482, c0224.f1484);
        InterfaceC3212 interfaceC3212 = c0224.f1480;
        if (interfaceC3212 != null) {
            ((C15537) interfaceC3212).m36629();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m14767() {
        SparseArray sparseArray = this.f16133;
        if (this.f16158 == null || getWidth() <= 0 || getHeight() <= 0 || this.f16136) {
            return;
        }
        this.f16136 = true;
        try {
            m14759();
            int iM22466 = this.f16138.m22466(this.f16161);
            int iM22467 = this.f16138.m22466(this.f16161 + ((double) (getHeight() / this.f16155)));
            double dMin = Math.min(this.f16138.m22470() - 0.001d, this.f16161 + ((double) (getHeight() / (this.f16155 * 2.0f))));
            int iM22468 = this.f16138.m22466(dMin);
            if (!this.f16135 && this.f16151 == null && dMin <= this.f16138.m22472(iM22468) + this.f16138.m22473(iM22468) && iM22468 != this.f16156) {
                this.f16156 = iM22468;
                this.f16158.m46934(iM22468);
                InterfaceC3047 interfaceC3047 = this.f16145;
                if (interfaceC3047 != null) {
                    interfaceC3047.mo9337(this.f16156);
                }
            }
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                C0224 c0224 = (C0224) sparseArray.valueAt(size);
                int i = c0224.f1482;
                if (i < iM22466 - 1 || i > iM22467 + 1) {
                    sparseArray.removeAt(size);
                    m14749(c0224);
                }
            }
            m14771(this.f16156);
            for (int i2 = iM22466; i2 <= iM22467; i2++) {
                m14771(i2);
            }
            m14771(iM22466 - 1);
            m14771(iM22467 + 1);
            this.f16158.m46931();
            invalidate();
        } finally {
            this.f16136 = false;
        }
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo14786(int i) {
        SparseArray sparseArray = this.f16133;
        C0224 c0224 = (C0224) sparseArray.get(i);
        if (c0224 == null || this.f16158 == null) {
            return false;
        }
        m14749(c0224);
        sparseArray.remove(i);
        m14771(i);
        invalidate();
        return true;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14779(int i, int i2, long j) {
        C0224 c0224 = (C0224) this.f16133.get(i);
        if (m14755(c0224, j)) {
            c0224.f1477 = true;
            c0224.f1479 = i2;
            if (i == this.f16156) {
                this.f16151 = null;
            }
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        canvas.drawColor(this.f16159);
        if (this.f16138 == null) {
            return;
        }
        int i = this.f16159 == -1 ? -12303292 : -3355444;
        Paint paint = this.f16157;
        paint.setColor(i);
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f16133;
            if (i2 >= sparseArray.size()) {
                return;
            }
            C0224 c0224 = (C0224) sparseArray.valueAt(i2);
            C8692 c8692 = this.f16138;
            int i3 = c0224.f1482;
            float fM22472 = (float) ((c8692.m22472(i3) - this.f16161) * ((double) this.f16155));
            float fM22473 = ((float) (this.f16138.m22473(i3) * ((double) this.f16155))) + fM22472;
            boolean z = fM22472 < ((float) getHeight()) && fM22473 > 0.0f;
            if (c0224.f1480 == null) {
                if (z && !this.f16158.m46932(i3)) {
                    canvas.drawText(getResources().getString(c0224.f1477 ? c0224.f1479 : R.string.MT_Protector), getWidth() / 2.0f, (Math.min(getHeight(), fM22473) + Math.max(0.0f, fM22472)) / 2.0f, paint);
                }
                f2 = 2.0f;
                paint = paint;
            } else {
                float fM22474 = ((float) this.f16138.m22474(i3)) * this.f16155;
                float width = (((getWidth() * this.f16155) - (this.f16138.m22476(i3) * fM22474)) / 2.0f) + this.f16150;
                float fM22471 = (((float) this.f16138.m22471(i3)) * this.f16155) + fM22472;
                Matrix matrix = this.f16141;
                matrix.setTranslate(width, fM22471);
                matrix.preScale(fM22474, fM22474);
                matrix.preConcat(c0224.f1483);
                RectF rectF = this.f16154;
                rectF.setEmpty();
                if (z) {
                    Matrix matrix2 = this.f16147;
                    if (matrix.invert(matrix2)) {
                        f = 0.0f;
                        rectF.set(0.0f, Math.max(0.0f, fM22472), getWidth(), Math.min(getHeight(), fM22473));
                        matrix2.mapRect(rectF);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                ((C15537) c0224.f1480).m36628(rectF, fM22474, z);
                if (z) {
                    int iSave = canvas.save();
                    canvas.clipRect(f, Math.max(f, fM22472), getWidth(), Math.min(getHeight(), fM22473));
                    canvas.concat(matrix);
                    ((C15537) c0224.f1480).m36627(canvas, this.f16144);
                    canvas.restoreToCount(iSave);
                }
                f2 = 2.0f;
            }
            if (z && this.f16158.m46932(i3) && this.f16152 <= 1) {
                int iSave2 = canvas.save();
                canvas.clipRect(0.0f, Math.max(0.0f, fM22472), getWidth(), Math.min(getHeight(), fM22473));
                this.f16153.m33109(canvas, getWidth() / f2, (Math.min(getHeight(), fM22473) + Math.max(0.0f, fM22472)) / f2);
                canvas.restoreToCount(iSave2);
            }
            i2++;
            paint = paint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double m14762() {
        C8692 c8692 = this.f16138;
        if (c8692 == null) {
            return 0.0d;
        }
        return Math.min(0.0d, (c8692.m22473(0) - ((double) (getHeight() / this.f16155))) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public double m14774() {
        if (this.f16138 == null) {
            return 0.0d;
        }
        double height = getHeight() / this.f16155;
        double dM14762 = m14762();
        double dM22470 = this.f16138.m22470() - height;
        C8692 c8692 = this.f16138;
        return Math.max(dM14762, Math.max(0.0d, (height - c8692.m22473(c8692.m22465() - 1)) / 2.0d) + dM22470);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m14759() {
        this.f16161 = Math.max(m14762(), Math.min(m14774(), this.f16161));
        this.f16150 = Math.max((1.0f - this.f16155) * getWidth(), Math.min(0.0f, this.f16150));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m14748(float f, float f2) {
        this.f16135 = false;
        this.f16151 = null;
        this.f16161 -= (double) (f2 / this.f16155);
        this.f16150 += f;
        m14767();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14752(C5164 c5164, float f, float f2, float f3) {
        if (c5164.f16138 == null) {
            return;
        }
        c5164.f16135 = false;
        c5164.f16151 = null;
        float fMax = Math.max(1.0f, Math.min(5.0f, f));
        double d = c5164.f16161;
        float f4 = c5164.f16155;
        c5164.f16150 = f2 - (((f2 - c5164.f16150) * fMax) / f4);
        c5164.f16155 = fMax;
        c5164.f16161 = (d + ((double) (f3 / f4))) - ((double) (f3 / fMax));
        c5164.m14767();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount;
        if (this.f16158 == null) {
            return false;
        }
        boolean z = this.f16152 > 1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            pointerCount = 0;
        } else {
            pointerCount = motionEvent.getPointerCount() - (actionMasked == 6 ? 1 : 0);
        }
        this.f16152 = pointerCount;
        if (actionMasked == 0) {
            m14761();
            this.f16142 = true;
            this.f16148 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f16148 = true;
            m14761();
        }
        this.f16149.onTouchEvent(motionEvent);
        this.f16137.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16142 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (actionMasked == 3) {
                m14761();
            }
            invalidate();
        }
        if (z != (this.f16152 > 1)) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        int i;
        super.performClick();
        if (this.f16145 == null) {
            return true;
        }
        C20478 c20478 = this.f16158;
        if (c20478 == null || (i = this.f16156) < 0 || !c20478.m46932(i)) {
            this.f16145.mo9335();
            return true;
        }
        this.f16145.mo9338(this.f16156);
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f16139;
        if (overScroller.computeScrollOffset()) {
            m14748(overScroller.getCurrX() - this.f16146, this.f16143 - overScroller.getCurrY());
            this.f16146 = overScroller.getCurrX();
            this.f16143 = overScroller.getCurrY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m14761() {
        this.f16139.forceFinished(true);
        ValueAnimator valueAnimator = this.f16132;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16132 = null;
        }
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo14778() {
        m14761();
        this.f16142 = false;
        this.f16152 = 0;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f16137.onTouchEvent(motionEventObtain);
        this.f16149.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo14778();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        mo14778();
        this.f16160.removeCallbacks(this.f16134);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo14790() {
        mo14778();
        this.f16160.removeCallbacks(this.f16134);
        C20478 c20478 = this.f16158;
        SparseArray sparseArray = this.f16133;
        if (c20478 != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                m14749((C0224) sparseArray.valueAt(i));
            }
        }
        sparseArray.clear();
        this.f16158 = null;
        this.f16138 = null;
        this.f16156 = -1;
        this.f16135 = false;
        this.f16151 = null;
        this.f16161 = 0.0d;
        this.f16155 = 1.0f;
        this.f16150 = 0.0f;
        invalidate();
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle mo14787() {
        InterfaceC3212 interfaceC3212;
        if (this.f16151 != null) {
            return new Bundle(this.f16151);
        }
        if (this.f16138 == null || this.f16156 < 0 || getWidth() == 0 || !this.f16138.m22475(this.f16156)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("continuous", true);
        double dMax = Math.max(this.f16138.m22472(this.f16156), Math.min(this.f16138.m22472(this.f16156) + this.f16138.m22473(this.f16156), this.f16161 + ((double) (getHeight() / (this.f16155 * 2.0f)))));
        bundle.putDouble("fraction", (dMax - this.f16138.m22472(this.f16156)) / this.f16138.m22473(this.f16156));
        bundle.putFloat("screenY", (float) (((dMax - this.f16161) * ((double) this.f16155)) / ((double) getHeight())));
        C0224 c0224 = (C0224) this.f16133.get(this.f16156);
        bundle.putInt("orientation", (c0224 == null || (interfaceC3212 = c0224.f1480) == null) ? 0 : ((C15537) interfaceC3212).f47871.f46663);
        bundle.putFloat("zoom", this.f16155);
        bundle.putFloat("centerX", ((getWidth() / 2.0f) - this.f16150) / (getWidth() * this.f16155));
        bundle.putInt("width", this.f16138.m22476(this.f16156));
        bundle.putInt("height", this.f16138.m22467(this.f16156));
        return bundle;
    }

    @Override // l.AbstractC12924
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo14784(Bundle bundle) {
        this.f16151 = null;
        if (bundle == null || this.f16158 == null || !bundle.getBoolean("continuous")) {
            return false;
        }
        double d = bundle.getDouble("fraction", Double.NaN);
        float f = bundle.getFloat("zoom", Float.NaN);
        float f2 = bundle.getFloat("centerX", Float.NaN);
        float f3 = bundle.getFloat("screenY", Float.NaN);
        if (d < 0.0d || d > 1.0d || f < 1.0f || f > 5.0f || f2 < 0.0f || f2 > 1.0f || f3 < 0.0f || f3 > 1.0f) {
            return false;
        }
        this.f16151 = new Bundle(bundle);
        m14777();
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m14777() {
        if (this.f16151 == null || this.f16138 == null || getWidth() <= 0 || getHeight() <= 0 || !this.f16138.m22475(this.f16156)) {
            return;
        }
        Bundle bundle = this.f16151;
        C0224 c0224 = (C0224) this.f16133.get(this.f16156);
        if (bundle.getInt("width") != this.f16138.m22476(this.f16156) || bundle.getInt("height") != this.f16138.m22467(this.f16156) || c0224 == null || c0224.f1480 == null || bundle.getInt("orientation") != ((C15537) c0224.f1480).f47871.f46663) {
            this.f16151 = null;
            return;
        }
        this.f16135 = false;
        this.f16155 = bundle.getFloat("zoom");
        this.f16150 = (getWidth() / 2.0f) - ((bundle.getFloat("centerX") * getWidth()) * this.f16155);
        m14754(new C19276(this.f16156, bundle.getDouble("fraction"), bundle.getFloat("screenY") * getHeight()));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(true);
        C20478 c20478 = this.f16158;
        if (c20478 != null && (i = this.f16156) >= 0 && c20478.m46932(i)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (this.f16161 > m14762()) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (this.f16161 < m14774()) {
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            m14761();
            m14748(0.0f, getHeight() * 0.8f * (i == 4096 ? -1 : 1));
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 20 || i == 93) {
            return performAccessibilityAction(4096, null);
        }
        if (i == 19 || i == 92) {
            return performAccessibilityAction(8192, null);
        }
        return super.onKeyDown(i, keyEvent);
    }
}
