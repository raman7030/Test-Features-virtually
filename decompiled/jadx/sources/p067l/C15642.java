package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C15642 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C24951 f44758;

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5539() {
        return false;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final void mo5540(AbstractC5462 abstractC5462) {
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5541() {
        return false;
    }

    public C15642(C24951 c24951) {
        this.f44758 = c24951;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        if (this.f44758.f79669.f4847) {
            return 0;
        }
        return AbstractC11934.m27276(3, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        C24951 c24951 = this.f44758;
        BitSet bitSet = c24951.f79672;
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        boolean z = bitSet.get(bindingAdapterPosition);
        boolean z2 = bitSet.get(bindingAdapterPosition2);
        if (z != z2) {
            bitSet.set(bindingAdapterPosition, z2);
            bitSet.set(bindingAdapterPosition2, z);
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, c24951.m54834());
        c24951.f79667.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C10199.m23791();
        return true;
    }
}
