package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C8511 extends AbstractC10065 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6394 f26021;

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

    public C8511(ActivityC6394 activityC6394) {
        this.f26021 = activityC6394;
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ۧ */
    public final int mo3224(AbstractC3255 abstractC3255) {
        AbstractC20506 abstractC20506 = (AbstractC20506) this.f26021.f19792.get(abstractC3255.getBindingAdapterPosition());
        abstractC20506.getClass();
        return abstractC20506 instanceof C4983 ? AbstractC10065.m25259(3, 0) : AbstractC10065.m25259(0, 0);
    }

    @Override // l.AbstractC10065
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3223(C13132 c13132, AbstractC3255 abstractC3255, AbstractC3255 abstractC3256) {
        int bindingAdapterPosition = abstractC3255.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC3256.getBindingAdapterPosition();
        ActivityC6394 activityC6394 = this.f26021;
        AbstractC20506 abstractC20506 = (AbstractC20506) activityC6394.f19792.get(bindingAdapterPosition2);
        abstractC20506.getClass();
        if ((abstractC20506 instanceof C21917) && abstractC20506.mo46980().f70170 == 0) {
            return false;
        }
        C6055.m16890(bindingAdapterPosition, bindingAdapterPosition2, activityC6394.f19792);
        AbstractC19902 adapter = c13132.getAdapter();
        C11003.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C1802.m5991(new Runnable() { // from class: l.֨᩻ܿ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC20506 abstractC20507 : this.f5201.f26021.f19792) {
                    abstractC20507.getClass();
                    if (abstractC20507 instanceof C21917) {
                        int i = abstractC20507.mo46980().f70170;
                        if (i == 1) {
                            arrayList.add(C19095.f60135);
                        } else if (i == 2) {
                            arrayList.add(C9217.f27906);
                        }
                    } else if (abstractC20507 instanceof C4983) {
                        arrayList.add(abstractC20507.mo14470().f15699);
                    }
                }
                C0749.m2882(arrayList);
                C0749.m2885();
            }
        }, this, 1000L);
        return true;
    }
}
