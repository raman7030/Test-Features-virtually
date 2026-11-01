package p067l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۨ᩺ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC1437 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC1507 f38957;

    /* JADX INFO: renamed from: ۧ */
    public C1914 f38958;

    public ViewOnApplyWindowInsetsListenerC1437(View view, AbstractC1507 abstractC1507) {
        this.f38957 = abstractC1507;
        C1914 c1914M43586 = C1717.m43586(view);
        this.f38958 = c1914M43586 != null ? new C2019(c1914M43586).m54780() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f38958 = C1914.m51162(view, windowInsets);
            return C1997.m54004(view, windowInsets);
        }
        C1914 c1914M51162 = C1914.m51162(view, windowInsets);
        if (this.f38958 == null) {
            this.f38958 = C1717.m43586(view);
        }
        if (this.f38958 == null) {
            this.f38958 = c1914M51162;
            return C1997.m54004(view, windowInsets);
        }
        AbstractC1507 abstractC1507M54006 = C1997.m54006(view);
        if (abstractC1507M54006 != null && C12826.equals(abstractC1507M54006.mDispachedInsets, windowInsets)) {
            return C1997.m54004(view, windowInsets);
        }
        C1914 c1914 = this.f38958;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!c1914M51162.m51163(i2).equals(c1914.m51163(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return C1997.m54004(view, windowInsets);
        }
        C1914 c1915 = this.f38958;
        C1704 c1704 = new C1704(i, C1997.m54005(i, c1914M51162, c1915), 160L);
        c1704.m42975(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1704.m42974());
        C1388 c1388M51163 = c1914M51162.m51163(i);
        C1388 c1388M51164 = c1915.m51163(i);
        int iMin = Math.min(c1388M51163.f36103, c1388M51164.f36103);
        int i3 = c1388M51163.f36105;
        int i4 = c1388M51164.f36105;
        int iMin2 = Math.min(i3, i4);
        int i5 = c1388M51163.f36104;
        int i6 = c1388M51164.f36104;
        int iMin3 = Math.min(i5, i6);
        int i7 = c1388M51163.f36102;
        int i8 = i;
        int i9 = c1388M51164.f36102;
        C1017 c1017 = new C1017(C1388.m29403(iMin, iMin2, iMin3, Math.min(i7, i9)), C1388.m29403(Math.max(c1388M51163.f36103, c1388M51164.f36103), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C1997.m54008(view, c1704, windowInsets, false);
        duration.addUpdateListener(new C1472(c1704, c1914M51162, c1915, i8, view));
        duration.addListener(new C1367(view, c1704));
        ViewTreeObserverOnPreDrawListenerC1561.m36732(view, new RunnableC1157(view, c1704, c1017, duration));
        this.f38958 = c1914M51162;
        return C1997.m54004(view, windowInsets);
    }
}
