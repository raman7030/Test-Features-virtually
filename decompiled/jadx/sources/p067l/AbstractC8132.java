package p067l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۛ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8132 {

    /* JADX INFO: renamed from: ֫ */
    public final C18685 f21434 = new C18685();
    public volatile /* synthetic */ Object onCloseHandler = null;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AbstractC8132.class, Object.class, "onCloseHandler");
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo18848() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ */
    public final C18685 m18851() {
        return this.f21434;
    }

    /* JADX INFO: renamed from: ֫ */
    public Object mo18847(C18975 c18975) {
        InterfaceC8745 interfaceC8745M18853;
        do {
            interfaceC8745M18853 = m18853();
            if (interfaceC8745M18853 == null) {
                return C12156.f33985;
            }
        } while (interfaceC8745M18853.mo15498(c18975) == null);
        interfaceC8745M18853.mo15496(c18975);
        return interfaceC8745M18853.mo20215();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19474 m18850() {
        C22039 c22039M49642 = this.f21434.m49642();
        C19474 c19474 = c22039M49642 instanceof C19474 ? (C19474) c22039M49642 : null;
        if (c19474 == null) {
            return null;
        }
        m18846(c19474);
        return c19474;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m18849(C18975 c18975) {
        Object objMo18847 = mo18847(c18975);
        if (objMo18847 == C12156.f33986) {
            return C10027.f27775;
        }
        if (objMo18847 == C12156.f33985) {
            C19474 c19474M18850 = m18850();
            if (c19474M18850 != null) {
                m18846(c19474M18850);
                return new C4051(new C16120("Channel was closed"));
            }
            return C18132.f54161;
        }
        if (!(objMo18847 instanceof C19474)) {
            throw new IllegalStateException(("trySend returned " + objMo18847).toString());
        }
        m18846((C19474) objMo18847);
        return new C4051(new C16120("Channel was closed"));
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC22157 m18852() {
        C22039 c22039;
        C22039 c22039M49638;
        while (true) {
            C18685 c18685 = this.f21434;
            c22039 = (C22039) c18685.m49643();
            if (c22039 == c18685 || !(c22039 instanceof AbstractC22157)) {
                break;
            }
            if ((!(((AbstractC22157) c22039) instanceof C19474) || c22039.mo42507()) && (c22039M49638 = c22039.m49638()) != null) {
                c22039M49638.m49640();
            }
            return (AbstractC22157) c22039;
        }
        c22039 = null;
        return (AbstractC22157) c22039;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.᩷ۛ᩵] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC8745 m18853() {
        ?? r1;
        C22039 c22039M49638;
        while (true) {
            C18685 c18685 = this.f21434;
            r1 = (C22039) c18685.m49643();
            if (r1 == c18685 || !(r1 instanceof InterfaceC8745)) {
                break;
            }
            if ((!(((InterfaceC8745) r1) instanceof C19474) || r1.mo42507()) && (c22039M49638 = r1.m49638()) != null) {
                c22039M49638.m49640();
            }
            return (InterfaceC8745) r1;
        }
        r1 = 0;
        return (InterfaceC8745) r1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18846(C19474 c19474) {
        Object obj = null;
        while (true) {
            C22039 c22039M49642 = c19474.m49642();
            AbstractC24838 abstractC24838 = c22039M49642 instanceof AbstractC24838 ? (AbstractC24838) c22039M49642 : null;
            if (abstractC24838 == null) {
                break;
            }
            if (abstractC24838.m49638() != null) {
                abstractC24838.m49641();
            } else if (obj == null) {
                obj = abstractC24838;
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(abstractC24838);
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(abstractC24838);
                obj = arrayList;
            }
        }
        if (obj == null) {
            return;
        }
        if (obj instanceof ArrayList) {
            ArrayList arrayList2 = (ArrayList) obj;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    return;
                } else {
                    ((AbstractC24838) arrayList2.get(size)).mo15497(c19474);
                }
            }
        } else {
            ((AbstractC24838) obj).mo15497(c19474);
        }
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C12846.m29416(this));
        sb.append('{');
        C22039 c22039 = this.f21434;
        C22039 c22039M49639 = c22039.m49639();
        if (c22039M49639 == c22039) {
            string2 = "EmptyQueue";
        } else {
            if (c22039M49639 instanceof C19474) {
                string = c22039M49639.toString();
            } else if (c22039M49639 instanceof AbstractC24838) {
                string = "ReceiveQueued";
            } else if (c22039M49639 instanceof AbstractC22157) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + c22039M49639;
            }
            C22039 c22039M49642 = c22039.m49642();
            if (c22039M49642 != c22039M49639) {
                StringBuilder sbM21133 = C9179.m21133(string, ",queueSize=");
                int i = 0;
                for (C22039 c22039M496310 = (C22039) c22039.m49643(); !C13045.m29864(c22039M496310, c22039); c22039M496310 = c22039M496310.m49639()) {
                    if (c22039M496310 != null) {
                        i++;
                    }
                }
                sbM21133.append(i);
                string2 = sbM21133.toString();
                if (c22039M49642 instanceof C19474) {
                    string2 = string2 + ",closedForSend=" + c22039M49642;
                }
            } else {
                string2 = string;
            }
        }
        sb.append(string2);
        sb.append('}');
        sb.append(mo18848());
        return sb.toString();
    }
}
