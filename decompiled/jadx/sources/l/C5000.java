package l;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۚ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5000 extends AbstractC21934 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9555 f15746;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5000(C19818 c19818, String str, LinkedHashMap linkedHashMap, C9555 c9555) {
        super(c19818, str, linkedHashMap);
        this.f15746 = c9555;
    }

    @Override // l.AbstractC21934
    /* JADX INFO: renamed from: ᩳ */
    public final void mo2920() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f15746.mo24433());
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            if (m49410()) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            long jMo23127 = j;
            for (AbstractC15440 abstractC15440 : ((AbstractC15440) linkedList.removeFirst()).mo23549(true)) {
                if (abstractC15440.mo23113()) {
                    i4++;
                    if (!abstractC15440.m36533()) {
                        linkedList.addLast(abstractC15440);
                    }
                } else {
                    i3++;
                    if (!abstractC15440.m36533()) {
                        jMo23127 += abstractC15440.mo23127();
                    }
                }
            }
            i = i3;
            i2 = i4;
            j = jMo23127;
            m49407(i, i2, j, false);
        }
        m49407(i, i2, j, true);
    }
}
