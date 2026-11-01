package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܰᩳ */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1535 implements InterfaceC1430 {

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence f44766;

    /* JADX INFO: renamed from: ۧ */
    public final Drawable f44767;

    /* JADX INFO: renamed from: ܽ */
    public final C1326 f44768;

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo22332() {
        return true;
    }

    public C1535(C1326 c1326) {
        this.f44768 = c1326;
        this.f44767 = c1326.getNavigationIcon();
        this.f44766 = c1326.getNavigationContentDescription();
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final void mo22331(Drawable drawable, int i) {
        this.f44768.setNavigationIcon(drawable);
        mo22330(i);
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final void mo22330(int i) {
        C1326 c1326 = this.f44768;
        if (i == 0) {
            c1326.setNavigationContentDescription(this.f44766);
        } else {
            c1326.setNavigationContentDescription(i);
        }
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ܽ */
    public final Drawable mo22333() {
        return this.f44767;
    }

    @Override // p067l.InterfaceC1430
    /* JADX INFO: renamed from: ֫ */
    public final Context mo22329() {
        return this.f44768.getContext();
    }
}
