package l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C22473 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f72777;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    public C22473(C5561 c5561) {
        this.f72777 = c5561;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        try {
            return ((C23178) this.f72777.f17223.get(i)).m51414();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        C13132 c13132 = ((C23178) this.f72777.f17223.get(i)).f74506;
        c0452.addView(c13132);
        return c13132;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        c0452.removeView((View) obj);
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return this.f72777.f17223.size();
    }
}
