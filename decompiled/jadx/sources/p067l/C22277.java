package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩷ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C22277 extends AbstractC15079 {

    /* JADX INFO: renamed from: ᩸ */
    public HashSet f70393 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8374 f70394;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        AbstractC6462 abstractC6463 = (AbstractC6462) obj;
        if (abstractC6463.m14777(EnumC11353.WILDCARD)) {
            return (Boolean) m23807(abstractC6462, abstractC6463);
        }
        return Boolean.valueOf(m50092(abstractC6462, abstractC6463) || m50092(abstractC6463, abstractC6462));
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4511(C21215 c21215, Object obj) {
        boolean zM19485;
        AbstractC6462 abstractC6462 = (AbstractC6462) obj;
        if (c21215.mo14808()) {
            return Boolean.FALSE;
        }
        if (!abstractC6462.m14777(EnumC11353.WILDCARD)) {
            if (c21215.mo14786()) {
                return Boolean.valueOf(m50092(abstractC6462, c21215.f66703));
            }
            return Boolean.valueOf(m50092(c21215.f66703, abstractC6462));
        }
        if (abstractC6462.mo14808()) {
            return Boolean.FALSE;
        }
        boolean zMo14786 = c21215.mo14786();
        C8374 c8374 = this.f70394;
        if (zMo14786) {
            if (abstractC6462.mo14786()) {
                AbstractC6462 abstractC6463 = c21215.f66703;
                AbstractC6462 abstractC6462M19451 = c8374.m19451(abstractC6462);
                C10386 c10386 = new C10386(abstractC6463, abstractC6462M19451, c8374);
                HashSet hashSet = this.f70393;
                if (hashSet.add(c10386)) {
                    try {
                        zM19485 = c8374.m19485(abstractC6463, abstractC6462M19451, c8374.f22469);
                    } finally {
                        hashSet.remove(c10386);
                    }
                } else {
                    zM19485 = true;
                }
                return Boolean.valueOf(!zM19485);
            }
            if (abstractC6462.mo14788()) {
                return Boolean.valueOf(m50092(c8374.m19453(abstractC6462), c21215.f66703));
            }
        } else if (c21215.mo14788() && abstractC6462.mo14786()) {
            return Boolean.valueOf(m50092(c21215.f66703, c8374.m19451(abstractC6462)));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m50092(AbstractC6462 abstractC6462, AbstractC6462 abstractC6463) {
        C8374 c8374 = this.f70394;
        C10386 c10386 = new C10386(abstractC6462, abstractC6463, c8374);
        HashSet hashSet = this.f70393;
        if (!hashSet.add(c10386)) {
            return false;
        }
        try {
            return c8374.m19506(abstractC6462, abstractC6463);
        } finally {
            hashSet.remove(c10386);
        }
    }

    public C22277(C8374 c8374) {
        this.f70394 = c8374;
    }
}
