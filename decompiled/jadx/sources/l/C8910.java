package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C8910 extends C2560 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final WindowInsets.Builder f27089;

    public C8910() {
        this.f27089 = C20905.m47742();
    }

    public C8910(C21610 c21610) {
        WindowInsets.Builder builderM47742;
        super(c21610);
        WindowInsets windowInsetsM48823 = c21610.m48823();
        if (windowInsetsM48823 != null) {
            builderM47742 = C9616.m24547(windowInsetsM48823);
        } else {
            builderM47742 = C20905.m47742();
        }
        this.f27089 = builderM47742;
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ᩳ */
    public void mo8106(C11007 c11007) {
        this.f27089.setSystemWindowInsets(c11007.m27344());
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ܽ */
    public void mo8104(C11007 c11007) {
        this.f27089.setSystemGestureInsets(c11007.m27344());
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ֫ */
    public void mo8101(C11007 c11007) {
        this.f27089.setMandatorySystemGestureInsets(c11007.m27344());
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ܿ */
    public void mo8105(C11007 c11007) {
        this.f27089.setTappableElementInsets(c11007.m27344());
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ۧ */
    public void mo8103(C11007 c11007) {
        this.f27089.setStableInsets(c11007.m27344());
    }

    @Override // l.C2560
    /* JADX INFO: renamed from: ۧ */
    public C21610 mo8102() {
        m8099();
        C21610 c21610M48814 = C21610.m48814(null, this.f27089.build());
        c21610M48814.m48821(this.f8102);
        return c21610M48814;
    }
}
