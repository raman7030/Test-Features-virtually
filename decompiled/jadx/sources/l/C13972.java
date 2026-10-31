package l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13972 implements InterfaceC11857 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f41683;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f41684;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9762 f41685;

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo20353() {
        return true;
    }

    public C13972(C9762 c9762) {
        this.f41685 = c9762;
        this.f41684 = c9762.getNavigationIcon();
        this.f41683 = c9762.getNavigationContentDescription();
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫ */
    public final void mo20352(Drawable drawable, int i) {
        this.f41685.setNavigationIcon(drawable);
        mo20351(i);
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫ */
    public final void mo20351(int i) {
        C9762 c9762 = this.f41685;
        if (i == 0) {
            c9762.setNavigationContentDescription(this.f41683);
        } else {
            c9762.setNavigationContentDescription(i);
        }
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ܽ */
    public final Drawable mo20354() {
        return this.f41684;
    }

    @Override // l.InterfaceC11857
    /* JADX INFO: renamed from: ֫ */
    public final Context mo20350() {
        return this.f41685.getContext();
    }
}
