package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ܺۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes4.dex */
public final class C15750 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f48575 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile long f48576;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f48577;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m37147(AbstractC15440 abstractC15440) {
        String strMo23554 = abstractC15440.mo23554();
        if (this.f48575.containsKey(strMo23554)) {
            return;
        }
        this.f48575.put(strMo23554, new C8696(abstractC15440, abstractC15440.mo23119(), abstractC15440.mo23127(), abstractC15440.mo23117()));
        this.f48576 = this.f48577.incrementAndGet();
    }

    public C15750(AbstractC15440 abstractC15440, Collection collection, AtomicLong atomicLong) {
        this.f48577 = atomicLong;
        m37147(abstractC15440);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC15440 abstractC15441 = (AbstractC15440) it.next();
            if (abstractC15441 != null) {
                m37147(abstractC15441);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m37150(C15750 c15750) {
        return c15750.f48576;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m37149(C15750 c15750) {
        List listUnmodifiableList;
        synchronized (c15750) {
            ArrayList arrayList = new ArrayList(c15750.f48575.size());
            Iterator it = c15750.f48575.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((C8696) it.next()).m22478());
            }
            listUnmodifiableList = C20195.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m37146(C15750 c15750) {
        List listUnmodifiableList;
        synchronized (c15750) {
            Collection collectionValues = c15750.f48575.values();
            ArrayList arrayList = new ArrayList(collectionValues.size());
            for (Object obj : collectionValues) {
                C11003.requireNonNull(obj);
                arrayList.add(obj);
            }
            listUnmodifiableList = C20195.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
