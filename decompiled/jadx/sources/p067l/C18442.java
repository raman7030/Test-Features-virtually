package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7C4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18442 extends AbstractC11934 {

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ ArrayList f55153;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C19784 f55154;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C18442(ArrayList arrayList, C19784 c19784) {
        this.f55153 = arrayList;
        this.f55154 = c19784;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        return AbstractC11934.m27276(3, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return false;
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, this.f55153);
        this.f55154.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }
}
