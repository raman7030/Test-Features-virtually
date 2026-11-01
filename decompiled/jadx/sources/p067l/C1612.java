package p067l;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܶ᩺ */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes4.dex */
public final class C1612 {

    /* JADX INFO: renamed from: ֫ */
    public final WeakReference f50594;

    public C1612(View view) {
        this.f50594 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38760(long j) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38759(float f) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38765(float f) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m38764() {
        View view = (View) this.f50594.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38761(Interpolator interpolator) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38766(long j) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38758() {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38767() {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38762(InterfaceC1927 interfaceC1927) {
        View view = (View) this.f50594.get();
        if (view != null) {
            if (interfaceC1927 != null) {
                view.animate().setListener(new C1262(interfaceC1927, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38763(InterfaceC1962 interfaceC1962) {
        View view = (View) this.f50594.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC1962 != null ? new C0912(interfaceC1962, view) : null);
        }
    }
}
