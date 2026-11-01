package p067l;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: l.᩸ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D445 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22778 extends C15854 {

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashSet f71795 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۧ */
    public boolean f71796;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C6684 f71797;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C4036 f71798;

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3617(C7650 c7650) {
        C6684 c6684 = this.f71797;
        boolean z = false;
        for (AbstractC6462 abstractC6462M19502 = c6684.f17311.m19502(c7650.f20027.f20406); !z && abstractC6462M19502.m14777(EnumC11353.CLASS); abstractC6462M19502 = c6684.f17311.m19502(abstractC6462M19502)) {
            C4036 c4036M35240 = c6684.f17257.m35240(abstractC6462M19502.f16705.mo3350());
            if (c4036M35240 != null && this.f71798 != c4036M35240) {
                if (this.f71795.add(c4036M35240)) {
                    boolean z2 = this.f71796;
                    try {
                        mo12739(c4036M35240.f8850);
                        this.f71796 = z2;
                    } catch (Throwable th) {
                        this.f71796 = z2;
                        throw th;
                    }
                }
                z = true;
            }
        }
        super.mo3617(c7650);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3619(C15834 c15834) {
        this.f71796 = true;
        super.mo3619(c15834);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3804(C11142 c11142) {
        this.f71796 = true;
        super.mo3804(c11142);
    }

    public C22778(C6684 c6684, C4036 c4036) {
        this.f71797 = c6684;
        this.f71798 = c4036;
    }
}
