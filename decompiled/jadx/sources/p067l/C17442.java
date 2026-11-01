package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: EA25 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17442 extends C6044 {

    /* JADX INFO: renamed from: ᩳ */
    public static InterfaceC4410 f52160 = C13128.m30023(C17442.class.getName());

    /* JADX INFO: renamed from: ܽ */
    public final ConcurrentMapC12768 f52161;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m39770(C16771 c16771) {
        AbstractC12000 abstractC12000Mo33610 = c16771.mo33610();
        if (abstractC12000Mo33610 == null || !abstractC12000Mo33610.mo27477()) {
            f52160.mo9198(c16771, "Service Resolved called for an unresolved event: {}");
        } else {
            String str = c16771.getName() + "." + c16771.mo33611();
            AbstractC12000 abstractC12000 = (AbstractC12000) this.f52161.get(str);
            if (abstractC12000 != null && abstractC12000Mo33610.equals(abstractC12000)) {
                byte[] bArrMo27471 = abstractC12000Mo33610.mo27471();
                byte[] bArrMo27472 = abstractC12000.mo27471();
                if (bArrMo27471.length == bArrMo27472.length) {
                    int i = 0;
                    while (true) {
                        if (i < bArrMo27471.length) {
                            if (bArrMo27471[i] != bArrMo27472[i]) {
                                break;
                            } else {
                                i++;
                            }
                        } else if (!abstractC12000Mo33610.mo27468(abstractC12000)) {
                            break;
                        } else {
                            f52160.mo9195(c16771, "Service Resolved called for a service already resolved: {}");
                        }
                    }
                }
            }
            if (abstractC12000 == null) {
                if (this.f52161.putIfAbsent(str, abstractC12000Mo33610.clone()) == null) {
                    ((InterfaceC7976) m13616()).mo18468(c16771);
                }
            } else if (this.f52161.replace(str, abstractC12000, abstractC12000Mo33610.clone())) {
                ((InterfaceC7976) m13616()).mo18468(c16771);
            }
        }
    }

    public C17442(InterfaceC7976 interfaceC7976, boolean z) {
        super(interfaceC7976, z);
        this.f52161 = new ConcurrentMapC12768(32);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39769(AbstractC14681 abstractC14681) {
        if (this.f52161.putIfAbsent(abstractC14681.getName() + "." + abstractC14681.mo33611(), abstractC14681.mo33610().clone()) == null) {
            ((InterfaceC7976) m13616()).mo18467(abstractC14681);
            AbstractC12000 abstractC12000Mo33610 = abstractC14681.mo33610();
            if (abstractC12000Mo33610 == null || !abstractC12000Mo33610.mo27477()) {
                return;
            }
            ((InterfaceC7976) m13616()).mo18468(abstractC14681);
            return;
        }
        f52160.mo9195(abstractC14681, "Service Added called for a service already added: {}");
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39771(AbstractC14681 abstractC14681) {
        String str = abstractC14681.getName() + "." + abstractC14681.mo33611();
        ConcurrentMapC12768 concurrentMapC12768 = this.f52161;
        if (concurrentMapC12768.remove(str, concurrentMapC12768.get(str))) {
            ((InterfaceC7976) m13616()).mo18466(abstractC14681);
        } else {
            f52160.mo9195(abstractC14681, "Service Removed called for a service already removed: {}");
        }
    }

    public final String toString() {
        StringBuilder sbM34407 = C15033.m34407(2048, "[Status for ");
        sbM34407.append(((InterfaceC7976) m13616()).toString());
        ConcurrentMapC12768 concurrentMapC12768 = this.f52161;
        if (concurrentMapC12768.isEmpty()) {
            sbM34407.append(" no type event ");
        } else {
            sbM34407.append(" (");
            Iterator it = concurrentMapC12768.keySet().iterator();
            while (it.hasNext()) {
                sbM34407.append(((String) it.next()) + ", ");
            }
            sbM34407.append(") ");
        }
        sbM34407.append("]");
        return sbM34407.toString();
    }
}
