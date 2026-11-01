package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 89CO */
/* JADX INFO: loaded from: classes4.dex */
public final class C14222 extends AbstractC11934 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ ActivityC11800 f40509;

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

    public C14222(ActivityC11800 activityC11800) {
        this.f40509 = activityC11800;
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ۧ */
    public final int mo5538(AbstractC5462 abstractC5462) {
        AbstractC15562 abstractC15562 = (AbstractC15562) this.f40509.f32955.get(abstractC5462.getBindingAdapterPosition());
        abstractC15562.getClass();
        return abstractC15562 instanceof C9528 ? AbstractC11934.m27276(3, 0) : AbstractC11934.m27276(0, 0);
    }

    @Override // p067l.AbstractC11934
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5537(C14849 c14849, AbstractC5462 abstractC5462, AbstractC5462 abstractC5463) {
        int bindingAdapterPosition = abstractC5462.getBindingAdapterPosition();
        int bindingAdapterPosition2 = abstractC5463.getBindingAdapterPosition();
        ActivityC11800 activityC11800 = this.f40509;
        AbstractC15562 abstractC15562 = (AbstractC15562) activityC11800.f32955.get(bindingAdapterPosition2);
        abstractC15562.getClass();
        if (abstractC15562 instanceof C19175) {
            return false;
        }
        if ((abstractC15562 instanceof C8187) && abstractC15562.mo18966().f21613 == 0) {
            return false;
        }
        C8123.m18819(bindingAdapterPosition, bindingAdapterPosition2, activityC11800.f32955);
        AbstractC21283 adapter = c14849.getAdapter();
        C12826.requireNonNull(adapter);
        adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        C4081.m8188(new Runnable() { // from class: l.۬ܳܿ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                for (AbstractC15562 abstractC15563 : this.f42468.f40509.f32955) {
                    abstractC15563.getClass();
                    if (abstractC15563 instanceof C8187) {
                        int i = abstractC15563.mo18966().f21613;
                        if (i == 1) {
                            arrayList.add(C20517.f63369);
                        } else if (i == 2) {
                            arrayList.add(C11129.f30852);
                        }
                    } else if (abstractC15563 instanceof C9528) {
                        arrayList.add(abstractC15563.mo22194().f26090);
                    }
                }
                int i2 = -1;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String strMo10845 = ((AbstractC5094) arrayList.get(i3)).mo10845();
                    strMo10845.getClass();
                    if (strMo10845.equals("builtin:systemTranslate")) {
                        C6846.m15683(arrayList);
                        C6846.m15685();
                    } else {
                        if (strMo10845.equals("builtin:translate")) {
                            i2 = i3;
                        }
                    }
                }
                arrayList.add(i2 + 1, new C23610(12));
                C6846.m15683(arrayList);
                C6846.m15685();
            }
        }, this, 1000L);
        return true;
    }
}
