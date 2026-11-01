package p067l;

/* JADX INFO: renamed from: l.᩶۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21411 extends AbstractC14409 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C8374 f67571;

    @Override // p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4507(Object obj, AbstractC6462 abstractC6462) {
        return C4848.m10283();
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4509(C10485 c10485, Object obj) {
        if (c10485.mo14803().mo7388()) {
            return this.f67571.m19450(c10485.mo14803());
        }
        if (c10485.mo14803().mo14789()) {
            return C4848.m10276of((Object) c10485.mo14803());
        }
        return C4848.m10283();
    }

    @Override // p067l.AbstractC10206, p067l.InterfaceC22556
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4512(C21333 c21333, Object obj) {
        if (c21333.f67261 == null) {
            C4848 c4848M35938 = ((C15828) c21333.f16705).m35938();
            if (c21333.f67261 == null) {
                C1446.m31701(c21333, c21333 != c21333.f16705.f20406);
                C4848 c4848Mo14798 = c21333.mo14798();
                C4848 c4848Mo14799 = c21333.f16705.f20406.mo14798();
                boolean zMo11307 = c21333.mo11307();
                C8374 c8374 = this.f67571;
                if (zMo11307) {
                    c21333.f67261 = c8374.m19479(c4848M35938);
                } else if (c4848Mo14799.m10293()) {
                    c21333.f67261 = c8374.m19421(c4848M35938, c4848Mo14799, c4848Mo14798);
                } else {
                    c21333.f67261 = c4848M35938;
                }
            }
        }
        return c21333.f67261;
    }

    public C21411(C8374 c8374) {
        this.f67571 = c8374;
    }
}
