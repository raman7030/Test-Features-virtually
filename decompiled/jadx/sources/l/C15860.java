package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15860 extends C3867 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f49022 = C11321.m27962(C15860.class.getName());

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f49023;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m37598(C15154 c15154) {
        AbstractC10134 abstractC10134Mo31523 = c15154.mo31523();
        if (abstractC10134Mo31523 == null || !abstractC10134Mo31523.mo25457()) {
            f49022.mo7103(c15154, "Service Resolved called for an unresolved event: {}");
        } else {
            String str = c15154.getName() + "." + c15154.mo31524();
            AbstractC10134 abstractC10134 = (AbstractC10134) this.f49023.get(str);
            if (abstractC10134 != null && abstractC10134Mo31523.equals(abstractC10134)) {
                byte[] bArrMo25451 = abstractC10134Mo31523.mo25451();
                byte[] bArrMo25452 = abstractC10134.mo25451();
                if (bArrMo25451.length == bArrMo25452.length) {
                    int i = 0;
                    while (true) {
                        if (i < bArrMo25451.length) {
                            if (bArrMo25451[i] != bArrMo25452[i]) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!abstractC10134Mo31523.mo25448(abstractC10134)) {
                            break;
                        } else {
                            f49022.mo7100(c15154, "Service Resolved called for a service already resolved: {}");
                        }
                    }
                }
            }
            if (abstractC10134 == null) {
                if (this.f49023.putIfAbsent(str, abstractC10134Mo31523.clone()) == null) {
                    ((InterfaceC5900) m11680()).mo16542(c15154);
                }
            } else if (this.f49023.replace(str, abstractC10134, abstractC10134Mo31523.clone())) {
                ((InterfaceC5900) m11680()).mo16542(c15154);
            }
        }
    }

    public C15860(InterfaceC5900 interfaceC5900, boolean z) {
        super(interfaceC5900, z);
        this.f49023 = new ConcurrentMapC10942(32);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37597(AbstractC12955 abstractC12955) {
        if (this.f49023.putIfAbsent(abstractC12955.getName() + "." + abstractC12955.mo31524(), abstractC12955.mo31523().clone()) == null) {
            ((InterfaceC5900) m11680()).mo16541(abstractC12955);
            AbstractC10134 abstractC10134Mo31523 = abstractC12955.mo31523();
            if (abstractC10134Mo31523 == null || !abstractC10134Mo31523.mo25457()) {
                return;
            }
            ((InterfaceC5900) m11680()).mo16542(abstractC12955);
            return;
        }
        f49022.mo7100(abstractC12955, "Service Added called for a service already added: {}");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37599(AbstractC12955 abstractC12955) {
        String str = abstractC12955.getName() + "." + abstractC12955.mo31524();
        ConcurrentMapC10942 concurrentMapC10942 = this.f49023;
        if (concurrentMapC10942.remove(str, concurrentMapC10942.get(str))) {
            ((InterfaceC5900) m11680()).mo16540(abstractC12955);
        } else {
            f49022.mo7100(abstractC12955, "Service Removed called for a service already removed: {}");
        }
    }

    public final String toString() {
        StringBuilder sbM32307 = C13325.m32307(2048, "[Status for ");
        sbM32307.append(((InterfaceC5900) m11680()).toString());
        ConcurrentMapC10942 concurrentMapC10942 = this.f49023;
        if (concurrentMapC10942.isEmpty()) {
            sbM32307.append(" no type event ");
        } else {
            sbM32307.append(" (");
            Iterator it = concurrentMapC10942.keySet().iterator();
            while (it.hasNext()) {
                sbM32307.append(((String) it.next()) + ", ");
            }
            sbM32307.append(") ");
        }
        sbM32307.append("]");
        return sbM32307.toString();
    }
}
