package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: J4LB */
/* JADX INFO: loaded from: classes2.dex */
public final class C2149 extends AbstractC15553 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ComponentCallbacksC9205 f7115;

    public C2149(ComponentCallbacksC9205 componentCallbacksC9205) {
        this.f7115 = componentCallbacksC9205;
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo7106(int i) {
        ComponentCallbacksC9205 componentCallbacksC9205 = this.f7115;
        View view = componentCallbacksC9205.mView;
        if (view == null) {
            throw new IllegalStateException("Fragment " + componentCallbacksC9205 + " does not have a view");
        }
        return view.findViewById(i);
    }

    @Override // l.AbstractC15553
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo7107() {
        return this.f7115.mView != null;
    }
}
