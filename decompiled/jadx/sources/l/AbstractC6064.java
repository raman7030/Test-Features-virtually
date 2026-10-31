package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ۛ۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 3ANU */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6064 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17168 f18578 = new C17168();
    public volatile /* synthetic */ Object onCloseHandler = null;

    static {
        AtomicReferenceFieldUpdater.newUpdater(AbstractC6064.class, Object.class, "onCloseHandler");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo16919() {
        return "";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17168 m16922() {
        return this.f18578;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo16918(C17473 c17473) {
        InterfaceC6709 interfaceC6709M16924;
        do {
            interfaceC6709M16924 = m16924();
            if (interfaceC6709M16924 == null) {
                return C10298.f31022;
            }
        } while (interfaceC6709M16924.mo13623(c17473) == null);
        interfaceC6709M16924.mo13621(c17473);
        return interfaceC6709M16924.mo18267();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17998 m16921() {
        C20697 c20697M47315 = this.f18578.m47315();
        C17998 c17998 = c20697M47315 instanceof C17998 ? (C17998) c20697M47315 : null;
        if (c17998 == null) {
            return null;
        }
        m16917(c17998);
        return c17998;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m16920(C17473 c17473) {
        Object objMo16918 = mo16918(c17473);
        if (objMo16918 == C10298.f31023) {
            return C8058.f24861;
        }
        if (objMo16918 == C10298.f31022) {
            C17998 c17998M16921 = m16921();
            if (c17998M16921 != null) {
                m16917(c17998M16921);
                return new C1770(new C14469("Channel was closed"));
            }
            return C16586.f50984;
        }
        if (!(objMo16918 instanceof C17998)) {
            throw new IllegalStateException(("trySend returned " + objMo16918).toString());
        }
        m16917((C17998) objMo16918);
        return new C1770(new C14469("Channel was closed"));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20821 m16923() {
        C20697 c20697;
        C20697 c20697M47311;
        while (true) {
            C17168 c17168 = this.f18578;
            c20697 = (C20697) c17168.m47316();
            if (c20697 == c17168 || !(c20697 instanceof AbstractC20821)) {
                break;
            }
            if ((!(((AbstractC20821) c20697) instanceof C17998) || c20697.mo40262()) && (c20697M47311 = c20697.m47311()) != null) {
                c20697M47311.m47313();
            }
            return (AbstractC20821) c20697;
        }
        c20697 = null;
        return (AbstractC20821) c20697;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.᩷ۛ᩵] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6709 m16924() {
        ?? r1;
        C20697 c20697M47311;
        while (true) {
            C17168 c17168 = this.f18578;
            r1 = (C20697) c17168.m47316();
            if (r1 == c17168 || !(r1 instanceof InterfaceC6709)) {
                break;
            }
            if ((!(((InterfaceC6709) r1) instanceof C17998) || r1.mo40262()) && (c20697M47311 = r1.m47311()) != null) {
                c20697M47311.m47313();
            }
            return (InterfaceC6709) r1;
        }
        r1 = 0;
        return (InterfaceC6709) r1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16917(C17998 c17998) {
        Object obj = null;
        while (true) {
            C20697 c20697M47315 = c17998.m47315();
            AbstractC23642 abstractC23642 = c20697M47315 instanceof AbstractC23642 ? (AbstractC23642) c20697M47315 : null;
            if (abstractC23642 == null) {
                break;
            }
            if (abstractC23642.m47311() != null) {
                abstractC23642.m47314();
            } else if (obj == null) {
                obj = abstractC23642;
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(abstractC23642);
            } else {
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(abstractC23642);
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
                    ((AbstractC23642) arrayList2.get(size)).mo13622(c17998);
                }
            }
        } else {
            ((AbstractC23642) obj).mo13622(c17998);
        }
    }

    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C11024.m27354(this));
        sb.append('{');
        C20697 c20697 = this.f18578;
        C20697 c20697M47312 = c20697.m47312();
        if (c20697M47312 == c20697) {
            string2 = "EmptyQueue";
        } else {
            if (c20697M47312 instanceof C17998) {
                string = c20697M47312.toString();
            } else if (c20697M47312 instanceof AbstractC23642) {
                string = "ReceiveQueued";
            } else if (c20697M47312 instanceof AbstractC20821) {
                string = "SendQueued";
            } else {
                string = "UNEXPECTED:" + c20697M47312;
            }
            C20697 c20697M47315 = c20697.m47315();
            if (c20697M47315 != c20697M47312) {
                StringBuilder sbM19190 = C7166.m19190(string, ",queueSize=");
                int i = 0;
                for (C20697 c20697M47313 = (C20697) c20697.m47316(); !C11233.m27802(c20697M47313, c20697); c20697M47313 = c20697M47313.m47312()) {
                    if (c20697M47313 != null) {
                        i++;
                    }
                }
                sbM19190.append(i);
                string2 = sbM19190.toString();
                if (c20697M47315 instanceof C17998) {
                    string2 = string2 + ",closedForSend=" + c20697M47315;
                }
            } else {
                string2 = string;
            }
        }
        sb.append(string2);
        sb.append('}');
        sb.append(mo16919());
        return sb.toString();
    }
}
