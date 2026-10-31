package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7123 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10797 f21846;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    public C7123(C10797 c10797) {
        this.f21846 = c10797;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        try {
            return ((C5417) ((ArrayList) this.f21846.f32479).get(i)).m15502();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        C11357 c11357 = ((C1624) ((ArrayList) this.f21846.f32481).get(i)).f5717;
        c0452.addView(c11357);
        return c11357;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        c0452.removeView((View) obj);
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return ((ArrayList) this.f21846.f32481).size();
    }
}
