package p067l;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ۚ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7120 extends AbstractC23214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C11450 f18579;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7120(C21203 c21203, String str, LinkedHashMap linkedHashMap, C11450 c11450) {
        super(c21203, str, linkedHashMap);
        this.f18579 = c11450;
    }

    @Override // p067l.AbstractC23214
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5248() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(this.f18579.mo26445());
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (!linkedList.isEmpty()) {
            if (m51747()) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            long jMo25101 = j;
            for (AbstractC17043 abstractC17043 : ((AbstractC17043) linkedList.removeFirst()).mo25500(true)) {
                if (abstractC17043.mo25087()) {
                    i4++;
                    if (!abstractC17043.m38691()) {
                        linkedList.addLast(abstractC17043);
                    }
                } else {
                    i3++;
                    if (!abstractC17043.m38691()) {
                        jMo25101 += abstractC17043.mo25101();
                    }
                }
            }
            i = i3;
            i2 = i4;
            j = jMo25101;
            m51744(i, i2, j, false);
        }
        m51744(i, i2, j, true);
    }
}
