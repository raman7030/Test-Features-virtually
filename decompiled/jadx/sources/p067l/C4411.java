package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4411 extends AbstractC17150 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ComponentCallbacksC11117 f9901;

    public C4411(ComponentCallbacksC11117 componentCallbacksC11117) {
        this.f9901 = componentCallbacksC11117;
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ֫ */
    public final View mo9201(int i) {
        ComponentCallbacksC11117 componentCallbacksC11117 = this.f9901;
        View view = componentCallbacksC11117.mView;
        if (view == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC11117 + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // p067l.AbstractC17150
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo9202() {
        return this.f9901.mView != null;
    }
}
