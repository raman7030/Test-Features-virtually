package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺ᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T57T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17781 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public C4036 f53087;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC7257 f53088;

    /* JADX INFO: renamed from: ܽ */
    public C20271 f53089 = new C20271();

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C6383 f53090;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
    }

    @Override // p067l.C15854
    /* JADX INFO: renamed from: ۧ */
    public final void mo12739(AbstractC7257 abstractC7257) {
        if (abstractC7257 != null) {
            for (AbstractC11077 abstractC11077 : this.f53090.f16520) {
                if (abstractC11077.f30674.f16517.contains(abstractC11077.f30672) && abstractC7257.m16617(abstractC11077.f30673) && abstractC11077.mo20985(abstractC7257)) {
                    Iterator it = abstractC11077.mo20986(abstractC7257).iterator();
                    while (it.hasNext()) {
                        this.f53089.m45777(new C11748(this.f53090, this.f53088, abstractC7257, (AbstractC7257) it.next(), abstractC11077, this.f53087));
                    }
                    break;
                }
            }
        }
        super.mo12739(abstractC7257);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        mo12739(c21732.f68447);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        mo12739(c10610.f29370);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        mo12739(c13685.f38598);
        m35992(c13685.f38596);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        mo12739(c6979.f18158);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        mo12739(c23882.f75829);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        mo12739(c12622.f35421);
        m35992(c12622.f35425);
        mo12739(c12622.f35424);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        mo12739(c3765.f7998);
    }

    public C17781(C6383 c6383, AbstractC7257 abstractC7257, C4036 c4036) {
        this.f53090 = c6383;
        this.f53088 = abstractC7257;
        c6383.f16521.getClass();
        this.f53087 = C11216.m25928(c4036);
    }
}
