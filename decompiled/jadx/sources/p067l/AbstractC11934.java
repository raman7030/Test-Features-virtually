package p067l;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11934 {

    /* JADX INFO: renamed from: ۧ */
    public static final Interpolator f33204 = new InterpolatorC14615();

    /* JADX INFO: renamed from: ܽ */
    public static final Interpolator f33205 = new InterpolatorC13945();

    /* JADX INFO: renamed from: ֫ */
    public int f33206 = -1;

    /* JADX INFO: renamed from: ֫ */
    public static int m27274(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m27275(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m27276(int i, int i2) {
        int i3 = i2 | i;
        return (i << 16) | (i2 << 8) | i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public float mo27277() {
        return 0.5f;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo24771(AbstractC5462 abstractC5462) {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo5538(AbstractC5462 abstractC5462);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo5539() {
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract void mo5540(AbstractC5462 abstractC5462);

    /* JADX INFO: renamed from: ܽ */
    public boolean mo5541() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27278(C14849 c14849, int i, int i2, long j) {
        if (this.f33206 == -1) {
            this.f33206 = c14849.getResources().getDimensionPixelSize(R.dimen.MT_Protector);
        }
        int iSignum = (int) (((int) (((int) Math.signum(i2)) * this.f33206 * ((InterpolatorC13945) f33205).getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * ((InterpolatorC14615) f33204).getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
        if (iSignum == 0) {
            return i2 > 0 ? 1 : -1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public void mo27281(C14849 c14849, AbstractC5462 abstractC5462, int i, AbstractC5462 abstractC5463, int i2, int i3, int i4) {
        AbstractC18873 layoutManager = c14849.getLayoutManager();
        if (layoutManager instanceof InterfaceC9251) {
            ((InterfaceC9251) layoutManager).prepareForDrop(abstractC5462.itemView, abstractC5463.itemView, i3, i4);
            return;
        }
        if (layoutManager.canScrollHorizontally()) {
            if (layoutManager.getDecoratedLeft(abstractC5463.itemView) <= c14849.getPaddingLeft()) {
                c14849.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedRight(abstractC5463.itemView) >= c14849.getWidth() - c14849.getPaddingRight()) {
                c14849.scrollToPosition(i2);
            }
        }
        if (layoutManager.canScrollVertically()) {
            if (layoutManager.getDecoratedTop(abstractC5463.itemView) <= c14849.getPaddingTop()) {
                c14849.scrollToPosition(i2);
            }
            if (layoutManager.getDecoratedBottom(abstractC5463.itemView) >= c14849.getHeight() - c14849.getPaddingBottom()) {
                c14849.scrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo27280(C14849 c14849, AbstractC5462 abstractC5462) {
        View view = abstractC5462.itemView;
        Object tag = view.getTag(R.id.MT_Protector);
        if (tag instanceof Float) {
            C1717.m43547(view, ((Float) tag).floatValue());
        }
        view.setTag(R.id.MT_Protector, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo27279(Canvas canvas, C14849 c14849, AbstractC5462 abstractC5462, float f, float f2, int i, boolean z) {
        View view = abstractC5462.itemView;
        if (z && view.getTag(R.id.MT_Protector) == null) {
            Float fValueOf = Float.valueOf(C1717.m43566(view));
            int childCount = c14849.getChildCount();
            float f3 = 0.0f;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c14849.getChildAt(i2);
                if (childAt != view) {
                    float fM43566 = C1717.m43566(childAt);
                    if (fM43566 > f3) {
                        f3 = fM43566;
                    }
                }
            }
            C1717.m43547(view, f3 + 1.0f);
            view.setTag(R.id.MT_Protector, fValueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
