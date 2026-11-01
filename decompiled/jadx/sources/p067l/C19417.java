package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳ۠᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public class C19417 extends AbstractC20033 {
    @Override // p067l.InterfaceC13820
    public C8688 parsePartialFrom(AbstractC9303 abstractC9303, C19283 c19283) throws C4293 {
        C18746 c18746NewBuilder = C8688.newBuilder();
        try {
            c18746NewBuilder.mergeFrom(abstractC9303, c19283);
            return c18746NewBuilder.buildPartial();
        } catch (C4293 e) {
            e.m8713(c18746NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C4293 c4293 = new C4293(e2.getMessage(), e2);
            c4293.m8713(c18746NewBuilder.buildPartial());
            throw c4293;
        } catch (C19204 e3) {
            C4293 c4293M43740 = e3.m43740();
            c4293M43740.m8713(c18746NewBuilder.buildPartial());
            throw c4293M43740;
        }
    }
}
