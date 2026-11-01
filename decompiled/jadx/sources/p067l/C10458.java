package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۠᩻ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7IB */
/* JADX INFO: loaded from: classes3.dex */
public final class C10458 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC8446 f28936;

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

    public C10458(ActivityC8446 activityC8446) {
        this.f28936 = activityC8446;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        AbstractC21858 abstractC21858 = (AbstractC21858) this.f28936.f22665.get(abstractC5462.getBindingAdapterPosition());
        abstractC21858.getClass();
        return abstractC21858 instanceof C7105 ? AbstractC11934.m27276(3, 0) : AbstractC11934.m27276(0, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        ActivityC8446 activityC8446 = this.f28936;
        AbstractC21858 abstractC21858 = (AbstractC21858) activityC8446.f22665.get(bindingAdapterPosition2);
        abstractC21858.getClass();
        if ((abstractC21858 instanceof C23199) && abstractC21858.mo49303().f72884 == 0) {
            return false;
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, activityC8446.f22665);
        AbstractC21283 adapter = c14849.getAdapter();
        C12826.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4081.m8188(new Runnable() { // from class: l.֨᩻ܿ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC21858 abstractC21859 : this.f7974.f28936.f22665) {
                    abstractC21859.getClass();
                    if (abstractC21859 instanceof C23199) {
                        int i = abstractC21859.mo49303().f72884;
                        if (i == 1) {
                            arrayList.add(C20517.f63369);
                        } else if (i == 2) {
                            arrayList.add(C11129.f30852);
                        }
                    } else if (abstractC21859 instanceof C7105) {
                        arrayList.add(abstractC21859.mo16374().f18533);
                    }
                }
                C3081.m5211(arrayList);
                C3081.m5214();
            }
        }, this, 1000L);
        return true;
    }
}
