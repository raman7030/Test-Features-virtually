package l;

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
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.ۜۗܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E14L */
/* JADX INFO: loaded from: classes2.dex */
public class C6499 extends View {

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20060 = 0;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f20061;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0923 f20062;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20063;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20064;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C16376 f20065;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f20066;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f20067;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final RectF f20068;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public OverScroller f20069;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C11329 f20070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f20071;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20072;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public EdgeEffect f20073;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f20074;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public float f20075;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final float f20076;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f20077;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C1539 f20078;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1539 f20079;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public PointF f20080;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f20081;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f20082;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f20083;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f20084;

    public C6499(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C6499(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20075 = 0.5f;
        this.f20080 = new PointF();
        this.f20068 = new RectF();
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.f20076 = C10069.f30266 * 48.0f;
        C1539 c1539 = new C1539(0);
        this.f20078 = c1539;
        c1539.setTextAlign(Paint.Align.LEFT);
        c1539.setTypeface(Typeface.DEFAULT);
        float f = C10069.f30270 * 18.0f;
        c1539.setTextSize(f);
        C1539 c15310 = new C1539(0);
        this.f20079 = c15310;
        c15310.setTextAlign(Paint.Align.CENTER);
        c15310.setTextSize(f);
        this.f20071 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f20073 = new EdgeEffect(context);
        this.f20064 = new EdgeEffect(context);
        this.f20072 = new EdgeEffect(context);
        this.f20063 = new EdgeEffect(context);
        OverScroller overScroller = new OverScroller(context);
        this.f20069 = overScroller;
        overScroller.forceFinished(true);
        this.f20062 = new C0923(context, new C14259(this));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17984(int i) {
        C16376 c16376 = this.f20065;
        if (c16376 != null) {
            c16376.f50391 = ((C7246) c16376.f50393.get(i)).f22229;
            invalidate();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17976(int i) {
        C16376 c16376 = this.f20065;
        if (c16376 != null) {
            return ((C7246) c16376.f50393.get(i)).m19360();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17979(C11329 c11329) {
        this.f20070 = c11329;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16376 c16376 = this.f20065;
        if (c16376 != null) {
            Iterator it = c16376.f50393.iterator();
            while (it.hasNext()) {
                ((C7246) it.next()).m19361();
            }
            c16376.f50389 = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C16376 c16376 = this.f20065;
        C0923 c0923 = this.f20062;
        if (c16376 == null) {
            c0923.m3331(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                m17970();
                return true;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            int iM17971 = 0;
            if (actionMasked2 == 0) {
                OverScroller overScroller = this.f20069;
                if (!overScroller.isFinished()) {
                    overScroller.abortAnimation();
                }
                this.f20077 = 0;
                this.f20067 = false;
            } else if (actionMasked2 == 1) {
                m17970();
            } else if (actionMasked2 != 2) {
                if (actionMasked2 == 3) {
                    m17970();
                } else if (actionMasked2 == 5) {
                    this.f20077++;
                    if (!this.f20067) {
                        this.f20066 = m17954(motionEvent);
                        this.f20061 = this.f20075;
                        this.f20067 = true;
                        this.f20084 = false;
                        this.f20081 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f20082 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked2 == 6) {
                    this.f20077--;
                    return true;
                }
            } else if (this.f20077 == 1 && this.f20067) {
                float fM17954 = m17954(motionEvent);
                if (!this.f20084) {
                    if (Math.abs(fM17954 - this.f20066) > this.f20071) {
                        this.f20084 = true;
                        c0923.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    }
                }
                float scrollX = this.f20081 + getScrollX();
                float scrollY = this.f20082 + getScrollY();
                PointF pointF = this.f20080;
                pointF.set(scrollX, scrollY);
                float f = pointF.x;
                float f2 = this.f20075;
                float f3 = this.f20076;
                pointF.x = (f / f2) - f3;
                pointF.y = (pointF.y / f2) - f3;
                float f4 = (this.f20061 * fM17954) / this.f20066;
                this.f20075 = f4;
                if (f4 > 1.0f) {
                    this.f20075 = 1.0f;
                } else if (f4 < 0.05f) {
                    this.f20075 = 0.05f;
                }
                m17958(pointF);
                int i = (int) (pointF.x - this.f20081);
                if (i < 0) {
                    i = 0;
                } else {
                    int iM17967 = m17967();
                    if (i > iM17967) {
                        i = iM17967;
                    }
                }
                int i2 = (int) (pointF.y - this.f20082);
                if (i2 >= 0 && i2 <= (iM17971 = m17971())) {
                    iM17971 = i2;
                }
                scrollTo(i, iM17971);
                invalidate();
                return true;
            }
            if (!this.f20067) {
                c0923.m3331(motionEvent);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m17970() {
        EdgeEffect edgeEffect = this.f20073;
        edgeEffect.onRelease();
        boolean zIsFinished = edgeEffect.isFinished();
        EdgeEffect edgeEffect2 = this.f20064;
        edgeEffect2.onRelease();
        boolean zIsFinished2 = zIsFinished | edgeEffect2.isFinished();
        EdgeEffect edgeEffect3 = this.f20072;
        edgeEffect3.onRelease();
        boolean zIsFinished3 = zIsFinished2 | edgeEffect3.isFinished();
        EdgeEffect edgeEffect4 = this.f20063;
        edgeEffect4.onRelease();
        if (zIsFinished3 || edgeEffect4.isFinished()) {
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m17954(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17981(C16376 c16376) {
        this.f20065 = c16376;
        if (c16376 == null) {
            this.f20083 = 0;
            this.f20074 = 0;
            scrollTo(0, 0);
        } else {
            this.f20074 = c16376.f50394;
            this.f20083 = c16376.f50392;
            m17982(m17975(), false, false);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17978(C10130 c10130) {
        c10130.writeInt(getScrollX());
        c10130.writeInt(getScrollY());
        c10130.m25419(this.f20075);
        if (this.f20065 == null) {
            c10130.writeByte(0);
            return;
        }
        c10130.m25425(true);
        C16376 c16376 = this.f20065;
        LinkedHashSet<C5835> linkedHashSet = c16376.f50390;
        c10130.writeInt(1986488099);
        c10130.writeInt(c16376.f50394);
        c10130.writeInt(c16376.f50392);
        c10130.writeInt(c16376.f50391);
        ArrayList arrayList = c16376.f50393;
        c10130.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7246) it.next()).m19353(c10130);
        }
        c10130.writeInt(linkedHashSet.size());
        for (C5835 c5835 : linkedHashSet) {
            c10130.writeInt(c5835.f17891.f22229);
            c10130.writeInt(c5835.f17887.f22229);
            c10130.writeInt(c5835.f17889);
            if (c5835.f17888 != null && c5835.f17894 != null) {
                c10130.writeByte(1);
                c10130.m25439(c5835.f17888);
                c10130.m25439(c5835.f17894);
            } else {
                c10130.writeByte(0);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17980(C12951 c12951) {
        final int i = c12951.readInt();
        final int i2 = c12951.readInt();
        this.f20075 = c12951.m31495();
        if (c12951.m31498()) {
            C16376 c16376 = new C16376(c12951);
            this.f20065 = c16376;
            this.f20074 = c16376.f50394;
            this.f20083 = c16376.f50392;
        } else {
            this.f20065 = null;
        }
        post(new Runnable() { // from class: l.ᩳۗܿ
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = C6499.f20060;
                C6499 c6499 = this.f54406;
                c6499.scrollTo(i, i2);
                c6499.invalidate();
            }
        });
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f20069;
        if (overScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            if (currY != scrollY) {
                if (scrollY > 0 && currY <= 0) {
                    this.f20064.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM17971 = m17971();
                    if (scrollY < iM17971 && currY >= iM17971) {
                        this.f20063.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            if (currX != scrollX) {
                if (scrollX > 0 && currX <= 0) {
                    this.f20073.onAbsorb((int) overScroller.getCurrVelocity());
                } else {
                    int iM17967 = m17967();
                    if (scrollX < iM17967 && currX >= iM17967) {
                        this.f20072.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
            }
            scrollTo(currX, currY);
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int m17967() {
        return (int) Math.max(0.0f, ((((this.f20076 * 2.0f) + this.f20074) * this.f20075) - getWidth()) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int m17971() {
        return (int) Math.max(0.0f, ((((this.f20076 * 2.0f) + this.f20083) * this.f20075) - getHeight()) + 0.5f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17955(C6499 c6499, int i) {
        if (i < 0) {
            return 0;
        }
        int iM17967 = c6499.m17967();
        return i > iM17967 ? iM17967 : i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m17963(C6499 c6499, int i) {
        if (i < 0) {
            return 0;
        }
        int iM17971 = c6499.m17971();
        return i > iM17971 ? iM17971 : i;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = C10069.f30266;
        canvas.drawColor(C21943.m49424(-15527149, -460552));
        C16376 c16376 = this.f20065;
        if (c16376 != null) {
            LinkedHashSet<C5835> linkedHashSet = c16376.f50390;
            float scrollX = getScrollX();
            RectF rectF = this.f20068;
            rectF.left = scrollX;
            rectF.top = getScrollY();
            rectF.right = rectF.left + getWidth();
            float height = rectF.top + getHeight();
            float f2 = this.f20075;
            float f3 = rectF.left / f2;
            float f4 = this.f20076;
            rectF.left = f3 - f4;
            rectF.top = (rectF.top / f2) - f4;
            rectF.right = (rectF.right / f2) - f4;
            rectF.bottom = (height / f2) - f4;
            int iSave = canvas.save();
            float f5 = f4 * f2;
            canvas.translate(f5, f5);
            int i = c16376.f50391;
            C1539 c1539 = this.f20078;
            if (i != -1) {
                for (C5835 c5835 : linkedHashSet) {
                    int i2 = c5835.f17893.f50391;
                    if (i2 != c5835.f17891.f22229 && i2 != c5835.f17887.f22229) {
                        c5835.m16345(canvas, c1539, rectF, f2);
                    }
                }
                for (C5835 c5836 : linkedHashSet) {
                    int i3 = c5836.f17893.f50391;
                    if (i3 == c5836.f17891.f22229 || i3 == c5836.f17887.f22229) {
                        c5836.m16345(canvas, c1539, rectF, f2);
                    }
                }
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((C5835) it.next()).m16345(canvas, c1539, rectF, f2);
                }
            }
            int iM49424 = C21943.m49424(-7829368, -5197648);
            C1539 c15310 = this.f20079;
            c15310.setColor(iM49424);
            Iterator it2 = c16376.f50393.iterator();
            while (it2.hasNext()) {
                ((C7246) it2.next()).m19351(canvas, c1539, c15310, rectF, f2);
            }
            canvas.restoreToCount(iSave);
            m17957(canvas);
            return;
        }
        m17957(canvas);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m17957(Canvas canvas) {
        boolean zDraw;
        EdgeEffect edgeEffect = this.f20073;
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
        EdgeEffect edgeEffect2 = this.f20064;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            int iSave2 = canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            edgeEffect2.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        float f = this.f20076;
        EdgeEffect edgeEffect3 = this.f20072;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            canvas.rotate(90.0f);
            canvas.translate(getScrollY(), -Math.max(((f * 2.0f) + this.f20074) * this.f20075, getWidth()));
            edgeEffect3.setSize(getHeight(), width);
            zDraw |= edgeEffect3.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect4 = this.f20063;
        if (edgeEffect4 != null && !edgeEffect4.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            canvas.translate((-getWidth()) - getScrollX(), -Math.max(((f * 2.0f) + this.f20083) * this.f20075, getHeight()));
            edgeEffect4.setSize(getWidth(), getHeight());
            zDraw |= edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave4);
        }
        if (zDraw) {
            int i = C17648.f53953;
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17975() {
        C16376 c16376 = this.f20065;
        if (c16376 == null) {
            return 0;
        }
        return ((C7246) c16376.f50393.get(0)).m19360();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m17983() {
        C7246 c7246;
        C16376 c16376 = this.f20065;
        if (c16376 == null) {
            return 0;
        }
        ArrayList arrayList = c16376.f50393;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
            c7246 = (C7246) arrayList.get(size);
        } while (c7246.f22234.isEmpty());
        return c7246.m19355().f34288;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17982(int i, boolean z, boolean z2) {
        C16376 c16376 = this.f20065;
        int iM17971 = 0;
        if (c16376 != null) {
            for (C7246 c7246 : c16376.f50393) {
                if (!c7246.f22234.isEmpty() && i <= c7246.m19355().f34288) {
                    float fM19357 = c7246.m19357();
                    float fM19362 = c7246.m19362();
                    float fM19359 = c7246.m19359();
                    float fM19349 = c7246.m19349();
                    float f = this.f20076 / 2.0f;
                    float width = getWidth() / this.f20075;
                    float height = getHeight() / this.f20075;
                    PointF pointF = new PointF();
                    if (fM19359 + f + f < width) {
                        pointF.x = fM19357 - ((width - fM19359) / 2.0f);
                    } else {
                        pointF.x = fM19357 - f;
                    }
                    if (!z2 && fM19349 + f + f < height) {
                        pointF.y = fM19362 - ((height - fM19349) / 2.0f);
                    } else {
                        pointF.y = fM19362 - f;
                    }
                    if (z2) {
                        Paint paint = new Paint(1);
                        paint.setTypeface(Typeface.DEFAULT);
                        paint.setTextSize(C10069.f30270 * 18.0f);
                        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                        float f2 = fontMetrics.descent - fontMetrics.ascent;
                        Iterator it = c7246.f22234.iterator();
                        while (it.hasNext() && ((C11480) it.next()).f34288 != i) {
                            pointF.y += f2;
                        }
                    }
                    m17958(pointF);
                    int i2 = (int) pointF.x;
                    if (i2 < 0) {
                        i2 = 0;
                    } else {
                        int iM17967 = m17967();
                        if (i2 > iM17967) {
                            i2 = iM17967;
                        }
                    }
                    int i3 = (int) pointF.y;
                    if (i3 >= 0 && i3 <= (iM17971 = m17971())) {
                        iM17971 = i3;
                    }
                    scrollTo(i2, iM17971);
                    if (z) {
                        c16376.f50391 = c7246.f22229;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM17967;
        if (z) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int iM17971 = 0;
            if (scrollX < 0) {
                iM17967 = 0;
            } else {
                iM17967 = m17967();
                if (scrollX <= iM17967) {
                    iM17967 = scrollX;
                }
            }
            if (scrollY >= 0 && scrollY <= (iM17971 = m17971())) {
                iM17971 = scrollY;
            }
            if (scrollX == iM17967 && scrollY == iM17971) {
                return;
            }
            scrollTo(iM17967, iM17971);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17965(C6499 c6499, PointF pointF) {
        float f = pointF.x;
        float f2 = c6499.f20075;
        float f3 = c6499.f20076;
        pointF.x = (f / f2) - f3;
        pointF.y = (pointF.y / f2) - f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m17958(PointF pointF) {
        float f = pointF.x;
        float f2 = this.f20076;
        float f3 = this.f20075;
        pointF.x = (f + f2) * f3;
        pointF.y = (pointF.y + f2) * f3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17977(OutputStream outputStream) {
        float f;
        C1539 c1539;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i = this.f20074;
        int i2 = this.f20083;
        int i3 = (int) (((((((long) i) * ((long) i2)) * 2) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) / 2);
        if (i3 <= 250) {
            f = 0.5f;
        } else {
            f = i3 <= 500 ? 0.4f : 0.3f;
        }
        float f2 = this.f20076;
        float f3 = 2.0f * f2;
        C16376 c16376 = this.f20065;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (((i + f3) * f) + 0.5f), (int) (((f3 + i2) * f) + 0.5f), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f4 = C10069.f30266;
        canvas.drawColor(C21943.m49424(-15527149, -460552));
        if (c16376 != null) {
            float f5 = f2 * f;
            canvas.translate(f5, f5);
            float f6 = this.f20074;
            float f7 = this.f20083;
            RectF rectF = this.f20068;
            rectF.set(0.0f, 0.0f, f6, f7);
            Iterator it = c16376.f50390.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c1539 = this.f20078;
                if (!zHasNext) {
                    break;
                } else {
                    ((C5835) it.next()).m16345(canvas, c1539, rectF, f);
                }
            }
            int iM49424 = C21943.m49424(-7829368, -5197648);
            C1539 c15310 = this.f20079;
            c15310.setColor(iM49424);
            Iterator it2 = c16376.f50393.iterator();
            while (it2.hasNext()) {
                ((C7246) it2.next()).m19351(canvas, c1539, c15310, rectF, f);
            }
        }
        bitmapCreateBitmap.compress(compressFormat, 80, outputStream);
        bitmapCreateBitmap.recycle();
    }
}
