package l;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58GU */
/* JADX INFO: loaded from: classes3.dex */
public final class C11497 extends View {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f34349;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22785 f34350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f34351;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f34352;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f34353;

    public C11497(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34351 = new ArrayList();
        this.f34353 = Collections.EMPTY_LIST;
        this.f34349 = 0.0533f;
        this.f34350 = C22785.f73570;
        this.f34352 = 0.08f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28325(List list, C22785 c22785, float f, float f2) {
        this.f34353 = list;
        this.f34350 = c22785;
        this.f34349 = f;
        this.f34352 = f2;
        while (true) {
            ArrayList arrayList = this.f34351;
            if (arrayList.size() < list.size()) {
                arrayList.add(new C19341(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b3  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        List list = this.f34353;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i2 = paddingBottom - paddingTop;
        float f4 = this.f34349;
        float f5 = -3.4028235E38f;
        float f6 = f4 == -3.4028235E38f ? -3.4028235E38f : f4 * i2;
        if (f6 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C19811 c19811M49383 = (C19811) list.get(i3);
            if (c19811M49383.f64000 != Integer.MIN_VALUE) {
                C21927 c21927M45556 = c19811M49383.m45556();
                float f7 = c19811M49383.f63997;
                c21927M45556.m49391(f5);
                c21927M45556.m49393(Integer.MIN_VALUE);
                c21927M45556.m49394((Layout.Alignment) null);
                if (c19811M49383.f63998 == 0) {
                    i = 0;
                    c21927M45556.m49385(1.0f - f7, 0);
                } else {
                    i = 0;
                    c21927M45556.m49385((-f7) - 1.0f, 1);
                }
                f = -3.4028235E38f;
                int i4 = c19811M49383.f63999;
                if (i4 == 0) {
                    c21927M45556.m49386(2);
                } else if (i4 == 2) {
                    c21927M45556.m49386(i);
                }
                c19811M49383 = c21927M45556.m49383();
            } else {
                f = -3.4028235E38f;
            }
            C19811 c19811 = c19811M49383;
            int i5 = c19811.f63989;
            float f8 = c19811.f63988;
            if (f8 != f) {
                if (i5 != 0) {
                    if (i5 == 1) {
                        f3 = height;
                    } else if (i5 != 2) {
                        f2 = -3.4028235E38f;
                    }
                    f2 = f8;
                } else {
                    f3 = i2;
                }
                f8 *= f3;
                f2 = f8;
            } else {
                f2 = -3.4028235E38f;
            }
            int i6 = paddingBottom;
            ((C19341) this.f34351.get(i3)).m44565(c19811, this.f34350, f6, f2, this.f34352, canvas, paddingLeft, paddingTop, width, i6);
            i3++;
            f5 = -3.4028235E38f;
            size = size;
            i2 = i2;
            paddingBottom = i6;
            width = width;
        }
    }
}
