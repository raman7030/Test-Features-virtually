package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12416 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f37394;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int[] f37395;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View[] f37396;

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    public C12416(View[] viewArr, AbstractActivityC3346 abstractActivityC3346, int[] iArr) {
        this.f37396 = viewArr;
        this.f37394 = abstractActivityC3346;
        this.f37395 = iArr;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ۧ */
    public final int mo11916() {
        return this.f37396.length;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        View view = this.f37396[i];
        if (view.getParent() == null) {
            c0452.addView(view);
        }
        return view;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        c0452.removeView((View) obj);
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        return this.f37394.getString(this.f37395[i]);
    }
}
