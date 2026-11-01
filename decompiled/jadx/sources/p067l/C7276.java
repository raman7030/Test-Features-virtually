package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۚۛۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7276 extends AbstractC14651 {

    /* JADX INFO: renamed from: ֡֫ */
    public ValueAnimator f18971;

    /* JADX INFO: renamed from: ֫֫ */
    public final SparseArray f18972;

    /* JADX INFO: renamed from: ۖ֫ */
    public final RunnableC17333 f18973;

    /* JADX INFO: renamed from: ۗ */
    public boolean f18974;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f18975;

    /* JADX INFO: renamed from: ۙ */
    public final GestureDetector f18976;

    /* JADX INFO: renamed from: ۛ */
    public C10629 f18977;

    /* JADX INFO: renamed from: ۜ֫ */
    public final OverScroller f18978;

    /* JADX INFO: renamed from: ۟ */
    public long f18979;

    /* JADX INFO: renamed from: ۡ֫ */
    public final Matrix f18980;

    /* JADX INFO: renamed from: ۢ֫ */
    public boolean f18981;

    /* JADX INFO: renamed from: ۤ */
    public int f18982;

    /* JADX INFO: renamed from: ۧ֫ */
    public final Paint f18983;

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC5264 f18984;

    /* JADX INFO: renamed from: ۫ */
    public int f18985;

    /* JADX INFO: renamed from: ۬ */
    public final Matrix f18986;

    /* JADX INFO: renamed from: ܰ */
    public boolean f18987;

    /* JADX INFO: renamed from: ܳ֫ */
    public final ScaleGestureDetector f18988;

    /* JADX INFO: renamed from: ܺ֫ */
    public float f18989;

    /* JADX INFO: renamed from: ܽ֫ */
    public Bundle f18990;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f18991;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C15478 f18992;

    /* JADX INFO: renamed from: ᩴ֫ */
    public final RectF f18993;

    /* JADX INFO: renamed from: ᩵֫ */
    public float f18994;

    /* JADX INFO: renamed from: ᩶ */
    public int f18995;

    /* JADX INFO: renamed from: ᩷֫ */
    public final Paint f18996;

    /* JADX INFO: renamed from: ᩸ */
    public C21831 f18997;

    /* JADX INFO: renamed from: ᩹ */
    public int f18998;

    /* JADX INFO: renamed from: ᩺ */
    public final Handler f18999;

    /* JADX INFO: renamed from: ᩻֫ */
    public double f19000;

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ܺۛۜ] */
    public C7276(ActivityC17586 activityC17586) {
        super(activityC17586, null);
        this.f18992 = new C15478(getResources().getDisplayMetrics().density);
        this.f18972 = new SparseArray();
        this.f18983 = new Paint(3);
        Paint paint = new Paint(1);
        this.f18996 = paint;
        this.f18980 = new Matrix();
        this.f18986 = new Matrix();
        this.f18993 = new RectF();
        this.f18999 = new Handler(Looper.getMainLooper());
        this.f18973 = new Runnable() { // from class: l.ܺۛۜ
            @Override // java.lang.Runnable
            public final void run() {
                this.f51712.m16675();
            }
        };
        this.f18995 = -1;
        this.f18998 = -16777216;
        this.f18994 = 1.0f;
        this.f18978 = new OverScroller(activityC17586);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        setFocusable(true);
        setClickable(true);
        setImportantForAccessibility(1);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activityC17586, new C4594(this));
        this.f18988 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f18976 = new GestureDetector(activityC17586, new C20017(this));
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16690(int i) {
        C10629 c10629 = this.f18977;
        return c10629 != null && c10629.m24441(i) < this.f19000 + ((double) (((float) getHeight()) / this.f18994)) && this.f18977.m24441(i) + this.f18977.m24442(i) > this.f19000;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16688(InterfaceC5264 interfaceC5264) {
        this.f18984 = interfaceC5264;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ۧ */
    public final int mo16693() {
        return this.f18995;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܽ */
    public final void mo16696(int i) {
        this.f18998 = i;
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo16697() {
        if (!this.f18978.isFinished()) {
            return true;
        }
        ValueAnimator valueAnimator = this.f18971;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo16699() {
        return this.f18981;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16689(C21831 c21831, int i) {
        if (c21831.m49244() <= 0 || i < 0 || i >= c21831.m49244()) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo16698();
        this.f18997 = c21831;
        C10629 c10629 = new C10629(c21831.m49244());
        this.f18977 = c10629;
        c10629.m24437(getWidth(), getResources().getDisplayMetrics().density, getHeight());
        this.f18995 = i;
        this.f18974 = true;
        this.f19000 = this.f18977.m24441(i);
        c21831.m49257(this.f18995);
        m16679(this.f18995);
        m16675();
    }

    /* JADX INFO: renamed from: ֫ */
    private C20688 m16655(float f) {
        C10629 c10629 = this.f18977;
        if (c10629 == null || this.f18995 < 0) {
            return null;
        }
        double d = this.f19000 + ((double) (f / this.f18994));
        int iM24435 = c10629.m24435(d);
        return new C20688(iM24435, (d - this.f18977.m24441(iM24435)) / Math.max(1.0d, this.f18977.m24442(iM24435)), f);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16662(C20688 c20688) {
        if (this.f18974) {
            this.f19000 = Math.min(0.0d, (this.f18977.m24442(this.f18995) - ((double) (getHeight() / this.f18994))) / 2.0d) + this.f18977.m24441(this.f18995);
        } else if (c20688 != null) {
            int i = c20688.f63881;
            this.f19000 = ((c20688.f63880 * this.f18977.m24442(i)) + this.f18977.m24441(i)) - ((double) (c20688.f63882 / this.f18994));
        }
        m16667();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f18977 == null) {
            return;
        }
        C20688 c20688 = (i3 <= 0 || i4 <= 0) ? new C20688(this.f18995, 0.0d, 0.0f) : m16655(i4 / 2.0f);
        mo16686();
        if (i3 > 0) {
            float f2 = i3;
            f = ((f2 / 2.0f) - this.f18989) / (f2 * this.f18994);
        } else {
            f = 0.5f;
        }
        this.f18977.m24437(i, getResources().getDisplayMetrics().density, i2);
        float f3 = i;
        this.f18989 = (f3 / 2.0f) - ((f * f3) * this.f18994);
        m16662(new C20688(c20688.f63881, c20688.f63880, i4 > 0 ? i2 / 2.0f : 0.0f));
        m16685();
        m16675();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16691(int i, long j, InterfaceC5421 interfaceC5421) {
        int i2;
        C17135 c17135 = (C17135) interfaceC5421;
        C16819 c16819 = c17135.f51003;
        if (c16819.f49783 <= 0 || c16819.f49784 <= 0 || (i2 = c16819.f49788) < 1 || i2 > 8) {
            c17135.m38790();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C2581 c2581 = (C2581) this.f18972.get(i);
        if (!m16663(c2581, j)) {
            c17135.m38790();
            return false;
        }
        C20688 c20688M16655 = m16655(0.0f);
        boolean z = this.f19000 == m16670();
        boolean z2 = this.f19000 == m16682();
        InterfaceC5421 interfaceC5422 = c2581.f4259;
        float[] fArr = c2581.f4257;
        c2581.f4259 = interfaceC5421;
        c2581.f4256 = false;
        C10629 c10629 = this.f18977;
        C16819 c168110 = c17135.f51003;
        int iM48067 = C21274.m48067(c168110.f49783, c168110.f49784, c168110.f49788);
        C16819 c168111 = c17135.f51003;
        c10629.m24438(i, iM48067, C21274.m48065(c168111.f49783, c168111.f49784, c168111.f49788));
        C16819 c168112 = c17135.f51003;
        C21274.m48062(c168112.f49783, c168112.f49784, c168112.f49788, fArr);
        c2581.f4262.setValues(fArr);
        if (interfaceC5422 != null && interfaceC5422 != interfaceC5421) {
            ((C17135) interfaceC5422).m38790();
        }
        m16662(c20688M16655);
        if (!this.f18974 && this.f18990 == null) {
            if (z) {
                this.f19000 = m16670();
            } else if (z2) {
                this.f19000 = m16682();
            }
        }
        m16685();
        Handler handler = this.f18999;
        RunnableC17333 runnableC17333 = this.f18973;
        handler.removeCallbacks(runnableC17333);
        handler.post(runnableC17333);
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m16663(C2581 c2581, long j) {
        return this.f18997 != null && c2581 != null && c2581.f4263 == j && ((long) c2581.f4261) + 1 == c2581.f4260;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m16679(int i) {
        if (i < 0 || i >= this.f18977.m24434()) {
            return;
        }
        SparseArray sparseArray = this.f18972;
        if (sparseArray.get(i) != null) {
            return;
        }
        this.f18997.getClass();
        long j = this.f18979 + 1;
        this.f18979 = j;
        C2581 c2581 = new C2581(((long) i) + 1, i, j);
        sparseArray.put(i, c2581);
        this.f18997.m49250(i, c2581.f4263);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m16657(C2581 c2581) {
        this.f18997.m49246(c2581.f4261, c2581.f4263);
        InterfaceC5421 interfaceC5421 = c2581.f4259;
        if (interfaceC5421 != null) {
            ((C17135) interfaceC5421).m38790();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public void m16675() {
        SparseArray sparseArray = this.f18972;
        if (this.f18997 == null || getWidth() <= 0 || getHeight() <= 0 || this.f18975) {
            return;
        }
        this.f18975 = true;
        try {
            m16667();
            int iM24435 = this.f18977.m24435(this.f19000);
            int iM24436 = this.f18977.m24435(this.f19000 + ((double) (getHeight() / this.f18994)));
            double dMin = Math.min(this.f18977.m24439() - 0.001d, this.f19000 + ((double) (getHeight() / (this.f18994 * 2.0f))));
            int iM24437 = this.f18977.m24435(dMin);
            if (!this.f18974 && this.f18990 == null && dMin <= this.f18977.m24441(iM24437) + this.f18977.m24442(iM24437) && iM24437 != this.f18995) {
                this.f18995 = iM24437;
                this.f18997.m49257(iM24437);
                InterfaceC5264 interfaceC5264 = this.f18984;
                if (interfaceC5264 != null) {
                    interfaceC5264.mo11379(this.f18995);
                }
            }
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                C2581 c2581 = (C2581) sparseArray.valueAt(size);
                int i = c2581.f4261;
                if (i < iM24435 - 1 || i > iM24436 + 1) {
                    sparseArray.removeAt(size);
                    m16657(c2581);
                }
            }
            m16679(this.f18995);
            for (int i2 = iM24435; i2 <= iM24436; i2++) {
                m16679(i2);
            }
            m16679(iM24435 - 1);
            m16679(iM24436 + 1);
            this.f18997.m49254();
            invalidate();
        } finally {
            this.f18975 = false;
        }
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo16694(int i) {
        SparseArray sparseArray = this.f18972;
        C2581 c2581 = (C2581) sparseArray.get(i);
        if (c2581 == null || this.f18997 == null) {
            return false;
        }
        m16657(c2581);
        sparseArray.remove(i);
        m16679(i);
        invalidate();
        return true;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16687(int i, int i2, long j) {
        C2581 c2581 = (C2581) this.f18972.get(i);
        if (m16663(c2581, j)) {
            c2581.f4256 = true;
            c2581.f4258 = i2;
            if (i == this.f18995) {
                this.f18990 = null;
            }
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        canvas.drawColor(this.f18998);
        if (this.f18977 == null) {
            return;
        }
        int i = this.f18998 == -1 ? -12303292 : -3355444;
        Paint paint = this.f18996;
        paint.setColor(i);
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f18972;
            if (i2 >= sparseArray.size()) {
                return;
            }
            C2581 c2581 = (C2581) sparseArray.valueAt(i2);
            C10629 c10629 = this.f18977;
            int i3 = c2581.f4261;
            float fM24441 = (float) ((c10629.m24441(i3) - this.f19000) * ((double) this.f18994));
            float fM24442 = ((float) (this.f18977.m24442(i3) * ((double) this.f18994))) + fM24441;
            boolean z = fM24441 < ((float) getHeight()) && fM24442 > 0.0f;
            if (c2581.f4259 == null) {
                if (z && !this.f18997.m49255(i3)) {
                    canvas.drawText(getResources().getString(c2581.f4256 ? c2581.f4258 : R.string.MT_Protector), getWidth() / 2.0f, (Math.min(getHeight(), fM24442) + Math.max(0.0f, fM24441)) / 2.0f, paint);
                }
                f2 = 2.0f;
                paint = paint;
            } else {
                float fM24443 = ((float) this.f18977.m24443(i3)) * this.f18994;
                float width = (((getWidth() * this.f18994) - (this.f18977.m24445(i3) * fM24443)) / 2.0f) + this.f18989;
                float fM24440 = (((float) this.f18977.m24440(i3)) * this.f18994) + fM24441;
                Matrix matrix = this.f18980;
                matrix.setTranslate(width, fM24440);
                matrix.preScale(fM24443, fM24443);
                matrix.preConcat(c2581.f4262);
                RectF rectF = this.f18993;
                rectF.setEmpty();
                if (z) {
                    Matrix matrix2 = this.f18986;
                    if (matrix.invert(matrix2)) {
                        f = 0.0f;
                        rectF.set(0.0f, Math.max(0.0f, fM24441), getWidth(), Math.min(getHeight(), fM24442));
                        matrix2.mapRect(rectF);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                ((C17135) c2581.f4259).m38789(rectF, fM24443, z);
                if (z) {
                    int iSave = canvas.save();
                    canvas.clipRect(f, Math.max(f, fM24441), getWidth(), Math.min(getHeight(), fM24442));
                    canvas.concat(matrix);
                    ((C17135) c2581.f4259).m38788(canvas, this.f18983);
                    canvas.restoreToCount(iSave);
                }
                f2 = 2.0f;
            }
            if (z && this.f18997.m49255(i3) && this.f18991 <= 1) {
                int iSave2 = canvas.save();
                canvas.clipRect(0.0f, Math.max(0.0f, fM24441), getWidth(), Math.min(getHeight(), fM24442));
                this.f18992.m35225(canvas, getWidth() / f2, (Math.min(getHeight(), fM24442) + Math.max(0.0f, fM24441)) / f2);
                canvas.restoreToCount(iSave2);
            }
            i2++;
            paint = paint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۢ */
    public double m16670() {
        C10629 c10629 = this.f18977;
        if (c10629 == null) {
            return 0.0d;
        }
        return Math.min(0.0d, (c10629.m24442(0) - ((double) (getHeight() / this.f18994))) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷ */
    public double m16682() {
        if (this.f18977 == null) {
            return 0.0d;
        }
        double height = getHeight() / this.f18994;
        double dM16670 = m16670();
        double dM24439 = this.f18977.m24439() - height;
        C10629 c10629 = this.f18977;
        return Math.max(dM16670, Math.max(0.0d, (height - c10629.m24442(c10629.m24434() - 1)) / 2.0d) + dM24439);
    }

    /* JADX INFO: renamed from: ۜ */
    private void m16667() {
        this.f19000 = Math.max(m16670(), Math.min(m16682(), this.f19000));
        this.f18989 = Math.max((1.0f - this.f18994) * getWidth(), Math.min(0.0f, this.f18989));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m16656(float f, float f2) {
        this.f18974 = false;
        this.f18990 = null;
        this.f19000 -= (double) (f2 / this.f18994);
        this.f18989 += f;
        m16675();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16660(C7276 c7276, float f, float f2, float f3) {
        if (c7276.f18977 == null) {
            return;
        }
        c7276.f18974 = false;
        c7276.f18990 = null;
        float fMax = Math.max(1.0f, Math.min(5.0f, f));
        double d = c7276.f19000;
        float f4 = c7276.f18994;
        c7276.f18989 = f2 - (((f2 - c7276.f18989) * fMax) / f4);
        c7276.f18994 = fMax;
        c7276.f19000 = (d + ((double) (f3 / f4))) - ((double) (f3 / fMax));
        c7276.m16675();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount;
        if (this.f18997 == null) {
            return false;
        }
        boolean z = this.f18991 > 1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            pointerCount = 0;
        } else {
            pointerCount = motionEvent.getPointerCount() - (actionMasked == 6 ? 1 : 0);
        }
        this.f18991 = pointerCount;
        if (actionMasked == 0) {
            m16669();
            this.f18981 = true;
            this.f18987 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f18987 = true;
            m16669();
        }
        this.f18988.onTouchEvent(motionEvent);
        this.f18976.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f18981 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (actionMasked == 3) {
                m16669();
            }
            invalidate();
        }
        if (z != (this.f18991 > 1)) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        int i;
        super.performClick();
        if (this.f18984 == null) {
            return true;
        }
        C21831 c21831 = this.f18997;
        if (c21831 == null || (i = this.f18995) < 0 || !c21831.m49255(i)) {
            this.f18984.mo11377();
            return true;
        }
        this.f18984.mo11380(this.f18995);
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f18978;
        if (overScroller.computeScrollOffset()) {
            m16656(overScroller.getCurrX() - this.f18985, this.f18982 - overScroller.getCurrY());
            this.f18985 = overScroller.getCurrX();
            this.f18982 = overScroller.getCurrY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ۡ */
    private void m16669() {
        this.f18978.forceFinished(true);
        ValueAnimator valueAnimator = this.f18971;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18971 = null;
        }
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final void mo16686() {
        m16669();
        this.f18981 = false;
        this.f18991 = 0;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f18976.onTouchEvent(motionEventObtain);
        this.f18988.onTouchEvent(motionEventObtain);
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
        mo16686();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        mo16686();
        this.f18999.removeCallbacks(this.f18973);
        super.onDetachedFromWindow();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܿ */
    public final void mo16698() {
        mo16686();
        this.f18999.removeCallbacks(this.f18973);
        C21831 c21831 = this.f18997;
        SparseArray sparseArray = this.f18972;
        if (c21831 != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                m16657((C2581) sparseArray.valueAt(i));
            }
        }
        sparseArray.clear();
        this.f18997 = null;
        this.f18977 = null;
        this.f18995 = -1;
        this.f18974 = false;
        this.f18990 = null;
        this.f19000 = 0.0d;
        this.f18994 = 1.0f;
        this.f18989 = 0.0f;
        invalidate();
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ܳ */
    public final Bundle mo16695() {
        InterfaceC5421 interfaceC5421;
        if (this.f18990 != null) {
            return new Bundle(this.f18990);
        }
        if (this.f18977 == null || this.f18995 < 0 || getWidth() == 0 || !this.f18977.m24444(this.f18995)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("continuous", true);
        double dMax = Math.max(this.f18977.m24441(this.f18995), Math.min(this.f18977.m24441(this.f18995) + this.f18977.m24442(this.f18995), this.f19000 + ((double) (getHeight() / (this.f18994 * 2.0f)))));
        bundle.putDouble("fraction", (dMax - this.f18977.m24441(this.f18995)) / this.f18977.m24442(this.f18995));
        bundle.putFloat("screenY", (float) (((dMax - this.f19000) * ((double) this.f18994)) / ((double) getHeight())));
        C2581 c2581 = (C2581) this.f18972.get(this.f18995);
        bundle.putInt("orientation", (c2581 == null || (interfaceC5421 = c2581.f4259) == null) ? 0 : ((C17135) interfaceC5421).f51003.f49788);
        bundle.putFloat("zoom", this.f18994);
        bundle.putFloat("centerX", ((getWidth() / 2.0f) - this.f18989) / (getWidth() * this.f18994));
        bundle.putInt("width", this.f18977.m24445(this.f18995));
        bundle.putInt("height", this.f18977.m24436(this.f18995));
        return bundle;
    }

    @Override // p067l.AbstractC14651
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo16692(Bundle bundle) {
        this.f18990 = null;
        if (bundle == null || this.f18997 == null || !bundle.getBoolean("continuous")) {
            return false;
        }
        double d = bundle.getDouble("fraction", Double.NaN);
        float f = bundle.getFloat("zoom", Float.NaN);
        float f2 = bundle.getFloat("centerX", Float.NaN);
        float f3 = bundle.getFloat("screenY", Float.NaN);
        if (d < 0.0d || d > 1.0d || f < 1.0f || f > 5.0f || f2 < 0.0f || f2 > 1.0f || f3 < 0.0f || f3 > 1.0f) {
            return false;
        }
        this.f18990 = new Bundle(bundle);
        m16685();
        return true;
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m16685() {
        if (this.f18990 == null || this.f18977 == null || getWidth() <= 0 || getHeight() <= 0 || !this.f18977.m24444(this.f18995)) {
            return;
        }
        Bundle bundle = this.f18990;
        C2581 c2581 = (C2581) this.f18972.get(this.f18995);
        if (bundle.getInt("width") != this.f18977.m24445(this.f18995) || bundle.getInt("height") != this.f18977.m24436(this.f18995) || c2581 == null || c2581.f4259 == null || bundle.getInt("orientation") != ((C17135) c2581.f4259).f51003.f49788) {
            this.f18990 = null;
            return;
        }
        this.f18974 = false;
        this.f18994 = bundle.getFloat("zoom");
        this.f18989 = (getWidth() / 2.0f) - ((bundle.getFloat("centerX") * getWidth()) * this.f18994);
        m16662(new C20688(this.f18995, bundle.getDouble("fraction"), bundle.getFloat("screenY") * getHeight()));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(true);
        C21831 c21831 = this.f18997;
        if (c21831 != null && (i = this.f18995) >= 0 && c21831.m49255(i)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (this.f19000 > m16670()) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (this.f19000 < m16682()) {
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            m16669();
            m16656(0.0f, getHeight() * 0.8f * (i == 4096 ? -1 : 1));
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
