package p067l;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.۟ᩳ */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1220 implements InterfaceC10091 {

    /* JADX INFO: renamed from: ۗ */
    public boolean f26479 = false;

    /* JADX INFO: renamed from: ۙ */
    public C1123 f26480;

    /* JADX INFO: renamed from: ᩶ */
    public Drawable f26481;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC1430 f26482;

    /* JADX INFO: renamed from: ᩹ */
    public final C14784 f26483;

    @Override // p067l.InterfaceC10091
    public final void onDrawerStateChanged(int i) {
    }

    public C1220(AbstractActivityC5549 abstractActivityC5549, C14784 c14784, C1326 c1326) {
        if (c1326 != null) {
            this.f26482 = new C1535(c1326);
            c1326.setNavigationOnClickListener(new ViewOnClickListenerC1150(this));
        } else {
            this.f26482 = abstractActivityC5549.mo6358();
        }
        this.f26483 = c14784;
        this.f26480 = new C1123(this.f26482.mo22329());
        this.f26481 = this.f26482.mo22333();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m22393() {
        C14784 c14784 = this.f26483;
        if (c14784.m33753(8388611)) {
            m22391(1.0f);
        } else {
            m22391(0.0f);
        }
        c14784.m33753(8388611);
        boolean z = this.f26479;
        InterfaceC1430 interfaceC1430 = this.f26482;
        if (!z && !interfaceC1430.mo22332()) {
            this.f26479 = true;
        }
        interfaceC1430.mo22331(this.f26480, 0);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m22394() {
        C14784 c14784 = this.f26483;
        int iM33748 = c14784.m33748(8388611);
        if (c14784.m33751() && iM33748 != 2) {
            c14784.m33734(8388611);
        } else if (iM33748 != 1) {
            c14784.m33752(8388611);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1123 m22392() {
        return this.f26480;
    }

    @Override // p067l.InterfaceC10091
    public void onDrawerSlide(View view, float f) {
        m22391(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // p067l.InterfaceC10091
    public void onDrawerOpened(View view) {
        m22391(1.0f);
        this.f26482.mo22330(0);
    }

    @Override // p067l.InterfaceC10091
    public void onDrawerClosed(View view) {
        m22391(0.0f);
        this.f26482.mo22330(0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22391(float f) {
        C1123 c1123 = this.f26480;
        if (f == 1.0f) {
            c1123.m17918(true);
        } else if (f == 0.0f) {
            c1123.m17918(false);
        }
        c1123.m17916(f);
    }
}
