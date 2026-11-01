package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9E2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10840 {

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC4410 f30024 = C13128.m30022(C10840.class);

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f30025 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m24958(C14192 c14192) throws C14862 {
        while (true) {
            AbstractC15121 abstractC15121M31412 = C13781.m31412(c14192);
            if (abstractC15121M31412.m34536() == EnumC5734.MsvAvEOL) {
                return;
            }
            f30024.mo9185("Read TargetInfo {} --> {}", abstractC15121M31412.m34536(), abstractC15121M31412.m34537());
            this.f30025.add(abstractC15121M31412);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m24960(C14192 c14192) {
        for (AbstractC15121 abstractC15121 : this.f30025) {
            f30024.mo9185("Writing TargetInfo {} --> {}", abstractC15121.m34536(), abstractC15121.m34537());
            abstractC15121.mo8374(c14192);
        }
        new C12440().mo8374(c14192);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10840 m24956() {
        C10840 c10840 = new C10840();
        c10840.f30025 = new ArrayList(this.f30025);
        return c10840;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15121 m24957(EnumC5734 enumC5734) {
        for (AbstractC15121 abstractC15121 : this.f30025) {
            if (abstractC15121.m34536() == enumC5734) {
                return abstractC15121;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24959(AbstractC15121 abstractC15121) {
        for (AbstractC15121 abstractC15122 : this.f30025) {
            if (abstractC15122.m34536() == abstractC15121.m34536()) {
                this.f30025.remove(abstractC15122);
                break;
            }
        }
        this.f30025.add(abstractC15121);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m24961(EnumC5734 enumC5734) {
        Iterator it = this.f30025.iterator();
        while (it.hasNext()) {
            if (((AbstractC15121) it.next()).m34536() == enumC5734) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "TargetInfo{targetInfo=" + this.f30025 + '}';
    }
}
