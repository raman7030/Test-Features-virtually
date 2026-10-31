package l;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7LE */
/* JADX INFO: loaded from: classes4.dex */
public final class C13482 extends AbstractC11367 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7133 f40264;

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final void mo27170(int i) {
    }

    public C13482(C7133 c7133) {
        this.f40264 = c7133;
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final int mo27169() {
        return this.f40264.f13900.size();
    }

    @Override // l.AbstractC11367
    /* JADX INFO: renamed from: ֫ */
    public final void mo27171(int i, float f, int i2) {
        C7133 c7133 = this.f40264;
        float fM12964 = (c7133.m12964() * 2) + c7133.m12966();
        ViewParent parent = ((ImageView) c7133.f13900.get(i)).getParent();
        C11233.m27800((Object) parent, "null cannot be cast to non-null type android.view.ViewGroup");
        float left = (fM12964 * f) + ((ViewGroup) parent).getLeft();
        C21696 c21696 = c7133.f21914;
        if (c21696 != null) {
            c21696.m48970(left);
        }
    }
}
