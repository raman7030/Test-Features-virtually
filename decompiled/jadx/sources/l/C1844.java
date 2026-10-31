package l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1844 implements InterfaceC15934 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17366 f6299;

    public C1844(AbstractC17366 abstractC17366) {
        this.f6299 = abstractC17366;
    }

    @Override // l.InterfaceC15934
    public final View getChildAt(int i) {
        return this.f6299.getChildAt(i);
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6126() {
        return this.f6299.getPaddingLeft();
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6128() {
        AbstractC17366 abstractC17366 = this.f6299;
        return abstractC17366.getWidth() - abstractC17366.getPaddingRight();
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6127(View view) {
        return this.f6299.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).leftMargin;
    }

    @Override // l.InterfaceC15934
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6129(View view) {
        return this.f6299.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C14543) view.getLayoutParams())).rightMargin;
    }
}
