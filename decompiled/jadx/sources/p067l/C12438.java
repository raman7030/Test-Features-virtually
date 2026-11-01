package p067l;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ᩺֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 8459 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12438 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21195 f34771;

    /* JADX INFO: renamed from: ۧ */
    public final C13818 f34772;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C24507 f34775;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC7257 f34776;

    /* JADX INFO: renamed from: ܽ */
    public int f34774 = 1;

    /* JADX INFO: renamed from: ܳ */
    public final LinkedHashMap f34773 = new LinkedHashMap();

    public C12438(C24507 c24507, AbstractC7257 abstractC7257, AbstractC21195 abstractC21195) {
        this.f34775 = c24507;
        this.f34776 = null;
        this.f34771 = abstractC21195;
        this.f34776 = abstractC7257;
        AbstractC12224 abstractC12224M32717 = c24507.f77543.f21738.m32717(c24507.f77578.m29249() + "SwitchMap" + c24507.f77578.m29249() + c24507.f77543.m18989(C19839.m45084(abstractC21195.f20406.f16705.mo18002())).toString().replace('/', '.').replace('.', c24507.f77578.m29249()));
        C15828 c15828M54044 = C24507.m54044(c24507);
        C13818 c13818 = new C13818(4120L, abstractC12224M32717, new C7251(c24507.f77566.f69134, c24507.f77566.f69187), c15828M54044);
        this.f34772 = c13818;
        c15828M54044.mo18020();
        c15828M54044.f45850.mo28415(c13818);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28644() {
        C24507 c24507 = this.f34775;
        C18537 c18537 = c24507.f77556;
        AbstractC7257 abstractC7257 = this.f34776;
        abstractC7257.getClass();
        c18537.f55352 = C9268.m21421(abstractC7257);
        C13818 c13818 = this.f34772;
        C7650 c7650M54050 = c24507.m54050((C15828) c13818.f20407);
        AbstractC12224 abstractC12224 = c24507.f77543.f21758;
        AbstractC21195 abstractC21195 = this.f34771;
        C19859 c19859M42201 = c24507.f77556.m42201(c24507.f77556.m42208(c24507.f77566.f69134), C4848.m10276of((Object) c24507.f77556.m42154(c24507.f77556.m42171(c24507.f77556.m42197(c24507.m54013(abstractC7257, abstractC12224, abstractC21195.f20406, C4848.m10283()))), c24507.f77566.f69214)), null);
        c19859M42201.f18925 = new C7251(c24507.f77566.f69134, c24507.f77566.f69187);
        C20271 c20271 = new C20271();
        C5771 c5771M54013 = c24507.m54013(abstractC7257, c24507.f77543.f21726, abstractC21195.f20406, C4848.m10283());
        C4848 c4848M10290 = C4848.m10283().m10290(c24507.f77556.m42140(c24507.f77556.m42166(new C13818(8589934592L, c24507.f77543.f21764, c24507.f77566.f69131, c24507.f77566.f69157), (AbstractC14355) null), c24507.f77556.m42145(0L, C4848.m10283())));
        for (Map.Entry entry : this.f34773.entrySet()) {
            C22403 c22403M42184 = c24507.f77556.m42184((AbstractC14355) c24507.f77556.m42170(c13818, c24507.f77556.m42171((AbstractC14355) c24507.f77556.m42154(c24507.f77556.m42197((C13818) entry.getKey()), c5771M54013))), (AbstractC14355) c24507.f77556.m42186((Integer) entry.getValue()));
            c22403M42184.f18925 = c24507.f77566.f69134;
            C12344 c12344M42196 = c24507.f77556.m42196(c22403M42184);
            C18537 c18538 = c24507.f77556;
            C4968 c4968M42145 = c24507.f77556.m42145(0L, C4848.m10276of((Object) c12344M42196));
            c18538.getClass();
            c20271.m45777(c18538.m42168(C4848.m10283(), c4968M42145, c4848M10290, (C4968) null));
        }
        c7650M54050.f20020 = c7650M54050.f20020.m10290(c24507.f77556.m42145(8L, c20271.m45783())).m10290(c24507.f77556.m42166(c13818, c19859M42201));
    }
}
