package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11017 implements InterfaceC15934 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17366 f33126;

    public C11017(AbstractC17366 abstractC17366) {
        this.f33126 = abstractC17366;
    }

    @Override // l.InterfaceC15934
    public final View getChildAt(int i) {
        return this.f33126.getChildAt(i);
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ֫ */
    public final int mo6126() {
        return this.f33126.getPaddingTop();
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ۧ */
    public final int mo6128() {
        AbstractC17366 abstractC17366 = this.f33126;
        return abstractC17366.getHeight() - abstractC17366.getPaddingBottom();
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ֫ */
    public final int mo6127(View view) {
        return this.f33126.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).topMargin;
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ۧ */
    public final int mo6129(View view) {
        return this.f33126.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).bottomMargin;
    }
}
