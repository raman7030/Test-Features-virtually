package p067l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18432 extends AbstractC6363 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C8374 f55129;

    /* JADX INFO: renamed from: ᩹ */
    public C19043 f55132;

    /* JADX INFO: renamed from: ᩸ */
    public HashMap f55131 = new HashMap();

    /* JADX INFO: renamed from: ᩶ */
    public HashSet f55130 = new HashSet();

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        if (this.f55132 == null) {
            this.f55132 = new C19043(this.f55129.f22480.f69157);
        }
        return this.f55132;
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        return (C19043) c10485.mo14803().mo5291(this, (Object) null);
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        C8374 c8374 = this.f55129;
        HashMap map = this.f55131;
        AbstractC21195 abstractC21195 = c21333.f16705;
        HashSet hashSet = this.f55130;
        if (!hashSet.add(abstractC21195)) {
            return new C19043(c21333.f16705);
        }
        try {
            hashSet.add(c21333.f16705);
            C15828 c15828 = (C15828) c21333.f16705;
            C19043 c19043 = (C19043) map.get(c15828);
            if (c19043 == null) {
                c19043 = new C19043(c15828);
                Iterator it = c8374.m19450(c21333).iterator();
                while (it.hasNext()) {
                    c19043.m43271((AbstractC9655) ((AbstractC6462) it.next()).mo5291(this, (Object) null));
                }
                c19043.m43271((AbstractC9655) c8374.m19502(c21333).mo5291(this, (Object) null));
                c15828.mo18020();
                c19043.m43271(c15828.f45850);
                map.put(c15828, c19043);
            }
            return c19043;
        } finally {
            hashSet.remove(c21333.f16705);
        }
    }

    public C18432(C8374 c8374) {
        this.f55129 = c8374;
    }
}
