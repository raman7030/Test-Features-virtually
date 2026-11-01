package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19963 implements InterfaceC18621 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C16609 f60593;

    public C19963(C16609 c16609) {
        this.f60593 = c16609;
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9599(C13889 c13889) {
        m45302((AbstractC15938) c13889);
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ֫ */
    public final void mo9600(C15229 c15229) {
        m45302((AbstractC15938) c15229);
    }

    @Override // p067l.InterfaceC18621
    /* JADX INFO: renamed from: ۧ */
    public final void mo9602(C13889 c13889) {
        m45302((AbstractC15938) c13889);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m45302(AbstractC15938 abstractC15938) {
        C22783 c22783Mo31605 = abstractC15938.mo31605();
        C16609 c16609 = this.f60593;
        if (c22783Mo31605 != null) {
            C20101 c20101M50990 = c22783Mo31605.m50990();
            ArrayList arrayList = (ArrayList) c16609.f48797.get(c20101M50990);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c16609.f48797.put(c20101M50990, arrayList);
            }
            arrayList.add(c22783Mo31605);
        }
        if (abstractC15938 instanceof C13889) {
            if (abstractC15938.mo31602().m11605() == 56) {
                c16609.f48794.add((C13889) abstractC15938);
                return;
            }
            C24794 c24794M18148 = C7854.m18148();
            C5348 c5348M39656 = abstractC15938.mo31607().m39656();
            C21442 c21442Mo31600 = abstractC15938.mo31600();
            c24794M18148.getClass();
            if (c5348M39656.m11606()) {
                int size = c21442Mo31600.size();
                int iM50982 = 0;
                for (int i = 0; i < size; i++) {
                    iM50982 += c21442Mo31600.m56524get(i).m50982();
                }
                if (iM50982 >= 6) {
                    c16609.f48795.add((C13889) abstractC15938);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC15938 instanceof C15229) {
            c16609.f48791.add((C15229) abstractC15938);
        }
    }
}
