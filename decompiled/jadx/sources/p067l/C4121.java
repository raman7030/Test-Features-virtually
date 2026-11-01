package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.֫۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4121 implements InterfaceC17512 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC18873 f9078;

    public C4121(AbstractC18873 abstractC18873) {
        this.f9078 = abstractC18873;
    }

    @Override // p067l.InterfaceC17512
    public final View getChildAt(int i) {
        return this.f9078.getChildAt(i);
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final int mo8324() {
        return this.f9078.getPaddingLeft();
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ */
    public final int mo8326() {
        AbstractC18873 abstractC18873 = this.f9078;
        return abstractC18873.getWidth() - abstractC18873.getPaddingRight();
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final int mo8325(View view) {
        return this.f9078.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).leftMargin;
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ */
    public final int mo8327(View view) {
        return this.f9078.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).rightMargin;
    }
}
