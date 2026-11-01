package p067l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: l.ۧ۬ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12839 implements InterfaceC17512 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC18873 f36120;

    public C12839(AbstractC18873 abstractC18873) {
        this.f36120 = abstractC18873;
    }

    @Override // p067l.InterfaceC17512
    public final View getChildAt(int i) {
        return this.f36120.getChildAt(i);
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final int mo8324() {
        return this.f36120.getPaddingTop();
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ */
    public final int mo8326() {
        AbstractC18873 abstractC18873 = this.f36120;
        return abstractC18873.getHeight() - abstractC18873.getPaddingBottom();
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ֫ */
    public final int mo8325(View view) {
        return this.f36120.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).topMargin;
    }

    @Override // p067l.InterfaceC17512
    /* JADX INFO: renamed from: ۧ */
    public final int mo8327(View view) {
        return this.f36120.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C16190) view.getLayoutParams())).bottomMargin;
    }
}
