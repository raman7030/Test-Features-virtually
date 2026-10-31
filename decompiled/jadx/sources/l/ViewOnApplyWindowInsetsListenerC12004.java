package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۨ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnApplyWindowInsetsListenerC12004 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13414 f35947;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21610 f35948;

    public ViewOnApplyWindowInsetsListenerC12004(View view, AbstractC13414 abstractC13414) {
        this.f35947 = abstractC13414;
        C21610 c21610M41340 = C17648.m41340(view);
        this.f35948 = c21610M41340 != null ? new C23726(c21610M41340).m52373() : null;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f35948 = C21610.m48814(view, windowInsets);
            return C23292.m51608(view, windowInsets);
        }
        C21610 c21610M48814 = C21610.m48814(view, windowInsets);
        if (this.f35948 == null) {
            this.f35948 = C17648.m41340(view);
        }
        if (this.f35948 == null) {
            this.f35948 = c21610M48814;
            return C23292.m51608(view, windowInsets);
        }
        AbstractC13414 abstractC13414M51610 = C23292.m51610(view);
        if (abstractC13414M51610 != null && C11003.equals(abstractC13414M51610.mDispachedInsets, windowInsets)) {
            return C23292.m51608(view, windowInsets);
        }
        C21610 c21610 = this.f35948;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!c21610M48814.m48815(i2).equals(c21610.m48815(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return C23292.m51608(view, windowInsets);
        }
        C21610 c21611 = this.f35948;
        C17376 c17376 = new C17376(i, C23292.m51609(i, c21610M48814, c21611), 160L);
        c17376.m40723(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c17376.m40722());
        C11007 c11007M48815 = c21610M48814.m48815(i);
        C11007 c11007M48816 = c21611.m48815(i);
        int iMin = Math.min(c11007M48815.f33109, c11007M48816.f33109);
        int i3 = c11007M48815.f33111;
        int i4 = c11007M48816.f33111;
        int iMin2 = Math.min(i3, i4);
        int i5 = c11007M48815.f33110;
        int i6 = c11007M48816.f33110;
        int iMin3 = Math.min(i5, i6);
        int i7 = c11007M48815.f33108;
        int i8 = i;
        int i9 = c11007M48816.f33108;
        C3537 c3537 = new C3537(C11007.m27341(iMin, iMin2, iMin3, Math.min(i7, i9)), C11007.m27341(Math.max(c11007M48815.f33109, c11007M48816.f33109), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
        C23292.m51612(view, c17376, windowInsets, false);
        duration.addUpdateListener(new C12709(c17376, c21610M48814, c21611, i8, view));
        duration.addListener(new C10593(view, c17376));
        ViewTreeObserverOnPreDrawListenerC14493.m34591(view, new RunnableC6359(view, c17376, c3537, duration));
        this.f35948 = c21610M48814;
        return C23292.m51608(view, windowInsets);
    }
}
