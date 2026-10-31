package l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.ܰܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final class C13966 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23761 f41678;

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3225() {
        return false;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final void mo3226(AbstractC3255 abstractC3255) {
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo3227() {
        return false;
    }

    public C13966(C23761 c23761) {
        this.f41678 = c23761;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        if (this.f41678.f76917.f2073) {
            return 0;
        }
        return AbstractC10065.m25259(3, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        C23761 c23761 = this.f41678;
        BitSet bitSet = c23761.f76920;
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        if (bindingAdapterPosition < 0 || bindingAdapterPosition2 < 0) {
            return false;
        }
        boolean z = bitSet.get(bindingAdapterPosition);
        boolean z2 = bitSet.get(bindingAdapterPosition2);
        if (z != z2) {
            bitSet.set(bindingAdapterPosition, z2);
            bitSet.set(bindingAdapterPosition2, z);
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, c23761.m52425());
        c23761.f76915.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C8239.m21822();
        return true;
    }
}
