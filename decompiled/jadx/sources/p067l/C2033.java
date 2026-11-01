package p067l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩻᩻ */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes.dex */
public final class C2033 extends C0913 {

    /* JADX INFO: renamed from: ֫֫ */
    public C1502 f80590;

    /* JADX INFO: renamed from: ۧ֫ */
    public C1117 f80591;

    public C2033(C2033 c2033, C1648 c1648, Resources resources) {
        super(c2033, c1648, resources);
        if (c2033 != null) {
            this.f7918 = c2033.f7918;
        } else {
            this.f7918 = new int[this.f63332.length][];
        }
        if (c2033 != null) {
            this.f80591 = c2033.f80591;
            this.f80590 = c2033.f80590;
        } else {
            this.f80591 = new C1117();
            this.f80590 = new C1502();
        }
    }

    @Override // p067l.C0913, p067l.AbstractC1788
    /* JADX INFO: renamed from: ܿ */
    public final void mo7192() {
        this.f80591 = this.f80591.clone();
        this.f80590 = this.f80590.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1648(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1648(this, resources);
    }
}
