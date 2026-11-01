package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܺۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C17337 {

    /* JADX INFO: renamed from: ֫ */
    public final LinkedHashMap f51715 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ */
    public volatile long f51716;

    /* JADX INFO: renamed from: ܽ */
    public final AtomicLong f51717;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public synchronized void m39317(AbstractC17043 abstractC17043) {
        String strMo25505 = abstractC17043.mo25505();
        if (this.f51715.containsKey(strMo25505)) {
            return;
        }
        this.f51715.put(strMo25505, new C10633(abstractC17043, abstractC17043.mo25093(), abstractC17043.mo25101(), abstractC17043.mo25091()));
        this.f51716 = this.f51717.incrementAndGet();
    }

    public C17337(AbstractC17043 abstractC17043, Collection collection, AtomicLong atomicLong) {
        this.f51717 = atomicLong;
        m39317(abstractC17043);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC17043 abstractC17044 = (AbstractC17043) it.next();
            if (abstractC17044 != null) {
                m39317(abstractC17044);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m39320(C17337 c17337) {
        return c17337.f51716;
    }

    /* JADX INFO: renamed from: ۧ */
    public static List m39319(C17337 c17337) {
        List listUnmodifiableList;
        synchronized (c17337) {
            ArrayList arrayList = new ArrayList(c17337.f51715.size());
            Iterator it = c17337.f51715.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((C10633) it.next()).m24447());
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m39316(C17337 c17337) {
        List listUnmodifiableList;
        synchronized (c17337) {
            Collection collectionValues = c17337.f51715.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (Object obj : collectionValues) {
                C12826.requireNonNull(obj);
                arrayList.add(obj);
            }
            listUnmodifiableList = C21562.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
