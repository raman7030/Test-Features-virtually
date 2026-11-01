package p067l;

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
public final class C13295 extends View {

    /* JADX INFO: renamed from: ۗ */
    public float f37346;

    /* JADX INFO: renamed from: ۙ */
    public C24023 f37347;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f37348;

    /* JADX INFO: renamed from: ᩸ */
    public float f37349;

    /* JADX INFO: renamed from: ᩹ */
    public List f37350;

    public C13295(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37348 = new ArrayList();
        this.f37350 = Collections.EMPTY_LIST;
        this.f37346 = 0.0533f;
        this.f37347 = C24023.f76300;
        this.f37349 = 0.08f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30369(List list, C24023 c24023, float f, float f2) {
        this.f37350 = list;
        this.f37347 = c24023;
        this.f37346 = f;
        this.f37349 = f2;
        while (true) {
            ArrayList arrayList = this.f37348;
            if (arrayList.size() < list.size()) {
                arrayList.add(new C20750(getContext()));
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
        List list = this.f37350;
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
        float f4 = this.f37346;
        float f5 = -3.4028235E38f;
        float f6 = f4 == -3.4028235E38f ? -3.4028235E38f : f4 * i2;
        if (f6 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            C21196 c21196M51720 = (C21196) list.get(i3);
            if (c21196M51720.f66637 != Integer.MIN_VALUE) {
                C23207 c23207M47867 = c21196M51720.m47867();
                float f7 = c21196M51720.f66634;
                c23207M47867.m51728(f5);
                c23207M47867.m51730(Integer.MIN_VALUE);
                c23207M47867.m51731((Layout.Alignment) null);
                if (c21196M51720.f66635 == 0) {
                    i = 0;
                    c23207M47867.m51722(1.0f - f7, 0);
                } else {
                    i = 0;
                    c23207M47867.m51722((-f7) - 1.0f, 1);
                }
                f = -3.4028235E38f;
                int i4 = c21196M51720.f66636;
                if (i4 == 0) {
                    c23207M47867.m51723(2);
                } else if (i4 == 2) {
                    c23207M47867.m51723(i);
                }
                c21196M51720 = c23207M47867.m51720();
            } else {
                f = -3.4028235E38f;
            }
            C21196 c21196 = c21196M51720;
            int i5 = c21196.f66626;
            float f8 = c21196.f66625;
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
            ((C20750) this.f37348.get(i3)).m46859(c21196, this.f37347, f6, f2, this.f37349, canvas, paddingLeft, paddingTop, width, i6);
            i3++;
            f5 = -3.4028235E38f;
            size = size;
            i2 = i2;
            paddingBottom = i6;
            width = width;
        }
    }
}
