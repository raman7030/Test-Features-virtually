package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes.dex */
public final class C24018 extends C1440 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C13309 f77838;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C5549 f77839;

    public C24018(C24018 c24018, C16256 c16256, Resources resources) {
        super(c24018, c16256, resources);
        if (c24018 != null) {
            this.f5145 = c24018.f5145;
        } else {
            this.f5145 = new int[this.f60098.length][];
        }
        if (c24018 != null) {
            this.f77839 = c24018.f77839;
            this.f77838 = c24018.f77838;
        } else {
            this.f77839 = new C5549();
            this.f77838 = new C13309();
        }
    }

    @Override // l.C1440, l.AbstractC19080
    /* JADX INFO: renamed from: ܿ */
    public final void mo4949() {
        this.f77839 = this.f77839.clone();
        this.f77838 = this.f77838.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C16256(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C16256(this, resources);
    }
}
