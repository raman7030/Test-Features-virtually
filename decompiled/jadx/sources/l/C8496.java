package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes3.dex */
public class C8496 extends C19786 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f25977;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C1440 f25978;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        throw null;
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f25977) {
            super.mutate();
            this.f25978.mo4949();
            this.f25977 = true;
        }
        return this;
    }

    @Override // l.C19786, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // l.C19786
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo22191(AbstractC19080 abstractC19080) {
        super.mo22191(abstractC19080);
        if (abstractC19080 instanceof C1440) {
            this.f25978 = (C1440) abstractC19080;
        }
    }
}
