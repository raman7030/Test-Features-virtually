package l;

import java.util.Iterator;
import net.sf.sevenzipjbinding.IInArchive;

/* JADX INFO: renamed from: l.ܳܺܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05ZQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14627 implements InterfaceC21213 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23800 f44735;

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo18443(AbstractC15440 abstractC15440) {
        C23800 c23800 = this.f44735;
        C5168 c5168 = c23800.f77014;
        if (c5168 == null) {
            C7106.m19117(c23800.f77013, abstractC15440);
        } else {
            c5168.m14822(abstractC15440);
        }
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo18444(IInArchive iInArchive) {
        C23800 c23800 = this.f44735;
        int iM39746 = C4159.m12569(this.f44735.f77011).m39746();
        C23800 c23801 = this.f44735;
        c23800.f77014 = new C5168(iM39746, iInArchive, c23801.f77012, c23801.f77013);
        Iterator itM9029 = C2958.m9029(this.f44735.f77013);
        while (C1773.m5910(itM9029)) {
            this.f44735.f77014.m14822((AbstractC15440) C2272.m7513(itM9029));
        }
        C1047.m3597(this.f44735.f77013);
    }

    public C14627(C23800 c23800) {
        this.f44735 = c23800;
    }

    @Override // l.InterfaceC21213
    /* JADX INFO: renamed from: ܽ */
    public final void mo18445() {
        this.f44735.f77016 = true;
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f44735.f77010.m27225();
    }
}
