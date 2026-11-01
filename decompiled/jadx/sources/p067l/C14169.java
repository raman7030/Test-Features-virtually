package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.۫۫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14169 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractActivityC5549 f40411;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ int[] f40412;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ View[] f40413;

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return view == obj;
    }

    public C14169(View[] viewArr, AbstractActivityC5549 abstractActivityC5549, int[] iArr) {
        this.f40413 = viewArr;
        this.f40411 = abstractActivityC5549;
        this.f40412 = iArr;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ۧ */
    public final int mo13852() {
        return this.f40413.length;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        View view = this.f40413[i];
        if (view.getParent() == null) {
            c2798.addView(view);
        }
        return view;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        c2798.removeView((View) obj);
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final CharSequence mo13848(int i) {
        return this.f40411.getString(this.f40412[i]);
    }
}
