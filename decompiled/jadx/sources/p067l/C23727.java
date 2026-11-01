package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.᩹ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 715M */
/* JADX INFO: loaded from: classes.dex */
public final class C23727 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C7654 f75504;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return view == obj;
    }

    public C23727(C7654 c7654) {
        this.f75504 = c7654;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        try {
            return ((C24397) this.f75504.f20063.get(i)).m53810();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        C14849 c14849 = ((C24397) this.f75504.f20063.get(i)).f77250;
        c2798.addView(c14849);
        return c14849;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        c2798.removeView((View) obj);
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return this.f75504.f20063.size();
    }
}
