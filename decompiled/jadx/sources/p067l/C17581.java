package p067l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C17581 extends AbstractC6363 {

    /* JADX INFO: renamed from: ۗ */
    public C20271 f52544;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C8374 f52545;

    /* JADX INFO: renamed from: ᩹ */
    public C20271 f52548;

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f52547 = new HashSet();

    /* JADX INFO: renamed from: ᩶ */
    public HashMap f52546 = new HashMap();

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4508(C7251 c7251, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (!abstractC6462.m14777(EnumC11353.ARRAY)) {
            return null;
        }
        C8374 c8374 = this.f52545;
        m40004(c8374.m19455(c7251), c8374.m19455(abstractC6462));
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        AbstractC21195 abstractC21195 = c10485.f16705;
        HashMap map = this.f52546;
        AbstractC6462 abstractC6463 = (AbstractC6462) map.get(abstractC21195);
        if (abstractC6463 != null) {
            boolean zMo14788 = abstractC6463.mo14788();
            C8374 c8374 = this.f52545;
            if (zMo14788 && abstractC6462.mo14788()) {
                if (!c8374.m19486(c8374.m19453(abstractC6463), c8374.m19453(abstractC6462), true)) {
                    abstractC6462 = abstractC6463;
                }
            } else {
                if (abstractC6463.mo14786() && abstractC6462.mo14786()) {
                    if (c8374.m19486(c8374.m19451(abstractC6463), c8374.m19451(abstractC6462), true)) {
                    }
                } else if (!c8374.m19490(abstractC6463, abstractC6462)) {
                    throw new C10877();
                }
                abstractC6462 = abstractC6463;
            }
        } else {
            this.f52548.m45777(c10485);
            this.f52544.m45777(abstractC6462);
        }
        map.put(c10485.f16705, abstractC6462);
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        boolean zMo14786 = c21215.mo14786();
        C8374 c8374 = this.f52545;
        if (zMo14786) {
            m40004(c8374.m19451(c21215), c8374.m19451(abstractC6462));
            return null;
        }
        if (!c21215.mo14788()) {
            return null;
        }
        m40004(c8374.m19453(c21215), c8374.m19453(abstractC6462));
        return null;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (!abstractC6462.m14777(EnumC11353.CLASS)) {
            return null;
        }
        C4848 c4848Mo14798 = c21333.mo14798();
        C4848 c4848Mo14799 = abstractC6462.mo14798();
        if (c4848Mo14798.m10289() != c4848Mo14799.m10289()) {
            return null;
        }
        while (c4848Mo14798.m10293()) {
            m40004((AbstractC6462) c4848Mo14798.f11034, (AbstractC6462) c4848Mo14799.f11034);
            c4848Mo14798 = c4848Mo14798.f11035;
            c4848Mo14799 = c4848Mo14799.f11035;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40004(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C10386 c10386 = new C10386(abstractC6462, abstractC6463, this.f52545);
        HashSet hashSet = this.f52547;
        if (hashSet.add(c10386)) {
            try {
                abstractC6462.mo5291(this, abstractC6463);
            } finally {
                hashSet.remove(c10386);
            }
        }
    }

    public C17581(C8374 c8374, C20271 c20271, C20271 c20272) {
        this.f52545 = c8374;
        this.f52548 = c20271;
        this.f52544 = c20272;
    }
}
