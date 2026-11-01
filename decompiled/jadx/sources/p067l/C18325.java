package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽܿܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18325 implements InterfaceC1489 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ List f54734;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C24951 f54735;

    public /* synthetic */ C18325(List list, C24951 c24951) {
        this.f54734 = list;
        this.f54735 = c24951;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // p067l.InterfaceC1489
    public final void accept(Object obj) {
        int size;
        C12962 c12962;
        C16903 c16903 = (C16903) obj;
        int i = ActivityC2822.f4836;
        List list = this.f54734;
        if (list.isEmpty()) {
            size = list.size();
        } else {
            C16903 c16904 = (C16903) C9179.m21131(1, list);
            if (c16904.f50053.m29724() == 22 || ((c12962 = c16904.f50052) != null && c12962.m29724() == 22)) {
                size = list.size() - 1;
            } else {
                size = list.size();
            }
        }
        list.add(size, c16903);
        C24951 c24951 = this.f54735;
        c24951.f79667.notifyItemInserted(size);
        c24951.f79675.smoothScrollToPosition(size);
        C10199.m23791();
    }
}
