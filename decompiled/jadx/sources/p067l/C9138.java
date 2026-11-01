package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9138 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C12630 f24725;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return view == obj;
    }

    public C9138(C12630 c12630) {
        this.f24725 = c12630;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        try {
            return ((C7517) ((ArrayList) this.f24725.f35455).get(i)).m17413();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        C13162 c13162 = ((C3912) ((ArrayList) this.f24725.f35457).get(i)).f8497;
        c2798.addView(c13162);
        return c13162;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        c2798.removeView((View) obj);
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return ((ArrayList) this.f24725.f35457).size();
    }
}
