package p067l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩻ */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes3.dex */
public class C1263 extends C1823 {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f28892;

    /* JADX INFO: renamed from: ۧ֫ */
    public C0913 f28893;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // p067l.C1823, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f28892) {
            super.mutate();
            this.f28893.mo7192();
            this.f28892 = true;
        }
        return this;
    }

    @Override // p067l.C1823, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p067l.C1823
    /* JADX INFO: renamed from: ֫ */
    public void mo24159(AbstractC1788 abstractC1788) {
        super.mo24159(abstractC1788);
        if (abstractC1788 instanceof C0913) {
            this.f28893 = (C0913) abstractC1788;
        }
    }
}
