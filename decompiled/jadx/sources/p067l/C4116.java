package p067l;

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
public final class C4116 extends ReplacementSpan {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayList f9063;

    /* JADX INFO: renamed from: ۙ */
    public InterfaceC9207 f9064;

    /* JADX INFO: renamed from: ۨ */
    public final C8810 f9067;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f9069;

    /* JADX INFO: renamed from: ᩶ */
    public int f9070;

    /* JADX INFO: renamed from: ᩸ */
    public final List f9071;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f9072;

    /* JADX INFO: renamed from: ᩺ */
    public int f9073;

    /* JADX INFO: renamed from: ۤ */
    public final Rect f9066 = new Rect();

    /* JADX INFO: renamed from: ۫ */
    public final Paint f9068 = new Paint(1);

    /* JADX INFO: renamed from: ۛ */
    public final TextPaint f9065 = new TextPaint();

    public C4116(C8810 c8810, ArrayList arrayList, boolean z, boolean z2) {
        this.f9067 = c8810;
        this.f9071 = arrayList;
        this.f9063 = new ArrayList(arrayList.size());
        this.f9072 = z;
        this.f9069 = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        ArrayList arrayList = this.f9063;
        if (arrayList.size() > 0 && fontMetricsInt != null) {
            Iterator it = arrayList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = ((Layout) it.next()).getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.f9070 = i3;
            int i4 = -((this.f9067.f23922 * 2) + i3);
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.f9073;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        InterfaceC9207 interfaceC9207;
        float f2 = f;
        int iM28422 = AbstractC12342.m28422(canvas, charSequence);
        int i6 = this.f9073;
        boolean z2 = this.f9072;
        ArrayList arrayList = this.f9063;
        C8810 c8810 = this.f9067;
        if (i6 != iM28422) {
            this.f9073 = iM28422;
            boolean z3 = paint instanceof TextPaint;
            TextPaint textPaint = this.f9065;
            if (z3) {
                textPaint.set((TextPaint) paint);
            } else {
                textPaint.set(paint);
            }
            textPaint.setFakeBoldText(z2);
            List list = this.f9071;
            int iM8314 = m8314(list.size()) - (c8810.f23922 * 2);
            arrayList.clear();
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                m8310(i7, iM8314, (C15241) list.get(i7));
            }
        }
        int i8 = c8810.f23922;
        int size2 = arrayList.size();
        int iM8315 = m8314(size2);
        int i9 = iM8315 - (this.f9073 / size2);
        Paint paint2 = this.f9068;
        if (z2) {
            paint2.setColor(c8810.f23923);
            paint2.setStyle(Paint.Style.FILL);
            i8 = i8;
        } else if (this.f9069) {
            int iM21029 = c8810.f23921;
            if (iM21029 == 0) {
                iM21029 = AbstractC9088.m21029(paint2.getColor(), 22);
            }
            paint2.setColor(iM21029);
            paint2.setStyle(Paint.Style.FILL);
        } else {
            i8 = i8;
            paint2.setColor(c8810.f23924);
            paint2.setStyle(Paint.Style.FILL);
        }
        int color = paint2.getColor();
        Rect rect = this.f9066;
        if (color != 0) {
            int iSave = canvas.save();
            try {
                rect.set(0, 0, this.f9073, i5 - i3);
                canvas.translate(f2, i3);
                canvas.drawRect(rect, paint2);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        paint2.set(paint);
        int iM210210 = c8810.f23919;
        if (iM210210 == 0) {
            iM210210 = AbstractC9088.m21029(paint2.getColor(), 75);
        }
        paint2.setColor(iM210210);
        paint2.setStyle(Paint.Style.FILL);
        int strokeWidth = c8810.f23920;
        if (strokeWidth == -1) {
            strokeWidth = (int) (paint2.getStrokeWidth() + 0.5f);
        }
        boolean z4 = strokeWidth > 0;
        int i10 = i5 - i3;
        int i11 = (i10 - this.f9070) / 4;
        if (z4) {
            C16185[] c16185Arr = (C16185[]) ((Spanned) charSequence).getSpans(i, i2, C16185.class);
            if (c16185Arr == null || c16185Arr.length <= 0) {
                z = false;
            } else {
                C16185 c16185 = c16185Arr[0];
                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(c16185) == i) {
                    rect.set((int) f2, i3, this.f9073, i3 + strokeWidth);
                    canvas.drawRect(rect, paint2);
                    z = true;
                } else {
                    z = false;
                }
            }
            rect.set((int) f2, i5 - strokeWidth, this.f9073, i5);
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
                canvas.translate((i14 * iM8315) + f2, i3);
                if (z4) {
                    rect.set(0, i12, strokeWidth, i13);
                    canvas.drawRect(rect, paint2);
                    if (i14 == size2 - 1) {
                        rect.set((iM8315 - strokeWidth) - i9, i12, iM8315 - i9, i13);
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
        if (this.f9070 == height || (interfaceC9207 = this.f9064) == null) {
            return;
        }
        C19539 c19539 = (C19539) interfaceC9207;
        TextView textView = c19539.f59489;
        Runnable runnable = c19539.f59488;
        textView.removeCallbacks(runnable);
        textView.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m8310(int i, int i2, C15241 c15241) {
        Layout.Alignment alignment;
        RunnableC7866 runnableC7866 = new RunnableC7866(this, i, i2, c15241);
        Spannable spannable = (Spannable) c15241.f43501;
        int i3 = c15241.f43500;
        if (i3 == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i3 == 2) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        }
        StaticLayout staticLayout = new StaticLayout(spannable, this.f9065, i2, alignment, 1.0f, 0.0f, false);
        C19936.m45250(spannable, staticLayout);
        C2736[] c2736Arr = (C2736[]) spannable.getSpans(0, spannable.length(), C2736.class);
        if (c2736Arr != null && c2736Arr.length > 0) {
            for (C2736 c2736 : c2736Arr) {
                C18830 c18830M4273 = c2736.m4273();
                if (c18830M4273.getCallback() == null) {
                    c18830M4273.m42892(new C13231(runnableC7866));
                }
            }
        }
        this.f9063.add(i, staticLayout);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Layout m8316(int i) {
        ArrayList arrayList = this.f9063;
        int size = arrayList.size();
        int iM8314 = i / m8314(size);
        if (iM8314 >= size) {
            return null;
        }
        return (Layout) arrayList.get(iM8314);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8313() {
        return m8314(this.f9063.size());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m8314(int i) {
        return (int) (((this.f9073 * 1.0f) / i) + 0.5f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8315(InterfaceC9207 interfaceC9207) {
        this.f9064 = interfaceC9207;
    }
}
