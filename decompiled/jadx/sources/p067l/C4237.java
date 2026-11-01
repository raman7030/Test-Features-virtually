package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4237 extends AbstractC3586 {

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C12955 f9371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4237(C12955 c12955) {
        super(c12955, EnumC13844.RECORD_PHASE, new C13645(c12955));
        this.f9371 = c12955;
    }

    @Override // p067l.AbstractC15655
    /* JADX INFO: renamed from: ֫ */
    public final void mo8617(C4036 c4036) {
        C12955 c12955;
        C4848 c4848M48354;
        C7650 c7650 = c4036.f8855;
        C15828 c15828 = c7650.f20027;
        if ((c15828.f20409 & 2305843009213693952L) != 0) {
            Iterator it = C9268.m21402(c7650).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c12955 = this.f9371;
                if (!zHasNext) {
                    break;
                }
                C11281 c11281 = (C11281) it.next();
                C22536 c22536M35934 = c15828.m35934(c11281);
                if (c22536M35934 != null && c22536M35934.m50507().m10289() != c11281.f31435.f9953.m10289()) {
                    C18537 c18537 = c12955.f36425;
                    c18537.f55352 = c11281.f18924;
                    c11281.f31435.f9953 = new C21339(c18537).m48354((Object) null, c22536M35934.m50507());
                }
                c12955.f36432.m41432((AbstractC7257) c11281, c4036);
                if (!c11281.f31435.f9953.isEmpty()) {
                    C18537 c18538 = c12955.f36425;
                    c18538.f55352 = c11281.f18924;
                    c4848M48354 = new C21339(c18538).m48354((Object) null, c11281.f31435.f9953);
                } else {
                    c4848M48354 = C4848.m10283();
                }
                c15828.m35936(c22536M35934, c11281, c4848M48354);
            }
            m6590(c15828, c4036);
            for (AbstractC7257 abstractC7257 : c7650.f20020) {
                if (C9268.m21429(abstractC7257)) {
                    c12955.f36432.m41432(abstractC7257, c4036);
                }
            }
        }
    }
}
