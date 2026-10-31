package l;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: l.۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 43T5 */
/* JADX INFO: loaded from: classes3.dex */
public class C7623 implements InterfaceC8126 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f23566 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5674 f23567;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Drawable f23568;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC11857 f23569;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13064 f23570;

    @Override // l.InterfaceC8126
    public final void onDrawerStateChanged(int i) {
    }

    public C7623(AbstractActivityC3346 abstractActivityC3346, C13064 c13064, C9762 c9762) {
        if (c9762 != null) {
            this.f23569 = new C13972(c9762);
            c9762.setNavigationOnClickListener(new ViewOnClickListenerC6212(this));
        } else {
            this.f23569 = abstractActivityC3346.mo4114();
        }
        this.f23570 = c13064;
        this.f23567 = new C5674(this.f23569.mo20350());
        this.f23568 = this.f23569.mo20354();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m20414() {
        C13064 c13064 = this.f23570;
        if (c13064.m31666(8388611)) {
            m20412(1.0f);
        } else {
            m20412(0.0f);
        }
        c13064.m31666(8388611);
        boolean z = this.f23566;
        InterfaceC11857 interfaceC11857 = this.f23569;
        if (!z && !interfaceC11857.mo20353()) {
            this.f23566 = true;
        }
        interfaceC11857.mo20352(this.f23567, 0);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m20415() {
        C13064 c13064 = this.f23570;
        int iM31661 = c13064.m31661(8388611);
        if (c13064.m31664() && iM31661 != 2) {
            c13064.m31647(8388611);
        } else if (iM31661 != 1) {
            c13064.m31665(8388611);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5674 m20413() {
        return this.f23567;
    }

    @Override // l.InterfaceC8126
    public void onDrawerSlide(View view, float f) {
        m20412(Math.min(1.0f, Math.max(0.0f, f)));
    }

    @Override // l.InterfaceC8126
    public void onDrawerOpened(View view) {
        m20412(1.0f);
        this.f23569.mo20351(0);
    }

    @Override // l.InterfaceC8126
    public void onDrawerClosed(View view) {
        m20412(0.0f);
        this.f23569.mo20351(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20412(float f) {
        C5674 c5674 = this.f23567;
        if (f == 1.0f) {
            c5674.m15983(true);
        } else if (f == 0.0f) {
            c5674.m15983(false);
        }
        c5674.m15981(f);
    }
}
