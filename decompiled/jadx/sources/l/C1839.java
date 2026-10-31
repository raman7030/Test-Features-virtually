package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G90S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1839 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6284;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7196 f6285;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6778 f6288;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f6290;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6291;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f6292;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f6293;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f6294;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Rect f6287 = new Rect();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Paint f6289 = new Paint(1);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final TextPaint f6286 = new TextPaint();

    public C1839(C6778 c6778, ArrayList arrayList, boolean z, boolean z2) {
        this.f6288 = c6778;
        this.f6292 = arrayList;
        this.f6284 = new ArrayList(arrayList.size());
        this.f6293 = z;
        this.f6290 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f6284;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f6291 = i3;
            int i4 = -((this.f6288.f21048 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f6294;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        InterfaceC7196 interfaceC7196;
        float f2 = f;
        int iM26389 = AbstractC10494.m26389(canvas, charSequence);
        int i6 = this.f6294;
        boolean z2 = this.f6293;
        ArrayList arrayList = this.f6284;
        C6778 c6778 = this.f6288;
        if (i6 != iM26389) {
            this.f6294 = iM26389;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f6286;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f6292;
            int iM6116 = m6116(list.size()) - (c6778.f21048 * 2);
            arrayList.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                m6112(i7, iM6116, (C13545) list.get(i7));
            }
        }
        int i8 = c6778.f21048;
        int size2 = arrayList.size();
        int iM6117 = m6116(size2);
        int i9 = iM6117 - (this.f6294 / size2);
        Paint paint2 = this.f6289;
        if (z2) {
            paint2.setColor(c6778.f21049);
            paint2.setStyle(Paint.Style.FILL);
            i8 = i8;
        } else if (this.f6290) {
            int iM19071 = c6778.f21047;
            if (iM19071 == 0) {
                iM19071 = AbstractC7070.m19071(paint2.getColor(), 22);
            }
            paint2.setColor(iM19071);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i8 = i8;
            paint2.setColor(c6778.f21050);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f6287;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f6294, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        int iM19072 = c6778.f21045;
        if (iM19072 == 0) {
            iM19072 = AbstractC7070.m19071(paint2.getColor(), 75);
        }
        paint2.setColor(iM19072);
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = c6778.f21046;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z4 = strokeWidth > 0;
        int i10 = i5 - i3;
        int i11 = (i10 - this.f6291) / 4;
        if (z4) {
            C14538[] c14538Arr = (C14538[]) ((Spanned) charSequence).getSpans(i, i2, C14538.class);
            if (c14538Arr == null || c14538Arr.length <= 0) {
                z = false;
            } else {
                C14538 c14538 = c14538Arr[0];
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(c14538) == i) {
                    rect.set((int) f2, i3, this.f6294, i3 + strokeWidth);
                    canvas.drawRect(rect, paint2);
                    z = true;
                } else {
                    z = false;
                }
            }
            rect.set((int) f2, i5 - strokeWidth, this.f6294, i5);
            canvas.drawRect(rect, paint2);
        } else {
            z = false;
        }
        int i12 = z ? strokeWidth : 0;
        int i13 = i10 - strokeWidth;
        int i14 = 0;
        int height = 0;
        while (i14 < size2) {
            Layout layout = (Layout) arrayList.get(i14);
            int iSave2 = canvas.save();
            try {
                canvas.translate((i14 * iM6117) + f2, i3);
                if (z4) {
                    rect.set(0, i12, strokeWidth, i13);
                    canvas.drawRect(rect, paint2);
                    if (i14 == size2 - 1) {
                        rect.set((iM6117 - strokeWidth) - i9, i12, iM6117 - i9, i13);
                        canvas.drawRect(rect, paint2);
                    }
                }
                int i15 = i8;
                int i16 = i12;
                canvas.translate(i15, i15 + i11);
                layout.draw(canvas);
                if (layout.getHeight() > height) {
                    height = layout.getHeight();
                }
                canvas.restoreToCount(iSave2);
                i14++;
                i12 = i16;
                i8 = i15;
                f2 = f;
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave2);
                throw th2;
            }
        }
        if (this.f6291 == height || (interfaceC7196 = this.f6285) == null) {
            return;
        }
        C18067 c18067 = (C18067) interfaceC7196;
        TextView textView = c18067.f56284;
        Runnable runnable = c18067.f56283;
        textView.removeCallbacks(runnable);
        textView.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m6112(int i, int i2, C13545 c13545) {
        Layout.Alignment alignment;
        RunnableC5785 runnableC5785 = new RunnableC5785(this, i, i2, c13545);
        Spannable spannable = (Spannable) c13545.f40431;
        int i3 = c13545.f40430;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i3 == 2) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.f6286, i2, alignment, 1.0f, 0.0f, false);
        C18485.m42974(spannable, staticLayout);
        C0387[] c0387Arr = (C0387[]) spannable.getSpans(0, spannable.length(), C0387.class);
        if (c0387Arr != null && c0387Arr.length > 0) {
            for (C0387 c0387 : c0387Arr) {
                C17321 c17321M1882 = c0387.m1882();
                if (c17321M1882.getCallback() == null) {
                    c17321M1882.m40641(new C11430(runnableC5785));
                }
            }
        }
        this.f6284.add(i, staticLayout);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Layout m6118(int i) {
        ArrayList arrayList = this.f6284;
        int size = arrayList.size();
        int iM6116 = i / m6116(size);
        if (iM6116 >= size) {
            return null;
        }
        return (Layout) arrayList.get(iM6116);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6115() {
        return m6116(this.f6284.size());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6116(int i) {
        return (int) (((this.f6294 * 1.0f) / i) + 0.5f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6117(InterfaceC7196 interfaceC7196) {
        this.f6285 = interfaceC7196;
    }
}
