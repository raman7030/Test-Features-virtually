package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AA2F */
/* JADX INFO: loaded from: classes2.dex */
public final class C24069 extends ConcurrentMapC12768 {
    public static final long serialVersionUID = 3024739453186759259L;

    /* JADX INFO: renamed from: ᩸ */
    public static InterfaceC4410 f76437 = C13128.m30023(C24069.class.getName());

    @Override // p067l.ConcurrentMapC12768, java.util.AbstractMap
    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder(2000);
        sb.append("\n\t---- cache ----");
        for (Map.Entry entry : entrySet()) {
            sb.append("\n\n\t\tname '");
            sb.append((String) entry.getKey());
            sb.append('\'');
            List<AbstractC15351> list = (List) entry.getValue();
            if (list == null || list.isEmpty()) {
                sb.append(" : no entries");
            } else {
                synchronized (list) {
                    for (AbstractC15351 abstractC15351 : list) {
                        sb.append("\n\t\t\t");
                        sb.append(abstractC15351.toString());
                    }
                }
            }
        }
        return sb.toString();
    }

    public C24069() {
        super(1024);
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C24069 c24069 = new C24069(size());
        c24069.putAll(this);
        return c24069;
    }

    /* JADX INFO: renamed from: ֫ */
    public final List m53331(String str) {
        ArrayList arrayList;
        Collection collectionM53330 = m53330(str);
        if (collectionM53330 != null) {
            synchronized (collectionM53330) {
                arrayList = new ArrayList(collectionM53330);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۧ */
    private Collection m53330(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15351 m53336(AbstractC23793 abstractC23793) {
        Collection<AbstractC15351> collectionM53330;
        AbstractC15351 abstractC15351 = null;
        if (abstractC23793 == null || (collectionM53330 = m53330(abstractC23793.m34937())) == null) {
            return null;
        }
        synchronized (collectionM53330) {
            for (AbstractC15351 abstractC15352 : collectionM53330) {
                if (abstractC15352.mo24081((AbstractC15351) abstractC23793)) {
                    abstractC15351 = abstractC15352;
                    break;
                }
            }
        }
        return abstractC15351;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15351 m53332(String str, EnumC13420 enumC13420, EnumC8055 enumC8055) {
        Collection<AbstractC15351> collectionM53330 = m53330(str);
        AbstractC15351 abstractC15351 = null;
        if (collectionM53330 == null) {
            return null;
        }
        synchronized (collectionM53330) {
            for (AbstractC15351 abstractC15352 : collectionM53330) {
                if (abstractC15352.m34947().equals(enumC13420) && abstractC15352.m34940(enumC8055)) {
                    abstractC15351 = abstractC15352;
                    break;
                }
            }
        }
        return abstractC15351;
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m53335(String str, EnumC13420 enumC13420, EnumC8055 enumC8055) {
        ArrayList arrayList;
        Collection collectionM53330 = m53330(str);
        if (collectionM53330 != null) {
            synchronized (collectionM53330) {
                arrayList = new ArrayList(collectionM53330);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC15351 abstractC15351 = (AbstractC15351) it.next();
                    if (!abstractC15351.m34947().equals(enumC13420) || !abstractC15351.m34940(enumC8055)) {
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53334(AbstractC23793 abstractC23793) {
        if (abstractC23793 != null) {
            List list = (List) get(abstractC23793.m34937());
            if (list == null) {
                putIfAbsent(abstractC23793.m34937(), new ArrayList());
                list = (List) get(abstractC23793.m34937());
            }
            List list2 = list;
            synchronized (list2) {
                list2.add(abstractC23793);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53337(AbstractC23793 abstractC23793) {
        boolean zRemove;
        List list = (List) get(abstractC23793.m34937());
        if (list != null) {
            synchronized (list) {
                zRemove = list.remove(abstractC23793);
            }
        } else {
            zRemove = false;
        }
        if (zRemove && list.isEmpty()) {
            remove(abstractC23793.m34937());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53333() {
        InterfaceC4410 interfaceC4410 = f76437;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9190(toString(), "Cached DNSEntries: {}");
        }
    }
}
