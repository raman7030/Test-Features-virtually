package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۢۡۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: XA43 */
/* JADX INFO: loaded from: classes3.dex */
public class C9482 extends ViewGroup {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Paint f28808;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f28809;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HandlerC20771 f28810;

    public C9482(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9482(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28810 = new HandlerC20771(this);
        Paint paint = new Paint(1);
        this.f28808 = paint;
        int iM27878 = isInEditMode() ? 20 : C11266.m27878(20.0f);
        this.f28809 = iM27878;
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setShader(new LinearGradient(0.0f, 0.0f, iM27878, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (getChildCount() > 0) {
            return getChildAt(0).getBaseline();
        }
        return super.getBaseline();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        View childAt = getChildAt(0);
        childAt.measure(0, i2);
        setMeasuredDimension(View.getDefaultSize(childAt.getMeasuredWidth(), i), childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        HandlerC20771 handlerC20771 = this.f28810;
        handlerC20771.removeMessages(0);
        handlerC20771.sendMessage(handlerC20771.obtainMessage(0, 0, 0));
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        HandlerC20771 handlerC20771 = this.f28810;
        handlerC20771.removeMessages(0);
        if (i == 0) {
            handlerC20771.sendMessage(handlerC20771.obtainMessage(0, 0, 0));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerC20771 handlerC20771 = this.f28810;
        handlerC20771.removeMessages(0);
        handlerC20771.sendMessage(handlerC20771.obtainMessage(0, 0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28810.removeMessages(0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int width = getWidth();
        int height = getHeight();
        if (view.getWidth() < width) {
            return super.drawChild(canvas, view, j);
        }
        float f = width;
        float f2 = height;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, f, f2, null, 31);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        int i = this.f28809;
        Paint paint = this.f28808;
        canvas.drawRect(0.0f, 0.0f, i, f2, paint);
        canvas.rotate(180.0f, f / 2.0f, f2 / 2.0f);
        canvas.drawRect(0.0f, 0.0f, i, f2, paint);
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }
}
