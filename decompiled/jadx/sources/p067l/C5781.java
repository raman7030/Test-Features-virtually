package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۘ֡ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1Q7 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5781 implements InterfaceC9311, InterfaceC24631 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f14208;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14209;

    public /* synthetic */ C5781(Object obj, Object obj2) {
        this.f14208 = obj;
        this.f14209 = obj2;
    }

    @Override // p067l.InterfaceC24631
    /* JADX INFO: renamed from: ֫ */
    public String mo12962(C5318 c5318) {
        return ((ActivityC12088) this.f14208).f33705.m40956(c5318, (C24905) this.f14209);
    }

    @Override // p067l.InterfaceC9311
    /* JADX INFO: renamed from: ֫ */
    public void mo12963(final C12073 c12073) {
        final C18107 c18107 = (C18107) this.f14208;
        final C4697 c4697 = (C4697) this.f14209;
        c12073.m27641();
        c18107.m41270().m41979(c18107, c18107.m41251(), new InterfaceC9311() { // from class: l.ᩴ֡ܳ
            @Override // p067l.InterfaceC9311
            /* JADX INFO: renamed from: ֫ */
            public final void mo12963(C12073 c12074) {
                String name;
                String name2;
                c12074.m27641();
                C12073 c12075 = c12073;
                AbstractC17043 abstractC17043M27644 = c12075.m27644();
                AbstractC17043 abstractC17043M27645 = c12074.m27644();
                C4697 c4698 = c4697;
                boolean zM41290 = c4698.m9969().m41290();
                if (abstractC17043M27644.getName().equals(abstractC17043M27645.getName())) {
                    int i = R.string.MT_Protector;
                    name = C7050.m16203(zM41290 ? R.string.MT_Protector : R.string.MT_Protector, abstractC17043M27644.getName());
                    if (!zM41290) {
                        i = R.string.MT_Protector;
                    }
                    name2 = C7050.m16203(i, abstractC17043M27645.getName());
                } else {
                    name = abstractC17043M27644.getName();
                    name2 = abstractC17043M27645.getName();
                }
                C9315 c9315 = new C9315(c12075.m27644(), c12074.m27644(), name, name2, c4698.m9970(), c18107.m41270());
                if (!zM41290) {
                    c9315.m21562();
                }
                C21128.m47750(c4698.m9969(), c9315);
            }
        });
    }
}
