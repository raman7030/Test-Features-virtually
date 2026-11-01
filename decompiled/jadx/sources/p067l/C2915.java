package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2915 extends AbstractC2562 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f5040;

    /* JADX INFO: renamed from: ۧ */
    public C2417 f5041;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractC7610 f5042;

    /* JADX INFO: renamed from: ܽ */
    public AbstractC6462 f5043;

    /* JADX INFO: renamed from: ܿ */
    public C4848 f5044 = C4848.m10283();

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC6462 f5045;

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3792(AbstractC7257 abstractC7257) {
        this.f5045 = this.f5042.f19914.f36440.f69139;
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        if (!c9661.f18925.m14777(EnumC11353.ERROR)) {
            this.f5045 = c9661.f18925;
        } else {
            this.f5045 = m4721(c9661.f26610, this.f5041.f3694).f20406;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        if (!c8320.f18925.m14777(EnumC11353.ERROR)) {
            this.f5045 = c8320.f18925;
            return;
        }
        boolean z = this.f5040;
        try {
            this.f5040 = false;
            c8320.f22261.mo3382(this);
            AbstractC6462 abstractC6462 = this.f5045;
            this.f5040 = z;
            this.f5045 = m4721(c8320.f22259, abstractC6462.f16705).f20406;
        } catch (Throwable th) {
            this.f5040 = z;
            throw th;
        }
    }

    @Override // p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3824(C17985 c17985) {
        if (!c17985.f18925.m14777(EnumC11353.ERROR)) {
            this.f5045 = c17985.f18925;
            return;
        }
        c17985.f53722.mo3382(this);
        C21333 c21333 = (C21333) this.f5045;
        if (this.f5044.contains(c21333.f16705)) {
            C15828 c15828 = (C15828) c21333.f16705;
            int iM10289 = c17985.f53721.m10289();
            C12955 c12955 = this.f5042.f19914;
            C21333 c21334 = (C21333) c15828.f20406;
            C1446.m31704(c21334.f67257.isEmpty());
            if (iM10289 == 1) {
                AbstractC14235 abstractC14235 = c12955.f36438.f21738;
                abstractC14235.getClass();
                char[] charArray = "T".toCharArray();
                c21334.f67257 = c21334.f67257.m10290(new C10485(c15828, c12955.f36440.f69204, abstractC14235.mo17848(charArray, charArray.length)));
            } else {
                while (iM10289 > 0) {
                    c21334.f67257 = c21334.f67257.m10290(new C10485(c15828, c12955.f36440.f69204, c12955.f36438.f21738.m32717(C20778.m46922(iM10289, "T"))));
                    iM10289--;
                }
            }
        }
        C4848 c4848 = c17985.f53721;
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            ((AbstractC7257) it.next()).mo3382(this);
            c20271.m45777(this.f5045);
        }
        this.f5045 = new C20351(c21333.f16705, c17985.f18925, c20271.m45783());
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15828 m4721(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        C15828 c15828 = new C15828(this.f5040 ? 512 : 0, abstractC12224, abstractC7783);
        c15828.f45850 = new C25078(c15828);
        c15828.f20406 = new C21022(this.f5043, c15828);
        this.f5044 = this.f5044.m10290(c15828);
        return c15828;
    }

    public C2915(AbstractC7610 abstractC7610, C2417 c2417, AbstractC6462 abstractC6462, boolean z) {
        this.f5042 = abstractC7610;
        this.f5041 = c2417;
        this.f5043 = abstractC6462;
        this.f5040 = z;
    }
}
