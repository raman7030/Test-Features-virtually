package l;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes4.dex */
public final class C15530 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final WeakReference f47462;

    public C15530(View view) {
        this.f47462 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36600(long j) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36599(float f) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36605(float f) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m36604() {
        View view = (View) this.f47462.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36601(Interpolator interpolator) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36606(long j) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36598() {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36607() {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36602(InterfaceC21882 interfaceC21882) {
        View view = (View) this.f47462.get();
        if (view != null) {
            if (interfaceC21882 != null) {
                view.animate().setListener(new C8476(interfaceC21882, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36603(InterfaceC22587 interfaceC22587) {
        View view = (View) this.f47462.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC22587 != null ? new C1420(interfaceC22587, view) : null);
        }
    }
}
