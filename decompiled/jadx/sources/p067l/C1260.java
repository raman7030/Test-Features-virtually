package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.۠᩸ */
/* JADX INFO: compiled from: 31IJ */
/* JADX INFO: loaded from: classes3.dex */
public class C1260 extends View {

    /* JADX INFO: renamed from: ᩶ */
    public int f28744;

    /* JADX INFO: renamed from: ᩸ */
    public View f28745;

    /* JADX INFO: renamed from: ᩹ */
    public int f28746;

    public C1260(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28746 = -1;
        this.f28745 = null;
        this.f28744 = 4;
        m24083(attributeSet);
    }

    public C1260(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28746 = -1;
        this.f28745 = null;
        this.f28744 = 4;
        m24083(attributeSet);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24083(AttributeSet attributeSet) {
        super.setVisibility(this.f28744);
        this.f28746 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72693);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f28746 = typedArrayObtainStyledAttributes.getResourceId(index, this.f28746);
                } else if (index == 1) {
                    this.f28744 = typedArrayObtainStyledAttributes.getInt(index, this.f28744);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final View m24084() {
        return this.f28745;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24085(C1715 c1715) {
        if (this.f28746 == -1 && !isInEditMode()) {
            setVisibility(this.f28744);
        }
        View viewFindViewById = c1715.findViewById(this.f28746);
        this.f28745 = viewFindViewById;
        if (viewFindViewById != null) {
            ((C1680) viewFindViewById.getLayoutParams()).f55096 = true;
            this.f28745.setVisibility(0);
            setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24086() {
        if (this.f28745 == null) {
            return;
        }
        C1680 c1680 = (C1680) getLayoutParams();
        C1680 c1681 = (C1680) this.f28745.getLayoutParams();
        c1681.f55082.m37926(0);
        C1591 c1591 = c1680.f55082;
        EnumC1241 enumC1241 = c1591.f49244[0];
        EnumC1241 enumC1242 = EnumC1241.FIXED;
        if (enumC1241 != enumC1242) {
            c1591.m37928(c1681.f55082.m37911());
        }
        C1591 c1592 = c1680.f55082;
        if (c1592.f49244[1] != enumC1242) {
            c1592.m37891(c1681.f55082.m37890());
        }
        c1681.f55082.m37926(8);
    }
}
