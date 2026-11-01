package p067l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.ۡܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C1284 extends C0969 {

    /* JADX INFO: renamed from: ܽ */
    public final WindowInsets.Builder f30021;

    public C1284() {
        this.f30021 = C1879.m50072();
    }

    public C1284(C1914 c1914) {
        WindowInsets.Builder builderM50072;
        super(c1914);
        WindowInsets windowInsetsM51171 = c1914.m51171();
        if (windowInsetsM51171 != null) {
            builderM50072 = C1319.m26560(windowInsetsM51171);
        } else {
            builderM50072 = C1879.m50072();
        }
        this.f30021 = builderM50072;
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ᩳ */
    public void mo10138(C1388 c1388) {
        this.f30021.setSystemWindowInsets(c1388.m29406());
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ܽ */
    public void mo10136(C1388 c1388) {
        this.f30021.setSystemGestureInsets(c1388.m29406());
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ֫ */
    public void mo10133(C1388 c1388) {
        this.f30021.setMandatorySystemGestureInsets(c1388.m29406());
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ܿ */
    public void mo10137(C1388 c1388) {
        this.f30021.setTappableElementInsets(c1388.m29406());
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ۧ */
    public void mo10135(C1388 c1388) {
        this.f30021.setStableInsets(c1388.m29406());
    }

    @Override // p067l.C0969
    /* JADX INFO: renamed from: ۧ */
    public C1914 mo10134() {
        m10131();
        C1914 c1914M51162 = C1914.m51162(null, this.f30021.build());
        c1914M51162.m51169(this.f10892);
        return c1914M51162;
    }
}
