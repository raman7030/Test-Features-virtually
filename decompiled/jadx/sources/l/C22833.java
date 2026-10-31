package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩺ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AA2F */
/* JADX INFO: loaded from: classes2.dex */
public final class C22833 extends ConcurrentMapC10942 {
    public static final long serialVersionUID = 3024739453186759259L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f73705 = C11321.m27962(C22833.class.getName());

    @Override // l.ConcurrentMapC10942, java.util.AbstractMap
    public final synchronized String toString() {
        StringBuilder sb;
        try {
            sb = new StringBuilder(2000);
            sb.append("\n\t---- cache ----");
            for (Map.Entry entry : entrySet()) {
                sb.append("\n\n\t\tname '");
                sb.append((String) entry.getKey());
                sb.append('\'');
                List<AbstractC13660> list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    sb.append(" : no entries");
                } else {
                    synchronized (list) {
                        for (AbstractC13660 abstractC13660 : list) {
                            sb.append("\n\t\t\t");
                            sb.append(abstractC13660.toString());
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return sb.toString();
    }

    public C22833() {
        super(1024);
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C22833 c22833 = new C22833(size());
        c22833.putAll(this);
        return c22833;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m50941(String str) {
        ArrayList arrayList;
        Collection collectionM50940 = m50940(str);
        if (collectionM50940 != null) {
            synchronized (collectionM50940) {
                arrayList = new ArrayList(collectionM50940);
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Collection m50940(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13660 m50946(AbstractC22542 abstractC22542) {
        Collection<AbstractC13660> collectionM50940;
        AbstractC13660 abstractC13660 = null;
        if (abstractC22542 == null || (collectionM50940 = m50940(abstractC22542.m32822())) == null) {
            return null;
        }
        synchronized (collectionM50940) {
            for (AbstractC13660 abstractC13661 : collectionM50940) {
                if (abstractC13661.mo22112((AbstractC13660) abstractC22542)) {
                    abstractC13660 = abstractC13661;
                    break;
                }
            }
        }
        return abstractC13660;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13660 m50942(String str, EnumC11628 enumC11628, EnumC5983 enumC5983) {
        Collection<AbstractC13660> collectionM50940 = m50940(str);
        AbstractC13660 abstractC13660 = null;
        if (collectionM50940 == null) {
            return null;
        }
        synchronized (collectionM50940) {
            for (AbstractC13660 abstractC13661 : collectionM50940) {
                if (abstractC13661.m32832().equals(enumC11628) && abstractC13661.m32825(enumC5983)) {
                    abstractC13660 = abstractC13661;
                    break;
                }
            }
        }
        return abstractC13660;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m50945(String str, EnumC11628 enumC11628, EnumC5983 enumC5983) {
        ArrayList arrayList;
        Collection collectionM50940 = m50940(str);
        if (collectionM50940 != null) {
            synchronized (collectionM50940) {
                arrayList = new ArrayList(collectionM50940);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AbstractC13660 abstractC13660 = (AbstractC13660) it.next();
                    if (!abstractC13660.m32832().equals(enumC11628) || !abstractC13660.m32825(enumC5983)) {
                        it.remove();
                    }
                }
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50944(AbstractC22542 abstractC22542) {
        if (abstractC22542 != null) {
            List list = (List) get(abstractC22542.m32822());
            if (list == null) {
                putIfAbsent(abstractC22542.m32822(), new ArrayList());
                list = (List) get(abstractC22542.m32822());
            }
            List list2 = list;
            synchronized (list2) {
                list2.add(abstractC22542);
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50947(AbstractC22542 abstractC22542) {
        boolean zRemove;
        List list = (List) get(abstractC22542.m32822());
        if (list != null) {
            synchronized (list) {
                zRemove = list.remove(abstractC22542);
            }
        } else {
            zRemove = false;
        }
        if (zRemove && list.isEmpty()) {
            remove(abstractC22542.m32822());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50943() {
        InterfaceC2148 interfaceC2148 = f73705;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7095(toString(), "Cached DNSEntries: {}");
        }
    }
}
