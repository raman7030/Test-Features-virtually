package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.֡ۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: XBDS */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2606 extends AbstractC19094 {
    @Override // p067l.AbstractC19094
    /* JADX INFO: renamed from: ۢ */
    public final void mo3906() {
        int i = 0;
        if (mo8960().size() <= 65536) {
            Iterator it = mo8960().iterator();
            while (it.hasNext()) {
                ((AbstractC20713) it.next()).m39357(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo8960().iterator();
        while (it2.hasNext()) {
            String string = ((AbstractC20713) it2.next()).m24490().m32772().getString();
            int iLastIndexOf = string.lastIndexOf(47);
            String strReplace = iLastIndexOf == -1 ? "default" : string.substring(string.lastIndexOf(91) + 2, iLastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(strReplace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(strReplace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C22724 ? AbstractC0213e.f995s : "field", Integer.valueOf(mo8960().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            throw new C7419(formatter.toString(), null);
        } finally {
            formatter.close();
        }
    }
}
