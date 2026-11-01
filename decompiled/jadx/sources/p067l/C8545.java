package p067l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۜۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes2.dex */
public class C8545 extends View {

    /* JADX INFO: renamed from: ܺ֫ */
    public static final /* synthetic */ int f22934 = 0;

    /* JADX INFO: renamed from: ֫֫ */
    public float f22935;

    /* JADX INFO: renamed from: ۗ */
    public C0888 f22936;

    /* JADX INFO: renamed from: ۙ */
    public EdgeEffect f22937;

    /* JADX INFO: renamed from: ۛ */
    public EdgeEffect f22938;

    /* JADX INFO: renamed from: ۜ֫ */
    public C17932 f22939;

    /* JADX INFO: renamed from: ۟ */
    public float f22940;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f22941;

    /* JADX INFO: renamed from: ۢ֫ */
    public final RectF f22942;

    /* JADX INFO: renamed from: ۤ */
    public OverScroller f22943;

    /* JADX INFO: renamed from: ۧ֫ */
    public C13136 f22944;

    /* JADX INFO: renamed from: ۨ */
    public final int f22945;

    /* JADX INFO: renamed from: ۫ */
    public EdgeEffect f22946;

    /* JADX INFO: renamed from: ۬ */
    public EdgeEffect f22947;

    /* JADX INFO: renamed from: ܰ */
    public int f22948;

    /* JADX INFO: renamed from: ܳ֫ */
    public float f22949;

    /* JADX INFO: renamed from: ܽ֫ */
    public final float f22950;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f22951;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C3831 f22952;

    /* JADX INFO: renamed from: ᩶ */
    public C3831 f22953;

    /* JADX INFO: renamed from: ᩷֫ */
    public PointF f22954;

    /* JADX INFO: renamed from: ᩸ */
    public float f22955;

    /* JADX INFO: renamed from: ᩹ */
    public float f22956;

    /* JADX INFO: renamed from: ᩺ */
    public int f22957;

    /* JADX INFO: renamed from: ᩻֫ */
    public boolean f22958;

    public C8545(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8545(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22949 = 0.5f;
        this.f22954 = new PointF();
        this.f22942 = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f22950 = C11938.f33224 * 48.0f;
        C3831 c3831 = new C3831(0);
        this.f22952 = c3831;
        c3831.setTextAlign(Paint.Align.LEFT);
        c3831.setTypeface(Typeface.DEFAULT);
        float f = C11938.f33228 * 18.0f;
        c3831.setTextSize(f);
        C3831 c3832 = new C3831(0);
        this.f22953 = c3832;
        c3832.setTextAlign(Paint.Align.CENTER);
        c3832.setTextSize(f);
        this.f22945 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f22947 = new EdgeEffect(context);
        this.f22938 = new EdgeEffect(context);
        this.f22946 = new EdgeEffect(context);
        this.f22937 = new EdgeEffect(context);
        OverScroller overScroller = new OverScroller(context);
        this.f22943 = overScroller;
        overScroller.forceFinished(true);
        this.f22936 = new C0888(context, new C15920(this));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19932(int i) {
        C17932 c17932 = this.f22939;
        if (c17932 != null) {
            c17932.f53562 = ((C9255) c17932.f53564.get(i)).f25111;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19924(int i) {
        C17932 c17932 = this.f22939;
        if (c17932 != null) {
            return ((C9255) c17932.f53564.get(i)).m21309();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19927(C13136 c13136) {
        this.f22944 = c13136;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C17932 c17932 = this.f22939;
        if (c17932 != null) {
            Iterator it = c17932.f53564.iterator();
            while (it.hasNext()) {
                ((C9255) it.next()).m21310();
            }
            c17932.f53560 = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C17932 c17932 = this.f22939;
        C0888 c0888 = this.f22936;
        if (c17932 == null) {
            c0888.m5650(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                m19918();
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            int iM19919 = 0;
            if (actionMasked2 == 0) {
                OverScroller overScroller = this.f22943;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                this.f22951 = 0;
                this.f22941 = false;
            } else if (actionMasked2 == 1) {
                m19918();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    m19918();
                } else if (actionMasked2 == 5) {
                    this.f22951++;
                    if (!this.f22941) {
                        this.f22940 = m19902(motionEvent);
                        this.f22935 = this.f22949;
                        this.f22941 = true;
                        this.f22958 = false;
                        this.f22955 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f22956 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked2 == 6) {
                    this.f22951--;
                    return true;
                }
            } else if (this.f22951 == 1 && this.f22941) {
                float fM19902 = m19902(motionEvent);
                if (!this.f22958) {
                    if (Math.abs(fM19902 - this.f22940) > this.f22945) {
                        this.f22958 = true;
                        c0888.m5650(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                }
                float scrollX = this.f22955 + getScrollX();
                float scrollY = this.f22956 + getScrollY();
                PointF pointF = this.f22954;
                pointF.set(scrollX, scrollY);
                float f = pointF.x;
                float f2 = this.f22949;
                float f3 = this.f22950;
                pointF.x = (f / f2) - f3;
                pointF.y = (pointF.y / f2) - f3;
                float f4 = (this.f22935 * fM19902) / this.f22940;
                this.f22949 = f4;
                if (f4 > 1.0f) {
                    this.f22949 = 1.0f;
                } else if (f4 < 0.05f) {
                    this.f22949 = 0.05f;
                }
                m19906(pointF);
                int i = (int) (pointF.x - this.f22955);
                if (i < 0) {
                    i = 0;
                } else {
                    int iM19915 = m19915();
                    if (i > iM19915) {
                        i = iM19915;
                    }
                }
                int i2 = (int) (pointF.y - this.f22956);
                if (i2 >= 0 && i2 <= (iM19919 = m19919())) {
                    iM19919 = i2;
                }
                scrollTo(i, iM19919);
                invalidate();
                return true;
            }
            if (!this.f22941) {
                c0888.m5650(motionEvent);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    private void m19918() {
        EdgeEffect edgeEffect = this.f22947;
        edgeEffect.onRelease();
        boolean zIsFinished = edgeEffect.isFinished();
        EdgeEffect edgeEffect2 = this.f22938;
        edgeEffect2.onRelease();
        boolean zIsFinished2 = zIsFinished | edgeEffect2.isFinished();
        EdgeEffect edgeEffect3 = this.f22946;
        edgeEffect3.onRelease();
        boolean zIsFinished3 = zIsFinished2 | edgeEffect3.isFinished();
        EdgeEffect edgeEffect4 = this.f22937;
        edgeEffect4.onRelease();
        if (zIsFinished3 || edgeEffect4.isFinished()) {
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m19902(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19929(C17932 c17932) {
        this.f22939 = c17932;
        if (c17932 == null) {
            this.f22957 = 0;
            this.f22948 = 0;
            scrollTo(0, 0);
        } else {
            this.f22948 = c17932.f53565;
            this.f22957 = c17932.f53563;
            m19930(m19923(), false, false);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19926(C11996 c11996) {
        c11996.writeInt(getScrollX());
        c11996.writeInt(getScrollY());
        c11996.m27439(this.f22949);
        if (this.f22939 == null) {
            c11996.writeByte(0);
            return;
        }
        c11996.m27445(true);
        C17932 c17932 = this.f22939;
        LinkedHashSet<C7914> linkedHashSet = c17932.f53561;
        c11996.writeInt(1986488099);
        c11996.writeInt(c17932.f53565);
        c11996.writeInt(c17932.f53563);
        c11996.writeInt(c17932.f53562);
        ArrayList arrayList = c17932.f53564;
        c11996.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C9255) it.next()).m21302(c11996);
        }
        c11996.writeInt(linkedHashSet.size());
        for (C7914 c7914 : linkedHashSet) {
            c11996.writeInt(c7914.f20743.f25111);
            c11996.writeInt(c7914.f20739.f25111);
            c11996.writeInt(c7914.f20741);
            if (c7914.f20740 != null && c7914.f20746 != null) {
                c11996.writeByte(1);
                c11996.m27459(c7914.f20740);
                c11996.m27459(c7914.f20746);
            } else {
                c11996.writeByte(0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19928(C14677 c14677) {
        final int i = c14677.readInt();
        final int i2 = c14677.readInt();
        this.f22949 = c14677.m33582();
        if (c14677.m33585()) {
            C17932 c17932 = new C17932(c14677);
            this.f22939 = c17932;
            this.f22948 = c17932.f53565;
            this.f22957 = c17932.f53563;
        } else {
            this.f22939 = null;
        }
        post(new Runnable() { // from class: l.ᩳۗܿ
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = C8545.f22934;
                C8545 c8545 = this.f57599;
                c8545.scrollTo(i, i2);
                c8545.invalidate();
            }
        });
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f22943;
        if (overScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            if (currY != scrollY) {
                if (scrollY > 0 && currY <= 0) {
                    this.f22938.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM19919 = m19919();
                    if (scrollY < iM19919 && currY >= iM19919) {
                        this.f22937.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            if (currX != scrollX) {
                if (scrollX > 0 && currX <= 0) {
                    this.f22947.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM19915 = m19915();
                    if (scrollX < iM19915 && currX >= iM19915) {
                        this.f22946.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            scrollTo(currX, currY);
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public int m19915() {
        return (int) Math.max(0.0f, ((((this.f22950 * 2.0f) + this.f22948) * this.f22949) - getWidth()) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public int m19919() {
        return (int) Math.max(0.0f, ((((this.f22950 * 2.0f) + this.f22957) * this.f22949) - getHeight()) + 0.5f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m19903(C8545 c8545, int i) {
        if (i < 0) {
            return 0;
        }
        int iM19915 = c8545.m19915();
        return i > iM19915 ? iM19915 : i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m19911(C8545 c8545, int i) {
        if (i < 0) {
            return 0;
        }
        int iM19919 = c8545.m19919();
        return i > iM19919 ? iM19919 : i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = C11938.f33224;
        canvas.drawColor(C23223.m51761(-15527149, -460552));
        C17932 c17932 = this.f22939;
        if (c17932 != null) {
            LinkedHashSet<C7914> linkedHashSet = c17932.f53561;
            float scrollX = getScrollX();
            RectF rectF = this.f22942;
            rectF.left = scrollX;
            rectF.top = getScrollY();
            rectF.right = rectF.left + getWidth();
            float height = rectF.top + getHeight();
            float f2 = this.f22949;
            float f3 = rectF.left / f2;
            float f4 = this.f22950;
            rectF.left = f3 - f4;
            rectF.top = (rectF.top / f2) - f4;
            rectF.right = (rectF.right / f2) - f4;
            rectF.bottom = (height / f2) - f4;
            int iSave = canvas.save();
            float f5 = f4 * f2;
            canvas.translate(f5, f5);
            int i = c17932.f53562;
            C3831 c3831 = this.f22952;
            if (i != -1) {
                for (C7914 c7914 : linkedHashSet) {
                    int i2 = c7914.f20745.f53562;
                    if (i2 != c7914.f20743.f25111 && i2 != c7914.f20739.f25111) {
                        c7914.m18270(canvas, c3831, rectF, f2);
                    }
                }
                for (C7914 c7915 : linkedHashSet) {
                    int i3 = c7915.f20745.f53562;
                    if (i3 == c7915.f20743.f25111 || i3 == c7915.f20739.f25111) {
                        c7915.m18270(canvas, c3831, rectF, f2);
                    }
                }
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((C7914) it.next()).m18270(canvas, c3831, rectF, f2);
                }
            }
            int iM51761 = C23223.m51761(-7829368, -5197648);
            C3831 c3832 = this.f22953;
            c3832.setColor(iM51761);
            Iterator it2 = c17932.f53564.iterator();
            while (it2.hasNext()) {
                ((C9255) it2.next()).m21300(canvas, c3831, c3832, rectF, f2);
            }
            canvas.restoreToCount(iSave);
            m19905(canvas);
            return;
        }
        m19905(canvas);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m19905(Canvas canvas) {
        boolean zDraw;
        EdgeEffect edgeEffect = this.f22947;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) - getScrollY(), 0.0f);
            edgeEffect.setSize(getHeight(), getWidth());
            zDraw = edgeEffect.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f22938;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int iSave2 = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            edgeEffect2.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f22950;
        EdgeEffect edgeEffect3 = this.f22946;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f);
            canvas.translate(getScrollY(), -Math.max(((f * 2.0f) + this.f22948) * this.f22949, getWidth()));
            edgeEffect3.setSize(getHeight(), width);
            zDraw |= edgeEffect3.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect4 = this.f22937;
        if (edgeEffect4 != null && !edgeEffect4.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate((-getWidth()) - getScrollX(), -Math.max(((f * 2.0f) + this.f22957) * this.f22949, getHeight()));
            edgeEffect4.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
        if (zDraw) {
            int i = C1717.f57146;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19923() {
        C17932 c17932 = this.f22939;
        if (c17932 == null) {
            return 0;
        }
        return ((C9255) c17932.f53564.get(0)).m21309();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m19931() {
        C9255 c9255;
        C17932 c17932 = this.f22939;
        if (c17932 == null) {
            return 0;
        }
        ArrayList arrayList = c17932.f53564;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
            c9255 = (C9255) arrayList.get(size);
        } while (c9255.f25116.isEmpty());
        return c9255.m21304().f37284;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m19930(int i, boolean z, boolean z2) {
        C17932 c17932 = this.f22939;
        int iM19919 = 0;
        if (c17932 != null) {
            for (C9255 c9255 : c17932.f53564) {
                if (!c9255.f25116.isEmpty() && i <= c9255.m21304().f37284) {
                    float fM21306 = c9255.m21306();
                    float fM21311 = c9255.m21311();
                    float fM21308 = c9255.m21308();
                    float fM21298 = c9255.m21298();
                    float f = this.f22950 / 2.0f;
                    float width = getWidth() / this.f22949;
                    float height = getHeight() / this.f22949;
                    PointF pointF = new PointF();
                    if (fM21308 + f + f < width) {
                        pointF.x = fM21306 - ((width - fM21308) / 2.0f);
                    } else {
                        pointF.x = fM21306 - f;
                    }
                    if (!z2 && fM21298 + f + f < height) {
                        pointF.y = fM21311 - ((height - fM21298) / 2.0f);
                    } else {
                        pointF.y = fM21311 - f;
                    }
                    if (z2) {
                        Paint paint = new Paint(1);
                        paint.setTypeface(Typeface.DEFAULT);
                        paint.setTextSize(C11938.f33228 * 18.0f);
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f2 = fontMetrics.descent - fontMetrics.ascent;
                        Iterator it = c9255.f25116.iterator();
                        while (it.hasNext() && ((C13279) it.next()).f37284 != i) {
                            pointF.y += f2;
                        }
                    }
                    m19906(pointF);
                    int i2 = (int) pointF.x;
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int iM19915 = m19915();
                        if (i2 > iM19915) {
                            i2 = iM19915;
                        }
                    }
                    int i3 = (int) pointF.y;
                    if (i3 >= 0 && i3 <= (iM19919 = m19919())) {
                        iM19919 = i3;
                    }
                    scrollTo(i2, iM19919);
                    if (z) {
                        c17932.f53562 = c9255.f25111;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM19915;
        if (z) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iM19919 = 0;
            if (scrollX < 0) {
                iM19915 = 0;
            } else {
                iM19915 = m19915();
                if (scrollX <= iM19915) {
                    iM19915 = scrollX;
                }
            }
            if (scrollY >= 0 && scrollY <= (iM19919 = m19919())) {
                iM19919 = scrollY;
            }
            if (scrollX == iM19915 && scrollY == iM19919) {
                return;
            }
            scrollTo(iM19915, iM19919);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m19913(C8545 c8545, PointF pointF) {
        float f = pointF.x;
        float f2 = c8545.f22949;
        float f3 = c8545.f22950;
        pointF.x = (f / f2) - f3;
        pointF.y = (pointF.y / f2) - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m19906(PointF pointF) {
        float f = pointF.x;
        float f2 = this.f22950;
        float f3 = this.f22949;
        pointF.x = (f + f2) * f3;
        pointF.y = (pointF.y + f2) * f3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19925(OutputStream outputStream) {
        float f;
        C3831 c3831;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i = this.f22948;
        int i2 = this.f22957;
        int i3 = (int) (((((((long) i) * ((long) i2)) * 2) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / 2);
        if (i3 <= 250) {
            f = 0.5f;
        } else {
            f = i3 <= 500 ? 0.4f : 0.3f;
        }
        float f2 = this.f22950;
        float f3 = 2.0f * f2;
        C17932 c17932 = this.f22939;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (((i + f3) * f) + 0.5f), (int) (((f3 + i2) * f) + 0.5f), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f4 = C11938.f33224;
        canvas.drawColor(C23223.m51761(-15527149, -460552));
        if (c17932 != null) {
            float f5 = f2 * f;
            canvas.translate(f5, f5);
            float f6 = this.f22948;
            float f7 = this.f22957;
            RectF rectF = this.f22942;
            rectF.set(0.0f, 0.0f, f6, f7);
            Iterator it = c17932.f53561.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c3831 = this.f22952;
                if (!zHasNext) {
                    break;
                } else {
                    ((C7914) it.next()).m18270(canvas, c3831, rectF, f);
                }
            }
            int iM51761 = C23223.m51761(-7829368, -5197648);
            C3831 c3832 = this.f22953;
            c3832.setColor(iM51761);
            Iterator it2 = c17932.f53564.iterator();
            while (it2.hasNext()) {
                ((C9255) it2.next()).m21300(canvas, c3831, c3832, rectF, f);
            }
        }
        bitmapCreateBitmap.compress(compressFormat, 80, outputStream);
        bitmapCreateBitmap.recycle();
    }
}
