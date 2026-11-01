package p067l;

import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes.dex */
public final class C24951 {

    /* JADX INFO: renamed from: ֫ */
    public C9608 f79667;

    /* JADX INFO: renamed from: ۜ */
    public int f79668;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC2822 f79669;

    /* JADX INFO: renamed from: ۧ */
    public int f79670;

    /* JADX INFO: renamed from: ܳ */
    public final int f79671;

    /* JADX INFO: renamed from: ܽ */
    public BitSet f79672 = new BitSet();

    /* JADX INFO: renamed from: ܿ */
    public int f79673;

    /* JADX INFO: renamed from: ᩳ */
    public int f79674;

    /* JADX INFO: renamed from: ᩷ */
    public C14849 f79675;

    /* JADX INFO: renamed from: ᩻ */
    public C3847 f79676;

    public C24951(ActivityC2822 activityC2822, int i) {
        this.f79669 = activityC2822;
        this.f79671 = i;
        C14849 c14849 = (C14849) activityC2822.m12252(R.layout.MT_Protector);
        this.f79675 = c14849;
        C9608 c9608 = new C9608(this);
        this.f79667 = c9608;
        c14849.setAdapter(c9608);
        C14976.m34321().m4066(activityC2822, new InterfaceC3326() { // from class: l.᩺ܿܿ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                this.f77139.f79667.notifyDataSetChanged();
            }
        });
        C3847 c3847 = new C3847(new C15642(this));
        this.f79676 = c3847;
        c3847.m7551(c14849);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C7517 m54835() {
        return (C7517) ((ArrayList) C10199.m23790()).get(this.f79671);
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m54834() {
        return m54835().m17411();
    }

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList m54833(boolean z) {
        List listM54834 = m54834();
        ArrayList arrayList = new ArrayList();
        BitSet bitSet = this.f79672;
        if (z) {
            ArrayList arrayList2 = (ArrayList) listM54834;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (bitSet.get(size)) {
                        arrayList.add((C16903) arrayList2.remove(size));
                        this.f79667.notifyItemRemoved(size);
                    }
                } else {
                    Collections.reverse(arrayList);
                    return arrayList;
                }
            }
        } else {
            ArrayList arrayList3 = (ArrayList) listM54834;
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                if (bitSet.get(i)) {
                    arrayList.add((C16903) arrayList3.get(i));
                }
            }
            return arrayList;
        }
    }
}
