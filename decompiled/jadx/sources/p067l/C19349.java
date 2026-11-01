package p067l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A65W */
/* JADX INFO: loaded from: classes5.dex */
public final class C19349 extends AnimatorListenerAdapter implements InterfaceC7949 {

    /* JADX INFO: renamed from: ֫ */
    public final int f57746;

    /* JADX INFO: renamed from: ۖ */
    public final int f57747;

    /* JADX INFO: renamed from: ۘ */
    public final View f57748;

    /* JADX INFO: renamed from: ۜ */
    public final int f57749;

    /* JADX INFO: renamed from: ۡ */
    public final int f57750;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f57751;

    /* JADX INFO: renamed from: ۧ */
    public final Rect f57752;

    /* JADX INFO: renamed from: ܳ */
    public final int f57753;

    /* JADX INFO: renamed from: ܺ */
    public final int f57754;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f57755;

    /* JADX INFO: renamed from: ܿ */
    public final int f57756;

    /* JADX INFO: renamed from: ᩳ */
    public final int f57757;

    /* JADX INFO: renamed from: ᩷ */
    public final Rect f57758;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f57759;

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionEnd(AbstractC18164 abstractC18164, boolean z) {
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164) {
        throw null;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionStart(AbstractC18164 abstractC18164, boolean z) {
    }

    public C19349(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f57748 = view;
        this.f57758 = rect;
        this.f57751 = z;
        this.f57752 = rect2;
        this.f57755 = z2;
        this.f57750 = i;
        this.f57747 = i2;
        this.f57754 = i3;
        this.f57749 = i4;
        this.f57757 = i5;
        this.f57753 = i6;
        this.f57756 = i7;
        this.f57746 = i8;
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
        int i = this.f57754;
        int i2 = this.f57750;
        int i3 = this.f57756;
        int i4 = this.f57757;
        int iMax = Math.max(i - i2, i3 - i4);
        int i5 = this.f57749;
        int i6 = this.f57747;
        int i7 = this.f57746;
        int i8 = this.f57753;
        int iMax2 = Math.max(i5 - i6, i7 - i8);
        if (z) {
            i2 = i4;
        }
        if (z) {
            i6 = i8;
        }
        View view = this.f57748;
        C22859.m51062(view, i2, i6, iMax + i2, iMax2 + i6);
        view.setClipBounds(z ? this.f57752 : this.f57758);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.f57759) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.f57751) {
                rect = this.f57758;
            }
        } else if (!this.f57755) {
            rect = this.f57752;
        }
        View view = this.f57748;
        view.setClipBounds(rect);
        if (z) {
            C22859.m51062(view, this.f57750, this.f57747, this.f57754, this.f57749);
        } else {
            C22859.m51062(view, this.f57757, this.f57753, this.f57756, this.f57746);
        }
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
        this.f57759 = true;
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionPause(AbstractC18164 abstractC18164) {
        View view = this.f57748;
        view.setTag(R.id.MT_Protector, view.getClipBounds());
        view.setClipBounds(this.f57755 ? null : this.f57752);
    }

    @Override // p067l.InterfaceC7949
    public final void onTransitionResume(AbstractC18164 abstractC18164) {
        View view = this.f57748;
        Rect rect = (Rect) view.getTag(R.id.MT_Protector);
        view.setTag(R.id.MT_Protector, null);
        view.setClipBounds(rect);
    }
}
