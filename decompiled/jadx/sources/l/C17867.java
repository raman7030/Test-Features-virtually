package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes5.dex */
public final class C17867 extends AnimatorListenerAdapter implements InterfaceC5872 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f54548;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54549;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f54550;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f54551;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f54552;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f54553;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Rect f54554;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f54555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f54556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f54558;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f54559;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Rect f54560;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f54561;

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionEnd(AbstractC16620 abstractC16620, boolean z) {
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620) {
        throw null;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionStart(AbstractC16620 abstractC16620, boolean z) {
    }

    public C17867(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f54550 = view;
        this.f54560 = rect;
        this.f54553 = z;
        this.f54554 = rect2;
        this.f54557 = z2;
        this.f54552 = i;
        this.f54549 = i2;
        this.f54556 = i3;
        this.f54551 = i4;
        this.f54559 = i5;
        this.f54555 = i6;
        this.f54558 = i7;
        this.f54548 = i8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        int i = this.f54556;
        int i2 = this.f54552;
        int i3 = this.f54558;
        int i4 = this.f54559;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.f54551;
        int i6 = this.f54549;
        int i7 = this.f54548;
        int i8 = this.f54555;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        View view = this.f54550;
        C21560.m48717(view, i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.f54554 : this.f54560);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f54561) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.f54553) {
                rect = this.f54560;
            }
        } else if (!this.f54557) {
            rect = this.f54554;
        }
        View view = this.f54550;
        view.setClipBounds(rect);
        if (z) {
            C21560.m48717(view, this.f54552, this.f54549, this.f54556, this.f54551);
        } else {
            C21560.m48717(view, this.f54559, this.f54555, this.f54558, this.f54548);
        }
    }

    @Override // l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
        this.f54561 = true;
    }

    @Override // l.InterfaceC5872
    public final void onTransitionPause(AbstractC16620 abstractC16620) {
        View view = this.f54550;
        view.setTag(R.id.MT_Protector, view.getClipBounds());
        view.setClipBounds(this.f54557 ? null : this.f54554);
    }

    @Override // l.InterfaceC5872
    public final void onTransitionResume(AbstractC16620 abstractC16620) {
        View view = this.f54550;
        Rect rect = (Rect) view.getTag(R.id.MT_Protector);
        view.setTag(R.id.MT_Protector, null);
        view.setClipBounds(rect);
    }
}
