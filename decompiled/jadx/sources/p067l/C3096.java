package p067l;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.֨֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3096 extends AbstractC23214 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ ArrayList f5604;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3096(C21203 c21203, String str, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        super(c21203, str, linkedHashMap);
        this.f5604 = arrayList;
    }

    @Override // p067l.AbstractC23214
    /* JADX INFO: renamed from: ᩳ */
    public final void mo5248() {
        ArrayList arrayList = new ArrayList();
        long size = 0;
        int i = 0;
        int i2 = 0;
        for (C11450 c11450 : this.f5604) {
            if (m51747()) {
                return;
            }
            if (c11450.isDirectory()) {
                i2++;
                if (!c11450.mo39144()) {
                    arrayList.add(c11450.mo26445());
                }
            } else {
                i++;
                if (!c11450.mo39144()) {
                    size += c11450.getSize();
                }
            }
        }
        int i3 = i;
        int i4 = i2;
        long j = size;
        m51744(i3, i4, j, false);
        LinkedList linkedList = new LinkedList(arrayList);
        while (!linkedList.isEmpty()) {
            if (m51747()) {
                return;
            }
            int i5 = i3;
            int i6 = i4;
            long jMo25101 = j;
            for (AbstractC17043 abstractC17043 : ((AbstractC17043) linkedList.removeFirst()).mo25500(true)) {
                if (abstractC17043.mo25087()) {
                    i6++;
                    if (!abstractC17043.m38691()) {
                        linkedList.addLast(abstractC17043);
                    }
                } else {
                    i5++;
                    if (!abstractC17043.m38691()) {
                        jMo25101 += abstractC17043.mo25101();
                    }
                }
            }
            i3 = i5;
            i4 = i6;
            j = jMo25101;
            m51744(i3, i4, j, false);
        }
        m51744(i3, i4, j, true);
    }
}
